package rv3;

/* loaded from: classes5.dex */
public final class t extends rv3.s {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f400414o;

    /* renamed from: p, reason: collision with root package name */
    public final int f400415p;

    public t(yz5.p pVar, yz5.a aVar) {
        super(pVar);
        this.f400414o = aVar;
        this.f400415p = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.ace);
    }

    @Override // rv3.e
    public void p(android.widget.TextView textView, java.util.ArrayList singers) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(singers, "singers");
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(singers, ",");
        yz5.a aVar = this.f400414o;
        java.lang.String str = aVar != null ? (java.lang.String) aVar.invoke() : null;
        wu3.w1 w1Var = com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView.f156056o;
        kotlin.jvm.internal.o.d(c17);
        textView.setText(w1Var.a(c17, str, this.f400415p));
    }

    @Override // rv3.e
    public void u(android.widget.TextView textView, java.lang.String str) {
        kotlin.jvm.internal.o.g(textView, "textView");
        if (str == null) {
            str = "";
        }
        yz5.a aVar = this.f400414o;
        textView.setText(com.tencent.mm.plugin.recordvideo.ui.editor.MusicLrcView.f156056o.a(str, aVar != null ? (java.lang.String) aVar.invoke() : null, this.f400415p));
    }
}
