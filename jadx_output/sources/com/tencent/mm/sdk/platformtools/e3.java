package com.tencent.mm.sdk.platformtools;

/* loaded from: classes.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f192549d;

    public e3(java.util.List list) {
        this.f192549d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f192549d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.vfs.w6.f((java.lang.String) it.next());
        }
    }
}
