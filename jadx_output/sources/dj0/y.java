package dj0;

/* loaded from: classes14.dex */
public final class y implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0.z f232888d;

    public y(dj0.z zVar) {
        this.f232888d = zVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        android.view.Window window4;
        android.view.Window window5;
        android.view.Window window6;
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "<anonymous parameter 1>");
        java.lang.String str = methodCall.method;
        if (str != null) {
            int hashCode = str.hashCode();
            android.view.View view = null;
            dj0.z zVar = this.f232888d;
            switch (hashCode) {
                case -1488148924:
                    if (str.equals("updateGestureRect")) {
                        java.lang.Object obj = methodCall.arguments;
                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Number>");
                        java.util.List list = (java.util.List) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        android.app.Activity activity = zVar.f232890e;
                        if (activity != null) {
                            float f17 = activity.getResources().getDisplayMetrics().density;
                            int a17 = sz5.b.a(0, list.size() - 1, 4);
                            if (a17 >= 0) {
                                while (true) {
                                    double d17 = f17;
                                    int i17 = r6 + 1;
                                    arrayList.add(new android.graphics.Rect((int) (((java.lang.Number) list.get(r6)).doubleValue() * d17), (int) (((java.lang.Number) list.get(i17)).doubleValue() * d17), (int) ((((java.lang.Number) list.get(r6)).doubleValue() + ((java.lang.Number) list.get(r6 + 2)).doubleValue()) * d17), (int) ((((java.lang.Number) list.get(i17)).doubleValue() + ((java.lang.Number) list.get(r6 + 3)).doubleValue()) * d17)));
                                    if (r6 != a17) {
                                        r6 += 4;
                                    }
                                }
                            }
                            dj0.i iVar = zVar.f232891f;
                            if (iVar != null) {
                                iVar.G = arrayList;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1407259067:
                    if (str.equals("attach")) {
                        android.app.Activity activity2 = zVar.f232890e;
                        if (!(((activity2 == null || (window3 = activity2.getWindow()) == null) ? null : window3.getDecorView()) instanceof android.view.ViewGroup)) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attach decor view error, decor view is ");
                            android.app.Activity activity3 = zVar.f232890e;
                            if (activity3 != null && (window2 = activity3.getWindow()) != null) {
                                view = window2.getDecorView();
                            }
                            sb6.append(view);
                            io.flutter.Log.w("NativeScrollViewPlugin", sb6.toString());
                            return;
                        }
                        zVar.f232892g = true;
                        android.app.Activity activity4 = zVar.f232890e;
                        if (activity4 != null && (window = activity4.getWindow()) != null) {
                            view = window.getDecorView();
                        }
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        if (viewGroup != null) {
                            io.flutter.embedding.android.FlutterView flutterView = zVar.f232893h;
                            if (flutterView == null) {
                                flutterView = (io.flutter.embedding.android.FlutterView) zVar.b(viewGroup, io.flutter.embedding.android.FlutterView.class);
                            }
                            zVar.f232893h = flutterView;
                            dj0.i iVar2 = zVar.f232891f;
                            if (iVar2 != null) {
                                iVar2.B = true;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1335224429:
                    if (str.equals("detach")) {
                        android.app.Activity activity5 = zVar.f232890e;
                        if (!(((activity5 == null || (window6 = activity5.getWindow()) == null) ? null : window6.getDecorView()) instanceof android.view.ViewGroup)) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach decor view error, decor view is ");
                            android.app.Activity activity6 = zVar.f232890e;
                            if (activity6 != null && (window5 = activity6.getWindow()) != null) {
                                view = window5.getDecorView();
                            }
                            sb7.append(view);
                            io.flutter.Log.w("NativeScrollViewPlugin", sb7.toString());
                            return;
                        }
                        zVar.f232892g = false;
                        android.app.Activity activity7 = zVar.f232890e;
                        if (activity7 != null && (window4 = activity7.getWindow()) != null) {
                            view = window4.getDecorView();
                        }
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view;
                        if (viewGroup2 != null) {
                            io.flutter.embedding.android.FlutterView flutterView2 = zVar.f232893h;
                            if (flutterView2 == null) {
                                flutterView2 = (io.flutter.embedding.android.FlutterView) zVar.b(viewGroup2, io.flutter.embedding.android.FlutterView.class);
                            }
                            zVar.f232893h = flutterView2;
                            dj0.i iVar3 = zVar.f232891f;
                            if (iVar3 != null) {
                                iVar3.B = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 1668572474:
                    if (str.equals("contentSizeChanged")) {
                        java.lang.Object obj2 = methodCall.arguments;
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Number>");
                        java.lang.Number number = (java.lang.Number) ((java.util.Map) obj2).get("maxScrollExtent");
                        if (zVar.f232890e != null) {
                            kotlin.jvm.internal.o.d(number);
                            int doubleValue = (int) (number.doubleValue() * r1.getResources().getDisplayMetrics().density);
                            io.flutter.embedding.android.FlutterView flutterView3 = zVar.f232893h;
                            if (flutterView3 != null) {
                                int height = doubleValue - flutterView3.getHeight();
                                dj0.i iVar4 = zVar.f232891f;
                                if (iVar4 != null) {
                                    iVar4.setMaxScrollOffset(height >= 0 ? height : 0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
