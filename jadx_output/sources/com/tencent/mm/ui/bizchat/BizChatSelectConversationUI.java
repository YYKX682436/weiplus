package com.tencent.mm.ui.bizchat;

@db5.a(19)
/* loaded from: classes11.dex */
public class BizChatSelectConversationUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI implements r01.w2 {
    public static final /* synthetic */ int H = 0;
    public android.widget.TextView E;
    public s01.a0 F;
    public java.lang.String C = null;
    public int D = 0;
    public com.tencent.mm.ui.widget.dialog.u3 G = null;

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.G;
        if (u3Var != null && u3Var.isShowing()) {
            this.G.dismiss();
            this.G = null;
        }
        if (m1Var.getType() == 1355) {
            s01.h D0 = r01.q3.Ui().D0(((s01.g0) m1Var).H().f388000e.f377592d.f383085d);
            if (D0 == null) {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.i3x), 0).show();
            } else {
                w7(this.C, D0.field_bizChatLocalId, D0.field_chatName);
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        x7();
        return new hb5.c1(this, null, false, this.C);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        x7();
        return new com.tencent.mm.ui.contact.b5(this, null, false, this.C);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = this.C;
        ((sg3.a) v0Var).getClass();
        return c01.a2.e(str);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f206446d.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSelectConversationUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (!(this.f206446d.getAdapter().getItem(i17) instanceof hb5.i)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatSelectConversationUI", "Click HeaderView not BizChatConvDataItem");
            return;
        }
        hb5.i iVar = (hb5.i) this.f206446d.getAdapter().getItem(i17);
        if (iVar == null) {
            return;
        }
        java.lang.String str = iVar.f206819z;
        long j18 = iVar.D;
        if (str == null || j18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSelectConversationUI", "onclick err userName:%s,bizChatId:%s", str, java.lang.Long.valueOf(j18));
        } else {
            w7(str, j18, iVar.f206818y);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 == r0) goto L7
            return
        L7:
            r9 = 1
            if (r8 == r9) goto Lb
            return
        Lb:
            java.lang.String r8 = "result_data"
            android.os.Bundle r8 = r10.getBundleExtra(r8)
            r10 = 0
            if (r8 == 0) goto L77
            java.lang.String r0 = "MicroMsg.BizChatSelectConversationUI"
            java.lang.String r1 = "bundle != null"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.String r0 = "enterprise_members"
            java.lang.String r8 = r8.getString(r0)
            r45.j53 r0 = new r45.j53
            r0.<init>()
            s01.h r1 = new s01.h
            r1.<init>()
            s01.a0 r2 = r7.F
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.field_addMemberUrl
            goto L34
        L33:
            r2 = r3
        L34:
            r1.field_addMemberUrl = r2
            java.lang.String r2 = r7.C
            r1.field_brandUserName = r2
            boolean r8 = s01.r.a(r1, r8, r3, r0)
            if (r8 == 0) goto L77
            long r2 = r1.field_bizChatLocalId
            r4 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L50
            java.lang.String r8 = r7.C
            java.lang.String r0 = r1.field_chatName
            r7.w7(r8, r2, r0)
            goto L78
        L50:
            s01.y r8 = r01.q3.Ni()
            java.lang.String r1 = r7.C
            s01.g0 r8 = r8.e(r1, r0, r7)
            r0 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 2131755233(0x7f1000e1, float:1.914134E38)
            java.lang.String r3 = r7.getString(r0)
            r4 = 1
            r5 = 1
            hb5.p0 r6 = new hb5.p0
            r6.<init>(r7, r8)
            r1 = r7
            com.tencent.mm.ui.widget.dialog.u3 r8 = db5.e1.Q(r1, r2, r3, r4, r5, r6)
            r7.G = r8
            goto L78
        L77:
            r9 = r10
        L78:
            if (r9 != 0) goto L88
            r8 = 2131774416(0x7f104bd0, float:1.9180247E38)
            java.lang.String r8 = r7.getString(r8)
            android.widget.Toast r8 = dp.a.makeText(r7, r8, r10)
            r8.show()
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.bizchat.BizChatSelectConversationUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        s01.a0 a0Var;
        super.onCreate(bundle);
        this.D = getIntent().getIntExtra("biz_chat_scene", 1);
        x7();
        java.lang.String z07 = r01.q3.Vi().z0(this.C);
        s01.a0 y07 = r01.q3.Vi().y0(z07);
        this.F = y07;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.C;
        objArr[1] = z07;
        objArr[2] = java.lang.Boolean.valueOf(y07 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSelectConversationUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07) || (a0Var = this.F) == null || a0Var.u0() || com.tencent.mm.sdk.platformtools.t8.K0(this.F.field_addMemberUrl)) {
            r01.q3.Ni().h(this.C, this);
            this.G = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new hb5.q0(this));
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        super.p7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
        if (this.E == null) {
            hb5.l0 l0Var = new hb5.l0(this);
            java.lang.String string = getString(com.tencent.mm.R.string.f492962ig4);
            android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) null);
            inflate.setOnClickListener(l0Var);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2);
            textView.setText(string);
            listView.addHeaderView(inflate);
            this.E = textView;
        }
        this.E.setVisibility(i17);
    }

    public final void w7(java.lang.String str, long j17, java.lang.CharSequence charSequence) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSelectConversationUI", "doClickUser=%s", str);
        int i17 = this.D;
        if (i17 != 2) {
            if (i17 == 1) {
                java.util.HashMap hashMap = (java.util.HashMap) getIntent().getSerializableExtra("enterprise_extra_params");
                r35.j1.j(getController(), (java.lang.String) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), (java.lang.String) hashMap.get("img_url"), (java.lang.String) hashMap.get("desc"), null, true, getResources().getString(com.tencent.mm.R.string.f490551ya), new hb5.o0(this, str, j17));
                return;
            }
            return;
        }
        if (getIntent().getBooleanExtra("enterprise_extra_params", true)) {
            r35.j1.s(this.mController, j17, getString(com.tencent.mm.R.string.i28), ((java.lang.Object) charSequence) + "", null, getString(com.tencent.mm.R.string.f490551ya), new hb5.m0(this, str, j17));
            return;
        }
        r35.j1.s(this.mController, j17, getString(com.tencent.mm.R.string.i28), ((java.lang.Object) charSequence) + "", null, getString(com.tencent.mm.R.string.f490551ya), new hb5.n0(this, str, j17));
    }

    public final void x7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
            this.C = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizChatSelectConversationUI", "brandUserName is null");
                finish();
            }
        }
    }
}
