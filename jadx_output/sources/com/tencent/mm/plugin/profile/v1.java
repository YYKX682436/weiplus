package com.tencent.mm.plugin.profile;

/* loaded from: classes10.dex */
public final class v1 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f154727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f154729d;

    public v1(java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.ArrayList arrayList, yz5.l lVar) {
        this.f154726a = str;
        this.f154727b = atomicInteger;
        this.f154728c = arrayList;
        this.f154729d = lVar;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download ");
        sb6.append(i17);
        sb6.append(" at ");
        java.lang.String str = this.f154726a;
        sb6.append(str);
        sb6.append(", succeed: ");
        sb6.append(z17);
        sb6.append(", downloading: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f154727b;
        sb6.append(atomicInteger.get());
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
        java.util.ArrayList arrayList = this.f154728c;
        if (z17) {
            arrayList.add(str);
        }
        if (atomicInteger.addAndGet(-1) <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileUtilsKt", "onSuccess with download finished, " + arrayList);
            this.f154729d.invoke(arrayList);
        }
    }
}
