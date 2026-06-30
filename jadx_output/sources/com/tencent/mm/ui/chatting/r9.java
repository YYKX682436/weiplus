package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class r9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f21.e f202645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.n9 f202646e;

    public r9(com.tencent.mm.ui.chatting.n9 n9Var, f21.e eVar) {
        this.f202646e = n9Var;
        this.f202645d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f202646e.f(this.f202645d, null);
    }
}
