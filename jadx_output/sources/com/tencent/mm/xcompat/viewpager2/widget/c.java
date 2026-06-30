package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public final class c extends com.tencent.mm.xcompat.viewpager2.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f214756a;

    public c(int i17) {
        this.f214756a = new java.util.ArrayList(i17);
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void a(int i17) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f214756a).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.xcompat.viewpager2.widget.o) it.next()).a(i17);
            }
        } catch (java.util.ConcurrentModificationException e17) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e17);
        }
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void b(int i17, float f17, int i18) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f214756a).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.xcompat.viewpager2.widget.o) it.next()).b(i17, f17, i18);
            }
        } catch (java.util.ConcurrentModificationException e17) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e17);
        }
    }

    @Override // com.tencent.mm.xcompat.viewpager2.widget.o
    public void c(int i17) {
        try {
            java.util.Iterator it = ((java.util.ArrayList) this.f214756a).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.xcompat.viewpager2.widget.o) it.next()).c(i17);
            }
        } catch (java.util.ConcurrentModificationException e17) {
            throw new java.lang.IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e17);
        }
    }
}
