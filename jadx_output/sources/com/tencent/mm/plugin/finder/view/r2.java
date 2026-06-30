package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s2 f132925d;

    public r2(com.tencent.mm.plugin.finder.view.s2 s2Var) {
        this.f132925d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.s2 s2Var = this.f132925d;
        java.util.List list = s2Var.f133006n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            java.lang.Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (next instanceof r45.jy0) {
                num = java.lang.Integer.valueOf(((r45.jy0) next).getInteger(0));
            } else if (next instanceof r45.ot0) {
                num = java.lang.Integer.valueOf(((r45.ot0) next).getInteger(0));
            }
            if (num != null) {
                arrayList2.add(num);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(s2Var.f133006n)) {
            android.content.Context context = s2Var.f132994b;
            db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f491299cp1));
            i17 = 3;
        } else {
            android.content.Context context2 = s2Var.f132994b;
            db5.t7.h(context2, context2.getResources().getString(com.tencent.mm.R.string.f491301cp3));
            i17 = 2;
        }
        yz5.a aVar = s2Var.f133007o;
        if (aVar != null) {
            aVar.invoke();
        }
        android.content.Context context3 = s2Var.f132994b;
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        gm0.j1.d().g(new db2.j5(i17, arrayList2, s2Var.f132995c, s2Var.f132996d, s2Var.f132998f, s2Var.f132999g, s2Var.f133000h, s2Var.f133001i, nyVar != null ? nyVar.V6() : null));
        s2Var.f133002j = 2;
        s2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow$initSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
