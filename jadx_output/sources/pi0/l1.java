package pi0;

/* loaded from: classes11.dex */
public final class l1 {

    /* renamed from: a */
    public final pi0.q f354642a;

    /* renamed from: b */
    public final java.lang.String f354643b;

    /* renamed from: c */
    public final java.util.List f354644c;

    /* renamed from: d */
    public final boolean f354645d;

    /* renamed from: e */
    public final java.lang.String f354646e;

    /* renamed from: f */
    public java.lang.String f354647f;

    /* renamed from: g */
    public io.flutter.embedding.engine.FlutterEngine f354648g;

    /* renamed from: h */
    public boolean f354649h;

    /* renamed from: i */
    public boolean f354650i;

    /* renamed from: j */
    public long f354651j;

    /* renamed from: k */
    public java.lang.String f354652k;

    /* renamed from: l */
    public pi0.h0 f354653l;

    /* renamed from: m */
    public final java.util.HashSet f354654m;

    /* renamed from: n */
    public pi0.w0 f354655n;

    /* renamed from: o */
    public java.util.List f354656o;

    /* renamed from: p */
    public java.util.List f354657p;

    /* renamed from: q */
    public qi0.h f354658q;

    /* renamed from: r */
    public kotlinx.coroutines.c0 f354659r;

    /* renamed from: s */
    public final long f354660s;

    /* renamed from: t */
    public long f354661t;

    /* renamed from: u */
    public long f354662u;

    public l1(pi0.q engineGroup, java.lang.String plugin, java.util.List list, boolean z17, java.lang.String entryPoint) {
        kotlin.jvm.internal.o.g(engineGroup, "engineGroup");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        kotlin.jvm.internal.o.g(entryPoint, "entryPoint");
        this.f354642a = engineGroup;
        this.f354643b = plugin;
        this.f354644c = list;
        this.f354645d = z17;
        this.f354646e = entryPoint;
        this.f354647f = "";
        this.f354650i = true;
        this.f354652k = "";
        this.f354654m = new java.util.HashSet();
        this.f354660s = java.lang.System.nanoTime();
        io.flutter.Log.i(k(), "init with plugin:" + plugin);
        engineGroup.a(this);
    }

    public static java.lang.Object n(pi0.l1 l1Var, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, java.lang.Class cls, java.lang.Long l17, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        return l1Var.d(context, flutterPageStyle, (i17 & 4) != 0 ? null : cls, (i17 & 8) != 0 ? null : l17, (i17 & 16) != 0 ? null : bundle, continuation);
    }

    public static /* synthetic */ java.lang.Object t(pi0.l1 l1Var, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, java.lang.Class cls, java.lang.Long l17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        return l1Var.s(context, flutterPageStyle, (i17 & 4) != 0 ? null : cls, (i17 & 8) != 0 ? null : l17, continuation);
    }

    public static /* synthetic */ java.lang.Object v(pi0.l1 l1Var, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, java.lang.Class cls, java.lang.Long l17, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        return l1Var.u(context, flutterPageStyle, (i17 & 4) != 0 ? null : cls, (i17 & 8) != 0 ? null : l17, (i17 & 16) != 0 ? null : bundle, continuation);
    }

