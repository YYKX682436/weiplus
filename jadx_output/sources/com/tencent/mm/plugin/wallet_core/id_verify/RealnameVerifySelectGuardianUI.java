package com.tencent.mm.plugin.wallet_core.id_verify;

@db5.a(19)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/id_verify/RealnameVerifySelectGuardianUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "com/tencent/mm/plugin/wallet_core/id_verify/x", "com/tencent/mm/plugin/wallet_core/id_verify/c0", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes9.dex */
public final class RealnameVerifySelectGuardianUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final com.tencent.mm.plugin.wallet_core.id_verify.x E = new com.tencent.mm.plugin.wallet_core.id_verify.x(null);
    public final java.util.ArrayList C;
    public final com.tencent.mm.plugin.wallet_core.id_verify.c0 D;

    public RealnameVerifySelectGuardianUI() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        this.D = new com.tencent.mm.plugin.wallet_core.id_verify.c0();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
        hashSet.addAll(c01.e2.i());
        hashSet.add(c01.z1.r());
        arrayList.addAll(hashSet);
    }

    public static final void w7(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, r45.yt5 yt5Var) {
        r45.nm6 nm6Var;
        java.lang.String str;
        realnameVerifySelectGuardianUI.getClass();
        if (yt5Var != null && (str = yt5Var.f391355e) != null) {
            com.tencent.mm.wallet_core.ui.r1.V(realnameVerifySelectGuardianUI.getContext(), str, true);
        }
        if (yt5Var == null || (nm6Var = yt5Var.f391356f) == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.b0(nm6Var.f381518d, nm6Var.f381519e, nm6Var.f381520f, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT);
    }

    public static final java.lang.Boolean x7(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, java.lang.String str, java.lang.String str2) {
        realnameVerifySelectGuardianUI.getClass();
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "will send text message");
        com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
        am.mt mtVar = sendMsgEvent.f54752g;
        mtVar.f7362a = str2;
        mtVar.f7363b = str;
        mtVar.f7364c = 1;
        mtVar.f7365d = 0;
        return java.lang.Boolean.valueOf(sendMsgEvent.e());
    }

    public static final void y7(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, r45.f7 f7Var) {
        realnameVerifySelectGuardianUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(f7Var.f374070d)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "show alert: " + f7Var.f374070d);
        androidx.appcompat.app.AppCompatActivity context = realnameVerifySelectGuardianUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = f7Var.f374070d;
        r45.gq gqVar = f7Var.f374071e;
        if (gqVar != null) {
            aVar.f211733w = gqVar.f375466h;
            aVar.F = new com.tencent.mm.plugin.wallet_core.id_verify.m0(realnameVerifySelectGuardianUI, gqVar);
        }
        r45.gq gqVar2 = f7Var.f374072f;
        if (gqVar2 != null) {
            aVar.f211732v = gqVar2.f375466h;
            aVar.E = new com.tencent.mm.plugin.wallet_core.id_verify.n0(realnameVerifySelectGuardianUI, gqVar2);
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z7(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI r3, java.lang.String r4) {
        /*
            androidx.appcompat.app.AppCompatActivity r0 = r3.getContext()
            com.tencent.mm.ui.widget.dialog.a r1 = new com.tencent.mm.ui.widget.dialog.a
            r1.<init>()
            if (r4 == 0) goto L1a
            int r2 = r4.length()
            if (r2 <= 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L17
            goto L18
        L17:
            r4 = 0
        L18:
            if (r4 != 0) goto L26
        L1a:
            r4 = 2131779069(0x7f105dfd, float:1.9189685E38)
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.o.f(r4, r3)
        L26:
            r1.f211729s = r4
            android.content.res.Resources r3 = of5.b.a(r0)
            r4 = 2131756213(0x7f1004b5, float:1.9143327E38)
            java.lang.String r3 = r3.getString(r4)
            r1.f211733w = r3
            com.tencent.mm.ui.widget.dialog.j0 r3 = new com.tencent.mm.ui.widget.dialog.j0
            r4 = 2131821911(0x7f110557, float:1.9276579E38)
            r3.<init>(r0, r4)
            r3.e(r1)
            com.tencent.mm.ui.widget.dialog.d0 r4 = r1.f211723m
            if (r4 == 0) goto L49
            android.widget.EditText r0 = r3.f211837r
            r4.a(r0)
        L49:
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.z7(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI, java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void W6() {
        if (getIntent().getBooleanExtra("under_age_verify_from_liteapp", false)) {
            com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent realnameVerifyGuardianResultEvent = new com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent();
            realnameVerifyGuardianResultEvent.f54648g.f7644a = 0;
            realnameVerifyGuardianResultEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.util.ArrayList arrayList = this.C;
        com.tencent.mm.ui.contact.i0 i0Var = new com.tencent.mm.ui.contact.i0();
        ((qd0.y0) j1Var).getClass();
        return new com.tencent.mm.ui.contact.h0(this, arrayList, true, false, i0Var);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.C, false, this.A);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String string = getString(com.tencent.mm.R.string.l4i);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r3 == null) goto L25;
     */
    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7(android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
        /*
            r1 = this;
            android.widget.ListView r2 = r1.f206446d
            int r2 = r2.getHeaderViewsCount()
            int r4 = r4 - r2
            if (r4 >= 0) goto La
            return
        La:
            com.tencent.mm.ui.contact.p4 r2 = r1.b7()
            com.tencent.mm.ui.contact.item.d r2 = r2.getItem(r4)
            if (r2 != 0) goto L15
            return
        L15:
            r3 = 2
            int r5 = r2.f206832a
            if (r5 == r3) goto L1b
            return
        L1b:
            java.lang.String r2 = r2.f206850s
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r3 == 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "empty username selected at "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.RealnameVerifySelectGuardianUI"
            com.tencent.mars.xlog.Log.e(r3, r2)
            return
        L37:
            android.content.Intent r3 = r1.getIntent()
            java.lang.String r4 = "under_age_msg_preview_text"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L53
            int r4 = r3.length()
            if (r4 <= 0) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            if (r4 == 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 != 0) goto L76
        L53:
            androidx.appcompat.app.AppCompatActivity r3 = r1.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r4.<init>(r5)
            r5 = 2131780546(0x7f1063c2, float:1.919268E38)
            java.lang.String r3 = r3.getString(r5)
            r4.append(r3)
            r3 = 93
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L76:
            kotlin.jvm.internal.o.d(r3)
            java.lang.Class<o25.q1> r4 = o25.q1.class
            i95.m r4 = i95.n0.c(r4)
            o25.q1 r4 = (o25.q1) r4
            androidx.appcompat.app.AppCompatActivity r5 = r1.getContext()
            r6 = 2131756280(0x7f1004f8, float:1.9143463E38)
            java.lang.String r6 = r1.getString(r6)
            com.tencent.mm.plugin.wallet_core.id_verify.e0 r0 = new com.tencent.mm.plugin.wallet_core.id_verify.e0
            r0.<init>(r1, r2)
            r35.k1 r4 = (r35.k1) r4
            r4.getClass()
            r35.i1 r4 = new r35.i1
            r4.<init>(r5)
            r4.l(r2)
            r4.i(r3)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4.g(r2)
            r4.f369137d = r6
            r4.a(r0)
            com.tencent.mm.ui.widget.dialog.j0 r2 = r4.f369136c
            r2.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.h7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }
}
