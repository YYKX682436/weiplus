package op4;

/* loaded from: classes10.dex */
public final class e extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout f347270e;

    /* renamed from: f, reason: collision with root package name */
    public uo4.h f347271f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f347272g;

    public e(com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f347270e = pluginLayout;
        this.f347271f = new uo4.h();
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f347291d = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct();
        this.f347271f = new uo4.h();
    }

    @Override // op4.k
    public void d() {
        pm0.v.L("MultiVideoPluginLayout_report", true, new op4.d(this, 0L));
    }

    @Override // op4.k
    public java.lang.String g() {
        return "20741";
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (op4.c.f347267a[status.ordinal()] == 1) {
            pm0.v.L("MultiVideoPluginLayout_report", true, new op4.d(this, 1L));
        }
    }
}
