package mz0;

/* loaded from: classes5.dex */
public final class q1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c f333027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333028e;

    public q1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar, java.lang.String str) {
        this.f333027d = cVar;
        this.f333028e = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar = this.f333027d;
        if (cVar != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.g(floatValue), this.f333028e);
        }
        return jz5.f0.f302826a;
    }
}
