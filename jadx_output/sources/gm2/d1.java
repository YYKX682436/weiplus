package gm2;

/* loaded from: classes3.dex */
public final class d1 extends gm2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gm2.c2 spanMode, gm2.e2 sizeMode) {
        super(spanMode, sizeMode);
        kotlin.jvm.internal.o.g(spanMode, "spanMode");
        kotlin.jvm.internal.o.g(sizeMode, "sizeMode");
    }

    @Override // gm2.e, gm2.z1
    public /* bridge */ /* synthetic */ int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.e, gm2.z1
    public /* bridge */ /* synthetic */ int d(java.lang.Object obj) {
        return k(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.e, gm2.z1
    public /* bridge */ /* synthetic */ int[] e(java.lang.Object obj) {
        return l(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.e, gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        return j(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.e
    public int i(int i17) {
        return 0;
    }

    @Override // gm2.e
    public int j(int i17) {
        if (this.f273355a == gm2.c2.f273350i && !com.tencent.mm.ui.bk.C()) {
            if (1 <= i17 && i17 < 7) {
                return com.tencent.mm.R.drawable.cou;
            }
            if (7 <= i17 && i17 < 13) {
                return com.tencent.mm.R.drawable.cow;
            }
            if (!(13 <= i17 && i17 < 18)) {
                if (!(18 <= i17 && i17 <= Integer.MAX_VALUE)) {
                    return 0;
                }
            }
            return com.tencent.mm.R.drawable.cos;
        }
        return m(i17);
    }

    @Override // gm2.e
    public int k(int i17) {
        if (1 <= i17 && i17 < 7) {
            return com.tencent.mm.R.drawable.cpt;
        }
        if (7 <= i17 && i17 < 13) {
            return com.tencent.mm.R.drawable.cpu;
        }
        if (!(13 <= i17 && i17 < 18)) {
            if (!(18 <= i17 && i17 <= Integer.MAX_VALUE)) {
                return 0;
            }
        }
        return com.tencent.mm.R.drawable.cpq;
    }

    @Override // gm2.e
    public int[] l(int i17) {
        int[] l17 = super.l(i17);
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getDrawable(k(i17));
        if (drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            l17[0] = (int) (l17[0] * (drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()));
        }
        return l17;
    }

    public final int m(int i17) {
        if (1 <= i17 && i17 < 7) {
            return com.tencent.mm.R.drawable.cot;
        }
        if (7 <= i17 && i17 < 13) {
            return com.tencent.mm.R.drawable.cov;
        }
        if (!(13 <= i17 && i17 < 18)) {
            if (!(18 <= i17 && i17 <= Integer.MAX_VALUE)) {
                return 0;
            }
        }
        return com.tencent.mm.R.drawable.cor;
    }
}
