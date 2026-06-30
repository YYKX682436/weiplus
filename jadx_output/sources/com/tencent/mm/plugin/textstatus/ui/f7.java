package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class f7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f173865d;

    /* renamed from: e, reason: collision with root package name */
    public int f173866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.g7 f173867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.plugin.textstatus.ui.g7 g7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f173867f = g7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f173865d = obj;
        this.f173866e |= Integer.MIN_VALUE;
        return this.f173867f.emit(null, this);
    }
}
