package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j00 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f113043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f113044f;

    public j00(int i17, com.tencent.mm.plugin.finder.live.plugin.w00 w00Var, int i18) {
        this.f113042d = i17;
        this.f113043e = w00Var;
        this.f113044f = i18;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f113044f;
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f113043e;
        int i18 = this.f113042d;
        if (i18 == 0) {
            g4Var.f(w00Var.f114844r, w00Var.f365323d.getContext().getResources().getString(i17));
        } else {
            g4Var.d(w00Var.f114844r, w00Var.f365323d.getContext().getResources().getColor(i18), w00Var.f365323d.getContext().getResources().getString(i17));
        }
    }
}
