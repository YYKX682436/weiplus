package j65;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: c, reason: collision with root package name */
    public static j65.v f297978c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f297979d = "";

    /* renamed from: e, reason: collision with root package name */
    public static boolean f297980e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f297981f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f297982g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static volatile j65.w f297983h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile j65.o f297984i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile j65.u f297985j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile j65.w f297986k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile j65.o f297987l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile j65.u f297988m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f297989a = false;

    /* renamed from: b, reason: collision with root package name */
    public j65.b f297990b = null;

    public v(android.content.res.AssetManager assetManager) {
    }

    public static void a() {
        if (f297983h != null) {
            j65.w wVar = f297983h;
            android.util.SparseIntArray sparseIntArray = wVar.f297993a;
            if (sparseIntArray != null) {
                sparseIntArray.clear();
            }
            if (wVar.f297994b != null) {
                wVar.f297994b = null;
            }
            f297983h = null;
        }
        if (f297984i != null) {
            j65.o oVar = f297984i;
            android.util.SparseArray sparseArray = oVar.f297969a;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            if (oVar.f297970b != null) {
                oVar.f297970b = null;
            }
            f297984i = null;
        }
        if (f297985j != null) {
            j65.u uVar = f297985j;
            android.util.SparseArray sparseArray2 = uVar.f297976a;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            }
            if (uVar.f297977b != null) {
                uVar.f297977b = null;
            }
            f297985j = null;
        }
        if (f297986k != null) {
            j65.w wVar2 = f297986k;
            android.util.SparseIntArray sparseIntArray2 = wVar2.f297993a;
            if (sparseIntArray2 != null) {
                sparseIntArray2.clear();
            }
            if (wVar2.f297994b != null) {
                wVar2.f297994b = null;
            }
            f297986k = null;
        }
        if (f297987l != null) {
            j65.o oVar2 = f297987l;
            android.util.SparseArray sparseArray3 = oVar2.f297969a;
            if (sparseArray3 != null) {
                sparseArray3.clear();
            }
            if (oVar2.f297970b != null) {
                oVar2.f297970b = null;
            }
            f297987l = null;
        }
        if (f297988m != null) {
            j65.u uVar2 = f297988m;
            android.util.SparseArray sparseArray4 = uVar2.f297976a;
            if (sparseArray4 != null) {
                sparseArray4.clear();
            }
            if (uVar2.f297977b != null) {
                uVar2.f297977b = null;
            }
            f297988m = null;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        return com.tencent.mm.sdk.platformtools.v8.a(com.tencent.mm.sdk.platformtools.z.f193112h) ? context.getString(com.tencent.mm.R.string.f489995hx) : "";
    }

    public static j65.v c(android.content.res.AssetManager assetManager) {
        j65.v vVar;
        synchronized (j65.v.class) {
            if (f297978c == null) {
                f297978c = new j65.v(assetManager);
            }
            vVar = f297978c;
        }
        return vVar;
    }

    public static j65.v f(android.content.Context context, java.lang.String str) {
        java.util.Locale locale;
        if (context.getResources() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.language.StringResouces", "the resource is null! why?");
            return null;
        }
        final android.content.res.AssetManager a17 = fp.q.a();
        if (a17 != null) {
            c(a17).getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.equalsIgnoreCase("language_default")) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                com.tencent.mm.sdk.platformtools.m2.u(context, locale2);
                locale = locale2;
            } else {
                locale = com.tencent.mm.sdk.platformtools.m2.s(str);
            }
            java.lang.String locale3 = locale.toString();
            c(a17).getClass();
            boolean z17 = !com.tencent.mm.sdk.platformtools.m2.f192847a.contains(locale3);
            f297980e = z17;
            if (z17) {
                final j65.v c17 = c(a17);
                c17.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(locale3)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.language.StringResouces", "local is null.");
                } else if (locale3.equals(f297979d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.language.StringResouces", "local no change. local is :%s", locale3);
                } else if (fp.q.b("strings")) {
                    int indexOf = locale3.indexOf("_");
                    if (indexOf > 0) {
                        java.lang.String substring = locale3.substring(0, indexOf);
                        if (!substring.equalsIgnoreCase("zh")) {
                            locale3 = substring;
                        }
                    }
                    a();
                    f297979d = locale3;
                    ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: j65.v$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            j65.v vVar = j65.v.this;
                            vVar.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.language.StringResouces", "Init strings async.");
                            vVar.i(a17, j65.v.f297979d);
                            vVar.h(j65.v.f297979d);
                        }
                    });
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.language.StringResouces", "expansions is not yet installed, skip");
                }
                return c(a17);
            }
            a();
            f297979d = locale3;
        }
        return null;
    }

    public java.lang.String d(int i17, int i18) {
        java.lang.String a17;
        if (f297984i == null) {
            i(fp.q.a(), f297979d);
        }
        if (f297984i != null && (a17 = f297984i.a(i17, i18, new java.lang.Object[0])) != null) {
            return a17;
        }
        if (f297987l == null) {
            h(f297979d);
        }
        if (f297987l != null) {
            return f297987l.a(i17, i18, new java.lang.Object[0]);
        }
        return null;
    }

    public java.lang.String e(int i17) {
        java.lang.String a17;
        if (f297983h == null) {
            i(fp.q.a(), f297979d);
        }
        if (f297983h != null && (a17 = f297983h.a(i17)) != null) {
            return a17;
        }
        if (f297986k == null) {
            h(f297979d);
        }
        if (f297986k != null) {
            return f297986k.a(i17);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.res.AssetManager r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.v.g(android.content.res.AssetManager, java.lang.String):void");
    }

    public final void h(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (f297982g) {
            j(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.language.StringResouces", "lazyInitBaseUDRStringsLocked spent = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void i(android.content.res.AssetManager assetManager, java.lang.String str) {
        if (f297983h == null && !this.f297989a) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (f297981f) {
                g(assetManager, str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.language.StringResouces", "lazyInitStringsLocked spent = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if ((r2 != null && ((kotlinx.coroutines.a) r2).a()) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.v.j(java.lang.String):void");
    }
}
