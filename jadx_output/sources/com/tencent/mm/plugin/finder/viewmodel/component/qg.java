package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class qg extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135704d;

    /* renamed from: e, reason: collision with root package name */
    public int f135705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.rg f135706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(com.tencent.mm.plugin.finder.viewmodel.component.rg rgVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f135706f = rgVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f135704d = obj;
        this.f135705e |= Integer.MIN_VALUE;
        return this.f135706f.emit(null, this);
    }
}
