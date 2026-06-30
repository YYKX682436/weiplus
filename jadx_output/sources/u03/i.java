package u03;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u03.j f423466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f423467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u03.j jVar, byte[] bArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423466d = jVar;
        this.f423467e = bArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u03.i(this.f423466d, this.f423467e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u03.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            com.tencent.mm.flutter.plugin.proto.s0 s0Var = new com.tencent.mm.flutter.plugin.proto.s0();
            s0Var.parseFrom(this.f423467e);
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(s0Var.f68081n);
            xe0.d0 d0Var = (xe0.d0) i95.n0.c(xe0.d0.class);
            java.lang.String id6 = s0Var.f68074d;
            kotlin.jvm.internal.o.f(id6, "id");
            java.lang.String mediaUrl = s0Var.f68081n;
            kotlin.jvm.internal.o.f(mediaUrl, "mediaUrl");
            ((we0.w0) d0Var).getClass();
            java.lang.String g17 = bk4.n.f21513a.g("video", id6, mediaUrl);
            kotlin.jvm.internal.o.d(g17);
            ck4.c cVar = ck4.c.f42548a;
            kotlin.jvm.internal.o.d(a17);
            java.lang.String mediaUrl2 = s0Var.f68081n;
            kotlin.jvm.internal.o.f(mediaUrl2, "mediaUrl");
            this.f423466d.getClass();
            return cVar.b(a17, mediaUrl2, g17, 0, "xV2", "", "", "", null, "MicroMsg.TextStatusCdnTaskFactory");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