    public final void a(java.util.List plugins) {
        io.flutter.embedding.engine.plugins.PluginRegistry plugins2;
        kotlin.jvm.internal.o.g(plugins, "plugins");
        if (this.f354657p == null) {
            this.f354657p = new java.util.ArrayList();
        }
        java.util.List list = this.f354657p;
        if (list != null) {
            list.addAll(plugins);
        }
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f354648g;
        if (flutterEngine != null) {
            if (flutterEngine == null || (plugins2 = flutterEngine.getPlugins()) == null) {
                return;
            }
            plugins2.add(kz5.n0.X0(plugins));
            return;
        }
        java.util.List list2 = this.f354656o;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(plugins);
            arrayList.addAll(list2);
            plugins = arrayList;
        }
        this.f354656o = plugins;
    }

    public final void b(java.lang.Object host) {
        kotlin.jvm.internal.o.g(host, "host");
        io.flutter.Log.i(k(), "attach to host " + host);
        this.f354654m.add(host);
        if (host instanceof pi0.w0) {
            pi0.w0 w0Var = this.f354655n;
            if (w0Var != null) {
                w0Var.u3((pi0.w0) host);
            }
            this.f354655n = (pi0.w0) host;
            c61.v9 v9Var = (c61.v9) j(c61.v9.class);
            if (v9Var != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                io.flutter.Log.i("MicroMsg.FlutterAPMPlugin", "setBindFlutterInstanceMills:" + currentTimeMillis);
                v9Var.f39356h = currentTimeMillis;
            }
        }
    }

    public final boolean c(android.content.Context context, java.lang.Class cls, android.content.Intent intent, pi0.t tVar) {
        if (tVar == null) {
            return false;
        }
        android.app.Activity activity = tVar.f354726d;
        java.lang.Class<?> cls2 = activity != null ? activity.getClass() : null;
        if (cls2 == null || cls == null || !kotlin.jvm.internal.o.b(cls2, cls)) {
            return false;
        }
        android.content.pm.ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if ((resolveActivity != null ? resolveActivity.activityInfo : null) == null) {
            return false;
        }
        int i17 = resolveActivity.activityInfo.launchMode;
        if (i17 == 3) {
            io.flutter.Log.i(k(), "single instance, will start the same activity");
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        io.flutter.Log.i(k(), "single task, will start the same activity");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r15, com.tencent.mm.flutter.ui.FlutterPageStyle r16, java.lang.Class r17, java.lang.Long r18, android.os.Bundle r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.d(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, java.lang.Long, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r22, java.util.Map r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.e(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0322 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r24, java.util.Map r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.f(java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(4:12|13|(1:15)|16)(2:18|19))(5:20|21|22|23|(1:25)(4:26|13|(0)|16)))(1:28))(2:60|(2:62|(1:64)(1:65))(5:66|30|(3:32|(1:34)(1:57)|(10:38|(1:40)(1:56)|41|(3:43|(4:45|(1:47)|48|(1:50))|51)|52|53|(1:55)|22|23|(0)(0)))|58|59))|29|30|(0)|58|59))|68|6|7|(0)(0)|29|30|(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
    
        io.flutter.Log.i(r13, "detach timeout");
        r6 = true;
        r4 = r4;
        r7 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, io.flutter.embedding.engine.FlutterEngine] */
    /* JADX WARN: Type inference failed for: r4v19, types: [io.flutter.embedding.engine.FlutterEngine] */
    /* JADX WARN: Type inference failed for: r4v2, types: [io.flutter.embedding.engine.FlutterEngine] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v5, types: [pi0.t0] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object h(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.HashSet hashSet = this.f354654m;
        if (obj == null || hashSet.contains(obj)) {
            io.flutter.Log.i(k(), "detach from host " + obj);
        } else {
            io.flutter.Log.w(k(), "detach from an unknown host " + obj);
        }
        kotlin.jvm.internal.m0.a(hashSet).remove(obj);
        if (kotlin.jvm.internal.o.b(this.f354655n, obj)) {
            this.f354655n = null;
        }
        boolean isEmpty = hashSet.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isEmpty) {
            java.lang.Object g17 = g(continuation);
            return g17 == pz5.a.f359186d ? g17 : f0Var;
        }
        io.flutter.Log.i(k(), "attached hosts: [" + kz5.n0.g0(hashSet, null, null, null, 0, null, null, 63, null) + ']');
        return f0Var;
    }

    public final void i() {
        for (java.lang.Object obj : this.f354654m) {
            if (obj instanceof pi0.w0) {
                ((pi0.w0) obj).u3(pi0.x0.f354740d);
            }
        }
    }

    public final io.flutter.embedding.engine.plugins.FlutterPlugin j(java.lang.Class clazz) {
        io.flutter.embedding.engine.plugins.PluginRegistry plugins;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f354648g;
        io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin = (flutterEngine == null || (plugins = flutterEngine.getPlugins()) == null) ? null : plugins.get(clazz);
        if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.FlutterPlugin) {
            return flutterPlugin;
        }
        return null;
    }

    public final java.lang.String k() {
        return "MMFlutterInstance#" + this.f354647f;
    }

    public final void l(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        pi0.m1 a17 = pi0.a0.f354514a.a(this.f354643b, str, map, this.f354645d, this.f354646e);
        pi0.n0 n0Var = pi0.z.f354748a;
        if (n0Var == null || (str2 = n0Var.b()) == null) {
            str2 = "";
        }
        a17.f354669e = str2;
        java.util.HashMap params = a17.f354670f;
        kotlin.jvm.internal.o.f(params, "params");
        pi0.n0 n0Var2 = pi0.z.f354748a;
        if (n0Var2 != null) {
            n0Var2.a(str2, params);
        }
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f354648g;
        kotlin.jvm.internal.o.d(flutterEngine);
        io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin = flutterEngine.getPlugins().get(qi0.c.class);
        kotlin.jvm.internal.o.e(flutterPlugin, "null cannot be cast to non-null type com.tencent.mm.flutter.base.navigator.FlutterNavigatorPlugin");
        qi0.c cVar = (qi0.c) flutterPlugin;
        java.lang.String b17 = a17.b();
        kotlin.jvm.internal.o.f(b17, "toJsonString(...)");
        io.flutter.Log.i("MicroMsg.FlutterNavigatorPlugin", "onNewRoute: ".concat(b17));
        com.tencent.pigeon.mm_foundation.FlutterNavigatorCallback flutterNavigatorCallback = cVar.f363467e;
        if (flutterNavigatorCallback != null) {
            flutterNavigatorCallback.onNewRoute(b17, new qi0.a(cVar, b17));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.tencent.mm.flutter.ui.FlutterPageStyle r13, android.content.Context r14, boolean r15, long r16, kotlin.coroutines.Continuation r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r18
            boolean r2 = r1 instanceof pi0.f1
            if (r2 == 0) goto L16
            r2 = r1
            pi0.f1 r2 = (pi0.f1) r2
            int r3 = r2.f354569g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f354569g = r3
            goto L1b
        L16:
            pi0.f1 r2 = new pi0.f1
            r2.<init>(r12, r1)
        L1b:
            r9 = r2
            java.lang.Object r1 = r9.f354567e
            pz5.a r2 = pz5.a.f359186d
            int r3 = r9.f354569g
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L33
            if (r3 != r4) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            java.lang.Object r2 = r9.f354566d
            pi0.l1 r2 = (pi0.l1) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L8c
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r13
            boolean r1 = r1.f68125o
            if (r1 == 0) goto La3
            pi0.g0 r3 = new pi0.g0
            java.lang.String r1 = r0.f354647f
            r3.<init>(r1)
            pi0.b0 r1 = pi0.g0.f354572e
            java.lang.String r1 = r0.f354647f
            java.lang.String r6 = "engineId"
            kotlin.jvm.internal.o.g(r1, r6)
            java.util.HashMap r6 = pi0.g0.f354573f
            r6.put(r1, r3)
            pi0.h0 r1 = r3.f354578d
            r0.f354653l = r1
            if (r15 == 0) goto L78
            r6 = 0
            android.graphics.Point r1 = new android.graphics.Point
            r4 = 10
            r1.<init>(r4, r4)
            r8 = 0
            r10 = 2
            r11 = 0
            r9.f354566d = r0
            r9.f354569g = r5
            r4 = r14
            r5 = r6
            r7 = r1
            java.lang.Object r1 = pi0.g0.b(r3, r4, r5, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L8b
            return r2
        L78:
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            r9.f354566d = r0
            r9.f354569g = r4
            r4 = r14
            r5 = r16
            java.lang.Object r1 = pi0.g0.b(r3, r4, r5, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L8b
            return r2
        L8b:
            r2 = r0
        L8c:
            java.lang.String r1 = r2.k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "finished prepare for "
            r3.<init>(r4)
            java.lang.String r2 = r2.f354647f
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            io.flutter.Log.i(r1, r2)
        La3:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.m(com.tencent.mm.flutter.ui.FlutterPageStyle, android.content.Context, boolean, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object o(java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        boolean z17 = this.f354650i;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            return f0Var;
        }
        if (this.f354648g == null) {
            java.lang.Object e17 = e(str, map, continuation);
            return e17 == pz5.a.f359186d ? e17 : f0Var;
        }
        l(str, map);
        return f0Var;
    }

    public final void p() {
        qi0.c cVar = (qi0.c) j(qi0.c.class);
        if (cVar == null) {
            cVar = new qi0.c();
            a(kz5.b0.c(cVar));
        }
        pi0.q engineGroup = this.f354642a;
        kotlin.jvm.internal.o.g(engineGroup, "engineGroup");
        cVar.f363472m = engineGroup;
        cVar.f363471i = this.f354657p;
    }

    public final void q(qi0.h hVar) {
        if (this.f354648g == null) {
            this.f354658q = hVar;
            return;
        }
        qi0.c cVar = (qi0.c) j(qi0.c.class);
        if (cVar == null) {
            cVar = new qi0.c();
            a(kz5.b0.c(cVar));
        }
        cVar.f363469g = hVar;
    }

    public final boolean r(android.content.Context context, android.content.Intent intent, java.lang.Class cls) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (cls == null) {
            cls = pi0.r.f354717a.e();
        }
        pi0.t tVar = (pi0.t) j(pi0.t.class);
        if (tVar == null || !c(context, cls, intent, tVar)) {
            return true;
        }
        return !(tVar.f354726d instanceof androidx.appcompat.app.AppCompatActivity ? ((androidx.appcompat.app.AppCompatActivity) r3).mo133getLifecycle().b().a(androidx.lifecycle.n.RESUMED) : false);
    }

    public final java.lang.Object s(android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, java.lang.Class cls, java.lang.Long l17, kotlin.coroutines.Continuation continuation) {
        java.lang.Object v17 = v(this, context, flutterPageStyle, cls, l17, null, continuation, 16, null);
        return v17 == pz5.a.f359186d ? v17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(android.content.Context r10, com.tencent.mm.flutter.ui.FlutterPageStyle r11, java.lang.Class r12, java.lang.Long r13, android.os.Bundle r14, kotlin.coroutines.Continuation r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof pi0.g1
            if (r0 == 0) goto L13
            r0 = r15
            pi0.g1 r0 = (pi0.g1) r0
            int r1 = r0.f354583h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f354583h = r1
            goto L18
        L13:
            pi0.g1 r0 = new pi0.g1
            r0.<init>(r9, r15)
        L18:
            r7 = r0
            java.lang.Object r15 = r7.f354581f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f354583h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r7.f354580e
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r11 = r7.f354579d
            pi0.l1 r11 = (pi0.l1) r11
            kotlin.ResultKt.throwOnFailure(r15)
            goto L4f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            kotlin.ResultKt.throwOnFailure(r15)
            r7.f354579d = r9
            r7.f354580e = r10
            r7.f354583h = r2
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            java.lang.Object r15 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r15 != r0) goto L4e
            return r0
        L4e:
            r11 = r9
        L4f:
            android.content.Intent r15 = (android.content.Intent) r15
            java.lang.String r11 = r11.k()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "startActivity "
            r12.<init>(r13)
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            io.flutter.Log.i(r11, r12)
            if (r15 == 0) goto La4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r15)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r4 = "showAsActivity"
            java.lang.String r5 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r10
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            android.content.Intent r11 = (android.content.Intent) r11
            r10.startActivity(r11)
            java.lang.String r2 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r3 = "showAsActivity"
            java.lang.String r4 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r10
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        La4:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.u(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, java.lang.Long, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(android.content.Context r18, com.tencent.mm.flutter.ui.FlutterPageStyle r19, java.lang.Class r20, java.lang.Long r21, android.os.Bundle r22, int r23, kotlin.coroutines.Continuation r24) {
        /*
            r17 = this;
            r7 = r17
            r0 = r24
            boolean r1 = r0 instanceof pi0.h1
            if (r1 == 0) goto L17
            r1 = r0
            pi0.h1 r1 = (pi0.h1) r1
            int r2 = r1.f354595i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f354595i = r2
            goto L1c
        L17:
            pi0.h1 r1 = new pi0.h1
            r1.<init>(r7, r0)
        L1c:
            r6 = r1
            java.lang.Object r0 = r6.f354593g
            pz5.a r8 = pz5.a.f359186d
            int r1 = r6.f354595i
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            int r1 = r6.f354592f
            java.lang.Object r2 = r6.f354591e
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r6.f354590d
            pi0.l1 r3 = (pi0.l1) r3
            kotlin.ResultKt.throwOnFailure(r0)
            r10 = r1
            goto L63
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            kotlin.ResultKt.throwOnFailure(r0)
            r6.f354590d = r7
            r9 = r18
            r6.f354591e = r9
            r10 = r23
            r6.f354592f = r10
            r6.f354595i = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            java.lang.Object r0 = r0.d(r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L61
            return r8
        L61:
            r3 = r7
            r2 = r9
        L63:
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 == 0) goto L6a
            r0.addFlags(r10)
        L6a:
            java.lang.String r1 = r3.k()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "startActivity "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            io.flutter.Log.i(r1, r3)
            if (r0 == 0) goto Lca
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r10 = r1.toArray()
            java.lang.String r11 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r12 = "showAsActivityWithIntentFlag"
            java.lang.String r13 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r2
            yj0.a.d(r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r2.startActivity(r0)
            java.lang.String r0 = "com/tencent/mm/flutter/base/MMFlutterInstance"
            java.lang.String r1 = "showAsActivityWithIntentFlag"
            java.lang.String r3 = "(Landroid/content/Context;Lcom/tencent/mm/flutter/ui/FlutterPageStyle;Ljava/lang/Class;Ljava/lang/Long;Landroid/os/Bundle;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r18 = r2
            r19 = r0
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            yj0.a.f(r18, r19, r20, r21, r22, r23, r24)
        Lca:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.w(android.content.Context, com.tencent.mm.flutter.ui.FlutterPageStyle, java.lang.Class, java.lang.Long, android.os.Bundle, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(android.view.ViewGroup r21, androidx.lifecycle.o r22, com.tencent.mm.flutter.ui.FlutterPageStyle r23, androidx.appcompat.app.AppCompatActivity r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.l1.x(android.view.ViewGroup, androidx.lifecycle.o, com.tencent.mm.flutter.ui.FlutterPageStyle, androidx.appcompat.app.AppCompatActivity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ l1(pi0.q qVar, java.lang.String str, java.util.List list, boolean z17, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(qVar, str, (i17 & 4) != 0 ? null : list, (i17 & 8) != 0 ? true : z17, (i17 & 16) != 0 ? "home" : str2);
    }
}
