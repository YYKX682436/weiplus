package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f124309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.x80 f124310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f124312g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(r45.ss4 ss4Var, com.tencent.mm.plugin.finder.storage.x80 x80Var, com.tencent.mm.plugin.finder.profile.uic.j3 j3Var, yz5.l lVar) {
        super(0);
        this.f124309d = ss4Var;
        this.f124310e = x80Var;
        this.f124311f = j3Var;
        this.f124312g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list = this.f124309d.getList(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localId:");
        com.tencent.mm.plugin.finder.storage.x80 x80Var = this.f124310e;
        sb6.append(x80Var.field_localId);
        sb6.append(", id:");
        sb6.append(x80Var.field_objectId);
        sb6.append(" is svrFeed");
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileDraftUIC", sb6.toString());
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        db2.g4 g4Var = new db2.g4(x80Var.field_objectId, x80Var.t0().getObjectNonceId(), 0, 0, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
        g4Var.t(this.f124311f.getContext(), "", 500L);
        g4Var.l().K(new com.tencent.mm.plugin.finder.profile.uic.v2(c0Var, list, this.f124311f, this.f124312g, this.f124309d));
        return jz5.f0.f302826a;
    }
}
