package com.tencent.wevision2.modules.ocr;

/* loaded from: classes4.dex */
public class Text {
    public android.graphics.PointF[] box;
    public com.tencent.wevision2.modules.ocr.Char[] chars;
    public java.lang.String content;
    float score;

    public Text(java.lang.String str, com.tencent.wevision2.modules.ocr.Char[] charArr, android.graphics.PointF[] pointFArr, float f17) {
        this.content = str;
        this.chars = charArr;
        this.box = pointFArr;
        this.score = f17;
    }
}
