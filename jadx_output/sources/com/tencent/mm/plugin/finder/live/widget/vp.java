package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vp extends com.tencent.mm.plugin.finder.live.widget.t1 {
    public final qo0.c N;
    public final com.tencent.mm.plugin.finder.live.plugin.l P;
    public final java.lang.String Q;
    public android.widget.CheckBox R;
    public android.view.View S;
    public boolean T;
    public final jz5.g U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(android.content.Context context, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.N = statusMonitor;
        this.P = basePlugin;
        this.Q = "VoiceRoomLbsRequestPanel";
        this.U = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.up(this, context));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.f488935ds0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.rti);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.R = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.s2c);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.S = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.o3b);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById3);
        android.view.View view = this.S;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.rp(this));
        } else {
            kotlin.jvm.internal.o.o("requestBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1, com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", k0() ? 1 : 0);
        jSONObject.put("type", this.T ? 2 : 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327273w2, t17, 0L, null, null, null, null, null, 252, null);
        this.T = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public java.lang.String i0() {
        return this.Q;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public void l0(boolean z17) {
        com.tencent.mars.xlog.Log.i(i0(), "mmPermissionCallback hadPermission: " + z17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 3);
        this.T = true;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327271v2, t17, 0L, null, null, null, null, null, 252, null);
        if (z17) {
            h0(true);
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        android.widget.CheckBox checkBox = this.R;
        if (checkBox != null) {
            checkBox.setChecked(false);
        } else {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public void m0(r45.ze2 location) {
        kotlin.jvm.internal.o.g(location, "location");
        ((com.tencent.mm.plugin.finder.live.widget.sp) ((jz5.n) this.U).getValue()).b();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public void n0(boolean z17) {
        com.tencent.mars.xlog.Log.i(i0(), "systemPermissionCallback hadPermission: " + z17);
        this.T = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327271v2, t17, 0L, null, null, null, null, null, 252, null);
        if (z17) {
            h0(true);
            return;
        }
        android.widget.CheckBox checkBox = this.R;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        checkBox.setChecked(false);
        com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
    }

    public final void o0(int i17, int i18, yz5.l lVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("element", i18);
        if (lVar != null) {
            lVar.invoke(jSONObject);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327269u2, t17, 0L, null, null, null, null, null, 252, null);
    }
}
