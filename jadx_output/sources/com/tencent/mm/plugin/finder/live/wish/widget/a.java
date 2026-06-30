package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public abstract class a extends com.tencent.mm.plugin.finder.live.widget.g implements androidx.lifecycle.k0 {

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.y f120681h;

    /* renamed from: i, reason: collision with root package name */
    public final zg2.d f120682i;

    /* renamed from: m, reason: collision with root package name */
    public qs5.s f120683m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, androidx.lifecycle.y owner, boolean z17, boolean z18) {
        super(context, z18, null, z17, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f120681h = owner;
        zg2.d dVar = new zg2.d(null, 1, null);
        this.f120682i = dVar;
        dVar.observe(owner, this);
        this.f120683m = qs5.s.f366464d;
    }

    public zg2.d y() {
        zg2.d dVar = this.f120682i;
        if (!dVar.hasObservers()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getViewData reobserve: ");
            androidx.lifecycle.y yVar = this.f120681h;
            sb6.append(yVar);
            com.tencent.mars.xlog.Log.i("BaseWishPanelWidget", sb6.toString());
            dVar.observe(yVar, this);
        }
        return dVar;
    }

    public void z(androidx.constraintlayout.widget.ConstraintLayout giftPanelLayout) {
        kotlin.jvm.internal.o.g(giftPanelLayout, "giftPanelLayout");
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d(giftPanelLayout);
        int childCount = giftPanelLayout.getChildCount();
        if (childCount == 1) {
            android.view.View childAt = giftPanelLayout.getChildAt(0);
            cVar.f(childAt.getId(), 1, 0, 1, 0);
            cVar.e(childAt.getId(), 2, 0, 2);
            cVar.l(childAt.getId(), 0);
        } else if (childCount == 2) {
            android.view.View childAt2 = giftPanelLayout.getChildAt(0);
            cVar.f(childAt2.getId(), 1, 0, 1, 0);
            cVar.e(childAt2.getId(), 2, giftPanelLayout.getChildAt(1).getId(), 1);
            cVar.l(childAt2.getId(), 2);
            android.view.View childAt3 = giftPanelLayout.getChildAt(1);
            cVar.f(childAt3.getId(), 1, giftPanelLayout.getChildAt(0).getId(), 2, (int) childAt3.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
            cVar.e(childAt3.getId(), 2, 0, 2);
            cVar.l(childAt3.getId(), 0);
        } else if (childCount == 3) {
            android.view.View childAt4 = giftPanelLayout.getChildAt(0);
            cVar.f(childAt4.getId(), 1, 0, 1, 0);
            cVar.e(childAt4.getId(), 2, giftPanelLayout.getChildAt(1).getId(), 1);
            cVar.l(childAt4.getId(), 1);
            android.view.View childAt5 = giftPanelLayout.getChildAt(1);
            cVar.f(childAt5.getId(), 1, giftPanelLayout.getChildAt(0).getId(), 2, 0);
            cVar.e(childAt5.getId(), 2, giftPanelLayout.getChildAt(2).getId(), 1);
            cVar.l(childAt5.getId(), 0);
            android.view.View childAt6 = giftPanelLayout.getChildAt(2);
            cVar.f(childAt6.getId(), 1, giftPanelLayout.getChildAt(1).getId(), 2, 0);
            cVar.e(childAt6.getId(), 2, 0, 2);
            cVar.l(childAt6.getId(), 0);
        }
        cVar.b(giftPanelLayout);
        giftPanelLayout.setConstraintSet(null);
    }

    public /* synthetic */ a(android.content.Context context, androidx.lifecycle.y yVar, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        this(context, yVar, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18);
    }
}
