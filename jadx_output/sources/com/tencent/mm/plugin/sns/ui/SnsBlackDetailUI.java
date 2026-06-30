package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class SnsBlackDetailUI extends com.tencent.mm.plugin.sns.ui.SnsTagDetailUI {
    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public void V6(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("__onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public void W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("__onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public void X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        if ((this.f167448i + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f167446g, ",")).equals(this.f167449m) && this.f167447h != 0) {
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return;
        }
        if (com.tencent.mm.plugin.sns.model.l4.Lj().b1(this.f167447h, this.f167448i)) {
            db5.e1.s(this, getString(com.tencent.mm.R.string.jfg, this.f167448i), getString(com.tencent.mm.R.string.f490573yv));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return;
        }
        java.util.List<java.lang.String> b76 = b7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str : b76) {
            if (!this.f167446g.contains(str)) {
                linkedList.add(str);
            }
        }
        for (java.lang.String str2 : this.f167446g) {
            if (!b76.contains(str2)) {
                linkedList2.add(str2);
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            c01.e2.l0((java.lang.String) it.next(), false);
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            c01.e2.l0((java.lang.String) it6.next(), true);
        }
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealBack", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public void Y6(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        super.Y6(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealDelChatRoomMember", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public void Z6(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f167446g.contains(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                this.f167446g.add(str);
            }
        }
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f167445f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.S(this.f167446g);
        }
        d7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealOnAddContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public void a7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteTag", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
    public java.util.List b7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.f167447h != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
            return linkedList;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateListUserNameByContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        new java.util.LinkedList();
        ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
        java.util.List b17 = k35.c.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateListUserNameByContact", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getListUserName", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        return b17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI, com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference contactListExpandPreference = this.f167445f;
        if (contactListExpandPreference != null) {
            contactListExpandPreference.getClass();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167443d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX, this);
        gm0.j1.i();
        if (gm0.j1.b().m()) {
            gm0.j1.i();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsTagDetailUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsBlackDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167443d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsBlackDetailUI");
    }
}
