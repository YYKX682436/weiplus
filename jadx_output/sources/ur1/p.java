package ur1;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f430366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.l lVar) {
        super(1);
        this.f430366d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String data = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(data, "data");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "readDraft from newImageEditor contentLen: " + data.length() + ", contentMd5: " + com.tencent.mm.sdk.platformtools.w2.b(data.getBytes()) + ", contentPrefix: " + r26.p0.E0(data, 200));
        this.f430366d.invoke(data);
        return jz5.f0.f302826a;
    }
}
