package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class u extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f125372d;

    /* renamed from: e, reason: collision with root package name */
    public int f125373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f125374f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f125372d = new java.util.HashMap();
        this.f125374f = true;
        kz5.c0.i(".ui.AppBrandPluginUI", ".launching.AppBrandLaunchProxyUI", ".ui.SnsAdNativeLandingPagesPreviewUI");
    }

    public final void O6(in5.s0 holder, r45.qt2 qt2Var, so2.y0 comment, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(comment, "comment");
        r45.ky0 advertisement_info = comment.f410703d.u0().getAdvertisement_info();
        if (advertisement_info == null || (str = advertisement_info.getString(3)) == null) {
            str = "";
        }
        zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
        java.lang.String string = qt2Var != null ? qt2Var.getString(0) : null;
        java.lang.String string2 = qt2Var != null ? qt2Var.getString(1) : null;
        java.lang.String string3 = qt2Var != null ? qt2Var.getString(2) : null;
        int integer = qt2Var != null ? qt2Var.getInteger(5) : 0;
        long j17 = comment.f410703d.field_feedId;
        int i18 = this.f125373e;
        int adapterPosition = holder.getAdapterPosition();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) qaVar;
        o3Var.getClass();
        java.lang.String report_json = comment.f410703d.u0().getReport_json();
        com.tencent.mm.autogen.mmdata.rpt.CommentItemClickStruct commentItemClickStruct = new com.tencent.mm.autogen.mmdata.rpt.CommentItemClickStruct();
        if (string == null) {
            string = "";
        }
        commentItemClickStruct.f55724d = commentItemClickStruct.b("SessionId", string, true);
        if (string2 == null) {
            string2 = "";
        }
        commentItemClickStruct.f55725e = commentItemClickStruct.b("ContextId", string2, true);
        if (string3 == null) {
            string3 = "";
        }
        commentItemClickStruct.f55726f = commentItemClickStruct.b("ClickTabContextId", string3, true);
        commentItemClickStruct.f55727g = integer;
        commentItemClickStruct.f55728h = commentItemClickStruct.b("feedid", pm0.v.u(j17), true);
        commentItemClickStruct.f55731k = o3Var.tk(i18);
        commentItemClickStruct.f55732l = commentItemClickStruct.b("reportJson", report_json != null ? r26.i0.t(report_json, ",", ";", false) : null, true);
        long j18 = adapterPosition - 1;
        if (j18 < 0) {
            j18 = 0;
        }
        commentItemClickStruct.f55733m = j18;
        commentItemClickStruct.f55734n = i17;
        commentItemClickStruct.f55735o = commentItemClickStruct.b("ad_report_data", r26.i0.t(str, ",", ";", false), true);
        int h17 = comment.h();
        if (h17 == 1 || h17 == 5) {
            commentItemClickStruct.f55729i = commentItemClickStruct.b("rootCommentid", pm0.v.u(comment.f410703d.t0()), true);
            commentItemClickStruct.f55730j = commentItemClickStruct.b("subCommentid", "", true);
        } else {
            if (h17 != 2) {
                return;
            }
            commentItemClickStruct.f55729i = commentItemClickStruct.b("rootCommentid", pm0.v.u(comment.f410703d.Y0()), true);
            commentItemClickStruct.f55730j = commentItemClickStruct.b("subCommentid", pm0.v.u(comment.f410703d.t0()), true);
        }
        commentItemClickStruct.k();
        o3Var.Zk(commentItemClickStruct);
    }

    public final cl0.g P6(so2.y0 y0Var) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        java.lang.String ext_info = (advertisement_info == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) advertisement_info.getCustom(0)) == null) ? null : finderJumpInfo.getExt_info();
        if (com.tencent.mm.sdk.platformtools.t8.K0(ext_info) || kotlin.jvm.internal.o.b("{}", ext_info)) {
            return new cl0.g();
        }
        kotlin.jvm.internal.o.d(ext_info);
        return new cl0.g(ext_info);
    }

    public final void Q6(in5.s0 holder, so2.y0 comment, boolean z17, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.f410703d.a1()) {
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = comment.f410703d;
            long j17 = yj0Var.field_feedId;
            java.lang.String str2 = yj0Var.field_dupFlag;
            long t07 = yj0Var.t0();
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
            int integer = V6.getInteger(5);
            r45.ky0 advertisement_info = comment.f410703d.u0().getAdvertisement_info();
            if (advertisement_info == null || (str = advertisement_info.getString(4)) == null) {
                str = "";
            }
            java.lang.String str3 = str;
            com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "onClick commentId=" + t07);
            i95.m c17 = i95.n0.c(zy2.qa.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.qa.r3((zy2.qa) c17, j17, str2, integer, t07, false, true, i17, P6(comment), str3, 0, 0, 0, 0, z17, 7680, null);
            O6(holder, V6, comment, 3);
        }
    }

    public final void R6(long j17, so2.y0 comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.f410703d.a1()) {
            long t07 = comment.f410703d.t0();
            com.tencent.mm.plugin.finder.report.t W6 = W6(j17, t07);
            W6.f125353c++;
            com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "onReplay commentId=" + t07 + " playCount=" + W6.f125353c);
        }
    }

    public final void S6(android.content.Context context, so2.y0 comment, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.f410703d.a1()) {
            if (this.f125375g) {
                com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "onStartExpose return because starting half screen activity");
                this.f125375g = false;
                return;
            }
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = comment.f410703d;
            long j17 = yj0Var.field_feedId;
            java.lang.String str2 = yj0Var.field_dupFlag;
            long t07 = yj0Var.t0();
            r45.ky0 advertisement_info = comment.f410703d.u0().getAdvertisement_info();
            if (advertisement_info == null || (str = advertisement_info.getString(4)) == null) {
                str = "";
            }
            java.lang.String str3 = str;
            W6(j17, t07).f125351a = java.lang.System.currentTimeMillis();
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            int integer = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6().getInteger(5);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartExpose commentId=");
            sb6.append(t07);
            sb6.append(", aid=");
            r45.ky0 advertisement_info2 = comment.f410703d.u0().getAdvertisement_info();
            sb6.append(advertisement_info2 != null ? java.lang.Long.valueOf(advertisement_info2.getLong(1)) : null);
            com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", sb6.toString());
            i95.m c17 = i95.n0.c(zy2.qa.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.qa.r3((zy2.qa) c17, j17, str2, integer, t07, false, false, 0, P6(comment), str3, 0, 0, 0, 0, z17, 7680, null);
        }
    }

    public final void T6(long j17, so2.y0 comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.f410703d.a1()) {
            long t07 = comment.f410703d.t0();
            com.tencent.mm.plugin.finder.report.t W6 = W6(j17, t07);
            W6.f125352b = java.lang.System.currentTimeMillis();
            W6.f125353c++;
            com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "onStartPlay commentId=" + t07 + " startPlayTimeMs=" + W6.f125352b + " playCount=" + W6.f125353c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0((r4 == null || (r4 = r4.getList(5)) == null || (r4 = (r45.c60) kz5.n0.Z(r4)) == null || (r4 = r4.getList(2)) == null || (r4 = (r45.s60) kz5.n0.Z(r4)) == null) ? null : r4.getString(0)) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(android.content.Context r22, so2.y0 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.u.U6(android.content.Context, so2.y0, boolean):void");
    }

    public final void V6(long j17, so2.y0 comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.f410703d.a1()) {
            long t07 = comment.f410703d.t0();
            com.tencent.mm.plugin.finder.report.t W6 = W6(j17, t07);
            if (W6.f125352b > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - W6.f125352b;
                com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "onStopPlay stats.historyPlayTimeMs=" + W6.f125355e + " timeDiff=" + currentTimeMillis);
                W6.f125355e = W6.f125355e + currentTimeMillis;
                W6.f125352b = 0L;
            }
            com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "onStopPlay commentId=" + t07);
        }
    }

    public final com.tencent.mm.plugin.finder.report.t W6(long j17, long j18) {
        java.util.HashMap hashMap = this.f125372d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('#');
        sb6.append(j18);
        java.lang.String sb7 = sb6.toString();
        java.lang.Object obj = hashMap.get(sb7);
        if (obj == null) {
            obj = new com.tencent.mm.plugin.finder.report.t(0L, 0L, 0, 0L, 0L, 31, null);
            hashMap.put(sb7, obj);
        }
        return (com.tencent.mm.plugin.finder.report.t) obj;
    }

    public final void X6(long j17, so2.y0 comment, long j18) {
        kotlin.jvm.internal.o.g(comment, "comment");
        if (comment.f410703d.a1()) {
            long t07 = comment.f410703d.t0();
            W6(j17, t07).f125354d = j18;
            com.tencent.mars.xlog.Log.i("Finder.CommentAdReportMgr", "updateVideoDuration commentId=" + t07 + " duration=" + j18);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f125374f = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f125374f = true;
    }
}
