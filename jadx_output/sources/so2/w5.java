package so2;

/* loaded from: classes8.dex */
public final class w5 extends pf5.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410692d;

    /* renamed from: e, reason: collision with root package name */
    public zy2.gc f410693e;

    public w5(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f410692d = username;
    }

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        kotlinx.coroutines.z0.d(getLifecycleScope(), this + " onCleared.", null, 2, null);
        kotlinx.coroutines.z0.d(getMainScope(), this + " onCleared.", null, 2, null);
        this.f410693e = null;
    }
}
