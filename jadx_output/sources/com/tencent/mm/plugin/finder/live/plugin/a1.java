package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a1 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f111778p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f111779q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f111780r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f111778p = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484533tg0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f111779q = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.tfx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111780r = (android.widget.ImageView) findViewById2;
        rootView.setOnTouchListener(new com.tencent.mm.plugin.finder.live.plugin.x0(this));
    }

    public static final void v1(java.lang.String value, r45.mb mbVar, be2.b bVar, boolean z17, boolean z18) {
        ce2.b bVar2 = new ce2.b();
        kotlin.jvm.internal.o.g(value, "value");
        bVar2.field_productId = value;
        java.lang.String string = mbVar.getString(3);
        if (string == null) {
            string = "";
        }
        bVar2.field_submissionId = string;
        bVar2.field_status = mbVar.getInteger(0);
        bVar2.field_notificationShown = z17 ? 1 : 0;
        bVar2.field_badgeDismissed = z18 ? 1 : 0;
        rl2.b bVar3 = (rl2.b) bVar;
        bVar3.getClass();
        new m75.d(bVar2, null, null, "MicroMsg.SDK.BaseFinderLiveAigcGiftStatus").a(bVar3.f397183d);
    }

    public static final void w1(com.tencent.mm.plugin.finder.live.plugin.a1 a1Var, r45.mb mbVar, java.lang.String str) {
        boolean z17 = true;
        java.lang.String string = mbVar.getString(1);
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            if (mbVar.getInteger(0) == 3) {
                string = a1Var.f111778p.getContext().getResources().getString(com.tencent.mm.R.string.oq9, str);
                kotlin.jvm.internal.o.d(string);
            } else {
                if (mbVar.getInteger(0) != 2) {
                    return;
                }
                string = a1Var.f111778p.getContext().getResources().getString(com.tencent.mm.R.string.oq7, str);
                kotlin.jvm.internal.o.d(string);
            }
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.z0(a1Var, string));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (com.tencent.mm.plugin.finder.live.plugin.y0.f115139a[status.ordinal()] == 1 && w0() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) X0(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            android.view.ViewGroup J1 = ag0Var != null ? ag0Var.J1() : null;
            if (J1 != null && J1.isShown()) {
                t1(J1);
            } else {
                K0(8);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1(android.view.View view) {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = (!x0() || com.tencent.mm.ui.bk.d0()) ? i17 : i18;
        if (!x0() || com.tencent.mm.ui.bk.d0()) {
            i17 = i18;
        }
        int[] t17 = pm0.v.t(view);
        int width = t17[0] + view.getWidth();
        int i27 = t17[1];
        android.view.ViewGroup viewGroup = this.f111778p;
        float dimension = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        float dimension2 = viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float f17 = (i19 - i27) - dimension;
        float dimension3 = (i17 - width) - viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
        if (dimension3 >= dimension2) {
            dimension2 = dimension3;
        }
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), (int) dimension2, (int) f17);
        android.widget.LinearLayout linearLayout = viewGroup instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewGroup : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width2 = ((i17 - dimension2) - width) + ((view.getWidth() / 2) - (viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) / 2));
        android.widget.ImageView imageView = this.f111780r;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width2;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public final void u1(java.lang.Iterable gifts) {
        kotlin.jvm.internal.o.g(gifts, "gifts");
        java.util.Iterator it = gifts.iterator();
        while (it.hasNext()) {
            ce2.i iVar = (ce2.i) it.next();
            r45.mb v07 = iVar.v0();
            if (v07 != null) {
                rl2.b bVar = (rl2.b) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).D).getValue();
                java.lang.String field_rewardProductId = iVar.field_rewardProductId;
                kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
                ce2.b y07 = bVar.y0(field_rewardProductId);
                if (y07 == null) {
                    java.lang.String field_rewardProductId2 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId2, "field_rewardProductId");
                    v1(field_rewardProductId2, v07, bVar, false, false);
                } else if (v07.getInteger(0) == 0) {
                    java.lang.String field_rewardProductId3 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId3, "field_rewardProductId");
                    v1(field_rewardProductId3, v07, bVar, false, false);
                } else if (v07.getInteger(0) == 1) {
                    java.lang.String field_rewardProductId4 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId4, "field_rewardProductId");
                    v1(field_rewardProductId4, v07, bVar, false, false);
                } else {
                    java.lang.String field_submissionId = y07.field_submissionId;
                    kotlin.jvm.internal.o.f(field_submissionId, "field_submissionId");
                    if (r26.i0.p(field_submissionId, v07.getString(3), false)) {
                        if (!(y07.field_notificationShown != 0)) {
                            java.lang.String field_name = iVar.field_name;
                            kotlin.jvm.internal.o.f(field_name, "field_name");
                            w1(this, v07, field_name);
                            java.lang.String field_rewardProductId5 = iVar.field_rewardProductId;
                            kotlin.jvm.internal.o.f(field_rewardProductId5, "field_rewardProductId");
                            v1(field_rewardProductId5, v07, bVar, true, y07.field_badgeDismissed != 0);
                        }
                    } else {
                        java.lang.String field_name2 = iVar.field_name;
                        kotlin.jvm.internal.o.f(field_name2, "field_name");
                        w1(this, v07, field_name2);
                        java.lang.String field_rewardProductId6 = iVar.field_rewardProductId;
                        kotlin.jvm.internal.o.f(field_rewardProductId6, "field_rewardProductId");
                        v1(field_rewardProductId6, v07, bVar, true, false);
                    }
                }
            }
        }
    }
}
