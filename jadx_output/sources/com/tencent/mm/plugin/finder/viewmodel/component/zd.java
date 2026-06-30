package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class zd extends com.tencent.mm.ui.component.UIComponent implements zy2.f7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 2 || intent == null) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4.f102714a.Z(intent);
        db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f490556yf), com.tencent.mm.R.raw.toast_ok);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
