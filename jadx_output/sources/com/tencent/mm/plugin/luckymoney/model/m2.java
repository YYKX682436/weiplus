package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class m2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f145445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f145447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145448d;

    public m2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, gb3.i iVar, android.widget.ImageView imageView, long j17) {
        this.f145448d = w2Var;
        this.f145445a = iVar;
        this.f145446b = imageView;
        this.f145447c = j17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.w2.tj(new com.tencent.mm.plugin.luckymoney.model.l2(this, bitmap, i17, str));
    }
}
