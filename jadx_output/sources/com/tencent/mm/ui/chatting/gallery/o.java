package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.o f201230d = new com.tencent.mm.ui.chatting.gallery.o();

    public o() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String filename = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(filename, "filename");
        com.tencent.mars.xlog.Log.i("MicroMsg.Imagegallery.C2CThumbVideoDownloader", "downloader[" + longValue + "] download end, filename=" + filename + ",result=" + booleanValue);
        if (booleanValue && com.tencent.mm.ui.chatting.gallery.p.f201254a.a(longValue)) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.ui.chatting.gallery.m mVar = new com.tencent.mm.ui.chatting.gallery.m(filename);
            com.tencent.mm.ui.chatting.gallery.n nVar = com.tencent.mm.ui.chatting.gallery.n.f201207a;
            ((yb0.g) b0Var).getClass();
            com.tencent.mm.platformtools.ExportFileUtil.h(context, mVar, nVar);
        }
        com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
        com.tencent.mm.ui.chatting.gallery.p.f201257d.remove(java.lang.Long.valueOf(longValue));
        pVar.c(longValue);
        return jz5.f0.f302826a;
    }
}
