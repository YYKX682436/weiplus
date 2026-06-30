package yf;

/* loaded from: classes15.dex */
public class o1 extends sc1.r1 implements yf.o {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.rtmp.ITXLivePushListener f461428d;

    /* renamed from: e, reason: collision with root package name */
    public final yf.p1 f461429e;

    public o1(android.content.Context context) {
        super(context);
        this.f461429e = new yf.p1(this.f405726a);
    }

    @Override // yf.o
    public void a() {
        if (this.f461428d != null) {
            com.tencent.mars.xlog.Log.i("TXLivePusherJSAdapterV2SameLayerSupport", "sendWeChatStop, send event 5001");
            this.f461428d.onPushEvent(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, new android.os.Bundle());
        }
    }

    @Override // yf.o
    public void b() {
        if (this.f461428d != null) {
            com.tencent.mars.xlog.Log.i("TXLivePusherJSAdapterV2SameLayerSupport", "sendHandupStop, send event 5000");
            this.f461428d.onPushEvent(5000, new android.os.Bundle());
        }
    }

    @Override // sc1.r1, sc1.l
    public sc1.k1 g(android.os.Bundle bundle) {
        sc1.k1 g17 = super.g(bundle);
        yf.p1 p1Var = this.f461429e;
        if (bundle == null) {
            p1Var.getClass();
        } else if (p1Var.f461435b) {
            p1Var.c(bundle, false);
        }
        return g17;
    }

    @Override // yf.o
    public int getMaxZoom() {
        return this.f405726a.getMaxZoom();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0202 A[Catch: Exception -> 0x021a, TRY_LEAVE, TryCatch #1 {Exception -> 0x021a, blocks: (B:85:0x013d, B:111:0x0153, B:87:0x0164, B:89:0x016e, B:93:0x01b5, B:95:0x01bb, B:98:0x01c7, B:99:0x01d7, B:104:0x01eb, B:101:0x0202, B:105:0x0178, B:109:0x0187, B:107:0x0198), top: B:84:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0256  */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    @Override // sc1.r1, sc1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sc1.k1 h(java.lang.String r40, org.json.JSONObject r41) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.o1.h(java.lang.String, org.json.JSONObject):sc1.k1");
    }

    @Override // yf.o
    public sc1.k1 i(android.os.Bundle bundle) {
        com.tencent.live2.jsplugin.V2TXJSAdapterError initLivePusher = this.f405726a.initLivePusher(bundle);
        yf.p1 p1Var = this.f461429e;
        if (bundle == null) {
            p1Var.getClass();
        } else {
            p1Var.c(bundle, true);
            p1Var.f461435b = true;
        }
        return new sc1.k1(initLivePusher);
    }

    @Override // yf.o
    public boolean isPushing() {
        return this.f405726a.isPushing();
    }

    @Override // sc1.r1, sc1.l
    public sc1.k1 k() {
        sc1.k1 k17 = super.k();
        this.f461429e.f461435b = false;
        return k17;
    }

    @Override // sc1.r1, sc1.l
    public sc1.k1 n(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.os.Bundle bundle) {
        sc1.k1 n17 = super.n(tXCloudVideoView, bundle);
        yf.p1 p1Var = this.f461429e;
        p1Var.getClass();
        if (tXCloudVideoView != null && bundle != null) {
            p1Var.c(bundle, true);
            p1Var.f461435b = true;
        }
        return n17;
    }

    @Override // yf.o
    public sc1.k1 setFocusPosition(float f17, float f18) {
        return new sc1.k1(this.f405726a.setFocusPosition(f17, f18));
    }

    @Override // sc1.r1, sc1.l
    public void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        super.setPushListener(iTXLivePushListener);
        this.f461428d = iTXLivePushListener;
    }

    @Override // yf.o
    public sc1.k1 setSurface(android.view.Surface surface) {
        return new sc1.k1(this.f405726a.setSurface(surface));
    }

    @Override // yf.o
    public sc1.k1 setSurfaceSize(int i17, int i18) {
        return new sc1.k1(this.f405726a.setSurfaceSize(i17, i18));
    }

    @Override // yf.o
    public sc1.k1 setZoom(int i17) {
        return new sc1.k1(this.f405726a.setZoom(i17));
    }
}
