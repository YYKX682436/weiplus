package com.tencent.mm.storage;

/* loaded from: classes16.dex */
public class q4 implements pq5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f195240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f195241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean[] f195242c;

    public q4(com.tencent.mm.storage.p4 p4Var, com.tencent.mm.storage.f9 f9Var, xg3.l0 l0Var, boolean[] zArr) {
        this.f195240a = f9Var;
        this.f195241b = l0Var;
        this.f195242c = zArr;
    }

    @Override // pq5.b
    public void a(java.lang.Object obj) {
        ((vg3.t3) obj).C0(this.f195240a, this.f195241b, this.f195242c);
    }
}
