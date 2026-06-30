package gx0;

/* loaded from: classes5.dex */
public final class gh implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f276484d;

    public gh(gx0.kh khVar) {
        this.f276484d = khVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        gx0.bh bhVar = (gx0.bh) this.f276484d.T6(gx0.bh.class);
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bhVar.f276268x;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("revokeButton");
            throw null;
        }
        weImageView.setEnabled(booleanValue);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = bhVar.f276268x;
        if (weImageView2 != null) {
            weImageView2.setIconColor(booleanValue ? ((java.lang.Number) ((jz5.n) bhVar.f276261J).getValue()).intValue() : ((java.lang.Number) ((jz5.n) bhVar.K).getValue()).intValue());
        } else {
            kotlin.jvm.internal.o.o("revokeButton");
            throw null;
        }
    }
}
