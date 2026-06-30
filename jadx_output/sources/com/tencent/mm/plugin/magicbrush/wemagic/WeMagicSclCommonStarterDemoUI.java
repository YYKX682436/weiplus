package com.tencent.mm.plugin.magicbrush.wemagic;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WeMagicSclCommonStarterDemoUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f148192g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f148193d = "WeMagicSclCommonStarterDemoUI";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f148194e;

    /* renamed from: f, reason: collision with root package name */
    public df3.h f148195f;

    public static final void U6(com.tencent.mm.plugin.magicbrush.wemagic.WeMagicSclCommonStarterDemoUI weMagicSclCommonStarterDemoUI) {
        final kw5.b bVar;
        df3.h hVar = weMagicSclCommonStarterDemoUI.f148195f;
        if (hVar != null && (bVar = hVar.f232023d) != null) {
            final sw5.a aVar = hVar.f232022c;
            aVar.getClass();
            qw5.b a17 = aVar.a(bVar, null);
            if (a17 != null) {
                com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b.f220042b.d(a17.f367231b);
            }
            yz5.a aVar2 = (yz5.a) ((java.util.LinkedHashMap) aVar.f413490b).get(bVar);
            if (aVar2 != null) {
                double d17 = ((ow5.a) aVar2.invoke()).f349437i;
                if (d17 == 0.0d) {
                    aVar.b(bVar);
                } else if (d17 > 0.0d) {
                    java.util.Map map = aVar.f413492d;
                    java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) map).get(bVar);
                    android.os.Handler handler = aVar.f413491c;
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                    java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: sw5.a$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            sw5.a this$0 = sw5.a.this;
                            kotlin.jvm.internal.o.g(this$0, "this$0");
                            kw5.b handle = bVar;
                            kotlin.jvm.internal.o.g(handle, "$handle");
                            this$0.b(handle);
                        }
                    };
                    map.put(bVar, runnable2);
                    handler.postDelayed(runnable2, (long) (d17 * 1000));
                }
            }
        }
        weMagicSclCommonStarterDemoUI.f148195f = null;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.doh;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MagicSclCommonStarterDemoUI");
        setBackBtn(new df3.v(this));
        df3.n nVar = (df3.n) ((com.tencent.mm.plugin.magicbrush.t4) i95.n0.c(com.tencent.mm.plugin.magicbrush.t4.class));
        synchronized (nVar) {
            if (!nVar.f232027d) {
                com.tencent.wechat.aff.magicbrush.d dVar = com.tencent.wechat.aff.magicbrush.d.f217380b;
                android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
                kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                com.tencent.wechat.wemagic.WeMagicAssetMgrInitializer.nativeInit(assets);
                com.tencent.wechat.aff.magicbrush.c cVar = new com.tencent.wechat.aff.magicbrush.c();
                cVar.f217377g = fe3.l.b() + "/mbpkgs";
                boolean[] zArr = cVar.f217379i;
                zArr[4] = true;
                cVar.f217376f = "";
                zArr[3] = true;
                cVar.f217374d = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicFilesBiz"), true);
                cVar.f217379i[1] = true;
                cVar.f217375e = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicFilesSys"), true);
                cVar.f217379i[2] = true;
                cVar.f217378h = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicCache"), true);
                cVar.f217379i[5] = true;
                com.tencent.wechat.aff.magicbrush.b bVar = new com.tencent.wechat.aff.magicbrush.b();
                bVar.f217370d = cVar;
                bVar.f217373g[1] = true;
                bVar.f217371e = nVar.wi();
                bVar.f217373g[2] = true;
                dVar.a(bVar);
                synchronized (com.tencent.wemagic.common.MBInitializer.f220064a) {
                    if (!com.tencent.wemagic.common.MBInitializer.f220065b) {
                        com.tencent.wemagic.net.MagicNetService.INSTANCE.init();
                        com.tencent.wemagic.common.zidl_gen.d.f220087a = new uw5.e$$b();
                        com.tencent.wemagic.common.MBInitializer.f220065b = true;
                    }
                }
                uw5.f fVar = uw5.f.f431768a;
                df3.m mVar = df3.m.f232026d;
                if (uw5.f.f431769b == null) {
                    synchronized (fVar) {
                        if (uw5.f.f431769b == null) {
                            uw5.f.f431769b = mVar;
                        }
                    }
                }
                nVar.Ai();
                nVar.f232027d = true;
            }
        }
        this.f148194e = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.r5k);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ngb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new df3.p(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j2h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.Button) findViewById2).setOnClickListener(new df3.q(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rdq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        ((android.widget.Button) findViewById3).setOnClickListener(new df3.r(this));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.nja);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((android.widget.Button) findViewById4).setOnClickListener(new df3.s(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cki);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        ((android.widget.Button) findViewById5).setOnClickListener(new df3.t(this));
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.r8o);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        ((android.widget.Button) findViewById6).setOnClickListener(new df3.u(this));
    }
}
