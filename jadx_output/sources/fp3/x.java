package fp3;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI f265342d;

    public x(com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI mallOrderTransactionInfoUI) {
        this.f265342d = mallOrderTransactionInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f265342d.finish();
    }
}
