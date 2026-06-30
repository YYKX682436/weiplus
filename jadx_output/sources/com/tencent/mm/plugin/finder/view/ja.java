package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ja extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f132424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f132425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f132428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f132429i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132430m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f132431n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, r45.h32 h32Var, android.content.Context context, java.lang.String str, r45.qt2 qt2Var, java.lang.Long l17, java.lang.String str2, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView) {
        super(2);
        this.f132424d = finderFeedLiveNoticeView;
        this.f132425e = h32Var;
        this.f132426f = context;
        this.f132427g = str;
        this.f132428h = qt2Var;
        this.f132429i = l17;
        this.f132430m = str2;
        this.f132431n = noticeStatusView;
    }

    public static final void a(java.lang.String str, android.content.Context context, java.lang.Long l17, java.lang.String str2, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, r45.h32 h32Var, r45.qt2 qt2Var, r45.h32 h32Var2, int i17, java.lang.String str3) {
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String string = h32Var2.getString(4);
        kotlin.jvm.internal.o.d(string);
        androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) context;
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("key_promotion_token");
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("FINDER_PRODUCT_LAST_GLOBAL_MSG_ID");
        gm0.j1.d().g(c61.zb.x3(zbVar, str, string, i17, V6, stringExtra, 11, l17, null, str3, null, null, stringExtra2 == null ? "" : stringExtra2, str2, 1664, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string2 = h32Var2.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar2).bj(str, string2) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string3 = h32Var2.getString(4);
            if (string3 == null) {
                string3 = "";
            }
            ((b92.d1) zbVar3).Ai(str, string3, h32Var2);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string4 = h32Var2.getString(4);
            if (string4 == null) {
                string4 = "";
            }
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str, string4);
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var2.getInteger(1)));
            }
        }
        ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(activity).c(zy2.g8.class))).f417974d.M0(str);
        noticeStatusView.f(str, true, new com.tencent.mm.plugin.finder.view.ha(h32Var));
        e(qt2Var, finderFeedLiveNoticeView, h32Var2, i17);
        if (i17 == 1 && finderFeedLiveNoticeView.isAutoCloseAfterSubscribe) {
            kotlinx.coroutines.r2 r2Var = finderFeedLiveNoticeView.f131085e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            finderFeedLiveNoticeView.f131085e = kotlinx.coroutines.l.d(finderFeedLiveNoticeView.f131084d, null, null, new com.tencent.mm.plugin.finder.view.ia(finderFeedLiveNoticeView, null), 3, null);
        }
    }

    public static final void d(r45.h32 h32Var, int i17, r45.qt2 qt2Var, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, java.lang.String str, android.content.Context context, java.lang.Long l17, java.lang.String str2, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView) {
        h32Var.set(1, 1);
        cl0.g gVar = new cl0.g();
        gVar.s("source_type", java.lang.Integer.valueOf(i17 == 1 ? 5 : 4));
        r45.q65 q65Var = (r45.q65) h32Var.getCustom(10);
        boolean z17 = false;
        gVar.s("pay_type", java.lang.Integer.valueOf((q65Var == null || !q65Var.getBoolean(0)) ? 0 : 1));
        java.lang.String string = h32Var.getString(8);
        if (string != null) {
            if (string.length() > 0) {
                z17 = true;
            }
        }
        gVar.s("page_type", z17 ? "get_ticket" : "");
        c50.c1 c1Var = (c50.c1) i95.n0.c(c50.c1.class);
        ml2.i5 i5Var = ml2.i5.f327572g;
        java.lang.String valueOf = java.lang.String.valueOf(qt2Var.getInteger(5));
        java.lang.String string2 = h32Var.getString(3);
        java.lang.String str3 = string2 == null ? "" : string2;
        java.lang.String gVar2 = gVar.toString();
        java.lang.String string3 = h32Var.getString(4);
        long j17 = finderFeedLiveNoticeView.f131093p;
        int integer = qt2Var.getInteger(5);
        cl0.g gVar3 = new cl0.g();
        gVar3.o("notice_type", 1);
        java.lang.String gVar4 = gVar3.toString();
        kotlin.jvm.internal.o.d(c1Var);
        c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, str3, gVar2, string3, gVar4, j17, integer, null, 33248, null);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        a(str, context, l17, str2, noticeStatusView, finderFeedLiveNoticeView, h32Var, qt2Var, h32Var, 2, vd2.t3.f435921a.l(java.lang.String.valueOf(qt2Var.getInteger(5)), -1, null, null, gVar.toString()));
        db5.t7.i(context, context.getString(com.tencent.mm.R.string.cn8), com.tencent.mm.R.raw.icons_filled_done);
    }

    public static final void e(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, r45.h32 h32Var, int i17) {
        com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderFeedLiveNoticeView.f131093p);
        int i18 = i17 == 1 ? 83 : 84;
        java.lang.String string = h32Var.getString(4);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.plugin.finder.report.l0.e(l0Var, qt2Var, h17, i18, string, 0, 16, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a2  */
    @Override // yz5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r66, java.lang.Object r67) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.ja.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
