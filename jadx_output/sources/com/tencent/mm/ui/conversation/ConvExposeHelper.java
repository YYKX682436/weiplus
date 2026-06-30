package com.tencent.mm.ui.conversation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/conversation/ConvExposeHelper;", "Lgg5/c;", "Landroidx/lifecycle/v;", "<init>", "()V", "com/tencent/mm/ui/conversation/u1", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ConvExposeHelper extends gg5.c implements androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.ConvExposeHelper f207293d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f207294e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.ref.WeakReference f207295f;

    /* renamed from: g, reason: collision with root package name */
    public static int f207296g;

    /* renamed from: h, reason: collision with root package name */
    public static int f207297h;

    /* renamed from: i, reason: collision with root package name */
    public static int f207298i;

    /* renamed from: m, reason: collision with root package name */
    public static int f207299m;

    /* renamed from: n, reason: collision with root package name */
    public static int f207300n;

    /* renamed from: o, reason: collision with root package name */
    public static int f207301o;

    /* renamed from: p, reason: collision with root package name */
    public static int f207302p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f207303q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f207304r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f207305s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f207306t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f207307u;

    static {
        com.tencent.mm.ui.conversation.ConvExposeHelper convExposeHelper = new com.tencent.mm.ui.conversation.ConvExposeHelper();
        f207293d = convExposeHelper;
        f207294e = new java.lang.ref.WeakReference(null);
        f207295f = new java.lang.ref.WeakReference(null);
        f207296g = -1;
        f207297h = -1;
        f207298i = -1;
        f207299m = -1;
        f207300n = -1;
        f207301o = -1;
        f207302p = -1;
        f207303q = new java.util.concurrent.atomic.AtomicBoolean(true);
        f207304r = new java.util.concurrent.atomic.AtomicBoolean(true);
        f207306t = true;
        f207307u = true;
        com.tencent.mm.ui.conversation.a2 a2Var = new com.tencent.mm.ui.conversation.a2();
        e42.k0 k0Var = (e42.k0) gm0.j1.s(e42.k0.class);
        if (k0Var != null) {
            ((a52.f) k0Var).b(convExposeHelper);
        }
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(a2Var);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(0, com.tencent.mm.ui.conversation.u1.f208091a);
    }

    private ConvExposeHelper() {
    }

    @Override // e42.j0
    public void A(android.app.Activity activity) {
        if (activity == null || kotlin.jvm.internal.o.b("LauncherUI", activity.getClass().getSimpleName())) {
            return;
        }
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        com.tencent.mm.storage.a1.f193726k = com.tencent.mm.storage.a1.f193725j;
        com.tencent.mm.storage.a1.f193725j = activity.getClass().getSimpleName();
        a1Var.n(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "onHellActivityResume lastDisappearedUIName=" + com.tencent.mm.storage.a1.f193726k + " lastStartUIName=" + com.tencent.mm.storage.a1.f193725j);
    }

    public final void c(android.widget.ListView listView, yf5.j0 j0Var) {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.o mo133getLifecycle2;
        android.content.Context context = listView != null ? listView.getContext() : null;
        android.widget.ListView listView2 = (android.widget.ListView) f207294e.get();
        android.content.Context context2 = listView2 != null ? listView2.getContext() : null;
        if (!kotlin.jvm.internal.o.b(context, context2)) {
            if (f207305s) {
                com.tencent.mm.ui.LauncherUI launcherUI = context2 instanceof com.tencent.mm.ui.LauncherUI ? (com.tencent.mm.ui.LauncherUI) context2 : null;
                if (launcherUI != null && (mo133getLifecycle2 = launcherUI.mo133getLifecycle()) != null) {
                    mo133getLifecycle2.c(this);
                }
                f207305s = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "unregister previous lifecycle observer");
            }
            com.tencent.mm.ui.LauncherUI launcherUI2 = context instanceof com.tencent.mm.ui.LauncherUI ? (com.tencent.mm.ui.LauncherUI) context : null;
            if (launcherUI2 != null && (mo133getLifecycle = launcherUI2.mo133getLifecycle()) != null) {
                mo133getLifecycle.a(this);
                f207305s = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "register new lifecycle observer");
            }
        }
        if (listView != null) {
            f207294e = new java.lang.ref.WeakReference(listView);
        }
        if (j0Var != null) {
            f207295f = new java.lang.ref.WeakReference(j0Var);
        }
        f207298i = listView != null ? listView.getFirstVisiblePosition() : -1;
        f207299m = listView != null ? listView.getLastVisiblePosition() : -1;
        f207300n = listView != null ? listView.getHeaderViewsCount() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:16:0x0026, B:18:0x002c, B:23:0x0038, B:25:0x0046, B:27:0x004b, B:29:0x0050, B:33:0x006d, B:35:0x005a, B:38:0x0064, B:41:0x0070, B:43:0x0076, B:49:0x0081), top: B:15:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.widget.ListView r5, yf5.j0 r6, boolean r7, java.lang.String r8) {
        /*
            r4 = this;
            if (r6 == 0) goto L9e
            if (r5 != 0) goto L6
            goto L9e
        L6:
            if (r7 != 0) goto L9
            return
        L9:
            kotlin.jvm.internal.h0 r7 = new kotlin.jvm.internal.h0
            r7.<init>()
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L1b
            int r2 = r8.length()
            if (r2 != 0) goto L19
            goto L1b
        L19:
            r2 = r1
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r2 != 0) goto L26
            boolean r2 = com.tencent.mm.storage.z3.o4(r8)
            if (r2 == 0) goto L26
            r7.f310123d = r8
        L26:
            java.lang.Object r8 = r7.f310123d     // Catch: java.lang.Exception -> L8e
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Exception -> L8e
            if (r8 == 0) goto L35
            int r8 = r8.length()     // Catch: java.lang.Exception -> L8e
            if (r8 != 0) goto L33
            goto L35
        L33:
            r8 = r1
            goto L36
        L35:
            r8 = r0
        L36:
            if (r8 == 0) goto L70
            int r8 = r5.getFirstVisiblePosition()     // Catch: java.lang.Exception -> L8e
            int r2 = r5.getLastVisiblePosition()     // Catch: java.lang.Exception -> L8e
            int r5 = r5.getHeaderViewsCount()     // Catch: java.lang.Exception -> L8e
            if (r8 <= r5) goto L48
            int r8 = r8 - r5
            goto L49
        L48:
            r8 = r1
        L49:
            if (r2 < r5) goto L4d
            int r2 = r2 - r5
            goto L4e
        L4d:
            r2 = r1
        L4e:
            if (r8 > r2) goto L70
        L50:
            r5 = r6
            yf5.w0 r5 = (yf5.w0) r5     // Catch: java.lang.Exception -> L8e
            com.tencent.mm.storage.l4 r5 = r5.getItem(r8)     // Catch: java.lang.Exception -> L8e
            if (r5 != 0) goto L5a
            goto L6b
        L5a:
            java.lang.String r3 = r5.h1()     // Catch: java.lang.Exception -> L8e
            boolean r3 = com.tencent.mm.storage.z3.o4(r3)     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto L6b
            java.lang.String r5 = r5.h1()     // Catch: java.lang.Exception -> L8e
            r7.f310123d = r5     // Catch: java.lang.Exception -> L8e
            goto L70
        L6b:
            if (r8 == r2) goto L70
            int r8 = r8 + 1
            goto L50
        L70:
            java.lang.Object r5 = r7.f310123d     // Catch: java.lang.Exception -> L8e
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L7e
            int r5 = r5.length()     // Catch: java.lang.Exception -> L8e
            if (r5 != 0) goto L7d
            goto L7e
        L7d:
            r0 = r1
        L7e:
            if (r0 == 0) goto L81
            return
        L81:
            ku5.u0 r5 = ku5.t0.f312615d     // Catch: java.lang.Exception -> L8e
            com.tencent.mm.ui.conversation.z1 r6 = new com.tencent.mm.ui.conversation.z1     // Catch: java.lang.Exception -> L8e
            r6.<init>(r7)     // Catch: java.lang.Exception -> L8e
            ku5.t0 r5 = (ku5.t0) r5     // Catch: java.lang.Exception -> L8e
            r5.g(r6)     // Catch: java.lang.Exception -> L8e
            goto L9e
        L8e:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            java.lang.String r6 = "MicroMsg.ConvExposeHelper"
            java.lang.String r7 = "checkKefuServiceAccountShow ex %s"
            com.tencent.mars.xlog.Log.e(r6, r7, r5)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.ConvExposeHelper.i(android.widget.ListView, yf5.j0, boolean, java.lang.String):void");
    }

    public final java.util.List j() {
        int i17;
        int i18;
        kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        yf5.j0 j0Var = (yf5.j0) f207295f.get();
        int i19 = f207298i;
        if (i19 == -1 || (i17 = f207299m) == -1 || (i18 = f207300n) == -1 || j0Var == null) {
            return kz5.p0.f313996d;
        }
        int i27 = i19 > i18 ? (i19 - i18) + 1 : 0;
        int i28 = i17 >= i18 ? (i17 - i18) - 1 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i27 <= i28) {
            while (true) {
                com.tencent.mm.storage.l4 item = ((yf5.w0) j0Var).getItem(i27);
                if (item != null) {
                    arrayList.add(new rv.e(item, i27));
                }
                if (i27 == i28) {
                    break;
                }
                i27++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f2, code lost:
    
        if (zv.m0.f476036h == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0207 A[Catch: Exception -> 0x0205, TRY_LEAVE, TryCatch #1 {Exception -> 0x0205, blocks: (B:113:0x01ba, B:117:0x01d6, B:123:0x01e3, B:125:0x01f4, B:126:0x0207, B:127:0x01c4, B:131:0x01ce), top: B:112:0x01ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.widget.ListView r18, yf5.j0 r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.ConvExposeHelper.m(android.widget.ListView, yf5.j0, boolean, boolean, boolean):void");
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_START) {
            f207306t = true;
        } else if (event == androidx.lifecycle.m.ON_PAUSE) {
            f207306t = false;
        }
    }

    @Override // e42.j0
    public void q(android.app.Activity activity, java.lang.Object obj) {
        if (activity == null || obj == null) {
            return;
        }
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        com.tencent.mm.storage.a1.f193726k = com.tencent.mm.storage.a1.f193725j;
        com.tencent.mm.storage.a1.f193725j = obj.getClass().getSimpleName();
        a1Var.n(obj instanceof com.tencent.mm.ui.chatting.ChattingUIFragment ? ((com.tencent.mm.ui.chatting.ChattingUIFragment) obj).f198152f.u().d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "onHellFragmentResume lastDisappearedUIName=" + com.tencent.mm.storage.a1.f193726k + " lastStartUIName=" + com.tencent.mm.storage.a1.f193725j);
    }

    @Override // e42.j0
    public void t(android.app.Activity activity) {
    }

    @Override // e42.j0
    public void z(android.app.Activity activity, boolean z17) {
    }
}
