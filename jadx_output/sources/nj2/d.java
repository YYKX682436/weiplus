package nj2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.h f337830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nj2.h hVar) {
        super(3);
        this.f337830d = hVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.kf5 kf5Var = (r45.kf5) obj2;
        java.lang.String focusId = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(focusId, "focusId");
        if (!booleanValue && kf5Var != null) {
            nj2.h hVar = this.f337830d;
            android.widget.TextView textView = hVar.P;
            if (textView == null) {
                kotlin.jvm.internal.o.o("micPriceText");
                throw null;
            }
            textView.setText(java.lang.String.valueOf(kf5Var.f378658f));
            boolean z17 = kf5Var.f378662m;
            qo0.c f17 = hVar.I.f();
            qo0.b bVar = qo0.b.Q4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_FORCE_USER_ID", focusId);
            bundle.putInt("PARAM_FINDER_LIVE_MIC_MODE", z17 ? 2 : 1);
            f17.statusChange(bVar, bundle);
        }
        return jz5.f0.f302826a;
    }
}
