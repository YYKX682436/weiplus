package mr3;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f330853a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f330854b;

    /* renamed from: c, reason: collision with root package name */
    public final lo.j f330855c;

    /* renamed from: d, reason: collision with root package name */
    public final int f330856d;

    public d(java.lang.String str, boolean z17, lo.j onGetChatImage) {
        kotlin.jvm.internal.o.g(onGetChatImage, "onGetChatImage");
        this.f330853a = str;
        this.f330854b = z17;
        this.f330855c = onGetChatImage;
        this.f330856d = 9;
    }

    public final void a(android.app.Activity context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (i17 >= this.f330856d) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, true);
        k0Var.f211872n = new mr3.b(context, this);
        k0Var.f211881s = new mr3.c(this, context, i17);
        k0Var.v();
    }
}
