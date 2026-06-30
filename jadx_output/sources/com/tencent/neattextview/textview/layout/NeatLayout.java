package com.tencent.neattextview.textview.layout;

/* loaded from: classes15.dex */
public class NeatLayout extends ks5.c {
    public int L;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("linebreak");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/neattextview/textview/layout/NeatLayout", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/neattextview/textview/layout/NeatLayout", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public NeatLayout(java.lang.CharSequence charSequence, float[] fArr) {
        super(charSequence, fArr);
        this.L = 0;
    }

    private native int nComputeBreak(java.lang.String str, float[] fArr, float[] fArr2, float f17, int[] iArr, float[] fArr3, float f18, boolean[] zArr, char[] cArr, float[] fArr4, char[] cArr2, float[] fArr5, boolean[] zArr2);

    @Override // ks5.a
    public int d() {
        return this.L;
    }

    @Override // ks5.c
    public void p(android.text.TextPaint textPaint, float[] fArr, float f17, float f18, float f19, int i17, android.text.TextUtils.TruncateAt truncateAt, boolean z17) {
        float f27;
        com.tencent.neattextview.textview.layout.NeatLayout neatLayout = this;
        float round = java.lang.Math.round(textPaint.getTextSize() / 2.0f);
        float textSize = z17 ? textPaint.getTextSize() / 12.0f : 0.0f;
        int length = neatLayout.f311806b.length();
        int[] iArr = new int[length];
        float[] fArr2 = new float[length];
        boolean[] zArr = new boolean[length];
        for (int i18 = 0; i18 < fArr.length; i18++) {
            fArr[i18] = fArr[i18] + round;
        }
        int i19 = i17;
        int nComputeBreak = nComputeBreak(neatLayout.f311806b, neatLayout.f311809e, fArr, f17 + round, iArr, fArr2, textSize, zArr, is5.a.f294483b, neatLayout.f311812h, is5.a.f294482a, neatLayout.f311811g, neatLayout.F);
        neatLayout.L = nComputeBreak;
        float f28 = 0.0f;
        int i27 = 0;
        while (i27 < nComputeBreak && i27 < i19) {
            float f29 = fArr2[i27];
            int i28 = i19;
            float f37 = i27 < fArr.length ? fArr[i27] : f17;
            if (f28 < f29) {
                f28 = java.lang.Math.min(f29, f37);
            }
            i27++;
            i19 = i28;
        }
        float[] fArr3 = fArr;
        int i29 = i19;
        int i37 = 0;
        int i38 = 0;
        while (i38 < nComputeBreak && i38 < i29) {
            int i39 = iArr[i38];
            boolean z18 = zArr[i38];
            int i47 = i39 - i37;
            float f38 = i38 < fArr3.length ? fArr3[i38] - round : f17;
            float f39 = f38 - fArr2[i38];
            if (f39 > 0.0f) {
                f39 -= 2.0f;
            }
            boolean z19 = f39 < 0.0f || java.lang.Math.abs(f39) - 1.0f <= round;
            if (z19) {
                int i48 = i39 - 1;
                char[] cArr = neatLayout.f311807c;
                if (i48 >= 0 && cArr[i48] == '\n') {
                    i47--;
                }
                for (int i49 = i37; i49 < i39; i49++) {
                    if (cArr[i49] != '\n' && neatLayout.f311809e[i49] == 0.0f) {
                        i47--;
                    }
                }
                f27 = f39 / (java.lang.Math.max(2, i47) - 1);
            } else {
                f27 = 0.0f;
            }
            float f47 = z19 ? f38 : fArr2[i38];
            char[] cArr2 = neatLayout.f311807c;
            float[] fArr4 = neatLayout.f311809e;
            java.util.ArrayList arrayList = neatLayout.f311814j;
            int size = arrayList.size();
            float f48 = z19 ? f38 : f28;
            float f49 = neatLayout.f311819o;
            if (neatLayout.f311810f != null) {
                for (int i57 = i37; i57 < i39; i57++) {
                    float f57 = neatLayout.f311810f[i57];
                    if (f57 > neatLayout.f311819o) {
                        f49 = f57;
                    }
                }
            }
            float f58 = f49;
            int i58 = i38;
            ks5.d dVar = new ks5.d(this, cArr2, i37, i39, 0.0f, neatLayout.D, fArr4, f47, f58, f27, neatLayout.f311808d, z18, textSize, size, neatLayout.f311823s, f48);
            this.D += f58;
            arrayList.add(dVar);
            i38 = i58 + 1;
            fArr3 = fArr;
            i29 = i17;
            neatLayout = this;
            nComputeBreak = nComputeBreak;
            i37 = i39;
        }
    }
}
