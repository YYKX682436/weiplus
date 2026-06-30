package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class s1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI f129789d;

    public s1(com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI) {
        this.f129789d = finderBlockListSearchUI;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.ui.FinderBlockListSearchUI finderBlockListSearchUI = this.f129789d;
        rl5.r rVar = new rl5.r(finderBlockListSearchUI.getContext());
        int a07 = i17 - ((in5.n0) adapter).a0();
        rVar.g(view, a07, 0L, new com.tencent.mm.plugin.finder.ui.p1(finderBlockListSearchUI), new com.tencent.mm.plugin.finder.ui.r1(a07, finderBlockListSearchUI, adapter), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        rVar.m();
        return true;
    }
}
