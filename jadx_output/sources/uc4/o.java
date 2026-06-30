package uc4;

/* loaded from: classes4.dex */
public final class o extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f426437f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f426438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426437f = jz5.h.b(new uc4.k(this, context));
        this.f426438g = "";
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        xc4.p c17 = c();
        java.lang.String userName = c17 != null ? c17.getUserName() : null;
        if (userName == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return;
        }
        this.f426438g = userName;
        com.tencent.mm.autogen.events.SnsJumpProfileEvent snsJumpProfileEvent = new com.tencent.mm.autogen.events.SnsJumpProfileEvent();
        java.lang.String str2 = this.f426438g;
        am.cw cwVar = snsJumpProfileEvent.f54820g;
        cwVar.f6406a = str2;
        xc4.p c18 = c();
        cwVar.f6410e = c18 != null ? c18.a1() : "";
        xc4.p c19 = c();
        cwVar.f6409d = (c19 == null || (h17 = c19.h1()) == null || (a90Var = h17.ContentObj) == null) ? 0 : a90Var.f369837e;
        xc4.p c27 = c();
        cwVar.f6408c = c27 != null ? c27.isWsFold() : false;
        xc4.p c28 = c();
        if (c28 == null || (str = c28.getUserName()) == null) {
            str = "";
        }
        cwVar.f6411f = str;
        if (b() instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
            cwVar.f6407b = 1;
        } else if ((b() instanceof com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI) || (b() instanceof com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3)) {
            cwVar.f6407b = 2;
        }
        snsJumpProfileEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        xc4.p c29 = c();
        java.lang.String a17 = c29 != null ? c29.a1() : "";
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickAlbumCount", this.f426438g);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickAvatarFeedIdCount", a17);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f426438g, 6L);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f426438g, 11L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuCreator", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        android.view.View.OnCreateContextMenuListener onCreateContextMenuListener = (android.view.View.OnCreateContextMenuListener) ((jz5.n) this.f426437f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuCreator", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        return onCreateContextMenuListener;
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return false;
        }
        java.lang.String userName = c17.getUserName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(userName)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            uc4.g.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_PERMISSION");
            com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent snsJumpPermissionSettingEvent = new com.tencent.mm.autogen.events.SnsJumpPermissionSettingEvent();
            am.bw bwVar = snsJumpPermissionSettingEvent.f54819g;
            bwVar.f6291a = userName;
            bwVar.f6292b = c17.y0();
            snsJumpPermissionSettingEvent.e();
        } else if (itemId == 1) {
            uc4.g.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_EXPOSE");
            com.tencent.mm.autogen.events.SnsJumpReportEvent snsJumpReportEvent = new com.tencent.mm.autogen.events.SnsJumpReportEvent();
            long y07 = c17.y0();
            am.dw dwVar = snsJumpReportEvent.f54821g;
            dwVar.f6504b = y07;
            dwVar.f6503a = c17.getUserName();
            snsJumpReportEvent.e();
        } else if (itemId == 2) {
            uc4.g.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_DETAIL");
            n();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        return true;
    }

    @Override // uc4.g
    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        android.view.View h17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        kotlin.jvm.internal.o.g(info, "info");
        super.m(s0Var, info, i17);
        if (kotlin.jvm.internal.o.b(info.getUserName(), com.tencent.mm.plugin.sns.model.l4.sj())) {
            android.view.View h18 = h();
            if (h18 != null) {
                h18.setOnLongClickListener(null);
            }
            int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if (((i18 == 788529167 || i18 == 788529166) || z65.c.a()) && (h17 = h()) != null) {
                h17.setOnLongClickListener(new uc4.n(this));
            }
        } else {
            uc4.g.l(this, h(), true, true, false, 8, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }

    public final void n() {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("position:" + j() + '\n');
        sb6.append("hash:" + hashCode() + '\n');
        sb6.append("displayName:" + c17.Q0() + '\n');
        sb6.append("username:" + c17.getUserName() + '\n');
        sb6.append("sns_id:" + c17.a1() + '\n');
        sb6.append("local_id:" + c17.W0() + '\n');
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = c17.h1();
        com.tencent.mm.ui.widget.dialog.j0 j0Var = null;
        java.util.LinkedList<r45.jj4> linkedList = (h17 == null || (a90Var = h17.ContentObj) == null) ? null : a90Var.f369840h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (linkedList != null) {
            for (r45.jj4 jj4Var : linkedList) {
                sb7.append(jj4Var.f377855d);
                if (!android.text.TextUtils.isEmpty(jj4Var.f377879y0)) {
                    sb7.append(" [uhd]");
                }
                if (!android.text.TextUtils.isEmpty(jj4Var.A1)) {
                    sb7.append(" [hd]");
                }
                if (!android.text.TextUtils.isEmpty(jj4Var.f377858g)) {
                    sb7.append(" [0]");
                }
                sb7.append("\n");
            }
        }
        sb6.append("media_list:\n" + ((java.lang.Object) sb7) + '\n');
        android.widget.TextView textView = new android.widget.TextView(b());
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 13.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(i65.a.d(b(), com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int h18 = i65.a.h(b(), com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(h18, h18, h18, h18);
        android.content.Context b17 = b();
        uc4.l lVar = uc4.l.f426428d;
        if (!(b17 instanceof android.app.Activity) || !((android.app.Activity) b17).isFinishing()) {
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = null;
            aVar.L = textView;
            aVar.G = lVar;
            j0Var = new com.tencent.mm.ui.widget.dialog.j0(b17, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            db5.e1.a(b17, j0Var);
        }
        j0Var.A("复制", true, new uc4.m(this, sb6));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }
}
