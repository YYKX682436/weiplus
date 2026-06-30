package h34;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c34.r f278570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f278571e;

    public x(c34.r rVar, android.content.Context context) {
        this.f278570d = rVar;
        this.f278571e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        h34.z.c(this.f278570d, this.f278571e, false);
    }
}
