package com.tencent.mm.plugin.sns.ad.widget.twistad;

/* loaded from: classes4.dex */
public class GLTwistRoateCardsView extends com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f163901J = 0;
    public boolean A;
    public int B;
    public java.lang.String C;
    public int D;
    public android.graphics.Bitmap E;
    public android.os.Handler F;
    public android.os.HandlerThread G;
    public int H;
    public e94.q I;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f163902q;

    /* renamed from: r, reason: collision with root package name */
    public int f163903r;

    /* renamed from: s, reason: collision with root package name */
    public int f163904s;

    /* renamed from: t, reason: collision with root package name */
    public int f163905t;

    /* renamed from: u, reason: collision with root package name */
    public int f163906u;

    /* renamed from: v, reason: collision with root package name */
    public int f163907v;

    /* renamed from: w, reason: collision with root package name */
    public int f163908w;

    /* renamed from: x, reason: collision with root package name */
    public int f163909x;

    /* renamed from: y, reason: collision with root package name */
    public int f163910y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f163911z;

    public GLTwistRoateCardsView(android.content.Context context) {
        super(context, null);
        this.f163903r = 0;
        this.f163904s = 0;
        this.A = false;
        this.H = 0;
        j(context);
    }

    public static /* synthetic */ e94.q h(com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        e94.q qVar = gLTwistRoateCardsView.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        return qVar;
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.gllib.GLViewContainer
    public void g(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mars.xlog.Log.i("GLTwistRoateCardsView", "glOnSizeChanged, w=" + getWidth() + ", h=" + getHeight());
        if (getWidth() > 0 && getHeight() > 0) {
            this.f163903r = getWidth() / 2;
            this.f163904s = getHeight() + i65.a.b(this.f163902q, 40);
            i();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("glOnSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public final void i() {
        int cos;
        int sin;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mars.xlog.Log.i("GLTwistRoateCardsView", "doLayout, child=" + getChildCount() + ", CARD_COUNT=12");
        if (getChildCount() != 12) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            return;
        }
        for (int i17 = 0; i17 < 12; i17++) {
            t84.c cVar = (t84.c) e(i17);
            if (this.A) {
                double d17 = i17 * 0.5235987755982988d;
                cos = (int) (this.f163905t * java.lang.Math.cos(d17));
                sin = (int) (this.f163905t * java.lang.Math.sin(d17));
                cVar.l(90 - ((i17 * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 12));
            } else {
                double d18 = (-i17) * 0.5235987755982988d;
                cos = (int) (this.f163905t * java.lang.Math.cos(d18));
                sin = (int) (this.f163905t * java.lang.Math.sin(d18));
                cVar.l(((i17 * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 12) + 90);
            }
            int i18 = this.f163903r + cos;
            int i19 = this.f163904s - sin;
            int i27 = this.f163907v;
            int i28 = this.f163909x;
            int i29 = (i27 + (i28 * 2)) / 2;
            int i37 = (this.f163908w + (i28 * 2)) / 2;
            cVar.i(i18 - i29, i19 - i37, i18 + i29, i19 + i37);
            float f17 = this.f163903r;
            float f18 = this.f163904s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRotationCenter", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
            cVar.H = true;
            cVar.D = f17;
            cVar.E = f18;
            cVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRotationCenter", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public final void j(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f163902q = context;
        this.f163909x = i65.a.b(context, 14);
        this.f163910y = i65.a.b(this.f163902q, 8);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("twist_anim_thread");
        this.G = handlerThread;
        handlerThread.setPriority(10);
        this.G.start();
        this.F = new android.os.Handler(this.G.getLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.G.quitSafely();
        this.F.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.tencent.mars.xlog.Log.i("GLTwistRoateCardsView", "onDetachedFromWindow");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public void setAnimCardView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.f163911z = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public void setOnCardAnimListener(e94.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        this.I = qVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
    }

    public GLTwistRoateCardsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163903r = 0;
        this.f163904s = 0;
        this.A = false;
        this.H = 0;
        j(context);
    }
}
