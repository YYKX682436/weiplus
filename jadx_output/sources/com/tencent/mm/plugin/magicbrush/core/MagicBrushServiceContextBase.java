package com.tencent.mm.plugin.magicbrush.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/core/MagicBrushServiceContextBase;", "Landroid/app/Service;", "<init>", "()V", "mb-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class MagicBrushServiceContextBase extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f147890f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f147891d = jz5.h.b(new pc3.w(this));

    /* renamed from: e, reason: collision with root package name */
    public final pc3.u f147892e = new pc3.u(this);

    public final pc3.t a() {
        return (pc3.t) ((jz5.n) this.f147891d).getValue();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        return a();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        pc3.t a17 = a();
        synchronized (a17) {
            boolean D = com.tencent.mm.ui.bk.D(newConfig);
            com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onConfigurationChange: lastDarkMode = " + a17.f353403i + ", newDarkMode = " + D);
            if (a17.f353403i != D) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("theme", D ? "dark" : "light");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "onConfigurationChange: sendData = ".concat(jSONObject2));
                a17.e("onThemeChange", jSONObject2);
                a17.f353403i = D;
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MagicBrushServiceContext", "service created");
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        com.tencent.mm.plugin.magicbrush.a5.f147837b = true;
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.f147892e);
        com.tencent.mm.plugin.magicbrush.core.event.g.f147900a.a(new pc3.v(this));
        je3.i.t8(je3.k.f299298e, "magicbrush", "PRELOAD_SERVICE", com.tencent.mm.plugin.magicbrush.a5.f147844i, null, 1.0E-4f, 8, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.f147892e);
        pc3.t a17 = a();
        synchronized (a17) {
            com.tencent.mars.xlog.Log.i("MagicBrushServerMgr", "clear all biz: " + a17.f353402h);
            java.util.Iterator it = a17.f353402h.entrySet().iterator();
            while (it.hasNext()) {
                ((sc3.k1) ((java.util.Map.Entry) it.next()).getValue()).Oc(2);
            }
            a17.f353402h.clear();
        }
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        com.tencent.mm.plugin.magicbrush.a5.f147837b = false;
        com.tencent.mm.plugin.magicbrush.core.event.g.f147900a.b();
        ((ft.e) i95.n0.c(ft.e.class)).v6();
    }
}
