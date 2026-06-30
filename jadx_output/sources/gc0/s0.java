package gc0;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f270267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.content.Context context, java.lang.String str) {
        super(0);
        this.f270267d = context;
        this.f270268e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context n17 = com.tencent.mm.app.w.INSTANCE.n();
        int hashCode = n17 != null ? n17.hashCode() : 0;
        if (hashCode != gc0.y0.f270369e) {
            android.content.Context context = this.f270267d;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.n("不再显示");
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(this.f270268e);
            textView.setTextIsSelectable(true);
            textView.setGravity(8388611);
            u1Var.d(textView);
            u1Var.a(true);
            u1Var.b(gc0.r0.f270260a);
            u1Var.q(false);
        }
        gc0.y0.f270369e = hashCode;
        return jz5.f0.f302826a;
    }
}
