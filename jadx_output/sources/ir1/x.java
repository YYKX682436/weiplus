package ir1;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr1.e f294066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.u f294067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hr1.e eVar, ir1.u uVar) {
        super(1);
        this.f294066d = eVar;
        this.f294067e = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            hr1.e eVar = this.f294066d;
            boolean z17 = true;
            if (eVar.field_unReadCount > 0 && eVar.field_readStatus == 0) {
                java.lang.String str = eVar.field_sessionId;
                if ((str == null || str.length() == 0) || (!kotlin.jvm.internal.o.b(str, "bizfansgreetholder@bizfansmsg") && !kotlin.jvm.internal.o.b(str, "bizphotofansgreetholder@picfansmsg"))) {
                    z17 = false;
                }
                ir1.u uVar = this.f294067e;
                if (z17) {
                    uVar.f294056s.setVisibility(0);
                } else {
                    uVar.f294057t.setVisibility(0);
                    java.lang.String valueOf = java.lang.String.valueOf(eVar.field_unReadCount);
                    android.widget.TextView textView = uVar.f294057t;
                    textView.setText(valueOf);
                    textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(uVar.itemView.getContext(), eVar.field_unReadCount));
                    textView.setTextSize(0, i65.a.f(uVar.itemView.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(uVar.itemView.getContext()));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
