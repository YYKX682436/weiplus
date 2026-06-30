package p12;

/* loaded from: classes10.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.editor.widgets.CircularProgressBar f351033d;

    public j(com.tencent.mm.plugin.emoji.editor.widgets.CircularProgressBar circularProgressBar) {
        this.f351033d = circularProgressBar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoRenderViewController", "progress: " + floatValue);
        this.f351033d.setProgress(floatValue);
        return jz5.f0.f302826a;
    }
}
