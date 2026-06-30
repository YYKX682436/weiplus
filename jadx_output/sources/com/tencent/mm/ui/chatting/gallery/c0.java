package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f200826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200827e;

    public c0(com.tencent.mm.ui.chatting.gallery.h0 h0Var, int i17) {
        this.f200826d = h0Var;
        this.f200827e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f200826d.notifyItemRemoved(this.f200827e);
    }
}
