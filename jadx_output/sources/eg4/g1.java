package eg4;

/* loaded from: classes11.dex */
public class g1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f252714d;

    /* renamed from: e, reason: collision with root package name */
    public final eg4.t1 f252715e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f252716f;

    public g1(android.content.Context context, eg4.t1 t1Var, boolean z17) {
        this.f252716f = false;
        this.f252714d = context;
        this.f252715e = t1Var;
        this.f252716f = z17;
    }

    public static void a(android.content.Context context, com.tencent.mm.storage.m7 m7Var, java.lang.String str, boolean z17) {
        boolean z18;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FConversationOnItemClickListener", "dealOnClick fail, talker is null");
            return;
        }
        r21.w.wi().i1(str);
        com.tencent.mm.storage.p7 W0 = r21.w.Ai().W0(str);
        if (W0 != null && W0.field_isSend == 1 && W0.field_type == 1) {
            z18 = true;
        } else {
            W0 = r21.w.Ai().b1(str);
            z18 = false;
        }
        if (W0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, lastRecvFmsg is null, talker = ".concat(str));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FConversationOnItemClickListener", "isforceHideReply = " + z18);
        if (W0.field_type != 0) {
            b(context, m7Var, W0, z17, z18);
            return;
        }
        com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(W0.field_msgContent);
        if (D3.f196358a.length() <= 0) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("Contact_ShowFMessageList", true);
        bundle.putInt("Contact_Source_FMessage", D3.f196364g);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(D3.f196358a, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.contact.g1.a(context, n17, D3, true, true, bundle, "");
            return;
        }
        if (D3.f196367j > 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(D3.f196369l) && com.tencent.mm.sdk.platformtools.t8.K0(D3.f196368k) && !com.tencent.mm.sdk.platformtools.t8.K0(D3.f196359b)) {
                bundle.putString("Contact_QQNick", D3.f196359b);
            }
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.contact.g1.b(context, D3, true, true, bundle);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(D3.f196365h) && com.tencent.mm.sdk.platformtools.t8.K0(D3.f196366i)) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.contact.g1.b(context, D3, true, true, bundle);
            return;
        }
        r61.a i17 = m61.k.wi().i(D3.f196365h);
        if ((i17 != null && i17.e() != null && i17.e().length() > 0) || ((i17 = m61.k.wi().i(D3.f196366i)) != null && i17.e() != null && i17.e().length() > 0)) {
            if (i17.i() == null || i17.i().length() <= 0) {
                i17.f392792h = D3.f196358a;
                i17.O = 128;
                if (m61.k.wi().j(i17.e(), i17) == -1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FConversationOnItemClickListener", "update mobile contact username failed");
                    return;
                }
            }
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.contact.g1.b(context, D3, true, true, bundle);
            return;
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.contact.g1.b(context, D3, true, true, bundle);
        } else {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.contact.g1.a(context, n17, D3, true, true, bundle, "");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FConversationOnItemClickListener", "error : this is not the mobile contact, MD5 = " + D3.f196365h + " fullMD5:" + D3.f196366i);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r18, com.tencent.mm.storage.m7 r19, com.tencent.mm.storage.p7 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg4.g1.b(android.content.Context, com.tencent.mm.storage.m7, com.tencent.mm.storage.p7, boolean, boolean):void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (this.f252716f) {
            i17 -= 2;
        }
        com.tencent.mm.storage.m7 m7Var = (com.tencent.mm.storage.m7) this.f252715e.getItem(i17);
        if (m7Var != null) {
            a(this.f252714d, m7Var, m7Var.field_talker, false);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FConversationOnItemClickListener", "onItemClick, item is null, pos = " + i17);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
