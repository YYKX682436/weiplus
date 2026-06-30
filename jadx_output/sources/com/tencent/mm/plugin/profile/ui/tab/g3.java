package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class g3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr3.b0 f154328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f154329f;

    public g3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var, vr3.b0 b0Var, int i17) {
        this.f154327d = s4Var;
        this.f154328e = b0Var;
        this.f154329f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.mm mmVar;
        java.util.LinkedList linkedList;
        vr3.b0 b0Var = this.f154328e;
        this.f154327d.v((b0Var == null || (mmVar = b0Var.f439623d) == null || (linkedList = mmVar.f380640i) == null) ? null : (r45.mm) linkedList.get(i17), this.f154329f, i17);
    }
}
