package e45;

/* loaded from: classes10.dex */
public final class c extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e45.h f249376c;

    public c(e45.h hVar) {
        this.f249376c = hVar;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        d45.q qVar = this.f249376c.f249391p;
        if (qVar != null) {
            if (qVar.getItemViewType(i17) == 2) {
                return 3;
            }
        }
        return 1;
    }
}
