package df2;

/* loaded from: classes3.dex */
public final class qp extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f231178d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(df2.sp spVar) {
        super(2);
        this.f231178d = spVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mars.xlog.Log.i(this.f231178d.f231353m, "[refreshGiftList] doGetGiftList isSucess:" + booleanValue + ", errcode = " + intValue);
        return jz5.f0.f302826a;
    }
}
