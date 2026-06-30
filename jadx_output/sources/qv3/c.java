package qv3;

/* loaded from: classes5.dex */
public final class c implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv3.d f366952a;

    public c(qv3.d dVar) {
        this.f366952a = dVar;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(bgmList, "bgmList");
        qv3.d dVar = this.f366952a;
        dVar.f449405n = false;
        wt3.i0 i0Var = dVar.f366954p;
        if (i0Var != null) {
            i0Var.a(bgmList, z17, z18, j17);
        }
    }

    @Override // wt3.i0
    public android.app.Activity getActivity() {
        wt3.i0 i0Var = this.f366952a.f366954p;
        if (i0Var != null) {
            return i0Var.getActivity();
        }
        return null;
    }
}
