package qj4;

/* loaded from: classes4.dex */
public final class n implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f363936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363937c;

    public n(java.lang.String str, yz5.l lVar, java.lang.String str2) {
        this.f363935a = str;
        this.f363936b = lVar;
        this.f363937c = str2;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        mj4.h M = ai4.m0.f5173a.M(this.f363935a);
        if (M == null) {
            return;
        }
        java.util.Map map2 = (java.util.Map) this.f363936b.invoke(M);
        ((mj4.k) M).l();
        kotlin.jvm.internal.o.d(str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(this.f363937c, str, map2, 33629);
    }
}
