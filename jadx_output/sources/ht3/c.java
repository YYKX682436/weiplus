package ht3;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.g f284946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ht3.g gVar) {
        super(1);
        this.f284946d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.f487129nm1);
        java.lang.CharSequence text = textView != null ? textView.getText() : null;
        if (text == null) {
            text = "";
        }
        java.lang.Object tag = it.getTag(com.tencent.mm.R.id.e7_);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ht3.g gVar = this.f284946d;
        if (booleanValue) {
            java.lang.String string = gVar.getContext().getString(com.tencent.mm.R.string.f3i, text);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = gVar.getContext().getString(com.tencent.mm.R.string.f9a, text);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }
}
