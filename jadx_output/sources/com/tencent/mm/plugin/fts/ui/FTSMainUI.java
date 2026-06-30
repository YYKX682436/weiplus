package com.tencent.mm.plugin.fts.ui;

@db5.a(1024)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSMainUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseMainUI;", "<init>", "()V", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FTSMainUI extends com.tencent.mm.plugin.fts.ui.FTSBaseMainUI {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.ui.tools.b9
    public void Z2() {
        c23.g0 g0Var = (c23.g0) pf5.z.f353948a.a(this).e(c23.g0.class);
        if (g0Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exittype", 5);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            g0Var.f38036e = jSONObject2;
            java.lang.String g17 = this.f137937y0.g();
            kotlin.jvm.internal.o.f(g17, "getSearchContent(...)");
            g0Var.f38035d = g17;
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseMainUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c23.g0 g0Var = (c23.g0) pf5.z.f353948a.a(this).e(c23.g0.class);
        if (g0Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exittype", 4);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            g0Var.f38036e = jSONObject2;
            java.lang.String g17 = this.f137937y0.g();
            kotlin.jvm.internal.o.f(g17, "getSearchContent(...)");
            g0Var.f38035d = g17;
        }
        finish();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseMainUI, com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o13.p.f342251d = o13.n.g(3);
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            su4.s0 s0Var = (su4.s0) i95.n0.c(su4.s0.class);
            su4.f2 f2Var = new su4.f2(currentTimeMillis);
            ((iv4.e) s0Var).getClass();
            iv4.e.f295135d = f2Var;
            com.tencent.mars.xlog.Log.i("FTSMainUI", "recordTeachPageEnterTimestamp: " + currentTimeMillis);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FTSMainUI", "recordTeachPageEnterTimestamp error", e17);
        }
        super.onCreate(bundle);
        ((ku5.t0) ku5.t0.f312615d).h(com.tencent.mm.plugin.fts.ui.t2.f138187d, "WCSearchGroupTrain.init");
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FTSMainUI)).Rj(this, iy1.a.Search);
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.L2(this, new com.tencent.mm.plugin.fts.ui.u2(this));
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseMainUI, com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNativeTeach: ");
        boolean z17 = this.V;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FTSMainUI", sb6.toString());
        if (z17) {
            set.add(i23.e.class);
        } else {
            set.add(c23.m.class);
        }
        set.add(c23.o.class);
        set.add(c23.q.class);
        set.add(c23.t.class);
        set.add(x13.c.class);
        set.add(c23.g0.class);
        set.add(z13.f.class);
        set.add(k23.c1.class);
        if (com.tencent.mm.plugin.fts.ui.n3.h()) {
            set.add(c23.f0.class);
            set.add(c23.c0.class);
        }
    }
}
