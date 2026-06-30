package sm2;

/* loaded from: classes3.dex */
public final class x2 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409780a;

    public x2(sm2.o4 o4Var) {
        this.f409780a = o4Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        sm2.o4 o4Var = this.f409780a;
        if (((mm2.c1) o4Var.f19609a.a(mm2.c1.class)).T7()) {
            sm2.o4.k(o4Var);
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            in0.q qVar = w0Var instanceof in0.q ? (in0.q) w0Var : null;
            if (qVar != null) {
                qVar.c1(ko0.c0.f309825a.b().f319996e);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
        fm2.a aVar = o4Var.f19595c;
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", aVar != null && aVar.isSwipeBack() ? 1 : 3);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        fm2.a aVar2 = o4Var.f19595c;
        if (aVar2 != null) {
            aVar2.statusChange(qo0.b.B, bundle);
        }
        fm2.a aVar3 = o4Var.f19595c;
        if (aVar3 != null) {
            aVar3.setMiniWinPermission(false);
        }
        o4Var.L();
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        sm2.o4 o4Var = this.f409780a;
        fm2.a aVar = o4Var.f19595c;
        if (aVar != null) {
            aVar.setMiniWinPermission(false);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fm2.a aVar2 = o4Var.f19595c;
        if (aVar2 != null) {
            aVar2.statusChange(qo0.b.G, bundle);
        }
        sm2.o4.k(o4Var);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        sm2.o4 o4Var = this.f409780a;
        fm2.a aVar = o4Var.f19595c;
        if (aVar != null) {
            aVar.setMiniWinPermission(false);
        }
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fm2.a aVar2 = o4Var.f19595c;
        if (aVar2 != null) {
            aVar2.statusChange(qo0.b.E, bundle);
        }
        sm2.o4.k(o4Var);
    }
}
