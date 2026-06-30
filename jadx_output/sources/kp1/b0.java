package kp1;

/* loaded from: classes11.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        super(0);
        this.f310883d = audioPanelTaskBarViewRecommendMusicList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r2 != null) goto L28;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.f92995z
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList r0 = r7.f310883d
            boolean r1 = r0.t()
            r2 = 1
            r1 = r1 ^ r2
            android.content.res.Resources r3 = r0.getResources()
            r4 = 2131773063(0x7f104687, float:1.9177503E38)
            java.lang.String r3 = r3.getString(r4)
            android.widget.TextView r4 = r0.f92998r
            r5 = 0
            if (r4 == 0) goto L91
            r4.setText(r3)
            if (r1 == 0) goto L2e
            android.content.res.Resources r3 = r4.getResources()
            r6 = 2131099717(0x7f060045, float:1.7811795E38)
            int r3 = r3.getColor(r6)
            r4.setTextColor(r3)
            goto L3c
        L2e:
            android.content.res.Resources r3 = r4.getResources()
            r6 = 2131099725(0x7f06004d, float:1.7811811E38)
            int r3 = r3.getColor(r6)
            r4.setTextColor(r3)
        L3c:
            java.lang.String r3 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.p(r0)
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.s(r0, r3, r1)
            bw5.o50 r3 = r0.f93001u
            bw5.lp0 r4 = r0.f93000t
            if (r4 == 0) goto L4d
            java.lang.String r5 = rk4.j5.d(r4)
        L4d:
            if (r5 == 0) goto L57
            int r4 = r5.length()
            if (r4 != 0) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            if (r2 != 0) goto L62
            bw5.lp0 r2 = r0.f93000t
            if (r2 == 0) goto L76
            java.lang.String r2 = rk4.j5.d(r2)
            goto L78
        L62:
            if (r3 == 0) goto L76
            bw5.g60 r2 = r3.e()
            if (r2 == 0) goto L76
            java.util.LinkedList r2 = r2.f27701e
            if (r2 == 0) goto L76
            java.lang.Object r2 = kz5.n0.Z(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L78
        L76:
            java.lang.String r2 = ""
        L78:
            java.lang.String r3 = "updateRecommendCover: "
            java.lang.String r3 = r3.concat(r2)
            java.lang.String r4 = "MicroMsg.AudioPanelTaskBarViewRecommendMusicList"
            com.tencent.mars.xlog.Log.i(r4, r3)
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.r(r0, r2, r1)
            qk.ia r1 = r0.getMCurrentPlayState()
            r0.n(r1)
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        L91:
            java.lang.String r0 = "recommendTitle"
            kotlin.jvm.internal.o.o(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kp1.b0.invoke():java.lang.Object");
    }
}
