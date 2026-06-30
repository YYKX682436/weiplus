package com.tencent.mm.ui.indicator;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f208966a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f208967b;

    public a(int i17, int i18, int i19) {
        this.f208966a = new int[]{android.graphics.Color.alpha(i17), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)};
        this.f208967b = new int[]{android.graphics.Color.alpha(i18), android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)};
    }

    public int a(int i17) {
        int[] iArr = new int[4];
        int i18 = 0;
        while (true) {
            if (i18 >= this.f208967b.length) {
                return android.graphics.Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            iArr[i18] = (int) (this.f208966a[i18] + ((((r3[i18] - r4) * 1.0d) / 100) * i17));
            i18++;
        }
    }
}
