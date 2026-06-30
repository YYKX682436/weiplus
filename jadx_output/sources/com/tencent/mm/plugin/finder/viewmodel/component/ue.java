package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ue extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136127d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f136128e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f136129f;

    /* renamed from: g, reason: collision with root package name */
    public int f136130g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f136131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ye f136132i;

    /* renamed from: m, reason: collision with root package name */
    public int f136133m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue(com.tencent.mm.plugin.finder.viewmodel.component.ye yeVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f136132i = yeVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f136131h = obj;
        this.f136133m |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.viewmodel.component.ye.O6(this.f136132i, this);
    }
}
