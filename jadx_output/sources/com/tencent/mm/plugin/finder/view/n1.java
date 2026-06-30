package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class n1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f132677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f132678e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f132679f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f132680g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f132681h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f132682i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f132683m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f132684n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f132685o;

    /* renamed from: p, reason: collision with root package name */
    public int f132686p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f132687q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.s1 f132688r;

    /* renamed from: s, reason: collision with root package name */
    public int f132689s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.finder.view.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f132688r = s1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f132687q = obj;
        this.f132689s |= Integer.MIN_VALUE;
        return this.f132688r.a(null, null, null, null, 0, null, this);
    }
}
