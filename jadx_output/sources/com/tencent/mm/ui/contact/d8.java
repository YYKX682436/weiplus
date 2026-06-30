package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.g8 f206667d;

    public d8(com.tencent.mm.ui.contact.g8 g8Var) {
        this.f206667d = g8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List Q = ((com.tencent.mm.storage.k4) c01.d9.b().q()).Q();
        com.tencent.mm.ui.contact.g8 g8Var = this.f206667d;
        g8Var.f206726f = Q;
        g8Var.post(new com.tencent.mm.ui.contact.c8(this));
    }
}
