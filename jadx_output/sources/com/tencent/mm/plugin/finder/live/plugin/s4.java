package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f114214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f114217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f114218h;

    public s4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, int i17, int i18, int i19, int i27) {
        this.f114214d = a5Var;
        this.f114215e = i17;
        this.f114216f = i18;
        this.f114217g = i19;
        this.f114218h = i27;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f114214d;
        r45.ei0 ei0Var = ((je2.g) a5Var.P0(je2.g.class)).f299222g;
        boolean z17 = ((ei0Var == null || (linkedList2 = ei0Var.f373529d) == null) ? 0 : linkedList2.size()) > 0;
        android.view.ViewGroup viewGroup = a5Var.f365323d;
        if (z17) {
            g4Var.f(this.f114215e, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ljx));
        } else {
            g4Var.f(this.f114216f, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ljv));
        }
        r45.ei0 ei0Var2 = ((je2.g) a5Var.P0(je2.g.class)).f299222g;
        if (((ei0Var2 == null || (linkedList = ei0Var2.f373530e) == null) ? 0 : linkedList.size()) > 0) {
            g4Var.f(this.f114217g, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ljt));
        } else {
            g4Var.f(this.f114218h, viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.ljs));
        }
    }
}
