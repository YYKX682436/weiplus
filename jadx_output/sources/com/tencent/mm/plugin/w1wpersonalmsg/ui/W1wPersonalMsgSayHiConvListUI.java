package com.tencent.mm.plugin.w1wpersonalmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgSayHiConvListUI;", "Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgBaseConvListUI;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class W1wPersonalMsgSayHiConvListUI extends com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI {
    @Override // com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI
    public java.lang.String U6() {
        java.lang.String string = getString(com.tencent.mm.R.string.pgu);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI
    public com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment V6() {
        return new com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment();
    }

    @Override // com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
        ((fr4.g0) fVar).f265831r = true;
        if (((fr4.g0) fVar).f265826m) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new lr4.t(this, "more:more"));
            T6().K0(vu4.d.f440292e, mr4.a.a("more:more"), "", "");
        }
    }

    @Override // com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvListUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f265831r = false;
    }
}
