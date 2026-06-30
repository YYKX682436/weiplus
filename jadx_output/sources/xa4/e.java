package xa4;

/* loaded from: classes2.dex */
public final class e implements db5.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452827a;

    public e(android.content.Context context) {
        this.f452827a = context;
    }

    @Override // db5.u4
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemViewCustomize", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemViewCustomize", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1");
            return;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        textView.post(new xa4.d(this.f452827a, textView, (android.widget.TextView) findViewById2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemViewCustomize", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1");
    }
}
