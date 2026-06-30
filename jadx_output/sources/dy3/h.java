package dy3;

/* loaded from: classes.dex */
public final class h implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f244580d;

    public h(dy3.n nVar) {
        this.f244580d = nVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        dy3.n nVar;
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar;
        if (((ym3.o) obj).f463177a != ym3.p.f463181f || (alphabetScrollBar = (nVar = this.f244580d).f244589u) == null) {
            return;
        }
        alphabetScrollBar.setAlphabet((java.lang.String[]) nVar.K().C.toArray(new java.lang.String[0]));
    }
}
