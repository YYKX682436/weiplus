package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class n implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f190980f;

    public n(com.tencent.mm.pluginsdk.ui.otherway.v vVar, java.lang.String str, yz5.l lVar) {
        this.f190978d = vVar;
        this.f190979e = str;
        this.f190980f = lVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.sdk.platformtools.o4 N;
        com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190978d;
        java.util.ArrayList arrayList = vVar.f191005f;
        java.lang.String str = this.f190979e;
        arrayList.removeIf(new com.tencent.mm.pluginsdk.ui.otherway.m(str));
        java.lang.String str2 = vVar.f191003d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "removeShortCupApp: " + str + ", " + str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && (N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null)) != null) {
            r45.j56 j56Var = new r45.j56();
            byte[] j17 = N.j("shortcut:" + str2);
            if (j17 != null) {
                j56Var.parseFrom(j17);
            }
            java.util.LinkedList linkedList = j56Var.f377596d;
            if (linkedList != null) {
                linkedList.remove(str);
            }
            N.H("shortcut:" + str2, j56Var.toByteArray());
        }
        this.f190980f.invoke(java.lang.Integer.valueOf(i17));
    }
}
