package g31;

/* loaded from: classes9.dex */
public final class j implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g31.l f268081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgTmpItem f268082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e31.i f268083c;

    public j(g31.l lVar, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem, e31.i iVar) {
        this.f268081a = lVar;
        this.f268082b = subscribeMsgTmpItem;
        this.f268083c = iVar;
    }

    @Override // e31.i
    public void a() {
        java.lang.String str = this.f268082b.f71803f;
        g31.e eVar = g31.e.f268074d;
        g31.l lVar = this.f268081a;
        lVar.k(str, eVar);
        lVar.r(g31.f.f268075d);
        e31.i iVar = this.f268083c;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = this.f268082b;
        g31.l.j(this.f268081a, subscribeMsgTmpItem.f71803f, result);
        e31.i iVar = this.f268083c;
        if (iVar != null) {
            iVar.b(subscribeMsgTmpItem.f71803f, result);
        }
    }
}
