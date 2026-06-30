package com.tencent.mm.view.manager;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213666d;

    public l(com.tencent.mm.view.manager.d dVar) {
        this.f213666d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f213666d.f213639o.requestLayout();
    }
}
