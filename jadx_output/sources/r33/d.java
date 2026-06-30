package r33;

/* loaded from: classes5.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368971e;

    public d(r33.f fVar, android.content.Context context, java.lang.String str) {
        this.f368970d = context;
        this.f368971e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f368970d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(this.f368971e);
        u1Var.n(context.getString(com.tencent.mm.R.string.l_e));
        u1Var.q(false);
    }
}
