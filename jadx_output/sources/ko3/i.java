package ko3;

/* loaded from: classes13.dex */
public final class i extends ko3.n {

    /* renamed from: f, reason: collision with root package name */
    public final ko3.t f309970f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f309971g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko3.u f309972h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ko3.u uVar, java.lang.Object obj, android.os.IBinder iBinder) {
        super(uVar, iBinder);
        this.f309972h = uVar;
        this.f309970f = null;
        this.f309971g = null;
        try {
            this.f309971g = new java.lang.ref.WeakReference(obj);
            java.lang.String str = ko3.u.f310008n + "$Stub";
            android.util.LruCache lruCache = ko3.k0.f309980a;
            try {
                this.f309970f = new ko3.t(uVar, java.lang.Class.forName(str));
            } catch (java.lang.Throwable th6) {
                throw new ko3.j0(th6);
            }
        } catch (java.lang.Throwable th7) {
            ko3.u.d(uVar, th7);
        }
    }

    @Override // ko3.n, android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        ko3.s sVar;
        if (i17 < 1 || i17 > 16777215) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        if (this.f309970f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AED", "init failed, give up intercepting.");
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        if (this.f309971g.get() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        ko3.t tVar = this.f309970f;
        synchronized (tVar) {
            sVar = tVar.f309998e;
            if (sVar == null) {
                tVar.f309998e = new ko3.s(tVar, null);
                try {
                    android.os.IInterface iInterface = (android.os.IInterface) ko3.k0.b(tVar.f309997d, "asInterface", new java.lang.Class[]{android.os.IBinder.class}, tVar);
                    for (java.lang.Class<?> cls : tVar.f309997d.getInterfaces()) {
                        if (android.os.IInterface.class.isAssignableFrom(cls)) {
                            for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
                                if (!"asBinder".equals(method.getName())) {
                                    tVar.f309999f = method.getName();
                                    if (!method.isAccessible()) {
                                        method.setAccessible(true);
                                    }
                                    method.invoke(iInterface, tVar.a(method.getParameterTypes()));
                                }
                            }
                        }
                    }
                    sVar = tVar.f309998e;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AED", th6, "unexpected exception.", new java.lang.Object[0]);
                    ko3.u.d(tVar.f310000g, th6);
                    tVar.f309998e.clear();
                    throw null;
                }
            }
        }
        java.lang.String str = (java.lang.String) sVar.get(i17);
        try {
            parcel.enforceInterface(ko3.u.f310008n);
            if (ko3.u.f310013s.equals(str)) {
                parcel.readLong();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f310014t.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                parcel.readInt();
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder2, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f310015u.equals(str)) {
                parcel.readLong();
                parcel.readString();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder3, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f310016v.equals(str)) {
                parcel.readLong();
                parcel.readString();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder4, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f310017w.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder5, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f310018x.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder6, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f310019y.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    android.os.Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f309972h.f310023c).put(readStrongBinder7, java.lang.Integer.valueOf(parcel.readInt()));
            }
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AED", th7, "unexpected exception.", new java.lang.Object[0]);
            ko3.u.d(this.f309972h, th7);
        }
        return super.onTransact(i17, parcel, parcel2, i18);
    }
}
