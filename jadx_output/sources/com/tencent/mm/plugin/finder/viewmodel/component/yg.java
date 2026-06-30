package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class yg extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f136577d;

    /* renamed from: e, reason: collision with root package name */
    public int f136578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zg f136579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.tencent.mm.plugin.finder.viewmodel.component.zg zgVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f136579f = zgVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f136577d = obj;
        this.f136578e |= Integer.MIN_VALUE;
        return this.f136579f.emit(null, this);
    }
}
