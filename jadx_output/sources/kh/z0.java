package kh;

/* loaded from: classes12.dex */
public final class z0 implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f307959a = jz5.h.a(jz5.i.f302829d, kh.y0.f307950d);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kh.k1 f307961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f307962d;

    public z0(java.lang.Object obj, kh.k1 k1Var, java.lang.Class cls) {
        this.f307960b = obj;
        this.f307961c = k1Var;
        this.f307962d = cls;
    }

    public final java.lang.Object a(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj = this.f307960b;
        if (obj != null) {
            return objArr == null ? method.invoke(obj, new java.lang.Object[0]) : method.invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length));
        }
        return null;
    }

    public final boolean b() {
        boolean booleanValue;
        boolean z17;
        java.util.Map map = (java.util.Map) this.f307959a.getValue();
        kh.k1 k1Var = this.f307961c;
        synchronized (map) {
            java.util.Map map2 = (java.util.Map) this.f307959a.getValue();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(android.os.Process.myTid());
            java.lang.Object obj = map2.get(valueOf);
            if (obj == null) {
                if (!k1Var.A()) {
                    if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                        z17 = k1Var.B();
                    } else {
                        java.lang.String name = java.lang.Thread.currentThread().getName();
                        java.util.Collection<java.lang.String> collection = k1Var.f395294a.f363335d.f363304w;
                        if (collection == null) {
                            collection = kz5.p0.f313996d;
                        }
                        if (!collection.isEmpty()) {
                            for (java.lang.String str : collection) {
                                kotlin.jvm.internal.o.d(name);
                                if (r26.n0.B(name, str, false)) {
                                }
                            }
                        }
                        z17 = false;
                    }
                    obj = java.lang.Boolean.valueOf(z17);
                    map2.put(valueOf, obj);
                }
                z17 = true;
                obj = java.lang.Boolean.valueOf(z17);
                map2.put(valueOf, obj);
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Runnable callback;
        java.lang.Object[] objArr3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Runnable callback2;
        kotlin.jvm.internal.o.g(method, "method");
        int i17 = 0;
        try {
            pj.e.f354903a.g("Matrix.battery.LooperTaskMonitorFeatureKt", 100, new kh.x0(method, objArr));
            java.lang.String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                kh.k1 k1Var = this.f307961c;
                java.lang.String str = "";
                if (hashCode == -1879582208) {
                    if (name.equals("messageDispatched")) {
                        if (objArr != null && objArr.length >= 2) {
                            int length = objArr.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= length) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = objArr[i18];
                                if (obj2 instanceof kh.g1) {
                                    break;
                                }
                                i18++;
                            }
                            kh.g1 g1Var = obj2 instanceof kh.g1 ? (kh.g1) obj2 : null;
                            int length2 = objArr.length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= length2) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = objArr[i19];
                                if (obj3 instanceof android.os.Message) {
                                    break;
                                }
                                i19++;
                            }
                            android.os.Message message = obj3 instanceof android.os.Message ? (android.os.Message) obj3 : null;
                            if (g1Var != null && message != null) {
                                g1Var.f307808a = message.getTarget().getClass().getName();
                                java.lang.Runnable callback3 = message.getCallback();
                                f75.a aVar = callback3 instanceof f75.a ? (f75.a) callback3 : null;
                                if (aVar == null || (callback = ((com.tencent.mm.sdk.platformtools.m3) aVar).f192850d) == null) {
                                    callback = message.getCallback();
                                }
                                java.lang.String name2 = callback != null ? callback.getClass().getName() : null;
                                if (name2 != null) {
                                    str = name2;
                                }
                                g1Var.f307809b = str;
                                g1Var.f307810c = message.what;
                                kh.k1.y(k1Var, g1Var);
                            }
                        }
                        if (objArr != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
                            for (java.lang.Object obj6 : objArr) {
                                if (obj6 instanceof kh.g1) {
                                    obj6 = ((kh.g1) obj6).f307811d;
                                }
                                arrayList.add(obj6);
                            }
                            objArr2 = arrayList.toArray(new java.lang.Object[0]);
                        } else {
                            objArr2 = null;
                        }
                        return a(method, objArr2);
                    }
                } else if (hashCode == 43687879) {
                    if (name.equals("dispatchingThrewException")) {
                        if (objArr != null && objArr.length >= 2) {
                            int length3 = objArr.length;
                            int i27 = 0;
                            while (true) {
                                if (i27 >= length3) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = objArr[i27];
                                if (obj4 instanceof kh.g1) {
                                    break;
                                }
                                i27++;
                            }
                            kh.g1 g1Var2 = obj4 instanceof kh.g1 ? (kh.g1) obj4 : null;
                            int length4 = objArr.length;
                            int i28 = 0;
                            while (true) {
                                if (i28 >= length4) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = objArr[i28];
                                if (obj5 instanceof android.os.Message) {
                                    break;
                                }
                                i28++;
                            }
                            android.os.Message message2 = obj5 instanceof android.os.Message ? (android.os.Message) obj5 : null;
                            if (g1Var2 != null && message2 != null) {
                                g1Var2.f307808a = message2.getTarget().getClass().getName();
                                java.lang.Runnable callback4 = message2.getCallback();
                                f75.a aVar2 = callback4 instanceof f75.a ? (f75.a) callback4 : null;
                                if (aVar2 == null || (callback2 = ((com.tencent.mm.sdk.platformtools.m3) aVar2).f192850d) == null) {
                                    callback2 = message2.getCallback();
                                }
                                java.lang.String name3 = callback2 != null ? callback2.getClass().getName() : null;
                                if (name3 != null) {
                                    str = name3;
                                }
                                g1Var2.f307809b = str;
                                g1Var2.f307810c = message2.what;
                                kh.k1.y(k1Var, g1Var2);
                            }
                        }
                        if (objArr != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(objArr.length);
                            for (java.lang.Object obj7 : objArr) {
                                if (obj7 instanceof kh.g1) {
                                    obj7 = ((kh.g1) obj7).f307811d;
                                }
                                arrayList2.add(obj7);
                            }
                            objArr3 = arrayList2.toArray(new java.lang.Object[0]);
                        } else {
                            objArr3 = null;
                        }
                        return a(method, objArr3);
                    }
                } else if (hashCode == 901629185 && name.equals("messageDispatchStarting")) {
                    java.lang.Object a17 = a(method, objArr);
                    if (!b()) {
                        return a17;
                    }
                    if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        kh.i0 i0Var = kh.i0.f307826a;
                        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                        kotlin.jvm.internal.o.f(choreographer, "getInstance(...)");
                        i0Var.b(choreographer);
                    }
                    kh.g1 a18 = kh.g1.f307805f.a("", "", 0, a17);
                    java.lang.String str2 = "stub#" + a18.f307812e;
                    kotlin.jvm.internal.o.g(str2, "<set-?>");
                    a18.f307809b = str2;
                    kh.k1.z(k1Var, a18);
                    return a18;
                }
            }
            return a(method, objArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.LooperTaskMonitorFeatureKt", e17, "invoke Looper.Observer failed", new java.lang.Object[0]);
            if (!kh.k1.f307838n) {
                return null;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (objArr != null) {
                int length5 = objArr.length;
                int i29 = 0;
                int i37 = 0;
                while (i29 < length5) {
                    linkedHashMap.put("arg-" + i37, java.lang.String.valueOf(objArr[i29]));
                    i29++;
                    i37++;
                }
            }
            java.lang.Object obj8 = this.f307960b;
            if (obj8 != null) {
                linkedHashMap.put("originObserver-type", obj8.getClass().getName());
                java.lang.Class cls = this.f307962d;
                java.lang.Class<?>[] interfaces = cls.getInterfaces();
                kotlin.jvm.internal.o.f(interfaces, "getInterfaces(...)");
                int length6 = interfaces.length;
                int i38 = 0;
                int i39 = 0;
                while (i38 < length6) {
                    int i47 = i39 + 1;
                    java.lang.reflect.Method[] declaredMethods = interfaces[i38].getDeclaredMethods();
                    kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
                    int length7 = declaredMethods.length;
                    int i48 = i17;
                    while (i17 < length7) {
                        java.lang.String method2 = declaredMethods[i17].toString();
                        kotlin.jvm.internal.o.f(method2, "toString(...)");
                        linkedHashMap.put("originObserver-i" + i39 + "-m" + i48, method2);
                        i17++;
                        i48++;
                    }
                    i38++;
                    i39 = i47;
                    i17 = 0;
                }
                java.lang.reflect.Method[] declaredMethods2 = cls.getDeclaredMethods();
                kotlin.jvm.internal.o.f(declaredMethods2, "getDeclaredMethods(...)");
                int length8 = declaredMethods2.length;
                int i49 = 0;
                int i57 = 0;
                while (i57 < length8) {
                    java.lang.String method3 = declaredMethods2[i57].toString();
                    kotlin.jvm.internal.o.f(method3, "toString(...)");
                    linkedHashMap.put("originObserver-m" + i49, method3);
                    i57++;
                    i49++;
                }
            }
            java.lang.String name4 = method.getName();
            java.lang.String arrays = java.util.Arrays.toString(objArr);
            kotlin.jvm.internal.o.f(arrays, "toString(...)");
            ap.a.a(1, "errHookLooper", e17, linkedHashMap, "invokeObserver", name4, arrays);
            return null;
        }
    }
}
