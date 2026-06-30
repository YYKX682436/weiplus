package f53;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI f259641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig f259642e;

    public e(com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI, com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig) {
        this.f259641d = luggageGameWebViewUI;
        this.f259642e = gameAtSomeoneConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f259641d);
        android.widget.FrameLayout frameLayout = this.f259641d.f139494d.f406662c;
        kotlin.jvm.internal.o.e(frameLayout, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.bdx, (android.view.ViewGroup) frameLayout, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483280a61);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        h0Var.f310123d = findViewById;
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig = this.f259642e;
        bundle.putString("contentId", gameAtSomeoneConfig.f139515m);
        java.lang.String str = gameAtSomeoneConfig.f139516n;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            bundle.putByteArray("context", bytes);
        }
        bundle.putInt("limit", gameAtSomeoneConfig.f139517o);
        cl0.e eVar = f53.f.f259644a;
        java.lang.String str2 = this.f259642e.f139513h;
        if (str2 == null) {
            str2 = "";
        }
        f53.f.f259646c = str2;
        if (!(f53.f.f259646c.length() == 0)) {
            try {
                f53.f.f259646c = "{\"atList\":" + f53.f.f259646c + '}';
                cl0.e jSONArray = new cl0.g(f53.f.f259646c).getJSONArray("atList");
                kotlin.jvm.internal.o.f(jSONArray, "getJSONArray(...)");
                f53.f.f259644a = jSONArray;
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    cl0.e eVar2 = f53.f.f259644a;
                    if (eVar2 == null) {
                        kotlin.jvm.internal.o.o("atList");
                        throw null;
                    }
                    java.lang.String string = eVar2.getString(i17);
                    java.util.List list = f53.f.f259645b;
                    kotlin.jvm.internal.o.d(string);
                    ((java.util.ArrayList) list).add(string);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AtSomeoneUI", "parse data error, exception : %s", e17);
            }
        }
        com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI = this.f259641d;
        luggageGameWebViewUI.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = luggageGameWebViewUI.f139498h;
        android.view.View view = !concurrentHashMap.containsKey("atSomeoneView") ? null : (android.view.View) concurrentHashMap.get("atSomeoneView");
        if (view != null) {
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView = (com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) view.findViewById(com.tencent.mm.R.id.f483280a61);
            if (atSomeoneView != null) {
                h0Var.f310123d = atSomeoneView;
            }
            ((com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) h0Var.f310123d).setSelectedDatas(f53.f.f259645b);
            ((com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) h0Var.f310123d).n1(this.f259642e.f139509d);
            inflate = view;
        } else {
            ((com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) h0Var.f310123d).setSelectedDatas(f53.f.f259645b);
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView2 = (com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) h0Var.f310123d;
            f53.c cVar = new f53.c(this.f259642e, h0Var);
            atSomeoneView2.f139982o2 = bundle;
            atSomeoneView2.m1(cVar);
        }
        ((com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) h0Var.f310123d).setOnItemClickListener(new f53.d(h0Var, this.f259642e));
        com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig2 = this.f259642e;
        if (gameAtSomeoneConfig2.f139510e && gameAtSomeoneConfig2.f139511f) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = inflate;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = inflate;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneUI$bindAtSomeoneView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig3 = f53.f.f259648e;
            if (gameAtSomeoneConfig3 == null) {
                kotlin.jvm.internal.o.o("atSomeoneConfig");
                throw null;
            }
            jSONObject.put("gamecenterIdentifier", gameAtSomeoneConfig3.f139514i);
            jSONObject.put("atUserNameList", new org.json.JSONArray((java.util.Collection) f53.f.f259645b));
            if (f53.f.f259647d) {
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.w9.f193055c;
                android.os.Bundle bundle2 = new android.os.Bundle();
                com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig4 = f53.f.f259648e;
                if (gameAtSomeoneConfig4 == null) {
                    kotlin.jvm.internal.o.o("atSomeoneConfig");
                    throw null;
                }
                bundle2.putString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, gameAtSomeoneConfig4.f139514i);
                bundle2.putString("jsonData", jSONObject.toString());
                com.tencent.mm.ipcinvoker.d0.d(str3, bundle2, f53.a.class, null);
            } else {
                s43.j jVar = s43.i.f402956a;
                com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig5 = f53.f.f259648e;
                if (gameAtSomeoneConfig5 == null) {
                    kotlin.jvm.internal.o.o("atSomeoneConfig");
                    throw null;
                }
                jVar.a(gameAtSomeoneConfig5.f139514i, jSONObject);
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = this.f259642e.f139518p;
        layoutParams.gravity = 80;
        inflate.setLayoutParams(layoutParams);
        if (this.f259642e.f139511f) {
            com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI2 = this.f259641d;
            luggageGameWebViewUI2.getClass();
            if (luggageGameWebViewUI2.f139498h.containsKey("atSomeoneView")) {
                return;
            }
            android.widget.FrameLayout frameLayout2 = luggageGameWebViewUI2.f139494d.f406662c;
            if (frameLayout2 instanceof android.widget.FrameLayout) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.luggage.n0(luggageGameWebViewUI2, frameLayout2, inflate, "atSomeoneView"));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI luggageGameWebViewUI3 = this.f259641d;
        luggageGameWebViewUI3.getClass();
        if (luggageGameWebViewUI3.f139498h.containsKey("atSomeoneView")) {
            android.widget.FrameLayout frameLayout3 = luggageGameWebViewUI3.f139494d.f406662c;
            if (frameLayout3 instanceof android.widget.FrameLayout) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.luggage.o0(luggageGameWebViewUI3, frameLayout3, "atSomeoneView"));
            }
        }
    }
}
