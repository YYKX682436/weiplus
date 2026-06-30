package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class u0 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.e f176995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f176996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f176997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f176998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.t0 f176999e;

    public u0(com.tencent.mm.plugin.voip.ui.t0 t0Var, com.tencent.mm.plugin.voip.ui.e eVar, android.content.Intent intent, boolean z17, boolean z18) {
        this.f176999e = t0Var;
        this.f176995a = eVar;
        this.f176996b = intent;
        this.f176997c = z17;
        this.f176998d = z18;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        com.tencent.mm.plugin.voip.ui.e eVar = this.f176995a;
        eVar.d();
        if (eVar.a()) {
            this.f176999e.b(this.f176996b, this.f176997c, this.f176998d);
        }
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        this.f176995a.b();
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        this.f176995a.b();
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
    }
}
