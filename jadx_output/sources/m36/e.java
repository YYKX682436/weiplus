package m36;

/* loaded from: classes16.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f323386a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f323387b = new java.lang.String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final l36.c1 f323388c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.nio.charset.Charset f323389d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.TimeZone f323390e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Comparator f323391f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.reflect.Method f323392g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f323393h;

    static {
        byte[] bArr = new byte[0];
        f323386a = bArr;
        x36.k kVar = new x36.k();
        kVar.z(bArr);
        long j17 = 0;
        java.lang.reflect.Method method = null;
        f323388c = new l36.b1(null, j17, kVar);
        if ((j17 | j17) < 0 || j17 > j17 || j17 - j17 < j17) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        x36.o.j("efbbbf");
        x36.o.j("feff");
        x36.o.j("fffe");
        x36.o.j("0000ffff");
        x36.o.j("ffff0000");
        f323389d = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
        java.nio.charset.Charset.forName(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
        java.nio.charset.Charset.forName("UTF-16BE");
        java.nio.charset.Charset.forName("UTF-16LE");
        java.nio.charset.Charset.forName("UTF-32BE");
        java.nio.charset.Charset.forName("UTF-32LE");
        f323390e = java.util.TimeZone.getTimeZone("GMT");
        f323391f = new m36.c();
        try {
            method = java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class);
        } catch (java.lang.Exception unused) {
        }
        f323392g = method;
        f323393h = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static java.lang.AssertionError a(java.lang.String str, java.lang.Exception exc) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (java.lang.IllegalStateException unused) {
        }
        return assertionError;
    }

    public static java.lang.String b(java.lang.String str) {
        int i17 = -1;
        int i18 = 0;
        if (!str.contains(":")) {
            try {
                java.lang.String lowerCase = java.net.IDN.toASCII(str).toLowerCase(java.util.Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                for (int i19 = 0; i19 < lowerCase.length(); i19++) {
                    char charAt = lowerCase.charAt(i19);
                    if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                    }
                    i18 = 1;
                }
                if (i18 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        java.net.InetAddress f17 = (str.startsWith("[") && str.endsWith("]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (f17 == null) {
            return null;
        }
        byte[] address = f17.getAddress();
        if (address.length != 16) {
            throw new java.lang.AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        int i27 = 0;
        int i28 = 0;
        while (i27 < address.length) {
            int i29 = i27;
            while (i29 < 16 && address[i29] == 0 && address[i29 + 1] == 0) {
                i29 += 2;
            }
            int i37 = i29 - i27;
            if (i37 > i28 && i37 >= 4) {
                i17 = i27;
                i28 = i37;
            }
            i27 = i29 + 2;
        }
        x36.k kVar = new x36.k();
        while (i18 < address.length) {
            if (i18 == i17) {
                kVar.F(58);
                i18 += i28;
                if (i18 == 16) {
                    kVar.F(58);
                }
            } else {
                if (i18 > 0) {
                    kVar.F(58);
                }
                kVar.i0(((address[i18] & 255) << 8) | (address[i18 + 1] & 255));
                i18 += 2;
            }
        }
        return kVar.q();
    }

    public static void c(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e17) {
                throw e17;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void d(java.net.Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (java.lang.AssertionError e17) {
                if (!o(e17)) {
                    throw e17;
                }
            } catch (java.lang.RuntimeException e18) {
                if (!"bio == null".equals(e18.getMessage())) {
                    throw e18;
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static int e(char c17) {
        if (c17 >= '0' && c17 <= '9') {
            return c17 - '0';
        }
        char c18 = 'a';
        if (c17 < 'a' || c17 > 'f') {
            c18 = 'A';
            if (c17 < 'A' || c17 > 'F') {
                return -1;
            }
        }
        return (c17 - c18) + 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r7 == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r8 != (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009a, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress f(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m36.e.f(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int g(java.lang.String str, int i17, int i18, char c17) {
        while (i17 < i18) {
            if (str.charAt(i17) == c17) {
                return i17;
            }
            i17++;
        }
        return i18;
    }

    public static int h(java.lang.String str, int i17, int i18, java.lang.String str2) {
        while (i17 < i18) {
            if (str2.indexOf(str.charAt(i17)) != -1) {
                return i17;
            }
            i17++;
        }
        return i18;
    }

    public static boolean i(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static java.lang.String j(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.lang.String k(l36.k0 k0Var, boolean z17) {
        boolean contains = k0Var.f315534d.contains(":");
        java.lang.String str = k0Var.f315534d;
        if (contains) {
            str = "[" + str + "]";
        }
        int i17 = k0Var.f315535e;
        if (!z17 && i17 == l36.k0.c(k0Var.f315531a)) {
            return str;
        }
        return str + ":" + i17;
    }

    public static java.util.List l(java.util.List list) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    public static java.util.List m(java.lang.Object... objArr) {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList((java.lang.Object[]) objArr.clone()));
    }

    public static java.lang.String[] n(java.util.Comparator comparator, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            int length = strArr2.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i17]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i17++;
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static boolean o(java.lang.AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean p(java.util.Comparator comparator, java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (java.lang.String str : strArr) {
                for (java.lang.String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(x36.h0 h0Var, int i17, java.util.concurrent.TimeUnit timeUnit) {
        long nanoTime = java.lang.System.nanoTime();
        long c17 = h0Var.h().e() ? h0Var.h().c() - nanoTime : Long.MAX_VALUE;
        h0Var.h().d(java.lang.Math.min(c17, timeUnit.toNanos(i17)) + nanoTime);
        try {
            x36.k kVar = new x36.k();
            while (h0Var.B(kVar, 8192L) != -1) {
                kVar.skip(kVar.f451694e);
            }
            if (c17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                h0Var.h().a();
                return true;
            }
            h0Var.h().d(nanoTime + c17);
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (c17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                h0Var.h().a();
                return false;
            }
            h0Var.h().d(nanoTime + c17);
            return false;
        } catch (java.lang.Throwable th6) {
            if (c17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                h0Var.h().a();
            } else {
                h0Var.h().d(nanoTime + c17);
            }
            throw th6;
        }
    }

    public static int r(java.lang.String str, int i17, int i18) {
        while (i17 < i18) {
            char charAt = str.charAt(i17);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i17;
            }
            i17++;
        }
        return i18;
    }

    public static int s(java.lang.String str, int i17, int i18) {
        for (int i19 = i18 - 1; i19 >= i17; i19--) {
            char charAt = str.charAt(i19);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i19 + 1;
            }
        }
        return i17;
    }

    public static l36.i0 t(java.util.List list) {
        l36.h0 h0Var = new l36.h0();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r36.c cVar = (r36.c) it.next();
            m36.a aVar = m36.a.f323382a;
            java.lang.String u17 = cVar.f369354a.u();
            java.lang.String u18 = cVar.f369355b.u();
            ((l36.o0) aVar).getClass();
            h0Var.b(u17, u18);
        }
        return new l36.i0(h0Var);
    }

    public static java.lang.String u(java.lang.String str, int i17, int i18) {
        int r17 = r(str, i17, i18);
        return str.substring(r17, s(str, r17, i18));
    }
}
