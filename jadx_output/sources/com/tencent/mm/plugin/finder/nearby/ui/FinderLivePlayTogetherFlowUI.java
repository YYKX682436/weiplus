package com.tencent.mm.plugin.finder.nearby.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/FinderLivePlayTogetherFlowUI;", "Lcom/tencent/mm/plugin/finder/nearby/ui/FinderLiveSquareSpecialTempUI;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderLivePlayTogetherFlowUI extends com.tencent.mm.plugin.finder.nearby.ui.FinderLiveSquareSpecialTempUI {
    @Override // com.tencent.mm.plugin.finder.nearby.ui.FinderLiveSquareSpecialTempUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ds_;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.ui.FinderLiveSquareSpecialTempUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, fr2.q.class, fr2.p.class, sp2.x3.class});
    }

    @Override // com.tencent.mm.plugin.finder.nearby.ui.FinderLiveSquareSpecialTempUI, com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.vz2 vz2Var;
        java.lang.String str;
        android.widget.TextView textView;
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.md6);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/FinderLivePlayTogetherFlowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/FinderLivePlayTogetherFlowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dk2.of a17 = dk2.of.f233859j.a(getContext().getIntent());
        if (a17 != null && (vz2Var = a17.f233863c) != null && (str = vz2Var.f388690e) != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null && (textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fnn)) != null) {
                textView.setText(str);
            }
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482436ej);
        if (findViewById2 != null) {
            int h17 = com.tencent.mm.ui.bl.h(getContext());
            findViewById2.setPadding(0, h17, 0, 0);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = h17 + i65.a.b(getContext(), 48);
            }
            findViewById2.requestLayout();
        }
    }
}
