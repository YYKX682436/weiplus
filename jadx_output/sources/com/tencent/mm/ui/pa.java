package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f209497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f209498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f209499f;

    public pa(com.tencent.mm.ui.ga gaVar, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f209499f = gaVar;
        this.f209497d = runnable;
        this.f209498e = runnable2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.ui.ga gaVar = this.f209499f;
        if (elapsedRealtime - gaVar.f208667r0 < 300) {
            java.lang.Runnable runnable = this.f209497d;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            java.lang.Runnable runnable2 = this.f209498e;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        gaVar.f208667r0 = android.os.SystemClock.elapsedRealtime();
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
