package oa2;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f343839e;

    public u(oa2.w wVar, r45.r03 r03Var) {
        this.f343838d = wVar;
        this.f343839e = r03Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$updateViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oa2.w wVar = this.f343838d;
        if (wVar.getActivity().getIntent().getIntExtra("key_entrance_source_type", 0) == 0) {
            wVar.getActivity().finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            r45.r23 r23Var = (r45.r23) this.f343839e.getCustom(23);
            intent.putExtra("finder_username", (r23Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) r23Var.getCustom(0)) == null) ? null : finderContact.getUsername());
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, wVar.getContext(), intent, 0L, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(wVar.getContext(), intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/template/FinderTemplateTopicHeaderUIC$updateViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
