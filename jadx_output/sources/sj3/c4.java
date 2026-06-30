package sj3;

/* loaded from: classes14.dex */
public final class c4 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.e f408450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f408451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f408452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f408453d;

    public c4(com.tencent.mm.plugin.voip.ui.e eVar, sj3.d4 d4Var, android.content.Intent intent, boolean z17) {
        this.f408450a = eVar;
        this.f408451b = d4Var;
        this.f408452c = intent;
        this.f408453d = z17;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        com.tencent.mm.plugin.voip.ui.e eVar = this.f408450a;
        eVar.d();
        if (eVar.a()) {
            this.f408451b.f(this.f408452c, this.f408453d);
        }
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        this.f408450a.b();
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        this.f408450a.b();
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
