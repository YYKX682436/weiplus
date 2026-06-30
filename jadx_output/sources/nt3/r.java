package nt3;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f339805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f339806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.p pVar, yz5.a aVar) {
        super(1);
        this.f339805d = pVar;
        this.f339806e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gs0.b $receiver = (gs0.b) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        $receiver.f274973c = this.f339805d;
        $receiver.f274974d = this.f339806e;
        $receiver.f274976f = true;
        return jz5.f0.f302826a;
    }
}
