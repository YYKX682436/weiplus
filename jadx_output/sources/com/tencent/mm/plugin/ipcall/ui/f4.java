package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class f4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142828e;

    public f4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI, java.lang.String str) {
        this.f142828e = iPCallShareCouponCardUI;
        this.f142827d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$14", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142828e;
        ((android.widget.TextView) view).setHighlightColor(iPCallShareCouponCardUI.getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13340, -1, -1, -1, -1, 1);
        db5.e1.F(iPCallShareCouponCardUI.getContext(), this.f142827d, iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.g6d), true).z(com.tencent.mm.R.string.g3i, new com.tencent.mm.plugin.ipcall.ui.e4(this));
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$14", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f142828e.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        textPaint.setUnderlineText(false);
    }
}
