package si0;

/* loaded from: classes4.dex */
public final class v0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate {

    /* renamed from: d, reason: collision with root package name */
    public si0.s1 f408204d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate.Companion companion = com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate.Companion companion = com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f408204d = null;
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsVisibilityPageDelegate
    public void onSelectSnsVisibilityCallback(byte[] bArr) {
        si0.s1 s1Var;
        java.util.ArrayList arrayList;
        if (bArr == null || (s1Var = this.f408204d) == null) {
            return;
        }
        bw5.nk0 parseFrom = new bw5.nk0().parseFrom(bArr);
        kotlin.jvm.internal.o.f(parseFrom, "parseFrom(...)");
        java.lang.String str = com.tencent.mm.plugin.sns.ui.NewRangeWidget.F;
        com.tencent.mm.plugin.sns.ui.NewRangeWidget newRangeWidget = ((com.tencent.mm.plugin.sns.ui.NewRangeWidget$$b) s1Var).f166404a;
        newRangeWidget.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
        newRangeWidget.A = parseFrom;
        com.tencent.mm.plugin.sns.ui.y0 y0Var = newRangeWidget.E;
        if (y0Var != null) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsUploadUI.f167517x1;
            com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = ((com.tencent.mm.plugin.sns.ui.SnsUploadUI$$c) y0Var).f167546a;
            snsUploadUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setRangeWidgetRangeChangeCallback$2", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            cj0.a aVar = cj0.a.f41853a;
            aVar.l("MicroMsg.SnsUploadUI", parseFrom);
            bw5.qk0 type = parseFrom.b();
            kotlin.jvm.internal.o.g(type, "type");
            int ordinal = type.ordinal();
            int i18 = 1;
            if (ordinal == 1) {
                i18 = 0;
            } else if (ordinal != 2) {
                i18 = 3;
                if (ordinal == 3) {
                    i18 = 2;
                }
            }
            snsUploadUI.getIntent().putExtra("Ktag_range_index", i18);
            snsUploadUI.getIntent().putStringArrayListExtra("label_id", snsUploadUI.f167543z);
            snsUploadUI.getIntent().putExtra("Kother_user_name_list", snsUploadUI.f167539x);
            snsUploadUI.getIntent().putExtra("Klabel_name_list", snsUploadUI.f167537v);
            android.content.Intent intent = snsUploadUI.getIntent();
            bw5.qk0 b17 = parseFrom.b();
            bw5.qk0 qk0Var = bw5.qk0.SNS_VISIBILITY_VISIBLE;
            intent.putStringArrayListExtra("label_id", b17 == qk0Var ? aVar.h(parseFrom) : aVar.c(parseFrom));
            snsUploadUI.getIntent().putStringArrayListExtra("KExclude_label_list", parseFrom.b() == qk0Var ? aVar.c(parseFrom) : aVar.h(parseFrom));
            if (parseFrom.b() == qk0Var) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = parseFrom.f30712e.iterator();
                while (it.hasNext()) {
                    bw5.pk0 pk0Var = (bw5.pk0) it.next();
                    arrayList.add(pk0Var.f31711g[2] ? pk0Var.f31709e : "");
                }
            } else {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = parseFrom.f30718n.iterator();
                while (it6.hasNext()) {
                    bw5.pk0 pk0Var2 = (bw5.pk0) it6.next();
                    arrayList.add(pk0Var2.f31711g[2] ? pk0Var2.f31709e : "");
                }
            }
            snsUploadUI.getIntent().putExtra("Klabel_name_list", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
            snsUploadUI.getIntent().putStringArrayListExtra("KExclude_user_list", aVar.d(parseFrom));
            snsUploadUI.getIntent().putExtra("Kother_user_name_list", com.tencent.mm.sdk.platformtools.t8.c1(parseFrom.b() == qk0Var ? aVar.f(parseFrom) : aVar.a(parseFrom), ","));
            snsUploadUI.getIntent().putStringArrayListExtra("KInteract_user_list", aVar.i(parseFrom));
            snsUploadUI.o7(snsUploadUI.getIntent());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setRangeWidgetRangeChangeCallback$2", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$init$0", "com.tencent.mm.plugin.sns.ui.NewRangeWidget");
    }
}
