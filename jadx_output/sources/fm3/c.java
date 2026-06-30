package fm3;

/* loaded from: classes10.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final fm3.d a() {
        fm3.d dVar = new fm3.d(fm3.d.f264036g + ".mp4", com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b.CTRL_INDEX, 1080, 5000L, null, 16, null);
        if (com.tencent.mm.vfs.w6.j(dVar.a())) {
            fm3.d.f264036g++;
            return dVar;
        }
        fm3.d.f264036g = 1;
        return new fm3.d(fm3.d.f264036g + ".mp4", com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b.CTRL_INDEX, 1080, 5000L, null, 16, null);
    }
}
