package g13;

/* loaded from: classes10.dex */
public final class f extends g13.b {
    @Override // g13.b
    public int n() {
        return com.tencent.mm.R.layout.bb_;
    }

    @Override // g13.b
    public void o(in5.s0 holder, i13.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.o item = (i13.o) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        boolean z18 = k13.l1.I.a().f303213g;
        android.content.Context context = holder.f293121e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479147rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gcj);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479146r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.gcj);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479145r8));
            }
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        int i19 = 0;
        java.lang.String str = item.f287305o;
        if (str == null || str.length() == 0) {
            textView5.setText(textView5.getResources().getString(com.tencent.mm.R.string.fer, item.f287301h));
        } else {
            textView5.setText(str);
        }
        android.widget.TextView textView6 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.gcj);
        java.lang.String str2 = item.f287307q;
        if (str2 == null || str2.length() == 0) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = textView6.getContext();
            float textSize = textView6.getTextSize();
            ((ke0.e) xVar).getClass();
            textView6.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize));
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "finder_live_msg_notify");
        dy1.r ik6 = aVar.ik(holder.itemView, 40, 26236);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[12];
        lVarArr[0] = new jz5.l("feed_id", item.f287302i);
        lVarArr[1] = new jz5.l("live_id", item.f287303m);
        lVarArr[2] = new jz5.l("comment_scene", "temp_7");
        java.lang.String str3 = item.f287308r;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[3] = new jz5.l("finder_username", str3);
        lVarArr[4] = new jz5.l("session_buffer", "");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[5] = new jz5.l("behaviour_session_id", Ri);
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[6] = new jz5.l("finder_tab_context_id", c17);
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[7] = new jz5.l("finder_context_id", b17);
        lVarArr[8] = new jz5.l("live_enter_status", 1);
        lVarArr[9] = new jz5.l("share_username", "");
        lVarArr[10] = new jz5.l("share_username", "");
        java.lang.String str4 = item.f287309s;
        if (str4 != null) {
            if (str4.length() == 0) {
                i19 = 1;
            }
        }
        lVarArr[11] = new jz5.l("live_notice_type", java.lang.Integer.valueOf(i19));
        ((cy1.a) ik6).gk(view, kz5.c1.k(lVarArr));
    }

    @Override // g13.b
    public void p(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
