package ls0;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f320790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f320791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yz5.p pVar, yz5.a aVar) {
        super(1);
        this.f320790d = pVar;
        this.f320791e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gs0.b $receiver = (gs0.b) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 161L, 1L, false);
        $receiver.f274973c = this.f320790d;
        $receiver.f274974d = this.f320791e;
        $receiver.f274976f = true;
        return jz5.f0.f302826a;
    }
}
