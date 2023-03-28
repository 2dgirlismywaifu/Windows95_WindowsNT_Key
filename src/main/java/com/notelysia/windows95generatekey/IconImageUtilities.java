/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.windows95generatekey;

import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

public class IconImageUtilities {
    public static void setIconImage(Window window)
    {
        try
        {
            InputStream imageInputStream = window.getClass().getResourceAsStream("/icons8-windows-95-64.png");
            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            window.setIconImage(bufferedImage);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
