package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vg extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f136245d;

    /* renamed from: e, reason: collision with root package name */
    public int f136246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.wg f136247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(com.tencent.mm.plugin.finder.viewmodel.component.wg wgVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f136247f = wgVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f136245d = obj;
        this.f136246e |= Integer.MIN_VALUE;
        return this.f136247f.emit(null, this);
    }
}
