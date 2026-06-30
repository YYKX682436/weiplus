package fp3;

/* loaded from: classes9.dex */
public class r implements db5.f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderRecordListUI f265328a;

    public r(com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI) {
        this.f265328a = mallOrderRecordListUI;
    }

    @Override // db5.f4
    public void onLoadMore() {
        com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI = this.f265328a;
        if (mallOrderRecordListUI.f152861p) {
            return;
        }
        mallOrderRecordListUI.f152861p = true;
        mallOrderRecordListUI.f152858m += 10;
        mallOrderRecordListUI.W6();
    }
}
