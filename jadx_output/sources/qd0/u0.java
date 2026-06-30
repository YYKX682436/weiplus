package qd0;

@j95.b
/* loaded from: classes.dex */
public final class u0 extends i95.w implements rd0.g1 {
    public android.content.Intent Ai(android.app.Activity activity, java.lang.String title, java.util.List memberList) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(memberList, "memberList");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", title);
        intent.putExtra("custom_contact", com.tencent.mm.sdk.platformtools.t8.c1(memberList, ","));
        intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(memberList, ","));
        intent.putExtra("need_show_all_selected", true);
        intent.putExtra("list_attr", 64);
        intent.putExtra("KEY_NEED_SEAR_HEADER", false);
        intent.putExtra("key_confirm_menu_name", activity.getResources().getString(com.tencent.mm.R.string.df7));
        pf5.j0.a(intent, cj5.b.class);
        pf5.j0.a(intent, cj5.o0.class);
        pf5.j0.a(intent, cj5.x4.class);
        pf5.j0.a(intent, cj5.d1.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }

    public android.content.Intent wi(android.app.Activity activity, java.lang.String title, java.lang.String chatroomName, java.util.List memberList, java.lang.String quoteFromMember) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        kotlin.jvm.internal.o.g(memberList, "memberList");
        kotlin.jvm.internal.o.g(quoteFromMember, "quoteFromMember");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", title);
        intent.putExtra("chatroomName", chatroomName);
        intent.putExtra("msgQuoteName", quoteFromMember);
        intent.putExtra("block_contact", c01.z1.r());
        pf5.j0.a(intent, bj5.n.class);
        pf5.j0.a(intent, bj5.y.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, bj5.f0.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        return intent;
    }
}
