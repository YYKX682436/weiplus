package mr3;

/* loaded from: classes.dex */
public final class w extends com.tencent.mm.ui.component.UIComponent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.app.Activity context = getContext();
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileChooseMsgFileListUIC", "onCreate: context is not MMActivity");
            return;
        }
        context.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, 0);
        ((com.tencent.mm.ui.MMActivity) context).updateBackBtn(context.getDrawable(com.tencent.mm.R.drawable.f480726b6));
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.uno);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/mod/desc_image/ProfileChooseMsgFileListUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/mod/desc_image/ProfileChooseMsgFileListUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        if (!(getContext() instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileChooseMsgFileListUIC", "onCreate: context is not MMActivity");
            return;
        }
        try {
            getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IntentUtil", e17, "", new java.lang.Object[0]);
        }
        try {
            getIntent().putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477877e1);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IntentUtil", e18, "", new java.lang.Object[0]);
        }
    }
}
