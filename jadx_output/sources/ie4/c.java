package ie4;

/* loaded from: classes.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f291005d;

    public c(yz5.a aVar) {
        this.f291005d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper$showMsgTipsKnowAlert$1");
        dialogInterface.dismiss();
        this.f291005d.invoke();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper$showMsgTipsKnowAlert$1");
    }
}
