package com.tencent.mm.plugin.magicbrush.scl.nativedemo.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scl/nativedemo/ui/MagicSclNativeDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MagicSclNativeDemoUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f148131f = 0;

    /* renamed from: d, reason: collision with root package name */
    public hq0.e0 f148132d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f148133e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dcw;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        hq0.e0 e0Var;
        super.onCreate(bundle);
        setMMTitle("MagicSclNativeDemoUI");
        setBackBtn(new ne3.a(this));
        this.f148133e = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f484047cu0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclNativeDemoUI", "setupDynamicCardEnv");
        if (r26.n0.N("mock_123")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclNativeDemoUI", "frameSetName null or data null");
            return;
        }
        me3.j jVar = (me3.j) ((me3.i) i95.n0.c(me3.i.class));
        synchronized (jVar) {
            if (jVar.f325934d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclNativeDemoServiceFeatureService", "has create biz");
            } else {
                le3.a aVar = new le3.a();
                jVar.f325934d = aVar;
                aVar.X0();
            }
        }
        le3.a aVar2 = ((me3.j) ((me3.i) i95.n0.c(me3.i.class))).f325934d;
        if (aVar2 != null) {
            java.lang.Object obj = new java.lang.Object();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e0Var = hq0.i0.K0(aVar2, obj, context, "MagicSclNativeDemo", "frames", "", false, 32, null);
        } else {
            e0Var = null;
        }
        this.f148132d = e0Var;
        if (e0Var != null) {
            android.view.ViewGroup viewGroup = this.f148133e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclNativeDemoUI", "createFrameSetView");
            kotlin.jvm.internal.o.d(viewGroup);
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = new com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer(context2, null, 0, 6, null);
            magicSclViewContainer.setBackgroundColor(-65536);
            magicSclViewContainer.e("mock_123");
            magicSclViewContainer.setId(android.view.View.generateViewId());
            magicSclViewContainer.setLayoutParams(new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
            viewGroup.addView(magicSclViewContainer);
            magicSclViewContainer.a(e0Var);
            magicSclViewContainer.bringToFront();
            magicSclViewContainer.getId();
            hq0.e0 e0Var2 = this.f148132d;
            if (e0Var2 != null) {
                cl0.g gVar = new cl0.g();
                gVar.h("frameSetName", "mock_123");
                e0Var2.a("\n          {\n          \"type\": 1,\n          \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n          }\n         ", gVar.toString());
            }
        }
    }
}
