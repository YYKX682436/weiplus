package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class qa0 extends com.tencent.mm.ui.component.UIComponent implements zy2.vb {

    /* renamed from: d, reason: collision with root package name */
    public zg0.s2 f135679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        zg0.s2 s2Var = this.f135679d;
        if (s2Var != null) {
            android.app.Activity context = getContext();
            com.tencent.mm.plugin.webview.modeltools.n nVar = (com.tencent.mm.plugin.webview.modeltools.n) s2Var;
            if (nVar.f183327f == null && i17 == 201) {
                nVar.f(context, i17, i18, intent);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        zg0.s2 s2Var = this.f135679d;
        if (s2Var != null) {
            ((com.tencent.mm.plugin.webview.modeltools.n) s2Var).g(getContext(), i17, permissions, grantResults);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
