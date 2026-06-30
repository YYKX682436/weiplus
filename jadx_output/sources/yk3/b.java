package yk3;

/* loaded from: classes8.dex */
public abstract class b implements pk3.b {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f462802d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f462803e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f462804f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.MultiTaskPanelContainer f462805g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f462806h;

    /* renamed from: i, reason: collision with root package name */
    public pk3.h f462807i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f462808m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f462809n;

    public b(androidx.appcompat.app.AppCompatActivity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f462802d = activity;
        this.f462803e = bundle;
        this.f462804f = "MicroMsg.MultiTask.MultiTaskPanelItem";
        this.f462808m = new java.util.HashSet();
        this.f462809n = new java.util.HashMap();
    }

    public final pk3.h a(int i17, java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        for (pk3.h hVar : this.f462808m) {
            if (hVar.M9(i17)) {
                java.util.HashMap hashMap = this.f462809n;
                if (hashMap.containsKey(id6) && kotlin.jvm.internal.o.b(hVar, hashMap.get(id6))) {
                    return hVar;
                }
            }
        }
        return null;
    }

    public final pk3.h b(int i17, java.lang.String id6) {
        com.tencent.mm.plugin.multitask.ui.MultiTaskPanelContainer multiTaskPanelContainer;
        kotlin.jvm.internal.o.g(id6, "id");
        for (pk3.h hVar : this.f462808m) {
            if (hVar.M9(i17)) {
                java.util.HashMap hashMap = this.f462809n;
                if (hashMap.containsKey(id6) && kotlin.jvm.internal.o.b(hVar, hashMap.get(id6))) {
                    return hVar;
                }
            }
        }
        java.util.HashMap hashMap2 = com.tencent.mm.plugin.multitask.i1.f150442v;
        java.lang.Class cls = (java.lang.Class) com.tencent.mm.plugin.multitask.i1.f150442v.get(java.lang.Integer.valueOf(i17));
        if (cls == null) {
            for (fs.q qVar : ((fs.c) fs.g.f(ga0.e.class)).all()) {
                if (qVar.hasKey(java.lang.Integer.valueOf(i17))) {
                    ga0.e eVar = (ga0.e) qVar.get();
                    cls = eVar != null ? eVar.get(i17) : null;
                }
            }
        }
        if (cls != null) {
            pk3.h d17 = d(id6, cls);
            if ((d17 != null ? d17.i0() : null) == pk3.a.f356436f && (multiTaskPanelContainer = this.f462805g) != null) {
                android.view.View inflate = this.f462802d.getLayoutInflater().inflate(d17.getLayoutId(), (android.view.ViewGroup) null);
                multiTaskPanelContainer.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                if (inflate != null) {
                    d17.setRootView(inflate);
                    android.view.View rootView = d17.getRootView();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(rootView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getSnapShotUIC", "(ILjava/lang/String;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    rootView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(rootView, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getSnapShotUIC", "(ILjava/lang/String;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                d17.O6(null);
                return d17;
            }
        }
        return null;
    }

    public final pk3.h c(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        int i17 = multiTaskInfo.field_type;
        this.f462807i = null;
        for (pk3.h hVar : this.f462808m) {
            if (hVar.M9(i17)) {
                java.util.HashMap hashMap = this.f462809n;
                if (hashMap.containsKey(multiTaskInfo.field_id) && kotlin.jvm.internal.o.b(hVar, hashMap.get(multiTaskInfo.field_id))) {
                    if (hVar.i0() == pk3.a.f356434d) {
                        android.view.View rootView = hVar.getRootView();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(rootView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getUIComponent", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        rootView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(rootView, "com/tencent/mm/plugin/multitask/ui/panel/BaseMultiTaskPanel", "getUIComponent", "(Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;)Lcom/tencent/mm/plugin/multitask/ui/MultiTaskUIComponent;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f462807i = hVar;
                    f();
                    return hVar;
                }
            }
        }
        java.util.HashMap hashMap2 = com.tencent.mm.plugin.multitask.i1.f150442v;
        java.lang.Class cls = (java.lang.Class) com.tencent.mm.plugin.multitask.i1.f150442v.get(java.lang.Integer.valueOf(i17));
        if (cls == null) {
            for (fs.q qVar : ((fs.c) fs.g.f(ga0.e.class)).all()) {
                if (qVar.hasKey(java.lang.Integer.valueOf(i17))) {
                    ga0.e eVar = (ga0.e) qVar.get();
                    cls = eVar != null ? eVar.get(i17) : null;
                }
            }
        }
        if (cls == null) {
            return null;
        }
        pk3.h d17 = d(multiTaskInfo.field_id, cls);
        androidx.appcompat.app.AppCompatActivity activity = this.f462802d;
        if (d17 != null) {
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).getClass();
        } else {
            d17 = null;
        }
        if ((d17 != null ? d17.i0() : null) == pk3.a.f356434d) {
            com.tencent.mm.plugin.multitask.ui.MultiTaskPanelContainer multiTaskPanelContainer = this.f462805g;
            if (multiTaskPanelContainer != null) {
                android.view.View inflate = activity.getLayoutInflater().inflate(d17.getLayoutId(), (android.view.ViewGroup) null);
                multiTaskPanelContainer.addView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                if (inflate != null) {
                    d17.setRootView(inflate);
                }
                android.os.Bundle bundle = this.f462803e;
                d17.onCreateBefore(bundle);
                d17.O6(multiTaskInfo);
                d17.onCreate(bundle);
                d17.onCreateAfter(bundle);
                d17.onStart();
                if ((activity instanceof com.tencent.mm.ui.MMFragmentActivity) && !((com.tencent.mm.ui.MMFragmentActivity) activity).isPaused()) {
                    d17.onResume();
                    d17.T6();
                }
            }
        } else {
            com.tencent.mm.plugin.multitask.ui.MultiTaskPanelContainer multiTaskPanelContainer2 = this.f462805g;
            if (multiTaskPanelContainer2 != null && d17 != null) {
                d17.setRootView(multiTaskPanelContainer2);
            }
        }
        this.f462807i = d17;
        return d17;
    }

    public final pk3.h d(java.lang.String str, java.lang.Class cls) {
        pk3.h hVar;
        if (pf5.o.class.isAssignableFrom(cls)) {
            try {
                hVar = (pk3.h) cls.getConstructor(androidx.appcompat.app.AppCompatActivity.class).newInstance(this.f462802d);
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e17);
            } catch (java.lang.InstantiationException e18) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e18);
            } catch (java.lang.NoSuchMethodException e19) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e19);
            } catch (java.lang.reflect.InvocationTargetException e27) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e27);
            }
        } else {
            hVar = null;
        }
        if (hVar != null) {
            this.f462808m.add(hVar);
            if (str != null) {
            }
        }
        return hVar;
    }

    public void e() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        pk3.h hVar = this.f462807i;
        objArr[0] = hVar != null ? hVar.toString() : null;
        com.tencent.mars.xlog.Log.i(this.f462804f, "onMultiTaskPagePause, uic: %s", objArr);
        pk3.h hVar2 = this.f462807i;
        if (hVar2 != null) {
            hVar2.S6();
        }
    }

    public void f() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        pk3.h hVar = this.f462807i;
        objArr[0] = hVar != null ? hVar.toString() : null;
        com.tencent.mars.xlog.Log.i(this.f462804f, "onMultiTaskPageResume, uic: %s", objArr);
        pk3.h hVar2 = this.f462807i;
        if (hVar2 != null) {
            hVar2.T6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if ((r1 != null ? r1.i0() : null) == pk3.a.f356436f) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.o.g(r4, r0)
            java.util.HashMap r0 = r3.f462809n
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.get(r4)
            pk3.h r1 = (pk3.h) r1
            java.util.HashSet r2 = r3.f462808m
            java.util.Collection r2 = kotlin.jvm.internal.m0.a(r2)
            r2.remove(r1)
            r0.remove(r4)
            r4 = 0
            if (r1 == 0) goto L27
            pk3.a r0 = r1.i0()
            goto L28
        L27:
            r0 = r4
        L28:
            pk3.a r2 = pk3.a.f356434d
            if (r0 == r2) goto L36
            if (r1 == 0) goto L32
            pk3.a r4 = r1.i0()
        L32:
            pk3.a r0 = pk3.a.f356436f
            if (r4 != r0) goto L56
        L36:
            android.view.View r4 = r1.getRootView()
            android.view.ViewParent r4 = r4.getParent()
            if (r4 == 0) goto L56
            android.view.View r4 = r1.getRootView()
            android.view.ViewParent r4 = r4.getParent()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.o.e(r4, r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r0 = r1.getRootView()
            r4.removeView(r0)
        L56:
            if (r1 == 0) goto L5b
            r1.R6()
        L5b:
            r4 = 1
            return r4
        L5d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yk3.b.g(java.lang.String):boolean");
    }

    @Override // pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
    }

    @Override // pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        pk3.h a17 = a(0, "MultiTaskForMinusScreen");
        if (a17 != null) {
            ((zk3.g0) a17).onConfigurationChanged(newConfig);
        }
    }

    @Override // pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f462804f, "onPause");
    }

    @Override // pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    @Override // pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f462804f, "onResume");
    }

    @Override // pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onStart() {
        com.tencent.mars.xlog.Log.i(this.f462804f, "onStart");
    }

    @Override // pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i(this.f462804f, "onStop");
    }
}
