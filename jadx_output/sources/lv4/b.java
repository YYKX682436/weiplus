package lv4;

/* loaded from: classes12.dex */
public class b implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.d f321512a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.y f321513b;

    /* renamed from: c, reason: collision with root package name */
    public final rv4.w f321514c;

    /* renamed from: d, reason: collision with root package name */
    public final jv4.m f321515d;

    public b(mv4.d data, rv4.y delegate, rv4.w session) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(session, "session");
        this.f321512a = data;
        this.f321513b = delegate;
        this.f321514c = session;
        this.f321515d = jv4.m.f302244g;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        lv4.o oVar = holder instanceof lv4.o ? (lv4.o) holder : null;
        if (oVar == null) {
            return;
        }
        qv4.e eVar = (qv4.e) oVar;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) eVar.f366966f).getValue();
        mv4.d dVar = this.f321512a;
        if (textView != null) {
            textView.setText(dVar.getTitle());
        }
        dVar.f(dVar.a());
        android.view.View view = ((qv4.e) ((lv4.o) holder)).f366964d;
        dVar.b(view.getMeasuredHeight());
        com.tencent.mm.ui.kk.f(view, dVar.getMarginTop());
        android.view.View view2 = (android.view.View) ((jz5.n) eVar.f366965e).getValue();
        if (view2 != null) {
            view2.setOnClickListener(new lv4.a(this));
        }
        jv4.i iVar = this.f321514c.f400557c;
        if (iVar != null) {
            ((jv4.e) ((jv4.p) iVar).f302262e).f302235a.g();
        }
    }

    @Override // jv4.n
    public jv4.m getType() {
        return this.f321515d;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "box-title-" + this.f321512a.getTitle();
    }

    @Override // nv4.g
    public void w() {
    }
}
