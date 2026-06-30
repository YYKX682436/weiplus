package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145389f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gb3.i f145390g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145391h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f145392i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145393m;

    public k2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str, gb3.i iVar, android.widget.ImageView imageView, long j17) {
        this.f145393m = w2Var;
        this.f145387d = bitmap;
        this.f145388e = i17;
        this.f145389f = str;
        this.f145390g = iVar;
        this.f145391h = imageView;
        this.f145392i = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gb3.i iVar = this.f145390g;
        int i17 = this.f145388e;
        android.graphics.Bitmap bitmap = this.f145387d;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), this.f145389f);
            if (iVar != null) {
                iVar.onComplete(false);
                return;
            }
            return;
        }
        android.widget.ImageView imageView = this.f145391h;
        int intValue = ((java.lang.Integer) imageView.getTag(com.tencent.mm.R.id.j19)).intValue();
        if (intValue <= 0 || intValue != i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subType: %s, %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i17));
        } else {
            imageView.setImageBitmap(bitmap);
        }
        if (iVar != null) {
            iVar.onComplete(true);
        }
        if (imageView.getId() == com.tencent.mm.R.id.nni) {
            com.tencent.mm.plugin.luckymoney.model.w2.wi(this.f145393m, this.f145391h, this.f145389f, 3, this.f145388e, this.f145392i);
        }
    }
}
