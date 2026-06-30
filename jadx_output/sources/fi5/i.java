package fi5;

/* loaded from: classes3.dex */
public final class i extends dg3.k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        e60.t0 t0Var;
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        zh5.k0 k0Var = (zh5.k0) U6(zh5.k0.class);
        boolean z17 = (k0Var == null || (t0Var = ((zh5.e) k0Var).f473019d) == null) ? false : t0Var.f249738i;
        arrayList.add(new dg3.p(dg3.q.f232341e, com.tencent.mm.R.string.i29, com.tencent.mm.R.raw.icons_filled_share, java.lang.Integer.valueOf(com.tencent.mm.R.color.f478502m)));
        if (info.getType() == mf3.u.f326123e) {
            if (z17) {
                arrayList.add(new dg3.p(dg3.q.f232346m, com.tencent.mm.R.string.hra, com.tencent.mm.R.raw.bottomsheet_icon_moment, null));
            }
            arrayList.add(new dg3.p(dg3.q.f232343g, com.tencent.mm.R.string.hjg, com.tencent.mm.R.raw.bottomsheet_icon_fav, null));
        }
        return arrayList;
    }

    @Override // dg3.k
    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        return info.getType() == mf3.u.f326123e ? new fi5.j(info, apiCenter) : super.X6(info, apiCenter);
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        e60.t0 t0Var;
        kotlin.jvm.internal.o.g(info, "info");
        boolean booleanExtra = getIntent().getBooleanExtra("view_only", true);
        zh5.k0 k0Var = (zh5.k0) U6(zh5.k0.class);
        boolean z17 = (k0Var == null || (t0Var = ((zh5.e) k0Var).f473019d) == null) ? false : t0Var.f249737h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dg3.p(dg3.q.f232342f, com.tencent.mm.R.string.i8c, com.tencent.mm.R.raw.icons_outlined_download, java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0)));
        if (info.getType() == mf3.u.f326123e) {
            arrayList.add(new dg3.p(dg3.q.f232344h, com.tencent.mm.R.string.b2d, com.tencent.mm.R.raw.icons_outlined_pencil, java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0)));
            if (z17) {
                arrayList.add(new dg3.p(dg3.q.f232345i, com.tencent.mm.R.string.b2f, com.tencent.mm.R.raw.icons_outlined_translate, java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0)));
            }
            if (!booleanExtra) {
                arrayList.add(new dg3.p(dg3.q.f232347n, com.tencent.mm.R.string.f491056ne0, com.tencent.mm.R.raw.icons_outlined_delete, java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0)));
            }
        }
        return arrayList;
    }
}
