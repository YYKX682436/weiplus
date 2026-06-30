package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class u0 implements ev3.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156316d;

    public u0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156316d = b1Var;
    }

    @Override // ev3.c
    public void J(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156316d;
        dv3.c cVar = b1Var.f156180u;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.w.f400417a);
        }
        dv3.c cVar2 = b1Var.f156180u;
        if (cVar2 == null) {
            return;
        }
        cVar2.S0("");
    }

    @Override // ev3.c
    public void L(int i17, java.lang.String musicKey, cw3.g mode) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        kotlin.jvm.internal.o.g(mode, "mode");
        dv3.c cVar = this.f156316d.f156180u;
        if (cVar != null) {
            cVar.V0(musicKey, new rv3.u(mode));
        }
    }

    @Override // ev3.c
    public void S(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f156316d.f156180u;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.x.f400418a);
        }
    }

    @Override // ev3.c
    public void q(int i17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info, boolean z17, rv3.v musicPlayStatus) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(musicPlayStatus, "musicPlayStatus");
        dv3.c cVar = this.f156316d.f156180u;
        if (cVar != null) {
            cVar.U0(info, z17);
        }
    }

    @Override // ev3.c
    public void y(int i17, java.lang.String musicKey) {
        kotlin.jvm.internal.o.g(musicKey, "musicKey");
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156316d;
        dv3.c cVar = b1Var.f156180u;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.y.f400419a);
        }
        dv3.c cVar2 = b1Var.f156180u;
        if (cVar2 != null) {
            cVar2.S0(musicKey);
        }
        b1Var.f156185z++;
    }
}
