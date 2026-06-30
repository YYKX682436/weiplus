package e72;

/* loaded from: classes14.dex */
public class a implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.e f249885a;

    public a(e72.e eVar) {
        this.f249885a = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        synchronized (this.f249885a.f249896f) {
            java.util.Iterator it = this.f249885a.f249896f.iterator();
            while (it.hasNext()) {
                tl.c cVar = (tl.c) it.next();
                if (cVar != null) {
                    cVar.a(i17, i18);
                }
            }
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f249885a.f249896f) {
            java.util.Iterator it = this.f249885a.f249896f.iterator();
            while (it.hasNext()) {
                tl.c cVar = (tl.c) it.next();
                if (cVar != null) {
                    cVar.b(bArr, i17);
                }
            }
        }
    }
}
