package sm3;

/* loaded from: classes5.dex */
public final class a implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.a f409820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvFrameListView f409821e;

    public a(kp4.a aVar, com.tencent.mm.plugin.mv.ui.widget.MvFrameListView mvFrameListView) {
        this.f409820d = aVar;
        this.f409821e = mvFrameListView;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvFrameListView", this.f409820d + " receives " + ((java.lang.Number) obj).longValue());
        this.f409821e.postInvalidate();
        return jz5.f0.f302826a;
    }
}
