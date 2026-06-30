package ze5;

/* loaded from: classes11.dex */
public final class l8 {
    public l8(kotlin.jvm.internal.i iVar) {
    }

    public final v11.t a(java.lang.String content, v11.e0 renderConfig, boolean z17, v11.h hVar, yz5.l lVar, long j17) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(renderConfig, "renderConfig");
        try {
            cf5.b bVar = new cf5.b();
            d90.k kVar = (d90.k) i95.n0.c(d90.k.class);
            if (kVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemMarkdownMvvm", "IMarkdownService not available, fallback to raw text");
                return new v11.t(null, false, content, renderConfig, hVar, lVar, j17, 3, null);
            }
            d90.i wi6 = ((d90.q) kVar).wi(new ze5.k8(bVar));
            try {
                ((d90.p) wi6).a(content, true);
                v11.t tVar = new v11.t(bVar.g(), z17, content, renderConfig, hVar, lVar, j17);
                ((d90.p) wi6).b();
                return tVar;
            } catch (java.lang.Throwable th6) {
                ((d90.p) wi6).b();
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemMarkdownMvvm", "Failed to parse markdown: " + e17.getMessage());
            return new v11.t(null, false, content, renderConfig, hVar, lVar, j17, 3, null);
        }
    }
}
