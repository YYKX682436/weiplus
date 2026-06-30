package ss1;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout f411903d;

    public i(com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout, int i17, ss1.e eVar) {
        this.f411903d = mPCollapseTextLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout$processContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout mPCollapseTextLayout = this.f411903d;
        if (mPCollapseTextLayout.f94586e) {
            mPCollapseTextLayout.a(mPCollapseTextLayout.f94588g);
            mPCollapseTextLayout.b(mPCollapseTextLayout.f94601w);
        } else {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = mPCollapseTextLayout.f94590i;
            if (mMNeat7extView != null) {
                mMNeat7extView.setMaxLines(Integer.MAX_VALUE);
            }
            android.widget.TextView textView = mPCollapseTextLayout.f94591m;
            if (textView != null) {
                textView.setMaxLines(Integer.MAX_VALUE);
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = mPCollapseTextLayout.f94590i;
            ks5.a i17 = mMNeat7extView2 != null ? mMNeat7extView2.i(mPCollapseTextLayout.f94601w, Integer.MAX_VALUE) : null;
            mPCollapseTextLayout.d(i17, mPCollapseTextLayout.f94601w, i17 != null ? ((com.tencent.neattextview.textview.layout.NeatLayout) i17).L : 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout$processContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
