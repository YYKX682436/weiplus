package wl4;

/* loaded from: classes11.dex */
public final class b implements rl4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final wl4.b f447084a = new wl4.b();

    @Override // rl4.c
    public void a() {
        if (((rv.d3) i95.n0.c(rv.d3.class)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioFloatBallController", "onAudiHistoryEnterCurrentTask play: false");
            rv.k2 k2Var = (rv.k2) i95.n0.c(rv.k2.class);
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ep1.m.d(context, bundle, true);
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            il4.e eVar = new il4.e(null, 0, 1002, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, tm1.i.f420479a, 16777211, null);
            eVar.f292125v = null;
            if (k2Var != null) {
                rv.j2 Bi = ((mm1.f0) k2Var).Bi();
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                rv.j2.a(Bi, context2, bundle, bw5.x2.BizAudioEnterScene_Unknown, null, eVar, null, null, null, 232, null);
            }
        }
    }

    @Override // rl4.c
    public bw5.eq0 b() {
        return bw5.eq0.BizAudio;
    }

    @Override // rl4.c
    public int c() {
        return 65;
    }

    @Override // rl4.c
    public boolean d() {
        return false;
    }

    @Override // rl4.c
    public java.lang.String e() {
        return "BizAudioFloatBall";
    }

    @Override // rl4.c
    public jm4.q3 f() {
        return jm4.q3.f300407f;
    }

    @Override // rl4.c
    public void g() {
        if (((rv.d3) i95.n0.c(rv.d3.class)) != null) {
            rv.k2 k2Var = (rv.k2) i95.n0.c(rv.k2.class);
            bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
            il4.e eVar = new il4.e(null, 0, 1003, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
            eVar.f292125v = null;
            if (k2Var != null) {
                rv.j2 Bi = ((mm1.f0) k2Var).Bi();
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                rv.j2.a(Bi, context, null, bw5.x2.BizAudioEnterScene_Unknown, null, eVar, null, null, null, 232, null);
            }
        }
    }
}
