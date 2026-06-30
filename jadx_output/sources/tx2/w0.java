package tx2;

/* loaded from: classes3.dex */
public final class w0 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tx2.z0 f422670a;

    public w0(tx2.z0 z0Var) {
        this.f422670a = z0Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        android.widget.TextView textView;
        r45.fs3 data = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View root = this.f422670a.getRoot();
        if (root == null || (textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f487418ol4)) == null) {
            return;
        }
        hc2.o.a(textView, true);
        textView.setText(java.lang.String.valueOf(data.f374585d));
    }
}
