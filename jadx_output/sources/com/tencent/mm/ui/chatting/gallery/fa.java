package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class fa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f200927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f200928h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pk4.d f200929i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.ja jaVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var, pk4.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200925e = f9Var;
        this.f200926f = jaVar;
        this.f200927g = h0Var;
        this.f200928h = c0Var;
        this.f200929i = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.fa(this.f200925e, this.f200926f, this.f200927g, this.f200928h, this.f200929i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.fa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if ((r11 != null && r11.f399314c == 7) != false) goto L50;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.fa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
