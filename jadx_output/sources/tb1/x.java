package tb1;

/* loaded from: classes7.dex */
public class x implements bi3.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f416948a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.h0 f416949b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f416950c;

    /* renamed from: d, reason: collision with root package name */
    public int f416951d = Integer.MIN_VALUE;

    public x(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f416948a = lVar;
        this.f416949b = (com.tencent.mm.plugin.appbrand.jsruntime.h0) lVar.getJsRuntime().h0(com.tencent.mm.plugin.appbrand.jsruntime.h0.class);
    }

    public void a(com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FrameDataCallbackHelper", "onUIResume mNeedCallback:%b", java.lang.Boolean.valueOf(this.f416950c));
        if (this.f416950c) {
            if (mMSightRecordView == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIResume recordView null");
                return;
            }
            int i17 = this.f416951d;
            if (i17 == Integer.MIN_VALUE) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIResume invalid mCurrentSharedBufferId");
                return;
            }
            com.tencent.mm.plugin.appbrand.jsruntime.h0 h0Var = this.f416949b;
            if (h0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FrameDataCallbackHelper", "onUIResume mSharedBufferAddon null");
            } else {
                mMSightRecordView.c(((com.tencent.mm.plugin.appbrand.jsruntime.n) h0Var).m0(i17), this);
            }
        }
    }
}
