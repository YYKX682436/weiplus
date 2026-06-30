package es2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.o f256388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(es2.o oVar, java.lang.String str) {
        super(0);
        this.f256388d = oVar;
        this.f256389e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (cs2.p) this.f256388d.f256394f.remove(this.f256389e);
    }
}
