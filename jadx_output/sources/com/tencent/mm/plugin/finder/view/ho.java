package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ho implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f132261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f132262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nw6 f132264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f132265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132266i;

    public ho(kotlin.jvm.internal.h0 h0Var, int i17, int i18, r45.nw6 nw6Var, int i19, android.content.Context context) {
        this.f132261d = h0Var;
        this.f132262e = i17;
        this.f132263f = i18;
        this.f132264g = nw6Var;
        this.f132265h = i19;
        this.f132266i = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.h0 h0Var = this.f132261d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", (java.lang.String) h0Var.f310123d);
            intent.putExtra("key_enter_profile_type", 40);
            intent.putExtra("key_entrance_type", this.f132262e);
            intent.putExtra("KEY_REF_COMMENTSCENE", 97);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"half_screen_source\":");
            int i17 = this.f132263f;
            sb6.append(i17);
            sb6.append('}');
            java.lang.String sb7 = sb6.toString();
            intent.putExtra("key_extra_info", sb7);
            intent.putExtra("CLIENT_KV_REPORTINFO", sb7);
            intent.putExtra("key_common_extra_info", sb7);
            intent.putExtra("key_half_screen_source", i17);
            r45.so2 so2Var = (r45.so2) this.f132264g.getCustom(8);
            if (so2Var != null) {
                intent.putExtra("key_poi_interaction_info", ot5.e.a(so2Var.toByteArray()));
            }
            if (this.f132265h == 8) {
                intent.putExtra("key_entrance_type", 19);
            }
            java.lang.Object obj = h0Var.f310123d;
            android.content.Context context = this.f132266i;
            kotlin.jvm.internal.o.f(context, "$context");
            boolean b17 = kotlin.jvm.internal.o.b(obj, xy2.c.e(context));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(14, 2, b17 ? 33 : 32, intent);
            intent.putExtra("KEY_FINDER_SELF_FLAG", b17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            kotlin.jvm.internal.o.f(context, "$context");
            e1Var.w(context, intent);
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct();
            finderShowInWXProfileStruct.s(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
            finderShowInWXProfileStruct.p("97");
            finderShowInWXProfileStruct.t("{\"scene\":" + i17 + '}');
            finderShowInWXProfileStruct.q("fans_list_to_profile");
            finderShowInWXProfileStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderShowInWXProfileStruct);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileApi$updateWxProfileFinderEntry$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
