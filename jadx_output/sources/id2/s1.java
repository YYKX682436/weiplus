package id2;

/* loaded from: classes3.dex */
public final class s1 implements com.tencent.mm.ui.widget.picker.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290791a;

    public s1(id2.v1 v1Var) {
        this.f290791a = v1Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.y
    public final void a(int i17) {
        id2.v1 v1Var = this.f290791a;
        com.tencent.mars.xlog.Log.i(v1Var.f290834d, "[OnFirstOptionChange] " + ((java.lang.Number) v1Var.C.get(i17)).intValue());
        v1Var.W6((java.lang.Integer) v1Var.C.get(i17));
    }
}
