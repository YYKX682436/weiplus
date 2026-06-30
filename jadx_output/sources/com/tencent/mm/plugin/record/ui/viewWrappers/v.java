package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes5.dex */
public class v implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.x f155573e;

    public v(com.tencent.mm.plugin.record.ui.viewWrappers.x xVar, android.widget.TextView textView) {
        this.f155573e = xVar;
        this.f155572d = textView;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.widget.TextView textView = this.f155572d;
        com.tencent.mm.plugin.record.ui.viewWrappers.x xVar = this.f155573e;
        if (itemId == 0) {
            com.tencent.mm.sdk.platformtools.b0.e(textView.getText());
            android.content.Context context = xVar.f155581i.f155582a;
            db5.e1.W(context, context.getString(com.tencent.mm.R.string.f490361st));
            return;
        }
        if (itemId == 1) {
            if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(textView.getContext(), null)) {
                xVar.f155576d.f(xVar.f155580h, !xVar.f155577e);
                return;
            }
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.plugin.record.ui.l2 l2Var = xVar.f155576d;
            bt3.f3 a17 = l2Var.a(xVar.f155580h);
            if (a17.f24265e == 2) {
                a17.f24265e = 0;
                l2Var.f155443b.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.plugin.record.ui.l2 l2Var2 = xVar.f155576d;
            int i18 = xVar.f155580h;
            if (i18 >= l2Var2.f155444c.f155342a.size()) {
                return;
            }
            android.content.Context context2 = l2Var2.f155442a;
            db5.t7.m(context2, context2.getResources().getString(com.tencent.mm.R.string.b6d));
            bt3.f3 a18 = l2Var2.a(i18);
            java.lang.String str = ((r45.gp0) l2Var2.f155444c.f155342a.get(i18)).f375408f;
            java.lang.String str2 = a18.f24266f;
            r45.aq6 aq6Var = new r45.aq6();
            aq6Var.f370207d = str;
            aq6Var.f370209f = str2;
            aq6Var.f370209f = com.tencent.mm.sdk.platformtools.m2.f(l2Var2.f155442a);
            aq6Var.b().l().h(new com.tencent.mm.plugin.record.ui.i2(l2Var2));
            return;
        }
        if (itemId != 4) {
            if (itemId != 101) {
                return;
            }
            com.tencent.mm.plugin.record.ui.viewWrappers.y yVar = xVar.f155581i;
            te5.x0.b(yVar.f155582a, xVar.f155579g.f256590a.f375408f, yVar.f155585d.Q0(), com.tencent.mm.sdk.platformtools.t8.u1(xVar.f155581i.f155585d.V1(), xVar.f155581i.f155585d.Q0()), xVar.f155581i.f155585d.I0(), 2, true);
            return;
        }
        com.tencent.mm.plugin.record.ui.l2 l2Var3 = xVar.f155576d;
        int i19 = xVar.f155580h;
        l2Var3.getClass();
        com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
        settingsTranslateLanguageRequest.f67821d = wd0.k2.CHAT_RECORD_DEFAULT;
        settingsTranslateLanguageRequest.f67822e = "TranslateHelper.SettingsRequestSessionId_" + i19;
        settingsTranslateLanguageRequest.b("TranslateHelper.SettingsRequestExtKey.MsgPosition", java.lang.String.valueOf(i19));
        com.tencent.mars.xlog.Log.i("MicroMsg.TranslateHelper", "changeTranslateLanguage, msgPosition: " + i19);
        l2Var3.f155446e = settingsTranslateLanguageRequest.clone();
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(l2Var3.f155442a, settingsTranslateLanguageRequest);
    }
}
