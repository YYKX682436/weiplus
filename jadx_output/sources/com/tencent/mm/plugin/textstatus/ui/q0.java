package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class q0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174185d;

    public q0(android.content.Context context) {
        this.f174185d = context;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        di4.i iVar = di4.i.f232782a;
        iVar.g(true);
        iVar.f(true);
        db5.t7.m(this.f174185d, "红点信息清理完毕");
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
