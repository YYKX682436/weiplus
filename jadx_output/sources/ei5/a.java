package ei5;

/* loaded from: classes12.dex */
public final class a extends of3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // of3.b, lf3.m
    public void W6() {
        super.W6();
        java.lang.Class b17 = xz5.a.b(b7().a());
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + b17.getSimpleName() + " for interface: " + zh5.k0.class.getSimpleName());
        if (!zh5.k0.class.isAssignableFrom(b17)) {
            throw new java.lang.IllegalArgumentException((b17.getSimpleName() + " does not implement " + zh5.k0.class.getSimpleName()).toString());
        }
        V6(b17);
        pf5.a0.b(b17, zh5.k0.class);
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
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + zh5.v.class.getSimpleName() + " for interface: " + zf3.a.class.getSimpleName());
        if (!zf3.a.class.isAssignableFrom(zh5.v.class)) {
            throw new java.lang.IllegalArgumentException((zh5.v.class.getSimpleName() + " does not implement " + zf3.a.class.getSimpleName()).toString());
        }
        V6(zh5.v.class);
        pf5.a0.b(zh5.v.class, zf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + ei5.e.class.getSimpleName() + " for interface: " + dg3.m.class.getSimpleName());
        if (!dg3.m.class.isAssignableFrom(ei5.e.class)) {
            throw new java.lang.IllegalArgumentException((ei5.e.class.getSimpleName() + " does not implement " + dg3.m.class.getSimpleName()).toString());
        }
        V6(ei5.e.class);
        pf5.a0.b(ei5.e.class, dg3.m.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rh5.a.class.getSimpleName() + " for interface: " + yf3.a.class.getSimpleName());
        if (!yf3.a.class.isAssignableFrom(rh5.a.class)) {
            throw new java.lang.IllegalArgumentException((rh5.a.class.getSimpleName() + " does not implement " + yf3.a.class.getSimpleName()).toString());
        }
        V6(rh5.a.class);
        pf5.a0.b(rh5.a.class, yf3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + cg3.g.class.getSimpleName() + " for interface: " + cg3.b.class.getSimpleName());
        if (!cg3.b.class.isAssignableFrom(cg3.g.class)) {
            throw new java.lang.IllegalArgumentException((cg3.g.class.getSimpleName() + " does not implement " + cg3.b.class.getSimpleName()).toString());
        }
        U6(com.tencent.mm.R.id.m_d, cg3.g.class);
        pf5.a0.b(cg3.g.class, cg3.b.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent.class.getSimpleName() + " for interface: " + eg3.a.class.getSimpleName());
        if (!eg3.a.class.isAssignableFrom(com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent.class)) {
            throw new java.lang.IllegalArgumentException((com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent.class.getSimpleName() + " does not implement " + eg3.a.class.getSimpleName()).toString());
        }
        V6(com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent.class);
        pf5.a0.b(com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent.class, eg3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + rh5.g.class.getSimpleName() + " for interface: " + dg3.n.class.getSimpleName());
        if (!dg3.n.class.isAssignableFrom(rh5.g.class)) {
            throw new java.lang.IllegalArgumentException((rh5.g.class.getSimpleName() + " does not implement " + dg3.n.class.getSimpleName()).toString());
        }
        V6(rh5.g.class);
        pf5.a0.b(rh5.g.class, dg3.n.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class.getSimpleName() + " for interface: " + cg3.a.class.getSimpleName());
        if (cg3.a.class.isAssignableFrom(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class)) {
            V6(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class);
            pf5.a0.b(com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class, cg3.a.class);
        } else {
            throw new java.lang.IllegalArgumentException((com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent.class.getSimpleName() + " does not implement " + cg3.a.class.getSimpleName()).toString());
        }
    }

    @Override // of3.b
    public of3.c Y6() {
        return new of3.c(new of3.a(kotlin.jvm.internal.i0.a(zh5.a0.class)), new of3.a(kotlin.jvm.internal.i0.a(zh5.d.class)));
    }

    @Override // of3.b
    public of3.a Z6() {
        return new of3.a(kotlin.jvm.internal.i0.a(ei5.b.class));
    }

    @Override // of3.b
    public of3.f a7() {
        return new of3.f(new of3.a(kotlin.jvm.internal.i0.a(sh5.c.class)), new of3.a(kotlin.jvm.internal.i0.a(zh5.p.class)));
    }

    @Override // of3.b
    public of3.a b7() {
        return new of3.a(kotlin.jvm.internal.i0.a(zh5.e.class));
    }

    @Override // of3.b, com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ejp;
    }

    @Override // lf3.m, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // lf3.m, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        getActivity().overridePendingTransition(0, 0);
    }

    @Override // lf3.m, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
    }
}
