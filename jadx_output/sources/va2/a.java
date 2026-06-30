package va2;

/* loaded from: classes2.dex */
public final class a extends x92.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.e
    public v92.g X6() {
        return new ta2.b((r45.r03) this.f452719d, getActivity());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        java.lang.String string;
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        r45.r03 r03Var = (r45.r03) this.f452719d;
        if (r03Var != null && (string = r03Var.getString(0)) != null) {
            stringExtra = string;
        }
        return "#".concat(stringExtra);
    }
}
