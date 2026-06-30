package x51;

/* loaded from: classes5.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452115e;

    public z(android.content.Context context, java.lang.String str) {
        this.f452114d = context;
        this.f452115e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(this.f452114d, this.f452115e, 1).show();
    }
}
