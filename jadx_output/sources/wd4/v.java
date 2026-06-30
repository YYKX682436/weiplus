package wd4;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f445042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.view.View view) {
        super(0);
        this.f445042d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
        android.widget.TextView textView = (android.widget.TextView) this.f445042d.findViewById(com.tencent.mm.R.id.hhv);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$userTextView$2");
        return textView;
    }
}
