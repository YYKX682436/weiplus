package z43;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f470097d;

    public a(z43.f fVar, android.content.Context context) {
        this.f470097d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f470097d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
    }
}
