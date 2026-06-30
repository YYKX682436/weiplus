package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.k1 f200886d;

    public e(com.tencent.mm.ui.chatting.gallery.k1 k1Var) {
        this.f200886d = k1Var;
    }

    public boolean i(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        return j(taVar, f9Var, i17, true);
    }

    public boolean j(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17, boolean z17) {
        return false;
    }

    public com.tencent.mm.ui.chatting.gallery.ta k(int i17) {
        android.view.View e17;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
        if (k1Var == null || (e17 = k1Var.e(i17)) == null) {
            return null;
        }
        return (com.tencent.mm.ui.chatting.gallery.ta) e17.getTag();
    }

    public void m(int i17) {
        android.view.View e17;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
        if (k1Var == null || (e17 = k1Var.e(i17)) == null || e17.getTag() == null) {
            return;
        }
        i((com.tencent.mm.ui.chatting.gallery.ta) e17.getTag(), this.f200886d.y(i17), i17);
    }
}
