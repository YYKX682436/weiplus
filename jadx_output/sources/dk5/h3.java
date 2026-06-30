package dk5;

/* loaded from: classes9.dex */
public class h3 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f234652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234656h;

    public h3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr, java.util.List list, java.lang.String str4, android.content.Intent intent) {
        this.f234656h = selectConversationUI;
        this.f234649a = str;
        this.f234650b = str2;
        this.f234651c = str3;
        this.f234652d = strArr;
        this.f234653e = list;
        this.f234654f = str4;
        this.f234655g = intent;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234656h;
        selectConversationUI.hideVKB();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandNotifyGroupMembers bOk:%b", java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = this.f234655g;
        if (!z17) {
            int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
            selectConversationUI.a8(0, intent);
            selectConversationUI.finish();
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f234652d.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "dealRetransmitFromAppBrandNotifyGroupMembers customText:%s, weAppSourceUsername:%s atUserListString:%s atUserList:%d", this.f234649a, this.f234650b, this.f234651c, valueOf);
        for (nm5.b bVar : this.f234653e) {
            java.lang.String str2 = (java.lang.String) bVar.a(0);
            java.lang.String str3 = (java.lang.String) bVar.a(1);
            java.util.LinkedHashMap linkedHashMap = com.tencent.mm.ui.i1.f208894d;
            if (linkedHashMap != null) {
                linkedHashMap.put(str2, str3);
            }
        }
        tg3.a1 a17 = tg3.t1.a();
        java.lang.String str4 = this.f234649a;
        java.lang.String str5 = this.f234654f;
        ((dk5.s5) a17).hj(str5, str4, c01.e2.C(str5), 0, 0L, "", this.f234650b, "");
        if (str != null && !str.isEmpty()) {
            ((dk5.s5) tg3.t1.a()).fj(str5, str, c01.e2.C(str5), 0);
        }
        int i19 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        selectConversationUI.a8(-1, intent);
        selectConversationUI.finish();
    }
}
