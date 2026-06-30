package kd2;

/* loaded from: classes2.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f306778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(cw2.wa waVar) {
        super(1);
        this.f306778d = waVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da view = (cw2.da) obj;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.String videoMediaId = view.getVideoMediaId();
        cw2.wa waVar = this.f306778d;
        if (kotlin.jvm.internal.o.b(videoMediaId, waVar != null ? waVar.f224096c : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playVideo, advance pause view, mediaId=");
            sb6.append(waVar != null ? waVar.f224096c : null);
            com.tencent.mars.xlog.Log.i("FinderVideoPassive", sb6.toString());
            view.pause();
        }
        return java.lang.Boolean.FALSE;
    }
}
