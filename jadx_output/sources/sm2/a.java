package sm2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.f f409346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sm2.f fVar) {
        super(0);
        this.f409346d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.assist.u8 u8Var = com.tencent.mm.plugin.finder.assist.u8.f102599a;
        sm2.f fVar = this.f409346d;
        u8Var.b(fVar.f19609a, com.tencent.mm.plugin.finder.assist.u8.f102604f > 0 ? 1 : 0, 0, "anchorEnd", "0-vBitrate:" + hn0.v.f282442c);
        com.tencent.mars.xlog.Log.i("Finder.LiveStatisticsReport", "anchorStatisticsReport reset");
        com.tencent.mm.plugin.finder.assist.u8.f102600b = 0L;
        com.tencent.mm.plugin.finder.assist.u8.f102601c = 0L;
        com.tencent.mm.plugin.finder.assist.u8.f102602d = 0L;
        com.tencent.mm.plugin.finder.assist.u8.f102603e = 0L;
        com.tencent.mm.plugin.finder.assist.u8.f102604f = 0L;
        com.tencent.mm.plugin.finder.assist.u8.f102606h = 0;
        com.tencent.mm.plugin.finder.assist.u8.f102605g = 1;
        fm2.a aVar = fVar.f19595c;
        if (aVar != null) {
            sm2.o4 o4Var = aVar.f264017e;
            com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = o4Var.f409616i;
            if (o9Var != null) {
                o9Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.fa faVar = o4Var.R;
            if (faVar != null) {
                faVar.K0(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
