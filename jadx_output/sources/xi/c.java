package xi;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f454650d;

    public c(xi.e eVar, android.widget.Toast toast) {
        this.f454650d = toast;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f454650d.cancel();
    }
}
