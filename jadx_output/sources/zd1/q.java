package zd1;

/* loaded from: classes7.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f471552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f471553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471556h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471557i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f471558m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f471559n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f471560o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f471561p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zd1.s f471562q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.jvm.internal.h0 h0Var, boolean z17, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.f0 f0Var4, int i17, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.y yVar, int i18, zd1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471552d = h0Var;
        this.f471553e = z17;
        this.f471554f = f0Var;
        this.f471555g = f0Var2;
        this.f471556h = f0Var3;
        this.f471557i = f0Var4;
        this.f471558m = i17;
        this.f471559n = appBrandRuntime;
        this.f471560o = yVar;
        this.f471561p = i18;
        this.f471562q = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd1.q(this.f471552d, this.f471553e, this.f471554f, this.f471555g, this.f471556h, this.f471557i, this.f471558m, this.f471559n, this.f471560o, this.f471561p, this.f471562q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zd1.q qVar = (zd1.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float f17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                boolean D0 = com.tencent.mm.sdk.platformtools.x.D0((android.graphics.Bitmap) this.f471552d.f310123d, 100, android.graphics.Bitmap.CompressFormat.JPEG, lp0.b.D() + "AppSnapshot.jpg", false);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("test bitmap path: ");
                sb6.append(lp0.b.D());
                sb6.append("AppSnapshot.jpg, isOk:");
                sb6.append(D0);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb6.toString());
            }
            if (this.f471553e) {
                int i17 = this.f471554f.f310116d + this.f471555g.f310116d;
                java.lang.Object obj2 = this.f471552d.f310123d;
                kotlin.jvm.internal.o.d(obj2);
                if (i17 > ((android.graphics.Bitmap) obj2).getWidth()) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clip fail, x + width:");
                    sb7.append(this.f471554f.f310116d + this.f471555g.f310116d);
                    sb7.append(" snapshot!!.width:");
                    java.lang.Object obj3 = this.f471552d.f310123d;
                    kotlin.jvm.internal.o.d(obj3);
                    sb7.append(((android.graphics.Bitmap) obj3).getWidth());
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb7.toString());
                    kotlin.jvm.internal.f0 f0Var = this.f471555g;
                    java.lang.Object obj4 = this.f471552d.f310123d;
                    kotlin.jvm.internal.o.d(obj4);
                    f0Var.f310116d = ((android.graphics.Bitmap) obj4).getWidth() - this.f471554f.f310116d;
                }
                int i18 = this.f471556h.f310116d + this.f471557i.f310116d;
                java.lang.Object obj5 = this.f471552d.f310123d;
                kotlin.jvm.internal.o.d(obj5);
                if (i18 > ((android.graphics.Bitmap) obj5).getHeight()) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("clip fail, y + height:");
                    sb8.append(this.f471556h.f310116d + this.f471557i.f310116d);
                    sb8.append(" height:");
                    java.lang.Object obj6 = this.f471552d.f310123d;
                    kotlin.jvm.internal.o.d(obj6);
                    sb8.append(((android.graphics.Bitmap) obj6).getHeight());
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb8.toString());
                    kotlin.jvm.internal.f0 f0Var2 = this.f471557i;
                    java.lang.Object obj7 = this.f471552d.f310123d;
                    kotlin.jvm.internal.o.d(obj7);
                    f0Var2.f310116d = ((android.graphics.Bitmap) obj7).getHeight() - this.f471556h.f310116d;
                }
                kotlin.jvm.internal.h0 h0Var = this.f471552d;
                java.lang.Object obj8 = h0Var.f310123d;
                kotlin.jvm.internal.o.d(obj8);
                int i19 = this.f471554f.f310116d;
                int i27 = this.f471556h.f310116d;
                int i28 = this.f471555g.f310116d;
                int i29 = this.f471557i.f310116d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i29));
                arrayList.add(java.lang.Integer.valueOf(i28));
                arrayList.add(java.lang.Integer.valueOf(i27));
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add((android.graphics.Bitmap) obj8);
                java.lang.Object obj9 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj9, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/security/JsApiSetAppSnapshotStrategy$invoke$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj9, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/security/JsApiSetAppSnapshotStrategy$invoke$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                h0Var.f310123d = createBitmap;
            }
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                boolean D02 = com.tencent.mm.sdk.platformtools.x.D0((android.graphics.Bitmap) this.f471552d.f310123d, 100, android.graphics.Bitmap.CompressFormat.JPEG, lp0.b.D() + "AppSnapshot_After.jpg", false);
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("test bitmap path: ");
                sb9.append(lp0.b.D());
                sb9.append("AppSnapshot_After.jpg, isOk:");
                sb9.append(D02);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb9.toString());
            }
            int i37 = this.f471558m;
            if (i37 > 0) {
                float f18 = i37;
                java.lang.Object obj10 = this.f471552d.f310123d;
                kotlin.jvm.internal.o.d(obj10);
                int width = ((android.graphics.Bitmap) obj10).getWidth();
                kotlin.jvm.internal.o.d(this.f471552d.f310123d);
                f17 = f18 / java.lang.Math.min(width, ((android.graphics.Bitmap) r10).getHeight());
            } else {
                f17 = 1.0f;
            }
            zd1.d dVar = zd1.e.f471530i;
            if (f17 >= 1.0f) {
                java.lang.Object obj11 = this.f471552d.f310123d;
                kotlin.jvm.internal.o.d(obj11);
                com.tencent.mm.plugin.appbrand.e9 C0 = this.f471559n.C0();
                kotlin.jvm.internal.o.f(C0, "getService(...)");
                dVar.a((android.graphics.Bitmap) obj11, C0, false);
            } else {
                android.graphics.Bitmap F0 = com.tencent.mm.sdk.platformtools.x.F0((android.graphics.Bitmap) this.f471552d.f310123d, f17, f17, true);
                if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                    boolean D03 = com.tencent.mm.sdk.platformtools.x.D0(F0, 100, android.graphics.Bitmap.CompressFormat.JPEG, lp0.b.D() + "AppSnapshot_After_Scale.jpg", false);
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("test bitmap path: ");
                    sb10.append(lp0.b.D());
                    sb10.append("AppSnapshot_After.jpg, isOk:");
                    sb10.append(D03);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb10.toString());
                }
                if (F0 != null && !F0.isRecycled()) {
                    com.tencent.mm.plugin.appbrand.e9 C02 = this.f471559n.C0();
                    kotlin.jvm.internal.o.f(C02, "getService(...)");
                    dVar.a(F0, C02, true);
                }
            }
            com.tencent.mm.plugin.appbrand.y yVar = this.f471560o;
            int i38 = this.f471561p;
            zd1.s sVar = this.f471562q;
            sVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i38, sVar.u(str, jSONObject));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", "scale and dispatch bitmap for " + this.f471559n.f74803n + ", get exception:" + e18);
            com.tencent.mm.plugin.appbrand.y yVar2 = this.f471560o;
            int i39 = this.f471561p;
            zd1.s sVar2 = this.f471562q;
            sVar2.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar2.a(i39, sVar2.u(str4, jSONObject2));
        }
        return jz5.f0.f302826a;
    }
}
