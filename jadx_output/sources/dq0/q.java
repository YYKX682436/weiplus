package dq0;

/* loaded from: classes7.dex */
public final class q implements com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f242325d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f242326e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.flutter_magic_brush.MagicBrushResponse f242327f;

    /* renamed from: g, reason: collision with root package name */
    public final float f242328g = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f242329h = new java.lang.ref.WeakReference(null);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f242330i = new java.util.HashMap();

    public q(boolean z17) {
        this.f242325d = z17;
    }

    public final void a(java.lang.String viewId) {
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer;
        kotlin.jvm.internal.o.g(viewId, "viewId");
        dq0.k kVar = (dq0.k) this.f242330i.get(viewId);
        if (kVar != null && (surfaceProducer = kVar.f242315c) != null) {
            long id6 = surfaceProducer.id();
            if (this.f242325d) {
                com.tencent.wechat.zidl.MagicBrushResponseCaller magicBrushResponseCaller = (com.tencent.wechat.zidl.MagicBrushResponseCaller) com.tencent.zidl2.ZidlBrushApiManagerCaller.getInstance().getPropMagicBrushResponse();
                if (magicBrushResponseCaller != null) {
                    magicBrushResponseCaller.onViewTextureReady(viewId, (int) id6);
                }
            } else {
                com.tencent.pigeon.flutter_magic_brush.MagicBrushResponse magicBrushResponse = this.f242327f;
                if (magicBrushResponse != null) {
                    magicBrushResponse.onViewTextureReady(viewId, id6, dq0.l.f242320d);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "frameFrameRendered for viewId: ".concat(viewId));
    }

    public final void b(java.lang.String viewGroupId, java.lang.String viewId, cf3.d view) {
        kotlin.jvm.internal.o.g(viewGroupId, "viewGroupId");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(view, "view");
        java.util.HashMap hashMap = this.f242330i;
        hashMap.containsKey(viewId);
        io.flutter.view.TextureRegistry textureRegistry = this.f242326e;
        io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer = textureRegistry != null ? textureRegistry.createSurfaceProducer() : null;
        if (createSurfaceProducer != null) {
            createSurfaceProducer.setOnFrameAvailableListener(new dq0.m(view));
        }
        kotlin.jvm.internal.o.d(createSurfaceProducer);
        view.f40918c = createSurfaceProducer.getSurface();
        com.tencent.mars.xlog.Log.i("MBExternalViewStub", "currentSize=(" + view.f40922g + ',' + view.f40923h + "), targetSize=(100, 100)");
        if (100 != view.f40922g || 100 != view.f40923h) {
            view.f40922g = 100;
            view.f40923h = 100;
            if (view.f40919d) {
                jc3.o oVar = view.f40926k;
                if (oVar == null) {
                    kotlin.jvm.internal.o.o("canvasEventConsumer");
                    throw null;
                }
                rc3.w0 w0Var = (rc3.w0) oVar;
                w0Var.M(new rc3.l0(w0Var, view.f40925j, 100, 100));
            } else {
                jc3.o oVar2 = view.f40926k;
                if (oVar2 == null) {
                    kotlin.jvm.internal.o.o("canvasEventConsumer");
                    throw null;
                }
                int i17 = view.f40925j;
                android.view.Surface surface = view.f40918c;
                kotlin.jvm.internal.o.d(surface);
                ((rc3.w0) oVar2).pg(i17, surface, 100, 100);
                view.f40919d = true;
            }
        }
        hashMap.put(viewId, new dq0.k(viewId, view, createSurfaceProducer, 0L, 0L, 0L, 0L));
        if (this.f242325d) {
            com.tencent.wechat.zidl.MagicBrushResponseCaller magicBrushResponseCaller = (com.tencent.wechat.zidl.MagicBrushResponseCaller) com.tencent.zidl2.ZidlBrushApiManagerCaller.getInstance().getPropMagicBrushResponse();
            if (magicBrushResponseCaller != null) {
                magicBrushResponseCaller.onSubViewCreated(viewGroupId, viewId);
            }
        } else {
            com.tencent.pigeon.flutter_magic_brush.MagicBrushResponse magicBrushResponse = this.f242327f;
            if (magicBrushResponse != null) {
                magicBrushResponse.onSubViewCreated(viewGroupId, viewId, dq0.n.f242322d);
            }
        }
        com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "insert viewId: " + viewId + ' ' + this.f242326e);
    }

    public final void c(java.lang.String viewId) {
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer;
        kotlin.jvm.internal.o.g(viewId, "viewId");
        dq0.k kVar = (dq0.k) this.f242330i.remove(viewId);
        if (kVar != null && (surfaceProducer = kVar.f242315c) != null) {
            surfaceProducer.release();
        }
        com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "remove viewId: ".concat(viewId));
    }

    public final void d(java.lang.String viewId, long j17, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        dq0.k kVar = (dq0.k) this.f242330i.get(viewId);
        if (kVar != null) {
            kVar.f242316d = j17;
            kVar.f242317e = j18;
            kVar.f242318f = j19;
            kVar.f242319g = j27;
        }
        if (this.f242325d) {
            com.tencent.wechat.zidl.MagicBrushResponseCaller magicBrushResponseCaller = (com.tencent.wechat.zidl.MagicBrushResponseCaller) com.tencent.zidl2.ZidlBrushApiManagerCaller.getInstance().getPropMagicBrushResponse();
            if (magicBrushResponseCaller != null) {
                magicBrushResponseCaller.onViewStyleChanged(viewId, (int) j17, (int) j18, (int) j19, (int) j27);
            }
        } else {
            com.tencent.pigeon.flutter_magic_brush.MagicBrushResponse magicBrushResponse = this.f242327f;
            if (magicBrushResponse != null) {
                magicBrushResponse.onViewStyleChanged(viewId, j17, j18, j19, j27, dq0.o.f242323d);
            }
        }
        com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "layout viewId: " + viewId + ", offset = (" + j17 + ", " + j18 + "), size = (" + j19 + ", " + j27 + ')');
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x02fb, code lost:
    
        if (r6 != false) goto L48;
     */
    @Override // com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(java.lang.String r45, java.util.List r46) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.q.dispatchTouchEvent(java.lang.String, java.util.List):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f242329h = new java.lang.ref.WeakReference(binding.getFlutterEngine());
        this.f242326e = binding.getTextureRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        this.f242327f = new com.tencent.pigeon.flutter_magic_brush.MagicBrushResponse(binaryMessenger, null, 2, 0 == true ? 1 : 0);
        com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest.Companion companion = com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest.Companion.setUp$default(companion, binaryMessenger2, this, null, 4, null);
        com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "attachToEngine, engine: " + binding.getFlutterEngine());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        if (!kotlin.jvm.internal.o.b(this.f242329h.get(), binding.getFlutterEngine())) {
            com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "onDetachedFromEngine invoke, engine is the last engine, status not clear");
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicBrushFlutterPlugin.SCL", "onDetachedFromEngine, engine: " + binding.getFlutterEngine());
        java.util.HashMap hashMap = this.f242330i;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = ((dq0.k) it.next()).f242315c;
            if (surfaceProducer != null) {
                surfaceProducer.release();
            }
        }
        hashMap.clear();
        com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest.Companion companion = com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_magic_brush.MagicBrushRequest.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f242326e = null;
        this.f242327f = null;
        this.f242329h.clear();
    }
}
