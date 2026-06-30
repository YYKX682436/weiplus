package k85;

/* loaded from: classes5.dex */
public final class s implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f305438c;

    public s(kotlin.jvm.internal.c0 c0Var, yz5.l lVar, kotlin.jvm.internal.c0 c0Var2) {
        this.f305436a = c0Var;
        this.f305437b = lVar;
        this.f305438c = c0Var2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        if (this.f305436a.f310112d) {
            return;
        }
        this.f305437b.invoke(java.lang.Boolean.valueOf(this.f305438c.f310112d));
    }
}
