package ls4;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321073a;

    public k(ls4.u uVar) {
        this.f321073a = uVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        ns4.c0 c0Var = this.f321073a.f321102c;
        if (c0Var != null) {
            c0Var.f339464c.s();
        } else {
            kotlin.jvm.internal.o.o("consumePanel");
            throw null;
        }
    }
}
