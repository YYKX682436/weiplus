package fz4;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f267296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267297e;

    public b(android.app.Activity activity, int i17) {
        this.f267296d = activity;
        this.f267297e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.app.Activity activity = this.f267296d;
        if (activity == null || (str = activity.getString(com.tencent.mm.R.string.cds, java.lang.Integer.valueOf(this.f267297e))) == null) {
            str = "";
        }
        dp.a.makeText(activity, str, 1).show();
    }
}
