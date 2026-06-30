package cz2;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f224990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, int i17, jz5.l lVar) {
        super(0);
        this.f224988d = str;
        this.f224989e = i17;
        this.f224990f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uri:");
        sb6.append(this.f224988d);
        sb6.append(",errCode:");
        sb6.append(this.f224989e);
        sb6.append(",size:");
        cz2.b bVar = (cz2.b) this.f224990f.f302834e;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f224983a) : null);
        return sb6.toString();
    }
}
