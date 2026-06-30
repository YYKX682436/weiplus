package ds2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.m f242873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ds2.m mVar, java.lang.String str) {
        super(0);
        this.f242873d = mVar;
        this.f242874e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (cs2.p) this.f242873d.f242877f.remove(this.f242874e);
    }
}
