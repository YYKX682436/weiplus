package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qb extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f135680d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f135681e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f135682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f135683g;

    /* renamed from: h, reason: collision with root package name */
    public int f135684h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f135685i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135686m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc f135687n;

    /* renamed from: o, reason: collision with root package name */
    public int f135688o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.finder.viewmodel.component.nc ncVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f135687n = ncVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f135686m = obj;
        this.f135688o |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.viewmodel.component.nc.O6(this.f135687n, 0, null, null, null, false, this);
    }
}
