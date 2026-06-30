package qg3;

/* loaded from: classes2.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f362837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f362838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f362839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362840g;

    public o0(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, yz5.l lVar) {
        this.f362837d = bArr;
        this.f362838e = bArr2;
        this.f362839f = bArr3;
        this.f362840g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] finderObject = this.f362837d;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        byte[] lastBuffer = this.f362838e;
        kotlin.jvm.internal.o.g(lastBuffer, "lastBuffer");
        byte[] relatedListLastBuffer = this.f362839f;
        kotlin.jvm.internal.o.g(relatedListLastBuffer, "relatedListLastBuffer");
        yz5.l callback = this.f362840g;
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.FinderObject().parseFrom(finderObject);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderObject");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) parseFrom;
            jz5.g gVar = com.tencent.mm.plugin.finder.feed.model.ea.f107833d;
            ((com.tencent.mm.plugin.finder.feed.model.ea) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.ea.f107835f).getValue()).a(finderObject2.getId(), finderObject2.getObjectNonceId(), null, pm0.b0.h(lastBuffer), pm0.b0.h(relatedListLastBuffer), new qg3.p0(callback, finderObject2));
        } catch (java.lang.Exception unused) {
            byte[] byteArray = new bw5.kd0().toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            callback.invoke(byteArray);
            com.tencent.mars.xlog.Log.e("MicroMsg.NativeCgiJavaStatic", "fetchContinuePlayNextFeed but finderObject invalid");
        }
    }
}
