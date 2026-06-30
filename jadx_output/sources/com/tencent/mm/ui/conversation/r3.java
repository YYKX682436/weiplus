package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class r3 implements android.widget.AdapterView.OnItemLongClickListener, android.view.View.OnCreateContextMenuListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.j0 f208037d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f208038e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f208039f;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f208042i;

    /* renamed from: m, reason: collision with root package name */
    public int f208043m;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f208040g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.storage.l4 f208041h = null;

    /* renamed from: n, reason: collision with root package name */
    public final db5.t4 f208044n = new com.tencent.mm.ui.conversation.p3(this);

    public r3(yf5.j0 j0Var, android.widget.ListView listView, android.app.Activity activity, int[] iArr) {
        this.f208042i = new int[2];
        this.f208037d = j0Var;
        this.f208038e = listView;
        this.f208039f = activity;
        this.f208042i = iArr;
    }

    public static void a(com.tencent.mm.ui.conversation.r3 r3Var, java.lang.String str) {
        if (com.tencent.mm.storage.z3.L3(r3Var.f208040g)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", str);
            hashMap.put("chat_name", r3Var.f208040g);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }

    public static void b(com.tencent.mm.ui.conversation.r3 r3Var, boolean z17) {
        r3Var.getClass();
        long i17 = c01.z1.i();
        long j17 = z17 ? i17 | 8192 : i17 & (-8193);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 82;
        p53Var.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationLongClickListener", "switch ext change : TXNEWS isTop open = " + z17 + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
    }

    public static void c(com.tencent.mm.ui.conversation.r3 r3Var, boolean z17) {
        r3Var.getClass();
        long i17 = c01.z1.i();
        long j17 = z17 ? i17 | 262144 : i17 & (-262145);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f22779a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 84;
        p53Var.f382762e = i18;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationLongClickListener", "switch ext change : isTop open = " + z17 + " item value = " + p53Var.f382762e + " functionId = " + p53Var.f382761d);
    }

    public final void d(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct leftSlideOptionStruct = new com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct();
        leftSlideOptionStruct.f58551d = i17;
        leftSlideOptionStruct.f58552e = leftSlideOptionStruct.b("SessionName", this.f208040g, true);
        leftSlideOptionStruct.f58553f = this.f208041h.d1();
        leftSlideOptionStruct.f58554g = c01.h2.b(this.f208040g);
        if (i17 == 13 || i17 == 14) {
            leftSlideOptionStruct.f58555h = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, true) ? 1L : 2L;
        }
        leftSlideOptionStruct.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnCreateContextMenuListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateContextMenu(android.view.ContextMenu r9, android.view.View r10, android.view.ContextMenu.ContextMenuInfo r11) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.r3.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        yf5.w0 w0Var = (yf5.w0) this.f208037d;
        w0Var.A = false;
        w0Var.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.ListView listView = this.f208038e;
        if (i17 < listView.getHeaderViewsCount()) {
            return true;
        }
        this.f208043m = i17 - listView.getHeaderViewsCount();
        int headerViewsCount = i17 - listView.getHeaderViewsCount();
        yf5.j0 j0Var = this.f208037d;
        com.tencent.mm.storage.l4 item = ((yf5.w0) j0Var).getItem(headerViewsCount);
        this.f208041h = item;
        if (item == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConversationLongClickListener", "headercount:%d, postion:%d", java.lang.Integer.valueOf(listView.getHeaderViewsCount()), java.lang.Integer.valueOf(i17));
            return true;
        }
        if (view.getTag() instanceof yf5.n) {
            yf5.n nVar = (yf5.n) view.getTag();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationLongClickListener", "[onItemLongClick] position:%s [%s,%s]", java.lang.Integer.valueOf(i17), this.f208041h.h1(), nVar.f461926m);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nVar.f461926m) && !java.util.Objects.equals(this.f208041h.h1(), nVar.f461926m)) {
                com.tencent.mm.storage.l4 h17 = ((yf5.w0) j0Var).h(nVar.f461926m);
                if (h17 != null) {
                    this.f208041h = h17;
                }
            }
        }
        java.lang.String h18 = this.f208041h.h1();
        this.f208040g = h18;
        if (com.tencent.mm.storage.z3.X3(h18)) {
            return true;
        }
        rl5.r rVar = new rl5.r(this.f208039f);
        db5.t4 t4Var = this.f208044n;
        int[] iArr = this.f208042i;
        rVar.g(view, i17, j17, this, t4Var, iArr[0], iArr[1]);
        rVar.L = this;
        if (com.tencent.mm.storage.z3.R4(this.f208040g)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 1, 0, this.f208040g);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 0, 0, this.f208040g);
        }
        d(100);
        if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) view.findViewById(com.tencent.mm.R.id.kbq);
            noMeasuredTextView.announceForAccessibility(noMeasuredTextView.getText());
        }
        return true;
    }
}
