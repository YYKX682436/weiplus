package uc4;

/* loaded from: classes4.dex */
public final class h1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final uc4.g1 f426417f;

    /* renamed from: g, reason: collision with root package name */
    public int f426418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f426417f = new uc4.g1(this, context);
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        super.a(view);
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onsight click ");
        xc4.p c18 = c();
        sb6.append(c18 != null ? c18.W0() : null);
        sb6.append(' ');
        xc4.p c19 = c();
        sb6.append(c19 != null ? c19.a1() : null);
        sb6.append(' ');
        xc4.p c27 = c();
        sb6.append(c27 != null ? java.lang.Integer.valueOf(c27.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.VideoClick", sb6.toString());
        com.tencent.mm.protocal.protobuf.TimeLineObject h17 = c17.h1();
        java.util.LinkedList linkedList = h17.ContentObj.f369840h;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.VideoClick", "the obj.ContentObj.MediaObjList is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) h17.ContentObj.f369840h.get(0);
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(jj4Var);
        kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
        java.lang.String str2 = "";
        java.lang.String concat = com.tencent.mm.vfs.w6.j(d17.concat(R)) ? d17.concat(R) : "";
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.U(jj4Var))) {
            str2 = d17 + ca4.z0.U(jj4Var);
        }
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
            concat = d17 + ca4.z0.Y(jj4Var);
            str2 = d17 + ca4.z0.a0(jj4Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.VideoClick", "click: sight:" + concat + ", thumb:" + str2);
        int[] iArr = new int[2];
        if (com.tencent.mm.ui.bk.y()) {
            view.getLocationOnScreen(iArr);
        } else {
            view.getLocationInWindow(iArr);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11444, 3);
        if (jj4Var.f377856e == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.VideoClick", "click to play fake sns video");
            android.content.Intent intent = new android.content.Intent();
            if (h17.videoTemplate == null) {
                intent.setClassName(b(), "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
            } else {
                intent.setClassName(b(), "com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoActivity");
            }
            intent.putExtra("intent_video_is_preview", false);
            intent.putExtra("intent_video_sns_local_id", com.tencent.mm.plugin.sns.storage.w2.m(c17.W0()));
            intent.putExtra("intent_video_sns_create_time", c17.getCreateTime());
            intent.putExtra("intent_left", iArr[0]);
            intent.putExtra("intent_top", iArr[1]);
            intent.putExtra("intent_width", width);
            intent.putExtra("intent_height", height);
            intent.putExtra("intent_video_thumb_path", str2);
            intent.putExtra("sns_position", this.f426418g);
            android.content.Context b17 = b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            str = "click";
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.VideoClick", "it not ad video, use online video activity to play.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToFullScreenUI", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            android.content.Intent intent2 = new android.content.Intent();
            xd4.k0 k0Var = xd4.k0.f453664a;
            int a17 = k0Var.a(b());
            str = "click";
            java.lang.String b18 = k0Var.b(a17, false);
            intent2.putExtra("intent_videopath", concat);
            intent2.putExtra("intent_thumbpath", str2);
            intent2.putExtra("intent_localid", c17.W0());
            intent2.putExtra("intent_isad", false);
            intent2.putExtra("intent_from_scene", 0);
            intent2.putExtra("intent_sns_scene", a17);
            intent2.putExtra("intent_session_id_sns", b18);
            intent2.putExtra("sns_video_scene", 2);
            gc4.n nVar = gc4.n.f270465a;
            r45.m1 m1Var = h17.actionInfo.f383556m;
            intent2.putExtra("intent_third_sdk_msg", nVar.b(m1Var.f380054d, m1Var.f380056f));
            intent2.putExtra("intent_publish_id", ca4.z0.s0(c17.y0()));
            intent2.putExtra("intent_bottom_height", com.tencent.mm.ui.bl.c(b()));
            intent2.putExtra("img_gallery_left", iArr[0]);
            intent2.putExtra("img_gallery_top", iArr[1]);
            intent2.putExtra("img_gallery_width", width);
            intent2.putExtra("img_gallery_height", height);
            intent2.putExtra("sns_position", this.f426418g);
            if (!pc4.d.f353410a.d(c17.h1()) || c17.isAd()) {
                intent2.setClass(b(), com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.class);
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView b19 = xd4.o0.d().b(h17.Id);
                if (b19 != null && b19.w()) {
                    intent2.putExtra("intent_fromplayingvideo", true);
                    intent2.putExtra("intent_fromplayingvideo_tlobjid", h17.Id);
                    intent2.putExtra("intent_session_id", b19.getSessionId());
                    intent2.putExtra("intent_session_timestamp", b19.getSessionTimestamp());
                }
                android.content.Context b27 = b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b27, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "jumpToFullScreenUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b27.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(b27, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "jumpToFullScreenUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                android.content.Context b28 = b();
                kotlin.jvm.internal.o.e(b28, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) b28).overridePendingTransition(0, 0);
            } else {
                if (view instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) {
                    intent2.putExtra("intent_fromplayingvideo", ((com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) view).getFirstFrameRender());
                }
                com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity.f168350d.a(b(), intent2);
            }
            com.tencent.mm.plugin.sns.ui.listener.i.Q(b(), c17.h1());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFullScreenUI", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        }
        n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        return this.f426417f;
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        if (menuItem.getItemId() == 18 || menuItem.getItemId() == 19) {
            n();
        } else if (menuItem.getItemId() == 10) {
            xc4.p c17 = c();
            if (c17 == null) {
                super.i(menuItem, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
                return false;
            }
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "FavFeedCount", c17.a1());
        }
        super.i(menuItem, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        return false;
    }

    @Override // uc4.g
    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        kotlin.jvm.internal.o.g(info, "info");
        super.m(s0Var, info, i17);
        this.f426418g = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }

    public final void n() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        java.lang.String a17 = c17.a1();
        xc4.p c18 = c();
        java.lang.Integer valueOf = c18 != null ? java.lang.Integer.valueOf(c18.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 15) {
            str = "ClickSightFeedCount";
        } else {
            if (valueOf == null || valueOf.intValue() != 5) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
                return;
            }
            str = "ClickVideoFeedCount";
        }
        zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        fVar.Di(12076, str, a17);
        fVar.Ni(12076, "BrowseFullScreenSightTime");
        yc4.b0 b0Var = yc4.b0.f460839a;
        xc4.p c19 = c();
        b0Var.b(c19 != null ? c19.a1() : "");
        xc4.p c27 = c();
        b0Var.c(c27 != null ? c27.a1() : "", 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }
}
