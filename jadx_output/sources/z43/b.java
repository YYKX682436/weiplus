package z43;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f470105d;

    public b(z43.f fVar, android.content.Context context) {
        this.f470105d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f470105d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492210fm3), 0).show();
    }
}
