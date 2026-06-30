package re5;

/* loaded from: classes12.dex */
public final class g0 extends lf3.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // lf3.m
    public void W6() {
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + re5.s.class.getSimpleName() + " for interface: " + re5.b.class.getSimpleName());
        if (!re5.b.class.isAssignableFrom(re5.s.class)) {
            throw new java.lang.IllegalArgumentException((re5.s.class.getSimpleName() + " does not implement " + re5.b.class.getSimpleName()).toString());
        }
        U6(com.tencent.mm.R.id.m_d, re5.s.class);
        pf5.a0.b(re5.s.class, re5.b.class);
        X6(this, com.tencent.mm.R.id.l3x, kotlin.jvm.internal.i0.a(re5.l0.class));
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + re5.u.class.getSimpleName() + " for interface: " + qf3.b.class.getSimpleName());
        if (!qf3.b.class.isAssignableFrom(re5.u.class)) {
            throw new java.lang.IllegalArgumentException((re5.u.class.getSimpleName() + " does not implement " + qf3.b.class.getSimpleName()).toString());
        }
        V6(re5.u.class);
        pf5.a0.b(re5.u.class, qf3.b.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + re5.k0.class.getSimpleName() + " for interface: " + mf3.m.class.getSimpleName());
        if (!mf3.m.class.isAssignableFrom(re5.k0.class)) {
            throw new java.lang.IllegalArgumentException((re5.k0.class.getSimpleName() + " does not implement " + mf3.m.class.getSimpleName()).toString());
        }
        V6(re5.k0.class);
        pf5.a0.b(re5.k0.class, mf3.m.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + sh5.b.class.getSimpleName() + " for interface: " + gg3.b.class.getSimpleName());
        if (!gg3.b.class.isAssignableFrom(sh5.b.class)) {
            throw new java.lang.IllegalArgumentException((sh5.b.class.getSimpleName() + " does not implement " + gg3.b.class.getSimpleName()).toString());
        }
        V6(sh5.b.class);
        pf5.a0.b(sh5.b.class, gg3.b.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + re5.i0.class.getSimpleName() + " for interface: " + gg3.a.class.getSimpleName());
        if (!gg3.a.class.isAssignableFrom(re5.i0.class)) {
            throw new java.lang.IllegalArgumentException((re5.i0.class.getSimpleName() + " does not implement " + gg3.a.class.getSimpleName()).toString());
        }
        V6(re5.i0.class);
        pf5.a0.b(re5.i0.class, gg3.a.class);
        com.tencent.mars.xlog.Log.i("LegoBaseUI", "Importing implementation: " + re5.x.class.getSimpleName() + " for interface: " + re5.a.class.getSimpleName());
        if (re5.a.class.isAssignableFrom(re5.x.class)) {
            U6(com.tencent.mm.R.id.l3x, re5.x.class);
            pf5.a0.b(re5.x.class, re5.a.class);
        } else {
            throw new java.lang.IllegalArgumentException((re5.x.class.getSimpleName() + " does not implement " + re5.a.class.getSimpleName()).toString());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e5g;
    }
}
