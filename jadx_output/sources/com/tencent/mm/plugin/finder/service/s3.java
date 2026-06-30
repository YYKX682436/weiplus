package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.ya f126205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(zy2.ya yaVar, java.lang.String str) {
        super(4);
        this.f126205d = yaVar;
        this.f126206e = str;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        this.f126205d.a(this.f126206e, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Number) obj2).intValue(), ((java.lang.Number) obj3).intValue(), (java.lang.String) obj4);
        return jz5.f0.f302826a;
    }
}
