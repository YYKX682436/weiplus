package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class s2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f117384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f117385f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z2 f117387h;

    /* renamed from: i, reason: collision with root package name */
    public int f117388i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f117387h = z2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f117386g = obj;
        this.f117388i |= Integer.MIN_VALUE;
        return this.f117387h.P6(this);
    }
}
