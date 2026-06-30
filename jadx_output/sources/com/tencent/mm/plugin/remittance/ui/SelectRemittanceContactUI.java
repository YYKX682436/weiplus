package com.tencent.mm.plugin.remittance.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class SelectRemittanceContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int I = 0;
    public java.util.List C;
    public java.util.List D;
    public java.util.List E;
    public java.lang.String F;
    public android.view.View G;
    public int H;

    public static void w7(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct groupPayPfClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GroupPayPfClickReportStruct();
        groupPayPfClickReportStruct.f58395d = i17;
        groupPayPfClickReportStruct.k();
    }

    public final void A7() {
        w7(16);
        db5.e1.E(this, getString(com.tencent.mm.R.string.kzb), "", getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.plugin.remittance.ui.y8(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.plugin.remittance.ui.f2(this, this.D, this.C, this.H, true);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.C, false, this.A);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        int i17 = this.H;
        return (i17 == 1 || i17 == 3) ? new int[]{131072, 131075} : new int[]{131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        int i17 = this.H;
        return (i17 == 1 || i17 == 3) ? getString(com.tencent.mm.R.string.kze) : getString(com.tencent.mm.R.string.i1h);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        int i18;
        boolean z17 = false;
        if (i17 < this.f206446d.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
            android.content.Intent intent = new android.content.Intent();
            int i19 = this.H;
            if (i19 == 1 || i19 == 3) {
                com.tencent.mm.ui.contact.i5.e();
                intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206780a, 16384, 64, 4096, 262144));
                intent.putExtra("min_limit_num", 1);
                intent.putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
                intent.putExtra("titile", getString(com.tencent.mm.R.string.kzg));
                intent.putExtra("without_openim", true);
            } else {
                int g17 = com.tencent.mm.ui.contact.i5.g(16, 1, 2, 4, 16384);
                intent.putExtra("list_type", 0);
                intent.putExtra("list_attr", g17);
                intent.putExtra("titile", getString(com.tencent.mm.R.string.i1e));
                intent.putExtra("sub_title", getString(com.tencent.mm.R.string.l18));
            }
            j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
            overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477784bd);
            return;
        }
        com.tencent.mm.ui.contact.item.d dVar = (com.tencent.mm.ui.contact.item.d) this.f206446d.getAdapter().getItem(i17);
        if (dVar == null || (str = dVar.f206850s) == null) {
            return;
        }
        if (com.tencent.mm.storage.z3.n4(str) || com.tencent.mm.storage.z3.m4(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[0] = str == null ? "null" : str;
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "username[%s] is openime || oepnimechatroom", objArr);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.e1.E(this, com.tencent.mm.storage.z3.n4(str) ? context.getString(com.tencent.mm.R.string.kzd) : context.getString(com.tencent.mm.R.string.kzc), "", getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.plugin.remittance.ui.u8(this));
            return;
        }
        x7(dVar.f206850s);
        if (b7() instanceof com.tencent.mm.plugin.remittance.ui.f2) {
            int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
            com.tencent.mm.plugin.remittance.ui.f2 f2Var = (com.tencent.mm.plugin.remittance.ui.f2) b7();
            int i27 = f2Var.f157702o;
            if (i27 >= 0 && ((i18 = f2Var.f157703p) < 0 || (headerViewsCount > i27 && headerViewsCount < i18))) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 6, 1);
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.H = getIntent().getIntExtra("key_from_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("recent_remittance_contact_list");
        this.D = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.D = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
        }
        if (this.H == 3) {
            this.F = getIntent().getStringExtra("key_title");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_include_username_list");
            this.E = new java.util.ArrayList();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                this.E = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(","));
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
        hashSet.addAll(c01.e2.i());
        java.lang.String stringExtra3 = getIntent().getStringExtra("Select_block_List");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra3.split(",")));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        arrayList.addAll(hashSet);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent.toString());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + i17);
        } else if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
            if (!(this.H == 3)) {
                setResult(-1, intent);
                finish();
            } else {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    return;
                }
                x7(stringExtra);
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getContentView().post(new com.tencent.mm.plugin.remittance.ui.t8(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            p7();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        super.p7();
        hideVKB();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
        if (this.G == null) {
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.cjm, null);
            this.G = inflate.findViewById(com.tencent.mm.R.id.cgi);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
            int i18 = this.H;
            if (i18 == 1 || i18 == 3) {
                textView.setText(com.tencent.mm.R.string.kz8);
            } else {
                textView.setText(com.tencent.mm.R.string.i0e);
            }
            inflate.setAccessibilityDelegate(new com.tencent.mm.plugin.remittance.ui.v8(this));
            listView.addHeaderView(inflate);
        }
        android.view.View view = this.G;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/remittance/ui/SelectRemittanceContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(h61.b.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    public final void x7(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", str);
        boolean z17 = true;
        if (!(this.H == 3)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str);
            setResult(-1, intent);
            finish();
            hideVKB();
            return;
        }
        if (!com.tencent.mm.storage.z3.R4(str)) {
            if (!((java.util.ArrayList) this.E).contains(str)) {
                A7();
                return;
            }
            if (((java.util.ArrayList) this.E).size() != 1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(str);
                z7(str, arrayList2, 1);
                return;
            } else {
                java.lang.String str2 = this.F;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(str);
                y7(str, arrayList3, str2);
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "illegal chatroomName");
            arrayList = new java.util.ArrayList();
        } else if (com.tencent.mm.storage.z3.R4(str)) {
            try {
                ?? L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
                arrayList = L0;
                if (L0 == 0) {
                    arrayList = new java.util.ArrayList();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectRemittanceContactUI", "getChatroomMemberList error! %s", e17.getMessage());
                arrayList = new java.util.ArrayList();
            }
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(c01.z1.r());
            arrayList4.add(str);
            arrayList = arrayList4;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) it.next(), c01.z1.r())) {
                break;
            }
        }
        if (!z17) {
            A7();
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectRemittanceContactUI", "self no in chatroom(%s)", str);
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) this.E).iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = (java.lang.String) it6.next();
            if (arrayList.contains(str3)) {
                arrayList5.add(str3);
            }
        }
        if (arrayList5.size() == 0) {
            A7();
        } else if (arrayList5.size() == ((java.util.ArrayList) this.E).size()) {
            y7(str, arrayList5, this.F);
        } else {
            z7(str, arrayList5, arrayList5.size());
        }
    }

    public void y7(java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "showLaunchComfirmDialog()");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = getString(com.tencent.mm.R.string.g_x);
        }
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        ((r35.k1) q1Var).Ai(getController(), str, getString(com.tencent.mm.R.string.f489728a1) + str2, getString(com.tencent.mm.R.string.f489727a0), new com.tencent.mm.plugin.remittance.ui.z8(this, str, arrayList));
        w7(11);
    }

    public final void z7(java.lang.String str, java.util.ArrayList arrayList, int i17) {
        w7(17);
        db5.e1.C(this, getString(com.tencent.mm.R.string.kza, java.lang.Integer.valueOf(i17)), "", getString(com.tencent.mm.R.string.kz_), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.remittance.ui.w8(this, str, arrayList), new com.tencent.mm.plugin.remittance.ui.x8(this));
    }
}
