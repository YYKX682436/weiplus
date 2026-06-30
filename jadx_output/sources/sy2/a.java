package sy2;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.ui.base.preference.Preference {
    public r45.g1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.g1 config, android.content.Context context) {
        super(context);
        java.lang.String string;
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(context, "context");
        this.G = com.tencent.mm.R.layout.byv;
        this.L = config;
        java.lang.String string2 = config.getString(2);
        java.lang.String str = "";
        L(string2 == null ? "" : string2);
        r45.g1 g1Var = this.L;
        C(java.lang.String.valueOf(g1Var != null ? java.lang.Integer.valueOf(g1Var.hashCode()) : null));
        r45.g1 g1Var2 = this.L;
        if (g1Var2 != null && (string = g1Var2.getString(6)) != null) {
            str = string;
        }
        H(str);
    }
}
