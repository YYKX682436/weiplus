package xu2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.u f457223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f457224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xu2.u uVar, boolean z17) {
        super(0);
        this.f457223d = uVar;
        this.f457224e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xu2.u uVar = this.f457223d;
        if (!((mm2.c1) uVar.S0().a(mm2.c1.class)).L5) {
            android.view.ViewGroup viewGroup = uVar.f365323d;
            boolean z17 = this.f457224e;
            if (z17 || uVar.v1() <= 0) {
                ((mm2.c1) uVar.S0().a(mm2.c1.class)).L5 = true;
                if (z17) {
                    ((mm2.c1) uVar.S0().a(mm2.c1.class)).K5 = ((mm2.c1) uVar.S0().a(mm2.c1.class)).J5;
                }
                android.widget.TextView textView = uVar.f457233s;
                if (textView != null) {
                    textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d2c));
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = uVar.f457235u;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
                db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d2c));
            } else {
                ((mm2.c1) uVar.S0().a(mm2.c1.class)).L5 = false;
                android.widget.TextView textView2 = uVar.f457233s;
                if (textView2 != null) {
                    textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d2b, java.lang.String.valueOf(uVar.v1())));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
