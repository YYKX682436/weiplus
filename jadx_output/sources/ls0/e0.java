package ls0;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ls0.r0 r0Var) {
        super(1);
        this.f320822d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.media.MediaFormat mediaFormat = (android.media.MediaFormat) obj;
        kotlin.jvm.internal.o.g(mediaFormat, "mediaFormat");
        ls0.r0 r0Var = this.f320822d;
        com.tencent.mars.xlog.Log.i(r0Var.f320916t, "onFormatChanged, format:" + mediaFormat);
        ls0.k kVar = r0Var.F;
        if (kVar != null) {
            kVar.j(mediaFormat);
        }
        return jz5.f0.f302826a;
    }
}
