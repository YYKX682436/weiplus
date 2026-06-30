package ns4;

/* loaded from: classes.dex */
public final class n1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.p1 f339597a;

    public n1(ns4.p1 p1Var) {
        this.f339597a = p1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f339597a.f339616a;
        if (z2Var != null) {
            z2Var.B();
        } else {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
    }
}
