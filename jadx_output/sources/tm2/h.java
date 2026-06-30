package tm2;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f420515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420516e;

    public h(android.view.View view, tm2.s2 s2Var) {
        this.f420515d = view;
        this.f420516e = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        this.f420515d.getLocationOnScreen(iArr);
        tm2.s2 s2Var = this.f420516e;
        com.tencent.mm.plugin.finder.live.plugin.sw swVar = s2Var.F;
        if (swVar != null) {
            swVar.t1(iArr[1]);
        }
        com.tencent.mm.plugin.finder.live.plugin.sw swVar2 = s2Var.G;
        if (swVar2 != null) {
            swVar2.t1(iArr[1]);
        }
    }
}
