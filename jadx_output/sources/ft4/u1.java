package ft4;

/* loaded from: classes14.dex */
public final class u1 extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.view.View L;
    public final android.view.View M;
    public final android.view.View N;
    public final android.view.View P;
    public int Q;
    public ft4.t1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.content.Context context) {
        super(context, 0, 3);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ddw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(context.getString(com.tencent.mm.R.string.lhj));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.aa_)).setOnClickListener(new ft4.o1(this));
        s(inflate);
        android.view.View inflate2 = android.view.View.inflate(context, com.tencent.mm.R.layout.f489619de0, null);
        android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.f485528py4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.L = findViewById;
        android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.f485526py2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.M = findViewById2;
        android.view.View findViewById3 = inflate2.findViewById(com.tencent.mm.R.id.f485527py3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.N = findViewById3;
        android.view.View findViewById4 = inflate2.findViewById(com.tencent.mm.R.id.f485525py1);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.P = findViewById4;
        j(inflate2);
        findViewById.setOnClickListener(new ft4.p1(this));
        findViewById4.setOnClickListener(new ft4.q1(this));
        findViewById2.setOnClickListener(new ft4.r1(this));
        findViewById3.setOnClickListener(new ft4.s1(this));
    }

    public final void D(int i17) {
        this.Q = i17;
        android.view.View view = this.L;
        view.setSelected(false);
        android.view.View view2 = this.P;
        view2.setSelected(false);
        android.view.View view3 = this.M;
        view3.setSelected(false);
        android.view.View view4 = this.N;
        view4.setSelected(false);
        int i18 = this.Q;
        if (i18 == 101) {
            view2.setSelected(true);
            return;
        }
        if (i18 == 201) {
            view3.setSelected(true);
        } else if (i18 != 301) {
            view.setSelected(true);
        } else {
            view4.setSelected(true);
        }
    }
}
