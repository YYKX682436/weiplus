package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ro implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.to f147393a;

    public ro(com.tencent.mm.plugin.luckymoney.ui.to toVar) {
        this.f147393a = toVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUIDefualtRedPacketSkinUIC", "[openSkinPlazaLiteApp] callback actionName: " + str);
        if (!kotlin.jvm.internal.o.b("returntomakeredenvelopspage", str)) {
            return false;
        }
        this.f147393a.O6(true);
        return false;
    }
}
