package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes11.dex */
public class m1 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f144442a;

    public m1(com.tencent.mm.plugin.lite.ui.o1 o1Var, com.tencent.mm.plugin.lite.s sVar) {
        this.f144442a = sVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        boolean equals = str.equals("setData");
        com.tencent.mm.plugin.lite.s sVar = this.f144442a;
        if (equals) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("nativePointer", "setData from native");
            sVar.d(hashMap);
            return false;
        }
        if (!str.equals("throwError")) {
            sVar.c(j17, i17, "dispatch from native");
            return false;
        }
        sVar.getClass();
        ((java.util.HashSet) sVar.f144164a).remove(java.lang.String.format("%d_%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17)));
        com.tencent.mm.plugin.lite.LiteAppCenter.storeSendResult(sVar.f144166c, j17, i17, "error", com.tencent.mm.plugin.lite.s.b("throwError from native", "{}"));
        return false;
    }
}
