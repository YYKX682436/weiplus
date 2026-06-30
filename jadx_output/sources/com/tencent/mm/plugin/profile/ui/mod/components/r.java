package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f153972d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f153973e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f153974f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f153975g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f153976h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f153977i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153978m;

    /* renamed from: n, reason: collision with root package name */
    public int f153979n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f153978m = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f153977i = obj;
        this.f153979n |= Integer.MIN_VALUE;
        return this.f153978m.R6(this);
    }
}
