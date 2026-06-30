package gm2;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.h1 f273358a = new gm2.h1(null, null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, null, null, 0, 262143, null);

    public final gm2.i1 a() {
        gm2.h1 h1Var = this.f273358a;
        float f17 = h1Var.f273379j;
        gm2.c1 c1Var = gm2.c1.f273320a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) h1Var.f273370a);
        sb6.append((java.lang.Object) h1Var.f273371b);
        h1Var.f273388s = (int) (f17 + c1Var.p(sb6.toString(), h1Var.f273373d) + h1Var.f273381l + h1Var.f273380k);
        h1Var.f273389t = h1Var.f273375f + h1Var.f273388s + h1Var.f273378i;
        gm2.i1 i1Var = new gm2.i1(gm2.c1.c(c1Var, h1Var.f273389t, 0, 2, null));
        kotlin.jvm.internal.o.g(h1Var, "<set-?>");
        i1Var.f273413e = h1Var;
        return i1Var;
    }

    public final gm2.e1 b(int i17, gm2.z1 config) {
        kotlin.jvm.internal.o.g(config, "config");
        int c17 = config.c(java.lang.Integer.valueOf(i17));
        gm2.h1 h1Var = this.f273358a;
        h1Var.f273382m = c17;
        h1Var.f273383n = gm2.c1.f273320a.g();
        h1Var.f273372c = config.a(java.lang.Integer.valueOf(i17));
        h1Var.f273374e = config.b(java.lang.Integer.valueOf(i17)) == 1;
        return this;
    }

    public final gm2.e1 c(int i17) {
        gm2.h1 h1Var = this.f273358a;
        h1Var.f273380k = i17;
        h1Var.f273379j = i17;
        return this;
    }

    public final gm2.e1 d(java.lang.String str, boolean z17) {
        boolean z18 = str == null || str.length() == 0;
        gm2.h1 h1Var = this.f273358a;
        if (!z18) {
            try {
                h1Var.f273382m = android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FinderLiveLevelImageSpan", e17 + ",serverColor:" + str);
            }
        } else if (z17) {
            h1Var.f273382m = 0;
        }
        return this;
    }

    public final gm2.e1 e(java.lang.CharSequence content) {
        kotlin.jvm.internal.o.g(content, "content");
        gm2.h1 h1Var = this.f273358a;
        h1Var.getClass();
        h1Var.f273370a = content;
        return this;
    }

    public final gm2.e1 f(int i17) {
        this.f273358a.f273373d = gm2.c1.f273320a.e();
        return this;
    }
}
