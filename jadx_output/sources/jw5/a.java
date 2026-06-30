package jw5;

/* loaded from: classes13.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw5.n f302343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iw5.n nVar) {
        super(1);
        this.f302343d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        iw5.m mVar = (iw5.m) this.f302343d;
        mVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelInitCallback");
            obtain.writeInt(booleanValue ? 1 : 0);
            mVar.f295274d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }
}
