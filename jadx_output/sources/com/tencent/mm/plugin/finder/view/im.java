package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class im implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public long f132314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.km f132315b;

    public im(com.tencent.mm.plugin.finder.view.km kmVar) {
        this.f132315b = kmVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        com.tencent.mm.plugin.finder.view.t tVar;
        if (this.f132314a > j17 && (tVar = this.f132315b.f133277n) != null) {
            tVar.f133083b++;
        }
        this.f132314a = j17;
    }
}
