package f63;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u53.d0 f259854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, java.lang.String str2, u53.d0 d0Var) {
        super(2);
        this.f259852d = str;
        this.f259853e = str2;
        this.f259854f = d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String sessionId = (java.lang.String) obj;
        v53.c cVar = (v53.c) obj2;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getSessionId] ");
        java.lang.String str = this.f259852d;
        sb6.append(str);
        sb6.append(" to ");
        java.lang.String str2 = this.f259853e;
        sb6.append(str2);
        sb6.append(" => ");
        sb6.append(sessionId);
        sb6.append(", from server.");
        com.tencent.mars.xlog.Log.i("GameLife.GameLifeSessionInfoService", sb6.toString());
        if (sessionId.length() > 0) {
            ((t53.m0) i95.n0.c(t53.m0.class)).Zi().z0(sessionId, str, str2, cVar);
        }
        this.f259854f.a(sessionId);
        return jz5.f0.f302826a;
    }
}
