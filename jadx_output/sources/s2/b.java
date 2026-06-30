package s2;

/* loaded from: classes14.dex */
public final class b implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402196a;

    public b(s2.b0 b0Var) {
        this.f402196a = b0Var;
    }

    @Override // n0.a2
    public void dispose() {
        s2.b0 b0Var = this.f402196a;
        n0.f1 f1Var = b0Var.f10451f;
        if (f1Var != null) {
            f1Var.dispose();
        }
        b0Var.f10451f = null;
        b0Var.requestLayout();
        b0Var.setTag(com.tencent.mm.R.id.p28, null);
        b0Var.f402202s.removeViewImmediate(b0Var);
    }
}
