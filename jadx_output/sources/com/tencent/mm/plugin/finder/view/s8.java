package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.s8 f133027a = new com.tencent.mm.plugin.finder.view.s8();

    public final java.lang.Integer a(int i17) {
        if (i17 == 32 || i17 == 33) {
            return 1;
        }
        return (i17 == 136 || i17 == 137) ? 2 : null;
    }

    public final void b(android.app.Activity activity, com.tencent.mm.plugin.finder.view.h8 config) {
        android.view.View view;
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(config, "config");
        long j17 = c01.z1.j();
        pr2.a aVar = pr2.a.f357949a;
        if ((34359738368L & j17) != 0) {
            aVar.b(j17, "Finder.FinderEntranceDialog");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderEntranceDialog", "openFinderEntryAndShowSnackBar: finder entry already opened, only show snackbar");
        }
        java.lang.String string = activity.getString(com.tencent.mm.R.string.f493797p41);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int dimension = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        int dimension2 = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        java.lang.String string2 = activity.getString(com.tencent.mm.R.string.f493798p42);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        int i17 = al5.u4.f6058t;
        al5.t4 t4Var = new al5.t4(activity);
        al5.u4 d17 = t4Var.d();
        t4Var.f6042e = hc2.x0.k(string, activity, '#', com.tencent.mm.R.raw.check_mark_regular, com.tencent.mm.R.color.f478553an, dimension, dimension, 0, dimension2, 2, 64, null);
        t4Var.a(string2);
        t4Var.f6039b = 1;
        t4Var.f6045h = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479660bx);
        t4Var.f6038a.f6014b = new com.tencent.mm.plugin.finder.view.j8(activity, d17);
        t4Var.i();
        t4Var.g();
        if (!(!config.f132226l.isEmpty()) || (view = d17.f6065m) == null || (findViewById = view.findViewById(com.tencent.mm.R.id.qp_)) == null) {
            return;
        }
        hc2.v0.e(findViewById, "open_entrance_tips_set", 0, 0, false, false, config.f132226l, null, 94, null);
    }

    public final gx2.q c(android.app.Activity activity, com.tencent.mm.plugin.finder.view.h8 config) {
        int i17;
        boolean z17;
        int i18;
        su2.h hVar;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(config, "config");
        android.view.Window window = activity.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup == null) {
            return null;
        }
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(activity);
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.f489089ee5, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            textView.setText(config.f132215a);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h9o);
        if (imageView != null) {
            boolean C = com.tencent.mm.ui.bk.C();
            int ordinal = config.f132216b.ordinal();
            if (ordinal == 0) {
                hVar = C ? su2.h.f412745h : su2.h.f412744g;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                hVar = C ? su2.h.f412747m : su2.h.f412746i;
            }
            kotlinx.coroutines.l.d(v65.m.a(imageView), null, null, new com.tencent.mm.plugin.finder.view.k8(hVar, imageView, null), 3, null);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.b09);
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            int ordinal2 = config.f132217c.ordinal();
            if (ordinal2 == 0) {
                i18 = com.tencent.mm.R.layout.f489088ee4;
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                i18 = com.tencent.mm.R.layout.f489087ee3;
            }
            viewGroup2.addView(b17.inflate(i18, viewGroup2, false));
        }
        float dimension = activity.getResources().getDimension(com.tencent.mm.R.dimen.f480495ap3);
        gx2.a aVar = new gx2.a();
        aVar.f277337c = dimension;
        aVar.f277339e = new hx2.c(inflate);
        aVar.f277338d = new hx2.g(activity, 0, 0, 0, false, false, 62, null);
        aVar.f277340f = new hx2.b(activity, true);
        gx2.q b18 = aVar.b(viewGroup);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_x);
        if (textView2 != null) {
            textView2.setText(config.f132218d);
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.view.l8(config, b18));
            if (config.f132223i.length() > 0) {
                hc2.v0.e(textView2, config.f132223i, 8, 0, false, false, null, new com.tencent.mm.plugin.finder.view.m8(config), 60, null);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b5w);
        if (textView3 != null) {
            textView3.setText(config.f132219e);
            textView3.setOnClickListener(new com.tencent.mm.plugin.finder.view.n8(config, b18));
            if (config.f132224j.length() > 0) {
                hc2.v0.e(textView3, config.f132224j, 8, 0, false, false, null, new com.tencent.mm.plugin.finder.view.o8(config), 60, null);
            }
        }
        if (config.f132225k.length() > 0) {
            z17 = false;
            i17 = 1;
            hc2.v0.e(inflate, config.f132225k, 32, 0, false, false, null, new com.tencent.mm.plugin.finder.view.p8(config), 60, null);
        } else {
            i17 = 1;
            z17 = false;
        }
        b18.setOnDrawerClose(new com.tencent.mm.plugin.finder.view.q8(config));
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(b18, z17, i17, null);
        return b18;
    }

    public final gx2.q d(android.app.Activity activity, java.lang.String authorFinderUsername) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.p3x);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.i8 i8Var = com.tencent.mm.plugin.finder.view.i8.f132293d;
        com.tencent.mm.plugin.finder.view.d8 d8Var = com.tencent.mm.plugin.finder.view.d8.f131881e;
        java.lang.String string2 = activity.getResources().getString(com.tencent.mm.R.string.f493796p40);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = activity.getResources().getString(com.tencent.mm.R.string.p3z);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return e(activity, "follow", new com.tencent.mm.plugin.finder.view.h8(string, i8Var, d8Var, string2, string3, new com.tencent.mm.plugin.finder.view.r8(activity), null, null, "profile_set_entrance_open", "profile_set_entrance_unopen", "profile_set_entrance_halfscreen", kz5.c1.k(new jz5.l("author_finder_username", authorFinderUsername), new jz5.l("action_type", 1)), 192, null));
    }

    public final gx2.q e(android.app.Activity activity, java.lang.String scene, com.tencent.mm.plugin.finder.view.h8 config) {
        android.app.Activity activity2 = activity;
        kotlin.jvm.internal.o.g(activity2, "activity");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(config, "config");
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Oe).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: switch off, skip. scene=".concat(scene));
            return null;
        }
        int i17 = 0;
        if (!((c01.z1.j() & 34359738368L) != 0)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: finder entry already opened, skip. scene=".concat(scene));
            return null;
        }
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        dq.b bVar = ((cq.k) c18).f221226g;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) bVar.f242287d).getValue();
        boolean i18 = o4Var != null ? o4Var.i("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", false) : false;
        boolean z17 = !i18;
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "canShowOpenFinderEntranceDialog: shown=" + i18 + ", ok=" + z17);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: rate limited, skip. scene=".concat(scene));
            return null;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        java.lang.Integer a17 = a(nyVar != null ? nyVar.V6().getInteger(5) : 0);
        if (a17 != null) {
            i17 = a17.intValue();
        } else {
            android.content.Intent intent = activity.getIntent();
            java.lang.Integer a18 = a(intent != null ? intent.getIntExtra("KEY_OPEN_FINDER_ENTRANCE_REF_COMMENT_SCENE", 0) : 0);
            if (a18 != null) {
                i17 = a18.intValue();
            }
        }
        java.util.Map n17 = kz5.c1.n(config.f132226l, new jz5.l("profile_screen_type", java.lang.Integer.valueOf(i17)));
        java.lang.CharSequence title = config.f132215a;
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mm.plugin.finder.view.i8 imageStyle = config.f132216b;
        kotlin.jvm.internal.o.g(imageStyle, "imageStyle");
        com.tencent.mm.plugin.finder.view.d8 buttonStyle = config.f132217c;
        kotlin.jvm.internal.o.g(buttonStyle, "buttonStyle");
        java.lang.CharSequence confirmText = config.f132218d;
        kotlin.jvm.internal.o.g(confirmText, "confirmText");
        java.lang.CharSequence cancelText = config.f132219e;
        kotlin.jvm.internal.o.g(cancelText, "cancelText");
        yz5.l onConfirm = config.f132220f;
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        yz5.a onCancel = config.f132221g;
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        yz5.a onDismiss = config.f132222h;
        kotlin.jvm.internal.o.g(onDismiss, "onDismiss");
        java.lang.String reportConfirmKey = config.f132223i;
        kotlin.jvm.internal.o.g(reportConfirmKey, "reportConfirmKey");
        java.lang.String reportCancelKey = config.f132224j;
        kotlin.jvm.internal.o.g(reportCancelKey, "reportCancelKey");
        java.lang.String reportPopupKey = config.f132225k;
        kotlin.jvm.internal.o.g(reportPopupKey, "reportPopupKey");
        com.tencent.mm.plugin.finder.view.h8 h8Var = new com.tencent.mm.plugin.finder.view.h8(title, imageStyle, buttonStyle, confirmText, cancelText, onConfirm, onCancel, onDismiss, reportConfirmKey, reportCancelKey, reportPopupKey, n17);
        if (lk5.s.b(activity)) {
            com.tencent.mm.ui.vas.VASActivity vASActivity = activity2 instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity2 : null;
            activity2 = vASActivity != null ? vASActivity.getParentActivity() : null;
        }
        if (activity2 == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit, hostActivity not found");
            return null;
        }
        gx2.q c19 = c(activity2, h8Var);
        if (c19 == null) {
            return null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) bVar.f242287d).getValue();
        if (o4Var2 != null && o4Var2.T("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", java.lang.Boolean.TRUE)) {
            if (o4Var2.U()) {
                java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var2.f192901g;
                readLock.lock();
                o4Var2.c(o4Var2.f192899e);
                o4Var2.f192898d.encode("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", true, 604800);
                readLock.unlock();
            } else {
                o4Var2.f192898d.encode("KEY_FINDER_OPEN_ENTRANCE_DIALOG_SHOWN", true, 604800);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "markOpenFinderEntranceDialogShown (auto-expire in 604800s)");
        com.tencent.mars.xlog.Log.i("Finder.FinderEntranceDialog", "showWithRateLimit: shown. scene=".concat(scene));
        return c19;
    }
}
