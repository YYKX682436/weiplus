package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class sh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.uh f209859e;

    public sh(com.tencent.mm.ui.uh uhVar, java.lang.String str) {
        this.f209859e = uhVar;
        this.f209858d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.mm.ui.uh uhVar = this.f209859e;
            if (i18 >= uhVar.f211092e.f212560h.size()) {
                return;
            }
            com.tencent.mm.ui.vh vhVar = (com.tencent.mm.ui.vh) uhVar.f211092e.f212560h.get(i18);
            if (vhVar != null) {
                java.lang.String str = vhVar.f211157a;
                java.lang.String str2 = this.f209858d;
                if (str2.equals(str)) {
                    com.tencent.mm.ui.xh xhVar = uhVar.f211092e;
                    xhVar.f212561i.add((com.tencent.mm.ui.vh) xhVar.f212560h.remove(i18));
                    uhVar.f211092e.notifyDataSetChanged();
                    k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str2);
                    java.lang.String str3 = Bi == null ? "" : Bi.field_appId;
                    if (uhVar.f211091d != 1) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13796, 12, str3, "", 0, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                        return;
                    } else {
                        java.lang.String str4 = uhVar.f211092e.f212558f;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13798, 4, str3, 0, uhVar.f211092e.f212558f, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                        return;
                    }
                }
            }
            i18++;
        }
    }
}
