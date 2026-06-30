package te2;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m f418395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(te2.p1 p1Var, bm2.m mVar) {
        super(3);
        this.f418394d = p1Var;
        this.f418395e = mVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var;
        com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam;
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        dk2.vg musicItem = (dk2.vg) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        te2.p1 p1Var = this.f418394d;
        int i17 = ((mm2.c1) p1Var.f418287e.a(mm2.c1.class)).Z6().f233875d;
        tn0.w0 f17 = dk2.ef.f233372a.f();
        java.lang.Integer num = null;
        if (f17 != null && (audioMusicParam = f17.L) != null) {
            num = java.lang.Integer.valueOf(audioMusicParam.f46245id);
        }
        java.lang.String string = musicItem.f234254a.getString(7);
        bm2.m mVar = this.f418395e;
        com.tencent.mars.xlog.Log.i(mVar.f22075i, "itemClickListener curPlayPos:" + i17 + " newPos:" + intValue + " bgMusicId:" + num + " songPlayId:" + string);
        te2.d4 d4Var = te2.d4.f417948a;
        gk2.e eVar = p1Var.f418287e;
        if (intValue != i17) {
            te2.j0.M3(this.f418394d, musicItem, intValue, false, 4, null);
            boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
            ml2.u2[] u2VarArr = ml2.u2.f328109d;
            d4Var.a(a86, 8, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), p1Var.f418297r);
            d4Var.c(p1Var.h(), 1, musicItem, true, false);
        } else {
            int i18 = musicItem.f234255b;
            com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicPresenter", "changeState " + musicItem + " pos:" + intValue);
            if (i18 == 1) {
                d4Var.c(p1Var.h(), 3, musicItem, false, true);
                p1Var.i(musicItem, intValue);
            } else if (i18 != 2) {
                d4Var.c(p1Var.h(), 1, musicItem, true, false);
                te2.j0.M3(p1Var, musicItem, intValue, false, 4, null);
                boolean a87 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr2 = ml2.u2.f328109d;
                d4Var.a(a87, 8, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), p1Var.f418297r);
            } else {
                d4Var.c(p1Var.h(), 1, musicItem, true, false);
                p1Var.p(musicItem, intValue);
                boolean a88 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
                ml2.u2[] u2VarArr3 = ml2.u2.f328109d;
                d4Var.a(a88, 8, ((mm2.c1) eVar.a(mm2.c1.class)).Z6().e(), p1Var.f418297r);
            }
        }
        int size = mVar.f22077n.size();
        mVar.notifyItemChanged(i17 + size);
        mVar.notifyItemChanged(size + intValue);
        te2.k0 k0Var = p1Var.f418290h;
        if (k0Var != null && (d7Var = ((te2.q1) k0Var).f418350i) != null) {
            d7Var.e0(true);
        }
        return jz5.f0.f302826a;
    }
}
