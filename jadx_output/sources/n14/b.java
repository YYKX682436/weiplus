package n14;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(1);
        this.f334143d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.widget.FontSelectorView fontSelectorView = it instanceof com.tencent.mm.plugin.setting.ui.widget.FontSelectorView ? (com.tencent.mm.plugin.setting.ui.widget.FontSelectorView) it : null;
        if (fontSelectorView == null) {
            return "";
        }
        java.lang.String format = java.lang.String.format(this.f334143d, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(fontSelectorView.getSliderIndex() + 1)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
