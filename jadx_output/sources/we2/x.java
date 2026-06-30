package we2;

/* loaded from: classes3.dex */
public abstract class x implements we2.c0 {
    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        kotlin.jvm.internal.o.g(cgiResp, "cgiResp");
        we2.b bVar = cgiResp.f445220c;
        if (bVar == null) {
            return false;
        }
        b(bVar);
        return true;
    }

    public abstract boolean b(we2.b bVar);

    public void c() {
    }
}
