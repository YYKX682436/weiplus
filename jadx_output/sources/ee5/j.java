package ee5;

/* loaded from: classes5.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f251930d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f251931e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f251932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final void O6(ee5.j jVar) {
        jVar.getClass();
        de5.a.f229396a.g(101);
        android.view.View inflate = com.tencent.mm.ui.id.b(jVar.getActivity()).inflate(com.tencent.mm.R.layout.bmc, (android.view.ViewGroup) null);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(jVar.getActivity(), 0, 0, false, false);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.czv)).setTextColor(jVar.getColor(com.tencent.mm.R.color.a0c));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cza)).setTextColor(jVar.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484087cz2);
        textView.setTextColor(jVar.getColor(com.tencent.mm.R.color.Link_100));
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484088cz3);
        textView2.setTextColor(jVar.getColor(com.tencent.mm.R.color.Link_100));
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.czi)).setVisibility(8);
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.czr)).setVisibility(8);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.gfr);
        button.setVisibility(0);
        android.widget.Button button2 = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.gfs);
        button2.setVisibility(0);
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.czg)).setImageResource(com.tencent.mm.R.drawable.c69);
        z2Var.j(inflate);
        z2Var.C();
        button.setOnClickListener(new ee5.f(z2Var));
        button2.setOnClickListener(new ee5.g(z2Var, jVar));
        textView.setOnClickListener(new ee5.h(jVar));
        textView2.setOnClickListener(new ee5.i(jVar, z2Var));
    }
}
