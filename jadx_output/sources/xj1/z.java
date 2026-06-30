package xj1;

/* loaded from: classes.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f454826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f454827e;

    public z(android.content.Context context, boolean z17) {
        this.f454826d = context;
        this.f454827e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f454827e;
        android.content.Context context = this.f454826d;
        dp.a.makeText(context, z17 ? context.getString(com.tencent.mm.R.string.f490084kg) : context.getString(com.tencent.mm.R.string.f490082ke), 0).show();
    }
}
