package t53;

/* loaded from: classes8.dex */
public final class i0 implements u53.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f415775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f415776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f415777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t53.j f415778e;

    public i0(java.lang.String str, kotlin.jvm.internal.c0 c0Var, ik1.b0 b0Var, android.content.Context context, t53.j jVar) {
        this.f415774a = str;
        this.f415775b = c0Var;
        this.f415776c = b0Var;
        this.f415777d = context;
        this.f415778e = jVar;
    }

    @Override // u53.w
    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "setBlackListAssociateWithWAGame addBlackList userName:%s isSuccess:%b, dealWaGameTogether:%b ", this.f415774a, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f415775b.f310112d));
        if (z17) {
            this.f415776c.f291824a = java.lang.Boolean.valueOf(!((java.lang.Boolean) r4.f291824a).booleanValue());
        } else {
            dp.a.makeText(this.f415777d, com.tencent.mm.R.string.fq_, 0).show();
        }
        t53.j jVar = this.f415778e;
        java.lang.Object value = this.f415776c.f291824a;
        kotlin.jvm.internal.o.f(value, "value");
        boolean booleanValue = ((java.lang.Boolean) value).booleanValue();
        com.tencent.mm.ui.oi oiVar = (com.tencent.mm.ui.oi) jVar;
        oiVar.getClass();
        oiVar.f209478a.runOnUiThread(new com.tencent.mm.ui.ni(oiVar, booleanValue));
    }
}
