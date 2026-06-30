package un0;

/* loaded from: classes13.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429404h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, kotlin.jvm.internal.h0 h0Var4, kotlin.jvm.internal.h0 h0Var5) {
        super(1);
        this.f429400d = h0Var;
        this.f429401e = h0Var2;
        this.f429402f = h0Var3;
        this.f429403g = h0Var4;
        this.f429404h = h0Var5;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list;
        java.util.Iterator it;
        java.lang.String from = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(from, "from");
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#invokeToStop call. from=".concat(from));
        ((android.media.projection.MediaProjection) this.f429400d.f310123d).stop();
        kotlin.jvm.internal.h0 h0Var = this.f429401e;
        un0.h hVar = (un0.h) h0Var.f310123d;
        if (hVar != null && (list = hVar.f429363l) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
        }
        kotlin.jvm.internal.h0 h0Var2 = this.f429402f;
        android.hardware.display.VirtualDisplay virtualDisplay = (android.hardware.display.VirtualDisplay) h0Var2.f310123d;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        h0Var2.f310123d = null;
        kotlin.jvm.internal.h0 h0Var3 = this.f429403g;
        android.media.AudioRecord audioRecord = (android.media.AudioRecord) h0Var3.f310123d;
        if (audioRecord != null) {
            audioRecord.release();
        }
        h0Var3.f310123d = null;
        kotlin.jvm.internal.h0 h0Var4 = this.f429404h;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) h0Var4.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h0Var4.f310123d = null;
        h0Var.f310123d = null;
        un0.s.f429418b = null;
        return jz5.f0.f302826a;
    }
}
