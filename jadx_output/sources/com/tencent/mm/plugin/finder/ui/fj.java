package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class fj extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(com.tencent.mm.plugin.finder.ui.qm qmVar, com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        super(2);
        this.f129242d = qmVar;
        this.f129243e = finderShareFeedRelUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var = (com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class);
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f129242d;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).c7(qmVar.f106421d);
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129243e;
        finderShareFeedRelUI.R7(false);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = qmVar.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        android.view.View view = finderShareFeedRelUI.Z;
        if (view == null) {
            kotlin.jvm.internal.o.o("tipsLayout");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cti);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        if (intValue != -5002) {
            if (intValue == -4036) {
                android.view.View view2 = finderShareFeedRelUI.Z;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("tipsLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.f492069f45);
            } else if (intValue == -4033) {
                android.view.View view3 = finderShareFeedRelUI.Z;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("tipsLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.cwu);
            } else if (intValue != -4011) {
                finderShareFeedRelUI.S7(true);
            } else {
                android.view.View view4 = finderShareFeedRelUI.Z;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("tipsLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$6$1", "invoke", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (str != null) {
                    if (!(str.length() == 0)) {
                        textView.setText(str);
                    }
                }
                textView.setText(com.tencent.mm.R.string.cv_);
            }
        } else if (str != null) {
            hc2.i.d(finderShareFeedRelUI, str);
        }
        return jz5.f0.f302826a;
    }
}
