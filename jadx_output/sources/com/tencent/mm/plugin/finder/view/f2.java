package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f132062d;

    public f2(com.tencent.mm.plugin.finder.view.g2 g2Var) {
        this.f132062d = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.K().r()).booleanValue();
        com.tencent.mm.plugin.finder.view.g2 g2Var = this.f132062d;
        if (booleanValue) {
            java.util.List list = g2Var.f132141m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.Integer.valueOf(((r45.jy0) it.next()).getInteger(0)));
            }
            long j17 = g2Var.f132131c;
            java.lang.String str = g2Var.f132132d;
            int i17 = g2Var.f132134f;
            java.lang.String string = g2Var.f132135g.getString(3);
            java.lang.String str2 = string == null ? "" : string;
            java.lang.String string2 = g2Var.f132135g.getString(4);
            new db2.n(2, arrayList2, j17, str, i17, str2, string2 == null ? "" : string2, null, null, 384, null);
        } else {
            int i18 = 2;
            java.util.List list2 = g2Var.f132141m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((r45.jy0) it6.next()).getInteger(0)));
            }
            long j18 = g2Var.f132131c;
            java.lang.String str3 = g2Var.f132132d;
            int i19 = g2Var.f132134f;
            java.lang.String string3 = g2Var.f132135g.getString(3);
            java.lang.String str4 = string3 == null ? "" : string3;
            java.lang.String string4 = g2Var.f132135g.getString(4);
            gm0.j1.d().g(new db2.j5(i18, arrayList3, j18, str3, i19, str4, string4 == null ? "" : string4, null, null, 384, null));
        }
        yz5.l lVar = g2Var.f132136h;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(g2Var.f132133e));
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(g2Var.f132141m)) {
            android.content.Context context = g2Var.f132130b;
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491299cp1));
        } else {
            android.content.Context context2 = g2Var.f132130b;
            db5.t7.h(context2, context2.getResources().getString(com.tencent.mm.R.string.f491301cp3));
        }
        g2Var.f132137i = 2;
        g2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
