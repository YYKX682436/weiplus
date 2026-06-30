package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f196296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f196297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f196298f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f196299g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f196300h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f196301i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f196302m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f196303n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.y2 f196304o;

    /* renamed from: p, reason: collision with root package name */
    public int f196305p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.storage.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f196304o = y2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f196303n = obj;
        this.f196305p |= Integer.MIN_VALUE;
        return this.f196304o.a(this);
    }
}
