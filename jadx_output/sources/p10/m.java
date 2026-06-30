package p10;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350969d;

    public m(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350969d = magicDebugPanelView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createToggleButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350969d;
        boolean z17 = !magicDebugPanelView.f65830w;
        magicDebugPanelView.f65830w = z17;
        if (z17) {
            android.widget.LinearLayout linearLayout = magicDebugPanelView.f65833z;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("expandedContentLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            android.widget.TextView textView = magicDebugPanelView.f65831x;
            if (textView == null) {
                kotlin.jvm.internal.o.o("toggleButton");
                throw null;
            }
            textView.setText("▼");
        } else {
            android.widget.LinearLayout linearLayout2 = magicDebugPanelView.f65833z;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("expandedContentLayout");
                throw null;
            }
            linearLayout2.setVisibility(8);
            android.widget.TextView textView2 = magicDebugPanelView.f65831x;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("toggleButton");
                throw null;
            }
            textView2.setText("▶");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "toggleExpanded: isExpanded=" + magicDebugPanelView.f65830w);
        magicDebugPanelView.post(new p10.w(magicDebugPanelView));
        yj0.a.h(this, "com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createToggleButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
