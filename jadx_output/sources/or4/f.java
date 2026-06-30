package or4;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.h f347699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(or4.h hVar) {
        super(1);
        this.f347699d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.f485524py0);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.pxn);
        android.view.View findViewById = it.findViewById(com.tencent.mm.R.id.pxw);
        android.widget.TextView textView3 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.pxy);
        android.view.View findViewById2 = it.findViewById(com.tencent.mm.R.id.pxo);
        android.widget.TextView textView4 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.pxq);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(textView.getText());
        sb6.append(" ");
        if (textView2.getVisibility() == 0) {
            sb6.append(textView2.getText());
            sb6.append(" ");
        }
        int visibility = findViewById.getVisibility();
        or4.h hVar = this.f347699d;
        if (visibility == 0) {
            sb6.append(hVar.getContext().getString(com.tencent.mm.R.string.lhh));
            sb6.append(", ");
            sb6.append(hVar.getContext().getString(com.tencent.mm.R.string.lgl, hVar.getContext().getString(com.tencent.mm.R.string.lhb), textView3.getText()));
        }
        if (findViewById2.getVisibility() == 0) {
            sb6.append(hVar.getContext().getString(com.tencent.mm.R.string.lhf));
            sb6.append(", ");
            sb6.append(hVar.getContext().getString(com.tencent.mm.R.string.lgl, hVar.getContext().getString(com.tencent.mm.R.string.lhb), textView4.getText()));
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
