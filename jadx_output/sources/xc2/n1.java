package xc2;

/* loaded from: classes10.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f453216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f453217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, xc2.p0 p0Var, org.json.JSONObject jSONObject) {
        super(2);
        this.f453215d = context;
        this.f453216e = p0Var;
        this.f453217f = jSONObject;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String audioPath = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g((android.content.Context) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(audioPath, "audioPath");
        xc2.y2.f453343a.j(this.f453215d, this.f453216e, audioPath, this.f453217f);
        return jz5.f0.f302826a;
    }
}
