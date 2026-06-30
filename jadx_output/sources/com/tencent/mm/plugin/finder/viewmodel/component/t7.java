package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class t7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e8 f135988e;

    /* renamed from: f, reason: collision with root package name */
    public int f135989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.tencent.mm.plugin.finder.viewmodel.component.e8 e8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f135988e = e8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f135987d = obj;
        this.f135989f |= Integer.MIN_VALUE;
        java.lang.Object O6 = com.tencent.mm.plugin.finder.viewmodel.component.e8.O6(this.f135988e, this);
        return O6 == pz5.a.f359186d ? O6 : kotlin.Result.m520boximpl(O6);
    }
}
