package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public final class hb extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201006d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.jb f201008f;

    /* renamed from: g, reason: collision with root package name */
    public int f201009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.tencent.mm.ui.chatting.gallery.jb jbVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f201008f = jbVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f201007e = obj;
        this.f201009g |= Integer.MIN_VALUE;
        return this.f201008f.emit(null, this);
    }
}
