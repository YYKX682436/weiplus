package wo4;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f448268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wo4.l lVar) {
        super(1);
        this.f448268d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogDecoder", "onDecodeEnd");
        yz5.l lVar = this.f448268d.f448274c;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(longValue));
        }
        return jz5.f0.f302826a;
    }
}
