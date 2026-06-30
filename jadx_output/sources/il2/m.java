package il2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.p5 f292072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.r f292073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mm2.p5 p5Var, il2.r rVar) {
        super(3);
        this.f292072d = p5Var;
        this.f292073e = rVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String verifyId = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(verifyId, "verifyId");
        kotlin.jvm.internal.o.g(url, "url");
        il2.r rVar = this.f292073e;
        mm2.p5 p5Var = this.f292072d;
        if (booleanValue) {
            p5Var.getClass();
            p5Var.f329351c = verifyId;
            p5Var.f329352d = url;
            kl2.q qVar = (kl2.q) ((jz5.n) rVar.f292084r).getValue();
            java.lang.String id6 = p5Var.f329351c;
            java.lang.String url2 = p5Var.f329352d;
            r45.f82 f82Var = ((mm2.v5) rVar.P0(mm2.v5.class)).f329486i;
            if (f82Var == null || (str = f82Var.getString(5)) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            qVar.getClass();
            kotlin.jvm.internal.o.g(id6, "id");
            kotlin.jvm.internal.o.g(url2, "url");
            long j17 = p5Var.f329350b;
            qVar.f308807n = j17;
            qVar.f308808o = id6;
            qVar.f308809p = url2;
            qVar.w();
            il2.s.f292086a.b(zl2.e5.f473748r, j17);
            android.widget.TextView textView = qVar.f308805i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleText");
                throw null;
            }
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
            android.widget.TextView textView2 = qVar.f308805i;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("titleText");
                throw null;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = qVar.f118381d;
            android.widget.TextView textView3 = qVar.f308805i;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleText");
                throw null;
            }
            textView2.setText(((ke0.e) xVar).hj(context, str2, (int) textView3.getTextSize(), 1, null));
        } else {
            zl2.j5.f473850a.e(p5Var.f329350b);
            ((mm2.v5) rVar.P0(mm2.v5.class)).f329488n.postValue(mm2.q5.f329367a);
        }
        return jz5.f0.f302826a;
    }
}
