package df2;

/* loaded from: classes3.dex */
public final class wt extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public long f231710p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f231711q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231712r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231713s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f231714t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231711q = new androidx.lifecycle.j0();
    }

    public static final void m7(df2.wt wtVar, r45.h32 h32Var, int i17) {
        java.lang.String str = ((mm2.c1) wtVar.business(mm2.c1.class)).f328852o;
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string = h32Var.getString(4);
        if (string == null) {
            string = "";
        }
        pq5.g l17 = ((b92.d1) zbVar).Ri(str, string, i17, null, 104).l();
        java.lang.Object O6 = wtVar.O6();
        im5.b bVar = O6 instanceof im5.b ? (im5.b) O6 : null;
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.h(new df2.rt(i17, h32Var, str, wtVar));
    }

    @Override // df2.l9
    public void b5() {
        n7("autoDismiss", false);
    }

    @Override // df2.l9
    public java.lang.String getTag() {
        return "LiveReserveNoticeGuideController";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dismissBubble: source="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = ", onViewUnMount="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveReserveNoticeGuideController"
            com.tencent.mars.xlog.Log.i(r1, r0)
            androidx.lifecycle.j0 r0 = r4.f231711q
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L3a
            android.view.View r6 = r4.f7(r4)
            r3 = 0
            if (r6 == 0) goto L2f
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L2f
            r3 = r1
        L2f:
            if (r3 != 0) goto L32
            goto L3a
        L32:
            java.lang.Object r6 = r0.getValue()
            r0.setValue(r6)
            goto L3d
        L3a:
            r0.setValue(r2)
        L3d:
            r4.a7(r5, r4)
            kotlinx.coroutines.r2 r5 = r4.f231712r
            if (r5 == 0) goto L47
            kotlinx.coroutines.p2.a(r5, r2, r1, r2)
        L47:
            kotlinx.coroutines.r2 r5 = r4.f231713s
            if (r5 == 0) goto L4e
            kotlinx.coroutines.p2.a(r5, r2, r1, r2)
        L4e:
            r4.f231712r = r2
            r4.f231713s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wt.n7(java.lang.String, boolean):void");
    }

    public final void o7(int i17, java.lang.String noticeId) {
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327244l2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("notice_id", noticeId);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f231714t = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f231711q.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.st(this));
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        n7("onViewUnmount", true);
        super.onViewUnmount(pluginLayout);
    }

    public final void p7(boolean z17) {
        if (!z17) {
            android.widget.TextView c76 = c7();
            if (c76 != null) {
                c76.setText(com.tencent.mm.R.string.mn6);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView b76 = b7();
            if (b76 == null) {
                return;
            }
            b76.setVisibility(8);
            return;
        }
        android.widget.TextView c77 = c7();
        if (c77 != null) {
            c77.setText(com.tencent.mm.R.string.mn7);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView b77 = b7();
        if (b77 != null) {
            b77.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView b78 = b7();
        if (b78 != null) {
            b78.setImageResource(com.tencent.mm.R.raw.check_mark_regular);
        }
    }
}
