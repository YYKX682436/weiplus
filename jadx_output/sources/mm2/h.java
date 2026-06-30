package mm2;

/* loaded from: classes10.dex */
public final class h extends com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout {
    public r45.ce2 A;
    public long B;
    public long C;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f329098t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f329099u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.p f329100v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.p f329101w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f329102x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f329103y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f329104z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void d(java.lang.String str) {
        yz5.a aVar = this.f329104z;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void e() {
        yz5.a aVar = this.f329102x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final r45.ce2 getCurLiveAdInfo() {
        return this.A;
    }

    public final long getCurStartPlayTime() {
        return this.B;
    }

    public final yz5.a getOnFirstFrameRendered() {
        return this.f329099u;
    }

    public final yz5.p getOnProgressChange() {
        return this.f329100v;
    }

    public final yz5.p getOnStateChange() {
        return this.f329101w;
    }

    public final yz5.a getOnVideoBufferingStart() {
        return this.f329104z;
    }

    public final yz5.a getOnVideoComplete() {
        return this.f329102x;
    }

    public final yz5.a getOnVideoError() {
        return this.f329103y;
    }

    public final yz5.p getOnVideoSizeChange() {
        return this.f329098t;
    }

    public final long getVideoTotalTime() {
        return this.C;
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void i(rh3.o mp6, int i17, int i18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        super.i(mp6, i17, i18);
        yz5.a aVar = this.f329103y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void j(java.lang.String invokeSource, int i17) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        super.j(invokeSource, i17);
        yz5.a aVar = this.f329099u;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void l(rh3.o mp6, long j17, long j18) {
        kotlin.jvm.internal.o.g(mp6, "mp");
        yz5.p pVar = this.f329100v;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void n(int i17, int i18) {
        yz5.p pVar = this.f329098t;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    public final void setCurLiveAdInfo(r45.ce2 ce2Var) {
        this.A = ce2Var;
    }

    public final void setCurStartPlayTime(long j17) {
        this.B = j17;
    }

    public final void setMute(boolean z17) {
        getPlayer().setOutputMute(z17);
    }

    public final void setOnFirstFrameRendered(yz5.a aVar) {
        this.f329099u = aVar;
    }

    public final void setOnProgressChange(yz5.p pVar) {
        this.f329100v = pVar;
    }

    public final void setOnStateChange(yz5.p pVar) {
        this.f329101w = pVar;
    }

    public final void setOnVideoBufferingStart(yz5.a aVar) {
        this.f329104z = aVar;
    }

    public final void setOnVideoComplete(yz5.a aVar) {
        this.f329102x = aVar;
    }

    public final void setOnVideoError(yz5.a aVar) {
        this.f329103y = aVar;
    }

    public final void setOnVideoSizeChange(yz5.p pVar) {
        this.f329098t = pVar;
    }

    public final void setVideoTotalTime(long j17) {
        this.C = j17;
    }

    @Override // com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout
    public void t() {
        super.t();
        this.f329098t = null;
        this.f329099u = null;
        this.f329100v = null;
        this.f329101w = null;
        this.f329102x = null;
        this.f329103y = null;
        this.f329104z = null;
    }

    public final boolean u(r45.ce2 ce2Var, long j17, yz5.a onCreateView) {
        kotlin.jvm.internal.o.g(onCreateView, "onCreateView");
        if (ce2Var == null) {
            com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "loadVideo return for loadVideo:" + ce2Var);
            return false;
        }
        java.lang.String string = ce2Var.getString(3);
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "loadVideo return for url:".concat(string));
            return false;
        }
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "loadVideo start play startPositionMs:" + j17 + " duration:" + ce2Var.getLong(2) + " url:" + string);
        rh3.q qVar = new rh3.q();
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(string.getBytes());
        java.lang.String a17 = zz0.a.f477696a.a("", b17, string);
        wh3.c cVar = wh3.d.f445967d;
        kotlin.jvm.internal.o.d(b17);
        wh3.b dVar = new wh3.d(b17, string, cVar.a(b17, string, a17));
        qVar.d(dVar, ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Bi(qVar, dVar, b17, b17));
        onCreateView.invoke();
        this.A = ce2Var;
        a(qVar, dVar);
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.p(this, true, 0, 0, 0, 0, null, 62, null);
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(this, null, j17, 1, null);
        return true;
    }
}
