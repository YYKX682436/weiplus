package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public abstract class ac implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f197130d = -1;

    public abstract void a(android.view.View view);

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMCustomClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMCustomClickListener", "button onclick");
        if (this.f197130d != -1) {
            long nanoTime = (java.lang.System.nanoTime() - this.f197130d) / 1000000;
            if (nanoTime < 3000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMCustomClickListener", "click time limited limitetime:%d, delaytime:%d", java.lang.Long.valueOf(nanoTime), 3000L);
                yj0.a.h(this, "com/tencent/mm/ui/MMCustomClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        this.f197130d = java.lang.System.nanoTime();
        a(view);
        yj0.a.h(this, "com/tencent/mm/ui/MMCustomClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
