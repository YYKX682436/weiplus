package j7;

/* loaded from: classes13.dex */
public class n extends android.app.Fragment {

    /* renamed from: d, reason: collision with root package name */
    public final j7.a f298012d;

    /* renamed from: e, reason: collision with root package name */
    public final j7.r f298013e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f298014f;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.r f298015g;

    /* renamed from: h, reason: collision with root package name */
    public j7.n f298016h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Fragment f298017i;

    public n() {
        j7.a aVar = new j7.a();
        this.f298013e = new j7.m(this);
        this.f298014f = new java.util.HashSet();
        this.f298012d = aVar;
    }

    public final void a(android.app.Activity activity) {
        j7.n nVar = this.f298016h;
        if (nVar != null) {
            ((java.util.HashSet) nVar.f298014f).remove(this);
            this.f298016h = null;
        }
        j7.q qVar = com.bumptech.glide.c.b(activity).f43927i;
        qVar.getClass();
        j7.n c17 = qVar.c(activity.getFragmentManager(), null, j7.q.e(activity));
        this.f298016h = c17;
        if (equals(c17)) {
            return;
        }
        ((java.util.HashSet) this.f298016h.f298014f).add(this);
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (java.lang.IllegalStateException unused) {
            android.util.Log.isLoggable("RMFragment", 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f298012d.c();
        j7.n nVar = this.f298016h;
        if (nVar != null) {
            ((java.util.HashSet) nVar.f298014f).remove(this);
            this.f298016h = null;
        }
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        j7.n nVar = this.f298016h;
        if (nVar != null) {
            ((java.util.HashSet) nVar.f298014f).remove(this);
            this.f298016h = null;
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f298012d.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f298012d.e();
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("{parent=");
        android.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f298017i;
        }
        sb6.append(parentFragment);
        sb6.append("}");
        return sb6.toString();
    }
}
