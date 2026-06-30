package z43;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f470108d;

    public c(z43.f fVar, android.content.Context context) {
        this.f470108d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f470108d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492209fm2), 0).show();
    }
}
