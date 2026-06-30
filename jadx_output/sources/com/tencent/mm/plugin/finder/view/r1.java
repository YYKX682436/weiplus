package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class r1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f132915d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f132916e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f132917f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f132918g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f132919h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f132920i;

    /* renamed from: m, reason: collision with root package name */
    public int f132921m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f132922n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s1 f132923o;

    /* renamed from: p, reason: collision with root package name */
    public int f132924p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.finder.view.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f132923o = s1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f132922n = obj;
        this.f132924p |= Integer.MIN_VALUE;
        return this.f132923o.e(null, null, null, 0, this);
    }
}
