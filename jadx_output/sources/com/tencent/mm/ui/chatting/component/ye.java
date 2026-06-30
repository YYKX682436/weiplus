package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ye implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f200312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f200313e;

    public ye(com.tencent.mm.ui.chatting.component.pe peVar, android.widget.LinearLayout linearLayout) {
        this.f200313e = peVar;
        this.f200312d = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HeaderComponent$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.pe peVar = this.f200313e;
        if (((com.tencent.mm.ui.chatting.component.pg) ((sb5.b1) peVar.f198580d.f460708c.a(sb5.b1.class))).f199710e) {
            sb5.b1 b1Var = (sb5.b1) peVar.f198580d.f460708c.a(sb5.b1.class);
            int i17 = peVar.f199688i;
            com.tencent.mm.ui.chatting.component.pg pgVar = (com.tencent.mm.ui.chatting.component.pg) b1Var;
            if (pgVar.f199711f != null) {
                java.lang.String string = pgVar.f198580d.s().getString(com.tencent.mm.R.string.af7);
                java.lang.String l17 = c01.z1.l();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String format = java.lang.String.format(string, l17);
                r35.e4 e4Var = new r35.e4(pgVar.f198580d.g(), null);
                e4Var.f369094q = format;
                e4Var.g(java.util.Arrays.asList(pgVar.f199713h), java.util.Arrays.asList(18));
                pgVar.f199712g = true;
            } else {
                com.tencent.mm.storage.t8 D0 = r21.w.Bi().D0(pgVar.f199713h, 1);
                c01.d9.e().g(new com.tencent.mm.pluginsdk.model.m3(3, pgVar.f199713h, D0.field_ticket, i17));
                D0.field_flag = 2;
                r21.w.Bi().update(D0, new java.lang.String[0]);
            }
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) pgVar.f198580d.f460708c.a(sb5.z0.class))).n0();
        } else {
            if (((int) peVar.f198580d.u().E2) == 0 && ((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(peVar.f198580d.u()) != -1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.HeaderComponent", "[insertRetId] successfully! username:%s", peVar.f198580d.u());
            }
            java.lang.String str2 = "";
            java.lang.String d17 = com.tencent.mm.storage.z3.R4(peVar.f198580d.u().d1()) ? peVar.f198580d.u().d1() : "";
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(peVar.f199687h, true);
            if (n17 != null && (str = n17.F1) != null) {
                str2 = str;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.HeaderComponent", "dkverify banner add:%s chat:%s ticket", peVar.f199687h, d17, str2);
            if ((android.text.TextUtils.isEmpty(d17) || !android.text.TextUtils.isEmpty(str2)) && !com.tencent.mm.storage.z3.m4(n17.d1())) {
                r35.a aVar = new r35.a(peVar.f198580d.g(), new com.tencent.mm.ui.chatting.component.ve(this));
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(3);
                aVar.m(str2);
                aVar.f369025z = true;
                aVar.a(peVar.f199687h, d17, linkedList);
            } else {
                ((c01.k7) c01.n8.a()).g(peVar.f199687h, d17, 31, new com.tencent.mm.ui.chatting.component.xe(this, d17));
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11004, peVar.f199687h, 3);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HeaderComponent$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
