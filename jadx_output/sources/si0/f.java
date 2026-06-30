package si0;

/* loaded from: classes13.dex */
public final class f implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.flutter_pag.PAGViewApi {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f408067h;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f408068d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.BinaryMessenger f408069e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f408070f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f408071g = new java.util.HashMap();

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public void create(com.tencent.pigeon.flutter_pag.FlutterPAGInfo info, yz5.l callback) {
        si0.o0 l0Var;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        io.flutter.Log.i("MicroMsg.FlutterPAGPlugin", "setUseRfxPag:" + f408067h);
        if (f408067h) {
            android.content.Context context = this.f408070f;
            kotlin.jvm.internal.o.d(context);
            io.flutter.view.TextureRegistry textureRegistry = this.f408068d;
            kotlin.jvm.internal.o.d(textureRegistry);
            io.flutter.plugin.common.BinaryMessenger binaryMessenger = this.f408069e;
            kotlin.jvm.internal.o.d(binaryMessenger);
            l0Var = new si0.v(context, textureRegistry, binaryMessenger, info.getPagId());
        } else {
            android.content.Context context2 = this.f408070f;
            kotlin.jvm.internal.o.d(context2);
            io.flutter.view.TextureRegistry textureRegistry2 = this.f408068d;
            kotlin.jvm.internal.o.d(textureRegistry2);
            io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = this.f408069e;
            kotlin.jvm.internal.o.d(binaryMessenger2);
            l0Var = new si0.l0(context2, textureRegistry2, binaryMessenger2, info.getPagId());
        }
        this.f408071g.put(java.lang.Long.valueOf(info.getPagId()), l0Var);
        l0Var.a(info, new si0.c(callback));
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public void flush(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new si0.e(o0Var, callback, null), 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.tencent.pigeon.flutter_pag.PAGViewApi.Companion companion = com.tencent.pigeon.flutter_pag.PAGViewApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_pag.PAGViewApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f408069e = flutterPluginBinding.getBinaryMessenger();
        this.f408068d = flutterPluginBinding.getTextureRegistry();
        this.f408070f = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.tencent.pigeon.flutter_pag.PAGViewApi.Companion companion = com.tencent.pigeon.flutter_pag.PAGViewApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_pag.PAGViewApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f408068d = null;
        this.f408069e = null;
        this.f408070f = null;
        java.util.HashMap hashMap = this.f408071g;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((si0.o0) it.next()).release();
        }
        hashMap.clear();
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public void pagViewRelease(long j17) {
        io.flutter.Log.i("MicroMsg.FlutterPAGPlugin", "pagViewRelease pagId:" + j17);
        java.util.HashMap hashMap = this.f408071g;
        si0.o0 o0Var = (si0.o0) hashMap.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return;
        }
        o0Var.release();
        hashMap.remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public boolean pagViewStartPlay(long j17) {
        io.flutter.Log.i("MicroMsg.FlutterPAGPlugin", "pagViewStartPlay pagId:" + j17);
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        o0Var.startPlay();
        return true;
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public boolean pagViewStop(long j17) {
        io.flutter.Log.i("MicroMsg.FlutterPAGPlugin", "pagViewStop pagId:" + j17);
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        o0Var.stop();
        return true;
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public boolean replaceImage(long j17, long j18, java.lang.String filepath) {
        kotlin.jvm.internal.o.g(filepath, "filepath");
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        return o0Var.e((int) j18, filepath);
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public boolean replaceText(long j17, long j18, com.tencent.pigeon.flutter_pag.FlutterPAGText text) {
        kotlin.jvm.internal.o.g(text, "text");
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        return o0Var.c((int) j18, text);
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public void seek(long j17, long j18) {
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return;
        }
        o0Var.seek(j18);
    }

    @Override // com.tencent.pigeon.flutter_pag.PAGViewApi
    public boolean setSolidLayerColor(long j17, java.lang.String name, long j18) {
        kotlin.jvm.internal.o.g(name, "name");
        si0.o0 o0Var = (si0.o0) this.f408071g.get(java.lang.Long.valueOf(j17));
        if (o0Var == null) {
            return false;
        }
        return o0Var.d(name, (int) j18);
    }
}
