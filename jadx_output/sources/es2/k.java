package es2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.l f256382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(es2.l lVar, java.lang.String str) {
        super(0);
        this.f256382d = lVar;
        this.f256383e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (cs2.p) this.f256382d.f256386f.remove(this.f256383e);
    }
}
