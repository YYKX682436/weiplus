package wd4;

/* loaded from: classes.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog f445047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog) {
        super(0);
        this.f445047d = snsGroupDialog;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
        android.view.View view = this.f445047d.f281403i;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
        return textView;
    }
}
