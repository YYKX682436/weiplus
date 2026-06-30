package n6;

/* loaded from: classes16.dex */
public class a implements m6.c {

    /* renamed from: a, reason: collision with root package name */
    public n6.b f335168a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f335169b;

    @Override // m6.c
    public int getDuration() {
        try {
            m6.b bVar = ((m6.e) this.f335169b.get(r0.size() - 1)).f324349a;
            return "continuous".equals(bVar.f324341a) ? bVar.f324342b + bVar.f324343c : bVar.f324342b + 22;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // m6.c
    public int getVersion() {
        this.f335168a.getClass();
        return 1;
    }
}
