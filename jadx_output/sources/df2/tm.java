package df2;

/* loaded from: classes3.dex */
public final class tm implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231456d;

    public tm(df2.cn cnVar) {
        this.f231456d = cnVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        df2.cn cnVar = this.f231456d;
        com.tencent.mars.xlog.Log.i(cnVar.f229892p, "[hasLikedLive] b = " + bool);
        android.view.View f76 = cnVar.f7(cnVar);
        if (f76 != null && f76.getVisibility() == 0) {
            kotlin.jvm.internal.o.d(bool);
            if (bool.booleanValue()) {
                android.widget.TextView c76 = cnVar.c7();
                if (c76 != null) {
                    c76.setText(cnVar.O6().getString(com.tencent.mm.R.string.m89));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView b76 = cnVar.b7();
                if (b76 == null) {
                    return;
                }
                b76.setVisibility(8);
                return;
            }
            android.widget.TextView c77 = cnVar.c7();
            if (c77 != null) {
                c77.setText(cnVar.O6().getString(com.tencent.mm.R.string.m8_));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView b77 = cnVar.b7();
            if (b77 == null) {
                return;
            }
            b77.setVisibility(0);
        }
    }
}
