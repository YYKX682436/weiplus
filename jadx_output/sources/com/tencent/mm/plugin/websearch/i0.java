package com.tencent.mm.plugin.websearch;

/* loaded from: classes4.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f181539d;

    public i0(com.tencent.mm.plugin.websearch.q0 q0Var, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        this.f181539d = timeLineObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ee0.v4) o4Var).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exportVideoPlay", "com.tencent.mm.feature.sns.SnsUtilService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        fe0.o4 o4Var2 = (fe0.o4) i95.n0.c(fe0.o4.class);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f181539d;
        java.lang.String Ai = ((ee0.v4) o4Var2).Ai(timeLineObject.Id);
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(Ai);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "onsight click but info is null localid %s", Ai);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            java.util.LinkedList linkedList = timeLineObject.ContentObj.f369840h;
            if (linkedList == null || linkedList.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                r45.jj4 jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
                m21.w.c(717);
                ca4.z0.T(k17);
                k17.isAd();
                k17.getUxinfo();
                java.lang.String str3 = jj4Var.f377855d;
                m21.w c17 = m21.w.c(745);
                ca4.z0.T(k17);
                k17.isAd();
                java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
                java.lang.String R = ca4.z0.R(jj4Var);
                if (com.tencent.mm.vfs.w6.j(d17 + R)) {
                    str = d17 + R;
                    str2 = d17 + ca4.z0.U(jj4Var);
                } else {
                    str = "";
                    str2 = "";
                }
                if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
                    str = d17 + ca4.z0.Y(jj4Var);
                    str2 = d17 + ca4.z0.a0(jj4Var);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11444, 3);
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "it not ad video, use online video activity to play.");
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(268435456);
                intent.putExtra("intent_videopath", str);
                intent.putExtra("intent_thumbpath", str2);
                intent.putExtra("intent_localid", Ai);
                intent.putExtra("intent_isad", false);
                intent.putExtra("intent_from_scene", 1);
                intent.putExtra("sns_video_scene", 5);
                gc4.n nVar = gc4.n.f270465a;
                r45.m1 m1Var = timeLineObject.actionInfo.f383556m;
                intent.putExtra("intent_third_sdk_msg", nVar.b(m1Var.f380054d, m1Var.f380056f));
                intent.putExtra("intent_publish_id", ca4.z0.s0(k17.field_snsId));
                intent.putExtra("intent_bottom_height", com.tencent.mm.ui.bl.c(context));
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView b17 = xd4.o0.d().b(timeLineObject.Id);
                if (b17 != null && b17.w()) {
                    intent.putExtra("intent_fromplayingvideo", true);
                    intent.putExtra("intent_fromplayingvideo_tlobjid", timeLineObject.Id);
                    intent.putExtra("intent_session_id", b17.getSessionId());
                    intent.putExtra("intent_session_timestamp", b17.getSessionTimestamp());
                }
                c17.g(intent);
                if (!pc4.d.f353410a.d(timeLineObject) || k17.isAd()) {
                    intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.class);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "exportVideoPlay", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "exportVideoPlay", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity.f168350d.a(context, intent);
                }
                com.tencent.mm.plugin.sns.ui.listener.i.Q(context, k17.getTimeLine());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exportVideoPlay", "com.tencent.mm.feature.sns.SnsUtilService");
    }
}
