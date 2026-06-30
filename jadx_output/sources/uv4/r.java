package uv4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final uv4.r f431450d = new uv4.r();

    public r() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchTemplateUseUdr());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "Lazy init cachedExpLevel: " + c17);
        return java.lang.Integer.valueOf(c17);
    }
}
