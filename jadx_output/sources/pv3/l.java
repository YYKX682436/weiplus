package pv3;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f358609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f358610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pv3.m f358611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f358612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f358613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(in5.s0 s0Var, long j17, pv3.m mVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358609d = s0Var;
        this.f358610e = j17;
        this.f358611f = mVar;
        this.f358612g = finderObject;
        this.f358613h = audioCacheInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pv3.l(this.f358609d, this.f358610e, this.f358611f, this.f358612g, this.f358613h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pv3.l lVar = (pv3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        in5.s0 s0Var = this.f358609d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.uiv);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.rp8);
        android.view.KeyEvent.Callback findViewWithTag = frameLayout != null ? frameLayout.findViewWithTag("music_picker_video_view_tag") : null;
        zy2.g5 g5Var = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : null;
        android.view.View view = g5Var instanceof android.view.View ? (android.view.View) g5Var : null;
        java.lang.Object tag = view != null ? view.getTag(com.tencent.mm.R.id.uiw) : null;
        java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        long j17 = this.f358610e;
        boolean z17 = l17 == null || j17 != l17.longValue();
        pv3.m mVar = this.f358611f;
        java.lang.String str = mVar.f358615b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPlay] isPlayViewNull:");
        sb6.append(g5Var == null);
        sb6.append(" isDiffFeed:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (g5Var == null || z17) {
            i95.m c17 = i95.n0.c(c50.b1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.g5 Ri = ((c61.s9) ((c50.b1) c17)).Ri(this.f358612g, "", 0L, null, new pv3.i(this.f358611f, frameLayout, p17, this.f358610e, this.f358609d), new pv3.j(mVar, j17, this.f358613h));
            ((zy2.p7) Ri).setFluentSwitchCompleteCallback(new pv3.k(mVar, p17, s0Var));
            mVar.a(p17);
            mVar.b(s0Var, false);
            android.view.View view2 = (android.view.View) Ri;
            view2.setTag("music_picker_video_view_tag");
            view2.setTag(com.tencent.mm.R.id.uiw, new java.lang.Long(j17));
            if (frameLayout != null) {
                frameLayout.addView(view2, new android.widget.FrameLayout.LayoutParams(-1, -1));
            }
            Ri.setMute(false);
            zy2.g5.u(Ri, null, 1, null);
        } else {
            g5Var.setMute(false);
            g5Var.play();
        }
        return jz5.f0.f302826a;
    }
}
