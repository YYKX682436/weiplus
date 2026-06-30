package w41;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final w41.u f442888a = new w41.u();

    public static final void a(w41.u uVar, boolean z17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        uVar.getClass();
        android.content.Context context = y1Var.f212027f.getContext();
        if (z17) {
            y1Var.r(false);
        } else {
            db5.e1.E(context, context.getString(com.tencent.mm.R.string.g0f), "", context.getString(com.tencent.mm.R.string.g0e), false, null);
        }
    }

    public final void b(android.content.Context context, java.lang.String talkUsername) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkUsername, "talkUsername");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        y1Var.j(com.tencent.mm.R.layout.bom);
        android.view.ViewGroup viewGroup = y1Var.B;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.f485328hb1);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485330hb3);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485332hb5);
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.f485331hb4);
        android.widget.Button button2 = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.f485327hb0);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485329hb2);
        k41.h1 h1Var = k41.h1.f304007d;
        k41.g0 c17 = k41.o0.c(talkUsername);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuLocReqDialog", "%s maybe is wrong? getContactFromLocal return null", talkUsername);
            return;
        }
        com.tencent.mm.pluginsdk.ui.u.a(imageView, c17.field_username);
        textView.setText(c17.field_nickname);
        textView2.setText(t41.g.b(c17.u0()));
        y1Var.s();
        textView3.setOnClickListener(new w41.m(viewGroup));
        button.setOnClickListener(new w41.o(viewGroup, c17, y1Var));
        button2.setOnClickListener(new w41.s(viewGroup, c17, y1Var));
    }
}
