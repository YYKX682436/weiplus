package hz4;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f286438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.p f286439e;

    public m(hz4.p pVar, r45.bq0 bq0Var) {
        this.f286439e = pVar;
        this.f286438d = bq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hz4.p.r(this.f286439e, this.f286438d, true, 1);
    }

    public java.lang.String toString() {
        return super.toString() + "|dealWNoteInfo";
    }
}
