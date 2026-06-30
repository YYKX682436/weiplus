package gf0;

@j95.b
/* loaded from: classes15.dex */
public final class r extends i95.w implements qk.f8 {

    /* renamed from: d, reason: collision with root package name */
    public gf0.i f271231d;

    /* renamed from: e, reason: collision with root package name */
    public gf0.u f271232e = gf0.u.f271244d;

    /* renamed from: f, reason: collision with root package name */
    public double f271233f;

    /* renamed from: g, reason: collision with root package name */
    public double f271234g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingRecordFormat f271235h;

    /* renamed from: i, reason: collision with root package name */
    public qk.e8 f271236i;

    /* renamed from: m, reason: collision with root package name */
    public qk.b8 f271237m;

    /* renamed from: n, reason: collision with root package name */
    public qk.c8 f271238n;

    /* renamed from: o, reason: collision with root package name */
    public qk.d8 f271239o;

    public void Ai(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a(activity, "android.permission.RECORD_AUDIO", 80, "", "")) {
            pm0.v.X(new gf0.k(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TingAudioRecorderService", "no permission");
        if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) activity).registerMMOnRequestPermissionsResult(new gf0.q(activity));
        }
        wi("no_sys_permission", 1);
        qk.e8 e8Var = this.f271236i;
        if (e8Var != null) {
            e8Var.a(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x014f, code lost:
    
        if ("ok".equals(r2.f81320b) == true) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf0.r.Bi():void");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        this.f271232e = gf0.u.f271244d;
        gf0.s.f271240a = 0;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        this.f271232e = gf0.u.f271244d;
        gf0.s.f271240a = 0;
    }

    public final void wi(java.lang.String subKey, int i17) {
        kotlin.jvm.internal.o.g(subKey, "subKey");
        urgen.ur_0025.UR_AA48.UR_70DC(7, "VoiceRecord", 6, "", subKey, i17);
    }
}
