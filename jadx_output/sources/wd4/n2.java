package wd4;

/* loaded from: classes.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog f444985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog snsGroupDialog) {
        super(0);
        this.f444985d = snsGroupDialog;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
        android.view.View view = this.f444985d.f281403i;
        android.widget.LinearLayout linearLayout = view != null ? (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.n8q) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
        return linearLayout;
    }
}
