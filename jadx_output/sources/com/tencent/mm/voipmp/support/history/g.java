package com.tencent.mm.voipmp.support.history;

/* loaded from: classes8.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f213766d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f213767e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f213768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f213766d = new java.util.ArrayList();
    }

    public final void O6(int i17, com.tencent.mm.voipmp.support.history.a voipTalkerConvertData) {
        kotlin.jvm.internal.o.g(voipTalkerConvertData, "voipTalkerConvertData");
        java.lang.Long l17 = this.f213768f;
        if (l17 != null) {
            kotlin.jvm.internal.o.d(l17);
            long longValue = l17.longValue();
            java.lang.String talkername = ((com.tencent.mm.voipmp.support.history.b) voipTalkerConvertData).f213762d;
            kotlin.jvm.internal.o.g(talkername, "talkername");
            com.tencent.mm.autogen.mmdata.rpt.VoIP_ilink_msg_detailStruct voIP_ilink_msg_detailStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIP_ilink_msg_detailStruct();
            long j17 = 2;
            voIP_ilink_msg_detailStruct.f61679d = 2L;
            if (kotlin.jvm.internal.o.b(c01.z1.r(), talkername)) {
                j17 = 1;
            } else {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(talkername, true);
                if (!(n17 != null && n17.r2())) {
                    j17 = 3;
                }
            }
            voIP_ilink_msg_detailStruct.f61681f = j17;
            voIP_ilink_msg_detailStruct.f61680e = longValue;
            voIP_ilink_msg_detailStruct.k();
        }
        android.content.Intent intent = new android.content.Intent();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        intent.setClass(activity, com.tencent.mm.plugin.profile.ui.ContactInfoUI.class);
        intent.putExtra("Contact_User", ((com.tencent.mm.voipmp.support.history.b) voipTalkerConvertData).f213762d);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/voipmp/support/history/VoIPHistoryData", "onClickTalker", "(ILcom/tencent/mm/voipmp/support/history/IVoIPHistoryConvertData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity2, "com/tencent/mm/voipmp/support/history/VoIPHistoryData", "onClickTalker", "(ILcom/tencent/mm/voipmp/support/history/IVoIPHistoryConvertData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        byte[] decode = android.util.Base64.decode(getIntent().getStringExtra("userInfos"), 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        try {
            c75.c.d(new org.json.JSONArray(new java.lang.String(decode, UTF_8)), new com.tencent.mm.voipmp.support.history.f(this));
            java.lang.Long l17 = this.f213768f;
            if (l17 != null) {
                kotlin.jvm.internal.o.d(l17);
                long longValue = l17.longValue();
                com.tencent.mm.autogen.mmdata.rpt.VoIP_ilink_msg_detailStruct voIP_ilink_msg_detailStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIP_ilink_msg_detailStruct();
                voIP_ilink_msg_detailStruct.f61679d = 1L;
                voIP_ilink_msg_detailStruct.f61680e = longValue;
                voIP_ilink_msg_detailStruct.k();
            }
        } catch (org.json.JSONException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
