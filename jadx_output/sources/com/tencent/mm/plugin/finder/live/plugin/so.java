package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class so extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f114291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f114292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so(com.tencent.mm.plugin.finder.live.plugin.ap apVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        super(0);
        this.f114291d = apVar;
        this.f114292e = finderJumpInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.widget.ImageView imageView;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f114291d;
        java.lang.Object obj = apVar.A.get(apVar.f111921v);
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) obj;
        if (!((tnVar == null || (atomicBoolean = tnVar.f114437d) == null || atomicBoolean.get()) ? false : true)) {
            obj = null;
        }
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar2 = (com.tencent.mm.plugin.finder.live.plugin.tn) obj;
        if (tnVar2 != null) {
            com.tencent.mm.plugin.finder.live.plugin.ap apVar2 = this.f114291d;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f114292e;
            apVar2.K0(0);
            ((je2.t) apVar2.P0(je2.t.class)).f299264g.postValue(null);
            tnVar2.f114437d.getAndSet(true);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "[showGiftAllLiveNotify], ");
            tnVar2.c();
            r45.bm1 b17 = dk2.i.f233596a.b(finderJumpInfo.getExt_info());
            com.tencent.mm.protobuf.g ext_buff = finderJumpInfo.getExt_buff();
            if (ext_buff != null) {
                r45.cj1 cj1Var = new r45.cj1();
                cj1Var.parseFrom(ext_buff.g());
                android.widget.TextView textView = tnVar2.f114448o.f114971c;
                if (textView != null) {
                    textView.setText(cj1Var.getString(4));
                }
                r45.kv1 kv1Var = (r45.kv1) cj1Var.getCustom(3);
                if (kv1Var != null && (imageView = tnVar2.f114448o.f114970b) != null) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.e().c(new mn2.q3(kv1Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329957h));
                }
            }
            android.view.View view = tnVar2.f114448o.f114969a;
            if (view != null) {
                view.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.qo(b17, finderJumpInfo, apVar2));
            }
            te2.u3 u3Var = te2.u3.f418468a;
            if (b17 == null || (str = b17.getString(0)) == null) {
                str = "";
            }
            u3Var.a(1, str);
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar2.B).get(apVar2.f111921v);
            if (valueAnimator != null) {
                valueAnimator.setDuration(5500L);
                valueAnimator.setEvaluator(new cn2.m(500, 5000, new com.tencent.mm.plugin.finder.live.plugin.ro(apVar2)));
            }
            android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar2.B).get(apVar2.f111921v);
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            tnVar2.f114451r = c01.id.c();
        }
        return jz5.f0.f302826a;
    }
}
