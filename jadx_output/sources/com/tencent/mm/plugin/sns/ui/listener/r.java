package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class r extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169847d;

    public r(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169847d = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        if (view != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj)) {
            com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) view.getTag();
            java.lang.String str = ojVar.f170102a;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
            if (k17 != null && k17.isAd()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "photoMenuListner skip for ad, localId=" + str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
                return;
            }
            j45.l.g("favorite");
            com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169847d;
            if (k17 != null && !k17.isAd()) {
                contextMenu.add(0, 2, 0, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getString(com.tencent.mm.R.string.hjg));
            }
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = str;
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                contextMenu.add(0, 18, 0, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getString(com.tencent.mm.R.string.f490508x2));
            }
            com.tencent.mm.plugin.sns.abtest.a.b(contextMenu, k17);
            android.view.MenuItem add = contextMenu.add(0, 21, 0, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getString(com.tencent.mm.R.string.j_f));
            int[] iArr = new int[2];
            int width = view.getWidth();
            int height = view.getHeight();
            view.getLocationInWindow(iArr);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
            add.setIntent(intent);
            if ((com.tencent.mm.plugin.sns.ui.listener.i.e(iVar) instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) || (com.tencent.mm.plugin.sns.ui.listener.i.e(iVar) instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI)) {
                ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                if (!su4.r2.l()) {
                    if (k17.getTimeLine().isExcerpt || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 5)) {
                        contextMenu.add(0, 26, 0, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).getString(com.tencent.mm.R.string.f491241cg4));
                    } else {
                        contextMenu.add(0, 36, 0, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(2, 5));
                        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(2, 5, tg0.e1.f419061d);
                    }
                    int i17 = com.tencent.mm.plugin.sns.ui.listener.i.e(iVar) instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI ? 10 : 7;
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
                    r45.jj4 jj4Var = ojVar.f170103b < timeLine.ContentObj.f369840h.size() ? (r45.jj4) timeLine.ContentObj.f369840h.get(ojVar.f170103b) : new r45.jj4();
                    com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
                    chatImageWebSearchActionStruct.t("");
                    chatImageWebSearchActionStruct.r(ca4.z0.t0(k17.field_snsId));
                    chatImageWebSearchActionStruct.f55628f = i17;
                    chatImageWebSearchActionStruct.f55627e = 1;
                    chatImageWebSearchActionStruct.f55629g = 81;
                    chatImageWebSearchActionStruct.q("");
                    chatImageWebSearchActionStruct.p("");
                    chatImageWebSearchActionStruct.s(kk.k.e(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.J(jj4Var)));
                    chatImageWebSearchActionStruct.f55635m = java.lang.System.currentTimeMillis();
                    chatImageWebSearchActionStruct.k();
                    ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).getClass();
                    su4.k3.m(chatImageWebSearchActionStruct);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
            return false;
        }
        java.lang.String str = ((com.tencent.mm.plugin.sns.ui.oj) view.getTag()).f170102a;
        this.f169847d.f169809l.e(view, str, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str).getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        return true;
    }
}
