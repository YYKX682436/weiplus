package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class ep implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.luckymoney.ui.ep f146887a = new com.tencent.mm.plugin.luckymoney.ui.ep();

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[doRouter] callback actionName: " + str);
        return false;
    }
}
