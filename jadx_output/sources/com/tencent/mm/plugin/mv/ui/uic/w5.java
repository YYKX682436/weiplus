package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(int i17, com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        super(1);
        this.f151515d = i17;
        this.f151516e = z5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCatchFirstFrame, timeInMv:");
        int i17 = this.f151515d;
        sb6.append(i17);
        sb6.append(", thumb:");
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", sb6.toString());
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151516e;
        z5Var.f151586y = bitmap;
        z5Var.f151585x = i17;
        return jz5.f0.f302826a;
    }
}
