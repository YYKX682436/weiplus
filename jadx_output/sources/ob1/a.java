package ob1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob1.c f343983d;

    public a(ob1.c cVar) {
        this.f343983d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f343983d.f343997l) {
            return;
        }
        this.f343983d.p(ob1.m.f344032s);
        this.f343983d.m();
    }
}
