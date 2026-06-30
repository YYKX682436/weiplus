package ox2;

/* loaded from: classes2.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f349693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349694f;

    public n0(android.view.View view, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        this.f349692d = view;
        this.f349693e = qeVar;
        this.f349694f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = ox2.p0.f349702a;
        android.view.View view = this.f349692d;
        view.getLocationInWindow(iArr);
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg a17 = ox2.p0.a(this.f349693e, this.f349694f);
        if (a17 != null) {
            a17.d(iArr[0] + ((int) ((view.getWidth() * view.getScaleX()) / 2.0f)), iArr[1] + ((int) ((view.getHeight() * view.getScaleY()) / 2.0f)));
        }
    }
}
