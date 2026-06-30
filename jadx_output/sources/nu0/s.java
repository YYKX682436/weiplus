package nu0;

/* loaded from: classes5.dex */
public final class s extends ow0.a0 {
    public final jz5.g D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.D = jz5.h.b(new nu0.r(this));
    }

    @Override // ow0.a0
    public gx0.gg A7() {
        return (gx0.gg) T6(nu0.j4.class);
    }

    @Override // ow0.a0
    public void k7(kw0.a stickerData) {
        java.lang.String b17;
        com.tencent.maas.imagestudio.MJImageLayer b76;
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
        nu0.q0 q0Var = (nu0.q0) ((jz5.n) this.D).getValue();
        java.lang.String str = stickerData.f312788a.f48224b;
        java.lang.String str2 = null;
        if (str == null) {
            q0Var.getClass();
        } else {
            com.tencent.maas.imagestudio.MJImageScene Z6 = q0Var.Z6();
            if (Z6 != null && (b17 = Z6.b(str)) != null && (b76 = q0Var.b7(b17)) != null) {
                q0Var.f340074q.put(b17, new mu0.a(b76));
                nu0.q0.Y6(q0Var, false, null, 3, null);
                str2 = b17;
            }
        }
        if (str2 == null) {
            return;
        }
        com.tencent.maas.base.MJID of6 = com.tencent.maas.base.MJID.of(str2);
        gx0.hf p76 = p7();
        kotlin.jvm.internal.o.d(of6);
        com.tencent.maas.model.time.MJTimeRange ZeroTimeRange = com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange;
        kotlin.jvm.internal.o.f(ZeroTimeRange, "ZeroTimeRange");
        p76.W6(of6, ZeroTimeRange, new nu0.q(this, of6));
    }

    @Override // ow0.a0
    public java.util.List l7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new sw0.n(getString(com.tencent.mm.R.string.mbz), sw0.f.f413431f, new com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView(getActivity(), null, 0, 6, null)));
        return arrayList;
    }

    @Override // ow0.a0
    public uw0.o t7() {
        return (uw0.o) T6(nu0.f.class);
    }

    @Override // ow0.a0
    public uw0.t0 u7() {
        return (uw0.t0) T6(nu0.g.class);
    }

    @Override // ow0.a0
    public jv0.g w7() {
        return (jv0.g) T6(nu0.r0.class);
    }

    @Override // ow0.a0
    public hw0.z x7() {
        return (hw0.z) T6(nu0.w0.class);
    }

    @Override // ow0.a0
    public du0.o y7() {
        return (du0.o) T6(nu0.b1.class);
    }

    @Override // ow0.a0
    public gx0.hf z7() {
        return (gx0.hf) T6(nu0.i4.class);
    }
}
