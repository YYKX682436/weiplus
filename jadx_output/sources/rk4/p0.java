package rk4;

/* loaded from: classes11.dex */
public final class p0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.ting.TingInsertedContentApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f396889d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingInsertedContentCallBack f396890e;

    public final int a(double d17) {
        android.app.Activity activity = this.f396889d;
        java.lang.Object systemService = activity != null ? activity.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        android.graphics.Point point = new android.graphics.Point();
        if (defaultDisplay != null) {
            defaultDisplay.getRealSize(point);
        }
        int i17 = point.y;
        return this.f396889d != null ? (int) ((i17 * d17) - com.tencent.mm.ui.bl.c(r1)) : (int) (i17 * d17);
    }

    @Override // com.tencent.pigeon.ting.TingInsertedContentApi
    public void closeProfileDialog() {
        android.app.Activity activity = this.f396889d;
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(lm4.i0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            lm4.b0 b0Var = ((lm4.i0) a17).f319570f;
            if (b0Var != null) {
                int i17 = com.tencent.mm.plugin.ting.view.TingPlayerDraggableLayout.f174821u;
                b0Var.j(b0Var.edgeAttached, true);
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        android.app.Activity activity = p07.getActivity();
        this.f396889d = activity;
        kotlin.jvm.internal.o.d(activity);
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(lm4.i0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        lm4.i0 i0Var = (lm4.i0) a17;
        i0Var.f319576o.add(new rk4.n0(this));
        rk4.u6 u6Var = rk4.k8.f396788r;
        rk4.k8.f396792v = new rk4.o0(i0Var);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.ting.TingInsertedContentApi.Companion companion = com.tencent.pigeon.ting.TingInsertedContentApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingInsertedContentApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f396890e = new com.tencent.pigeon.ting.TingInsertedContentCallBack(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f396889d = null;
        rk4.u6 u6Var = rk4.k8.f396788r;
        rk4.k8.f396792v = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.ting.TingInsertedContentApi.Companion companion = com.tencent.pigeon.ting.TingInsertedContentApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingInsertedContentApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f396890e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // com.tencent.pigeon.ting.TingInsertedContentApi
    public void showBizProfileDialog(java.lang.String userName, double d17, byte[] listenItemData, long j17, java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f396889d;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", userName);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            intent.putExtra("Contact_Scene", (int) j17);
            if (str == null) {
                str = "";
            }
            intent.putExtra("Contact_Scene_Note", str);
            intent.putExtra("biz_dialog_show_header_bar", false);
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(lm4.i0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((lm4.i0) a17).O6(intent, a(d17), lm4.c0.f319545e);
        }
    }

    @Override // com.tencent.pigeon.ting.TingInsertedContentApi
    public void showFinderProfileDialog(java.lang.String userName, double d17, byte[] listenItemData, long j17, long j18, java.lang.String str, long j19, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f396889d;
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", userName);
            int i17 = (int) j18;
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(37, 42, i17, intent);
            intent.putExtra("key_enter_profile_type", 42);
            if (j17 == com.tencent.pigeon.ting.FinderProfileTabType.TYPE_CATEGORY.ordinal()) {
                intent.putExtra("key_enter_profile_tab", 7);
            } else if (j17 == com.tencent.pigeon.ting.FinderProfileTabType.TYPE_MUSIC.ordinal()) {
                intent.putExtra("key_enter_profile_tab", 6);
            } else if (j17 == com.tencent.pigeon.ting.FinderProfileTabType.TYPE_AUDIO.ordinal()) {
                intent.putExtra("key_enter_profile_tab", 8);
            }
            if (!(str == null || r26.n0.N(str))) {
                intent.putExtra("key_extra_info", str);
            }
            intent.putExtra("key_from_comment_scene", i17);
            intent.putExtra("key_from_follow_scene", il4.c.a(j19));
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(lm4.i0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((lm4.i0) a17).O6(intent, a(d17), lm4.c0.f319544d);
        }
    }
}
