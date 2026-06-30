package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class no implements com.tencent.mm.pluginsdk.model.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f199599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jo f199600b;

    public no(com.tencent.mm.ui.chatting.component.jo joVar, android.content.Intent intent) {
        this.f199600b = joVar;
        this.f199599a = intent;
    }

    @Override // com.tencent.mm.pluginsdk.model.a3
    public void a(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        java.lang.String stringExtra = this.f199599a.getStringExtra("key_multi_send_report_info");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("key_multi_send_report_info");
            for (int i17 = 0; i17 < list2.size(); i17++) {
                java.lang.String str = (java.lang.String) list2.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    M.putString(str, stringExtra);
                }
            }
        }
        this.f199600b.f198580d.b();
    }
}
