package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lv extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f135090d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f135091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pv f135092f;

    /* renamed from: g, reason: collision with root package name */
    public int f135093g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(com.tencent.mm.plugin.finder.viewmodel.component.pv pvVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f135092f = pvVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f135091e = obj;
        this.f135093g |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.viewmodel.component.pv.O6(this.f135092f, null, null, null, null, this);
    }
}
