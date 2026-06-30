package fp3;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI f265307d;

    public h(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f265307d = mallOrderDetailInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f265307d.finish();
    }
}
