package gm2;

/* loaded from: classes3.dex */
public final class r1 {
    public r1(kotlin.jvm.internal.i iVar) {
    }

    public final android.graphics.Bitmap a() {
        java.lang.Object value = ((jz5.n) gm2.t1.f273487i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.graphics.Bitmap) value;
    }

    public final int b(int i17) {
        int B = zl2.q4.f473933a.B(i17);
        boolean z17 = false;
        if (1 <= B && B < 10) {
            return com.tencent.mm.R.raw.live_user_level_1_9;
        }
        if (10 <= B && B < 20) {
            return com.tencent.mm.R.raw.live_user_level_10_19;
        }
        if (20 <= B && B < 30) {
            return com.tencent.mm.R.raw.live_user_level_20_29;
        }
        if (30 <= B && B < 40) {
            return com.tencent.mm.R.raw.live_user_level_30_39;
        }
        if (40 <= B && B < 50) {
            return com.tencent.mm.R.raw.live_user_level_40_49;
        }
        if (50 <= B && B < 60) {
            return com.tencent.mm.R.raw.live_user_level_50_59;
        }
        if (60 <= B && B < 70) {
            return com.tencent.mm.R.raw.live_user_level_60_69;
        }
        if (70 <= B && B < 80) {
            return com.tencent.mm.R.raw.live_user_level_70_79;
        }
        if (80 <= B && B < 90) {
            return com.tencent.mm.R.raw.live_user_level_80_89;
        }
        if (90 <= B && B < 100) {
            return com.tencent.mm.R.raw.live_user_level_90_99;
        }
        if (100 <= B && B <= Integer.MAX_VALUE) {
            z17 = true;
        }
        return z17 ? com.tencent.mm.R.raw.live_user_level_100_109 : com.tencent.mm.R.raw.live_user_level_1_9;
    }

    public final gm2.s1 c() {
        return (gm2.s1) ((jz5.n) gm2.t1.f273485g).getValue();
    }

    public final gm2.s1 d() {
        return (gm2.s1) ((jz5.n) gm2.t1.f273482d).getValue();
    }

    public final gm2.s1 e() {
        return (gm2.s1) ((jz5.n) gm2.t1.f273483e).getValue();
    }

    public final gm2.s1 f() {
        return (gm2.s1) ((jz5.n) gm2.t1.f273484f).getValue();
    }

    public final android.graphics.Bitmap g() {
        java.lang.Object value = ((jz5.n) gm2.t1.f273486h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.graphics.Bitmap) value;
    }
}
