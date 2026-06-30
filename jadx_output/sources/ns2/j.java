package ns2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ns2.g f339388a = new ns2.g();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ns2.b bVar, ns2.a aVar, int i17) {
        java.lang.String string = bVar.f339357c.getString(4);
        int i18 = 0;
        boolean z17 = true;
        if ((string == null || string.length() == 0) == true) {
            com.tencent.mars.xlog.Log.e("FinderLiveNoticeReserveHandler", "[doReserveInternal] noticeId is null or empty, abort reserve");
            return;
        }
        r45.h32 h32Var = bVar.f339357c;
        h32Var.getInteger(1);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f435921a;
        ml2.q1 q1Var = ml2.q1.f327812e;
        java.lang.String l17 = t3Var.l("temp_5", bVar.f339365k ? 1 : 0, bVar.f339362h, null, null);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = bVar.f339356b;
        android.content.Context context = bVar.f339355a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        java.lang.String str2 = bVar.f339367m;
        java.lang.Integer num = bVar.f339369o;
        if (num != null) {
            i18 = num.intValue();
        } else {
            java.lang.String str3 = bVar.f339362h;
            if (str3 != null && str3.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                i18 = 901;
            }
        }
        gm0.j1.d().g(c61.zb.x3(zbVar, str, string, i17, V6, str2, java.lang.Integer.valueOf(i18), null, null, l17, bVar.f339366l, null, null, null, 7360, null));
        java.lang.String str4 = bVar.f339356b;
        e(str4, h32Var);
        b(context, str4);
        com.tencent.mm.plugin.finder.live.widget.mj mjVar = (com.tencent.mm.plugin.finder.live.widget.mj) aVar;
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = mjVar.f119076a.f117625o;
        kotlin.jvm.internal.o.f(noticeStatusView, "access$getLiveNoticeActionBtn$p(...)");
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(noticeStatusView, mjVar.f119077b, false, new com.tencent.mm.plugin.finder.live.widget.lj(mjVar.f119078c), 2, null);
        d(bVar, i17);
    }

    public final void b(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.g8.class))).f417974d.M0(str);
    }

    public final void c(ns2.b bVar, ml2.i5 i5Var, java.lang.String str) {
        cl0.g gVar = new cl0.g();
        java.lang.Integer num = bVar.f339369o;
        gVar.s("source_type", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        gVar.s("ref_page_type", bVar.f339362h);
        gVar.o("notice_type", 1);
        java.lang.Integer num2 = bVar.f339370p;
        if (num2 != null) {
            gVar.o("pull_source", num2.intValue());
        }
        i95.m c17 = i95.n0.c(c50.c1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c50.c1 c1Var = (c50.c1) c17;
        java.lang.String str2 = bVar.f339356b;
        java.lang.String str3 = bVar.f339359e;
        r45.h32 h32Var = bVar.f339357c;
        java.lang.String string = h32Var.getString(3);
        if (string == null) {
            string = "";
        }
        c50.c1.l9(c1Var, i5Var, str2, 0L, 0, str3, null, null, null, null, string, gVar.toString(), h32Var.getString(4), str, bVar.f339360f, bVar.f339361g, null, 33248, null);
    }

    public final void d(ns2.b bVar, int i17) {
        long j17 = bVar.f339360f;
        if (j17 != 0) {
            com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
            r45.qt2 qt2Var = bVar.f339358d;
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
            int i18 = i17 == 1 ? 83 : 84;
            java.lang.String string = bVar.f339357c.getString(4);
            if (string == null) {
                string = "";
            }
            com.tencent.mm.plugin.finder.report.l0.e(l0Var, qt2Var, h17, i18, string, 0, 16, null);
        }
    }

    public final void e(java.lang.String str, r45.h32 h32Var) {
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string = h32Var.getString(4);
        if (string == null) {
            string = "";
        }
        if (((b92.d1) zbVar).bj(str, string) == null) {
            c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string2 = h32Var.getString(4);
            ((b92.d1) zbVar2).Ai(str, string2 != null ? string2 : "", h32Var);
        } else {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string3 = h32Var.getString(4);
            r45.h32 bj6 = ((b92.d1) zbVar3).bj(str, string3 != null ? string3 : "");
            if (bj6 == null) {
                return;
            }
            bj6.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
        }
    }
}
