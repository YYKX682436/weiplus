package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f208228d;

    public x1(java.util.List list) {
        this.f208228d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f208228d.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}
