package i5;

/* loaded from: classes13.dex */
public class d implements f5.c, b5.b {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f288432p = a5.a0.e("SystemFgDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final b5.w f288433d;

    /* renamed from: e, reason: collision with root package name */
    public final m5.a f288434e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f288435f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f288436g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f288437h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f288438i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f288439m;

    /* renamed from: n, reason: collision with root package name */
    public final f5.d f288440n;

    /* renamed from: o, reason: collision with root package name */
    public i5.c f288441o;

    public d(android.content.Context context) {
        b5.w c17 = b5.w.c(context);
        this.f288433d = c17;
        m5.a aVar = c17.f17898d;
        this.f288434e = aVar;
        this.f288436g = null;
        this.f288437h = new java.util.LinkedHashMap();
        this.f288439m = new java.util.HashSet();
        this.f288438i = new java.util.HashMap();
        this.f288440n = new f5.d(context, aVar, this);
        c17.f17900f.a(this);
    }

    public static android.content.Intent b(android.content.Context context, java.lang.String str, a5.o oVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", oVar.f1417a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.f1418b);
        intent.putExtra("KEY_NOTIFICATION", oVar.f1419c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static android.content.Intent c(android.content.Context context, java.lang.String str, a5.o oVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", oVar.f1417a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.f1418b);
        intent.putExtra("KEY_NOTIFICATION", oVar.f1419c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // f5.c
    public void a(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a5.a0.c().a(f288432p, java.lang.String.format("Constraints unmet for WorkSpec %s", str), new java.lang.Throwable[0]);
            b5.w wVar = this.f288433d;
            ((m5.c) wVar.f17898d).a(new k5.n(wVar, str, true));
        }
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        java.util.Map.Entry entry;
        synchronized (this.f288435f) {
            j5.w wVar = (j5.w) ((java.util.HashMap) this.f288438i).remove(str);
            if (wVar != null ? ((java.util.HashSet) this.f288439m).remove(wVar) : false) {
                this.f288440n.b(this.f288439m);
            }
        }
        a5.o oVar = (a5.o) this.f288437h.remove(str);
        if (str.equals(this.f288436g) && this.f288437h.size() > 0) {
            java.util.Iterator it = ((java.util.LinkedHashMap) this.f288437h).entrySet().iterator();
            java.lang.Object next = it.next();
            while (true) {
                entry = (java.util.Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f288436g = (java.lang.String) entry.getKey();
            if (this.f288441o != null) {
                a5.o oVar2 = (a5.o) entry.getValue();
                i5.c cVar = this.f288441o;
                androidx.work.impl.foreground.SystemForegroundService systemForegroundService = (androidx.work.impl.foreground.SystemForegroundService) cVar;
                systemForegroundService.f12492e.post(new i5.e(systemForegroundService, oVar2.f1417a, oVar2.f1419c, oVar2.f1418b));
                androidx.work.impl.foreground.SystemForegroundService systemForegroundService2 = (androidx.work.impl.foreground.SystemForegroundService) this.f288441o;
                systemForegroundService2.f12492e.post(new i5.g(systemForegroundService2, oVar2.f1417a));
            }
        }
        i5.c cVar2 = this.f288441o;
        if (oVar == null || cVar2 == null) {
            return;
        }
        a5.a0.c().a(f288432p, java.lang.String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", java.lang.Integer.valueOf(oVar.f1417a), str, java.lang.Integer.valueOf(oVar.f1418b)), new java.lang.Throwable[0]);
        androidx.work.impl.foreground.SystemForegroundService systemForegroundService3 = (androidx.work.impl.foreground.SystemForegroundService) cVar2;
        systemForegroundService3.f12492e.post(new i5.g(systemForegroundService3, oVar.f1417a));
    }

    public final void e(android.content.Intent intent) {
        int i17 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        a5.a0.c().a(f288432p, java.lang.String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", java.lang.Integer.valueOf(intExtra), stringExtra, java.lang.Integer.valueOf(intExtra2)), new java.lang.Throwable[0]);
        if (notification == null || this.f288441o == null) {
            return;
        }
        a5.o oVar = new a5.o(intExtra, notification, intExtra2);
        java.util.Map map = this.f288437h;
        map.put(stringExtra, oVar);
        if (android.text.TextUtils.isEmpty(this.f288436g)) {
            this.f288436g = stringExtra;
            androidx.work.impl.foreground.SystemForegroundService systemForegroundService = (androidx.work.impl.foreground.SystemForegroundService) this.f288441o;
            systemForegroundService.f12492e.post(new i5.e(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        androidx.work.impl.foreground.SystemForegroundService systemForegroundService2 = (androidx.work.impl.foreground.SystemForegroundService) this.f288441o;
        systemForegroundService2.f12492e.post(new i5.f(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i17 |= ((a5.o) ((java.util.Map.Entry) it.next()).getValue()).f1418b;
        }
        a5.o oVar2 = (a5.o) linkedHashMap.get(this.f288436g);
        if (oVar2 != null) {
            androidx.work.impl.foreground.SystemForegroundService systemForegroundService3 = (androidx.work.impl.foreground.SystemForegroundService) this.f288441o;
            systemForegroundService3.f12492e.post(new i5.e(systemForegroundService3, oVar2.f1417a, oVar2.f1419c, i17));
        }
    }

    @Override // f5.c
    public void f(java.util.List list) {
    }
}
