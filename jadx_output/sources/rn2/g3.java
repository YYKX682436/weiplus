package rn2;

/* loaded from: classes15.dex */
public final class g3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f397750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.z2 f397751e;

    public g3(rn2.h3 h3Var, rn2.z2 z2Var) {
        this.f397750d = h3Var;
        this.f397751e = z2Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        rn2.h3 h3Var = this.f397750d;
        java.lang.Object obj = h3Var.x().get(this.f397751e.getAdapterPosition());
        kotlin.jvm.internal.o.f(obj, "get(...)");
        rn2.y2 y2Var = (rn2.y2) obj;
        java.lang.Integer h17 = r26.h0.h(p07.toString());
        int intValue = h17 != null ? h17.intValue() : 0;
        if (y2Var.f397928c.getInteger(1) != intValue) {
            y2Var.f397928c.set(1, java.lang.Integer.valueOf(intValue));
            yz5.a aVar = h3Var.f397759e;
            if (aVar != null) {
                aVar.invoke();
            }
            h3Var.notifyDataSetChanged();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
