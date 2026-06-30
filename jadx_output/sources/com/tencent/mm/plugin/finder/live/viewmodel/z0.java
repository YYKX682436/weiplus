package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class z0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117555a;

    public z0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        this.f117555a = a1Var;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        android.graphics.Point point;
        java.lang.String str;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        mv2.n0 n0Var = (mv2.n0) task;
        if (status != fp0.u.f265290f || com.tencent.mm.sdk.platformtools.t8.K0(n0Var.f331609h)) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
        finderMedia.setUrl(n0Var.f331609h);
        finderMedia.setMediaType(9);
        finderMedia.setThumbUrl(n0Var.f331610i);
        finderMedia.setVideoDuration(0);
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117555a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(a1Var.S6().f118621i)) {
            a1Var.S6();
            point = new android.graphics.Point(300, 400);
        } else {
            w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
            java.lang.String filePath = a1Var.S6().f118621i;
            ((qs2.q) eVar).getClass();
            kotlin.jvm.internal.o.g(filePath, "filePath");
            point = mv2.f0.f331561a.h(filePath);
        }
        finderMedia.setWidth(point.x);
        finderMedia.setHeight(point.y);
        dn.h hVar = n0Var.f331611m;
        if (hVar == null || (str = hVar.field_filemd5) == null) {
            str = "";
        }
        finderMedia.setMd5sum(str);
        finderMedia.setCoverUrl(n0Var.f331609h);
        a1Var.R6(finderMedia);
    }
}
