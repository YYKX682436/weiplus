package ey2;

/* loaded from: classes10.dex */
public final class m2 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final hp0.f f257431e = new hp0.f(6);

    @Override // pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        kk.j jVar = this.f257431e.f282912a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        ((lt0.f) jVar).d(-1);
    }
}
