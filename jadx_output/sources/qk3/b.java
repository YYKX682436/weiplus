package qk3;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk3.c f364437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qk3.c cVar) {
        super(1);
        this.f364437d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object parent = it.getParent().getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.String valueOf = java.lang.String.valueOf((view == null || (textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jvj)) == null) ? null : textView2.getText());
        java.lang.Object parent2 = it.getParent().getParent();
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        java.lang.String valueOf2 = java.lang.String.valueOf((view2 == null || (textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.jvl)) == null) ? null : textView.getText());
        java.lang.Object tag = it.getTag(com.tencent.mm.R.id.jxk);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        qk3.c cVar = this.f364437d;
        java.lang.String format = java.lang.String.format(cVar.getString(com.tencent.mm.R.string.h3f), java.util.Arrays.copyOf(new java.lang.Object[]{cVar.getString(com.tencent.mm.R.string.b9a), cVar.O6(intValue), valueOf2, valueOf}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
