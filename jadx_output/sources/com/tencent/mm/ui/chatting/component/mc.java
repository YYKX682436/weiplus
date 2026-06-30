package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f199497d;

    /* renamed from: e, reason: collision with root package name */
    public final m11.b0 f199498e;

    /* renamed from: f, reason: collision with root package name */
    public final int f199499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.oc f199500g;

    public mc(com.tencent.mm.ui.chatting.component.oc ocVar, com.tencent.mm.storage.f9 f9Var, m11.b0 b0Var, int i17) {
        this.f199500g = ocVar;
        this.f199497d = f9Var;
        this.f199498e = b0Var;
        this.f199499f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = com.tencent.mm.modelcdntran.s1.fj().f70997u;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("image_");
        com.tencent.mm.storage.f9 f9Var = this.f199497d;
        sb6.append(f9Var.getMsgId());
        hashSet.add(sb6.toString());
        ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).b(this.f199498e.f322633a, tg3.l1.a(f9Var), 0, java.lang.Integer.valueOf(this.f199499f), com.tencent.mm.R.drawable.bzt, this.f199500g, -1, true);
    }
}
