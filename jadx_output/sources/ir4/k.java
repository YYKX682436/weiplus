package ir4;

/* loaded from: classes11.dex */
public final class k implements com.tencent.mm.pluginsdk.ui.j1, com.tencent.mm.pluginsdk.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.j1 f294273d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f294274e;

    public k(com.tencent.mm.pluginsdk.ui.j1 wxAvatarDrawableLoader) {
        kotlin.jvm.internal.o.g(wxAvatarDrawableLoader, "wxAvatarDrawableLoader");
        this.f294273d = wxAvatarDrawableLoader;
        this.f294274e = new java.util.ArrayList();
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
        return this.f294273d.W0((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        if (drawable instanceof kv.e0) {
            java.lang.String str = drawable.f190901m;
            kotlin.jvm.internal.o.f(str, "getTag(...)");
            android.util.Pair b17 = b(str);
            java.lang.Boolean bool = (java.lang.Boolean) b17.second;
            java.lang.String str2 = (java.lang.String) b17.first;
            kotlin.jvm.internal.o.d(bool);
            if (!bool.booleanValue()) {
                drawable.f190903o = new ir4.j(str2, drawable);
                this.f294273d.X9(drawable);
            } else {
                ((java.util.ArrayList) this.f294274e).add(new java.lang.ref.WeakReference(drawable));
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String tag, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(tag, "tag");
        if (!com.tencent.mm.storage.z3.J4(tag)) {
            return this.f294273d.Zg(tag, i17, i18, i19);
        }
        hr4.p pVar = hr4.p.f284263a;
        kr4.e b17 = pVar.b(tag);
        if (b17 != null) {
            java.lang.String str = b17.field_avatar;
            vo0.d dVar = ir4.o.f294280a;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ir4.o.f294280a.a(new ir4.e(str)).e();
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        pVar.a(tag, new ir4.i(this, tag));
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k1
    public boolean a(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        return com.tencent.mm.storage.z3.J4(tag);
    }

    public final android.util.Pair b(java.lang.String str) {
        return com.tencent.mm.storage.z3.J4(str) ? new android.util.Pair(str, java.lang.Boolean.TRUE) : new android.util.Pair(str, java.lang.Boolean.FALSE);
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
        return this.f294273d.loadBitmap((java.lang.String) b17.first);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        android.graphics.Bitmap uc6 = this.f294273d.uc();
        kotlin.jvm.internal.o.f(uc6, "getDefaultBitmap(...)");
        return uc6;
    }
}
