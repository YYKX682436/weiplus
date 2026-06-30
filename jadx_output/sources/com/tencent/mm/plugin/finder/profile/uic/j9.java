package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class j9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.l2 f123846e;

    public j9(com.tencent.mm.plugin.finder.profile.uic.ob obVar, com.tencent.mm.plugin.finder.profile.uic.l2 l2Var) {
        this.f123845d = obVar;
        this.f123846e = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserTagLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = true;
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128041yb).getValue()).r()).intValue();
            com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123845d;
            if (intValue == 1) {
                ((ks2.j) ((jz5.n) obVar.W1).getValue()).i();
            } else {
                hs2.b bVar = obVar.V1;
                android.app.Activity context = obVar.getContext();
                bVar.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.profile.uic.l2 info = this.f123846e;
                kotlin.jvm.internal.o.g(info, "info");
                com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489077b74, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                y1Var.k(inflate);
                com.tencent.mm.ui.bk.q0(((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.obc)).getPaint());
                r45.dc1 dc1Var = info.f123926o;
                java.lang.String string = dc1Var != null ? dc1Var.getString(0) : null;
                if (!(string == null || string.length() == 0)) {
                    ((android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.o4i)).setText(string);
                }
                r45.dc1 dc1Var2 = info.f123928q;
                java.lang.String string2 = dc1Var2 != null ? dc1Var2.getString(0) : null;
                if (string2 != null && string2.length() != 0) {
                    z18 = false;
                }
                if (!z18) {
                    android.widget.TextView textView = (android.widget.TextView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.o5b);
                    r45.dc1 dc1Var3 = info.f123928q;
                    textView.setText(dc1Var3 != null ? dc1Var3.getString(0) : null);
                }
                y1Var.f212027f.findViewById(com.tencent.mm.R.id.bys).setOnClickListener(new hs2.a(y1Var));
                y1Var.s();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserTagLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
