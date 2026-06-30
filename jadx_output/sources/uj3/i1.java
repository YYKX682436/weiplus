package uj3;

/* loaded from: classes14.dex */
public final class i1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.j1 f428287d;

    public i1(uj3.j1 j1Var) {
        this.f428287d = j1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        uj3.j1 j1Var = this.f428287d;
        int i17 = j1Var.f428299i;
        if (i17 > j1Var.f428295e) {
            j1Var.f428299i = i17 - 1;
            j1Var.a();
            return true;
        }
        uj3.b.a(j1Var.f428292b, uj3.a.f428205s, null, 2, null);
        return false;
    }
}
