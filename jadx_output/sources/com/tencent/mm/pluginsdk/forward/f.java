package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes3.dex */
public final class f implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.forward.m f188704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f188705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f188706f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f188707g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f188708h;

    public f(com.tencent.mm.pluginsdk.forward.m mVar, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17, yz5.l lVar) {
        this.f188704d = mVar;
        this.f188705e = context;
        this.f188706f = k0Var;
        this.f188707g = i17;
        this.f188708h = lVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        this.f188704d.Ai(this.f188705e, g4Var, this.f188706f, this.f188707g, this.f188708h);
    }
}
