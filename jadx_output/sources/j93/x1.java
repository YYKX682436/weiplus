package j93;

/* loaded from: classes.dex */
public final class x1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.a2 f298534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f298535e;

    public x1(j93.a2 a2Var, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f298534d = a2Var;
        this.f298535e = mvvmList;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((ym3.o) obj).f463177a == ym3.p.f463181f) {
            ((em.l2) ((jz5.n) this.f298534d.f298359d).getValue()).l().setAlphabet((java.lang.String[]) ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) this.f298535e).A.toArray(new java.lang.String[0]));
        }
    }
}
