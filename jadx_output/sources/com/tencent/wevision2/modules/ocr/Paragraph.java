package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class Paragraph {
    public android.graphics.PointF[] box;
    public com.tencent.wevision2.modules.ocr.Text[] lines;

    public Paragraph(com.tencent.wevision2.modules.ocr.Text[] textArr, android.graphics.PointF[] pointFArr) {
        this.lines = textArr;
        this.box = pointFArr;
    }
}
