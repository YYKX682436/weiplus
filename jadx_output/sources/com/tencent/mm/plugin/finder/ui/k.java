package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129407d;

    public k(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129407d = finderActivityDescUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129407d;
        if (finderActivityDescUI.F != 0) {
            finderActivityDescUI.getIntent().putExtra("key_activity_end_time", finderActivityDescUI.F);
        }
        r45.e21 e21Var = finderActivityDescUI.L;
        if (e21Var != null && (list = e21Var.getList(22)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : list) {
                if (finderJumpInfo != null) {
                    arrayList2.add(finderJumpInfo.toByteArray());
                }
            }
            finderActivityDescUI.getIntent().putExtra("key_activity_jump_info_list", arrayList2);
        }
        r45.e21 e21Var2 = finderActivityDescUI.L;
        if (e21Var2 != null && (string = e21Var2.getString(23)) != null) {
            finderActivityDescUI.getIntent().putExtra("key_activity_post_wording", string);
        }
        com.tencent.mm.plugin.finder.report.e3 e3Var = com.tencent.mm.plugin.finder.report.e3.f125009a;
        androidx.appcompat.app.AppCompatActivity context = finderActivityDescUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e3Var.a("5", xy2.c.e(context), new org.json.JSONObject().put("vst_id", finderActivityDescUI.f128492p1));
        finderActivityDescUI.setResult(-1, finderActivityDescUI.getIntent());
        finderActivityDescUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
