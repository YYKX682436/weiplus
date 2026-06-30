package e23;

/* loaded from: classes12.dex */
public class v1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.x1 f246973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(e23.x1 x1Var, int i17) {
        super(x1Var);
        this.f246973b = x1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.view.View inflate;
        int i17;
        e23.x1 x1Var = (e23.x1) gVar;
        e23.w1 w1Var = (e23.w1) eVar;
        e23.x1 x1Var2 = this.f246973b;
        h45.v vVar = x1Var2.f246991t;
        if (vVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSWXPayNotifyMsgContentDataItem", "template is not init");
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(vVar.f278957d)) {
                w1Var.f246976a.setVisibility(8);
            } else {
                w1Var.f246976a.setVisibility(0);
                w1Var.f246977b.setUrl(x1Var2.f246991t.f278961h);
                com.tencent.mm.plugin.fts.ui.n3.a(e(w1Var.f246978c, x1Var2.f246991t.f278957d, x1Var2.f423762e), w1Var.f246978c);
                com.tencent.mm.plugin.fts.ui.n3.a(x1Var.f246990s, w1Var.f246979d);
            }
            h45.v vVar2 = x1Var2.f246991t;
            if (vVar2.f278960g || com.tencent.mm.sdk.platformtools.t8.K0(vVar2.f278958e)) {
                w1Var.f246980e.setVisibility(8);
            } else {
                w1Var.f246980e.setVisibility(0);
                com.tencent.mm.plugin.fts.ui.n3.a(e(w1Var.f246981f, x1Var2.f246991t.f278958e, x1Var2.f423762e), w1Var.f246981f);
                java.lang.String str = x1Var2.f246991t.f278959f;
                if (str == null) {
                    str = "";
                }
                java.lang.String lowerCase = str.toLowerCase();
                java.lang.String i18 = x1Var.i();
                if (i18 == null) {
                    i18 = "";
                }
                boolean contains = lowerCase.contains(i18.toLowerCase());
                if (com.tencent.mm.sdk.platformtools.t8.K0(x1Var2.f246991t.f278959f) || !contains) {
                    w1Var.f246982g.setVisibility(8);
                } else {
                    w1Var.f246982g.setVisibility(0);
                    com.tencent.mm.plugin.fts.ui.n3.a(e(w1Var.f246982g, x1Var2.f246991t.f278959f, x1Var2.f423762e), w1Var.f246982g);
                }
            }
        }
        java.lang.String i19 = x1Var.i();
        java.util.List list = x1Var2.f246991t.f278965l;
        if (list == null || ((java.util.ArrayList) list).isEmpty() || com.tencent.mm.sdk.platformtools.t8.K0(i19)) {
            w1Var.f246983h.removeAllViews();
            w1Var.f246983h.setVisibility(8);
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) x1Var2.f246991t.f278965l).iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.String str2 = ((h45.u) it.next()).f278951a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                i17 = 0;
            } else {
                int i28 = 0;
                i17 = 0;
                while (i28 < str2.length()) {
                    int i29 = i28 + 1;
                    i17 = str2.substring(i28, i29).matches("[Α-￥]") ? i17 + 2 : i17 + 1;
                    i28 = i29;
                }
            }
            i27 = java.lang.Math.max((i17 + 1) / 2, i27);
        }
        int min = java.lang.Math.min(i27, 8);
        java.util.Iterator it6 = ((java.util.ArrayList) x1Var2.f246991t.f278965l).iterator();
        int i37 = 0;
        while (it6.hasNext()) {
            h45.u uVar = (h45.u) it6.next();
            boolean z17 = uVar.f278953c;
            java.lang.String str3 = uVar.f278952b;
            if (str3 == null) {
                str3 = "";
            }
            boolean contains2 = str3.toLowerCase().contains((i19 == null ? "" : i19).toLowerCase());
            if (z17 || contains2) {
                if (i37 < w1Var.f246983h.getChildCount()) {
                    inflate = w1Var.f246983h.getChildAt(i37);
                } else {
                    inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dfa, (android.view.ViewGroup) null);
                    w1Var.f246983h.addView(inflate);
                }
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.q86);
                textView.setText(e(textView, uVar.f278951a + "：" + uVar.f278952b, x1Var2.f423762e));
                textView.setEms(min);
                i37++;
            }
        }
        if (i37 < w1Var.f246983h.getChildCount()) {
            android.widget.LinearLayout linearLayout = w1Var.f246983h;
            linearLayout.removeViews(i37, linearLayout.getChildCount() - i37);
        }
        w1Var.f246983h.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.df_, viewGroup, false);
        e23.w1 w1Var = this.f246973b.f246993v;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.q7m);
        float b17 = i65.a.b(context, 8);
        if (linearLayout != null) {
            linearLayout.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout != null) {
            linearLayout.setClipToOutline(true);
        }
        w1Var.f246976a = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hhp);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        w1Var.f246977b = cdnImageView;
        float b18 = i65.a.b(context, 20);
        if (cdnImageView != null) {
            cdnImageView.setOutlineProvider(new zl5.a(true, true, b18));
        }
        if (cdnImageView != null) {
            cdnImageView.setClipToOutline(true);
        }
        w1Var.f246978c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        w1Var.f246979d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gxw);
        w1Var.f246980e = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.hjo);
        w1Var.f246981f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        w1Var.f246982g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nrm);
        w1Var.f246983h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i2b);
        inflate.setTag(w1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.x1 x1Var = (e23.x1) gVar;
        android.content.Intent intent = new android.content.Intent();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent.putExtra("Chat_User", "gh_3dfda90e39d6");
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_service_notify_content_search", true);
        intent.putExtra("need_hight_item", true);
        intent.putExtra("chat_from_scene", 8);
        intent.putExtra("msg_local_id", x1Var.f246989r);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27229, 1, 7, this.f246973b.i(), 0, 0, java.lang.Long.valueOf(x1Var.f246988q.f351188f / 1000));
        return true;
    }

    public final java.lang.CharSequence e(android.widget.TextView textView, java.lang.CharSequence charSequence, p13.r rVar) {
        p13.i b17 = p13.i.b(charSequence, rVar);
        b17.f351100h = textView.getPaint();
        return o13.q.e(b17).f351105a;
    }
}
