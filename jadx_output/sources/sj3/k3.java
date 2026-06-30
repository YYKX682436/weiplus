package sj3;

/* loaded from: classes5.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408610d;

    public k3(android.content.Context context) {
        this.f408610d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f408610d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
