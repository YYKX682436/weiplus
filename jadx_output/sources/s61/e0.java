package s61;

/* loaded from: classes8.dex */
public class e0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f403342d;

    public e0(s61.i0 i0Var, java.util.HashMap hashMap) {
        this.f403342d = hashMap;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.util.Iterator it = this.f403342d.keySet().iterator();
        while (it.hasNext()) {
            g4Var.add((java.lang.String) it.next());
        }
    }
}
