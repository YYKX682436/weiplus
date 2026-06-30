package un1;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1.l f429444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f429445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(un1.l lVar, qo1.f0 f0Var) {
        super(0);
        this.f429444d = lVar;
        this.f429445e = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.wechat.aff.affroam.p0 c17;
        un1.l lVar = this.f429444d;
        if (lVar.f402844i) {
            qo1.f0 f0Var = this.f429445e;
            com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
            java.lang.String b17 = (a2Var == null || (c17 = a2Var.c()) == null) ? "" : fo1.r.b(c17);
            if (f0Var instanceof qo1.c1) {
                android.widget.TextView textView = lVar.f429451n;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView.setText(textView.getContext().getString(com.tencent.mm.R.string.of9, b17));
            } else {
                android.widget.TextView textView2 = lVar.f429451n;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.of8, b17));
            }
        }
        return jz5.f0.f302826a;
    }
}
