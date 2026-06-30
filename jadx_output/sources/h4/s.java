package h4;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.z f278693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f278694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h4.z zVar, int i17) {
        super(0);
        this.f278693d = zVar;
        this.f278694e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h4.z zVar = this.f278693d;
        return new h4.r(zVar.f278714c, this.f278694e, zVar.f278716e, zVar.f278717f, zVar.f278718g, zVar.f278715d);
    }
}
