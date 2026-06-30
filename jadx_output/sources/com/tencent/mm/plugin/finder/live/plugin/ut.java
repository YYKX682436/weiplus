package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ut implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114618d;

    public ut(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        this.f114618d = ivVar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        android.widget.TextView textView = null;
        oa.k kVar = iVar != null ? iVar.f343785h : null;
        if (kVar != null) {
            int childCount = kVar.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt = kVar.getChildAt(i17);
                if (childAt instanceof android.widget.TextView) {
                    textView = (android.widget.TextView) childAt;
                    break;
                }
                i17++;
            }
        }
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(this.f114618d.f365323d.getContext().getColor(com.tencent.mm.R.color.FG_1));
        }
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114618d;
        com.google.android.material.tabs.TabLayout tabLayout = ivVar.F;
        android.view.ViewGroup viewGroup = ivVar.f365323d;
        android.content.Context context = viewGroup.getContext();
        int i17 = tab.f343782e;
        int i18 = com.tencent.mm.R.color.ak7;
        tabLayout.setSelectedTabIndicatorColor(context.getColor(i17 == 0 ? com.tencent.mm.R.color.ak7 : com.tencent.mm.R.color.f479061ak5));
        oa.k kVar = tab.f343785h;
        android.widget.TextView textView = null;
        if (kVar != null) {
            int childCount = kVar.getChildCount();
            int i19 = 0;
            while (true) {
                if (i19 >= childCount) {
                    break;
                }
                android.view.View childAt = kVar.getChildAt(i19);
                if (childAt instanceof android.widget.TextView) {
                    textView = (android.widget.TextView) childAt;
                    break;
                }
                i19++;
            }
        }
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.content.Context context2 = viewGroup.getContext();
            if (tab.f343782e != 0) {
                i18 = com.tencent.mm.R.color.f479061ak5;
            }
            textView.setTextColor(context2.getColor(i18));
        }
    }
}
