package ws2;

/* loaded from: classes3.dex */
public final class k2 implements ws2.m2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f449086a;

    public k2(java.lang.ref.WeakReference rReplayPluginLayout) {
        kotlin.jvm.internal.o.g(rReplayPluginLayout, "rReplayPluginLayout");
        this.f449086a = rReplayPluginLayout;
    }

    @Override // ws2.m2
    public void a(boolean z17) {
    }

    @Override // ws2.m2
    public void b(boolean z17) {
        com.tencent.mm.plugin.finder.live.plugin.a8 a8Var;
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 == null || (a8Var = (com.tencent.mm.plugin.finder.live.plugin.a8) m17.getPlugin(com.tencent.mm.plugin.finder.live.plugin.a8.class)) == null) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.y7(a8Var, z17));
    }

    @Override // ws2.m2
    public void c(java.lang.String userId, boolean z17) {
        zi2.w wVar;
        kotlin.jvm.internal.o.g(userId, "userId");
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 == null || (wVar = (zi2.w) m17.getPlugin(zi2.w.class)) == null) {
            return;
        }
        wVar.G1(userId, z17);
    }

    @Override // ws2.m2
    public void d() {
    }

    @Override // ws2.m2
    public void e() {
        zi2.w wVar;
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 == null || (wVar = (zi2.w) m17.getPlugin(zi2.w.class)) == null) {
            return;
        }
        wVar.D1();
    }

    @Override // ws2.m2
    public void f(java.lang.String str) {
        zi2.w wVar;
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 == null || (wVar = (zi2.w) m17.getPlugin(zi2.w.class)) == null) {
            return;
        }
        wVar.K1(str);
    }

    @Override // ws2.m2
    public void g(boolean z17, boolean z18) {
        at2.u1 u1Var;
        dt2.a0 a0Var;
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 == null || (u1Var = (at2.u1) m17.getPlugin(at2.u1.class)) == null || (a0Var = u1Var.f13762q) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = a0Var.f243158a;
        java.lang.Object obj = finderLiveThumbPlayerProxy.f124892h;
        if (obj == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        ((android.view.View) obj).forceLayout();
        java.lang.Object obj2 = finderLiveThumbPlayerProxy.f124892h;
        if (obj2 == null) {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
        android.view.View view = (android.view.View) obj2;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824);
        java.lang.Object obj3 = finderLiveThumbPlayerProxy.f124892h;
        if (obj3 != null) {
            view.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(((android.view.View) obj3).getMeasuredHeight(), 1073741824));
        } else {
            kotlin.jvm.internal.o.o("textureView");
            throw null;
        }
    }

    @Override // ws2.m2
    public boolean h(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 != null) {
            return com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(m17, jSONObject, jSONObject2, jSONObject3, false, null, 24, null);
        }
        return false;
    }

    @Override // ws2.m2
    public void i(org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 == null) {
            return;
        }
        m17.setLastRoomPkMicUserList(jSONArray);
    }

    @Override // ws2.m2
    public void j(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 != null) {
            m17.setFullSEIData(jSONObject);
        }
        com.tencent.mm.plugin.finder.live.view.k0 m18 = m();
        if (m18 == null) {
            return;
        }
        m18.setCurrentMicData(jSONObject2);
    }

    @Override // ws2.m2
    public void k() {
    }

    @Override // ws2.m2
    public void l() {
    }

    public final com.tencent.mm.plugin.finder.live.view.k0 m() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) this.f449086a.get();
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i("SeiProcessCallbackFullUIProxy", "getPluginLayout fail!");
        }
        return k0Var;
    }

    @Override // ws2.m2
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.plugin.finder.live.view.k0 m17 = m();
        if (m17 != null) {
            m17.statusChange(status, bundle);
        }
    }
}
