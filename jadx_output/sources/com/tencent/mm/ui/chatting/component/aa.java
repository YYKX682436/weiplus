package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f198615e;

    public aa(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f198614d = f9Var;
        this.f198615e = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f198614d);
        yb5.d dVar = this.f198615e;
        com.tencent.mm.ui.chatting.x3.d(dVar.g(), linkedList, ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198754s || dVar.C(), dVar.x(), null);
    }
}
