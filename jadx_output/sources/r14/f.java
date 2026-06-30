package r14;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f368613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r14.y yVar) {
        super(1);
        this.f368613d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 6, it);
        doFavoriteEvent.f54090g.f6327m = 44;
        doFavoriteEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulSelfQRCodeDialogHelper", "[fav] path:%s", it);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f368613d.f368633a.getResources().getString(com.tencent.mm.R.string.c9o), 1).show();
        return jz5.f0.f302826a;
    }
}
