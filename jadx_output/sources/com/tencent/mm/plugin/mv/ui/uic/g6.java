package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f151144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f151145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk4.u f151146g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var, android.widget.FrameLayout frameLayout, pk4.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151144e = h6Var;
        this.f151145f = frameLayout;
        this.f151146g = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.g6(this.f151144e, this.f151145f, this.f151146g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.g6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f151143d;
        com.tencent.mm.plugin.mv.ui.uic.h6 h6Var = this.f151144e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.mv.ui.uic.f6 f6Var = new com.tencent.mm.plugin.mv.ui.uic.f6(h6Var, null);
            this.f151143d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, f6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.tencent.mars.xlog.Log.i(h6Var.f151179d, "init mediaInfoList:" + linkedList.size());
        boolean isEmpty = linkedList.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (isEmpty) {
            return f0Var;
        }
        android.widget.FrameLayout frameLayout = this.f151145f;
        frameLayout.setAlpha(0.0f);
        df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
        androidx.appcompat.app.AppCompatActivity context = h6Var.getActivity();
        ((cf0.c0) tVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout multiMediaEffectVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout(context);
        multiMediaEffectVideoLayout.setId(com.tencent.mm.R.id.k0o);
        multiMediaEffectVideoLayout.setMediaChangeListener(this.f151146g);
        multiMediaEffectVideoLayout.setMvMusicProxy(new com.tencent.mm.plugin.mv.ui.uic.c6());
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        frameLayout.removeAllViews();
        frameLayout.addView(multiMediaEffectVideoLayout, layoutParams);
        multiMediaEffectVideoLayout.setMute(true);
        multiMediaEffectVideoLayout.setLoop(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((jk4.f) next).f234478o > 0) {
                arrayList.add(next);
            }
        }
        multiMediaEffectVideoLayout.setMediaList(arrayList);
        com.tencent.mars.xlog.Log.i(multiMediaEffectVideoLayout.f174564d, "startIgnoreMusicPosition");
        multiMediaEffectVideoLayout.f174566f.k();
        multiMediaEffectVideoLayout.f174567g = -1L;
        boolean z17 = h6Var.f151187o;
        java.lang.String str = h6Var.f151179d;
        if (z17) {
            h6Var.f151187o = false;
            if (h6Var.getIntent().getBooleanExtra("key_seek_to_start", false)) {
                com.tencent.mars.xlog.Log.i(str, "first time play and music seek to start");
            } else {
                int a17 = kl3.t.g().a().a();
                pk4.c cVar = h6Var.f151186n;
                if (cVar != null) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).d(a17);
                }
                com.tencent.mars.xlog.Log.i(str, "first time play and music seek to " + a17);
            }
        } else {
            int a18 = kl3.t.g().a().a();
            pk4.c cVar2 = h6Var.f151186n;
            if (cVar2 != null) {
                ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).d(a18);
            }
            com.tencent.mars.xlog.Log.i(str, "first time play and music seek to " + a18);
        }
        multiMediaEffectVideoLayout.setOnProgressCallback(new com.tencent.mm.plugin.mv.ui.uic.d6(h6Var));
        multiMediaEffectVideoLayout.setFirstFrameRenderCallback(new com.tencent.mm.plugin.mv.ui.uic.e6(frameLayout));
        multiMediaEffectVideoLayout.setKeepScreenOn(true);
        h6Var.f151186n = multiMediaEffectVideoLayout;
        return f0Var;
    }
}
