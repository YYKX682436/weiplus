package uo1;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final uo1.w f429597a = new uo1.w();

    public final void a(android.app.Activity activity, int i17, java.lang.String str, long j17, boolean z17, yz5.l dismissCallback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(dismissCallback, "dismissCallback");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = i17;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = j17 >= 0 ? eo1.a.f255545a.a(j17) : 0L;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.dpy, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.rci);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rcj);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rck);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) inflate.findViewById(com.tencent.mm.R.id.rch);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = (com.tencent.mm.ui.widget.MMSwitchBtn) inflate.findViewById(com.tencent.mm.R.id.rcl);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = (com.tencent.mm.ui.widget.MMSwitchBtn) inflate.findViewById(com.tencent.mm.R.id.rcm);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.rcn);
        y1Var.f212037s = new uo1.a(i17, f0Var, g0Var, dismissCallback);
        imageView.setOnClickListener(new uo1.b(y1Var));
        textView.setText(str == null || str.length() == 0 ? activity.getString(com.tencent.mm.R.string.f492863my0) : activity.getString(com.tencent.mm.R.string.f492864my1, str));
        uo1.i iVar = new uo1.i(f0Var, linearLayout, mMSwitchBtn, g0Var, textView2, activity, mMSwitchBtn2, mMSwitchBtn3);
        iVar.invoke();
        mMSwitchBtn.setSwitchListener(new uo1.f(z17, y1Var, f0Var, g0Var, j17, iVar));
        mMSwitchBtn2.setSwitchListener(new uo1.g(f0Var));
        mMSwitchBtn3.setSwitchListener(new uo1.h(f0Var));
        y1Var.k(inflate);
        y1Var.s();
    }
}
