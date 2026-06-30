package uf5;

/* loaded from: classes10.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f427252a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f427253b = null;

    public j1(android.content.Context context) {
        this.f427252a = context;
    }

    public void a(java.lang.Runnable runnable) {
        android.content.Context context = this.f427252a;
        this.f427253b = db5.e1.Q(context, context.getResources().getString(com.tencent.mm.R.string.f490573yv), this.f427252a.getResources().getString(com.tencent.mm.R.string.e_), true, false, new uf5.e1(this, runnable));
    }

    public void b(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        runnable.run();
        android.content.Context context = this.f427252a;
        this.f427253b = db5.e1.Q(context, context.getResources().getString(com.tencent.mm.R.string.f490573yv), this.f427252a.getResources().getString(com.tencent.mm.R.string.f489882ed), true, false, new uf5.f1(this, runnable2));
    }

    public void c() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f427253b;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f427253b = null;
        }
    }
}
