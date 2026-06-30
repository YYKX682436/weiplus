package sz4;

/* loaded from: classes12.dex */
public class i extends sz4.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f414198f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f414199g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f414200h;

    public i(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kek);
        this.f414200h = linearLayout;
        linearLayout.setVisibility(0);
        this.f414198f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kem);
        this.f414199g = view.findViewById(com.tencent.mm.R.id.kel);
    }

    @Override // sz4.a
    public int i() {
        return -3;
    }

    @Override // sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        if (cVar.d() != -3) {
            return;
        }
        int i19 = this.f414182d.f333309q;
        android.widget.LinearLayout linearLayout = this.f414200h;
        if (i19 == 3) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        iz4.e eVar = (iz4.e) cVar;
        if (eVar.f296116t <= 0) {
            return;
        }
        android.widget.TextView textView = this.f414198f;
        android.content.Context context = textView.getContext();
        long j17 = eVar.f296116t;
        java.lang.Object format = j17 < 3600000 ? "" : android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.cbf), j17);
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.h_q) + " " + format);
    }
}
