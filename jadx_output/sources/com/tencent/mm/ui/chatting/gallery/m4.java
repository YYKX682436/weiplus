package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k1 f201192d;

    public m4(com.tencent.mm.ui.chatting.gallery.k1 k1Var) {
        this.f201192d = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f201192d.notifyDataSetChanged();
    }
}
