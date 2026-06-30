package fw;

/* loaded from: classes7.dex */
public abstract class v extends dq0.a0 {

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.WeakReference f267037r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dq0.q mbPlugin) {
        super(mbPlugin);
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
    }

    public static final void y(fw.v vVar, java.lang.String str, byte[] bArr, yz5.l callback) {
        vVar.getClass();
        switch (str.hashCode()) {
            case -1760177256:
                if (str.equals("onFrameSetExpose")) {
                    ((com.tencent.mm.flutter.plugin.proto.e0) com.tencent.mm.flutter.plugin.proto.e0.f67961h.parseFrom(bArr)).g();
                    return;
                }
                return;
            case -1371776827:
                if (!str.equals("onScreenShot")) {
                    return;
                }
                break;
            case -1085405331:
                if (str.equals("onPopupWindowDismiss")) {
                    com.tencent.mm.flutter.plugin.proto.p pVar = (com.tencent.mm.flutter.plugin.proto.p) com.tencent.mm.flutter.plugin.proto.p.f68052h.parseFrom(bArr);
                    kotlin.jvm.internal.o.d(pVar);
                    int i17 = pVar.f68054e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "onPopupWindowDismiss reason:" + i17);
                    com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.popup.MbJsApiEventOnPopupWindowDismiss mbJsApiEventOnPopupWindowDismiss = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.popup.MbJsApiEventOnPopupWindowDismiss();
                    cl0.g gVar = new cl0.g();
                    gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, i17);
                    java.lang.String gVar2 = gVar.toString();
                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                    mbJsApiEventOnPopupWindowDismiss.f147882e = gVar2;
                    hw.c0 t17 = vVar.t();
                    if (t17 != null) {
                        t17.M0(mbJsApiEventOnPopupWindowDismiss);
                    }
                    callback.invoke(vVar.p(null));
                    return;
                }
                return;
            case -907680051:
                if (str.equals("scroll")) {
                    com.tencent.mm.flutter.plugin.proto.s parseFrom = com.tencent.mm.flutter.plugin.proto.s.parseFrom(bArr);
                    kotlin.jvm.internal.o.d(parseFrom);
                    kotlin.jvm.internal.o.g(callback, "callback");
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "handleScroll " + parseFrom.getOffsetTop() + ' ' + parseFrom.getOffsetHeight());
                    callback.invoke(vVar.p(null));
                    return;
                }
                return;
            case 389178575:
                if (str.equals("onFlutterListCardExpose")) {
                    com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom2 = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.parseFrom(bArr);
                    kotlin.jvm.internal.o.f(parseFrom2, "parseFrom(...)");
                    int cardType = parseFrom2.getCardType();
                    java.lang.String frameSetName = parseFrom2.getFrameSetName();
                    int exposeType = parseFrom2.getExposeType();
                    long exposeTime = parseFrom2.getExposeTime();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "onFlutterCardExpose cardType:" + cardType + " frameSetName:" + frameSetName + " exposeType:" + exposeType + " exposeTime:" + exposeTime);
                    if (cardType == 1) {
                        com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent onBrandServiceEvent = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent();
                        cl0.g gVar3 = new cl0.g();
                        gVar3.h("eventName", "brandServiceAdFlutterExpose");
                        gVar3.h("frameSetName", frameSetName);
                        gVar3.o("exposeType", exposeType);
                        gVar3.p("exposeTimeStamp", exposeTime);
                        java.lang.String gVar4 = gVar3.toString();
                        kotlin.jvm.internal.o.f(gVar4, "toString(...)");
                        onBrandServiceEvent.f147882e = gVar4;
                        hw.c0 t18 = vVar.t();
                        if (t18 != null) {
                            t18.M0(onBrandServiceEvent);
                        }
                    }
                    callback.invoke(vVar.p(null));
                    return;
                }
                return;
            case 704897452:
                if (!str.equals("brandServiceBoxQuit")) {
                    return;
                }
                break;
            default:
                return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "onBrandServiceEvent eventName:".concat(str));
        com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent onBrandServiceEvent2 = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent();
        cl0.g gVar5 = new cl0.g();
        gVar5.h("eventName", str);
        java.lang.String gVar6 = gVar5.toString();
        kotlin.jvm.internal.o.f(gVar6, "toString(...)");
        onBrandServiceEvent2.f147882e = gVar6;
        hw.c0 t19 = vVar.t();
        if (t19 != null) {
            t19.M0(onBrandServiceEvent2);
        }
        callback.invoke(vVar.p(null));
    }

    @Override // dq0.a0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public hw.c0 t() {
        java.lang.ref.WeakReference weakReference = this.f267037r;
        if (weakReference != null) {
            return (hw.c0) weakReference.get();
        }
        return null;
    }

    public void B(java.lang.String frameSetName, int i17) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        vw.b bVar = (vw.b) ((rv.p2) i95.n0.c(rv.p2.class));
        bVar.getClass();
        jz5.g gVar = bVar.f440590d;
        if (i17 <= 0) {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).remove(frameSetName);
        } else {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putInt(frameSetName, i17);
        }
    }

    @Override // dq0.a0
    public void a(fq0.x frameSet) {
        int z17;
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        if (frameSet.f265483g > 0 || (z17 = z(frameSet.f265477a)) <= 0) {
            return;
        }
        frameSet.f265483g = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", "beforeFrameSetBind set cached height: " + frameSet);
    }

    @Override // dq0.a0, dq0.j
    public void attachFrameSet(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(extra, "extra");
        super.attachFrameSet(rootId, frameSetId, extra);
    }

    @Override // dq0.a0
    public hq0.e0 h(java.lang.String path, java.lang.String query) {
        hq0.e0 h17;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        hw.c0 t17 = t();
        if (t17 == null || (hashMap2 = t17.A) == null || (h17 = (hq0.e0) hashMap2.get(path)) == null) {
            h17 = super.h(path, query);
            hw.c0 t18 = t();
            if (t18 != null && (hashMap = t18.A) != null) {
                hashMap.put(path, h17);
            }
        }
        return h17;
    }

    @Override // dq0.a0
    public java.util.Map j() {
        return kz5.c1.m(this.f242298q, kz5.c1.k(new jz5.l("scroll", new fw.i(this)), new jz5.l("onPopupWindowDismiss", new fw.j(this)), new jz5.l("resume", new fw.k(this)), new jz5.l("pause", new fw.l(this)), new jz5.l("onScreenShot", new fw.m(this)), new jz5.l("onFrameSetExpose", new fw.n(this)), new jz5.l("onFlutterListCardExpose", new fw.o(this)), new jz5.l("brandServiceBoxQuit", new fw.p(this))));
    }

    @Override // dq0.a0
    public synchronized void m(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine ");
        hw.c0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", sb6.toString());
        super.m(binding);
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        hw.c0 c0Var;
        kotlin.jvm.internal.o.g(binding, "binding");
        super.onAttachedToActivity(binding);
        java.lang.ref.WeakReference weakReference = this.f267037r;
        if (weakReference == null || (c0Var = (hw.c0) weakReference.get()) == null) {
            return;
        }
        c0Var.f285364z = new java.lang.ref.WeakReference(binding.getActivity());
        c0Var.m1();
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.FlutterPlugin
    public synchronized void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttachedToEngine ");
        hw.c0 t17 = t();
        sb6.append(t17 != null ? t17.O0() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclEcsTLFlutterPluginBase", sb6.toString());
        super.onAttachedToEngine(binding);
    }

    @Override // dq0.a0, io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        hw.c0 c0Var;
        this.f242297p = null;
        java.lang.ref.WeakReference weakReference = this.f267037r;
        if (weakReference == null || (c0Var = (hw.c0) weakReference.get()) == null) {
            return;
        }
        c0Var.f285364z = new java.lang.ref.WeakReference(null);
        c0Var.m1();
    }

    @Override // dq0.a0
    public void s(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        frameSet.f265485i = new fw.s(frameSet, this);
    }

    public int z(java.lang.String frameSetName) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        vw.b bVar = (vw.b) ((rv.p2) i95.n0.c(rv.p2.class));
        bVar.getClass();
        return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) bVar.f440590d).getValue()).getInt(frameSetName, 0);
    }
}
