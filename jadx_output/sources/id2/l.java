package id2;

/* loaded from: classes3.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f290650d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f290651e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f290652f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f290653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290650d = "";
        this.f290651e = true;
        this.f290653g = jz5.h.b(new id2.k(activity));
    }

    public static final void O6(id2.l lVar, mm2.y6 y6Var, com.tencent.neattextview.textview.view.NeatTextView neatTextView, android.widget.Button button) {
        java.lang.String string;
        boolean z17 = false;
        if (lVar.f290652f) {
            neatTextView.b(lVar.getContext().getString(com.tencent.mm.R.string.nvx));
            button.setEnabled(false);
            button.setTextColor(lVar.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
            return;
        }
        button.setEnabled(true);
        if (y6Var.d()) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d3d);
            kotlin.jvm.internal.o.d(string);
        } else if (y6Var.f329582f == 1) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ea7);
            kotlin.jvm.internal.o.d(string);
        } else {
            if (y6Var.f329583g.size() == 1 && pm0.v.z(y6Var.f329581e, 2) && !pm0.v.z(y6Var.f329581e, 229)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nvv);
                kotlin.jvm.internal.o.d(string);
            } else if (pm0.v.z(y6Var.f329581e, 7)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ehc);
                kotlin.jvm.internal.o.d(string);
            } else if (y6Var.f329582f == 1) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ea7);
                kotlin.jvm.internal.o.d(string);
            } else {
                int i17 = y6Var.f329581e;
                if (i17 == 8) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491866eh4);
                    kotlin.jvm.internal.o.d(string);
                } else {
                    if (i17 == 16) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lvo);
                        kotlin.jvm.internal.o.d(string);
                    } else {
                        if (pm0.v.z(i17, 8) && pm0.v.z(y6Var.f329581e, 16)) {
                            z17 = true;
                        }
                        if (z17) {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lvv);
                            kotlin.jvm.internal.o.d(string);
                        } else {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nvw);
                            kotlin.jvm.internal.o.d(string);
                        }
                    }
                }
            }
        }
        neatTextView.b(string);
        button.setTextColor(lVar.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    public final id2.z3 P6() {
        return (id2.z3) ((jz5.n) this.f290653g).getValue();
    }
}
