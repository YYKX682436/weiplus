package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class np implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb5.s2 f199601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199602e;

    public np(sb5.s2 s2Var, java.lang.String str) {
        this.f199601d = s2Var;
        this.f199602e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ze5.a8) this.f199601d).b(this.f199602e);
    }
}
