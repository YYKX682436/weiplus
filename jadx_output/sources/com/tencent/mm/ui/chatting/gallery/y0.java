package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f201567a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f201568b = new java.util.ArrayList();

    public y0(int i17, java.util.List list) {
        this.f201567a = i17;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.chatting.gallery.c1 c1Var = (com.tencent.mm.ui.chatting.gallery.c1) it.next();
                if (c1Var != null) {
                    this.f201568b.add(c1Var);
                }
            }
        }
    }

    public final void a() {
        java.util.List list = this.f201568b;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.chatting.gallery.c1) it.next()).reset();
        }
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            com.tencent.mm.ui.chatting.gallery.c1 c1Var = (com.tencent.mm.ui.chatting.gallery.c1) it6.next();
            i17 += c1Var.getWidth();
            c1Var.getWidth();
            c1Var.getPriority();
        }
        int i18 = this.f201567a;
        if (i17 <= i18) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new com.tencent.mm.ui.chatting.gallery.x0());
        }
        java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
        while (it7.hasNext()) {
            com.tencent.mm.ui.chatting.gallery.c1 c1Var2 = (com.tencent.mm.ui.chatting.gallery.c1) it7.next();
            if (i17 - i18 <= 0) {
                return;
            }
            int width = c1Var2.getWidth();
            if (width - c1Var2.getMinWidth() > 0) {
                i17 -= width - c1Var2.a();
                c1Var2.getPriority();
                c1Var2.getWidth();
            }
        }
    }
}
