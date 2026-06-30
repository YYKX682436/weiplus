package zg;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.biz.MBBizManager f472715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472717f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.magicbrush.biz.MBBizManager mBBizManager, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f472715d = mBBizManager;
        this.f472716e = str;
        this.f472717f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("read file callback buffer must be direct");
        }
        com.tencent.magicbrush.biz.MBBizManager mBBizManager = this.f472715d;
        mBBizManager.nativeOnReadFileCallback(mBBizManager.f48598c, this.f472716e, this.f472717f, byteBuffer);
        return jz5.f0.f302826a;
    }
}
