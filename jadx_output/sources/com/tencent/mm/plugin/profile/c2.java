package com.tencent.mm.plugin.profile;

/* loaded from: classes10.dex */
public final class c2 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f153405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c5 f153407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f153408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f153409f;

    public c2(java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.String str2, r45.c5 c5Var, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, yz5.l lVar) {
        this.f153404a = str;
        this.f153405b = atomicInteger;
        this.f153406c = str2;
        this.f153407d = c5Var;
        this.f153408e = copyOnWriteArrayList;
        this.f153409f = lVar;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        r45.c5 c5Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download ");
        sb6.append(i17);
        sb6.append(" at ");
        sb6.append(this.f153404a);
        sb6.append(", succeed: ");
        sb6.append(z17);
        sb6.append(", downloading: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f153405b;
        sb6.append(atomicInteger.get());
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f153408e;
        if (z17) {
            java.lang.String str = this.f153406c;
            mr3.l lVar = null;
            if (str != null && (c5Var = this.f153407d) != null) {
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
            this.f153409f.invoke(copyOnWriteArrayList);
        }
    }
}
