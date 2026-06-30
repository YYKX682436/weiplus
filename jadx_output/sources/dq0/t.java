package dq0;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f242337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yz5.l lVar, dq0.a0 a0Var) {
        super(1);
        this.f242336d = lVar;
        this.f242337e = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m527isFailureimpl(value)) {
            value = null;
        }
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse magicSclBizApiResponse = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) value;
        yz5.l lVar = this.f242336d;
        if (magicSclBizApiResponse != null) {
            if (lVar != null) {
                lVar.invoke(magicSclBizApiResponse);
            }
        } else if (lVar != null) {
            this.f242337e.getClass();
            lVar.invoke(new com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse(4096, "", null, 4, null));
        }
        return jz5.f0.f302826a;
    }
}
