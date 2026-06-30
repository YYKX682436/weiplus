package xc5;

/* loaded from: classes12.dex */
public final class l extends lf3.n implements qf3.b, qf3.c, xg3.h0 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile boolean f453520q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile java.util.Set f453521r;

    /* renamed from: d, reason: collision with root package name */
    public final mf3.f f453522d;

    /* renamed from: e, reason: collision with root package name */
    public qf3.a f453523e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453524f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f453525g;

    /* renamed from: h, reason: collision with root package name */
    public int f453526h;

    /* renamed from: i, reason: collision with root package name */
    public int f453527i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f453528m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f453529n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f453530o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f453531p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f453522d = new mf3.f();
        this.f453524f = "";
        this.f453525g = new long[0];
        this.f453531p = new java.util.LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V6(xc5.l r16, int r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.l.V6(xc5.l, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final mf3.k W6(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (msgInfo.isVideo() || msgInfo.getType() == 43) {
            return new xc5.t2(msgInfo);
        }
        wh5.f fVar = wh5.f.f446052a;
        if (fVar.a() && msgInfo.J2() && !fVar.b(msgInfo)) {
            j15.d dVar = new j15.d();
            java.lang.String j17 = msgInfo.j();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (j17 == null) {
                j17 = "";
            }
            dVar.fromXml(j17);
            r3 = xs.l1.b(dVar, msgInfo.A0() == 1);
        }
        if (!r3) {
            return new xc5.i0(msgInfo);
        }
        mf3.k kVar = null;
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(msgInfo.Q0(), msgInfo.getMsgId());
            if (T1 == null || T1.f322633a != msgInfo.getMsgId()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ChatLiveMediaInfo imgInfo query failed, msgId=");
                sb6.append(msgInfo.getMsgId());
                sb6.append(" imgInfo=");
                sb6.append(T1);
                sb6.append(" localId=");
                sb6.append(T1 != null ? java.lang.Long.valueOf(T1.f322633a) : null);
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryMediaInfoFactory", sb6.toString());
            } else {
                kVar = wh5.h0.f446068a.a(msgInfo, T1);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryMediaInfoFactory", "tryCreateChatLiveMediaInfo failed: " + e17.getMessage());
        }
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryMediaInfoFactory", "create ChatLiveMediaInfo, msgId=" + msgInfo.getMsgId());
            return kVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryMediaInfoFactory", "create LiveMsgHistoryGalleryMediaInfo fallback, msgId=" + msgInfo.getMsgId());
        return new xc5.z0(msgInfo);
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        long[] longArrayExtra = intent.getLongArrayExtra("key_msg_history_gallery_msg_id_list");
        long longExtra = intent.getLongExtra("img_gallery_msg_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("img_gallery_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetch, talker=");
        sb6.append(stringExtra);
        sb6.append(" currentMsgId=");
        sb6.append(longExtra);
        sb6.append(" msgIdListSize=");
        sb6.append(longArrayExtra != null ? longArrayExtra.length : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryDataProvider", sb6.toString());
        if (longArrayExtra != null) {
            if (!(longArrayExtra.length == 0)) {
                if (!(stringExtra.length() == 0)) {
                    this.f453523e = listener;
                    this.f453524f = stringExtra;
                    this.f453525g = longArrayExtra;
                    mf3.f fVar = this.f453522d;
                    fVar.clear();
                    this.f453526h = 0;
                    this.f453527i = 0;
                    this.f453528m = false;
                    this.f453529n = false;
                    this.f453530o = false;
                    java.util.Set set = this.f453531p;
                    set.clear();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(kz5.z.W(this.f453525g, longExtra));
                    if (!(valueOf.intValue() >= 0)) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : 0;
                    com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(this.f453524f, this.f453525g[intValue]);
                    if (k17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryDataProvider", "fetch failed, anchor msg not found, msgId=" + longExtra);
                        return false;
                    }
                    fVar.add(W6(k17));
                    this.f453526h = intValue;
                    this.f453527i = intValue + 1;
                    set.add(java.lang.Long.valueOf(longExtra));
                    java.lang.String valueOf2 = java.lang.String.valueOf(longExtra);
                    lf3.c0 c0Var = (lf3.c0) listener;
                    c0Var.Y6(valueOf2);
                    c0Var.X6(fVar, false);
                    listener.T3(0);
                    com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new xc5.g(this, intValue, null), 1, null);
                    }
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
                    return true;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryDataProvider", "fetch failed, msgIdList is null/empty or talker is empty");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0064, code lost:
    
        if ((r3 != null && r3.P2()) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0026 A[SYNTHETIC] */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r19, xg3.l0 r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.l.c0(xg3.m0, xg3.l0):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        if (!this.f453531p.isEmpty()) {
            f453521r = kz5.n0.X0(this.f453531p);
        }
        this.f453523e = null;
        this.f453522d.clear();
        this.f453525g = new long[0];
        this.f453531p.clear();
        this.f453528m = false;
        this.f453529n = false;
        this.f453530o = false;
    }
}
