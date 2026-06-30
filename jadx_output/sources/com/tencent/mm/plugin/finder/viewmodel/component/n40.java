package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class n40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135258f;

    public n40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, boolean z17, boolean z18) {
        this.f135256d = f50Var;
        this.f135257e = z17;
        this.f135258f = z18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderPostBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135256d;
        androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        boolean z17 = this.f135258f;
        boolean z18 = this.f135257e;
        jSONObject.put("is_red_dot", (!z18 || z17) ? 0 : 1);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "post_video", 1, jSONObject, false, null, 48, null);
        if (z18 && !z17) {
            r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLCamera");
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLCamera");
            if (I0 != null && L0 != null) {
                com.tencent.mm.plugin.finder.report.x2.f125429a.e("4", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
            }
        }
        f50Var.W6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderPostBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
