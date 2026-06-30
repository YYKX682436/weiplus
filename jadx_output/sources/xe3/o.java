package xe3;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe3.p f453960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f453961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xe3.p pVar, int i17) {
        super(1);
        this.f453960d = pVar;
        this.f453961e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xe3.f it = (xe3.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "destroy " + it);
        rh3.r rVar = it.f453944d;
        rVar.stop();
        rVar.release();
        xe3.p pVar = this.f453960d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f453962d;
        int i17 = this.f453961e;
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        pVar.f453963e.remove(java.lang.Integer.valueOf(i17));
        return jz5.f0.f302826a;
    }
}
