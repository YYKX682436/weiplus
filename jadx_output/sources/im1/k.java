package im1;

/* loaded from: classes11.dex */
public final class k implements yf.l {

    /* renamed from: b, reason: collision with root package name */
    public final yf.m f292198b;

    public k(yf.t weEffectManager) {
        yf.m i1Var;
        kotlin.jvm.internal.o.g(weEffectManager, "weEffectManager");
        if (weEffectManager instanceof im1.y) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.StickerApplyAdapter", "weEffectManager is IWeEffectWorkaroundManager");
            i1Var = ((im1.k) ((im1.y) weEffectManager).f292238c).f292198b;
        } else {
            i1Var = new yf.i1(weEffectManager);
        }
        this.f292198b = i1Var;
    }

    @Override // yf.m
    public void a(yf.s type, java.lang.String path) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(path, "path");
        this.f292198b.a(type, path);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e A[SYNTHETIC] */
    @Override // yf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(yf.s r24, java.util.List r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im1.k.j(yf.s, java.util.List, org.json.JSONObject):boolean");
    }
}
