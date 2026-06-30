package uf;

/* loaded from: classes.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427020d;

    public e0(android.content.Context context) {
        this.f427020d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f427020d;
        dp.a.makeText(context, i65.a.r(context, com.tencent.mm.R.string.s_), 0).show();
    }
}
