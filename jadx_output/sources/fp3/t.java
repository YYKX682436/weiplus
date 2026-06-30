package fp3;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderRecordListUI f265331d;

    public t(com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI) {
        this.f265331d = mallOrderRecordListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI = this.f265331d;
        if (!mallOrderRecordListUI.f152856h) {
            mallOrderRecordListUI.f152853e.b();
        } else if (!mallOrderRecordListUI.f152860o) {
            mallOrderRecordListUI.f152853e.g();
            mallOrderRecordListUI.f152853e.setAdapter((android.widget.ListAdapter) mallOrderRecordListUI.f152854f);
            mallOrderRecordListUI.f152860o = true;
        }
        mallOrderRecordListUI.f152854f.notifyDataSetChanged();
    }
}
