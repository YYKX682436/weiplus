package fi2;

/* loaded from: classes10.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f262905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(fi2.x0 x0Var, java.lang.String str) {
        super(0);
        this.f262905d = x0Var;
        this.f262906e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fi2.x0 x0Var = this.f262905d;
        com.tencent.mars.xlog.Log.i(x0Var.f262802b, "updateVideoWidgetCover userId:" + this.f262906e);
        com.tencent.mm.view.ratio.RatioLayout ratioLayout = x0Var.f262929g;
        int childCount = ratioLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = ratioLayout.getChildAt(i17);
            if (childAt != null && (childAt instanceof wj2.c0)) {
                ((wj2.c0) childAt).i0();
            }
        }
        return jz5.f0.f302826a;
    }
}
