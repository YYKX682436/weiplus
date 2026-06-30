package com.tencent.mm.xcompat.viewpager2.adapter;

/* loaded from: classes2.dex */
class FragmentStateAdapter$4 implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f214730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f214731e;

    public FragmentStateAdapter$4(com.tencent.mm.xcompat.viewpager2.adapter.b bVar, android.os.Handler handler, java.lang.Runnable runnable) {
        this.f214730d = handler;
        this.f214731e = runnable;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m mVar) {
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            this.f214730d.removeCallbacks(this.f214731e);
            yVar.mo133getLifecycle().c(this);
        }
    }
}
