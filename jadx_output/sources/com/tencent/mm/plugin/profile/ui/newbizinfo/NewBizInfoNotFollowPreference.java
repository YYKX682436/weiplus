package com.tencent.mm.plugin.profile.ui.newbizinfo;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoNotFollowPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class NewBizInfoNotFollowPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public final java.lang.String M;

    public NewBizInfoNotFollowPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = "";
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        super.t(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.akf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.L = (android.widget.TextView) findViewById;
        java.lang.String str = this.M;
        if (!r26.n0.N(str)) {
            android.widget.TextView textView = this.L;
            if (textView != null) {
                textView.setText(str);
            } else {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
        }
    }

    public NewBizInfoNotFollowPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = "";
    }
}
