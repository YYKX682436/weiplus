package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f201333a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f201334b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f201335c = new java.util.ArrayList();

    public r4(com.tencent.mm.ui.chatting.gallery.o4 o4Var) {
    }

    public void a(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", java.lang.Long.valueOf(f9Var.getMsgId()));
        java.util.ArrayList arrayList = this.f201333a;
        arrayList.remove(f9Var);
        arrayList.remove(c(f9Var.getMsgId()));
        arrayList.add(f9Var);
        java.util.Iterator it = this.f201335c.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.chatting.gallery.q4) it.next()).l0(f9Var, true);
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
        this.f201333a.clear();
        java.util.Iterator it = this.f201335c.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.chatting.gallery.q4) it.next()).clear();
        }
    }

    public com.tencent.mm.storage.f9 c(long j17) {
        java.util.Iterator it = this.f201333a.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (f9Var.getMsgId() == j17) {
                return f9Var;
            }
        }
        return null;
    }

    public boolean d(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        java.util.Iterator it = this.f201333a.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.storage.f9) it.next()).getMsgId() == f9Var.getMsgId()) {
                return true;
            }
        }
        return false;
    }

    public void e(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", java.lang.Long.valueOf(f9Var.getMsgId()));
        java.util.ArrayList arrayList = this.f201333a;
        arrayList.remove(f9Var);
        arrayList.remove(c(f9Var.getMsgId()));
        java.util.Iterator it = this.f201335c.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.chatting.gallery.q4) it.next()).l0(f9Var, false);
        }
    }

    public int f() {
        return this.f201333a.size();
    }
}
