package we5;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.z0[] f445328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.pluginsdk.ui.span.z0[] z0VarArr, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(1);
        this.f445328d = z0VarArr;
        this.f445329e = h0Var;
        this.f445330f = h0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.ArrayList arrayList = it.f203389l;
        arrayList.clear();
        com.tencent.mm.pluginsdk.ui.span.z0[] textSpans = this.f445328d;
        kotlin.jvm.internal.o.f(textSpans, "$textSpans");
        for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : textSpans) {
            kotlin.jvm.internal.h0 h0Var = this.f445329e;
            int[] iArr = {((android.text.SpannableString) h0Var.f310123d).getSpanStart(z0Var), ((android.text.SpannableString) h0Var.f310123d).getSpanEnd(z0Var), com.tencent.mm.ui.chatting.viewitems.a0.y(z0Var)};
            if (iArr[1] - iArr[0] < ((java.lang.String) this.f445330f.f310123d).length()) {
                arrayList.add(iArr);
            }
        }
        return jz5.f0.f302826a;
    }
}
