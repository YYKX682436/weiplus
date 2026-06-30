package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class x9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201559d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201561f;

    /* renamed from: g, reason: collision with root package name */
    public int f201562g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.tencent.mm.ui.chatting.gallery.ja jaVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f201561f = jaVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f201560e = obj;
        this.f201562g |= Integer.MIN_VALUE;
        return this.f201561f.O(null, null, null, null, null, null, null, null, this);
    }
}
