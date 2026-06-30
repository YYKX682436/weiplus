package x51;

/* loaded from: classes12.dex */
public class v implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zb0.a0 f452093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452095c;

    public v(zb0.a0 a0Var, java.lang.String str, java.lang.String str2) {
        this.f452093a = a0Var;
        this.f452094b = str;
        this.f452095c = str2;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zb0.a0 a0Var = this.f452093a;
        if (a0Var != null) {
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            java.lang.String str2 = this.f452094b;
            if (isEmpty) {
                a0Var.b(str2, this.f452095c);
            } else {
                a0Var.a(str2, str);
            }
        }
    }
}
