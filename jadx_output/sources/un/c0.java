package un;

/* loaded from: classes.dex */
public final class c0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f429242e;

    public c0(un.k0 k0Var, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f429241d = k0Var;
        this.f429242e = mvvmList;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((ym3.o) obj).f463177a == ym3.p.f463181f) {
            un.k0.V6(this.f429241d).l().setAlphabet((java.lang.String[]) ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) this.f429242e).A.toArray(new java.lang.String[0]));
        }
    }
}
