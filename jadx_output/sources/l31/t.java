package l31;

/* loaded from: classes9.dex */
public final class t extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final e31.l f315394e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String username, java.util.List templateIds, k31.a aVar, e31.l lVar) {
        super(username);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(templateIds, "templateIds");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f315395f = arrayList;
        this.f315394e = lVar;
        arrayList.addAll(templateIds);
    }

    @Override // l31.u
    public void run() {
        java.lang.String username = this.f315313a;
        java.util.List templateMsgList = this.f315395f;
        l31.s sVar = new l31.s(this);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(templateMsgList, "templateMsgList");
        f31.f fVar = new f31.f(username, 5);
        fVar.f259277f = sVar;
        java.util.Iterator it = ((java.util.ArrayList) templateMsgList).iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            java.util.List list = fVar.f259275d;
            r45.th6 th6Var = new r45.th6();
            th6Var.f386448m = username;
            th6Var.f386442d = (java.lang.String) lVar.f302833d;
            th6Var.f386460y = ((java.lang.Number) lVar.f302834e).intValue();
            ((java.util.ArrayList) list).add(th6Var);
        }
        c(fVar);
    }
}
