package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j f156243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j jVar) {
        super(2);
        this.f156243d = jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j jVar = this.f156243d;
        jVar.f156264d = longValue;
        jVar.f156265e = longValue2;
        jVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicClipDialog", "onRangeChanged: startMs=" + jVar.f156264d + " durationMs=" + (jVar.f156265e - jVar.f156264d));
        yz5.p pVar = jVar.f156271k;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(jVar.f156264d), java.lang.Long.valueOf(jVar.f156265e - jVar.f156264d));
        }
        return jz5.f0.f302826a;
    }
}
