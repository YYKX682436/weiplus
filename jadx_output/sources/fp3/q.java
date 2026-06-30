package fp3;

/* loaded from: classes9.dex */
public class q implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderRecordListUI f265327d;

    public q(com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI) {
        this.f265327d = mallOrderRecordListUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI = this.f265327d;
        if (i17 >= ((java.util.ArrayList) mallOrderRecordListUI.f152855g).size()) {
            return true;
        }
        db5.e1.e(mallOrderRecordListUI, mallOrderRecordListUI.getResources().getString(com.tencent.mm.R.string.kt9), null, mallOrderRecordListUI.getResources().getString(com.tencent.mm.R.string.f490367t0), new fp3.p(this, i17));
        return true;
    }
}
