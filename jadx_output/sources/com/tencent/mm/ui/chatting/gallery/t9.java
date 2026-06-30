package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class t9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201412e;

    /* renamed from: f, reason: collision with root package name */
    public int f201413f;

    /* renamed from: g, reason: collision with root package name */
    public int f201414g;

    /* renamed from: h, reason: collision with root package name */
    public int f201415h;

    /* renamed from: i, reason: collision with root package name */
    public int f201416i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f201417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201419o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201420p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ pk4.d f201421q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, pk4.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201418n = jaVar;
        this.f201419o = taVar;
        this.f201420p = f9Var;
        this.f201421q = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.gallery.t9 t9Var = new com.tencent.mm.ui.chatting.gallery.t9(this.f201418n, this.f201419o, this.f201420p, this.f201421q, continuation);
        t9Var.f201417m = obj;
        return t9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.t9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.t9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
