package if5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final if5.a f291264a = new if5.a();

    public final v11.e0 a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int d17 = i65.a.d(context, com.tencent.mm.R.color.abw);
        float q17 = i65.a.q(context);
        float f17 = q17 * 17.0f;
        float f18 = q17 * 15.0f;
        v11.i0 i0Var = new v11.i0(f17, f17, f17, f17, f17, f17, f17, f18, f18, f18);
        v11.j0 j0Var = new v11.j0(f17, d17, false, false, 1.1f, 0, 0, false, null, uc1.o.CTRL_INDEX, null);
        v11.h0 h0Var = new v11.h0(new v11.j0(f17, d17, false, false, 1.1f, 0, 0, true, 0, 108, null), "", "", i65.a.b(context, 4), i65.a.b(context, 8));
        v11.v vVar = new v11.v(0.8f);
        v11.z zVar = new v11.z(new v11.a0(f17, i65.a.b(context, 4), null, 4, null), new v11.a0(f17, i65.a.b(context, 4), null, 4, null), new v11.a0(f17, i65.a.b(context, 4), null, 4, null), new v11.a0(f17, i65.a.b(context, 4), null, 4, null), new v11.a0(f17, i65.a.b(context, 4), null, 4, null), new v11.a0(f17, i65.a.b(context, 4), null, 4, null), true, 0.0f);
        v11.c0 c0Var = new v11.c0(i65.a.d(context, com.tencent.mm.R.color.abw), i65.a.b(context, 4), i65.a.b(context, 20));
        v11.b0 b17 = b(context, i0Var);
        float q18 = i65.a.q(context) * 15.0f;
        v11.w wVar = new v11.w(new v11.j0(q18, d17, false, true, 1.1f, 0, 0, false, null, nd1.u0.CTRL_INDEX, null), new v11.x(-4958209, -14254183, -16748351, -3653568, -16153000, -16744448, d17, -8823258, -8388608, -40634, -8823258, -14442241, -16748351), q18, i65.a.d(context, com.tencent.mm.R.color.adg), 0.6f, i65.a.b(context, 20), d17, i65.a.b(context, 16), i65.a.b(context, 8), i65.a.b(context, 8), i65.a.b(context, 8), i65.a.d(context, com.tencent.mm.R.color.f478539ah5), i65.a.a(context, 0.5f), i65.a.b(context, 4));
        v11.d0 d0Var = new v11.d0(new v11.j0(f18, d17, false, true, 1.1f, 0, 0, false, null, 484, null));
        v11.u uVar = new v11.u(i65.a.b(context, 2), i65.a.d(context, com.tencent.mm.R.color.f478538kj), i65.a.b(context, 19), 3);
        int d18 = i65.a.d(context, com.tencent.mm.R.color.f478539ah5);
        int d19 = i65.a.d(context, com.tencent.mm.R.color.adg);
        return new v11.e0(i0Var, j0Var, h0Var, vVar, zVar, c0Var, b17, wVar, d0Var, uVar, new v11.g0(new v11.j0(f17, d17, false, false, 1.1f, 0, 0, true, null, 364, null), new v11.j0(f18, d19, true, false, 1.1f, 0, 0, false, null, com.tencent.mm.plugin.appbrand.jsapi.sensor.z.CTRL_INDEX, null), 0, 0, 0, i65.a.b(context, 24), 0, i65.a.b(context, 12), i65.a.b(context, 8), i65.a.b(context, 8), 0, com.tencent.mm.ui.bk.o(0.5f), java.lang.Math.max(1, i65.a.a(context, 0.5f)), d18, false, v11.b0.a(b(context, i0Var), 0, 0, false, false, false, false, i65.a.b(context, (int) (i65.a.q(context) * 13.0f)), 0, 0, 0, 0, 0, false, 8127, null)), new v11.y(java.lang.Math.max(1, i65.a.a(context, 0.5f)), i65.a.d(context, com.tencent.mm.R.color.f478539ah5), i65.a.b(context, 4)), new v11.f0(i65.a.b(context, 8)));
    }

    public final v11.b0 b(android.content.Context context, v11.i0 i0Var) {
        return new v11.b0(i65.a.d(context, com.tencent.mm.R.color.Link_100), i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_1), true, false, true, true, i65.a.b(context, (int) i0Var.f432412i), i65.a.d(context, com.tencent.mm.R.color.abz), i65.a.b(context, 4), i65.a.b(context, 4), i65.a.b(context, 4), i65.a.b(context, 1), true);
    }
}
