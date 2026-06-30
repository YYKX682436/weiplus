package gd2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f270532a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f270533b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.MMGestureGallery f270534c;

    /* renamed from: d, reason: collision with root package name */
    public final gd2.x f270535d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f270536e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f270537f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f270538g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f270539h;

    /* renamed from: i, reason: collision with root package name */
    public final o25.y1 f270540i;

    public i(com.tencent.mm.ui.MMActivity context, java.lang.String curFilename, com.tencent.mm.ui.tools.MMGestureGallery gallery, gd2.x photoTransLogic, yz5.a isCurrentImgCanShowTransEntrance, yz5.a isCurrentImgCanShowOCREntrance) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(curFilename, "curFilename");
        kotlin.jvm.internal.o.g(gallery, "gallery");
        kotlin.jvm.internal.o.g(photoTransLogic, "photoTransLogic");
        kotlin.jvm.internal.o.g(isCurrentImgCanShowTransEntrance, "isCurrentImgCanShowTransEntrance");
        kotlin.jvm.internal.o.g(isCurrentImgCanShowOCREntrance, "isCurrentImgCanShowOCREntrance");
        this.f270532a = context;
        this.f270533b = curFilename;
        this.f270534c = gallery;
        this.f270535d = photoTransLogic;
        this.f270536e = isCurrentImgCanShowTransEntrance;
        this.f270537f = isCurrentImgCanShowOCREntrance;
        this.f270539h = com.tencent.mm.plugin.scanner.k1.f158750b;
        i95.m c17 = i95.n0.c(o25.y1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f270540i = new com.tencent.mm.pluginsdk.forward.m();
        context.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.menu.FinderCommentImageMenu$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onPause(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                gd2.i.this.f270540i.getClass();
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onResume(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                gd2.i.this.f270540i.getClass();
            }
        });
    }

    public final void a() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f270538g;
        com.tencent.mm.ui.MMActivity mMActivity = this.f270532a;
        if (k0Var == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 0, false);
            this.f270538g = k0Var2;
            k0Var2.f211872n = new gd2.a(this);
            k0Var2.f211874o = new gd2.b(this);
            k0Var2.f211881s = new gd2.c(this);
            k0Var2.f211884v = new gd2.d(this);
            k0Var2.f211876p = new gd2.e(this);
            k0Var2.f211885w = new gd2.h(this);
        }
        if (this.f270535d.f270572i == 1 || mMActivity.isFinishing()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f270538g;
        if (k0Var3 != null) {
            k0Var3.v();
        } else {
            kotlin.jvm.internal.o.o("menu");
            throw null;
        }
    }
}
