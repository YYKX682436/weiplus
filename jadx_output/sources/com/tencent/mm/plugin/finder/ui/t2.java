package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.t80 f129855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.t f129856e;

    public t2(com.tencent.mm.plugin.finder.storage.t80 t80Var, qb2.t tVar) {
        this.f129855d = t80Var;
        this.f129856e = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.storage.t80 t80Var = this.f129855d;
        qb2.t tVar = this.f129856e;
        if (t80Var.delete(tVar, true, "rowid", "senderUserName")) {
            t80Var.doNotify(tVar.field_sessionId, 6, tVar);
        }
    }
}
