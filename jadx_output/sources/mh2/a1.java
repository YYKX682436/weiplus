package mh2;

/* loaded from: classes10.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jh2.c f326297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(mh2.f1 f1Var, int i17, jh2.c cVar) {
        super(1);
        this.f326295d = f1Var;
        this.f326296e = i17;
        this.f326297f = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        if (list != null) {
            pm0.v.X(new mh2.z0(this.f326295d, list, this.f326296e, this.f326297f));
        }
        return jz5.f0.f302826a;
    }
}
