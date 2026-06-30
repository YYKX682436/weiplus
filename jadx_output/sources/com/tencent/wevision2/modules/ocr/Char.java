package com.tencent.wevision2.modules.ocr;

/* loaded from: classes4.dex */
public class Char {
    public android.graphics.PointF[] box;
    public java.lang.String content;

    public Char(java.lang.String str, android.graphics.PointF[] pointFArr) {
        this.content = str;
        this.box = pointFArr;
    }
}
