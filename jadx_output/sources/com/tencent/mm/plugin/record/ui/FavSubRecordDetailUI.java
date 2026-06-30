package com.tencent.mm.plugin.record.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/record/ui/FavSubRecordDetailUI;", "Lcom/tencent/mm/plugin/record/ui/RecordMsgBaseUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class FavSubRecordDetailUI extends com.tencent.mm.plugin.record.ui.RecordMsgBaseUI {

    /* renamed from: v, reason: collision with root package name */
    public r45.ul5 f155263v;

    /* renamed from: w, reason: collision with root package name */
    public o72.r2 f155264w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.l2 f155265x;

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public com.tencent.mm.plugin.record.ui.h0 a7() {
        return new com.tencent.mm.plugin.record.ui.f(this, new com.tencent.mm.plugin.record.ui.c(this));
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String b7() {
        java.util.LinkedList linkedList;
        r45.gp0 gp0Var;
        r45.ul5 ul5Var = this.f155263v;
        java.lang.String str = (ul5Var == null || (linkedList = ul5Var.f387465f) == null || (gp0Var = (r45.gp0) kz5.n0.k0(linkedList)) == null) ? null : gp0Var.M1;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String c7() {
        java.util.LinkedList linkedList;
        r45.gp0 gp0Var;
        r45.ul5 ul5Var = this.f155263v;
        java.lang.String str = (ul5Var == null || (linkedList = ul5Var.f387465f) == null || (gp0Var = (r45.gp0) kz5.n0.Z(linkedList)) == null) ? null : gp0Var.M1;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String d7() {
        r45.ul5 ul5Var = this.f155263v;
        java.lang.String str = ul5Var != null ? ul5Var.f387463d : null;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void e7() {
        o72.r2 a17 = bt3.z0.a(getIntent().getLongExtra("key_detail_info_id", -1L));
        this.f155264w = a17;
        if (a17 == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("record_xml");
        if (stringExtra == null) {
            stringExtra = "";
        }
        r45.ul5 c17 = com.tencent.mm.pluginsdk.model.x1.c(stringExtra);
        this.f155263v = c17;
        if (c17 == null) {
            finish();
            return;
        }
        com.tencent.mm.plugin.record.ui.b bVar = new com.tencent.mm.plugin.record.ui.b();
        bVar.f155350c = this.f155264w;
        bVar.f155342a = c17 != null ? c17.f387465f : null;
        bVar.f155343b = new bt3.g3();
        java.util.List list = bVar.f155342a;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && ((r45.gp0) it.next()).X1 == 0) {
            }
        }
        super.e7();
        this.f155267n.h(bVar);
        com.tencent.mm.plugin.record.ui.l2 l2Var = new com.tencent.mm.plugin.record.ui.l2(this, this.f155267n, bVar);
        this.f155265x = l2Var;
        this.f155267n.f155410s = l2Var;
        o72.y3 fj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj();
        com.tencent.mm.plugin.record.ui.h0 h0Var = this.f155267n;
        kotlin.jvm.internal.o.e(h0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.record.ui.FavRecordAdapter");
        fj6.Ia(((com.tencent.mm.plugin.record.ui.f) h0Var).f155386x);
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void f7(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void h7() {
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.record.ui.l2 l2Var = this.f155265x;
        if (l2Var != null) {
            l2Var.e();
        }
        com.tencent.mm.plugin.record.ui.h0 h0Var = this.f155267n;
        if (h0Var != null) {
            h0Var.a();
        }
        super.onDestroy();
    }
}
