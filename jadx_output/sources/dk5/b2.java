package dk5;

/* loaded from: classes9.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.c2 f234522d;

    public b2(dk5.c2 c2Var) {
        this.f234522d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk5.c2 c2Var = this.f234522d;
        if (c2Var.f234551k) {
            android.content.Context context = c2Var.f234542b;
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).finish();
            }
        }
    }
}
