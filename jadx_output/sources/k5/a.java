package k5;

/* loaded from: classes13.dex */
public class a extends k5.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b5.w f304115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f304116f;

    public a(b5.w wVar, java.util.UUID uuid) {
        this.f304115e = wVar;
        this.f304116f = uuid;
    }

    @Override // k5.d
    public void b() {
        b5.w wVar = this.f304115e;
        androidx.work.impl.WorkDatabase workDatabase = wVar.f17897c;
        workDatabase.c();
        try {
            a(wVar, this.f304116f.toString());
            workDatabase.h();
            workDatabase.f();
            b5.g.a(wVar.f17896b, wVar.f17897c, wVar.f17899e);
        } catch (java.lang.Throwable th6) {
            workDatabase.f();
            throw th6;
        }
    }
}
