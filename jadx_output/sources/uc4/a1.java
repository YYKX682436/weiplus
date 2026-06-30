package uc4;

/* loaded from: classes4.dex */
public final class a1 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.b1 f426377e;

    public a1(android.content.Context context, uc4.b1 b1Var) {
        this.f426376d = context;
        this.f426377e = b1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        if (v17.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj) {
            java.lang.Object tag = v17.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) tag;
            java.lang.String str = ojVar.f170102a;
            kotlin.jvm.internal.o.e(str, "null cannot be cast to non-null type kotlin.String");
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
            int i17 = ojVar.f170103b;
            java.util.HashMap hashMap = sb4.z.f405591d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            com.tencent.mm.plugin.sns.model.l4.Uj().post(new sb4.b0(k17, i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            sb4.z.g(k17, ojVar.f170103b);
            j45.l.g("favorite");
            android.content.Context context = this.f426376d;
            if (k17 != null && !k17.isAd()) {
                menu.add(0, 2, 0, context.getString(com.tencent.mm.R.string.hjg));
            }
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = str;
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                menu.add(0, 18, 0, context.getString(com.tencent.mm.R.string.f490508x2));
            }
            com.tencent.mm.plugin.sns.abtest.a.b(menu, k17);
            android.view.MenuItem add = menu.add(0, 21, 0, context.getString(com.tencent.mm.R.string.j_f));
            kotlin.jvm.internal.o.f(add, "add(...)");
            int[] iArr = new int[2];
            int width = v17.getWidth();
            int height = v17.getHeight();
            v17.getLocationInWindow(iArr);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
            add.setIntent(intent);
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (!su4.r2.l()) {
                if (((k17 == null || (timeLine = k17.getTimeLine()) == null || !timeLine.isExcerpt) ? false : true) || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 5)) {
                    menu.add(0, 26, 0, context.getString(com.tencent.mm.R.string.f491241cg4));
                } else {
                    menu.add(0, 36, 0, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(2, 5));
                    ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(2, 5, tg0.e1.f419061d);
                }
                kotlin.jvm.internal.o.d(k17);
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = k17.getTimeLine();
                kotlin.jvm.internal.o.f(timeLine2, "getTimeLine(...)");
                r45.jj4 jj4Var = ojVar.f170103b < timeLine2.ContentObj.f369840h.size() ? (r45.jj4) timeLine2.ContentObj.f369840h.get(ojVar.f170103b) : new r45.jj4();
                com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct();
                chatImageWebSearchActionStruct.t("");
                chatImageWebSearchActionStruct.r(ca4.z0.t0(k17.field_snsId));
                chatImageWebSearchActionStruct.f55628f = 10;
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        kotlin.jvm.internal.o.g(view, "view");
        if (!(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            return false;
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
        java.lang.String str = ((com.tencent.mm.plugin.sns.ui.oj) tag).f170102a;
        kotlin.jvm.internal.o.e(str, "null cannot be cast to non-null type kotlin.String");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineOnCreateContextMenuListener", "onbindOnSelectedView error,localId:".concat(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            return true;
        }
        this.f426377e.e().e(view, str, k17.getTimeLine());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        return true;
    }
}
