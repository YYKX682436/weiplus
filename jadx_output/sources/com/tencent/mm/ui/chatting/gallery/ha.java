package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ha extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200993d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f200994e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f200995f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f200996g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f200997h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f200998i;

    /* renamed from: m, reason: collision with root package name */
    public int f200999m;

    /* renamed from: n, reason: collision with root package name */
    public int f201000n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201001o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f201002p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201003q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ pk4.d f201004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201005s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(com.tencent.mm.ui.chatting.gallery.ja jaVar, int i17, com.tencent.mm.storage.f9 f9Var, pk4.d dVar, com.tencent.mm.ui.chatting.gallery.ta taVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201001o = jaVar;
        this.f201002p = i17;
        this.f201003q = f9Var;
        this.f201004r = dVar;
        this.f201005s = taVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.ha(this.f201001o, this.f201002p, this.f201003q, this.f201004r, this.f201005s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.ha) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0130  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ha.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
