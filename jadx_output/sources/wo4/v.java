package wo4;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wo4.y yVar) {
        super(1);
        this.f448291d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        gs0.b iMediaCodecTransEncoder = (gs0.b) obj;
        kotlin.jvm.internal.o.g(iMediaCodecTransEncoder, "iMediaCodecTransEncoder");
        wo4.y yVar = this.f448291d;
        iMediaCodecTransEncoder.f274973c = new wo4.t(yVar);
        iMediaCodecTransEncoder.f274974d = new wo4.u(yVar);
        iMediaCodecTransEncoder.f274976f = true;
        return jz5.f0.f302826a;
    }
}
