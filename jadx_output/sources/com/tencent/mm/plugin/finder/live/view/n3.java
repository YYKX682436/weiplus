package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class n3 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel f116497a;

    public n3(com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel) {
        this.f116497a = finderLiveCommentPostRealNamePanel;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f116497a;
        finderLiveCommentPostRealNamePanel.f115828g = z17;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = finderLiveCommentPostRealNamePanel.f115827f;
            if (z2Var != null) {
                z2Var.x(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("bottomDialog");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = finderLiveCommentPostRealNamePanel.f115827f;
        if (z2Var2 != null) {
            z2Var2.x(1);
        } else {
            kotlin.jvm.internal.o.o("bottomDialog");
            throw null;
        }
    }
}
