package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yt implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f115230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f115231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f115232f;

    public yt(int i17, com.tencent.mm.plugin.finder.live.plugin.iv ivVar, int i18) {
        this.f115230d = i17;
        this.f115231e = ivVar;
        this.f115232f = i18;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = this.f115232f;
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f115231e;
        int i18 = this.f115230d;
        if (i18 == 0) {
            g4Var.f(ivVar.f113019u, ivVar.B.getString(i17));
        } else {
            g4Var.d(ivVar.f113019u, ivVar.B.getColor(i18), ivVar.B.getString(i17));
        }
    }
}
