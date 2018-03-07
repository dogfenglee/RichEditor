package com.study.xuan.editor.widget.panel;

import com.study.xuan.editor.operate.font.FontParam;

/**
 * Author : xuan.
 * Date : 18-3-6.
 * Description : the file description
 */
public interface IPanel {
    void change();

    void reset();

    String getType();

    FontParam getFontParam();

    IPanel setBold(boolean isSelected);

    IPanel setItalics(boolean isSelected);

    IPanel setUnderLine(boolean isSelected);

    IPanel setCenterLine(boolean isSelected);

    IPanel setFontBac(int fontBac);

    IPanel setFontSize(int fontSize);

    IPanel setFontColor(int fontColor);

    IPanel setUrl(String name, String url);

    IPanel setRefer();

    IPanel setH1();

    IPanel setH2();

    IPanel setH3();

    IPanel setH4();
}