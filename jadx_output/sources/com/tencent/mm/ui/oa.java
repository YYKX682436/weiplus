package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class oa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f209465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f209466e;

    public oa(com.tencent.mm.ui.ga gaVar, java.lang.Runnable runnable) {
        this.f209466e = gaVar;
        this.f209465d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.ui.ga gaVar = this.f209466e;
        if (elapsedRealtime - gaVar.f208667r0 < 300) {
            this.f209465d.run();
        }
        gaVar.f208667r0 = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
