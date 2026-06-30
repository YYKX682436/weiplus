package fp3;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderRecordListUI f265332d;

    public u(com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI) {
        this.f265332d = mallOrderRecordListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f265332d.f152854f.notifyDataSetChanged();
    }
}
