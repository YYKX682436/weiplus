package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class hd implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jd f146993a;

    public hd(com.tencent.mm.plugin.luckymoney.ui.jd jdVar) {
        this.f146993a = jdVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewPrepareUIDefualtRedPacketSkinUIC", "[openSkinPlazaLiteApp] callback actionName: " + str);
        if (!kotlin.jvm.internal.o.b("returntomakeredenvelopspage", str)) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.luckymoney.ui.gd(this.f146993a));
        this.f146993a.O6(true);
        return false;
    }
}
