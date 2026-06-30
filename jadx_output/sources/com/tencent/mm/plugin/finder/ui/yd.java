package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class yd extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f130055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f130056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f130057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f130058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f130059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f130060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(int i17, com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, java.util.LinkedList linkedList, r45.mb4 mb4Var, android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        super(2);
        this.f130055d = i17;
        this.f130056e = finderSelectCoverUI;
        this.f130057f = linkedList;
        this.f130058g = mb4Var;
        this.f130059h = canvas;
        this.f130060i = bitmap;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int indexOf;
        r45.c07 c07Var;
        r45.c07 c07Var2;
        r45.c07 c07Var3;
        r45.c07 c07Var4;
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f130056e;
        int i17 = finderSelectCoverUI.W1;
        int i18 = this.f130055d;
        if (i18 == i17 && (indexOf = this.f130057f.indexOf(java.lang.Long.valueOf(longValue))) >= 0 && bitmap != null) {
            float m76 = finderSelectCoverUI.m7();
            int l76 = (int) finderSelectCoverUI.l7();
            r45.mb4 mb4Var = this.f130058g;
            boolean z17 = mb4Var.getBoolean(13);
            android.graphics.Canvas canvas = this.f130059h;
            if (z17) {
                r45.dd4 dd4Var = (r45.dd4) mb4Var.getCustom(14);
                canvas.drawBitmap(bitmap, finderSelectCoverUI.f7((dd4Var == null || (c07Var4 = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var4.getInteger(0), (dd4Var == null || (c07Var3 = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var3.getInteger(3), (dd4Var == null || (c07Var2 = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var2.getInteger(2), (dd4Var == null || (c07Var = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var.getInteger(1), (int) m76, l76), new android.graphics.Rect((int) (indexOf * m76), 0, (int) ((indexOf + 1) * m76), l76), (android.graphics.Paint) null);
            } else {
                canvas.drawBitmap(com.tencent.mm.sdk.platformtools.x.k0(bitmap, (int) m76, l76, false), indexOf * ((float) java.lang.Math.floor(m76)), 0.0f, (android.graphics.Paint) null);
            }
            finderSelectCoverUI.runOnUiThread(new com.tencent.mm.plugin.finder.ui.xd(i18, finderSelectCoverUI, this.f130060i));
        }
        return jz5.f0.f302826a;
    }
}
