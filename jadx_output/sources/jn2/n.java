package jn2;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.w f300651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jn2.w wVar) {
        super(1);
        this.f300651d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        r45.hy1 smartBoxItem = (r45.hy1) obj;
        kotlin.jvm.internal.o.g(smartBoxItem, "smartBoxItem");
        jn2.w wVar = this.f300651d;
        wVar.getClass();
        wVar.f300738y = true;
        android.widget.EditText editText = wVar.f300725i;
        if (editText != null) {
            editText.setText(smartBoxItem.f376553f);
        }
        jn2.w.c(wVar);
        te2.a9.f417883a.a(wVar.f300722f.h7(), 3, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        y0Var = wVar.f300721e;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new jn2.m(wVar, smartBoxItem, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
