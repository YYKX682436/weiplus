package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201290f;

    public q1(com.tencent.mm.ui.chatting.gallery.k1 k1Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.ta taVar, java.lang.String str) {
        this.f201288d = f9Var;
        this.f201289e = taVar;
        this.f201290f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.k0.d(this.f201288d, new com.tencent.mm.ui.chatting.gallery.p1(this));
    }
}
