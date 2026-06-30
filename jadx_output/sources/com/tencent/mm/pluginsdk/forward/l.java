package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes8.dex */
public final class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.forward.m f188716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f188717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f188718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f188719g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f188720h;

    public l(com.tencent.mm.pluginsdk.forward.m mVar, com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.View view, db5.h4 h4Var, int i17) {
        this.f188716d = mVar;
        this.f188717e = k0Var;
        this.f188718f = view;
        this.f188719g = h4Var;
        this.f188720h = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Context context = this.f188718f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.pluginsdk.forward.m mVar = this.f188716d;
        mVar.hj(this.f188717e, context, this.f188719g, this.f188720h);
        rl5.r rVar = mVar.f188724g;
        if (rVar != null) {
            rVar.a();
        }
    }
}
