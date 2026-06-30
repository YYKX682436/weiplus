package yh5;

/* loaded from: classes3.dex */
public final class j extends dg3.k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new dg3.p(dg3.q.f232341e, com.tencent.mm.R.string.i29, com.tencent.mm.R.raw.icons_filled_share, java.lang.Integer.valueOf(com.tencent.mm.R.color.f478502m)));
        if (info.getType() == mf3.u.f326123e) {
            arrayList.add(new dg3.p(dg3.q.f232343g, com.tencent.mm.R.string.hjg, com.tencent.mm.R.raw.bottomsheet_icon_fav, null));
        }
        return arrayList;
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dg3.q qVar = dg3.q.f232342f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0);
        arrayList.add(new dg3.p(qVar, com.tencent.mm.R.string.i8c, com.tencent.mm.R.raw.icons_outlined_download, valueOf));
        if (info.getType() == mf3.u.f326123e) {
            arrayList.add(new dg3.p(dg3.q.f232344h, com.tencent.mm.R.string.b2d, com.tencent.mm.R.raw.icons_outlined_pencil, valueOf));
        }
        return arrayList;
    }
}
