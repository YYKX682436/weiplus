package km5;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f309324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f309325e;

    public j(km5.q qVar, android.util.Pair pair, java.lang.Object obj) {
        this.f309324d = pair;
        this.f309325e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((km5.e) this.f309324d.first).a(this.f309325e);
    }
}
