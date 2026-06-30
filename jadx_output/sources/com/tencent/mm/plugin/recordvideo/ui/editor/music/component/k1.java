package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class k1 implements com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 f156285a;

    public k1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 m1Var) {
        this.f156285a = m1Var;
    }

    public void a(cw3.i newMode, java.lang.String mjMusicId) {
        java.lang.String a17;
        kotlin.jvm.internal.o.g(newMode, "newMode");
        kotlin.jvm.internal.o.g(mjMusicId, "mjMusicId");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m1 m1Var = this.f156285a;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = m1Var.f156296r.f413390b;
        java.lang.String str = audioCacheInfo != null ? audioCacheInfo.C : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !kotlin.jvm.internal.o.b(str, mjMusicId)) {
            com.tencent.mars.xlog.Log.e(m1Var.f156295q, "onMusicSwitchModeUpdate: failed id not match loading " + str + ", " + mjMusicId);
            return;
        }
        java.lang.String str2 = m1Var.f156295q;
        newMode.toString();
        sv3.b bVar = m1Var.f156296r;
        int i17 = bVar.f413389a;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = bVar.f413390b;
        if (newMode instanceof cw3.g) {
            cw3.g gVar = (cw3.g) newMode;
            m1Var.getClass();
            if (audioCacheInfo2 == null || (a17 = audioCacheInfo2.a()) == null) {
                return;
            }
            java.util.Iterator it = m1Var.o(audioCacheInfo2, i17).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) m1Var.f156221n).get(java.lang.Integer.valueOf(intValue));
                if (cVar != null) {
                    cVar.L(intValue, a17, gVar);
                }
            }
            return;
        }
        if (newMode instanceof cw3.h) {
            sv3.a aVar = m1Var.f156220m;
            m1Var.r(aVar.f413388b, aVar.f413387a);
            sv3.b bVar2 = m1Var.f156296r;
            m1Var.s(bVar2.f413390b, bVar2.f413389a);
            sv3.b bVar3 = m1Var.f156296r;
            m1Var.z(bVar3.f413389a, bVar3.f413390b);
            sv3.b bVar4 = m1Var.f156296r;
            bVar4.f413389a = -1;
            bVar4.f413390b = null;
            m1Var.x(m1Var.f156220m.f413388b);
        }
    }
}
