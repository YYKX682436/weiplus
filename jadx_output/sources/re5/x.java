package re5;

/* loaded from: classes8.dex */
public final class x extends lf3.o implements re5.a, kg3.d, com.tencent.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f394603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // kg3.d
    public void H2() {
    }

    @Override // lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.e5h;
    }

    public void V6(boolean z17, gg3.c videoLoadParam) {
        kotlin.jvm.internal.o.g(videoLoadParam, "videoLoadParam");
        android.widget.RelativeLayout relativeLayout = this.f394603d;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(z17 ? 0 : 8);
        }
        if (z17) {
            java.lang.String str = videoLoadParam.f271728c;
            java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2(com.tencent.mm.pluginsdk.ui.tools.f.e(n17), str);
            g2Var.f189310c = videoLoadParam.f271729d;
            g2Var.f189311d = n17;
            g2Var.f189315h = 3;
            re5.w wVar = new re5.w();
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.otherway.u0 u0Var = new com.tencent.mm.pluginsdk.ui.otherway.u0(activity, g2Var, wVar);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vml);
            if (textView != null) {
                textView.setOnClickListener(new re5.v(u0Var, textView));
            }
        }
    }

    @Override // kg3.d
    public void h4() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        this.f394603d = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.vm_);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oyz);
        if (textView != null) {
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.pc8));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vml);
        if (textView2 != null) {
            textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.pc7));
            textView2.setClickable(true);
        }
    }
}
