package iq2;

/* loaded from: classes2.dex */
public final class r implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293760d;

    public r(iq2.d0 d0Var) {
        this.f293760d = d0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        org.json.JSONObject d17;
        java.lang.String num;
        r45.s92 s92Var;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        r45.s92 s92Var2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        iq2.d0 d0Var = this.f293760d;
        java.lang.Object obj = d0Var.f293732p.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        r45.qt2 qt2Var = d0Var.f293730n;
        java.lang.String string = qt2Var.getString(2);
        java.lang.String str2 = string == null ? "" : string;
        tp2.f fVar = d0Var.f293740x;
        java.util.ArrayList arrayList = d0Var.f293732p;
        cq2.r rVar = cq2.r.f221444a;
        r45.dk2 dk2Var = d0Var.f293736t;
        tp2.f.d(fVar, j5Var, i17, i18, view, arrayList, str2, 3, cq2.r.f(rVar, i18, j5Var, view, (dk2Var == null || (s92Var2 = (r45.s92) dk2Var.getCustom(12)) == null) ? 0 : s92Var2.getInteger(0), d0Var.f293719c, d0Var.f(), false, false, 192, null), null, d0Var.f293719c, 0L, 1280, null);
        com.tencent.mm.ui.MMActivity activity = d0Var.f293717a;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(rq2.w.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        rq2.w wVar = (rq2.w) a17;
        boolean z17 = j5Var instanceof wp2.b;
        if (!z17 && !(j5Var instanceof vp2.e0)) {
            if ((j5Var instanceof vp2.c) && ((vp2.c) j5Var).f438910d.B == 2) {
                java.lang.String string2 = qt2Var.getString(1);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("card_index", i18);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                wVar.Q6(string2, "main_page_chatroom_card", r26.i0.t(jSONObject2, ",", ";", false));
                return;
            }
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        boolean z18 = j5Var instanceof vp2.e0;
        int i19 = z18 ? 2 : 1;
        jSONObject3.putOpt("page_index", java.lang.Integer.valueOf(wVar.f398904f));
        jSONObject3.putOpt("card_type", java.lang.Integer.valueOf(i19));
        jSONObject3.putOpt("card_index", java.lang.String.valueOf(i18));
        wp2.b bVar = z17 ? (wp2.b) j5Var : null;
        jSONObject3.putOpt("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? "" : java.lang.Long.valueOf(liveInfo.getLong(0)));
        vp2.e0 e0Var = z18 ? (vp2.e0) j5Var : null;
        if (e0Var == null || (oa2Var = e0Var.f438917d) == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null || (str = h32Var.getString(4)) == null) {
            str = "";
        }
        jSONObject3.putOpt("Noticeid", str);
        java.lang.String string3 = qt2Var.getString(1);
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        wVar.Q6(string3, "main_page_recmd_card", r26.i0.t(jSONObject4, ",", ";", false));
        com.tencent.mm.ui.MMActivity mMActivity = d0Var.f293717a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        r45.dk2 dk2Var2 = d0Var.f293736t;
        d17 = rVar.d(mMActivity, i18, baseFinderFeed, (dk2Var2 == null || (s92Var = (r45.s92) dk2Var2.getCustom(12)) == null) ? 0 : s92Var.getInteger(0), (r21 & 16) != 0 ? 0 : d0Var.f293719c.f301096b, (r21 & 32) != 0 ? 0 : d0Var.f(), (r21 & 64) != 0, (r21 & 128) != 0);
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        wp2.b bVar2 = z17 ? (wp2.b) j5Var : null;
        long j17 = i18;
        ml2.x1 x1Var = ml2.x1.f328207n;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        java.lang.String str3 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num;
        java.lang.String jSONObject5 = d17.toString();
        kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
        j0Var.sj(bVar2, j17, x1Var, str3, "", "", jSONObject5);
    }
}
