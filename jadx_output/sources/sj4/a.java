package sj4;

/* loaded from: classes9.dex */
public final class a implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f408820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f408822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.j0 f408823d;

    public a(long j17, java.lang.String str, yz5.a aVar, pj4.j0 j0Var) {
        this.f408820a = j17;
        this.f408821b = str;
        this.f408822c = aVar;
        this.f408823d = j0Var;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.ExtJumpInfoHandler", "[CgiGetFinderFeed] errType=" + i17 + " errCode=" + i18 + " feed_id=" + this.f408820a + " nonce_id:" + this.f408821b);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = obj instanceof com.tencent.mm.protocal.protobuf.FinderObject ? (com.tencent.mm.protocal.protobuf.FinderObject) obj : null;
            if (finderObject != null) {
                byte[] byteArray = finderObject.toByteArray();
                this.f408823d.f355141f = android.util.Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            }
        }
        this.f408822c.invoke();
    }
}
