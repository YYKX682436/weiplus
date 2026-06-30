package e23;

/* loaded from: classes12.dex */
public class c1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public int f246796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.e1 f246797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e23.e1 e1Var, int i17) {
        super(e1Var);
        this.f246797c = e1Var;
        this.f246796b = i17;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.view.View inflate;
        int i17;
        e23.e1 e1Var = (e23.e1) gVar;
        e23.d1 d1Var = (e23.d1) eVar;
        if (this.f246796b == 3) {
            d1Var.f246817a.setVisibility(8);
            android.view.View view = d1Var.f246821e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d1Var.f246823g.setVisibility(0);
            com.tencent.mm.plugin.fts.ui.n3.a(e1Var.f246835v, d1Var.f246823g);
        } else {
            d1Var.f246817a.setVisibility(0);
            android.view.View view2 = d1Var.f246821e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyContentViewItem", "fillingHeaderAndTitle", "(Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem$FTSServiceNotifyMsgContentViewHolder;Lcom/tencent/mm/plugin/fts/ui/item/FTSServiceNotifyMsgContentDataItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d1Var.f246823g.setVisibility(8);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(d1Var.f246818b, e1Var.f246832s);
            com.tencent.mm.plugin.fts.ui.n3.a(e1Var.f246833t, d1Var.f246819c);
            com.tencent.mm.plugin.fts.ui.n3.a(e1Var.f246835v, d1Var.f246820d);
        }
        android.widget.TextView textView = d1Var.f246822f;
        java.lang.CharSequence charSequence = e1Var.f246834u;
        e23.e1 e1Var2 = this.f246797c;
        p13.i b17 = p13.i.b(charSequence, e1Var2.f423762e);
        b17.f351100h = textView.getPaint();
        com.tencent.mm.plugin.fts.ui.n3.a(o13.q.e(b17).f351105a, d1Var.f246822f);
        java.lang.String i18 = e1Var.i();
        java.util.List list = e1Var.f246836w;
        if (list == null || ((java.util.ArrayList) list).isEmpty() || com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
            d1Var.f246824h.removeAllViews();
            d1Var.f246824h.setVisibility(8);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) e1Var.f246836w).iterator();
        int i19 = 0;
        while (it.hasNext()) {
            java.lang.String str = ((tt0.b) it.next()).f421784a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                i17 = 0;
            } else {
                int i27 = 0;
                i17 = 0;
                while (i27 < str.length()) {
                    int i28 = i27 + 1;
                    i17 = str.substring(i27, i28).matches("[Α-￥]") ? i17 + 2 : i17 + 1;
                    i27 = i28;
                }
            }
            i19 = java.lang.Math.max((i17 + 1) / 2, i19);
        }
        int min = java.lang.Math.min(i19, 8);
        java.util.Iterator it6 = ((java.util.ArrayList) e1Var.f246836w).iterator();
        int i29 = 0;
        while (it6.hasNext()) {
            tt0.b bVar = (tt0.b) it6.next();
            java.lang.String str2 = bVar.f421785b;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.toLowerCase().contains((i18 != null ? i18 : "").toLowerCase())) {
                if (i29 < d1Var.f246824h.getChildCount()) {
                    inflate = d1Var.f246824h.getChildAt(i29);
                } else {
                    inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489124aw4, (android.view.ViewGroup) null);
                    d1Var.f246824h.addView(inflate);
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i29);
                android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.i2i);
                textView2.setText(bVar.f421784a);
                textView2.setEms(min);
                p13.i b18 = p13.i.b(bVar.f421785b, e1Var2.f423762e);
                b18.f351100h = textView3.getPaint();
                textView3.setText(o13.q.e(b18).f351105a);
                i29++;
            }
        }
        if (i29 < d1Var.f246824h.getChildCount()) {
            android.widget.LinearLayout linearLayout = d1Var.f246824h;
            linearLayout.removeViews(i29, linearLayout.getChildCount() - i29);
        }
        d1Var.f246824h.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489123bd2, viewGroup, false);
        e23.d1 d1Var = this.f246797c.f246838y;
        d1Var.f246817a = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hhp);
        d1Var.f246818b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        d1Var.f246819c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        d1Var.f246820d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gxw);
        d1Var.f246821e = inflate.findViewById(com.tencent.mm.R.id.hho);
        d1Var.f246822f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        d1Var.f246823g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hjp);
        d1Var.f246824h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i2b);
        inflate.setTag(d1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.e1 e1Var = (e23.e1) gVar;
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent.putExtra("Chat_User", "notifymessage");
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_service_notify_content_search", true);
        intent.putExtra("need_hight_item", true);
        intent.putExtra("chat_from_scene", 6);
        intent.putExtra("msg_local_id", e1Var.f246831r);
        if (this.f246796b == 3) {
            intent.putExtra("key_notify_message_real_username", e1Var.f246832s);
        }
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        return true;
    }
}
