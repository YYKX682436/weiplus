package dq0;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f242344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.p pVar) {
        super(1);
        this.f242344d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f242344d.invoke(java.lang.Long.valueOf(it.getErrCode()), it.getErrMsg());
        return jz5.f0.f302826a;
    }
}
