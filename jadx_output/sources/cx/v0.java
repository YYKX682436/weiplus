package cx;

/* loaded from: classes7.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f224476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(yz5.p pVar) {
        super(1);
        this.f224476d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse magicSclBizApiResponse = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(magicSclBizApiResponse, "magicSclBizApiResponse");
        this.f224476d.invoke(java.lang.Integer.valueOf((int) magicSclBizApiResponse.getErrCode()), magicSclBizApiResponse.getErrMsg());
        return jz5.f0.f302826a;
    }
}
