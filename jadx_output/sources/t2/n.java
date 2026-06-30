package t2;

/* loaded from: classes14.dex */
public class n extends t2.j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t2.o f414656n;

    public n(t2.o oVar) {
        this.f414656n = oVar;
    }

    @Override // t2.j
    public java.lang.String f() {
        t2.k kVar = (t2.k) this.f414656n.f414657d.get();
        if (kVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + kVar.f414652a + "]";
    }
}
