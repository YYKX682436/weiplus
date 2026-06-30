package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class he implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f199163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ie f199164e;

    public he(com.tencent.mm.ui.chatting.component.ie ieVar, k91.v5 v5Var) {
        this.f199164e = ieVar;
        this.f199163d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ie ieVar = this.f199164e;
        ieVar.f199228b.x(ieVar.f199227a, this.f199163d);
    }
}
