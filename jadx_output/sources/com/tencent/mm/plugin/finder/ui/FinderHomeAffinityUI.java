package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderHomeUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class FinderHomeAffinityUI extends com.tencent.mm.plugin.finder.ui.FinderHomeUI {
    public static final /* synthetic */ int D = 0;
    public final jz5.g B = jz5.h.b(com.tencent.mm.plugin.finder.ui.q6.f129722d);
    public final jz5.g C = jz5.h.b(com.tencent.mm.plugin.finder.ui.p6.f129621d);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public void a7(int i17) {
        if (i17 == 1) {
            db5.f.c(this, null);
            getSwipeBackLayout().d(true);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderHomeUI
    public void l7() {
        if (t7() && ((java.lang.Boolean) ((jz5.n) this.C).getValue()).booleanValue() && !u7()) {
            v7(1);
        } else {
            super.l7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderHomeUI
    public void m7() {
        if (t7() && ((java.lang.Boolean) ((jz5.n) this.C).getValue()).booleanValue() && !u7()) {
            v7(2);
        } else {
            super.m7();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderHomeUI, com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("Finder.HomeUI", "onCreate: acc has not ready");
            finishAndRemoveTask();
            return;
        }
        super.onCreate(bundle);
        setTaskDescription(new android.app.ActivityManager.TaskDescription(getContext().getString(com.tencent.mm.R.string.cfj), m95.a.a(getContext().getResources(), com.tencent.mm.R.raw.icons_filled_finder, 3.0f), 0));
        U6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderHomeAffinityUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderHomeAffinityUI");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, be1.r0.CTRL_INDEX, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.ui.r6(this));
        int i17 = ra0.y.f393481g1;
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni != null) {
            Ni.B3(new sa0.m(1010));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        if (t7()) {
            setTheme(com.tencent.mm.R.style.f494209h3);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderHomeUI
    public void r7(boolean z17) {
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        java.lang.String className;
        if (t7() && ((java.lang.Boolean) ((jz5.n) this.C).getValue()).booleanValue() && !u7()) {
            if (z17) {
                boolean z18 = false;
                try {
                    java.lang.Object systemService = getContext().getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    java.lang.Object obj = null;
                    android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
                    if (activityManager != null && (runningTasks = activityManager.getRunningTasks(10)) != null) {
                        java.util.Iterator<T> it = runningTasks.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            android.content.ComponentName componentName = ((android.app.ActivityManager.RunningTaskInfo) next).baseActivity;
                            if ((componentName == null || (className = componentName.getClassName()) == null || !className.equals("com.tencent.mm.ui.LauncherUI")) ? false : true) {
                                obj = next;
                                break;
                            }
                        }
                        android.app.ActivityManager.RunningTaskInfo runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) obj;
                        if (runningTaskInfo != null) {
                            z18 = kotlin.jvm.internal.o.b(runningTaskInfo.topActivity, runningTaskInfo.baseActivity);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("Finder.HomeUI", "mainTaskTopIsLauncherUI: ams is dead", th6);
                }
                if (!z18) {
                    v7(-1);
                    return;
                }
            }
            moveTaskToBack(true);
        }
    }

    public final void s7(android.view.ViewGroup viewGroup) {
        int i17;
        android.view.ViewGroup viewGroup2;
        int i18;
        int childCount = viewGroup.getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i19);
            if (childAt != null) {
                if (childAt instanceof cw2.da) {
                    ((cw2.da) childAt).p();
                    viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                    if (viewGroup2 != null) {
                        int childCount2 = viewGroup2.getChildCount();
                        int i27 = 0;
                        while (i27 < childCount2) {
                            android.view.View childAt2 = viewGroup2.getChildAt(i27);
                            if ((childAt2 instanceof android.view.TextureView) || (childAt2 instanceof android.view.SurfaceView)) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(4);
                                java.util.Collections.reverse(arrayList);
                                i18 = childCount;
                                yj0.a.d(childAt2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI", "captureAllRenderView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                childAt2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(childAt2, "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI", "captureAllRenderView", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                i18 = childCount;
                            }
                            i27++;
                            childCount = i18;
                        }
                    }
                } else {
                    i17 = childCount;
                    viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                    if (viewGroup2 != null) {
                        s7(viewGroup2);
                    }
                    i19++;
                    childCount = i17;
                }
            }
            i17 = childCount;
            i19++;
            childCount = i17;
        }
    }

    public final boolean t7() {
        return ((java.lang.Boolean) ((jz5.n) this.B).getValue()).booleanValue();
    }

    public final boolean u7() {
        return (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(this) || (com.tencent.mm.ui.bk.O(getContentResolver()) && !isInMultiWindowMode()));
    }

    public final void v7(int i17) {
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "checkPauseFocusVideo: enterFeedId = ".concat(pm0.v.u(ggVar.f134511m)));
        if (ggVar.f134511m == 0) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) uVar.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).c7(ggVar.getActivity());
        }
        android.view.View contentView = getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        s7((android.view.ViewGroup) contentView);
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.s6(this, i17));
    }
}
