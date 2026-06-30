package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.ga controller;
        int e17 = com.tencent.mm.ui.zk.e(getActivity(), com.tencent.mm.R.dimen.f479704cz);
        if (fp.h.c(23)) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity == null || (controller = mMActivity.getController()) == null) {
                return;
            }
            controller.Q0(com.tencent.mm.ui.uk.c(getActivity(), com.tencent.mm.R.raw.icons_outlined_arrow_down, getResources().getColor(com.tencent.mm.R.color.FG_0), getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_3), e17, 0.5f * e17));
        }
    }
}
