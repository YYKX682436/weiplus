package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class aq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.bq f160847d;

    public aq(com.tencent.mm.plugin.setting.ui.setting.bq bqVar, com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f160847d = bqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.storage.ya z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.plugin.setting.ui.setting.bq bqVar = this.f160847d;
        com.tencent.mm.plugin.setting.ui.setting.yp x17 = bqVar.f160892p.f160776q.x(intValue);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "position:%s", java.lang.Integer.valueOf(intValue), x17.f161799b);
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = bqVar.f160892p;
        if (unfamiliarContactDetailUI.f160785z) {
            com.tencent.mm.plugin.setting.ui.setting.fq.f161050e++;
        } else {
            com.tencent.mm.plugin.setting.ui.setting.fq.f161051f++;
        }
        java.lang.String str = x17.f161799b;
        java.lang.String d17 = x17.f161800c.d1();
        java.lang.String P0 = x17.f161800c.P0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && (z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(d17)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
            str = z07.field_conRemark;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", d17);
            intent.putExtra("Contact_RemarkName", str);
            intent.putExtra("Contact_Nick", P0);
            ((com.tencent.mm.app.y7) f14.g.b()).l(intent, unfamiliarContactDetailUI);
            unfamiliarContactDetailUI.f160782w = intValue;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$ContactViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
