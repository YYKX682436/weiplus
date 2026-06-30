package kk4;

/* loaded from: classes14.dex */
public final class w implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f308602d;

    public w(kk4.f0 f0Var) {
        this.f308602d = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r5 == null) goto L39;
     */
    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.thumbplayer.api.TPPostProcessFrameBuffer onAudioProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer r9, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer r10) {
        /*
            r8 = this;
            kk4.f0 r9 = r8.f308602d
            lk4.a r9 = r9.f308539o
            if (r9 == 0) goto L89
            kotlin.jvm.internal.o.d(r10)
            lk4.b r9 = (lk4.b) r9
            long r0 = r9.f319017d
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L89
            boolean r0 = r9.f319019f
            if (r0 != 0) goto L19
            goto L89
        L19:
            byte[][] r0 = r10.data
            java.lang.String r1 = "data"
            kotlin.jvm.internal.o.f(r0, r1)
            int r0 = r0.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 != 0) goto L89
            int[] r0 = r10.size
            java.lang.String r3 = "size"
            kotlin.jvm.internal.o.f(r0, r3)
            int r0 = r0.length
            if (r0 != 0) goto L37
            r0 = r1
            goto L38
        L37:
            r0 = r2
        L38:
            if (r0 == 0) goto L3b
            goto L89
        L3b:
            byte[][] r0 = r10.data
            r0 = r0[r2]
            int[] r3 = r10.size
            r3 = r3[r2]
            kotlin.jvm.internal.o.d(r0)
            int r4 = r0.length
            if (r4 != 0) goto L4b
            r4 = r1
            goto L4c
        L4b:
            r4 = r2
        L4c:
            if (r4 != 0) goto L89
            if (r3 <= 0) goto L89
            long r4 = (long) r3
            long r6 = r9.f319018e
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L58
            goto L89
        L58:
            int r4 = r3 / 2
            byte[] r5 = r9.f319020g
            if (r5 == 0) goto L69
            int r6 = r5.length
            if (r6 < r3) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            if (r1 == 0) goto L66
            goto L67
        L66:
            r5 = 0
        L67:
            if (r5 != 0) goto L6d
        L69:
            byte[] r5 = new byte[r3]
            r9.f319020g = r5
        L6d:
            java.lang.Class<wd0.l1> r1 = wd0.l1.class
            i95.m r1 = i95.n0.c(r1)
            wd0.l1 r1 = (wd0.l1) r1
            long r6 = r9.f319017d
            u14.t r1 = (u14.t) r1
            r1.getClass()
            int r9 = com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.Process(r6, r0, r5, r4)
            if (r9 != 0) goto L89
            byte[][] r9 = r10.data
            r9 = r9[r2]
            java.lang.System.arraycopy(r5, r2, r9, r2, r3)
        L89:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.w.onAudioProcessFrameOut(com.tencent.thumbplayer.api.ITPPlayer, com.tencent.thumbplayer.api.TPPostProcessFrameBuffer):com.tencent.thumbplayer.api.TPPostProcessFrameBuffer");
    }
}
