package jn1;

/* loaded from: classes11.dex */
public final class x implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f300540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f300541b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f300542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f300543d;

    public x(java.lang.String username, int i17, java.lang.String url) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(url, "url");
        this.f300540a = username;
        this.f300541b = i17;
        this.f300542c = url;
        this.f300543d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.String str2 = this.f300540a;
        if (kotlin.jvm.internal.o.b(str2, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.AvatarRemoteGetContactCallback", "getContactCallBack " + str2 + " succ:" + z17);
            if (z17 && this.f300541b == 0) {
                jn1.o oVar = jn1.u.f300534f;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) jn1.u.f300537i).getValue();
                java.lang.String str3 = this.f300542c;
                if (concurrentHashMap.containsKey(str3)) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str2);
                    if (n07 != null && kotlin.jvm.internal.o.b(str3, n07.d()) && oVar.a(n07, true, "getContactCallBack")) {
                        ((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).cj(str2, kz5.c1.k(new jz5.l("request_source", "GetContactUpdate"), new jz5.l("get_contact_cost", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f300543d))));
                    }
                }
            }
        }
    }
}
