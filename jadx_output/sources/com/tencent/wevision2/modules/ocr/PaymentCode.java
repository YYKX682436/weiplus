package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class PaymentCode {
    public static final int COLOR_GREEN = 0;
    public static final int COLOR_OTHER = 2;
    public static final int COLOR_YELLOW = 1;
    public static final int MEDIUM_PAPER = 0;
    public static final int MEDIUM_SCREEN = 1;
    public int color;
    public float colorScore;
    public int medium;
    public float mediumScore;

    public PaymentCode(int i17, float f17, int i18, float f18) {
        this.color = i17;
        this.colorScore = f17;
        this.medium = i18;
        this.mediumScore = f18;
    }
}
