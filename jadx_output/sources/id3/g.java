package id3;

@fd3.a(name = com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.NAME)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/g;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends com.tencent.mm.plugin.magicbrush.jsapi.base.d {
    @Override // com.tencent.mm.plugin.magicbrush.jsapi.base.d
    public void c(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        long optLong = data.optLong("downloadId", -1L);
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
        if (c17 != null && c17.field_status == 3 && com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
            vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
            long j17 = c17.field_downloadId;
            id3.f fVar = new id3.f(this);
            ((uz.a) f1Var).getClass();
            k02.l.a(j17, false, fVar);
        }
    }
}
