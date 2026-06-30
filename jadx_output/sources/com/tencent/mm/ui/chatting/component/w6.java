package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f200155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.f7 f200156f;

    public w6(com.tencent.mm.ui.chatting.component.f7 f7Var, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        this.f200156f = f7Var;
        this.f200154d = f9Var;
        this.f200155e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f200156f.f199015e.contains(java.lang.Long.valueOf(this.f200154d.I0()))) {
            return;
        }
        this.f200156f.f199015e.add(java.lang.Long.valueOf(this.f200154d.I0()));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.v6(this));
    }
}
