package h03;

/* loaded from: classes2.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.finder.FinderNativeAPI {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f277870d;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f277870d = context;
    }

    @Override // com.tencent.pigeon.finder.FinderNativeAPI
    public java.util.Map finderCommonReportParams() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String X6;
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = this.f277870d;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        r45.qt2 V6 = e17 != null ? e17.V6() : null;
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String str5 = "";
        if (V6 == null || (str = V6.getString(0)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", str);
        if (V6 == null || (str2 = V6.getString(1)) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        if (V6 == null || (str3 = V6.getString(2)) == null) {
            str3 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", str3);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
        if (e18 == null || (str4 = e18.A) == null) {
            str4 = "";
        }
        lVarArr[3] = new jz5.l("enter_source_info", str4);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
        if (e19 != null && (X6 = e19.X6()) != null) {
            str5 = X6;
        }
        lVarArr[4] = new jz5.l("extra_info", str5);
        return kz5.c1.k(lVarArr);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        new com.tencent.pigeon.finder.FinderFlutterAPI(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
