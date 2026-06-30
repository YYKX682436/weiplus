package yo4;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z23.f f464255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f464256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f464257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f464258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f464259i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, z23.f fVar, java.lang.String[] strArr, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        super(2);
        this.f464254d = multiVideoFullScreenPluginLayout;
        this.f464255e = fVar;
        this.f464256f = strArr;
        this.f464257g = arrayList;
        this.f464258h = arrayList2;
        this.f464259i = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            if (!(str == null || str.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "download music success, " + str);
                kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new yo4.k0(this.f464254d, str, this.f464255e, this.f464256f, this.f464257g, this.f464258h, this.f464259i, null), 2, null);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "download music failed");
        return jz5.f0.f302826a;
    }
}
