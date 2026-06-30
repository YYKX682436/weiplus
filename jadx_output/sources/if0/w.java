package if0;

@j95.b
/* loaded from: classes9.dex */
public final class w extends i95.w implements ff0.q {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f291053d = jz5.h.b(if0.r.f291039d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f291054e = jz5.h.b(if0.q.f291038d);

    public final void Ai(r45.zs4 zs4Var, java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap) {
        if (view == null) {
            return;
        }
        if (zs4Var.f392358p) {
            pm0.v.X(new if0.s(view, zs4Var, this));
            return;
        }
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        if (str == null) {
            str = "";
        }
        ((dl4.m0) tVar).ij(str, view, bitmap, com.tencent.mm.sdk.platformtools.c4.f192496b, new if0.v(this, view, zs4Var));
    }

    public void Bi(android.content.Context context, android.widget.ImageView coverView, android.view.View view, r45.zs4 viewData) {
        android.graphics.Bitmap a17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(coverView, "coverView");
        kotlin.jvm.internal.o.g(viewData, "viewData");
        coverView.setImageResource(((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Vi());
        pm0.v.X(new if0.s(view, viewData, this));
        com.tencent.mm.protobuf.g gVar = viewData.f392353h;
        if (gVar != null) {
            byte[] bArr = gVar.f192156a;
            if (bArr == null || (a17 = com.tencent.mm.graphics.e.a(bArr, 0, bArr.length)) == null || a17.isRecycled()) {
                return;
            }
            coverView.setImageBitmap(a17);
            Ai(viewData, kk.k.g(bArr), view, a17);
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(viewData.f392352g)) {
            java.lang.String str = viewData.f392351f;
            if (str == null || str.length() == 0) {
                return;
            }
            java.lang.String coverUrl = viewData.f392351f;
            kotlin.jvm.internal.o.f(coverUrl, "coverUrl");
            Ai(viewData, coverUrl, view, null);
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(coverUrl, coverView, new if0.u(this, viewData, coverUrl, view));
            return;
        }
        if (viewData.f392354i) {
            return;
        }
        java.lang.String coverLocalPath = viewData.f392352g;
        kotlin.jvm.internal.o.f(coverLocalPath, "coverLocalPath");
        Ai(viewData, coverLocalPath, view, null);
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        com.tencent.mm.sdk.platformtools.c4 c4Var = com.tencent.mm.sdk.platformtools.c4.f192496b;
        if0.t tVar2 = new if0.t(this, view, viewData);
        dl4.m0 m0Var = (dl4.m0) tVar;
        m0Var.getClass();
        m0Var.Zi(coverLocalPath, coverView, m0Var.Vi(), 512, 512, c4Var, tVar2);
    }

    public r45.zs4 wi() {
        return new r45.zs4();
    }
}
