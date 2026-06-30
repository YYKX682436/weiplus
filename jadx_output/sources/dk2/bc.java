package dk2;

/* loaded from: classes2.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f233254a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f233255b;

    /* renamed from: c, reason: collision with root package name */
    public final dk2.hc f233256c;

    public bc(r45.yk2 backendModel) {
        kotlin.jvm.internal.o.g(backendModel, "backendModel");
        this.f233254a = java.lang.String.valueOf(backendModel.getLong(0));
        this.f233255b = java.lang.String.valueOf(backendModel.getLong(3));
        java.util.LinkedList<r45.zk2> list = backendModel.getList(1);
        kotlin.jvm.internal.o.f(list, "getQuestions(...)");
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (r45.zk2 zk2Var : list) {
            linkedHashMap.put(java.lang.Long.valueOf(zk2Var.getLong(0)), zk2Var);
        }
        this.f233256c = dk2.ec.a(dk2.hc.f233578f, backendModel.getLong(2), linkedHashMap);
    }
}
