package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class x10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f136387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136388f;

    public x10(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, boolean z17, boolean z18) {
        this.f136386d = f50Var;
        this.f136387e = z17;
        this.f136388f = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.bc5 bc5Var;
        r45.bc5 bc5Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136386d;
        r45.lk2 lk2Var = f50Var.f134339e;
        boolean z17 = true;
        if (((lk2Var == null || (bc5Var2 = (r45.bc5) lk2Var.getCustom(38)) == null || bc5Var2.getInteger(0) != 1) ? false : true) != false) {
            r45.lk2 lk2Var2 = f50Var.f134339e;
            java.lang.String string = (lk2Var2 == null || (bc5Var = (r45.bc5) lk2Var2.getCustom(38)) == null) ? null : bc5Var.getString(1);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                android.app.Activity context = f50Var.getContext();
                com.tencent.mm.plugin.finder.viewmodel.component.w10 w10Var = new com.tencent.mm.plugin.finder.viewmodel.component.w10(string, f50Var);
                f50Var.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
                e3Var.a();
                e3Var.f(com.tencent.mm.R.layout.du6);
                android.widget.TextView textView = (android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.azj);
                android.widget.TextView textView2 = (android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.re9);
                android.widget.TextView textView3 = (android.widget.TextView) e3Var.f131959f.findViewById(com.tencent.mm.R.id.obc);
                kotlin.jvm.internal.o.d(textView);
                com.tencent.mm.ui.fk.a(textView);
                textView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.n20(w10Var));
                kotlin.jvm.internal.o.d(textView2);
                com.tencent.mm.ui.fk.a(textView2);
                textView2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.o20(e3Var));
                kotlin.jvm.internal.o.d(textView3);
                com.tencent.mm.ui.fk.a(textView3);
                e3Var.i();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        int Z6 = f50Var.Z6();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.D(f50Var.getContext(), false, Z6);
        p2Var.W(p2Var.i(f50Var.getContext(), Z6, false));
        p2Var.R(gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        androidx.appcompat.app.AppCompatActivity context2 = f50Var.getActivity();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z18 = this.f136387e;
        jSONObject.put("is_red_dot", z18 ? 1 : 0);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "post_video", 1, jSONObject, false, null, 48, null);
        if (z18) {
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera");
            if (I0 != null && L0 != null) {
                com.tencent.mm.plugin.finder.report.x2.f125429a.e("4", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
            }
        }
        android.content.Intent intent = new android.content.Intent();
        if (this.f136388f) {
            intent.putExtra("key_create_scene", 4);
        } else {
            intent.putExtra("key_create_scene", 2);
        }
        r45.lk2 lk2Var3 = f50Var.f134339e;
        if (lk2Var3 != null) {
            intent.putExtra("key_prepare_resp", lk2Var3.toByteArray());
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qj(f50Var.getActivity(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
