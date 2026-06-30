package n14;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n14.d f334145d = new n14.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.widget.FontSelectorView fontSelectorView = it instanceof com.tencent.mm.plugin.setting.ui.widget.FontSelectorView ? (com.tencent.mm.plugin.setting.ui.widget.FontSelectorView) it : null;
        if (fontSelectorView != null) {
            fontSelectorView.setSliderIndex(fontSelectorView.getSliderIndex() + 1);
            fontSelectorView.requestLayout();
            it.announceForAccessibility(java.lang.String.valueOf(fontSelectorView.getSliderIndex() + 1));
        }
        return jz5.f0.f302826a;
    }
}
