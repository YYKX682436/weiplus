package dj5;

/* loaded from: classes.dex */
public final class x implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f233099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f233100e;

    public x(dj5.b0 b0Var, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f233099d = b0Var;
        this.f233100e = mvvmList;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((ym3.o) obj).f463177a == ym3.p.f463181f) {
            ((em.l2) ((jz5.n) this.f233099d.f233056e).getValue()).l().setAlphabet((java.lang.String[]) ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) this.f233100e).A.toArray(new java.lang.String[0]));
        }
    }
}
