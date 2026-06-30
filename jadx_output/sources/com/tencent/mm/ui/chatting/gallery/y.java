package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f201565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201566e;

    public y(com.tencent.mm.ui.chatting.gallery.h0 h0Var, int i17) {
        this.f201565d = h0Var;
        this.f201566e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f201565d.notifyItemRemoved(this.f201566e);
    }
}
