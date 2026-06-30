package com.tencent.mm.sns_compose.page;

/* loaded from: classes4.dex */
public final class k1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f193516d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f193517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.l1 f193518f;

    /* renamed from: g, reason: collision with root package name */
    public int f193519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.sns_compose.page.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f193518f = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f193517e = obj;
        this.f193519g |= Integer.MIN_VALUE;
        return this.f193518f.b(null, this);
    }
}
