package gc4;

/* loaded from: classes4.dex */
public final class j implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public static final gc4.j f270458d = new gc4.j();

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager$showSnsGroupDialog$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager$showSnsGroupDialog$1");
    }
}
