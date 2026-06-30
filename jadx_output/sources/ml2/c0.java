package ml2;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.x0 f327307a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f327308b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f327309c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f327310d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327315i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.reflect.Method f327319m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.reflect.Method f327320n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.reflect.Method f327321o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f327322p;

    /* renamed from: q, reason: collision with root package name */
    public final ml2.a0 f327323q;

    /* renamed from: r, reason: collision with root package name */
    public final ml2.b0 f327324r;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f327311e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f327312f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f327313g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f327314h = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public ml2.x1 f327316j = ml2.x1.f328202f;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f327317k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String[] f327318l = {com.tencent.maas.MJMaasVersion.BUILD_NUMBER, "temp_6"};

    public c0(ml2.x0 x0Var) {
        this.f327307a = x0Var;
        try {
            com.tencent.mm.ui.chatting.monitor.ChatFeedMonitor chatFeedMonitor = com.tencent.mm.ui.chatting.monitor.ChatFeedMonitor.INSTANCE;
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.reflect.Method declaredMethod = com.tencent.mm.ui.chatting.monitor.ChatFeedMonitor.class.getDeclaredMethod("monitor", android.view.View.class, java.lang.Object.class, cls, cls);
            kotlin.jvm.internal.o.f(declaredMethod, "getDeclaredMethod(...)");
            this.f327319m = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = com.tencent.mm.ui.chatting.monitor.ChatFeedMonitor.class.getDeclaredMethod("registerListener", e62.e.class);
            kotlin.jvm.internal.o.f(declaredMethod2, "getDeclaredMethod(...)");
            this.f327320n = declaredMethod2;
            declaredMethod2.setAccessible(true);
            java.lang.reflect.Method declaredMethod3 = com.tencent.mm.ui.chatting.monitor.ChatFeedMonitor.class.getDeclaredMethod("unregisterListener", e62.e.class);
            kotlin.jvm.internal.o.f(declaredMethod3, "getDeclaredMethod(...)");
            this.f327321o = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellFeedSingleExposure", "init crash: " + e17.getMessage());
        }
        this.f327323q = new ml2.a0(this);
        this.f327324r = new ml2.b0(this);
    }

    public final void a() {
        java.util.HashMap hashMap = this.f327312f;
        if (!hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                ml2.x0 x0Var = this.f327307a;
            }
        }
    }

    public final void b() {
        java.util.HashMap hashMap = this.f327312f;
        if (!hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                ml2.f0 f0Var = (ml2.f0) value;
                ml2.x0 x0Var = this.f327307a;
                if (x0Var != null) {
                    ((ml2.b) x0Var).a(f0Var, true);
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void c(com.tencent.mm.view.recyclerview.WxRecyclerAdapter r86, androidx.recyclerview.widget.LinearLayoutManager r87, ml2.x1 r88, java.lang.String r89) {
        /*
            Method dump skipped, instructions count: 1883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.c0.c(com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.LinearLayoutManager, ml2.x1, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(zy2.m5 m5Var, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, ml2.x1 x1Var, java.lang.String str) {
        int i17;
        java.lang.String username;
        java.lang.String str2;
        java.lang.String nickname;
        int w17 = linearLayoutManager.w();
        int y17 = linearLayoutManager.y();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = ((com.tencent.mm.plugin.finder.search.q) m5Var).f125819e.f125534z;
        int i18 = 1;
        boolean z17 = !arrayList2.isEmpty();
        ml2.x0 x0Var = this.f327307a;
        java.util.HashMap hashMap = this.f327314h;
        if (z17 && w17 <= y17) {
            while (true) {
                if (linearLayoutManager.findViewByPosition(w17) != null && arrayList2.size() > w17) {
                    java.lang.Object obj = arrayList2.get(w17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    r45.mu2 mu2Var = (r45.mu2) obj;
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                    java.lang.String str3 = "";
                    if (finderContact == null || (username = finderContact.getUsername()) == null) {
                        i17 = i18;
                    } else {
                        if (hashMap.containsKey(username)) {
                            i17 = i18;
                            str2 = username;
                        } else {
                            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                            int i19 = (finderContact2 == null || finderContact2.getLiveStatus() != i18) ? 0 : i18;
                            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) mu2Var.getCustom(0);
                            str2 = username;
                            ml2.h0 h0Var = new ml2.h0(mu2Var, w17, username, x1Var, str, i19, (finderContact3 == null || (nickname = finderContact3.getNickname()) == null) ? "" : nickname);
                            hashMap.put(str2, h0Var);
                            if (x0Var != null) {
                                i17 = 1;
                                ((ml2.b) x0Var).b(h0Var, true);
                            } else {
                                i17 = 1;
                            }
                        }
                        str3 = str2;
                    }
                    arrayList.add(str3);
                } else {
                    i17 = i18;
                }
                if (w17 == y17) {
                    break;
                }
                w17++;
                i18 = i17;
            }
        }
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (!arrayList.contains(entry.getKey())) {
                it.remove();
                if (x0Var != null) {
                    java.lang.Object value = entry.getValue();
                    kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                }
            }
        }
        arrayList.clear();
    }
}
