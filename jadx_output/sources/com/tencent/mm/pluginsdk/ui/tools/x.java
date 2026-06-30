package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class x extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191972e;

    public x(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191972e = appChooserUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.acu;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = (com.tencent.mm.pluginsdk.ui.otherway.x) cVar;
        android.view.View view = s0Var.itemView;
        int i19 = xVar.f191033i ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayResolveInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayResolveInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView appChooseItemCheckedView = (com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView) s0Var.p(com.tencent.mm.R.id.e1w);
        appChooseItemCheckedView.f191326d = true;
        appChooseItemCheckedView.a();
        appChooseItemCheckedView.getTitleTv().setText(xVar.f191029e);
        if (appChooseItemCheckedView.getIconImg() != null) {
            appChooseItemCheckedView.getIconImg().setImageDrawable(xVar.f191030f);
        }
        appChooseItemCheckedView.setChecked(this.f191972e.f191343q.a(xVar));
        s0Var.itemView.setOnClickListener(new com.tencent.mm.pluginsdk.ui.tools.w(this, xVar));
    }
}
