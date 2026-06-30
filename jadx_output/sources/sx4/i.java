package sx4;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.q f413613e;

    public i(sx4.q qVar, java.lang.String str) {
        this.f413613e = qVar;
        this.f413612d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx4.q qVar = this.f413613e;
        qVar.f413639c.setVisibility(8);
        qVar.f413645i.Z(this.f413612d);
    }
}
