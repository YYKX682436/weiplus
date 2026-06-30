package l02;

/* loaded from: classes.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314833e;

    public p(l02.q qVar, android.content.Context context, java.lang.String str) {
        this.f314832d = context;
        this.f314833e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        k02.l.d(this.f314832d, this.f314833e, null);
    }
}
