package en4;

/* loaded from: classes8.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ en4.f f255336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(en4.f fVar) {
        super(1);
        this.f255336d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm4.z state = (pm4.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof vm4.a)) {
            en4.f fVar = this.f255336d;
            android.os.Bundle bundleExtra = fVar.getActivity().getIntent().getBundleExtra("key_extra_data");
            if (bundleExtra != null) {
                androidx.appcompat.app.AppCompatActivity activity = fVar.getActivity();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211727q = bp.b.decodeResource(fVar.getActivity().getResources(), com.tencent.mm.R.raw.dialog_successful_icon, null);
                aVar.D = false;
                aVar.T = 3;
                aVar.A = false;
                aVar.B = false;
                aVar.f211713c = fVar.getActivity().getString(com.tencent.mm.R.string.f490940bb2);
                aVar.R = 17;
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(activity, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.w(fVar.getActivity().getString(com.tencent.mm.R.string.bay, bundleExtra.getString("_openbusinessview_app_name", "")), true, new en4.d(bundleExtra, bundleExtra.getString("_openbusinessview_package_name", "")));
                j0Var.A(fVar.getActivity().getString(com.tencent.mm.R.string.f490943bb5), true, en4.e.f255340d);
                j0Var.x(fVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478734fp));
                j0Var.show();
                jx3.f.INSTANCE.d(17080, 42, 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
