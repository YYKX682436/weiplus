package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.n f197969d;

    public m(com.tencent.mm.ui.bizchat.n nVar) {
        this.f197969d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s01.g aj6 = r01.q3.aj();
        com.tencent.mm.ui.bizchat.n nVar = this.f197969d;
        aj6.D0(nVar.f197970d.f197911u);
        if (r01.q3.aj().P0(nVar.f197970d.f197903m) <= 0) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(nVar.f197970d.f197903m);
        }
    }
}
