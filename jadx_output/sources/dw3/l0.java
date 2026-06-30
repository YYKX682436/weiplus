package dw3;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f244229a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f244230b;

    /* renamed from: c, reason: collision with root package name */
    public final dw3.o0 f244231c;

    /* renamed from: d, reason: collision with root package name */
    public final dw3.k0 f244232d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f244233e;

    public l0(java.lang.String selectedTemplateId, java.lang.String str, dw3.o0 o0Var, dw3.k0 k0Var, java.lang.Integer num, int i17, kotlin.jvm.internal.i iVar) {
        selectedTemplateId = (i17 & 1) != 0 ? "" : selectedTemplateId;
        str = (i17 & 2) != 0 ? null : str;
        o0Var = (i17 & 4) != 0 ? null : o0Var;
        k0Var = (i17 & 8) != 0 ? null : k0Var;
        num = (i17 & 16) != 0 ? null : num;
        kotlin.jvm.internal.o.g(selectedTemplateId, "selectedTemplateId");
        this.f244229a = selectedTemplateId;
        this.f244230b = str;
        this.f244231c = o0Var;
        this.f244232d = k0Var;
        this.f244233e = num;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dw3.o0 o0Var = this.f244231c;
        if (o0Var != null) {
            sb6.append("&launchType=" + o0Var.f244250d);
        }
        java.lang.String str = this.f244229a;
        if (!kotlin.jvm.internal.o.b(str, "")) {
            sb6.append("&templateId=" + str);
        }
        java.lang.String str2 = this.f244230b;
        if (!(str2 == null || str2.length() == 0)) {
            sb6.append("&musicKey=" + str2);
        }
        dw3.k0 k0Var = this.f244232d;
        if (k0Var != null) {
            sb6.append("&editTabId=" + k0Var.f244227d);
        }
        java.lang.Integer num = this.f244233e;
        if (num != null) {
            sb6.append("&exportedOpenWX=" + num);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
