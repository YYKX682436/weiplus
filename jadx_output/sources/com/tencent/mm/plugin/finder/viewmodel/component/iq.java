package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class iq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.gi f134763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment f134764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(com.tencent.mm.plugin.finder.viewmodel.component.gi giVar, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment) {
        super(0);
        this.f134763d = giVar;
        this.f134764e = finderHomeTabFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        int i17 = this.f134764e.f129263n;
        com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = this.f134763d;
        giVar.c(i17);
        com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar = giVar.f134534k;
        if (finderLoadBar != null) {
            finderLoadBar.setVisibility(8);
        }
        android.view.View a17 = com.tencent.mm.plugin.finder.viewmodel.component.bl.M.a(giVar);
        if (a17 != null && (findViewById = a17.findViewById(com.tencent.mm.R.id.nvk)) != null) {
            findViewById.requestLayout();
            findViewById.invalidate();
        }
        return jz5.f0.f302826a;
    }
}
