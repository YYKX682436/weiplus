package dk2;

/* loaded from: classes3.dex */
public final class ze implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234437a;

    public ze(android.content.Context context) {
        this.f234437a = context;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", c1Var != null && c1Var.P1);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 3);
        bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
        efVar.m0(bundle, this.f234437a);
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            efVar.p0(eVar, efVar.e() != null, qo0.b.B, bundle, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0));
        }
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        android.os.Bundle bundle = new android.os.Bundle();
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            efVar.p0(eVar, efVar.e() != null, qo0.b.G, bundle, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0));
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            efVar.p0(eVar, efVar.e() != null, qo0.b.E, bundle, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0));
        }
    }
}
