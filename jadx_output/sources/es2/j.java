package es2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.l f256380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(es2.l lVar, java.lang.String str) {
        super(0);
        this.f256380d = lVar;
        this.f256381e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (cs2.p) this.f256380d.f256386f.remove(this.f256381e);
    }
}
