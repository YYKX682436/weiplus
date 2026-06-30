package j00;

/* loaded from: classes5.dex */
public final class k0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296809a;

    public k0(java.lang.String str) {
        this.f296809a = str;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.String str = this.f296809a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage success:" + str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage failed:" + str);
        }
    }
}
