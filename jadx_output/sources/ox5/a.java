package ox5;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f349792a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.liteapp.gen.LiteAppReporter f349793b;

    /* renamed from: c, reason: collision with root package name */
    public final ox5.l f349794c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.android.FlutterView f349795d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.platform.PlatformPlugin f349796e;

    /* renamed from: f, reason: collision with root package name */
    public final mx5.c f349797f;

    /* renamed from: g, reason: collision with root package name */
    public final ox5.j f349798g = new ox5.j(this);

    /* renamed from: h, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener f349799h = new ox5.b(this);

    /* renamed from: i, reason: collision with root package name */
    public ox5.k f349800i = null;

    public a(ox5.l lVar, int i17, com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        io.flutter.embedding.engine.FlutterEngine g17;
        boolean z17;
        this.f349793b = null;
        this.f349794c = lVar;
        this.f349793b = liteAppReporter;
        this.f349792a = i17;
        kx5.n h17 = kx5.n.h();
        int i18 = this.f349792a;
        h17.getClass();
        if (i18 == 0 || (g17 = kx5.n.h().g(i18)) == null) {
            z17 = false;
        } else {
            if (h17.f313313c == g17) {
                h17.f313313c = null;
                h17.f313318h = java.lang.Boolean.FALSE;
            }
            z17 = true;
        }
        if (!z17) {
            nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Setting up FlutterEngine. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
            a();
            this.f349792a = kx5.n.h().o(false, liteAppReporter);
            if (b() != null) {
                nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "flutter engine is not null. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
                if (liteAppReporter != null) {
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.LOAD_FLUTTER_ENGINE_SUCCESS);
                }
            } else {
                nx5.c.b("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "flutter engine is null. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
                if (liteAppReporter != null) {
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.LOAD_FLUTTER_ENGINE_FAILED);
                }
            }
        }
        this.f349797f = new mx5.a(lVar.getFlutterActivity(), this.f349792a);
    }

    public final void a() {
        if (this.f349794c == null) {
            throw new java.lang.IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public io.flutter.embedding.engine.FlutterEngine b() {
        return kx5.n.h().g(this.f349792a);
    }

    public void c(int i17, int i18, android.content.Intent intent) {
        a();
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            return;
        }
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i17 + "\nresultCode: " + i18 + "\ndata: " + intent, new java.lang.Object[0]);
        b17.getActivityControlSurface().onActivityResult(i17, i18, intent);
    }

    public void d(boolean z17, boolean z18) {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onBackPressed", new java.lang.Object[0]);
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        a();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            ox5.l lVar = this.f349794c;
            if (lVar.m42getActivity() != null) {
                lVar.m42getActivity().finish();
                return;
            }
            return;
        }
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.", new java.lang.Object[0]);
        mx5.c cVar = this.f349797f;
        ox5.i iVar = new ox5.i(this);
        mx5.a aVar = (mx5.a) cVar;
        aVar.getClass();
        nx5.c.c("WxaRouter.DefaultFlutterViewLifecycle", "onBackPressed", new java.lang.Object[0]);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("activityId", aVar.f332635a.getFlutterViewId());
        hashMap.put("animation", java.lang.Boolean.valueOf(z17));
        hashMap.put("popPage", java.lang.Boolean.valueOf(z18));
        kx5.n.h().k(aVar.f332636b, "onBackPressed", hashMap, iVar);
    }

    public void e() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onCreate. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
        a();
        ox5.l lVar = this.f349794c;
        this.f349796e = lVar.providePlatformPlugin(lVar.m42getActivity(), b());
        lVar.configureFlutterEngine(b());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View f(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox5.a.f(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void g(final boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(this.f349792a);
        objArr[1] = z17 ? "true" : "false";
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onDestroy() engineId:%d closeView:%s", objArr);
        mx5.c cVar = this.f349797f;
        final java.util.Map a17 = ((mx5.a) cVar).a();
        final int i17 = this.f349792a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: ox5.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                kx5.n h17 = kx5.n.h();
                int i18 = i17;
                java.util.Map map = a17;
                h17.j(i18, "onDestroyView", map);
                if (z17) {
                    kx5.n.h().j(i18, "closeView", map);
                }
                kx5.n.h().p(i18);
            }
        };
        ox5.l lVar = this.f349794c;
        boolean b07 = lVar.b0(runnable);
        if (b07) {
            mx5.a aVar = (mx5.a) cVar;
            aVar.getClass();
            kx5.n.h().j(aVar.f332636b, "keepAlive", aVar.a());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(this.f349792a);
        objArr2[1] = b07 ? "true" : "false";
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onDestroyView. engineId:%d onlyDetach:%s", objArr2);
        if (!b07) {
            mx5.a aVar2 = (mx5.a) cVar;
            aVar2.getClass();
            kx5.n.h().j(aVar2.f332636b, "onDestroyView", aVar2.a());
        }
        a();
        if (z17) {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onCloseView()", new java.lang.Object[0]);
            if (!b07) {
                mx5.a aVar3 = (mx5.a) cVar;
                aVar3.getClass();
                kx5.n.h().j(aVar3.f332636b, "closeView", aVar3.a());
            }
        }
        io.flutter.plugin.platform.PlatformPlugin platformPlugin = this.f349796e;
        if (platformPlugin != null) {
            platformPlugin.destroy();
            this.f349796e = null;
        }
        kx5.n h17 = kx5.n.h();
        mx5.b flutterActivity = lVar.getFlutterActivity();
        io.flutter.embedding.android.FlutterView flutterView = this.f349795d;
        int i18 = this.f349792a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "destroy activityId:%s engineId:%d", flutterActivity.getFlutterViewId(), java.lang.Integer.valueOf(i18));
        if (h17.f313317g.indexOfKey(i18) < 0) {
            nx5.c.b("WxaRouter.WxaRouter", "destroy fail", new java.lang.Object[0]);
            return;
        }
        if (flutterView != null) {
            flutterView.detachFromFlutterEngine();
        } else {
            nx5.c.b("WxaRouter.WxaRouter", "destroy view is null", new java.lang.Object[0]);
        }
        io.flutter.embedding.engine.FlutterEngine g17 = h17.g(i18);
        if (lVar.shouldAttachEngineToActivity()) {
            nx5.c.a("WxaRouter.WxaRouter", "detachFromActivity", new java.lang.Object[0]);
            if (lVar.m42getActivity().isChangingConfigurations()) {
                g17.getActivityControlSurface().detachFromActivityForConfigChanges();
            } else {
                g17.getActivityControlSurface().detachFromActivity();
            }
        }
        if (!b07) {
            h17.p(i18);
        }
        h17.f313316f.remove(flutterActivity.getFlutterViewId());
        mx5.b bVar = h17.f313315e;
        if (bVar == null || bVar != flutterActivity) {
            return;
        }
        nx5.c.c("WxaRouter.WxaRouter", "detach current activity. set CurrentActivity null", new java.lang.Object[0]);
        h17.f313315e = null;
    }

    public void h(android.content.Intent intent) {
        a();
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
        } else {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine.", new java.lang.Object[0]);
            b17.getActivityControlSurface().onNewIntent(intent);
        }
    }

    public void i() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPause. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
        b();
        mx5.a aVar = (mx5.a) this.f349797f;
        aVar.getClass();
        kx5.n.h().j(aVar.f332636b, "onPauseView", aVar.a());
        kx5.n h17 = kx5.n.h();
        io.flutter.embedding.android.FlutterView flutterView = this.f349795d;
        int i17 = this.f349792a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "appIsInactive view:%d engineId:%d", java.lang.Integer.valueOf(flutterView.hashCode()), java.lang.Integer.valueOf(i17));
        io.flutter.embedding.engine.FlutterEngine g17 = h17.g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "engine is nil", new java.lang.Object[0]);
        } else {
            g17.getLifecycleChannel().appIsInactive();
        }
        a();
    }

    public void j() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPostResume. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        a();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            return;
        }
        io.flutter.plugin.platform.PlatformPlugin platformPlugin = this.f349796e;
        if (platformPlugin != null) {
            platformPlugin.updateSystemUiOverlays();
        }
    }

    public void k(int i17, java.lang.String[] strArr, int[] iArr) {
        a();
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
            return;
        }
        nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i17 + "\npermissions: " + java.util.Arrays.toString(strArr) + "\ngrantResults: " + java.util.Arrays.toString(iArr), new java.lang.Object[0]);
        b17.getActivityControlSurface().onRequestPermissionsResult(i17, strArr, iArr);
    }

    public void l() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onResume. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
        kx5.n h17 = kx5.n.h();
        io.flutter.embedding.android.FlutterView flutterView = this.f349795d;
        int i17 = this.f349792a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "appIsResumed view:%d engineId:%d", java.lang.Integer.valueOf(flutterView.hashCode()), java.lang.Integer.valueOf(i17));
        io.flutter.embedding.engine.FlutterEngine g17 = h17.g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "engine is nil", new java.lang.Object[0]);
        } else {
            g17.getLifecycleChannel().appIsResumed();
        }
        mx5.a aVar = (mx5.a) this.f349797f;
        aVar.getClass();
        kx5.n.h().j(aVar.f332636b, "onResumeView", aVar.a());
        a();
    }

    public void m() {
        io.flutter.embedding.engine.FlutterEngine b17;
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onStart. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
        a();
        ox5.l lVar = this.f349794c;
        if (lVar.getCachedEngineId() != null || (b17 = b()) == null || b17.getDartExecutor().isExecutingDart()) {
            return;
        }
        nx5.c.a("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + lVar.getDartEntrypointFunctionName() + ", and sending initial route: " + lVar.getInitialRoute(), new java.lang.Object[0]);
        if (lVar.getInitialRoute() != null) {
            b17.getNavigationChannel().setInitialRoute(lVar.getInitialRoute());
        }
        b17.getDartExecutor().executeDartEntrypoint(new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(lVar.getAppBundlePath(), lVar.getDartEntrypointFunctionName()));
    }

    public void n() {
        nx5.c.c("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onStop. engineId:%d", java.lang.Integer.valueOf(this.f349792a));
        b();
        a();
        kx5.n h17 = kx5.n.h();
        io.flutter.embedding.android.FlutterView flutterView = this.f349795d;
        int i17 = this.f349792a;
        h17.getClass();
        nx5.c.c("WxaRouter.WxaRouter", "appIsPause view:%d engineId:%d", java.lang.Integer.valueOf(flutterView.hashCode()), java.lang.Integer.valueOf(i17));
        io.flutter.embedding.engine.FlutterEngine g17 = h17.g(i17);
        if (g17 == null) {
            nx5.c.b("WxaRouter.WxaRouter", "engine is nil", new java.lang.Object[0]);
        } else {
            g17.getLifecycleChannel().appIsPaused();
        }
    }

    public void o(int i17) {
        a();
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
        } else if (i17 == 10) {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i17, new java.lang.Object[0]);
            b17.getSystemChannel().sendMemoryPressureWarning();
        }
    }

    public void p() {
        a();
        io.flutter.embedding.engine.FlutterEngine b17 = b();
        if (b17 == null) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.", new java.lang.Object[0]);
        } else {
            nx5.c.d("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.", new java.lang.Object[0]);
            b17.getActivityControlSurface().onUserLeaveHint();
        }
    }
}
