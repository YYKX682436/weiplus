package pg2;

@j95.b
/* loaded from: classes3.dex */
public final class j0 extends i95.w implements c50.s0 {

    /* renamed from: d, reason: collision with root package name */
    public long f354136d;

    public static final void Ai(pg2.j0 j0Var, ug5.v vVar, boolean z17) {
        j0Var.getClass();
        ug5.g gVar = vVar.f427658a;
        float f17 = (gVar.A * 1000.0f) / ((float) gVar.f427602p);
        android.view.Window window = gVar.f427588b;
        int a17 = window != null ? ug5.x.a(window) : 0;
        ug5.b action = vVar.f427658a.f427587a;
        kotlin.jvm.internal.o.g(action, "action");
        if (ug5.b.f427582e == action) {
            com.tencent.mars.xlog.Log.i("ViewFluentReporter", "return for exit");
            ez2.g.f257902a = null;
        } else {
            ez2.e eVar = ez2.g.f257902a;
            if (eVar != null) {
                eVar.h(z17, f17, a17);
            }
        }
    }

    public static void aj(pg2.j0 j0Var, ug5.v vVar, mn0.b0 b0Var, c50.e1 e1Var, yz5.a aVar, int i17, java.lang.Object obj) {
        com.tencent.rtmp.ui.TXCloudVideoView videoView;
        if ((i17 & 8) != 0) {
            aVar = null;
        }
        yz5.a aVar2 = aVar;
        j0Var.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "handlePlayerInPlaying==start");
        com.tencent.mm.live.core.view.LiveVideoViewCompatCover liveVideoViewCompatCover = (com.tencent.mm.live.core.view.LiveVideoViewCompatCover) vVar.f427660c;
        if (liveVideoViewCompatCover == null || (videoView = liveVideoViewCompatCover.getVideoView()) == null) {
            return;
        }
        ((mn0.y) b0Var).O(videoView, new pg2.f0(e1Var, vVar, aVar2, elapsedRealtime));
    }

    public static final jz5.l wi(pg2.j0 j0Var, android.content.Context context, int i17, int i18) {
        j0Var.getClass();
        if (i17 <= 0 || i18 <= 0) {
            return new jz5.l(-1, -1);
        }
        boolean z17 = i17 >= i18;
        int i19 = com.tencent.mm.ui.bl.b(context).x;
        int i27 = com.tencent.mm.ui.bl.b(context).y;
        if (i19 < i27) {
            return new jz5.l(-1, java.lang.Integer.valueOf(z17 ? (i18 * i19) / i17 : -1));
        }
        return new jz5.l(java.lang.Integer.valueOf(z17 ? (i17 * i27) / i18 : -1), -1);
    }

    public java.lang.Object Bi(r45.nw1 nw1Var) {
        r45.ma4 ma4Var;
        com.tencent.mm.protobuf.g gVar;
        if (nw1Var == null || (ma4Var = (r45.ma4) nw1Var.getCustom(23)) == null || (gVar = ma4Var.f380300m) == null) {
            return null;
        }
        r45.na4 na4Var = new r45.na4();
        na4Var.parseFrom(gVar.g());
        return na4Var.f381197f;
    }

    public java.lang.Object Di(java.lang.String streamId, java.lang.String nickname, long j17, long j18, r45.nw1 nw1Var) {
        kotlin.jvm.internal.o.g(streamId, "streamId");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        return new mn0.l0(streamId, nickname, j17, j18, android.os.SystemClock.elapsedRealtime(), nw1Var);
    }

    public void Ni(android.app.Activity activity, long j17, android.view.View clickView, android.graphics.Rect targetRect, java.util.Map extraParams, yz5.p enterLiveCall) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(clickView, "clickView");
        kotlin.jvm.internal.o.g(targetRect, "targetRect");
        kotlin.jvm.internal.o.g(extraParams, "extraParams");
        kotlin.jvm.internal.o.g(enterLiveCall, "enterLiveCall");
        if (targetRect.isEmpty()) {
            targetRect.set(qg2.d.f362793a.b(clickView.getWidth(), clickView.getHeight(), false));
        }
        ug5.c cVar = new ug5.c(ug5.b.f427581d);
        cVar.f427584a.f427606t = -16777216;
        cVar.f427584a.f427596j.set(ug5.x.c(clickView, false, 1, null));
        cVar.i(targetRect);
        ug5.g gVar = cVar.f427584a;
        gVar.f427602p = 240L;
        gVar.f427604r = 3000L;
        gVar.f427611y = true;
        cVar.b(activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn));
        cVar.f427584a.f427588b = activity.getWindow();
        cVar.g(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.class, false);
        cVar.f427584a.f427610x = false;
        cVar.f(new android.view.animation.LinearInterpolator());
        cVar.c("key_feed_id", java.lang.Long.valueOf(j17));
        cVar.d(extraParams);
        cVar.f427584a.f427590d = new pg2.r(clickView, targetRect);
        cVar.f427584a.f427591e = pg2.s.f354182d;
        cVar.f427584a.f427592f = new pg2.t(this, enterLiveCall, j17);
        cVar.a().g(activity);
    }

    public void Ri(android.app.Activity activity, long j17, android.view.View clickView, android.graphics.Rect targetRect, int i17, int i18, mn0.b0 player, java.util.Map extraParams, c50.e1 e1Var, yz5.q enterLiveCall) {
        kotlin.jvm.internal.o.g(clickView, "clickView");
        kotlin.jvm.internal.o.g(targetRect, "targetRect");
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(extraParams, "extraParams");
        kotlin.jvm.internal.o.g(enterLiveCall, "enterLiveCall");
        Zi(e1Var, ug5.x.c(clickView, false, 1, null), targetRect, activity, j17, i17, i18, player, extraParams, enterLiveCall);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r5 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.p72 Ui(android.content.Context r5, long r6, long r8) {
        /*
            r4 = this;
            r45.p72 r0 = new r45.p72
            r0.<init>()
            java.lang.Class<n30.q> r1 = n30.q.class
            i95.m r1 = i95.n0.c(r1)
            n30.q r1 = (n30.q) r1
            m30.m r1 = (m30.m) r1
            r1.getClass()
            java.lang.String r1 = a52.a.f1584l
            if (r5 == 0) goto L1e
            boolean r2 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r5 != 0) goto L24
        L1e:
            com.tencent.mm.plugin.finder.assist.v1 r5 = com.tencent.mm.plugin.finder.assist.v1.f102611a
            android.content.Context r5 = r5.b()
        L24:
            boolean r2 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L4f
            r2 = r5
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            pf5.z r3 = pf5.z.f353948a
            pf5.v r2 = r3.a(r2)
            java.lang.Class<zy2.ra> r3 = zy2.ra.class
            pf5.c r2 = r2.c(r3)
            zy2.ra r2 = (zy2.ra) r2
            com.tencent.mm.plugin.finder.viewmodel.component.ny r2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r2
            int r2 = r2.f135380n
            if (r2 != 0) goto L49
            boolean r3 = r5 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI
            if (r3 == 0) goto L49
            com.tencent.mm.plugin.finder.ui.MMFinderUI r5 = (com.tencent.mm.plugin.finder.ui.MMFinderUI) r5
            int r2 = r5.getD()
        L49:
            if (r2 == 0) goto L4f
            java.lang.String r1 = java.lang.String.valueOf(r2)
        L4f:
            r5 = 0
            r0.set(r5, r1)
            r1 = 3
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.set(r1, r6)
            r6 = 4
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r0.set(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "SurfaceView_"
            r6.<init>(r7)
            long r7 = c01.id.c()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 1
            r0.set(r7, r6)
            r6 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.set(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg2.j0.Ui(android.content.Context, long, long):r45.p72");
    }

    public final void Vi(co0.s sVar, qo0.c cVar, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "[onChangeResolution] videoWidth=" + i17 + " videoHeight=" + i18);
        if (sVar != null) {
            sVar.U1 = i17;
        }
        if (sVar != null) {
            sVar.V1 = i18;
        }
        if (sVar != null) {
            sVar.X1 = (i17 * 1.0f) / i18;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EVT_PARAM1", i17);
        bundle.putInt("EVT_PARAM2", i18);
        cVar.statusChange(qo0.b.Q1, bundle);
    }

    public final void Zi(c50.e1 e1Var, android.graphics.Rect rect, android.graphics.Rect rect2, android.app.Activity activity, long j17, int i17, int i18, mn0.b0 b0Var, java.util.Map map, yz5.q qVar) {
        if (rect2.isEmpty()) {
            rect2.set(qg2.d.f362793a.b(i17, i18, false));
        }
        ug5.c cVar = new ug5.c(ug5.b.f427581d);
        cVar.f427584a.f427606t = e1Var != null ? e1Var.f38597a : -16777216;
        cVar.e(rect);
        cVar.i(rect2);
        long j18 = e1Var != null ? e1Var.f38598b : 240L;
        ug5.g gVar = cVar.f427584a;
        gVar.f427602p = j18;
        gVar.f427604r = 3000L;
        gVar.f427611y = false;
        cVar.f427584a.f427588b = activity != null ? activity.getWindow() : null;
        cVar.f427584a.f427589c = activity != null ? activity.getWindow() : null;
        cVar.g(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2.class, false);
        cVar.f(new android.view.animation.LinearInterpolator());
        cVar.c("key_feed_id", java.lang.Long.valueOf(j17));
        cVar.c("key_video_w", java.lang.Integer.valueOf(i17));
        cVar.c("key_video_h", java.lang.Integer.valueOf(i18));
        cVar.c("key_player", b0Var);
        cVar.d(map);
        cVar.f427584a.f427591e = pg2.b0.f354088d;
        cVar.f427584a.f427590d = new pg2.c0(map, j17);
        cVar.f427584a.f427592f = new pg2.e0(b0Var, e1Var, qVar, j17, this);
        cVar.a().g(activity);
    }

    public boolean wh() {
        ae2.b2 b2Var = ae2.b2.f3461a;
        return (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3470e0).getValue()).r()).intValue() != 1 || com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) ? false : true;
    }
}
