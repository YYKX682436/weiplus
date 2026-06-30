package wh;

/* loaded from: classes12.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f445879a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static wh.r1 f445880b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicReference f445881c;

    public static boolean a(int i17) {
        return new java.io.File("/proc/" + i17 + "/stat").exists();
    }

    public static boolean b(int i17, int i18) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2 = null;
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference2 = f445881c;
            if (atomicReference2 == null) {
                java.lang.Class cls = java.lang.Integer.TYPE;
                method = android.os.Process.class.getDeclaredMethod("isThreadInProcess", cls, cls);
            } else {
                method = (java.lang.reflect.Method) atomicReference2.get();
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        if (method2 == null) {
            if (f445881c == null) {
                atomicReference = new java.util.concurrent.atomic.AtomicReference(method2);
                f445881c = atomicReference;
            }
            return new java.io.File("/proc/" + i17 + "/task/" + i18 + "/stat").exists();
        }
        try {
            return ((java.lang.Boolean) method2.invoke(null, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17))).booleanValue();
        } catch (java.lang.Throwable th7) {
            java.lang.reflect.Method method3 = method2;
            th = th7;
            method2 = method3;
            try {
                oj.j.d("Matrix.battery.ProcStatUtil", th, "reflectMethoErr: " + th.getMessage(), new java.lang.Object[0]);
                if (f445881c == null) {
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(method2);
                    f445881c = atomicReference;
                }
                return new java.io.File("/proc/" + i17 + "/task/" + i18 + "/stat").exists();
            } finally {
                if (f445881c == null) {
                    f445881c = new java.util.concurrent.atomic.AtomicReference(method2);
                }
            }
        }
    }

    public static boolean c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("-") ? android.text.TextUtils.isDigitsOnly(str.substring(1)) : android.text.TextUtils.isDigitsOnly(str);
    }

    public static wh.t1 d(int i17) {
        if (!a(i17)) {
            return null;
        }
        return f("/proc/" + i17 + "/stat");
    }

    public static wh.t1 e(int i17, int i18) {
        if (!b(i17, i18)) {
            return null;
        }
        return f("/proc/" + i17 + "/task/" + i18 + "/stat");
    }

    public static wh.t1 f(java.lang.String str) {
        wh.t1 t1Var;
        java.lang.ThreadLocal threadLocal = f445879a;
        try {
            try {
                if (threadLocal.get() == null) {
                    threadLocal.set(new byte[128]);
                }
                t1Var = wh.q1.a(str, (byte[]) threadLocal.get());
            } catch (wh.s1 e17) {
                wh.r1 r1Var = f445880b;
                if (r1Var != null) {
                    ((gi.g) r1Var).a(3, e17.f445871d);
                }
                try {
                    if (threadLocal.get() == null) {
                        threadLocal.set(new byte[128]);
                    }
                    t1Var = g(str, (byte[]) threadLocal.get());
                } catch (wh.s1 e18) {
                    wh.r1 r1Var2 = f445880b;
                    if (r1Var2 != null) {
                        ((gi.g) r1Var2).a(1, e18.f445871d);
                    }
                    t1Var = null;
                }
            }
            if (t1Var == null || t1Var.f445873a == null) {
                oj.j.f("Matrix.battery.ProcStatUtil", "#parseJiffies read with buffer fail, fallback with spilts", new java.lang.Object[0]);
                try {
                    t1Var = h(wh.m.a(str));
                } catch (wh.s1 e19) {
                    wh.r1 r1Var3 = f445880b;
                    if (r1Var3 != null) {
                        ((gi.g) r1Var3).a(2, e19.f445871d);
                    }
                }
                if (t1Var != null) {
                    if (t1Var.f445873a == null) {
                    }
                }
                oj.j.f("Matrix.battery.ProcStatUtil", "#parseJiffies read with splits fail", new java.lang.Object[0]);
                return null;
            }
            return t1Var;
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.ProcStatUtil", "#parseJiffies fail: " + th6.getMessage(), new java.lang.Object[0]);
            wh.r1 r1Var4 = f445880b;
            if (r1Var4 != null) {
                ((gi.g) r1Var4).a(0, wh.m.a(str) + "\n" + th6.getMessage());
            }
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0052. Please report as an issue. */
    public static wh.t1 g(java.lang.String str, byte[] bArr) {
        int i17;
        int i18;
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
            try {
                i17 = fileInputStream.read(bArr);
                fileInputStream.close();
            } finally {
            }
        } catch (java.io.IOException e17) {
            oj.j.d("Matrix.battery.ProcStatUtil", e17, "read buffer from file fail", new java.lang.Object[0]);
            i17 = -1;
        }
        if (i17 <= 0) {
            return null;
        }
        wh.t1 t1Var = new wh.t1();
        int length = bArr.length;
        int i19 = 0;
        int i27 = 0;
        while (i19 < length) {
            if (java.lang.Character.isSpaceChar(bArr[i19])) {
                i27++;
            } else if (i27 == 1) {
                int i28 = 0;
                int i29 = i19;
                while (i29 < length && 41 != bArr[i29]) {
                    i29++;
                    i28++;
                }
                if (40 == bArr[i19]) {
                    i19++;
                    i28--;
                }
                if (41 == bArr[(i19 + i28) - 1]) {
                    i28--;
                }
                if (i28 > 0) {
                    t1Var.f445873a = i(bArr, i19, i28);
                }
                int i37 = i29;
                i27 = 2;
                i19 = i37;
            } else if (i27 != 3) {
                switch (i27) {
                    case 14:
                        int i38 = 0;
                        i18 = i19;
                        while (i18 < length && !java.lang.Character.isSpaceChar(bArr[i18])) {
                            i18++;
                            i38++;
                        }
                        java.lang.String i39 = i(bArr, i19, i38);
                        if (!c(i39)) {
                            throw new wh.s1(i(bArr, 0, bArr.length) + "\nutime: " + i39);
                        }
                        t1Var.f445875c = oj.m.d(i39, 0L);
                        i19 = i18;
                        break;
                    case 15:
                        int i47 = 0;
                        i18 = i19;
                        while (i18 < length && !java.lang.Character.isSpaceChar(bArr[i18])) {
                            i18++;
                            i47++;
                        }
                        java.lang.String i48 = i(bArr, i19, i47);
                        if (!c(i48)) {
                            throw new wh.s1(i(bArr, 0, bArr.length) + "\nstime: " + i48);
                        }
                        t1Var.f445876d = oj.m.d(i48, 0L);
                        i19 = i18;
                        break;
                    case 16:
                        int i49 = 0;
                        i18 = i19;
                        while (i18 < length && !java.lang.Character.isSpaceChar(bArr[i18])) {
                            i18++;
                            i49++;
                        }
                        java.lang.String i57 = i(bArr, i19, i49);
                        if (!c(i57)) {
                            throw new wh.s1(i(bArr, 0, bArr.length) + "\ncutime: " + i57);
                        }
                        t1Var.f445877e = oj.m.d(i57, 0L);
                        i19 = i18;
                        break;
                    case 17:
                        int i58 = 0;
                        i18 = i19;
                        while (i18 < length && !java.lang.Character.isSpaceChar(bArr[i18])) {
                            i18++;
                            i58++;
                        }
                        java.lang.String i59 = i(bArr, i19, i58);
                        if (!c(i59)) {
                            throw new wh.s1(i(bArr, 0, bArr.length) + "\ncstime: " + i59);
                        }
                        t1Var.f445878f = oj.m.d(i59, 0L);
                        i19 = i18;
                        break;
                }
            } else {
                int i66 = 0;
                int i67 = i19;
                while (i67 < length && !java.lang.Character.isSpaceChar(bArr[i67])) {
                    i67++;
                    i66++;
                }
                t1Var.f445874b = i(bArr, i19, i66);
                i19 = i67;
            }
            i19++;
        }
        return t1Var;
    }

    public static wh.t1 h(java.lang.String str) {
        wh.t1 t1Var = new wh.t1();
        if (!android.text.TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(")");
            if (indexOf <= 0) {
                throw new java.lang.IllegalStateException(str.concat(" has not ')'"));
            }
            java.lang.String substring = str.substring(0, indexOf);
            t1Var.f445873a = substring.substring(substring.indexOf("(") + 1, indexOf);
            java.lang.String[] split = str.substring(indexOf + 1).split(" ");
            if (!c(split[12])) {
                throw new wh.s1(str + "\nutime: " + split[12]);
            }
            if (!c(split[13])) {
                throw new wh.s1(str + "\nstime: " + split[13]);
            }
            if (!c(split[14])) {
                throw new wh.s1(str + "\ncutime: " + split[14]);
            }
            if (!c(split[15])) {
                throw new wh.s1(str + "\ncstime: " + split[15]);
            }
            t1Var.f445874b = split[1];
            t1Var.f445875c = oj.m.d(split[12], 0L);
            t1Var.f445876d = oj.m.d(split[13], 0L);
            t1Var.f445877e = oj.m.d(split[14], 0L);
            t1Var.f445878f = oj.m.d(split[15], 0L);
        }
        return t1Var;
    }

    public static java.lang.String i(byte[] bArr, int i17, int i18) {
        try {
            java.nio.CharBuffer decode = java.nio.charset.StandardCharsets.UTF_8.decode(java.nio.ByteBuffer.wrap(bArr, i17, i18));
            return java.lang.String.valueOf(decode.array(), 0, decode.limit());
        } catch (java.lang.IndexOutOfBoundsException e17) {
            oj.j.f("Matrix.battery.ProcStatUtil", "#safeBytesToString failed: " + e17.getMessage(), new java.lang.Object[0]);
            return "";
        }
    }
}
