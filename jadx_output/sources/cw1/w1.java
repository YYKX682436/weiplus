package cw1;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f223388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f223390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI f223392h;

    public w1(long j17, boolean z17, java.util.Set set, java.lang.String str, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI) {
        this.f223388d = j17;
        this.f223389e = z17;
        this.f223390f = set;
        this.f223391g = str;
        this.f223392h = cleanCacheSubListUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Sa = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Sa();
        long j17 = this.f223388d;
        kotlin.jvm.internal.o.d(Sa);
        java.util.Iterator it = Sa.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((com.tencent.mm.plugin.appbrand.appstorage.m0) it.next()).f76268d;
        }
        long j19 = j17 - j18;
        if (j19 > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(Sa);
            arrayList.add(new com.tencent.mm.plugin.appbrand.appstorage.m0("", "", this.f223391g, j19, java.lang.Boolean.FALSE));
            Sa = arrayList;
        }
        if (Sa.size() > 1) {
            kz5.g0.t(Sa, new cw1.v1());
        }
        int size = Sa.size();
        boolean[] zArr = new boolean[size];
        for (int i17 = 0; i17 < size; i17++) {
            zArr[i17] = this.f223389e || this.f223390f.contains(((com.tencent.mm.plugin.appbrand.appstorage.m0) Sa.get(i17)).f76265a);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.u1(this.f223392h, Sa, zArr));
    }
}
