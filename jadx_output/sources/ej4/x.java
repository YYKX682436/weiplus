package ej4;

/* loaded from: classes11.dex */
public final class x extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.c f253389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String userName, com.tencent.mm.ui.base.NoMeasuredTextView iconTV, bi4.c iconScene) {
        super(iconTV, userName, null, 4, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(iconTV, "iconTV");
        kotlin.jvm.internal.o.g(iconScene, "iconScene");
        this.f253389d = iconScene;
        b();
    }

    @Override // ej4.r
    public void b() {
        java.lang.Object obj = a().get();
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = obj instanceof com.tencent.mm.ui.base.NoMeasuredTextView ? (com.tencent.mm.ui.base.NoMeasuredTextView) obj : null;
        if (noMeasuredTextView == null) {
            return;
        }
        java.lang.CharSequence O = bk4.i.a().O(noMeasuredTextView, this.f253374a, noMeasuredTextView.getText(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20), bi4.d.OUTLINED, this.f253389d);
        if (O == null || kotlin.jvm.internal.o.b(noMeasuredTextView.getText(), O)) {
            return;
        }
        nf.e.f(new ej4.w(noMeasuredTextView, this, O));
    }
}
