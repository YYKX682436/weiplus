package v70;

/* loaded from: classes5.dex */
public final class o implements ea0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f433614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v70.w f433615b;

    public o(int i17, v70.w wVar) {
        this.f433614a = i17;
        this.f433615b = wVar;
    }

    @Override // ea0.e
    public final void a(java.lang.String phash, java.lang.String pdqHash) {
        kotlin.jvm.internal.o.g(phash, "phash");
        kotlin.jvm.internal.o.g(pdqHash, "pdqHash");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("computePHash putPHash key:");
        int i17 = this.f433614a;
        sb6.append(i17);
        sb6.append(" phash:");
        sb6.append(phash);
        sb6.append(" pdqHash:");
        sb6.append(pdqHash);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", sb6.toString());
        ((java.util.HashMap) ((jz5.n) this.f433615b.f433630r).getValue()).put(java.lang.Integer.valueOf(i17), new jz5.l(phash, pdqHash));
    }
}
