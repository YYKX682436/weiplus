package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class x3 {
    public static final java.util.Map M = new java.util.LinkedHashMap();
    public final java.lang.String A;
    public final java.lang.String B;
    public final java.lang.String C;
    public final java.lang.String D;
    public final java.lang.String E;
    public final java.lang.String F;
    public final java.lang.String G;
    public final java.lang.String H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f187640J;
    public final java.lang.String K;
    public java.lang.String L;

    /* renamed from: a, reason: collision with root package name */
    public db5.t4 f187641a;

    /* renamed from: b, reason: collision with root package name */
    public int f187642b;

    /* renamed from: c, reason: collision with root package name */
    public int f187643c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f187644d;

    /* renamed from: e, reason: collision with root package name */
    public long f187645e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f187646f;

    /* renamed from: g, reason: collision with root package name */
    public rv.n2 f187647g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f187648h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f187649i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f187650j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187651k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.List f187652l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f187653m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f187654n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f187655o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f187656p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f187657q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f187658r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f187659s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f187660t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f187661u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f187662v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f187663w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f187664x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f187665y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f187666z;

    public x3(com.tencent.mm.plugin.webview.ui.tools.c6 menuHelperParam) {
        kotlin.jvm.internal.o.g(menuHelperParam, "menuHelperParam");
        this.f187644d = "MicroMsg.WebViewBizCustomBottomSheetHelper";
        this.f187646f = true;
        this.f187648h = new java.util.ArrayList();
        this.f187651k = new java.lang.ref.WeakReference(menuHelperParam);
        this.f187652l = new java.util.LinkedList();
        this.f187653m = new java.util.LinkedList();
        this.f187654n = new java.util.LinkedList();
        this.f187655o = "client:SendAppMessage";
        this.f187656p = "client:ShareTimeline";
        this.f187657q = "client:ToggleStar";
        this.f187658r = "client:AddFav";
        this.f187659s = "client:WebSearch";
        this.f187660t = "client:OpenOnPC";
        this.f187661u = "client:OpenInWeRead";
        this.f187662v = "client:OpenInWeBrowser";
        this.f187663w = "client:SendByMail";
        this.f187664x = "client:UseOtherAppAndWeApp";
        this.f187665y = "client:OpenInWeApp";
        this.f187666z = "client:AddFloatWindow";
        this.A = "client:ListenArticle";
        this.B = "client:ListenLater";
        this.C = "client:SaveAsImage";
        this.D = "client:CopyLink";
        this.E = "client:Refresh";
        this.F = "client:SearchInPage";
        this.G = "client:AdjustFont";
        this.H = "client:ShareQQ";
        this.I = "client:ShareQZone";
        this.f187640J = "client:Complain";
        this.K = "client:Translate";
    }

    public final boolean a(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.c6 f17 = f();
        return f17 != null && f17.m(i17);
    }

    public final boolean b(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.c6 f17 = f();
        return f17 != null && f17.n(i17);
    }

    public final void c(java.lang.String eventType, android.view.MenuItem menuItem) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI g17 = g();
        if (g17 == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", eventType);
        java.lang.String str = "";
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            java.lang.String str2 = (java.lang.String) ((java.util.LinkedHashMap) M).get(java.lang.Integer.valueOf(itemId));
            if (str2 != null) {
                str = str2;
            }
        }
        hashMap.put(dm.i4.COL_ID, str);
        hashMap.put("shareScene", java.lang.Integer.valueOf(this.f187643c));
        if (kotlin.jvm.internal.o.b(eventType, "click") && menuItem != null && (menuItem instanceof db5.h4)) {
            hashMap.put("isDisabled", java.lang.Boolean.valueOf(((db5.h4) menuItem).f228375s));
        }
        hashMap.toString();
        g17.f183844p0.o("onBizCustomSharePanelEvent", hashMap);
    }

    public final void d() {
        java.util.List list = this.f187648h;
        ((java.util.ArrayList) list).clear();
        java.util.Map map = M;
        ((java.util.LinkedHashMap) map).clear();
        java.util.List list2 = this.f187650j;
        java.lang.String str = this.f187644d;
        if (list2 != null) {
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    rv.b j17 = j((java.util.Map) it.next());
                    if (j17 != null) {
                        ((java.util.ArrayList) list).add(j17);
                    }
                }
            }
            this.f187649i = !list.isEmpty();
            com.tencent.mars.xlog.Log.i(str, "generate panel action groups from parsed data: " + ((java.util.ArrayList) list).size() + " groups");
            return;
        }
        java.lang.String str2 = this.L;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.i(str, "actionsString is empty, skip parsing");
            this.f187649i = false;
            return;
        }
        java.util.List k17 = k(this.L);
        if (k17 != null) {
            java.util.Iterator it6 = k17.iterator();
            while (it6.hasNext()) {
                rv.b j18 = j((java.util.Map) it6.next());
                if (j18 != null) {
                    ((java.util.ArrayList) list).add(j18);
                }
            }
        }
        this.f187649i = !list.isEmpty();
        com.tencent.mars.xlog.Log.i(str, "update panel info complete with " + ((java.util.ArrayList) list).size() + " action groups, dynamic mappings: " + map.size());
    }

    public final android.graphics.drawable.Drawable e(java.lang.String base64String, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI g17 = g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w(this.f187644d, "getDrawableWithSVGLibrary activity is null");
            return null;
        }
        rv.o2 o2Var = (rv.o2) i95.n0.c(rv.o2.class);
        if (o2Var == null) {
            return null;
        }
        java.lang.String str = ((yq1.a) o2Var).f464420d;
        kotlin.jvm.internal.o.g(base64String, "base64String");
        try {
            byte[] decode = android.util.Base64.decode(base64String, 0);
            kotlin.jvm.internal.o.d(decode);
            s7.t2 g18 = new s7.r3().g(new java.io.ByteArrayInputStream(new java.lang.String(decode, r26.c.f368865a).getBytes()), true);
            if (g18 == null) {
                return null;
            }
            int i18 = (int) (i17 * g17.getResources().getDisplayMetrics().density);
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/BizCustomBottomSheetService", "getDrawableWithSVGLibrary", "(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/brandservice/BizCustomBottomSheetService", "getDrawableWithSVGLibrary", "(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            float f17 = i18;
            g18.j(f17);
            g18.i(f17);
            g18.f(canvas);
            return new android.graphics.drawable.BitmapDrawable(g17.getResources(), createBitmap);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.e(str, "Invalid Base64 string", e17);
            return null;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e(str, "Error processing SVG", e18);
            return null;
        }
    }

    public final com.tencent.mm.plugin.webview.ui.tools.c6 f() {
        return (com.tencent.mm.plugin.webview.ui.tools.c6) this.f187651k.get();
    }

    public final com.tencent.mm.plugin.webview.ui.tools.WebViewUI g() {
        com.tencent.mm.plugin.webview.ui.tools.c6 f17 = f();
        if (f17 != null) {
            return f17.c();
        }
        return null;
    }

    public final boolean h(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17;
        com.tencent.mm.plugin.webview.ui.tools.c6 f17 = f();
        com.tencent.mm.protocal.JsapiPermissionWrapper C7 = (f17 == null || (c17 = f17.c()) == null) ? null : c17.C7();
        com.tencent.mm.plugin.webview.ui.tools.c6 f18 = f();
        return f18 != null && f18.z(C7, i17);
    }

    public final boolean i() {
        rv.n2 n2Var = this.f187647g;
        return n2Var != null && ((ss1.d) ((jz5.n) ((qs1.m) n2Var).f366233f).getValue()).d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0235, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r0, ((yg0.q2) ((zg0.t2) i95.n0.c(zg0.t2.class))).wi(r13, r4.v7())) == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0cb0 A[Catch: IllegalArgumentException -> 0x0cb9, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x0cb9, blocks: (B:138:0x0ca2, B:106:0x0cb0), top: B:137:0x0ca2 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0cd5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0cf5 A[Catch: IllegalArgumentException -> 0x0d04, TryCatch #0 {IllegalArgumentException -> 0x0d04, blocks: (B:128:0x0ce7, B:115:0x0cf5, B:116:0x0cfe, B:126:0x0cfa), top: B:127:0x0ce7 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0d36  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0cfa A[Catch: IllegalArgumentException -> 0x0d04, TryCatch #0 {IllegalArgumentException -> 0x0d04, blocks: (B:128:0x0ce7, B:115:0x0cf5, B:116:0x0cfe, B:126:0x0cfa), top: B:127:0x0ce7 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0ce7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0ca2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0d8d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0bd1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rv.b j(java.util.Map r50) {
        /*
            Method dump skipped, instructions count: 3510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.x3.j(java.util.Map):rv.b");
    }

    public final java.util.List k(java.lang.String str) {
        int i17;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object obj = jSONObject.get(next);
                    if ((obj instanceof org.json.JSONArray) && kotlin.jvm.internal.o.b(next, "items")) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int length2 = ((org.json.JSONArray) obj).length();
                        int i19 = 0;
                        while (i19 < length2) {
                            org.json.JSONObject jSONObject2 = ((org.json.JSONArray) obj).getJSONObject(i19);
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                java.lang.String next2 = keys2.next();
                                kotlin.jvm.internal.o.d(next2);
                                java.lang.Object obj2 = jSONObject2.get(next2);
                                kotlin.jvm.internal.o.f(obj2, "get(...)");
                                linkedHashMap2.put(next2, obj2);
                                length = length;
                            }
                            arrayList2.add(linkedHashMap2);
                            i19++;
                            length = length;
                        }
                        i17 = length;
                        kotlin.jvm.internal.o.d(next);
                        linkedHashMap.put(next, arrayList2);
                    } else {
                        i17 = length;
                        kotlin.jvm.internal.o.d(next);
                        kotlin.jvm.internal.o.d(obj);
                        linkedHashMap.put(next, obj);
                    }
                    length = i17;
                }
                int i27 = length;
                arrayList.add(linkedHashMap);
                i18++;
                length = i27;
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f187644d, "Failed to parse actions JSON string: " + e17.getMessage());
            return null;
        }
    }

    public final boolean l(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17;
        com.tencent.mm.plugin.webview.ui.tools.c6 f17 = f();
        com.tencent.mm.protocal.JsapiPermissionWrapper C7 = (f17 == null || (c17 = f17.c()) == null) ? null : c17.C7();
        com.tencent.mm.plugin.webview.ui.tools.c6 f18 = f();
        return f18 != null && f18.f0(C7, i17);
    }

    public final void m(long j17, int i17, int i18) {
        android.app.Dialog dialog;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        android.view.Window window4;
        android.view.Window window5;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI g17 = g();
        java.lang.String str = this.f187644d;
        if (g17 == null) {
            com.tencent.mars.xlog.Log.i(str, "showBizCustomBottomSheet: activity is null");
            return;
        }
        this.f187645e = j17;
        this.f187642b = i17;
        this.f187643c = i18;
        java.util.List list = this.f187652l;
        ((java.util.LinkedList) list).clear();
        java.util.List list2 = this.f187653m;
        ((java.util.LinkedList) list2).clear();
        java.util.List list3 = this.f187654n;
        ((java.util.LinkedList) list3).clear();
        this.f187646f = true;
        this.f187641a = new com.tencent.mm.plugin.webview.ui.tools.t3(this);
        if (this.f187647g == null) {
            ((yq1.a) ((rv.o2) i95.n0.c(rv.o2.class))).getClass();
            this.f187647g = new qs1.m(g17);
        }
        d();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f187648h;
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str, "showBizAuthorMenu: panelActionGroups is null or empty");
            return;
        }
        rv.n2 n2Var = this.f187647g;
        if (n2Var != null) {
            qs1.m mVar = (qs1.m) n2Var;
            android.widget.TextView textView = mVar.f366245r;
            textView.setText("");
            textView.setVisibility(8);
            mVar.f366239l.setVisibility(8);
            android.widget.TextView textView2 = mVar.f366246s;
            textView2.setText("");
            textView2.setVisibility(8);
            mVar.f366240m.setVisibility(8);
            android.widget.TextView textView3 = mVar.f366247t;
            textView3.setText("");
            textView3.setVisibility(8);
            mVar.f366241n.setVisibility(8);
        }
        if (arrayList.size() > 0) {
            com.tencent.mm.plugin.webview.ui.tools.s3 s3Var = new com.tencent.mm.plugin.webview.ui.tools.s3(this, 0, arrayList, list);
            rv.n2 n2Var2 = this.f187647g;
            if (n2Var2 != null) {
                java.lang.String title = ((rv.b) arrayList.get(0)).f399825a;
                qs1.m mVar2 = (qs1.m) n2Var2;
                kotlin.jvm.internal.o.g(title, "title");
                mVar2.f366251x = s3Var;
                android.widget.TextView textView4 = mVar2.f366245r;
                textView4.setText(title);
                textView4.setVisibility(0);
                mVar2.f366239l.setVisibility(0);
            }
        }
        if (arrayList.size() > 1) {
            com.tencent.mm.plugin.webview.ui.tools.s3 s3Var2 = new com.tencent.mm.plugin.webview.ui.tools.s3(this, 1, arrayList, list2);
            rv.n2 n2Var3 = this.f187647g;
            if (n2Var3 != null) {
                java.lang.String title2 = ((rv.b) arrayList.get(1)).f399825a;
                qs1.m mVar3 = (qs1.m) n2Var3;
                kotlin.jvm.internal.o.g(title2, "title");
                mVar3.f366252y = s3Var2;
                android.widget.TextView textView5 = mVar3.f366246s;
                textView5.setText(title2);
                textView5.setVisibility(0);
                mVar3.f366240m.setVisibility(0);
            }
        }
        if (arrayList.size() > 2) {
            com.tencent.mm.plugin.webview.ui.tools.s3 s3Var3 = new com.tencent.mm.plugin.webview.ui.tools.s3(this, 2, arrayList, list3);
            rv.n2 n2Var4 = this.f187647g;
            if (n2Var4 != null) {
                java.lang.String title3 = ((rv.b) arrayList.get(2)).f399825a;
                qs1.m mVar4 = (qs1.m) n2Var4;
                kotlin.jvm.internal.o.g(title3, "title");
                mVar4.f366253z = s3Var3;
                android.widget.TextView textView6 = mVar4.f366247t;
                textView6.setText(title3);
                textView6.setVisibility(0);
                mVar4.f366241n.setVisibility(0);
            }
        }
        if (!i()) {
            db5.t4 t4Var = this.f187641a;
            if (t4Var != null) {
                rv.n2 n2Var5 = this.f187647g;
                if (n2Var5 != null) {
                    ((qs1.m) n2Var5).f366242o.f366213e = t4Var;
                }
                if (n2Var5 != null) {
                    ((qs1.m) n2Var5).f366243p.f366213e = t4Var;
                }
                if (n2Var5 != null) {
                    ((qs1.m) n2Var5).f366244q.f366213e = t4Var;
                }
            }
            rv.n2 n2Var6 = this.f187647g;
            if (n2Var6 != null) {
                ((ss1.d) ((jz5.n) ((qs1.m) n2Var6).f366233f).getValue()).f411894p = new com.tencent.mm.plugin.webview.ui.tools.w3(this);
            }
        }
        rv.n2 n2Var7 = this.f187647g;
        if (n2Var7 != null) {
            qs1.m mVar5 = (qs1.m) n2Var7;
            androidx.recyclerview.widget.RecyclerView recyclerView = mVar5.f366239l;
            java.util.List list4 = recyclerView.H1;
            if (list4 != null) {
                ((java.util.ArrayList) list4).clear();
            }
            androidx.recyclerview.widget.RecyclerView recyclerView2 = mVar5.f366240m;
            java.util.List list5 = recyclerView2.H1;
            if (list5 != null) {
                ((java.util.ArrayList) list5).clear();
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = mVar5.f366241n;
            java.util.List list6 = recyclerView3.H1;
            if (list6 != null) {
                ((java.util.ArrayList) list6).clear();
            }
            recyclerView.i(mVar5.f366248u);
            recyclerView2.i(mVar5.f366249v);
            recyclerView3.i(mVar5.f366250w);
            mVar5.f366238k.setOnScrollChangeListener(new qs1.i(mVar5));
            db5.o4 o4Var = mVar5.f366251x;
            jz5.g gVar = mVar5.f366234g;
            if (o4Var != null) {
                o4Var.onCreateMMMenu((db5.g4) ((jz5.n) gVar).getValue());
            }
            db5.g4 g4Var = (db5.g4) ((jz5.n) gVar).getValue();
            qs1.c cVar = mVar5.f366242o;
            cVar.f366212d = g4Var;
            if (g4Var != null) {
                g4Var.size();
                ((java.lang.Number) ((jz5.n) cVar.f366214f.f366232e).getValue()).intValue();
            }
            cVar.notifyDataSetChanged();
            db5.o4 o4Var2 = mVar5.f366252y;
            jz5.g gVar2 = mVar5.f366235h;
            if (o4Var2 != null) {
                o4Var2.onCreateMMMenu((db5.g4) ((jz5.n) gVar2).getValue());
            }
            db5.g4 g4Var2 = (db5.g4) ((jz5.n) gVar2).getValue();
            qs1.c cVar2 = mVar5.f366243p;
            cVar2.f366212d = g4Var2;
            if (g4Var2 != null) {
                g4Var2.size();
                ((java.lang.Number) ((jz5.n) cVar2.f366214f.f366232e).getValue()).intValue();
            }
            cVar2.notifyDataSetChanged();
            db5.o4 o4Var3 = mVar5.f366253z;
            jz5.g gVar3 = mVar5.f366236i;
            if (o4Var3 != null) {
                o4Var3.onCreateMMMenu((db5.g4) ((jz5.n) gVar3).getValue());
            }
            db5.g4 g4Var3 = (db5.g4) ((jz5.n) gVar3).getValue();
            qs1.c cVar3 = mVar5.f366244q;
            cVar3.f366212d = g4Var3;
            if (g4Var3 != null) {
                g4Var3.size();
                ((java.lang.Number) ((jz5.n) cVar3.f366214f.f366232e).getValue()).intValue();
            }
            cVar3.notifyDataSetChanged();
            mVar5.f366237j.post(new qs1.k(mVar5));
            jz5.g gVar4 = mVar5.f366233f;
            if (((ss1.d) ((jz5.n) gVar4).getValue()).d()) {
                return;
            }
            ss1.d dVar = (ss1.d) ((jz5.n) gVar4).getValue();
            dVar.a();
            dVar.f411888g = dVar.c();
            dVar.f411889h = dVar.b();
            dVar.a().setTranslationY(0.0f);
            if (dVar.f411886e != null) {
                android.view.ViewParent parent = dVar.a().getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).setVisibility(0);
                dVar.a();
                android.view.ViewGroup.LayoutParams layoutParams = dVar.a().getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                boolean z17 = dVar.f411888g;
                android.view.View view = null;
                android.view.View view2 = dVar.f411890i;
                if (z17 && view2 != null) {
                    view2.getWindowVisibleDisplayFrame(new android.graphics.Rect());
                    layoutParams2.width = (int) java.lang.Math.min(r11.right, r11.bottom);
                    layoutParams2.gravity = 1;
                    java.lang.Object parent2 = dVar.a().getParent();
                    if (parent2 instanceof android.view.View) {
                        ((android.view.View) parent2).setOnTouchListener(null);
                    }
                    if ((parent2 instanceof android.view.ViewGroup) && (((android.view.ViewGroup) parent2).getLayoutParams() instanceof androidx.coordinatorlayout.widget.c)) {
                        dVar.e();
                    }
                }
                dVar.a().setLayoutParams(layoutParams2);
                android.app.Dialog dialog2 = dVar.f411886e;
                if (dialog2 != null && (window5 = dialog2.getWindow()) != null) {
                    window5.addFlags(Integer.MIN_VALUE);
                }
                android.app.Dialog dialog3 = dVar.f411886e;
                if (dialog3 != null && (window4 = dialog3.getWindow()) != null) {
                    window4.clearFlags(8);
                }
                android.app.Dialog dialog4 = dVar.f411886e;
                if (dialog4 != null && (window3 = dialog4.getWindow()) != null) {
                    window3.clearFlags(131072);
                }
                android.app.Dialog dialog5 = dVar.f411886e;
                if (dialog5 != null && (window2 = dialog5.getWindow()) != null) {
                    window2.clearFlags(128);
                }
                android.app.Dialog dialog6 = dVar.f411886e;
                if (dialog6 != null && (window = dialog6.getWindow()) != null) {
                    view = window.getDecorView();
                }
                if (view != null) {
                    view.setSystemUiVisibility(0);
                }
                if (view2 != null) {
                    boolean z18 = dVar.f411891m == null;
                    android.view.ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                    dVar.f411891m = viewTreeObserver2;
                    if (z18 && viewTreeObserver2 != null) {
                        viewTreeObserver2.addOnGlobalLayoutListener(dVar);
                    }
                }
                android.view.ViewGroup viewGroup = dVar.f411897s;
                if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnPreDrawListener(new ss1.c(dVar));
                }
                android.content.Context context = dVar.f411885d;
                if (context instanceof android.app.Activity) {
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    if (!((android.app.Activity) context).isFinishing() && (dialog = dVar.f411886e) != null) {
                        dialog.show();
                    }
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = dVar.f411893o;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.f44443p = dVar.f411896r;
                }
            }
        }
    }
}
