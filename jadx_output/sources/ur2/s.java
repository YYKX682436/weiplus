package ur2;

/* loaded from: classes3.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.m implements yz5.a {
    public s(java.lang.Object obj) {
        super(0, obj, ur2.v.class, "onClickPreView", "onClickPreView()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ur2.v vVar = (ur2.v) this.receiver;
        androidx.appcompat.app.AppCompatActivity activity = vVar.getActivity();
        ry2.e eVar = vVar.f430431n;
        android.widget.TextView textView = vVar.f430427g;
        if (textView != null) {
            new ur2.c(activity, eVar, textView.getText().toString(), null).b();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("tvTitle");
        throw null;
    }
}
