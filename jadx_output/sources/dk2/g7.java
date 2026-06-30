package dk2;

/* loaded from: classes3.dex */
public final class g7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(java.lang.String str) {
        super(1);
        this.f233509d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.libpag.PAGFile pagFile = (org.libpag.PAGFile) obj;
        kotlin.jvm.internal.o.g(pagFile, "pagFile");
        java.util.HashMap hashMap = dk2.u7.f234192l;
        java.lang.String str = this.f233509d;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
        if (l17 == null) {
            l17 = 0L;
        }
        if (0 == l17.longValue()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.Q1));
            mMPAGView.setComposition(pagFile);
            hashMap.put(str, java.lang.Long.valueOf(mMPAGView.c()));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "[syncPagFromLiveMsg] giftFullPagDurationMap: giftId = " + str + ", duration = " + hashMap.get(str));
        }
        return jz5.f0.f302826a;
    }
}
