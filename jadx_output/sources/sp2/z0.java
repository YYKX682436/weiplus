package sp2;

/* loaded from: classes2.dex */
public final class z0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411295d;

    public z0(sp2.o2 o2Var) {
        this.f411295d = o2Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        org.json.JSONObject d17;
        java.lang.String num;
        r45.s92 s92Var;
        r45.s92 s92Var2;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        r45.s92 s92Var3;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        sp2.o2 o2Var = this.f411295d;
        java.lang.Object obj = o2Var.f411145m.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        r45.qt2 qt2Var = o2Var.f411127d;
        java.lang.String string = qt2Var.getString(2);
        java.lang.String str2 = string == null ? "" : string;
        com.tencent.mm.ui.MMActivity activity = o2Var.f411121a;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(rq2.w.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        rq2.w wVar = (rq2.w) a17;
        boolean z17 = j5Var instanceof wp2.b;
        cq2.r rVar = cq2.r.f221444a;
        if (z17 || (j5Var instanceof vp2.e0)) {
            cl0.g gVar = new cl0.g();
            boolean z18 = j5Var instanceof vp2.e0;
            int i19 = z18 ? 2 : 1;
            int i27 = wVar.f398904f;
            if (i27 < 0) {
                i27 = 0;
            }
            gVar.s("page_index", java.lang.Integer.valueOf(i27));
            gVar.s("card_type", java.lang.Integer.valueOf(i19));
            int i28 = wVar.f398904f;
            if (i28 < 0) {
                i28 = 0;
            }
            gVar.s("card_index", java.lang.String.valueOf(i18 - i28));
            wp2.b bVar = z17 ? (wp2.b) j5Var : null;
            gVar.s("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? "" : java.lang.Long.valueOf(liveInfo.getLong(0)));
            vp2.e0 e0Var = z18 ? (vp2.e0) j5Var : null;
            if (e0Var == null || (oa2Var = e0Var.f438917d) == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null || (str = h32Var.getString(4)) == null) {
                str = "";
            }
            gVar.s("Noticeid", str);
            r45.dk2 dk2Var = o2Var.A;
            if (dk2Var != null && (s92Var2 = (r45.s92) dk2Var.getCustom(12)) != null) {
                gVar.s("card_size", s92Var2.getInteger(0) == 0 ? "16:9" : "4:3");
            }
            boolean z19 = j5Var instanceof vp2.u;
            if (z19) {
                gVar.s("ref_objectid", pm0.v.u(((vp2.u) j5Var).getFeedObject().getId()));
            }
            java.lang.String string2 = qt2Var.getString(1);
            java.lang.String str3 = z19 ? "play_back_video_card" : "main_page_recmd_card";
            java.lang.String gVar2 = gVar.toString();
            wVar.Q6(string2, str3, gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int o17 = o2Var.o(i18, j5Var);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
            r45.dk2 dk2Var2 = o2Var.A;
            d17 = rVar.d(context, o17, baseFinderFeed, (dk2Var2 == null || (s92Var = (r45.s92) dk2Var2.getCustom(12)) == null) ? 0 : s92Var.getInteger(0), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? true : o2Var.v(), (r21 & 128) != 0);
            o2Var.i(d17, j5Var);
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) view.findViewWithTag("nearby-live-preview-view-tag");
            if (nearbyLivePreviewView != null) {
                d17.put("playstatus", nearbyLivePreviewView.getPlayStatus());
                ko0.t tVar = ko0.t.f309903a;
                mn0.b0 player = nearbyLivePreviewView.getPlayer();
                java.lang.String d18 = tVar.d(player != null ? ((mn0.y) player).f329815q : null);
                if (d18 == null) {
                    d18 = "";
                }
                d17.put("streamid", d18);
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            wp2.b bVar2 = z17 ? (wp2.b) j5Var : null;
            long j17 = i18;
            ml2.x1 x1Var = ml2.x1.f328207n;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            java.lang.String str4 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num;
            java.lang.String jSONObject = d17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            j0Var.sj(bVar2, j17, x1Var, str4, "", "", jSONObject);
        } else if ((j5Var instanceof vp2.c) && ((vp2.c) j5Var).f438910d.B == 2) {
            java.lang.String string3 = qt2Var.getString(1);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            int i29 = wVar.f398904f;
            if (i29 < 0) {
                i29 = 0;
            }
            jSONObject2.put("card_index", i18 - i29);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            wVar.Q6(string3, "main_page_chatroom_card", r26.i0.t(jSONObject3, ",", ";", false));
        }
        r45.dk2 dk2Var3 = o2Var.A;
        android.os.Bundle f17 = cq2.r.f(rVar, i18, j5Var, view, (dk2Var3 == null || (s92Var3 = (r45.s92) dk2Var3.getCustom(12)) == null) ? 0 : s92Var3.getInteger(0), null, 0, o2Var.v(), false, 176, null);
        sp2.o2.a(o2Var, j5Var, f17);
        tp2.f.d(o2Var.E, j5Var, i17, i18, view, o2Var.f411145m, str2, 3, f17, null, null, 0L, 1792, null);
    }
}
