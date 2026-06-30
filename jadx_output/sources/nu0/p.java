package nu0;

/* loaded from: classes5.dex */
public final class p extends hw0.n {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f340058u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f340059v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f340058u = jz5.h.b(new nu0.n(this));
        this.f340059v = jz5.h.b(new nu0.k(this));
    }

    @Override // hw0.n
    public lw0.l l7() {
        return (lw0.l) T6(nu0.o4.class);
    }

    @Override // hw0.n
    public java.lang.Object n7(com.tencent.mm.api.IEmojiInfo iEmojiInfo, com.tencent.mm.vfs.r6 file, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        nu0.q0 q76 = q7();
        q76.getClass();
        kotlin.jvm.internal.o.g(file, "file");
        com.tencent.maas.imagestudio.MJImageScene Z6 = q76.Z6();
        if (Z6 != null) {
            java.lang.String o17 = file.o();
            com.tencent.mm.vfs.r6 r6Var = by0.g.f36331a;
            str = Z6.a(o17, (com.tencent.mm.sdk.platformtools.y1.g(file.o()) ? com.tencent.maas.moviecomposing.b.WxAM : com.tencent.maas.moviecomposing.b.Platform).f48463d, 0);
        } else {
            str = null;
        }
        nu0.q0.Y6(q76, false, null, 3, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (str == null) {
            return f0Var;
        }
        nu0.q0.Y6(q7(), false, new nu0.j(new nu0.l(u3Var), this, str), 1, null);
        return f0Var;
    }

    @Override // hw0.n
    public void o7(kw0.a stickerData) {
        com.tencent.maas.imagestudio.MJImageLayer b76;
        kotlin.jvm.internal.o.g(stickerData, "stickerData");
        nu0.q0 q76 = q7();
        java.lang.String str = stickerData.f312788a.f48224b;
        kotlin.jvm.internal.o.f(str, "getMaterialID(...)");
        q76.getClass();
        com.tencent.maas.imagestudio.MJImageScene Z6 = q76.Z6();
        java.lang.String c17 = Z6 != null ? Z6.c(str) : null;
        nu0.q0.Y6(q76, false, null, 3, null);
        if (c17 == null || (b76 = q7().b7(c17)) == null) {
            return;
        }
        if (b76.isDisplayingDateTime()) {
            b76.f(q7().e7());
            nu0.q0.Y6(q7(), false, new nu0.j(null, this, c17), 1, null);
            r7(c17);
        } else if (b76.isDisplayingLocation()) {
            du0.i0 P6 = P6();
            com.tencent.maas.imagestudio.MJImageScene Z62 = q7().Z6();
            P6.O6(Z62 != null ? Z62.getLocation() : null, new nu0.m(this, c17, b76));
        }
    }

    public final nu0.q0 q7() {
        return (nu0.q0) ((jz5.n) this.f340059v).getValue();
    }

    public final void r7(java.lang.String str) {
        com.tencent.maas.base.MJID of6 = com.tencent.maas.base.MJID.of(str);
        nu0.i4 i4Var = (nu0.i4) ((jz5.n) this.f340058u).getValue();
        kotlin.jvm.internal.o.d(of6);
        com.tencent.maas.model.time.MJTimeRange ZeroTimeRange = com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange;
        kotlin.jvm.internal.o.f(ZeroTimeRange, "ZeroTimeRange");
        i4Var.W6(of6, ZeroTimeRange, new nu0.o(this, of6));
    }
}
