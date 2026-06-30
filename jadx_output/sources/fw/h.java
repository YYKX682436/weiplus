package fw;

/* loaded from: classes7.dex */
public final class h extends fw.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dq0.q mbPlugin) {
        super(mbPlugin);
        kotlin.jvm.internal.o.g(mbPlugin, "mbPlugin");
    }

    @Override // fw.v
    public void B(java.lang.String frameSetName, int i17) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        fw.b bVar = (fw.b) ((cw.e) i95.n0.c(cw.e.class));
        bVar.getClass();
        jz5.g gVar = bVar.f267025d;
        if (i17 <= 0) {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).remove(frameSetName);
        } else {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putInt(frameSetName, i17);
        }
    }

    @Override // fw.v, dq0.a0
    public void m(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        super.m(binding);
        ((hw.v0) ((gw.i) i95.n0.c(gw.i.class))).K6(1);
        this.f267037r = null;
    }

    @Override // dq0.a0
    public void v(fq0.x frameSet) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
    }

    @Override // dq0.a0
    public void w(fq0.x frameSet, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        super.w(frameSet, jSONObject);
    }

    @Override // fw.v
    public int z(java.lang.String frameSetName) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        fw.b bVar = (fw.b) ((cw.e) i95.n0.c(cw.e.class));
        bVar.getClass();
        return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) bVar.f267025d).getValue()).getInt(frameSetName, 0);
    }
}
