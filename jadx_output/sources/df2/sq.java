package df2;

/* loaded from: classes3.dex */
public final class sq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(df2.ar arVar) {
        super(0);
        this.f231365d = arVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.ar arVar = this.f231365d;
        int intValue = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) arVar.f229742r).getValue()).intValue();
        kotlinx.coroutines.flow.j2 j2Var = arVar.f229742r;
        if (intValue > 0) {
            android.widget.TextView d76 = arVar.d7();
            if (d76 != null) {
                d76.setText(no0.l.a(no0.m.f338730a, ((java.lang.Number) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).intValue(), ":", false, false, false, 24, null));
            }
            android.widget.TextView d77 = arVar.d7();
            if (d77 != null) {
                d77.setVisibility(0);
            }
        } else if (((java.lang.Number) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).intValue() == 0) {
            android.widget.TextView d78 = arVar.d7();
            if (d78 != null) {
                d78.setText(arVar.O6().getResources().getString(com.tencent.mm.R.string.f491555nq2));
            }
            android.widget.TextView d79 = arVar.d7();
            if (d79 != null) {
                d79.setVisibility(0);
            }
        }
        if (((java.lang.Number) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).intValue() > 0) {
            ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Integer.valueOf(((java.lang.Number) r2.getValue()).intValue() - 1));
        }
        return jz5.f0.f302826a;
    }
}
