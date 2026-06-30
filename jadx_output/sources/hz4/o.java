package hz4;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz4.j f286442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.p f286443e;

    public o(hz4.p pVar, hz4.j jVar) {
        this.f286443e = pVar;
        this.f286442d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hz4.p.r(this.f286443e, this.f286442d.f286435h, false, 2);
    }

    public java.lang.String toString() {
        return super.toString() + "|dealWNoteInfo";
    }
}
