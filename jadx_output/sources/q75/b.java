package q75;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360605e;

    public b(java.lang.String str, android.content.Context context) {
        this.f360604d = str;
        this.f360605e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        q75.c.f(this.f360604d, this.f360605e);
    }
}
