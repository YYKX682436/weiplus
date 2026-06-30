package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class b0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.e f121583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121584e;

    public b0(vp2.e eVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var) {
        this.f121583d = eVar;
        this.f121584e = m0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        vp2.e eVar;
        java.lang.String str2;
        java.lang.Class cls;
        java.lang.Object obj;
        java.lang.String num;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        vp2.e eVar2 = this.f121583d;
        java.lang.Object obj2 = eVar2.f438915e.get(i18);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        so2.j5 j5Var = (so2.j5) obj2;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var = this.f121584e;
        r45.qt2 qt2Var = m0Var.f121799i;
        if (qt2Var == null || (str = qt2Var.getString(2)) == null) {
            str = "";
        }
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            androidx.lifecycle.c1 a17 = zVar.a(appCompatActivity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            cl0.g gVar = new cl0.g();
            str2 = str;
            gVar.s("page_index", java.lang.Integer.valueOf(wVar.f398903e));
            gVar.s("banner_live_index", java.lang.String.valueOf(i18));
            boolean z18 = j5Var instanceof wp2.b;
            wp2.b bVar = z18 ? (wp2.b) j5Var : null;
            if (bVar == null || (feedObject = bVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) {
                cls = rq2.w.class;
                obj = "";
            } else {
                cls = rq2.w.class;
                obj = java.lang.Long.valueOf(liveInfo.getLong(0));
            }
            gVar.s("liveid", obj);
            r45.qt2 qt2Var2 = m0Var.f121799i;
            java.lang.String string = qt2Var2 != null ? qt2Var2.getString(1) : null;
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            eVar = eVar2;
            wVar.Q6(string, "main_page_banner_live", r26.i0.t(gVar2, ",", ";", false));
            wp2.b bVar2 = z18 ? (wp2.b) j5Var : null;
            if (bVar2 != null) {
                cl0.g gVar3 = new cl0.g();
                gVar3.s("main_page_position", 2);
                m0Var.f121796f.l(bVar2, i18, gVar3);
                if (wVar.f398910o != 0) {
                    java.lang.String str3 = wVar.f398911p;
                    if (!(str3 == null || str3.length() == 0)) {
                        gVar3.s("pull_liveid", java.lang.Long.valueOf(wVar.f398910o));
                        gVar3.s("pull_commentsence", wVar.f398911p);
                    }
                }
                com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) view.findViewWithTag("nearby-live-preview-view-tag");
                if (nearbyLivePreviewView != null) {
                    gVar3.o("playstatus", nearbyLivePreviewView.getPlayStatus());
                    java.lang.String streamId = nearbyLivePreviewView.getStreamId();
                    if (streamId == null) {
                        streamId = "";
                    }
                    gVar3.h("streamid", streamId);
                }
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                long j17 = i18;
                ml2.x1 x1Var = ml2.x1.f328207n;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                java.lang.String str4 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) ? "" : num;
                java.lang.String gVar4 = gVar3.toString();
                kotlin.jvm.internal.o.f(gVar4, "toString(...)");
                j0Var.sj(bVar2, j17, x1Var, str4, "", "", gVar4);
            }
        } else {
            eVar = eVar2;
            str2 = str;
            cls = rq2.w.class;
        }
        tp2.f fVar = m0Var.f121798h;
        if (fVar != null) {
            java.util.ArrayList arrayList = eVar.f438915e;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("main_page_position", "2");
            bundle.putInt("card_index", i18);
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rq2.w wVar2 = (rq2.w) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(cls);
            if (wVar2 != null && wVar2.f398910o != 0) {
                java.lang.String str5 = wVar2.f398911p;
                if (!(str5 == null || str5.length() == 0)) {
                    bundle.putLong("pull_liveid", wVar2.f398910o);
                    bundle.putString("pull_commentsence", wVar2.f398911p);
                }
            }
            tp2.f.d(fVar, j5Var, i17, i18, view, arrayList, str2, 2, bundle, null, null, 0L, 1792, null);
        }
    }
}
