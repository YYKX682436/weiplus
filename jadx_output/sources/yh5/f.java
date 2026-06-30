package yh5;

/* loaded from: classes12.dex */
public final class f extends of3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // of3.b, lf3.m
    public void W6() {
        super.W6();
        com.tencent.mars.xlog.Log.i("CleanGalleryUI", "setup");
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + yh5.j.class.getSimpleName() + " for interface: " + dg3.m.class.getSimpleName());
        if (!dg3.m.class.isAssignableFrom(yh5.j.class)) {
            throw new java.lang.IllegalArgumentException((yh5.j.class.getSimpleName() + " does not implement " + dg3.m.class.getSimpleName()).toString());
        }
        V6(yh5.j.class);
        pf5.a0.b(yh5.j.class, dg3.m.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + zh5.v.class.getSimpleName() + " for interface: " + zf3.a.class.getSimpleName());
        if (!zf3.a.class.isAssignableFrom(zh5.v.class)) {
            throw new java.lang.IllegalArgumentException((zh5.v.class.getSimpleName() + " does not implement " + zf3.a.class.getSimpleName()).toString());
        }
        V6(zh5.v.class);
        pf5.a0.b(zh5.v.class, zf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + bg3.e.class.getSimpleName() + " for interface: " + bg3.f.class.getSimpleName());
        if (!bg3.f.class.isAssignableFrom(bg3.e.class)) {
            throw new java.lang.IllegalArgumentException((bg3.e.class.getSimpleName() + " does not implement " + bg3.f.class.getSimpleName()).toString());
        }
        V6(bg3.e.class);
        pf5.a0.b(bg3.e.class, bg3.f.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rh5.b.class.getSimpleName() + " for interface: " + xf3.a.class.getSimpleName());
        if (!xf3.a.class.isAssignableFrom(rh5.b.class)) {
            throw new java.lang.IllegalArgumentException((rh5.b.class.getSimpleName() + " does not implement " + xf3.a.class.getSimpleName()).toString());
        }
        V6(rh5.b.class);
        pf5.a0.b(rh5.b.class, xf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rh5.a.class.getSimpleName() + " for interface: " + yf3.a.class.getSimpleName());
        if (!yf3.a.class.isAssignableFrom(rh5.a.class)) {
            throw new java.lang.IllegalArgumentException((rh5.a.class.getSimpleName() + " does not implement " + yf3.a.class.getSimpleName()).toString());
        }
        V6(rh5.a.class);
        pf5.a0.b(rh5.a.class, yf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class.getSimpleName() + " for interface: " + cg3.a.class.getSimpleName());
        if (!cg3.a.class.isAssignableFrom(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class)) {
            throw new java.lang.IllegalArgumentException((com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class.getSimpleName() + " does not implement " + cg3.a.class.getSimpleName()).toString());
        }
        V6(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class);
        pf5.a0.b(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class, cg3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rf3.f.class.getSimpleName() + " for interface: " + sf3.f.class.getSimpleName());
        if (!sf3.f.class.isAssignableFrom(rf3.f.class)) {
            throw new java.lang.IllegalArgumentException((rf3.f.class.getSimpleName() + " does not implement " + sf3.f.class.getSimpleName()).toString());
        }
        V6(rf3.f.class);
        pf5.a0.b(rf3.f.class, sf3.f.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rf3.b.class.getSimpleName() + " for interface: " + sf3.e.class.getSimpleName());
        if (!sf3.e.class.isAssignableFrom(rf3.b.class)) {
            throw new java.lang.IllegalArgumentException((rf3.b.class.getSimpleName() + " does not implement " + sf3.e.class.getSimpleName()).toString());
        }
        V6(rf3.b.class);
        pf5.a0.b(rf3.b.class, sf3.e.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + sh5.c.class.getSimpleName() + " for interface: " + gg3.a.class.getSimpleName());
        if (!gg3.a.class.isAssignableFrom(sh5.c.class)) {
            throw new java.lang.IllegalArgumentException((sh5.c.class.getSimpleName() + " does not implement " + gg3.a.class.getSimpleName()).toString());
        }
        V6(sh5.c.class);
        pf5.a0.b(sh5.c.class, gg3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + sh5.b.class.getSimpleName() + " for interface: " + gg3.b.class.getSimpleName());
        if (gg3.b.class.isAssignableFrom(sh5.b.class)) {
            V6(sh5.b.class);
            pf5.a0.b(sh5.b.class, gg3.b.class);
            X6(this, com.tencent.mm.R.id.un_, kotlin.jvm.internal.i0.a(yh5.e.class));
        } else {
            throw new java.lang.IllegalArgumentException((sh5.b.class.getSimpleName() + " does not implement " + gg3.b.class.getSimpleName()).toString());
        }
    }

    @Override // of3.b
    public of3.a Z6() {
        return new of3.a(kotlin.jvm.internal.i0.a(yh5.i.class));
    }

    @Override // of3.b
    public of3.a b7() {
        return new of3.a(kotlin.jvm.internal.i0.a(yh5.g.class));
    }

    @Override // of3.b
    public of3.e c7() {
        return new of3.e(com.tencent.mm.R.id.l3x, kotlin.jvm.internal.i0.a(yh5.k.class));
    }

    @Override // lf3.m, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        getActivity().setResult(-1, new android.content.Intent());
    }
}
