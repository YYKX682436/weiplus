package com.tencent.mm.plugin.w1wpersonalmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvFragment;", "Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgBaseConvFragment;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class W1wPersonalMsgConvFragment extends com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment {
    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.view.View view = this.f206301h;
        if (view != null) {
            view.post(new lr4.q(this));
        }
    }
}
