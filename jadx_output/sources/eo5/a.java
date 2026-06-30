package eo5;

/* loaded from: classes.dex */
public final class a extends h.b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f255593a;

    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        java.util.List input = (java.util.List) obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.String str = this.f255593a;
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.multitalk.ui.MultiTalkAddMembersUI.class);
            intent.putExtra("titile", context.getString(com.tencent.mm.R.string.h0z));
            intent.putExtra("chatroomName", this.f255593a);
            intent.putExtra("always_select_contact", kz5.n0.g0(input, ",", null, null, 0, null, null, 62, null));
            intent.putExtra("key_need_gallery", false);
            return intent;
        }
        ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).getClass();
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent2.putExtra("titile", context.getString(com.tencent.mm.R.string.ond));
        intent2.putExtra("list_type", 0);
        com.tencent.mm.ui.contact.i5.e();
        intent2.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206783d, 256, 512));
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(input, ",");
        if (c17 != null) {
            intent2.putExtra("always_select_contact", c17);
        }
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 7);
        intent2.putExtra("menu_mode", 1);
        intent2.putExtra("recommend_chatroom", true);
        intent2.putExtra("too_many_member_tip_string", context.getString(com.tencent.mm.R.string.lfn));
        intent2.putExtra("too_many_member_tip_ok_string", context.getString(com.tencent.mm.R.string.l_e));
        intent2.putExtra("max_limit_num", 14 - input.size());
        intent2.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
        pf5.j0.a(intent2, cj5.d1.class);
        pf5.j0.a(intent2, aj5.a0.class);
        pf5.j0.a(intent2, aj5.g1.class);
        pf5.j0.a(intent2, aj5.i.class);
        pf5.j0.a(intent2, cj5.u3.class);
        pf5.j0.a(intent2, cj5.k4.class);
        pf5.j0.a(intent2, cj5.s.class);
        pf5.j0.a(intent2, cj5.h3.class);
        pf5.j0.a(intent2, cj5.n3.class);
        pf5.j0.a(intent2, cj5.w2.class);
        pf5.j0.a(intent2, cj5.l2.class);
        pf5.j0.a(intent2, eo5.e.class);
        return intent2;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        java.lang.String str;
        java.lang.String str2 = this.f255593a;
        if (str2 == null || str2.length() == 0) {
            stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
        } else {
            if (intent == null || (str = intent.getStringExtra("Select_Contact")) == null) {
                str = "";
            }
            java.lang.String[] strArr = (java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]);
            stringArrayListExtra = new java.util.ArrayList<>();
            for (java.lang.String str3 : strArr) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    stringArrayListExtra.add(str3);
                }
            }
        }
        return (i17 != -1 || stringArrayListExtra == null) ? kz5.p0.f313996d : stringArrayListExtra;
    }
}
