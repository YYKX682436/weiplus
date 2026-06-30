package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileErrorFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileErrorFragment extends com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154420p;

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.a17, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.amq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = mMNeat7extView.getContext();
        java.lang.String str = this.f154420p;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
            throw null;
        }
        mMNeat7extView.b(((ke0.e) xVar).nj(context, str, (int) mMNeat7extView.getTextSize()));
        return inflate;
    }
}
