package nj2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.h f337831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nj2.h hVar) {
        super(1);
        this.f337831d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.kf5 kf5Var;
        r45.nu1 nu1Var = (r45.nu1) obj;
        if (nu1Var != null) {
            nj2.h hVar = this.f337831d;
            int i17 = 0;
            hVar.f0(false);
            r45.r7 r7Var = (r45.r7) nu1Var.getCustom(1);
            int integer = r7Var != null ? r7Var.getInteger(0) : 0;
            android.widget.TextView textView = hVar.Q;
            if (textView == null) {
                kotlin.jvm.internal.o.o("serviceText");
                throw null;
            }
            android.content.Context context = hVar.f118183e;
            textView.setText(integer > 0 ? context.getResources().getString(com.tencent.mm.R.string.mmt, java.lang.Integer.valueOf(integer)) : context.getResources().getString(com.tencent.mm.R.string.mms));
            android.widget.TextView textView2 = hVar.P;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("micPriceText");
                throw null;
            }
            r45.il4 il4Var = ((mm2.o4) hVar.H.a(mm2.o4.class)).U;
            if (il4Var != null && (kf5Var = il4Var.f377132g) != null) {
                i17 = kf5Var.f378658f;
            }
            textView2.setText(java.lang.String.valueOf(i17));
            nj2.h.e0(hVar).n();
            ((mj2.f) ((jz5.n) hVar.N).getValue()).r("onBind");
        }
        return jz5.f0.f302826a;
    }
}
