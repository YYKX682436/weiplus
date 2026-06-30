package ku2;

/* loaded from: classes2.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.finder.FinderTingEntryNativeAPI {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f312158d;

    public a(java.lang.ref.WeakReference delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f312158d = delegate;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderTingEntryNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderTingEntryNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderTingEntryNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        new com.tencent.pigeon.finder.FinderTingEntryFlutterAPI(binaryMessenger2, null, 2, null);
    }

    @Override // com.tencent.pigeon.finder.FinderTingEntryNativeAPI
    public void onClickClose() {
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var;
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.viewmodel.component.v80 V6;
        ku2.b bVar = (ku2.b) this.f312158d.get();
        if (bVar == null || (weakReference = (e90Var = (com.tencent.mm.plugin.finder.viewmodel.component.e90) bVar).f134233f) == null || (s0Var = (in5.s0) weakReference.get()) == null || (baseFinderFeed = e90Var.f134232e) == null || (V6 = e90Var.V6(baseFinderFeed)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickClose, feedId = ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = V6.f136223a;
        sb6.append(e90Var.P6(baseFinderFeed2.getItemId()));
        sb6.append('}');
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
        e90Var.R6(s0Var, V6, true);
        e90Var.U6(baseFinderFeed2, com.tencent.mm.plugin.finder.viewmodel.component.u80.f136110f);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.report.d2.k(d2Var, itemView, "listen_page_thumbnail", "view_clk", true, e90Var.Q6(baseFinderFeed2), null, 32, null);
    }

    @Override // com.tencent.pigeon.finder.FinderTingEntryNativeAPI
    public void onClickJump() {
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var;
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.viewmodel.component.v80 V6;
        ku2.b bVar = (ku2.b) this.f312158d.get();
        if (bVar == null || (weakReference = (e90Var = (com.tencent.mm.plugin.finder.viewmodel.component.e90) bVar).f134233f) == null || (s0Var = (in5.s0) weakReference.get()) == null || (baseFinderFeed = e90Var.f134232e) == null || (V6 = e90Var.V6(baseFinderFeed)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickJump, feedId = ");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = V6.f136223a;
        sb6.append(e90Var.P6(baseFinderFeed2.getItemId()));
        sb6.append('}');
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
        e90Var.S6(baseFinderFeed2);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.report.d2.k(d2Var, itemView, "finder_enter_sleep", "view_clk", true, e90Var.Q6(baseFinderFeed2), null, 32, null);
    }

    @Override // com.tencent.pigeon.finder.FinderTingEntryNativeAPI
    public void onClickRemindJump() {
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var;
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.viewmodel.component.v80 V6;
        ku2.b bVar = (ku2.b) this.f312158d.get();
        if (bVar == null || (weakReference = (e90Var = (com.tencent.mm.plugin.finder.viewmodel.component.e90) bVar).f134233f) == null || (s0Var = (in5.s0) weakReference.get()) == null || (baseFinderFeed = e90Var.f134232e) == null || (V6 = e90Var.V6(baseFinderFeed)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = V6.f136223a;
        e90Var.f134239o = baseFinderFeed2.getItemId();
        e90Var.f134231d = e90Var.O6();
        android.app.Activity context = e90Var.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(com.tencent.mm.R.string.o2u);
        e4Var.c();
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", "onClickRemind, feedId = " + e90Var.P6(baseFinderFeed2.getItemId()) + '}');
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.report.d2.k(d2Var, itemView, "finder_exit_remind", "view_clk", true, e90Var.Q6(baseFinderFeed2), null, 32, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderTingEntryNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderTingEntryNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderTingEntryNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
