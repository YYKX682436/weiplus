package dz4;

/* loaded from: classes8.dex */
public final class m3 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public final ih0.p f245352d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f245353e;

    public m3(ih0.p noteDataHolder) {
        kotlin.jvm.internal.o.g(noteDataHolder, "noteDataHolder");
        this.f245352d = noteDataHolder;
        this.f245353e = "MicroMsg.WeNoteFlutterPlugin";
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f245353e, "onAttachedToActivity: ");
        ((ez4.u) this.f245352d).d(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f245353e, "onAttachedToEngine: ");
        ez4.u uVar = (ez4.u) this.f245352d;
        uVar.getClass();
        dz4.s1 s1Var = (dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class));
        s1Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) s1Var.f245397e;
        if (!arrayList.contains(uVar)) {
            arrayList.add(uVar);
            return;
        }
        com.tencent.mars.xlog.Log.w(s1Var.f245396d, "registerFavNoteActivityHolder: holder already exists, key: " + uVar.f257943b);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i(this.f245353e, "onDetachedFromActivity: ");
        ((ez4.u) this.f245352d).d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        com.tencent.mars.xlog.Log.i(this.f245353e, "onDetachedFromActivityForConfigChanges: ");
        ((ez4.u) this.f245352d).d(null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f245353e, "onDetachedFromEngine: ");
        ez4.u uVar = (ez4.u) this.f245352d;
        if (uVar.f257945d) {
            return;
        }
        ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).Ai(uVar);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f245353e, "onReattachedToActivityForConfigChanges: ");
        ((ez4.u) this.f245352d).d(binding.getActivity());
    }
}
