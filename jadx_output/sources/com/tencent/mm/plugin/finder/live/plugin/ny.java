package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ny implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f113684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113685e;

    public ny(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, int i17) {
        this.f113684d = tyVar;
        this.f113685e = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f113684d;
        android.content.res.Resources resources = tyVar.A;
        if (this.f113685e == 3) {
            g4Var.f(tyVar.f114498y, resources.getString(com.tencent.mm.R.string.ehz));
        }
        g4Var.f(tyVar.f114495x, resources.getString(com.tencent.mm.R.string.f491699dy4));
    }
}
