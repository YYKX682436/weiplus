package od;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od.k f344513e;

    public j(od.k kVar, java.lang.String str) {
        this.f344513e = kVar;
        this.f344512d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f344513e.b(this.f344512d, false);
    }
}
