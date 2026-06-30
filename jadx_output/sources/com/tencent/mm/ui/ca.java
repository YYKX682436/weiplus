package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class ca implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f198088d;

    public ca(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f198088d = mMActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f198088d;
        android.content.Intent intent = mMActivity.getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/ui/MMActivity$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/ui/MMActivity$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
