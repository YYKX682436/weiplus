package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class e6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f134194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.p6 f134195e;

    /* renamed from: f, reason: collision with root package name */
    public int f134196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(com.tencent.mm.plugin.finder.viewmodel.component.p6 p6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f134195e = p6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f134194d = obj;
        this.f134196f |= Integer.MIN_VALUE;
        java.lang.Object O6 = com.tencent.mm.plugin.finder.viewmodel.component.p6.O6(this.f134195e, this);
        return O6 == pz5.a.f359186d ? O6 : kotlin.Result.m520boximpl(O6);
    }
}
