package k5;

/* loaded from: classes13.dex */
public class c extends k5.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5.w f304119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304120f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f304121g;

    public c(b5.w wVar, java.lang.String str, boolean z17) {
        this.f304119e = wVar;
        this.f304120f = str;
        this.f304121g = z17;
    }

    @Override // k5.d
    public void b() {
        b5.w wVar = this.f304119e;
        androidx.work.impl.WorkDatabase workDatabase = wVar.f17897c;
        workDatabase.c();
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((j5.g0) workDatabase.n()).g(this.f304120f)).iterator();
            while (it.hasNext()) {
                a(wVar, (java.lang.String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f304121g) {
                b5.g.a(wVar.f17896b, wVar.f17897c, wVar.f17899e);
            }
        } catch (java.lang.Throwable th6) {
            workDatabase.f();
            throw th6;
        }
    }
}
