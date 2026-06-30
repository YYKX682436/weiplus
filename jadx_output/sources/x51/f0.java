package x51;

/* loaded from: classes12.dex */
public class f0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb0.a0 f452001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452003c;

    public f0(zb0.a0 a0Var, java.lang.String str, java.lang.String str2) {
        this.f452001a = a0Var;
        this.f452002b = str;
        this.f452003c = str2;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zb0.a0 a0Var = this.f452001a;
        if (a0Var != null) {
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            java.lang.String str2 = this.f452002b;
            if (isEmpty) {
                a0Var.b(str2, this.f452003c);
            } else {
                a0Var.a(str2, str);
            }
        }
    }
}
