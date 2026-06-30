package com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment;

/* loaded from: classes5.dex */
public final class i implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment f156415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv3.c f156416e;

    public i(com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment musicPickerRecommendDataFragment, dv3.c cVar) {
        this.f156415d = musicPickerRecommendDataFragment;
        this.f156416e = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0.M0(r14) == 1) goto L8;
     */
    @Override // in5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s2(androidx.recyclerview.widget.f2 r12, android.view.View r13, int r14, androidx.recyclerview.widget.k3 r15) {
        /*
            r11 = this;
            in5.s0 r15 = (in5.s0) r15
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r12 = "view"
            kotlin.jvm.internal.o.g(r13, r12)
            java.lang.String r12 = "holder"
            kotlin.jvm.internal.o.g(r15, r12)
            com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerRecommendDataFragment r12 = r11.f156415d
            dv3.c r0 = r12.f156381e
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.M0(r14)
            r2 = 1
            if (r0 != r2) goto L20
            goto L21
        L20:
            r2 = r1
        L21:
            if (r2 != 0) goto L24
            goto L96
        L24:
            java.lang.Object r15 = r15.f293125i
            rv3.h r15 = (rv3.h) r15
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r0 = r15.f400395d
            r0.f155726w = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onMusicItemClick: position: "
            r0.<init>(r2)
            r0.append(r14)
            java.lang.String r14 = ", feedMusicKey:"
            r0.append(r14)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r14 = r15.f400395d
            java.lang.String r2 = r14.a()
            r0.append(r2)
            java.lang.String r2 = ", selectMusicKey:"
            r0.append(r2)
            dv3.c r2 = r11.f156416e
            java.lang.String r3 = r2.f243996J
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = r12.f156396o
            com.tencent.mars.xlog.Log.i(r3, r0)
            r14.f155709J = r1
            java.lang.String r0 = r2.f243996J
            java.lang.String r1 = r14.a()
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            ev3.d r3 = r12.f156380d
            if (r0 == 0) goto L7b
            if (r3 == 0) goto L93
            int r4 = r12.n0()
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r5 = r15.f400395d
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            ev3.d.e(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L93
        L7b:
            if (r3 == 0) goto L8c
            int r4 = r12.n0()
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r5 = r15.f400395d
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            ev3.d.e(r3, r4, r5, r6, r7, r8, r9, r10)
        L8c:
            java.lang.String r14 = r14.a()
            r2.S0(r14)
        L93:
            r12.r0(r13, r15)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.i.s2(androidx.recyclerview.widget.f2, android.view.View, int, androidx.recyclerview.widget.k3):void");
    }
}
