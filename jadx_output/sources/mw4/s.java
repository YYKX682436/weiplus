package mw4;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw4.w f331790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f331791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f331792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mw4.w wVar, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f331790d = wVar;
        this.f331791e = map;
        this.f331792f = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.network.j2 conn = (com.tencent.mm.network.j2) obj;
        kotlin.jvm.internal.o.g(conn, "conn");
        mw4.w wVar = this.f331790d;
        mw4.r rVar = new mw4.r(wVar, this.f331792f);
        wVar.getClass();
        conn.f72045k = false;
        conn.f72043i = "GET";
        conn.f72047m = true;
        conn.f72049o = 2;
        for (java.util.Map.Entry entry : this.f331791e.entrySet()) {
            conn.h((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a("wcf://WebPrefetchContent/spa/auth");
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        conn.f72046l = a17.toString();
        conn.f72048n = new mw4.q(rVar);
        conn.f72040f = 10000;
        conn.f72039e = 3000;
        conn.a();
        return jz5.f0.f302826a;
    }
}
