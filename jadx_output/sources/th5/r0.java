package th5;

/* loaded from: classes12.dex */
public final class r0 extends dg3.k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // dg3.k
    public java.util.List W6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        th5.b bVar = info instanceof th5.b ? (th5.b) info : null;
        if (bVar != null) {
            th5.v0 v0Var = th5.v0.f419470a;
            com.tencent.mm.feature.gallery.api.BizData bizData = bVar.f419344c;
            int i17 = bVar.f419342a;
            long j17 = bVar.f419343b;
            th5.a aVar = th5.a.f419336h;
            th5.e eVar = th5.e.f419366e;
            v0Var.a(bizData, i17, j17, aVar, eVar);
            v0Var.a(bVar.f419344c, bVar.f419342a, bVar.f419343b, th5.a.f419335g, eVar);
        }
        return kz5.c0.i(new dg3.p(dg3.q.f232341e, com.tencent.mm.R.string.i29, com.tencent.mm.R.raw.icons_filled_share, java.lang.Integer.valueOf(com.tencent.mm.R.color.f478502m)), new dg3.p(dg3.q.f232342f, com.tencent.mm.R.string.i8c, com.tencent.mm.R.raw.icons_outlined_download, java.lang.Integer.valueOf(com.tencent.mm.R.color.FG_0)));
    }

    @Override // dg3.k
    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        return new th5.t0(info, apiCenter);
    }

    @Override // dg3.k
    public java.util.List Y6(mf3.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        return kz5.p0.f313996d;
    }
}
