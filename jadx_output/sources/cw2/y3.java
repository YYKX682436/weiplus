package cw2;

/* loaded from: classes10.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLivePlayView f224116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView) {
        super(1);
        this.f224116d = finderLivePlayView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        r45.s7 it = (r45.s7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = this.f224116d;
        mn0.b0 txLivePlayer = finderLivePlayView.getTxLivePlayer();
        if (txLivePlayer != null) {
            android.content.Context context = finderLivePlayView.getContext();
            if (!java.lang.Boolean.valueOf(context instanceof androidx.appcompat.app.AppCompatActivity).booleanValue()) {
                context = null;
            }
            if (context == null) {
                context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
            }
            java.lang.String valueOf = java.lang.String.valueOf(finderLivePlayView.O(context));
            if (finderLivePlayView.f130619x0) {
                str = finderLivePlayView.U + "_isPrepare";
            } else {
                str = finderLivePlayView.U;
            }
            ((mn0.y) txLivePlayer).r(valueOf, str, it.getInteger(0), it.getInteger(1));
        }
        return jz5.f0.f302826a;
    }
}
