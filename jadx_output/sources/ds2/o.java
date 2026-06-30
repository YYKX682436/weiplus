package ds2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds2.p f242882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ds2.p pVar, java.lang.String str) {
        super(0);
        this.f242882d = pVar;
        this.f242883e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (cs2.p) this.f242882d.f242886f.remove(this.f242883e);
    }
}
