package dj0;

/* loaded from: classes14.dex */
public final class z implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f232889d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f232890e;

    /* renamed from: f, reason: collision with root package name */
    public dj0.i f232891f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f232892g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.android.FlutterView f232893h;

    public final void a(double d17) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f232889d;
        if (methodChannel != null) {
            methodChannel.invokeMethod("didScroll", java.lang.Double.valueOf(d17));
        }
    }

    public final android.view.View b(android.view.ViewGroup viewGroup, java.lang.Class cls) {
        android.view.View b17;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (cls.isInstance(childAt)) {
                return (android.view.View) cls.cast(childAt);
            }
            if ((childAt instanceof android.view.ViewGroup) && (b17 = b((android.view.ViewGroup) childAt, cls)) != null) {
                return b17;
            }
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        dj0.i iVar;
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f232890e = binding.getActivity();
        android.view.ViewConfiguration.get(binding.getActivity()).getScaledTouchSlop();
        android.app.Activity activity = this.f232890e;
        r1 = null;
        android.view.View view = null;
        if (!(((activity == null || (window3 = activity.getWindow()) == null) ? null : window3.getDecorView()) instanceof android.view.ViewGroup)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach decor view error, decor view is ");
            android.app.Activity activity2 = this.f232890e;
            if (activity2 != null && (window2 = activity2.getWindow()) != null) {
                view = window2.getDecorView();
            }
            sb6.append(view);
            io.flutter.Log.w("NativeScrollViewPlugin", sb6.toString());
            return;
        }
        android.app.Activity activity3 = this.f232890e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getDecorView());
        if (viewGroup != null) {
            io.flutter.embedding.android.FlutterView flutterView = this.f232893h;
            if (flutterView == null) {
                flutterView = (io.flutter.embedding.android.FlutterView) b(viewGroup, io.flutter.embedding.android.FlutterView.class);
            }
            this.f232893h = flutterView;
        }
        if (this.f232891f == null) {
            android.content.Context applicationContext = binding.getActivity().getApplicationContext();
            kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
            dj0.i iVar2 = new dj0.i(applicationContext);
            this.f232891f = iVar2;
            iVar2.f232836n = this;
            iVar2.f232829d.i(true);
            dj0.i iVar3 = this.f232891f;
            if (iVar3 != null) {
                iVar3.A = this.f232893h;
            }
            io.flutter.embedding.android.FlutterView flutterView2 = this.f232893h;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (flutterView2 != null ? flutterView2.getParent() : null);
            if (viewGroup2 != null) {
                int indexOfChild = viewGroup2.indexOfChild(this.f232893h);
                dj0.i iVar4 = this.f232891f;
                int i17 = indexOfChild + 1;
                io.flutter.embedding.android.FlutterView flutterView3 = this.f232893h;
                viewGroup2.addView(iVar4, i17, flutterView3 != null ? flutterView3.getLayoutParams() : null);
            }
            if (!this.f232892g || (iVar = this.f232891f) == null) {
                return;
            }
            iVar.B = true;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "nativeScroll");
        this.f232889d = methodChannel;
        methodChannel.setMethodCallHandler(new dj0.y(this));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f232890e = null;
        this.f232893h = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        dj0.i iVar = this.f232891f;
        if (iVar != null) {
            iVar.f232831f = 0;
            iVar.f232830e.forceFinished(true);
            iVar.f232832g = 0;
            android.view.VelocityTracker velocityTracker = iVar.f232844v;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            iVar.f232844v = null;
        }
        io.flutter.plugin.common.MethodChannel methodChannel = this.f232889d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
