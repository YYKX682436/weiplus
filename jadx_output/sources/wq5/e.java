package wq5;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f448700b = java.util.regex.Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f448701c = new wq5.d(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f448702a;

    public e() {
        this.f448702a = new java.util.HashMap();
    }

    public static java.lang.annotation.Annotation b(java.lang.reflect.Method method, java.lang.Class cls) {
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return method.getAnnotation(cls);
            }
            java.lang.Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            for (java.lang.Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    return b(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
                }
            }
            try {
                return b(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
            } catch (java.lang.NoSuchMethodException | java.lang.SecurityException unused2) {
            }
        }
        return null;
    }

    public static int c(java.lang.reflect.Method method, java.lang.Class cls) {
        int c17;
        if (method != null && cls != null) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            java.lang.Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            for (java.lang.Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    c17 = c(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
                }
                if (c17 > 0) {
                    return c17 + 1;
                }
            }
            try {
                int c18 = c(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (c18 > 0) {
                    return c18 + 1;
                }
            } catch (java.lang.NoSuchMethodException | java.lang.SecurityException unused2) {
            }
        }
        return -1;
    }

    public static java.io.Writer f(java.lang.String str, java.io.Writer writer) {
        if (str == null || str.isEmpty()) {
            writer.write("\"\"");
            return writer;
        }
        int length = str.length();
        writer.write(34);
        int i17 = 0;
        char c17 = 0;
        while (i17 < length) {
            char charAt = str.charAt(i17);
            if (charAt == '\f') {
                writer.write("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '/') {
                        if (c17 == '<') {
                            writer.write(92);
                        }
                        writer.write(charAt);
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                writer.write("\\b");
                                break;
                            case '\t':
                                writer.write("\\t");
                                break;
                            case '\n':
                                writer.write("\\n");
                                break;
                            default:
                                if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                    writer.write(charAt);
                                    break;
                                } else {
                                    writer.write("\\u");
                                    java.lang.String hexString = java.lang.Integer.toHexString(charAt);
                                    writer.write("0000", 0, 4 - hexString.length());
                                    writer.write(hexString);
                                    break;
                                }
                        }
                    }
                }
                writer.write(92);
                writer.write(charAt);
            } else {
                writer.write("\\r");
            }
            i17++;
            c17 = charAt;
        }
        writer.write(34);
        return writer;
    }

    public static java.lang.String g(java.lang.String str) {
        java.lang.String obj;
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                try {
                    obj = f(str, stringWriter).toString();
                } catch (java.io.IOException unused) {
                    return "";
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return obj;
    }

    public static java.lang.Number h(java.lang.String str) {
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
        }
        if (str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str)) {
            try {
                try {
                    java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
                    return (charAt == '-' && java.math.BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? java.lang.Double.valueOf(-0.0d) : bigDecimal;
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
                }
            } catch (java.lang.NumberFormatException unused2) {
                java.lang.Double valueOf = java.lang.Double.valueOf(str);
                if (!valueOf.isNaN() && !valueOf.isInfinite()) {
                    return valueOf;
                }
                throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
            }
        }
        if (charAt == '0' && str.length() > 1) {
            char charAt2 = str.charAt(1);
            if (charAt2 >= '0' && charAt2 <= '9') {
                throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
            }
        } else if (charAt == '-' && str.length() > 2) {
            char charAt3 = str.charAt(1);
            char charAt4 = str.charAt(2);
            if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                throw new java.lang.NumberFormatException("val [" + str + "] is not a valid number.");
            }
        }
        java.math.BigInteger bigInteger = new java.math.BigInteger(str);
        return bigInteger.bitLength() <= 31 ? java.lang.Integer.valueOf(bigInteger.intValue()) : bigInteger.bitLength() <= 63 ? java.lang.Long.valueOf(bigInteger.longValue()) : bigInteger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r3.isNaN() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0.isNaN() == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(java.lang.Object r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L3a
            java.lang.Number r3 = (java.lang.Number) r3
            boolean r0 = r3 instanceof java.lang.Double
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r3
            java.lang.Double r0 = (java.lang.Double) r0
            boolean r2 = r0.isInfinite()
            if (r2 != 0) goto L2f
            boolean r0 = r0.isNaN()
            if (r0 == 0) goto L1b
            goto L2f
        L1b:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2e
            java.lang.Float r3 = (java.lang.Float) r3
            boolean r0 = r3.isInfinite()
            if (r0 != 0) goto L2f
            boolean r3 = r3.isNaN()
            if (r3 == 0) goto L2e
            goto L2f
        L2e:
            r1 = 1
        L2f:
            if (r1 == 0) goto L32
            goto L3a
        L32:
            wq5.b r3 = new wq5.b
            java.lang.String r0 = "JSON does not allow non-finite numbers."
            r3.<init>(r0)
            throw r3
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wq5.e.i(java.lang.Object):void");
    }

    public static java.lang.Object j(java.lang.Object obj) {
        try {
            java.lang.Object obj2 = f448701c;
            if (obj2.equals(obj)) {
                return obj2;
            }
            if (!(obj instanceof wq5.e) && !(obj instanceof wq5.a) && !obj2.equals(obj) && !(obj instanceof java.lang.Byte) && !(obj instanceof java.lang.Character) && !(obj instanceof java.lang.Short) && !(obj instanceof java.lang.Integer) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Boolean) && !(obj instanceof java.lang.Float) && !(obj instanceof java.lang.Double) && !(obj instanceof java.lang.String) && !(obj instanceof java.math.BigInteger) && !(obj instanceof java.math.BigDecimal) && !(obj instanceof java.lang.Enum)) {
                if (obj instanceof java.util.Collection) {
                    return new wq5.a((java.util.Collection) obj);
                }
                if (obj.getClass().isArray()) {
                    return new wq5.a(obj);
                }
                if (obj instanceof java.util.Map) {
                    return new wq5.e((java.util.Map) obj);
                }
                java.lang.Package r07 = obj.getClass().getPackage();
                java.lang.String name = r07 != null ? r07.getName() : "";
                if (!name.startsWith("java.") && !name.startsWith("javax.") && obj.getClass().getClassLoader() != null) {
                    return new wq5.e(obj);
                }
                return obj.toString();
            }
            return obj;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final java.io.Writer l(java.io.Writer writer, java.lang.Object obj, int i17, int i18) {
        if (obj == null || obj.equals(null)) {
            writer.write("null");
        } else if (obj instanceof java.lang.Number) {
            java.lang.Number number = (java.lang.Number) obj;
            i(number);
            java.lang.String obj2 = number.toString();
            if (obj2.indexOf(46) > 0 && obj2.indexOf(101) < 0 && obj2.indexOf(69) < 0) {
                while (obj2.endsWith("0")) {
                    obj2 = obj2.substring(0, obj2.length() - 1);
                }
                if (obj2.endsWith(".")) {
                    obj2 = obj2.substring(0, obj2.length() - 1);
                }
            }
            if (f448700b.matcher(obj2).matches()) {
                writer.write(obj2);
            } else {
                f(obj2, writer);
            }
        } else if (obj instanceof java.lang.Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof java.lang.Enum) {
            writer.write(g(((java.lang.Enum) obj).name()));
        } else if (obj instanceof wq5.e) {
            ((wq5.e) obj).k(writer, i17, i18);
        } else if (obj instanceof wq5.a) {
            ((wq5.a) obj).h(writer, i17, i18);
        } else if (obj instanceof java.util.Map) {
            new wq5.e((java.util.Map) obj).k(writer, i17, i18);
        } else if (obj instanceof java.util.Collection) {
            new wq5.a((java.util.Collection) obj).h(writer, i17, i18);
        } else if (obj.getClass().isArray()) {
            new wq5.a(obj).h(writer, i17, i18);
        } else {
            f(obj.toString(), writer);
        }
        return writer;
    }

    public wq5.e a(java.lang.String str, java.lang.Object obj) {
        i(obj);
        java.lang.Object d17 = d(str);
        if (d17 == null) {
            if (obj instanceof wq5.a) {
                wq5.a aVar = new wq5.a();
                aVar.g(obj);
                obj = aVar;
            }
            e(str, obj);
        } else if (d17 instanceof wq5.a) {
            ((wq5.a) d17).g(obj);
        } else {
            wq5.a aVar2 = new wq5.a();
            aVar2.g(d17);
            aVar2.g(obj);
            e(str, aVar2);
        }
        return this;
    }

    public java.lang.Object d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.f448702a.get(str);
    }

    public wq5.e e(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null key.");
        }
        java.util.Map map = this.f448702a;
        if (obj != null) {
            i(obj);
            ((java.util.HashMap) map).put(str, obj);
        } else {
            ((java.util.HashMap) map).remove(str);
        }
        return this;
    }

    public java.io.Writer k(java.io.Writer writer, int i17, int i18) {
        java.util.Map map = this.f448702a;
        try {
            int size = ((java.util.HashMap) map).size();
            writer.write(123);
            if (size == 1) {
                java.util.Map.Entry entry = (java.util.Map.Entry) ((java.util.HashMap) map).entrySet().iterator().next();
                java.lang.String str = (java.lang.String) entry.getKey();
                writer.write(g(str));
                writer.write(58);
                if (i17 > 0) {
                    writer.write(32);
                }
                try {
                    l(writer, entry.getValue(), i17, i18);
                    writer.write(125);
                    return writer;
                } catch (java.lang.Exception e17) {
                    throw new wq5.b("Unable to write JSONObject value for key: " + str, e17);
                }
            }
            if (size != 0) {
                int i19 = i18 + i17;
                boolean z17 = false;
                for (java.util.Map.Entry entry2 : ((java.util.HashMap) map).entrySet()) {
                    if (z17) {
                        writer.write(44);
                    }
                    if (i17 > 0) {
                        writer.write(10);
                    }
                    for (int i27 = 0; i27 < i19; i27++) {
                        writer.write(32);
                    }
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    writer.write(g(str2));
                    writer.write(58);
                    if (i17 > 0) {
                        writer.write(32);
                    }
                    try {
                        l(writer, entry2.getValue(), i17, i19);
                        z17 = true;
                    } catch (java.lang.Exception e18) {
                        throw new wq5.b("Unable to write JSONObject value for key: " + str2, e18);
                    }
                }
                if (i17 > 0) {
                    writer.write(10);
                }
                for (int i28 = 0; i28 < i18; i28++) {
                    writer.write(32);
                }
            }
            writer.write(125);
            return writer;
        } catch (java.io.IOException e19) {
            throw new wq5.b(e19);
        }
    }

    public java.lang.String toString() {
        java.lang.String obj;
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            synchronized (stringWriter.getBuffer()) {
                k(stringWriter, 0, 0);
                obj = stringWriter.toString();
            }
            return obj;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public e(wq5.h hVar) {
        this();
        if (hVar.d() != '{') {
            throw hVar.f("A JSONObject text must begin with '{'");
        }
        while (true) {
            char d17 = hVar.d();
            if (d17 == 0) {
                throw hVar.f("A JSONObject text must end with '}'");
            }
            if (d17 == '}') {
                return;
            }
            hVar.a();
            java.lang.String obj = hVar.e().toString();
            if (hVar.d() == ':') {
                if (obj != null) {
                    if (d(obj) == null) {
                        java.lang.Object e17 = hVar.e();
                        if (e17 != null) {
                            e(obj, e17);
                        }
                    } else {
                        throw hVar.f("Duplicate key \"" + obj + "\"");
                    }
                }
                char d18 = hVar.d();
                if (d18 != ',' && d18 != ';') {
                    if (d18 != '}') {
                        throw hVar.f("Expected a ',' or '}'");
                    }
                    return;
                } else if (hVar.d() == '}') {
                    return;
                } else {
                    hVar.a();
                }
            } else {
                throw hVar.f("Expected a ':' after a key");
            }
        }
    }

    public e(java.util.Map map) {
        if (map == null) {
            this.f448702a = new java.util.HashMap();
            return;
        }
        this.f448702a = new java.util.HashMap(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    this.f448702a.put(java.lang.String.valueOf(entry.getKey()), j(value));
                }
            } else {
                throw new java.lang.NullPointerException("Null key.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0115 A[Catch: IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0129, TRY_LEAVE, TryCatch #0 {IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0129, blocks: (B:34:0x010d, B:36:0x0115, B:38:0x0124, B:38:0x0124, B:38:0x0124), top: B:33:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq5.e.<init>(java.lang.Object):void");
    }
}
