package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lx implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f113443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f113444f;

    public lx(int i17, com.tencent.mm.plugin.finder.live.plugin.ty tyVar, int i18) {
        this.f113442d = i17;
        this.f113443e = tyVar;
        this.f113444f = i18;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f113444f;
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f113443e;
        int i18 = this.f113442d;
        if (i18 == 0) {
            g4Var.f(tyVar.f114491t, tyVar.A.getString(i17));
        } else {
            g4Var.d(tyVar.f114491t, tyVar.A.getColor(i18), tyVar.A.getString(i17));
        }
    }
}
