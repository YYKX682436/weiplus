package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class u9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201488d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201489e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f201490f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f201491g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f201492h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201493i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201494m;

    /* renamed from: n, reason: collision with root package name */
    public int f201495n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(com.tencent.mm.ui.chatting.gallery.ja jaVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f201494m = jaVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f201493i = obj;
        this.f201495n |= Integer.MIN_VALUE;
        return this.f201494m.N(null, null, null, null, null, this);
    }
}
