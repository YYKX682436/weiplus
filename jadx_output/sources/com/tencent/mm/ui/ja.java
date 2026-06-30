package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class ja implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.eb f209001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f209002e;

    public ja(com.tencent.mm.ui.ga gaVar, com.tencent.mm.ui.eb ebVar) {
        this.f209002e = gaVar;
        this.f209001d = ebVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        boolean onLongClick;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (this.f209002e.f208650j) {
            android.view.View.OnLongClickListener onLongClickListener = this.f209001d.f208389o;
            onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
            onLongClick = true;
        }
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/MMActivityController$12", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
