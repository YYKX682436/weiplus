package mz0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcontrol.VideoTransPara f332914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f332916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.util.List list, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332913d = list;
        this.f332914e = videoTransPara;
        this.f332915f = i17;
        this.f332916g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.c2(this.f332913d, this.f332914e, this.f332915f, this.f332916g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f332913d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
            com.tencent.mm.plugin.vlog.model.b bVar = wi6 != null ? new com.tencent.mm.plugin.vlog.model.b(str, 0L, wi6.f361366d) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        com.tencent.mm.plugin.vlog.model.a b17 = com.tencent.mm.plugin.vlog.model.d.b(com.tencent.mm.plugin.vlog.model.d.f175575a, arrayList, this.f332914e, this.f332915f, this.f332916g, false, 0, 32, null);
        if (b17.f175537a == 0) {
            return new java.lang.Integer(b17.f175540d);
        }
        return null;
    }
}
