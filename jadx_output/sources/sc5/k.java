package sc5;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final sc5.k f406589a = new sc5.k();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.coroutines.LifecycleScope f406590b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedHashMap f406591c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.protobuf.g f406592d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f406593e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f406594f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f406595g;

    static {
        gm0.b bVar = gm0.j1.b().f273245h;
        f406590b = bVar != null ? bVar.f273145e : null;
        f406591c = new java.util.LinkedHashMap();
        f406593e = new java.util.ArrayList();
        f406594f = new java.util.ArrayList();
        f406595g = new java.util.ArrayList();
    }

    public static final void a(sc5.k kVar, java.util.List list) {
        kVar.getClass();
        java.util.LinkedHashMap linkedHashMap = f406591c;
        linkedHashMap.clear();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.w43 w43Var = (r45.w43) it.next();
            java.lang.String cliMsgId = w43Var.f388872d;
            kotlin.jvm.internal.o.f(cliMsgId, "cliMsgId");
            linkedHashMap.put(java.lang.Long.valueOf(java.lang.Long.parseLong(cliMsgId)), w43Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSendToWeWorkHelper", "MessageCache initialized. Cached " + list.size() + " messages");
    }

    public final void b(r45.w43 w43Var) {
        if (w43Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiSendToWeWorkHelper", "Rejected null message in addPendingMessage");
            return;
        }
        if (!c(w43Var)) {
            ((java.util.ArrayList) f406593e).add(w43Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiSendToWeWorkHelper", "Message[" + w43Var.f388872d + "] already in pending list");
    }

    public final boolean c(r45.w43 w43Var) {
        if (w43Var == null) {
            return false;
        }
        java.util.List list = f406593e;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((r45.w43) it.next()).f388872d, w43Var.f388872d)) {
                return true;
            }
        }
        return false;
    }

    public final r45.w43 d(com.tencent.mm.storage.f9 f9Var) {
        r45.w43 w43Var = new r45.w43();
        w43Var.f388872d = java.lang.String.valueOf(f9Var.I0());
        w43Var.f388873e = 49;
        java.lang.String j17 = f9Var.j();
        if (j17 != null) {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            byte[] bytes = j17.getBytes(forName);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            w43Var.f388874f = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        }
        return w43Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x012a, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(r45.gp0 r9) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc5.k.e(r45.gp0):void");
    }
}
