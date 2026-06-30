package z2;

/* loaded from: classes13.dex */
public class l1 implements android.os.Handler.Callback, android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f469488d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f469489e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f469490f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public java.util.Set f469491g = new java.util.HashSet();

    public l1(android.content.Context context) {
        this.f469488d = context;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f469489e = new android.os.Handler(handlerThread.getLooper(), this);
    }

    public final void a(z2.k1 k1Var) {
        boolean z17;
        java.util.ArrayDeque arrayDeque;
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(k1Var.f469483a);
            k1Var.f469486d.size();
        }
        if (k1Var.f469486d.isEmpty()) {
            return;
        }
        boolean z18 = k1Var.f469484b;
        android.content.ComponentName componentName = k1Var.f469483a;
        if (z18) {
            z17 = true;
        } else {
            android.content.Intent component = new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            android.content.Context context = this.f469488d;
            boolean bindService = context.bindService(component, this, 33);
            k1Var.f469484b = bindService;
            if (bindService) {
                k1Var.f469487e = 0;
            } else {
                java.util.Objects.toString(componentName);
                context.unbindService(this);
            }
            z17 = k1Var.f469484b;
        }
        if (!z17 || k1Var.f469485c == null) {
            b(k1Var);
            return;
        }
        while (true) {
            arrayDeque = k1Var.f469486d;
            z2.m1 m1Var = (z2.m1) arrayDeque.peek();
            if (m1Var == null) {
                break;
            }
            try {
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    m1Var.toString();
                }
                d.c cVar = k1Var.f469485c;
                z2.i1 i1Var = (z2.i1) m1Var;
                android.app.Notification notification = i1Var.f469454d;
                d.a aVar = (d.a) cVar;
                java.lang.String str = i1Var.f469451a;
                int i17 = i1Var.f469452b;
                java.lang.String str2 = i1Var.f469453c;
                aVar.getClass();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(d.c.D0);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    aVar.f225061d.transact(1, obtain, null, 1);
                    obtain.recycle();
                    arrayDeque.remove();
                } catch (java.lang.Throwable th6) {
                    obtain.recycle();
                    throw th6;
                }
            } catch (android.os.DeadObjectException unused) {
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    java.util.Objects.toString(componentName);
                }
            } catch (android.os.RemoteException unused2) {
                java.util.Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(k1Var);
    }

    public final void b(z2.k1 k1Var) {
        android.os.Handler handler = this.f469489e;
        if (handler.hasMessages(3, k1Var.f469483a)) {
            return;
        }
        int i17 = k1Var.f469487e + 1;
        k1Var.f469487e = i17;
        android.content.ComponentName componentName = k1Var.f469483a;
        if (i17 <= 6) {
            android.util.Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << (i17 - 1)) * 1000);
        } else {
            java.util.ArrayDeque arrayDeque = k1Var.f469486d;
            arrayDeque.size();
            java.util.Objects.toString(componentName);
            arrayDeque.clear();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        java.util.Map map = this.f469490f;
        d.c cVar = null;
        android.content.Context context = this.f469488d;
        if (i17 != 0) {
            if (i17 == 1) {
                z2.j1 j1Var = (z2.j1) message.obj;
                z2.k1 k1Var = (z2.k1) ((java.util.HashMap) map).get(j1Var.f469455a);
                if (k1Var != null) {
                    int i18 = d.b.f225062d;
                    android.os.IBinder iBinder = j1Var.f469456b;
                    if (iBinder != null) {
                        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(d.c.D0);
                        cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof d.c)) ? new d.a(iBinder) : (d.c) queryLocalInterface;
                    }
                    k1Var.f469485c = cVar;
                    k1Var.f469487e = 0;
                    a(k1Var);
                }
                return true;
            }
            if (i17 != 2) {
                if (i17 != 3) {
                    return false;
                }
                z2.k1 k1Var2 = (z2.k1) ((java.util.HashMap) map).get((android.content.ComponentName) message.obj);
                if (k1Var2 != null) {
                    a(k1Var2);
                }
                return true;
            }
            z2.k1 k1Var3 = (z2.k1) ((java.util.HashMap) map).get((android.content.ComponentName) message.obj);
            if (k1Var3 != null) {
                if (k1Var3.f469484b) {
                    context.unbindService(this);
                    k1Var3.f469484b = false;
                }
                k1Var3.f469485c = null;
            }
            return true;
        }
        z2.m1 m1Var = (z2.m1) message.obj;
        java.util.Set b17 = z2.n1.b(context);
        if (!b17.equals(this.f469491g)) {
            this.f469491g = b17;
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            java.util.HashSet hashSet = new java.util.HashSet();
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentServices) {
                if (b17.contains(resolveInfo.serviceInfo.packageName)) {
                    android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                android.content.ComponentName componentName2 = (android.content.ComponentName) it.next();
                java.util.HashMap hashMap = (java.util.HashMap) map;
                if (!hashMap.containsKey(componentName2)) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        java.util.Objects.toString(componentName2);
                    }
                    hashMap.put(componentName2, new z2.k1(componentName2));
                }
            }
            java.util.Iterator it6 = ((java.util.HashMap) map).entrySet().iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                        java.util.Objects.toString(entry.getKey());
                    }
                    z2.k1 k1Var4 = (z2.k1) entry.getValue();
                    if (k1Var4.f469484b) {
                        context.unbindService(this);
                        k1Var4.f469484b = false;
                    }
                    k1Var4.f469485c = null;
                    it6.remove();
                }
            }
        }
        for (z2.k1 k1Var5 : ((java.util.HashMap) map).values()) {
            k1Var5.f469486d.add(m1Var);
            a(k1Var5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(componentName);
        }
        this.f469489e.obtainMessage(1, new z2.j1(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            java.util.Objects.toString(componentName);
        }
        this.f469489e.obtainMessage(2, componentName).sendToTarget();
    }
}
