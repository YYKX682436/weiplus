package xa;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f452745h = java.util.Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f452746i = java.util.Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f452747j = java.util.Arrays.asList("com.google.android.gms.measurement.AppMeasurement");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f452748k = java.util.Arrays.asList(new java.lang.String[0]);

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.Set f452749l = java.util.Collections.emptySet();

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.Object f452750m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f452751n = new x.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f452752a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f452753b;

    /* renamed from: c, reason: collision with root package name */
    public final xa.c f452754c;

    /* renamed from: d, reason: collision with root package name */
    public final bb.d f452755d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f452756e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f452757f = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f452758g;

    public b(android.content.Context context, java.lang.String str, xa.c cVar) {
        java.util.List<java.lang.String> list;
        android.content.pm.ServiceInfo serviceInfo;
        new java.util.concurrent.CopyOnWriteArrayList();
        this.f452758g = new java.util.concurrent.CopyOnWriteArrayList();
        new java.util.concurrent.CopyOnWriteArrayList();
        android.content.Context context2 = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.f452752a = context2;
        this.f452753b = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.f452754c = (xa.c) com.google.android.gms.common.internal.Preconditions.checkNotNull(cVar);
        android.os.Bundle bundle = null;
        try {
            android.content.pm.PackageManager packageManager = context2.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context2, (java.lang.Class<?>) com.google.firebase.components.ComponentDiscoveryService.class), 128)) != null) {
                bundle = serviceInfo.metaData;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            list = java.util.Collections.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
            list = arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str3 : list) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str3);
                if (com.google.firebase.components.ComponentRegistrar.class.isAssignableFrom(cls)) {
                    arrayList2.add((com.google.firebase.components.ComponentRegistrar) cls.newInstance());
                } else {
                    java.lang.String.format("Class %s is not an instance of %s", str3, "com.google.firebase.components.ComponentRegistrar");
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                java.lang.String.format("Class %s is not an found.", str3);
            } catch (java.lang.IllegalAccessException unused3) {
                java.lang.String.format("Could not instantiate %s.", str3);
            } catch (java.lang.InstantiationException unused4) {
                java.lang.String.format("Could not instantiate %s.", str3);
            }
        }
        this.f452755d = new bb.d(arrayList2, com.google.firebase.components.Component.of(android.content.Context.class, this.f452752a), com.google.firebase.components.Component.of(xa.b.class, this), com.google.firebase.components.Component.of(xa.c.class, this.f452754c));
    }

    public static xa.b a() {
        xa.b bVar;
        synchronized (f452750m) {
            bVar = (xa.b) ((x.n) f452751n).getOrDefault("[DEFAULT]", null);
            if (bVar == null) {
                java.lang.String myProcessName = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(myProcessName).length() + 116);
                sb6.append("Default FirebaseApp is not initialized in this process ");
                sb6.append(myProcessName);
                sb6.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new java.lang.IllegalStateException(sb6.toString());
            }
        }
        return bVar;
    }

    public static xa.b b(android.content.Context context) {
        synchronized (f452750m) {
            if (((x.n) f452751n).containsKey("[DEFAULT]")) {
                return a();
            }
            xa.c a17 = xa.c.a(context);
            if (a17 == null) {
                return null;
            }
            return c(context, a17);
        }
    }

    public static xa.b c(android.content.Context context, xa.c cVar) {
        xa.b bVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = db.a.f227819a;
        db.a aVar = new db.a(context);
        while (!atomicReference.compareAndSet(null, aVar) && atomicReference.get() == null) {
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof android.app.Application)) {
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize((android.app.Application) context.getApplicationContext());
            com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new xa.d());
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f452750m) {
            java.lang.Object obj = f452751n;
            boolean z17 = !((x.n) obj).containsKey("[DEFAULT]");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[DEFAULT]".length() + 33);
            sb6.append("FirebaseApp name ");
            sb6.append("[DEFAULT]");
            sb6.append(" already exists!");
            com.google.android.gms.common.internal.Preconditions.checkState(z17, sb6.toString());
            com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Application context cannot be null.");
            bVar = new xa.b(context, "[DEFAULT]", cVar);
            ((x.n) obj).put("[DEFAULT]", bVar);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference2 = db.a.f227819a;
        bVar.f();
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(java.lang.Class cls, java.lang.Object obj, java.lang.Iterable iterable, boolean z17) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z17) {
                try {
                } catch (java.lang.ClassNotFoundException unused) {
                    if (f452749l.contains(str)) {
                        throw new java.lang.IllegalStateException(java.lang.String.valueOf(str).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    java.lang.String.valueOf(str).concat(" is not linked. Skipping initialization.");
                } catch (java.lang.IllegalAccessException e17) {
                    java.lang.String valueOf = java.lang.String.valueOf(str);
                    android.util.Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new java.lang.String("Failed to initialize "), e17);
                } catch (java.lang.NoSuchMethodException unused2) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(str).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    android.util.Log.wtf("FirebaseApp", "Firebase API initialization failure.", e18);
                }
                if (f452748k.contains(str)) {
                }
            }
            java.lang.reflect.Method method = java.lang.Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (java.lang.reflect.Modifier.isPublic(modifiers) && java.lang.reflect.Modifier.isStatic(modifiers)) {
                method.invoke(null, obj);
            }
        }
    }

    public static void onBackgroundStateChanged(boolean z17) {
        synchronized (f452750m) {
            java.util.ArrayList arrayList = new java.util.ArrayList(((x.b) f452751n).values());
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                java.lang.Object obj = arrayList.get(i17);
                i17++;
                xa.b bVar = (xa.b) obj;
                if (bVar.f452756e.get()) {
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f452758g).iterator();
                    if (it.hasNext()) {
                        android.support.v4.media.f.a(it.next());
                        throw null;
                    }
                }
            }
        }
    }

    public final void d() {
        com.google.android.gms.common.internal.Preconditions.checkState(!this.f452757f.get(), "FirebaseApp was deleted");
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof xa.b)) {
            return false;
        }
        xa.b bVar = (xa.b) obj;
        bVar.d();
        return this.f452753b.equals(bVar.f452753b);
    }

    public final void f() {
        android.content.Context context = this.f452752a;
        boolean isDeviceProtectedStorage = b3.l.isDeviceProtectedStorage(context);
        boolean z17 = true;
        if (isDeviceProtectedStorage) {
            java.util.concurrent.atomic.AtomicReference atomicReference = xa.a.f452743b;
            if (atomicReference.get() == null) {
                xa.a aVar = new xa.a(context);
                while (true) {
                    if (!atomicReference.compareAndSet(null, aVar)) {
                        if (atomicReference.get() != null) {
                            z17 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z17) {
                    context.registerReceiver(aVar, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            boolean isDefaultApp = isDefaultApp();
            bb.d dVar = this.f452755d;
            for (com.google.firebase.components.Component component : dVar.f18706a) {
                int i17 = component.f44639c;
                if (!(i17 == 1)) {
                    if ((i17 == 2) && isDefaultApp) {
                    }
                }
                bb.a.get(dVar, (java.lang.Class) component.f44637a.iterator().next());
            }
        }
        e(xa.b.class, this, f452745h, isDeviceProtectedStorage);
        if (isDefaultApp()) {
            e(xa.b.class, this, f452746i, isDeviceProtectedStorage);
            e(android.content.Context.class, context, f452747j, isDeviceProtectedStorage);
        }
    }

    public <T> T get(java.lang.Class<T> cls) {
        d();
        bb.d dVar = this.f452755d;
        dVar.getClass();
        return (T) bb.a.get(dVar, cls);
    }

    public int hashCode() {
        return this.f452753b.hashCode();
    }

    public boolean isDefaultApp() {
        d();
        return "[DEFAULT]".equals(this.f452753b);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f452753b).add("options", this.f452754c).toString();
    }
}
