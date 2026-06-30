package pc0;

@j95.b
/* loaded from: classes4.dex */
public final class s2 extends i95.w implements qc0.k1 {

    /* renamed from: d, reason: collision with root package name */
    public lt3.h f353305d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f353306e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final pc0.r2 f353307f = new pc0.r2();

    public final lt3.h Ai() {
        if (!gm0.j1.a()) {
            throw new java.lang.IllegalStateException("getVideoEditorDataStorage() was called when account is not ready.");
        }
        if (this.f353305d == null) {
            l75.k0 k0Var = gm0.j1.u().f273153f;
            kotlin.jvm.internal.o.f(k0Var, "getDataDB(...)");
            this.f353305d = new lt3.h(k0Var);
        }
        lt3.h hVar = this.f353305d;
        kotlin.jvm.internal.o.d(hVar);
        return hVar;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        l75.k0 k0Var = gm0.j1.u().f273153f;
        kotlin.jvm.internal.o.f(k0Var, "getDataDB(...)");
        this.f353305d = new lt3.h(k0Var);
        this.f353307f.alive();
        lt3.v.f321277a.b();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f353307f.dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public void wi(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider, boolean z17) {
        kotlin.jvm.internal.o.g(provider, "provider");
        dw3.c0.f244182a.c(provider);
        if (z17) {
            java.lang.String str = provider.C;
            boolean z18 = true;
            if (!(str == null || str.length() == 0)) {
                java.lang.String thumbPath = provider.C;
                kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
                if (!r26.i0.n(thumbPath, com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, false)) {
                    provider.C += com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
                }
            }
            java.lang.String str2 = provider.B;
            if (str2 != null && str2.length() != 0) {
                z18 = false;
            }
            if (z18) {
                return;
            }
            java.lang.String outputVideoPath = provider.B;
            kotlin.jvm.internal.o.f(outputVideoPath, "outputVideoPath");
            if (r26.i0.n(outputVideoPath, ".mp4", false)) {
                return;
            }
            provider.B += ".mp4";
        }
    }
}
