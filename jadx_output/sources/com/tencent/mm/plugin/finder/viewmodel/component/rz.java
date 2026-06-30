package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class rz extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135841d;

    /* renamed from: e, reason: collision with root package name */
    public int f135842e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f135843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sz f135844g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(com.tencent.mm.plugin.finder.viewmodel.component.sz szVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f135844g = szVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f135841d = obj;
        this.f135842e |= Integer.MIN_VALUE;
        return this.f135844g.emit(null, this);
    }
}
