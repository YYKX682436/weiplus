package k5;

/* loaded from: classes13.dex */
public class b extends k5.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5.w f304117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304118f;

    public b(b5.w wVar, java.lang.String str) {
        this.f304117e = wVar;
        this.f304118f = str;
    }

    @Override // k5.d
    public void b() {
        b5.w wVar = this.f304117e;
        androidx.work.impl.WorkDatabase workDatabase = wVar.f17897c;
        workDatabase.c();
        try {
            java.util.Iterator it = ((java.util.ArrayList) ((j5.g0) workDatabase.n()).h(this.f304118f)).iterator();
            while (it.hasNext()) {
                a(wVar, (java.lang.String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            b5.g.a(wVar.f17896b, wVar.f17897c, wVar.f17899e);
        } catch (java.lang.Throwable th6) {
            workDatabase.f();
            throw th6;
        }
    }
}
