package com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment;

/* loaded from: classes5.dex */
public final class r implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment f156378a;

    public r(com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment finderMusicPickerShootRecommendFragment) {
        this.f156378a = finderMusicPickerShootRecommendFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    @Override // wt3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.LinkedList r11, boolean r12, boolean r13, long r14) {
        /*
            r10 = this;
            java.lang.String r0 = "bgmList"
            kotlin.jvm.internal.o.g(r11, r0)
            com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.FinderMusicPickerShootRecommendFragment r0 = r10.f156378a
            boolean r1 = r0.f156398q
            java.lang.String r2 = "FinderMusicPickerShootRecommendFragment"
            if (r1 == 0) goto L13
            java.lang.String r11 = "EditorView has been destroyed, skip callback"
            com.tencent.mars.xlog.Log.i(r2, r11)
            return
        L13:
            boolean r1 = r11.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            r0.f156400s = r1
            dv3.c r1 = r0.f156381e
            if (r1 == 0) goto L22
            r1.P0(r3)
        L22:
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r11.iterator()
            r5 = 0
            r6 = r5
        L30:
            boolean r7 = r4.hasNext()
            r8 = 0
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r4.next()
            int r9 = r6 + 1
            if (r6 < 0) goto L67
            r45.vv0 r7 = (r45.vv0) r7
            wt3.g r6 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M     // Catch: java.lang.Exception -> L5d
            boolean r8 = r0.f156395n     // Catch: java.lang.Exception -> L5d
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r6 = r6.a(r7, r3, r8)     // Catch: java.lang.Exception -> L5d
            r7 = 18
            r6.f155719p = r7     // Catch: java.lang.Exception -> L5d
            r6.f155726w = r5     // Catch: java.lang.Exception -> L5d
            r7 = 0
            r6.f155727x = r7     // Catch: java.lang.Exception -> L5d
            r0.l0()     // Catch: java.lang.Exception -> L5d
            r1.add(r6)     // Catch: java.lang.Exception -> L5d
            r6.h()     // Catch: java.lang.Exception -> L5d
            goto L65
        L5d:
            r6 = move-exception
            java.lang.String r7 = "handleResult"
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r6, r7, r8)
        L65:
            r6 = r9
            goto L30
        L67:
            kz5.c0.p()
            throw r8
        L6b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "handleResult:audioList size="
            r4.<init>(r6)
            int r6 = r11.size()
            r4.append(r6)
            java.lang.String r6 = ", loadFirstPage="
            r4.append(r6)
            r4.append(r12)
            java.lang.String r6 = ", hasNextPage="
            r4.append(r6)
            r4.append(r13)
            java.lang.String r6 = " playMusicWhenRecommendFinish:"
            r4.append(r6)
            boolean r6 = r0.f156401t
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r2, r4)
            if (r13 == 0) goto La7
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r13 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r13.<init>()
            r2 = 5
            r13.f155718o = r2
            r1.add(r13)
        La7:
            boolean r13 = r11.isEmpty()
            if (r13 == 0) goto Lbf
            dv3.c r13 = r0.f156381e
            if (r13 == 0) goto Lb8
            int r13 = r13.getItemCount()
            if (r13 != 0) goto Lb8
            goto Lb9
        Lb8:
            r3 = r5
        Lb9:
            if (r3 == 0) goto Lbf
            r0.y0()
            goto Lca
        Lbf:
            r0.z0()
            dv3.c r13 = r0.f156381e
            if (r13 == 0) goto Lca
            r2 = 2
            dv3.c.F0(r13, r1, r5, r2, r8)
        Lca:
            if (r12 == 0) goto Lcf
            r0.A0()
        Lcf:
            ev3.d r12 = r0.f156380d
            if (r12 == 0) goto Le2
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a r12 = r12.f()
            if (r12 == 0) goto Le2
            r13 = 8
            int r11 = r11.size()
            r12.n(r13, r11, r14)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.ui.editor.music.finder.fragment.r.a(java.util.LinkedList, boolean, boolean, long):void");
    }

    @Override // wt3.i0
    public android.app.Activity getActivity() {
        return this.f156378a.getActivity();
    }
}
