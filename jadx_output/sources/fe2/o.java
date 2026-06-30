package fe2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee2.a f261522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe2.q f261523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ee2.a aVar, fe2.q qVar) {
        super(0);
        this.f261522d = aVar;
        this.f261523e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ee2.a aVar = this.f261522d;
        boolean z17 = aVar.f251583g instanceof com.tencent.mm.plugin.finder.live.plugin.vk0;
        fe2.q qVar = this.f261523e;
        if (z17) {
            qVar.D1();
        } else {
            qVar.v1(aVar.f251580d);
        }
        return jz5.f0.f302826a;
    }
}
