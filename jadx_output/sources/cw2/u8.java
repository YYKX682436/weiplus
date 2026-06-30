package cw2;

/* loaded from: classes2.dex */
public final class u8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.h8 f224052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, cw2.h8 h8Var) {
        super(1);
        this.f224051d = finderVideoLayout;
        this.f224052e = h8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.report.r0 a76;
        cw2.da daVar = (cw2.da) obj;
        if (daVar != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224051d;
            finderVideoLayout.setVideoView(daVar);
            cw2.h8 h8Var = this.f224052e;
            mn2.g4 g4Var = h8Var.f223747c;
            com.tencent.mm.plugin.finder.storage.FeedData feedData = h8Var.f223745a;
            feedData.getExpectId();
            if (!kotlin.jvm.internal.o.b(daVar.getVideoMediaId(), h8Var.f223747c.n())) {
                cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
                if (seekBarLayout != null) {
                    seekBarLayout.setVisibility(0);
                }
                daVar.setAlpha(0.0f);
                finderVideoLayout.Q(daVar, g4Var, h8Var.f223750f, feedData);
            }
            if (daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
                android.content.Context context = finderVideoLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar != null && (a76 = nyVar.a7(-1)) != null && (a76 instanceof com.tencent.mm.plugin.finder.report.k4)) {
                    ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar).setCommentScene(a76.f125284h.getInteger(5));
                }
            }
            daVar.setLoop(finderVideoLayout.isLoop);
            daVar.F();
            com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "[FinderVideoLayout#prepareToPlay] layout=[" + finderVideoLayout.getWidth() + ':' + finderVideoLayout.getHeight() + "] videoView=[" + daVar.getWidth() + ':' + daVar.getHeight() + "] video=[" + g4Var.f330002e.getFloat(4) + ':' + g4Var.f330002e.getFloat(5) + "] " + finderVideoLayout.d0() + " media=" + g4Var + ' ');
        }
        return jz5.f0.f302826a;
    }
}
