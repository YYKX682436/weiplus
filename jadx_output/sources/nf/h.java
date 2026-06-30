package nf;

/* loaded from: classes7.dex */
public class h implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nf.k f336597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nf.g f336598b;

    public h(nf.g gVar, nf.k kVar) {
        this.f336598b = gVar;
        this.f336597a = kVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        this.f336598b.f336584c.remove(this);
        return this.f336597a.a(i17, i18, intent);
    }
}
