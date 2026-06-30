package ls0;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f320798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f320799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yz5.p pVar, yz5.a aVar) {
        super(1);
        this.f320798d = pVar;
        this.f320799e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gs0.b $receiver = (gs0.b) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 161L, 1L, false);
        $receiver.f274973c = this.f320798d;
        $receiver.f274974d = this.f320799e;
        $receiver.f274976f = true;
        return jz5.f0.f302826a;
    }
}
