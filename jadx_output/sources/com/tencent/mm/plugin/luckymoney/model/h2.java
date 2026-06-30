package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class h2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f145309a;

    public h2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, gb3.i iVar) {
        this.f145309a = iVar;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        gb3.i iVar = this.f145309a;
        if (bitmap == null || bitmap.isRecycled()) {
            iVar.onComplete(false);
        } else {
            iVar.onComplete(true);
        }
    }
}
