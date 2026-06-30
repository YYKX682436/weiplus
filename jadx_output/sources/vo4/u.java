package vo4;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.x f438691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f438692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hs0.a f438693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vo4.x xVar, long j17, hs0.a aVar) {
        super(2);
        this.f438691d = xVar;
        this.f438692e = j17;
        this.f438693f = aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.media.MediaFormat mediaFormat = (android.media.MediaFormat) obj;
        ls0.v checker = (ls0.v) obj2;
        kotlin.jvm.internal.o.g(checker, "checker");
        if (mediaFormat != null) {
            boolean z17 = mediaFormat.containsKey("crop-left") || mediaFormat.containsKey("crop-top") || mediaFormat.containsKey("crop-right") || mediaFormat.containsKey("crop-bottom");
            vo4.x xVar = this.f438691d;
            if (z17) {
                xVar.f438609h = mediaFormat.containsKey("crop-left") ? mediaFormat.getInteger("crop-left") : 0;
                xVar.f438610i = mediaFormat.containsKey("crop-top") ? mediaFormat.getInteger("crop-top") : 0;
                xVar.f438611j = mediaFormat.containsKey("crop-right") ? mediaFormat.getInteger("crop-right") : 0;
                xVar.f438612k = mediaFormat.containsKey("crop-bottom") ? mediaFormat.getInteger("crop-bottom") : 0;
                if (mediaFormat.containsKey("width") & mediaFormat.containsKey("height")) {
                    xVar.f438607f = mediaFormat.getInteger("width");
                    xVar.f438608g = mediaFormat.getInteger("height");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(xVar.hashCode());
                sb6.append(' ');
                com.tencent.mm.plugin.vlog.model.p0 p0Var = xVar.f438605d;
                sb6.append(p0Var.f175710c);
                sb6.append(" finish check crop rect:[");
                sb6.append(xVar.f438609h);
                sb6.append(", ");
                sb6.append(xVar.f438610i);
                sb6.append(", ");
                sb6.append(xVar.f438611j);
                sb6.append(", ");
                sb6.append(xVar.f438612k);
                sb6.append("], width:");
                sb6.append(xVar.f438607f);
                sb6.append(", height:");
                sb6.append(xVar.f438608g);
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb6.toString());
                vo4.k kVar = vo4.k.f438649a;
                int i17 = xVar.f438607f;
                int i18 = xVar.f438608g;
                int i19 = xVar.f438609h;
                int i27 = xVar.f438610i;
                int i28 = xVar.f438611j;
                int i29 = xVar.f438612k;
                java.lang.String path = p0Var.f175710c;
                kotlin.jvm.internal.o.g(path, "path");
                if (path.length() > 0) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = vo4.k.f438650b;
                    vo4.a aVar = (vo4.a) concurrentHashMap.get(path);
                    if (aVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VLogMaterialsInfoCache", "updateCache, path:" + path + ", width:" + i17 + ", height:height, rotate:-1, cropLeft:" + i19 + ", cropTop:" + i27 + ", cropRight:" + i28 + ", cropBottom:" + i29);
                        if (i17 > 0) {
                            aVar.f438595a = i17;
                        }
                        if (i18 > 0) {
                            aVar.f438596b = i18;
                        }
                        if (i19 >= 0) {
                            aVar.f438598d = i19;
                        }
                        if (i27 >= 0) {
                            aVar.f438599e = i27;
                        }
                        if (i28 >= 0) {
                            aVar.f438600f = i28;
                        }
                        if (i29 >= 0) {
                            aVar.f438601g = i29;
                        }
                        concurrentHashMap.put(path, aVar);
                    }
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(xVar.hashCode());
            sb7.append(' ');
            sb7.append(xVar.f438605d.f175710c);
            sb7.append(" finish check crop rect, notify all, cost:");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(android.os.SystemClock.elapsedRealtime() - this.f438692e);
            sb7.append("ms");
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogVideoPlayer", sb7.toString());
            this.f438693f.d();
        }
        return jz5.f0.f302826a;
    }
}
