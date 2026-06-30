package qb2;

/* loaded from: classes10.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qb2.t f361228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qb2.l0 f361229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f361230c;

    public k0(qb2.t tVar, qb2.l0 l0Var, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f361228a = tVar;
        this.f361229b = l0Var;
        this.f361230c = adapterContextMenuInfo;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
            qb2.t tVar = this.f361228a;
            boolean deleteNotify = Kj.deleteNotify(tVar.systemRowid, false);
            if (deleteNotify) {
                com.tencent.mm.plugin.finder.storage.dj0 pk6 = ((c61.l7) i95.n0.c(c61.l7.class)).pk();
                java.lang.String field_sessionId = tVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                pk6.y0(field_sessionId, false);
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().doNotify(tVar.field_sessionId, 6, tVar);
                yz5.a aVar = this.f361229b.f361233d;
                if (aVar != null) {
                }
            }
            c01.w9.h(tVar.field_sessionId, new qb2.j0(deleteNotify, this.f361230c));
        }
        return jz5.f0.f302826a;
    }
}
