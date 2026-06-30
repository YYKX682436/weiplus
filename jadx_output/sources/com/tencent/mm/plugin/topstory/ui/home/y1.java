package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class y1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public wm4.y f175113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f175114e;

    /* renamed from: f, reason: collision with root package name */
    public int f175115f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f175116g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f03 f175117h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f175118i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f175115f = -1;
    }

    public final void O6(android.content.Intent intent) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.vs2 vs2Var;
        org.json.JSONObject jSONObject2;
        r45.fn6 fn6Var;
        int intExtra = (intent == null ? getIntent() : intent).getIntExtra("key_chosetab", 0);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.topstory.ui.home.d.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.topstory.ui.home.d dVar = (com.tencent.mm.plugin.topstory.ui.home.d) a17;
        r45.vs2 vs2Var2 = dVar.f174951f;
        r45.xs2 xs2Var = dVar.f174952g;
        r45.in6 in6Var = dVar.f174949d;
        r45.rn6 rn6Var = in6Var != null ? in6Var.f377181J : null;
        int i17 = (rn6Var == null || (fn6Var = rn6Var.f385032d) == null) ? -1 : fn6Var.f374469d;
        boolean z17 = in6Var != null && in6Var.K == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", "onCreate");
        boolean isDebug = com.tencent.mars.xlog.Log.isDebug();
        n51.e eVar = n51.f.f335114a;
        if (isDebug) {
            java.util.Objects.toString(vs2Var2 != null ? vs2Var2.toJSON() : null);
            java.util.Objects.toString(xs2Var != null ? xs2Var.toJSON() : null);
            if (rn6Var != null) {
                jSONObject2 = new org.json.JSONObject();
                try {
                    eVar.d(jSONObject2, "contentRedDotModel", rn6Var.f385032d, false);
                } catch (java.lang.Exception unused) {
                }
            } else {
                jSONObject2 = null;
            }
            java.util.Objects.toString(jSONObject2);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate() called with isEnterLastStrategy:");
            sb6.append(z17);
            sb6.append(" path:NewLife.Entrance chooseCategory:");
            sb6.append(intExtra);
            sb6.append(" contentRedDotCategory:");
            sb6.append(i17);
            sb6.append(" redDotExtInfo:");
            sb6.append(xs2Var != null ? xs2Var.toJSON() : null);
            sb6.append(" \n topStoryRedDotModel:");
            if (rn6Var != null) {
                jSONObject = new org.json.JSONObject();
                try {
                    eVar.d(jSONObject, "contentRedDotModel", rn6Var.f385032d, false);
                } catch (java.lang.Exception unused2) {
                }
            } else {
                jSONObject = null;
            }
            sb6.append(jSONObject);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", sb6.toString());
        }
        if (i17 == -1 || rn6Var == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a18 = zVar.a(activity2).a(com.tencent.mm.plugin.topstory.ui.home.d.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        r45.in6 in6Var2 = ((com.tencent.mm.plugin.topstory.ui.home.d) a18).f174949d;
        boolean z18 = in6Var2 != null && in6Var2.K == 1;
        r45.fn6 fn6Var2 = rn6Var.f385032d;
        int i18 = fn6Var2 != null ? fn6Var2.f374469d : -1;
        r45.bz2 bz2Var = fn6Var2 != null ? fn6Var2.f374470e : null;
        r45.f03 f03Var = fn6Var2 != null ? fn6Var2.f374471f : null;
        if (fn6Var2 == null || (vs2Var = fn6Var2.f374472g) == null) {
            jbVar = null;
        } else {
            jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            jbVar.t0(vs2Var);
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        java.util.List<wm4.y> list = ((com.tencent.mm.plugin.topstory.ui.home.d) zVar.a(activity3).a(com.tencent.mm.plugin.topstory.ui.home.d.class)).f174950e;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips");
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return tabItems == null");
            return;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return contentRedDotCategory == -1");
            return;
        }
        this.f175116g = jbVar;
        this.f175117h = f03Var;
        this.f175118i = java.lang.Integer.valueOf(i18);
        if (z18) {
            if (bz2Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return showTipsInfo == null");
                return;
            }
            if (i18 == intExtra) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TopStoryTabBubbleUIC", "tryToShowTips return contentRedDotCategory == chooseCategory");
                return;
            }
            for (wm4.y yVar : list) {
                if (yVar.f447318b == i18) {
                    android.view.View view = yVar.f447330n;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", "contentRedDotCategory match tabViewContainer:" + view);
                    if (view != null) {
                        yVar.a(0, "", jbVar, f03Var);
                        view.postDelayed(new com.tencent.mm.plugin.topstory.ui.home.x1(this, view, bz2Var, i18, yVar, jbVar, f03Var), 450L);
                        this.f175115f = i18;
                        dn4.a aVar = dn4.a.f242033a;
                        android.app.Activity context = getContext();
                        kotlin.jvm.internal.o.g(context, "context");
                        aVar.b(context, "view_exp", i18);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        O6(null);
    }
}
