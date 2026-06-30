package cr1;

/* loaded from: classes11.dex */
public final class g implements com.tencent.mm.pluginsdk.ui.j1, com.tencent.mm.pluginsdk.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f221841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f221842e;

    public g(com.tencent.mm.pluginsdk.ui.j1 wxAvatarDrawableLoader) {
        kotlin.jvm.internal.o.g(wxAvatarDrawableLoader, "wxAvatarDrawableLoader");
        this.f221841d = wxAvatarDrawableLoader;
        this.f221842e = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        android.util.Pair b17 = b(tag);
        java.lang.Object second = b17.second;
        kotlin.jvm.internal.o.f(second, "second");
        if (((java.lang.Boolean) second).booleanValue()) {
            return Zg(tag, 0, 0, 0);
        }
        return this.f221841d.W0((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        if (!(drawable instanceof kv.e0)) {
            com.tencent.mars.xlog.Log.w("BizFans.BizFansAvatarInterceptor", "[watch] drawable is not IAvatarStorage.IOnAvatarChanged, tag=" + drawable.f190901m);
            return;
        }
        java.lang.String str = drawable.f190901m;
        kotlin.jvm.internal.o.f(str, "getTag(...)");
        android.util.Pair b17 = b(str);
        java.lang.Boolean bool = (java.lang.Boolean) b17.second;
        java.lang.String str2 = (java.lang.String) b17.first;
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue()) {
            drawable.f190903o = new cr1.f(str2, drawable);
            this.f221841d.X9(drawable);
            return;
        }
        synchronized (this.f221842e) {
            ((java.util.ArrayList) this.f221842e).add(new java.lang.ref.WeakReference(drawable));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String tag, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(tag, "tag");
        if (!com.tencent.mm.storage.z3.E3(tag) && !com.tencent.mm.storage.z3.G3(tag)) {
            return this.f221841d.Zg(tag, i17, i18, i19);
        }
        int i27 = com.tencent.mm.storage.z3.G3(tag) ? 5 : 0;
        com.tencent.mars.xlog.Log.i("BizFans.BizFansAvatarInterceptor", "[loadHdBitmap] biz fans session detected, tag=" + tag + ", serviceType=" + i27);
        i95.m c17 = i95.n0.c(zq1.u.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        hr1.a eb6 = zq1.u.eb((zq1.u) c17, tag, i27, 0, 4, null);
        if (eb6 != null) {
            java.lang.String str = eb6.field_headImgUrl;
            vo0.d dVar = cr1.k.f221848a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) cr1.k.f221848a.a(new cr1.a(str)).e();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        } else {
            com.tencent.mars.xlog.Log.i("BizFans.BizFansAvatarInterceptor", "[loadHdBitmap] local contact not found, will fetch from network, tag=".concat(tag));
        }
        zq1.u uVar = (zq1.u) i95.n0.c(zq1.u.class);
        cr1.e eVar = new cr1.e(tag, this);
        br1.m mVar = (br1.m) uVar;
        mVar.getClass();
        boolean z17 = tag.length() == 0;
        java.lang.String str2 = mVar.f23622d;
        if (z17) {
            com.tencent.mars.xlog.Log.e(str2, "getContact error, openid is null");
            br1.w.c(eVar, false, i27, null, 4, null);
            return null;
        }
        hr1.a eb7 = zq1.u.eb(mVar, tag, i27, 0, 4, null);
        if (eb7 != null) {
            eVar.b(true, i27, eb7);
            return null;
        }
        if (tag.length() == 0) {
            com.tencent.mars.xlog.Log.e(str2, "getSvrContact error, openid is null");
            br1.w.c(eVar, false, 0, null, 4, null);
            return null;
        }
        int i28 = r26.i0.n(tag, "@picfansmsg", false) ? 5 : 0;
        if (mVar.Ni(i28).a(tag, i28, java.lang.Boolean.TRUE)) {
            mVar.Di().putIfAbsent(tag, eVar);
            return null;
        }
        com.tencent.mars.xlog.Log.e(str2, "getSvrContact error, enqueue openId failed: ".concat(tag));
        br1.w.c(eVar, false, i28, null, 4, null);
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k1
    public boolean a(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.Boolean bool = (java.lang.Boolean) b(tag).second;
        kotlin.jvm.internal.o.d(bool);
        return bool.booleanValue();
    }

    public final android.util.Pair b(java.lang.String str) {
        if (!com.tencent.mm.storage.z3.E3(str) && !com.tencent.mm.storage.z3.G3(str)) {
            java.lang.String str2 = yq1.u0.Zi().z0(str).field_talker;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                return new android.util.Pair(str2, java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.G3(str2)));
            }
            java.lang.String str3 = yq1.u0.Ni().y0(str).field_talker;
            java.lang.String str4 = str3 != null ? str3 : "";
            return new android.util.Pair(str4, java.lang.Boolean.valueOf(com.tencent.mm.storage.z3.E3(str4)));
        }
        return new android.util.Pair(str, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        android.util.Pair b17 = b(tag);
        java.lang.Object second = b17.second;
        kotlin.jvm.internal.o.f(second, "second");
        if (((java.lang.Boolean) second).booleanValue()) {
            return Zg(tag, 0, 0, 0);
        }
        return this.f221841d.loadBitmap((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        android.graphics.Bitmap uc6 = this.f221841d.uc();
        kotlin.jvm.internal.o.f(uc6, "getDefaultBitmap(...)");
        return uc6;
    }
}
