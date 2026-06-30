package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f118555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f118556e;

    public h9(android.content.Context context, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        this.f118555d = context;
        this.f118556e = x9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f118555d;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_SOURCE", 1);
            com.tencent.mm.plugin.finder.live.widget.x9 x9Var = this.f118556e;
            intent.putExtra("KEY_REPORT_TO_SVR_SCENE", x9Var.f120304J.getInteger(3));
            intent.putExtra("KEY_REPORT_TO_SVR_TS", c01.id.a() - x9Var.f120304J.getLong(4));
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Gj(activity, intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChooseRolePanel$mAdapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
