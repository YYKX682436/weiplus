package t36;

/* loaded from: classes13.dex */
public class e extends t36.k {

    /* renamed from: c, reason: collision with root package name */
    public final t36.j f415443c;

    /* renamed from: d, reason: collision with root package name */
    public final t36.j f415444d;

    /* renamed from: e, reason: collision with root package name */
    public final t36.j f415445e;

    /* renamed from: f, reason: collision with root package name */
    public final t36.j f415446f;

    /* renamed from: g, reason: collision with root package name */
    public final t36.d f415447g;

    public e(java.lang.Class cls, t36.j jVar, t36.j jVar2, t36.j jVar3, t36.j jVar4) {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("dalvik.system.CloseGuard");
            method = cls2.getMethod("get", new java.lang.Class[0]);
            method3 = cls2.getMethod("open", java.lang.String.class);
            method2 = cls2.getMethod("warnIfOpen", new java.lang.Class[0]);
        } catch (java.lang.Exception unused) {
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f415447g = new t36.d(method, method3, method2);
        this.f415443c = jVar;
        this.f415444d = jVar2;
        this.f415445e = jVar3;
        this.f415446f = jVar4;
    }

    @Override // t36.k
    public v36.c c(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.net.http.X509TrustManagerExtensions");
            return new t36.b(cls.getConstructor(javax.net.ssl.X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", java.security.cert.X509Certificate[].class, java.lang.String.class, java.lang.String.class));
        } catch (java.lang.Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // t36.k
    public v36.e d(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            java.lang.reflect.Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", java.security.cert.X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new t36.c(x509TrustManager, declaredMethod);
        } catch (java.lang.NoSuchMethodException unused) {
            return new v36.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // t36.k
    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        if (str != null) {
            this.f415443c.c(sSLSocket, java.lang.Boolean.TRUE);
            this.f415444d.c(sSLSocket, str);
        }
        t36.j jVar = this.f415446f;
        if (jVar != null) {
            if (jVar.a(sSLSocket.getClass()) != null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                x36.k kVar = new x36.k();
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    l36.r0 r0Var = (l36.r0) list.get(i17);
                    if (r0Var != l36.r0.HTTP_1_0) {
                        kVar.F(r0Var.f315635d.length());
                        kVar.O(r0Var.f315635d);
                    }
                }
                objArr[0] = kVar.k(kVar.f451694e);
                try {
                    jVar.b(sSLSocket, objArr);
                } catch (java.lang.reflect.InvocationTargetException e17) {
                    java.lang.Throwable targetException = e17.getTargetException();
                    if (targetException instanceof java.lang.RuntimeException) {
                        throw ((java.lang.RuntimeException) targetException);
                    }
                    java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            }
        }
    }

    @Override // t36.k
    public void g(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, int i17) {
        try {
            socket.connect(inetSocketAddress, i17);
        } catch (java.lang.AssertionError e17) {
            if (!m36.e.o(e17)) {
                throw e17;
            }
            throw new java.io.IOException(e17);
        } catch (java.lang.ClassCastException e18) {
            if (android.os.Build.VERSION.SDK_INT != 26) {
                throw e18;
            }
            java.io.IOException iOException = new java.io.IOException("Exception in connect");
            iOException.initCause(e18);
            throw iOException;
        } catch (java.lang.SecurityException e19) {
            java.io.IOException iOException2 = new java.io.IOException("Exception in connect");
            iOException2.initCause(e19);
            throw iOException2;
        }
    }

    @Override // t36.k
    public javax.net.ssl.SSLContext h() {
        try {
            return javax.net.ssl.SSLContext.getInstance("TLS");
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.IllegalStateException("No TLS provider", e17);
        }
    }

    @Override // t36.k
    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        t36.j jVar = this.f415445e;
        if (jVar == null) {
            return null;
        }
        if (!(jVar.a(sSLSocket.getClass()) != null)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) jVar.b(sSLSocket, new java.lang.Object[0]);
            if (bArr != null) {
                return new java.lang.String(bArr, m36.e.f323389d);
            }
            return null;
        } catch (java.lang.reflect.InvocationTargetException e17) {
            java.lang.Throwable targetException = e17.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // t36.k
    public java.lang.Object j(java.lang.String str) {
        t36.d dVar = this.f415447g;
        java.lang.reflect.Method method = dVar.f415440a;
        if (method == null) {
            return null;
        }
        try {
            java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
            dVar.f415441b.invoke(invoke, str);
            return invoke;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // t36.k
    public boolean k(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.security.NetworkSecurityPolicy");
            return n(str, cls, cls.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return true;
        } catch (java.lang.IllegalAccessException e17) {
            e = e17;
            throw m36.e.a("unable to determine cleartext support", e);
        } catch (java.lang.IllegalArgumentException e18) {
            e = e18;
            throw m36.e.a("unable to determine cleartext support", e);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            e = e19;
            throw m36.e.a("unable to determine cleartext support", e);
        }
    }

    @Override // t36.k
    public void l(int i17, java.lang.String str, java.lang.Throwable th6) {
        int min;
        int i18 = i17 != 5 ? 3 : 5;
        if (th6 != null) {
            str = str + '\n' + android.util.Log.getStackTraceString(th6);
        }
        int length = str.length();
        int i19 = 0;
        while (i19 < length) {
            int indexOf = str.indexOf(10, i19);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = java.lang.Math.min(indexOf, i19 + 4000);
                android.util.Log.println(i18, "OkHttp", str.substring(i19, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i19 = min;
                }
            }
            i19 = min + 1;
        }
    }

    @Override // t36.k
    public void m(java.lang.String str, java.lang.Object obj) {
        t36.d dVar = this.f415447g;
        dVar.getClass();
        boolean z17 = false;
        if (obj != null) {
            try {
                dVar.f415442c.invoke(obj, new java.lang.Object[0]);
                z17 = true;
            } catch (java.lang.Exception unused) {
            }
        }
        if (z17) {
            return;
        }
        l(5, str, null);
    }

    public final boolean n(java.lang.String str, java.lang.Class cls, java.lang.Object obj) {
        try {
            try {
                return ((java.lang.Boolean) cls.getMethod("isCleartextTrafficPermitted", java.lang.String.class).invoke(obj, str)).booleanValue();
            } catch (java.lang.NoSuchMethodException unused) {
                return ((java.lang.Boolean) cls.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).booleanValue();
            }
        } catch (java.lang.NoSuchMethodException unused2) {
            return true;
        }
    }
}
