package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class FavRecordDetailUI extends com.tencent.mm.plugin.record.ui.RecordMsgBaseUI {
    public static final /* synthetic */ int C = 0;
    public com.tencent.mm.plugin.record.ui.l2 A;

    /* renamed from: x, reason: collision with root package name */
    public o72.r2 f155260x;

    /* renamed from: v, reason: collision with root package name */
    public long f155258v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f155259w = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f155261y = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f155262z = false;
    public final l75.q0 B = new com.tencent.mm.plugin.record.ui.h(this);

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public com.tencent.mm.plugin.record.ui.h0 a7() {
        return new com.tencent.mm.plugin.record.ui.f(this, new com.tencent.mm.plugin.record.ui.c(this));
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String b7() {
        java.util.LinkedList linkedList = this.f155260x.field_favProto.f370964f;
        if (linkedList.size() > 0) {
            return ((r45.gp0) linkedList.getLast()).M1;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String c7() {
        java.util.LinkedList linkedList = this.f155260x.field_favProto.f370964f;
        if (linkedList.size() > 0) {
            return ((r45.gp0) linkedList.getFirst()).M1;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String d7() {
        o72.r2 r2Var = this.f155260x;
        if (14 == r2Var.field_type && !com.tencent.mm.sdk.platformtools.t8.K0(r2Var.field_favProto.f370972q)) {
            return this.f155260x.field_favProto.f370972q;
        }
        r45.jq0 jq0Var = this.f155260x.field_favProto.f370962d;
        if (jq0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(jq0Var.f378042o)) {
            return bt3.g2.v(this.f155260x.field_fromUser);
        }
        java.lang.String e17 = c01.a2.e(jq0Var.f378042o);
        if (c01.z1.r().equals(jq0Var.f378036f)) {
            java.lang.String v17 = bt3.g2.v(jq0Var.f378038h);
            if (!(v17 != null ? v17 : "").equals(jq0Var.f378038h)) {
                e17 = e17 + " - " + v17;
            }
        } else {
            java.lang.String v18 = bt3.g2.v(jq0Var.f378036f);
            if (!(v18 != null ? v18 : "").equals(jq0Var.f378036f)) {
                return e17 + " - " + v18;
            }
        }
        return e17;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void e7() {
        this.f155258v = getIntent().getLongExtra("key_detail_info_id", -1L);
        this.f155259w = getIntent().getBooleanExtra("show_share", true);
        o72.r2 a17 = bt3.z0.a(this.f155258v);
        this.f155260x = a17;
        if (a17 == null) {
            k82.c.f304887a.e(this.f155258v, 3);
            finish();
            return;
        }
        Y6(a17);
        com.tencent.mm.plugin.record.ui.b bVar = new com.tencent.mm.plugin.record.ui.b();
        o72.r2 r2Var = this.f155260x;
        bVar.f155350c = r2Var;
        bVar.f155342a = r2Var.field_favProto.f370964f;
        bVar.f155343b = new bt3.g3();
        java.util.List list = bVar.f155342a;
        if (list != null) {
            if (list.size() != 0) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        this.f155261y = true;
                        break;
                    } else if (((r45.gp0) it.next()).X1 != 0) {
                        this.f155261y = false;
                        break;
                    }
                }
            } else {
                this.f155261y = false;
            }
        } else {
            this.f155261y = false;
        }
        super.e7();
        this.f155267n.h(bVar);
        this.A = new com.tencent.mm.plugin.record.ui.l2(this, this.f155267n, bVar);
        java.util.List list2 = bVar.f155342a;
        if (list2 != null) {
            s75.d.b(new com.tencent.mm.plugin.record.ui.p(this, list2), "calc_fav_record_info");
        }
        this.f155267n.f155410s = this.A;
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this.B);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(((com.tencent.mm.plugin.record.ui.f) this.f155267n).f155386x);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.record.ui.i(this));
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void f7(int i17, int i18, android.content.Intent intent) {
        if (4097 == i17 && -1 == i18) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 32;
            z9Var.f8532e = this.f155258v;
            favoriteOperationEvent.e();
            if (favoriteOperationEvent.f54244h.f6142i) {
                db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f489705e));
                return;
            }
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent2 = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var2 = favoriteOperationEvent2.f54243g;
            z9Var2.f8528a = 13;
            z9Var2.f8535h = getContext();
            z9Var2.f8538k = stringExtra;
            z9Var2.f8539l = stringExtra2;
            z9Var2.f8532e = this.f155258v;
            z9Var2.f8537j = new com.tencent.mm.plugin.record.ui.o(this, Q);
            favoriteOperationEvent2.e();
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void h7() {
        if (this.f155259w) {
            addIconOptionMenu(0, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.record.ui.n(this));
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(this.B);
        if (this.f155267n != null) {
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(((com.tencent.mm.plugin.record.ui.f) this.f155267n).f155386x);
        }
        this.f155262z = true;
        com.tencent.mm.plugin.record.ui.l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.e();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.record.ui.l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.f155445d = false;
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        o72.r2 a17;
        r45.bq0 bq0Var;
        boolean z17;
        super.onResume();
        com.tencent.mm.plugin.record.ui.b bVar = (com.tencent.mm.plugin.record.ui.b) ((com.tencent.mm.plugin.record.ui.f) this.f155267n).f155408q;
        o72.r2 r2Var = bVar.f155350c;
        if (r2Var == null || (a17 = bt3.z0.a(r2Var.field_localId)) == null || (bq0Var = a17.field_favProto) == null) {
            return;
        }
        java.util.LinkedList linkedList = bq0Var.f370964f;
        java.util.Iterator it = bVar.f155342a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (!linkedList.contains((r45.gp0) it.next())) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            com.tencent.mm.plugin.record.ui.b bVar2 = new com.tencent.mm.plugin.record.ui.b();
            bVar2.f155350c = a17;
            bVar2.f155342a = a17.field_favProto.f370964f;
            this.f155267n.h(bVar2);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
