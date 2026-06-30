package gm2;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.o f273465a = new gm2.o(0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, false, null, 0, 0, 0, false, false, 524287, null);

    /* renamed from: b, reason: collision with root package name */
    public gm2.u1 f273466b;

    /* renamed from: c, reason: collision with root package name */
    public gm2.v1 f273467c;

    public final gm2.q a(android.view.View view) {
        gm2.o oVar = this.f273465a;
        float f17 = oVar.f273436a + oVar.f273438c + oVar.f273450o + oVar.f273440e;
        gm2.c1 c1Var = gm2.c1.f273320a;
        oVar.f273455t = (int) (f17 + c1Var.p(oVar.f273445j.toString(), oVar.f273447l) + oVar.f273439d + oVar.f273437b);
        gm2.u1 u1Var = this.f273466b;
        gm2.v1 v1Var = this.f273467c;
        if (u1Var == null || v1Var == null) {
            gm2.q qVar = new gm2.q(gm2.c1.c(c1Var, oVar.f273455t, 0, 2, null));
            qVar.f273462d = oVar;
            return qVar;
        }
        gm2.x1 x1Var = new gm2.x1(gm2.c1.c(c1Var, oVar.f273455t, 0, 2, null));
        x1Var.f273530o = view;
        x1Var.f273462d = oVar;
        x1Var.f273525g = u1Var;
        x1Var.f273526h = v1Var;
        return x1Var;
    }

    public final gm2.r b(int i17, java.lang.String textContent, gm2.z1 config) {
        kotlin.jvm.internal.o.g(textContent, "textContent");
        kotlin.jvm.internal.o.g(config, "config");
        int B = zl2.q4.f473933a.B(i17);
        int f17 = config.f(java.lang.Integer.valueOf(B));
        gm2.o oVar = this.f273465a;
        oVar.f273442g = f17;
        gm2.c1 c1Var = gm2.c1.f273320a;
        oVar.f273443h = c1Var.g();
        oVar.f273446k = config.a(java.lang.Integer.valueOf(B));
        oVar.f273447l = c1Var.e();
        oVar.f273448m = config.b(java.lang.Integer.valueOf(B)) == 1;
        oVar.f273454s = B < 80;
        this.f273466b = config.g(B);
        this.f273467c = config.h(B);
        oVar.f273444i = oVar.f273443h / 2;
        gm2.u1 u1Var = this.f273466b;
        if (u1Var != null) {
            u1Var.f273492a = r0 / 2;
        }
        int[] e17 = config.e(java.lang.Integer.valueOf(B));
        if (e17.length == 2) {
            oVar.f273450o = e17[0];
            oVar.f273451p = e17[1];
            zl2.r4.f473950a.M2("FinderLiveLevelImageSpan", "setLevel iconSize:" + e17[0] + '-' + e17[1]);
        }
        oVar.f273449n = gm2.q.f273460e.a(config.d(java.lang.Integer.valueOf(B)), (oVar.f273451p * 2.0f) / 30);
        oVar.getClass();
        oVar.f273445j = textContent;
        return this;
    }

    public final gm2.r c(java.lang.String str) {
        gm2.o oVar = this.f273465a;
        if (!(str == null || str.length() == 0)) {
            try {
                oVar.f273441f = android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                oVar.f273441f = 0;
                com.tencent.mars.xlog.Log.e("FinderLiveLevelImageSpan", e17 + ",serverColor:" + str);
            }
        }
        return this;
    }
}
