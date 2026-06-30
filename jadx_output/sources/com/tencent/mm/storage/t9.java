package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class t9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f195330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f195331e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f195332f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f195333g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f195334h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f195335i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f195336m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f195337n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.v9 f195338o;

    /* renamed from: p, reason: collision with root package name */
    public int f195339p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(com.tencent.mm.storage.v9 v9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f195338o = v9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f195337n = obj;
        this.f195339p |= Integer.MIN_VALUE;
        return this.f195338o.a(this);
    }
}
