package jb2;

/* loaded from: classes2.dex */
public final class b extends h92.d {
    @Override // h92.d, h92.a
    public void g(android.content.Context context, android.widget.FrameLayout headerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        super.g(context, headerLayout);
        android.view.View view = this.f279690e;
        if (view == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.d4v);
        if (textView != null) {
            com.tencent.mm.ui.bk.q0(textView.getPaint());
        }
        android.view.View view2 = this.f279690e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("header");
            throw null;
        }
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.byz);
        if (findViewById != null) {
            n().k(findViewById);
            findViewById.setOnClickListener(new jb2.a(this));
        }
    }

    @Override // h92.d
    public int o() {
        return com.tencent.mm.R.layout.b5g;
    }
}
