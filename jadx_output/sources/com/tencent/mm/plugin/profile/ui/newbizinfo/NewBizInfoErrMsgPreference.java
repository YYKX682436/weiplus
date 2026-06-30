package com.tencent.mm.plugin.profile.ui.newbizinfo;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoErrMsgPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NewBizInfoErrMsgPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.lang.String L;

    public NewBizInfoErrMsgPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = "";
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.t(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.akk);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById;
        mMNeat7extView.l(1, 16.0f);
        mMNeat7extView.setTextColor(mMNeat7extView.getResources().getColor(com.tencent.mm.R.color.f479220t8));
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        mMNeat7extView2.b(((ke0.e) xVar).nj(mMNeat7extView2.getContext(), this.L, (int) mMNeat7extView2.getTextSize()));
    }

    public NewBizInfoErrMsgPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
    }
}
