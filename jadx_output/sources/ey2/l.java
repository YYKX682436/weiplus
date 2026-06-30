package ey2;

/* loaded from: classes2.dex */
public final class l extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashSet f257421e;

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        java.util.HashSet hashSet = this.f257421e;
        if (hashSet != null) {
            com.tencent.mars.xlog.Log.i("FinderCgiEndVM", "clear extInfo!");
            hashSet.clear();
        }
    }
}
