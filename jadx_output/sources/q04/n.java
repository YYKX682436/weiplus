package q04;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f359386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o04.q f359388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, java.lang.String str, o04.q qVar) {
        super(0);
        this.f359386d = i17;
        this.f359387e = str;
        this.f359388f = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(r04.a.class);
        }
        r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
        java.lang.String id6 = this.f359386d + '_' + this.f359387e;
        kotlin.jvm.internal.o.g(id6, "id");
        r04.b X6 = dVar.X6(id6);
        int S6 = X6 != null ? com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(dVar, X6, false, false, 6, null) : 0;
        o04.q qVar = this.f359388f;
        if (qVar != null) {
            qVar.a(4, S6 > 0, null, null);
        }
        return jz5.f0.f302826a;
    }
}
