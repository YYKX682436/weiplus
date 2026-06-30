package cy5;

/* loaded from: classes13.dex */
public abstract class y extends cy5.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class f224924b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f224925c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f224926d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final android.webkit.ValueCallback f224927e = new cy5.u(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.webkit.ValueCallback f224928f = new cy5.v(this);

    public static void v(cy5.y yVar) {
        android.content.SharedPreferences d17 = by5.d4.d(yVar.m());
        if (d17 == null) {
            by5.c4.c(yVar.m(), "recordEnv sp is null");
            return;
        }
        android.content.SharedPreferences.Editor edit = d17.edit();
        if (edit == null) {
            by5.c4.c(yVar.m(), "recordEnv sp is null");
        } else {
            edit.putString("lastEnvInfo", yVar.z());
            edit.commit();
        }
    }

    public java.lang.String A(int i17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            by5.c4.c(m(), "getDexDir, versionDir is empty");
            return "";
        }
        return o17 + java.io.File.separator + com.tencent.tinker.loader.shareutil.ShareConstants.DEX_PATH;
    }

    public abstract java.lang.String B();

    public abstract int C(int i17);

    public abstract java.lang.String D();

    public com.tencent.xweb.p1 E(java.util.HashMap hashMap) {
        java.lang.Class cls = this.f224924b;
        if (cls == null) {
            by5.c4.c(m(), "getViewStatus error, loadedReaderClass is null");
            return null;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("getViewStatus", java.util.HashMap.class);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, hashMap);
            if (invoke instanceof java.util.HashMap) {
                java.util.HashMap hashMap2 = (java.util.HashMap) invoke;
                java.lang.Object obj = hashMap2.get("get_index");
                java.lang.Object obj2 = hashMap2.get("get_zoom");
                java.lang.Object obj3 = hashMap2.get("get_x");
                java.lang.Object obj4 = hashMap2.get("get_y");
                if ((obj instanceof java.lang.Integer) && (obj2 instanceof java.lang.Float) && (obj3 instanceof java.lang.Integer) && (obj4 instanceof java.lang.Integer)) {
                    return new com.tencent.xweb.p1(((java.lang.Integer) obj).intValue(), ((java.lang.Float) obj2).floatValue(), ((java.lang.Integer) obj3).intValue(), ((java.lang.Integer) obj4).intValue());
                }
                by5.c4.c(m(), "getViewStatus error, value invalid");
            }
            return null;
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "getViewStatus error: " + th6);
            return null;
        }
    }

    public final java.lang.String F(java.lang.ClassLoader classLoader) {
        java.lang.Class<?> cls;
        try {
            if (classLoader != null) {
                cls = classLoader.loadClass(B());
            } else {
                w();
                cls = this.f224925c;
            }
            java.lang.reflect.Method method = cls.getMethod("getSupportFormats", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.String str = (java.lang.String) method.invoke(null, new java.lang.Object[0]);
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "loadSupportFormatsFromPlugin error: " + th6);
            return "";
        }
    }

    public void G(android.webkit.ValueCallback valueCallback, int i17) {
        int i18 = this.f224879a;
        if (i18 > 0 && (i17 == -3 || i17 == -13)) {
            synchronized (this) {
                this.f224924b = null;
                this.f224925c = null;
                this.f224926d = -1;
            }
            by5.c4.c(m(), "invoke error or abi not match, abandon current version " + i18);
            java.lang.String o17 = o(i18);
            u(-1, true);
            if (o17 != null && !o17.isEmpty()) {
                by5.u.h(o17);
            }
        }
        if (valueCallback != null) {
            valueCallback.onReceiveValue(java.lang.Integer.valueOf(i17));
        }
    }

    public boolean H(java.util.HashMap hashMap, android.app.Activity activity, android.view.ViewGroup viewGroup, android.webkit.ValueCallback valueCallback, android.webkit.ValueCallback valueCallback2) {
        boolean z17;
        if (hashMap == null || activity == null || viewGroup == null) {
            by5.c4.c(m(), "readFile params is null");
            G(valueCallback2, -5);
            return false;
        }
        java.lang.String str = (java.lang.String) hashMap.get("file_ext");
        if (str == null || str.isEmpty()) {
            by5.c4.c(m(), "readFile fileExt is null");
            G(valueCallback2, -5);
            return false;
        }
        int i17 = this.f224879a;
        if (i17 <= 0) {
            by5.c4.c(m(), "readFile plugin not installed");
            G(valueCallback2, -2);
            return false;
        }
        int C = C(valueCallback != null ? 1 : 0);
        if (i17 < C) {
            by5.c4.c(m(), "readFile plugin version is too old, require: " + C);
            G(valueCallback2, -11);
            return false;
        }
        by5.c4.f(m(), "readFile by xweb, plugin version " + i17);
        if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equalsIgnoreCase(m())) {
            t(i17, 1068, 100, 150);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equalsIgnoreCase(m())) {
            t(i17, 1071, 100, 150);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equalsIgnoreCase(m())) {
            t(i17, 1069, 100, 150);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equalsIgnoreCase(m())) {
            t(i17, 1070, 100, 150);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equalsIgnoreCase(m())) {
            t(i17, 1544, 100, 150);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equalsIgnoreCase(m())) {
            t(i17, 1889, 100, 150);
        } else {
            by5.c4.c(m(), "unknown report id");
        }
        try {
            android.content.SharedPreferences d17 = by5.d4.d(m());
            if (d17 == null) {
                by5.c4.c(m(), "recordEnv sp is null");
                z17 = true;
            } else {
                z17 = !z().equals(d17.getString("lastEnvInfo", ""));
            }
            if (z17) {
                by5.c4.f(m(), "readFile, env changed");
            }
            hashMap.put("env_changed", java.lang.String.valueOf(z17));
            hashMap.put("cache_dir", n(i17));
            hashMap.put("res_dir", h(i17));
            hashMap.put("plugin_version", java.lang.String.valueOf(i17));
            w();
            android.webkit.ValueCallback valueCallback3 = this.f224928f;
            android.webkit.ValueCallback valueCallback4 = this.f224927e;
            if (valueCallback != null) {
                java.lang.reflect.Method method = this.f224924b.getMethod("readFile", android.app.Activity.class, android.view.ViewGroup.class, java.lang.ClassLoader.class, java.util.HashMap.class, android.webkit.ValueCallback.class, android.webkit.ValueCallback.class, android.webkit.ValueCallback.class, android.webkit.ValueCallback.class);
                method.setAccessible(true);
                com.tencent.xweb.g.c(str);
                method.invoke(null, activity, viewGroup, this.f224924b.getClassLoader(), hashMap, valueCallback, valueCallback4, valueCallback3, new cy5.w(this, str, valueCallback2));
                return true;
            }
            java.lang.reflect.Method method2 = this.f224924b.getMethod("readFile", android.app.Activity.class, android.view.ViewGroup.class, java.lang.ClassLoader.class, java.util.HashMap.class, android.webkit.ValueCallback.class, android.webkit.ValueCallback.class, android.webkit.ValueCallback.class);
            method2.setAccessible(true);
            com.tencent.xweb.g.c(str);
            method2.invoke(null, activity, viewGroup, this.f224924b.getClassLoader(), hashMap, valueCallback4, valueCallback3, new cy5.x(this, str, valueCallback2));
            return true;
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "readFile error: " + th6);
            com.tencent.xweb.n.l(m() + "_" + str, i17, "invoke error ", th6);
            G(valueCallback2, -3);
            return false;
        }
    }

    public boolean I(java.util.HashMap hashMap) {
        java.lang.Class cls = this.f224924b;
        if (cls == null) {
            by5.c4.c(m(), "requestThumbnail error, loadedReaderClass is null");
            return false;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("requestThumbnail", java.util.HashMap.class);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, hashMap);
            if (invoke instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) invoke).booleanValue();
            }
            return false;
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "requestThumbnail error: " + th6);
            return false;
        }
    }

    public final boolean J(java.lang.String str) {
        if (org.xwalk.core.XWalkEnvironment.f347970c == null) {
            by5.c4.c(m(), "saveSupportFormats, context is null");
            return false;
        }
        android.content.SharedPreferences d17 = by5.d4.d(m());
        if (d17 == null) {
            by5.c4.c(m(), "saveSupportFormats, sp is null");
            return false;
        }
        android.content.SharedPreferences.Editor edit = d17.edit();
        edit.putString("supportFormats", str);
        boolean commit = edit.commit();
        by5.c4.f(m(), "loadSupportFormat, ret = " + commit + ", formats: " + str);
        return commit;
    }

    public boolean K(java.util.HashMap hashMap) {
        java.lang.Class cls = this.f224924b;
        if (cls == null) {
            by5.c4.c(m(), "setViewToStatus error, loadedReaderClass is null");
            return false;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("setViewToStatus", java.util.HashMap.class);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, hashMap);
            if (invoke instanceof java.lang.Boolean) {
                return ((java.lang.Boolean) invoke).booleanValue();
            }
            return false;
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "setViewToStatus error: " + th6);
            return false;
        }
    }

    @Override // cy5.h
    public void b() {
        int i17 = this.f224879a;
        if (i17 < 0) {
            by5.c4.f(m(), "checkFiles, not installed");
            return;
        }
        int a17 = a(i17, true, "");
        if (a17 != 0) {
            by5.c4.c(m(), "checkFiles failed, abandon version " + i17);
            java.lang.String m17 = m();
            if (by5.s0.f36595c != null) {
                if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equals(m17)) {
                    by5.s0.f36595c.b(1068L, 66L, 1L);
                } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equals(m17)) {
                    by5.s0.f36595c.b(1071L, 66L, 1L);
                } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equals(m17)) {
                    by5.s0.f36595c.b(1069L, 66L, 1L);
                } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equals(m17)) {
                    by5.s0.f36595c.b(1070L, 66L, 1L);
                } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equals(m17)) {
                    by5.s0.f36595c.b(1544L, 66L, 1L);
                } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equals(m17)) {
                    by5.s0.f36595c.b(1889L, 66L, 1L);
                }
            }
            xx5.b.a(2, m(), i17, a17, "");
            java.lang.String o17 = o(i17);
            u(-1, true);
            if (o17 == null || o17.isEmpty()) {
                return;
            }
            by5.u.h(o17);
        }
    }

    @Override // cy5.h
    public java.lang.String g(int i17, boolean z17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            return "";
        }
        if (z17) {
            return o17 + java.io.File.separator + m() + ".patch";
        }
        return o17 + java.io.File.separator + m() + ".zip";
    }

    @Override // cy5.h
    public java.util.List j(int i17) {
        java.lang.String y17 = y(i17);
        if (y17 == null || y17.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(y17);
        return arrayList;
    }

    @Override // cy5.h
    public boolean q() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00cb, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00ef, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00fa, code lost:
    
        if (r3.exists() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0109, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0106, code lost:
    
        r3.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0104, code lost:
    
        if (r3.exists() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x012e, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        r3.delete();
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x012e -> B:8:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x012e -> B:9:0x005b). Please report as a decompilation issue!!! */
    @Override // cy5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int s(by5.n0 r21) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy5.y.s(by5.n0):int");
    }

    public void w() {
        synchronized (this) {
            int f17 = f(true);
            if (this.f224924b == null || this.f224925c == null || this.f224926d != f17) {
                by5.c4.f(m(), "load class of version " + f17);
                java.lang.ClassLoader a17 = com.tencent.xweb.u1.a(y(f17), A(f17), h(f17));
                this.f224924b = a17.loadClass(D());
                this.f224925c = a17.loadClass(B());
                this.f224926d = f17;
            }
        }
    }

    public void x(java.util.HashMap hashMap) {
        java.lang.Class cls = this.f224924b;
        if (cls == null) {
            by5.c4.c(m(), "finishReadFile error, loadedReaderClass is null");
            return;
        }
        try {
            java.lang.reflect.Method method = cls.getMethod("finishReadFile", java.util.HashMap.class);
            method.setAccessible(true);
            method.invoke(null, hashMap);
        } catch (java.lang.Throwable th6) {
            by5.c4.c(m(), "finishReadFile error: " + th6);
        }
    }

    public abstract java.lang.String y(int i17);

    public final java.lang.String z() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("display_");
        sb6.append(android.os.Build.DISPLAY);
        sb6.append(",sdk_");
        sb6.append(android.os.Build.VERSION.SDK_INT);
        sb6.append(",release_");
        sb6.append(android.os.Build.VERSION.RELEASE);
        sb6.append(",client_");
        android.os.Bundle bundle = org.xwalk.core.XWalkEnvironment.f347981n;
        synchronized (bundle) {
            i17 = bundle.getInt("clientVersion", 0);
        }
        sb6.append(i17);
        return sb6.toString();
    }
}
