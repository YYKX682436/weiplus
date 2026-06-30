package tm2;

/* loaded from: classes3.dex */
public final class d2 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420500a;

    public d2(tm2.s2 s2Var) {
        this.f420500a = s2Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        tm2.s2 s2Var = this.f420500a;
        fm2.b bVar = s2Var.f19601c;
        boolean z17 = false;
        if (bVar != null) {
            bVar.setMiniWinPermission(false);
        }
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
        fm2.b bVar2 = s2Var.f19601c;
        if (bVar2 != null && bVar2.isSwipeBack()) {
            z17 = true;
        }
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", z17 ? 1 : 3);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        fm2.b bVar3 = s2Var.f19601c;
        if (bVar3 != null) {
            bVar3.statusChange(qo0.b.B, bundle);
        }
        s2Var.l();
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        tm2.s2 s2Var = this.f420500a;
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            bVar.setMiniWinPermission(false);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fm2.b bVar2 = s2Var.f19601c;
        if (bVar2 != null) {
            bVar2.statusChange(qo0.b.G, bundle);
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        tm2.s2 s2Var = this.f420500a;
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            bVar.setMiniWinPermission(false);
        }
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fm2.b bVar2 = s2Var.f19601c;
        if (bVar2 != null) {
            bVar2.statusChange(qo0.b.E, bundle);
        }
    }
}
