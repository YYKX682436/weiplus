package j93;

/* loaded from: classes.dex */
public final class w extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f298525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void O6() {
        android.view.Window window;
        b93.l.a(b93.l.f18596a, getIntent().getIntExtra("key_label_click_source", 0), 4, 0, 0, 0, 28, null);
        db5.f3 f3Var = new db5.f3(getActivity(), false);
        com.tencent.mm.ui.widget.dialog.a4 a4Var = f3Var.f212055d;
        if (a4Var != null && (window = a4Var.getWindow()) != null) {
            gh5.g.a(window);
        }
        f3Var.l(new j93.t(this));
        f3Var.L.setText(getString(com.tencent.mm.R.string.mbc));
        java.lang.String string = getString(com.tencent.mm.R.string.mbc);
        android.widget.EditText editText = f3Var.M;
        editText.setHint(string);
        f3Var.N.setOnClickListener(new db5.c3(f3Var, new j93.u(this, f3Var)));
        f3Var.C();
        editText.postDelayed(new j93.v(f3Var, this), 100L);
    }
}
