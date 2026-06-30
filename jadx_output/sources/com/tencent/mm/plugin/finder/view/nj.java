package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class nj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.oj f132716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f132717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132718f;

    public nj(com.tencent.mm.plugin.finder.view.oj ojVar, db5.h4 h4Var, int i17) {
        this.f132716d = ojVar;
        this.f132717e = h4Var;
        this.f132718f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSelfShareBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.t4 t4Var = this.f132716d.f132793e;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(this.f132717e, this.f132718f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSelfShareBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
