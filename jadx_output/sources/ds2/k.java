package ds2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.m f242871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ds2.m mVar, java.lang.String str) {
        super(0);
        this.f242871d = mVar;
        this.f242872e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (cs2.p) this.f242871d.f242877f.remove(this.f242872e);
    }
}
