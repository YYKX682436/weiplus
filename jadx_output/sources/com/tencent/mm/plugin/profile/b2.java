package com.tencent.mm.plugin.profile;

/* loaded from: classes10.dex */
public final class b2 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f153394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c5 f153396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f153397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f153398f;

    public b2(java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.String str2, r45.c5 c5Var, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, yz5.l lVar) {
        this.f153393a = str;
        this.f153394b = atomicInteger;
        this.f153395c = str2;
        this.f153396d = c5Var;
        this.f153397e = copyOnWriteArrayList;
        this.f153398f = lVar;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        r45.c5 c5Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download ");
        sb6.append(i17);
        sb6.append(" at ");
        sb6.append(this.f153393a);
        sb6.append(", succeed: ");
        sb6.append(z17);
        sb6.append(", downloading: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f153394b;
        sb6.append(atomicInteger.get());
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f153397e;
        if (z17) {
            java.lang.String str = this.f153395c;
            mr3.l lVar = null;
            if (str != null && (c5Var = this.f153396d) != null) {
                i21.q h17 = i21.q.h();
                java.lang.String e17 = h17 != null ? h17.e(str, c5Var.f371292d) : null;
                if (e17 != null) {
                    lVar = new mr3.l(e17, str, c5Var.f371292d, c5Var.f371293e, null, 0, 0, 112, null);
                }
            }
            if (lVar != null) {
                copyOnWriteArrayList.add(lVar);
            }
        }
        if (atomicInteger.decrementAndGet() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "onSuccess with download finished, " + copyOnWriteArrayList);
            this.f153398f.invoke(copyOnWriteArrayList);
        }
    }
}
