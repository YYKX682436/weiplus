package mc;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.app.FragmentManager f325495a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.FragmentTransaction f325496b;

    public final lc.i a() {
        android.app.FragmentManager fragmentManager = this.f325495a;
        if (fragmentManager == null) {
            return null;
        }
        android.app.Fragment findFragmentById = fragmentManager.findFragmentById(com.tencent.mm.R.id.vjy);
        if (findFragmentById instanceof lc.i) {
            return (lc.i) findFragmentById;
        }
        return null;
    }

    public final void b(lc.i iVar) {
        android.app.FragmentManager fragmentManager = this.f325495a;
        if (fragmentManager != null) {
            this.f325496b = fragmentManager.beginTransaction();
            this.f325495a.findFragmentById(com.tencent.mm.R.id.vjy);
            this.f325496b.replace(com.tencent.mm.R.id.vjy, iVar).addToBackStack(null).commit();
        }
    }
}
