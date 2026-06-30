package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pl extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f135558e;

    /* renamed from: f, reason: collision with root package name */
    public int f135559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f135558e = zlVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f135557d = obj;
        this.f135559f |= Integer.MIN_VALUE;
        java.lang.Object O6 = com.tencent.mm.plugin.finder.viewmodel.component.zl.O6(this.f135558e, null, this);
        return O6 == pz5.a.f359186d ? O6 : kotlin.Result.m520boximpl(O6);
    }
}
