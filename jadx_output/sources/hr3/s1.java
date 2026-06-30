package hr3;

/* loaded from: classes5.dex */
public final class s1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.w1 f283960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f283962c;

    public s1(hr3.w1 w1Var, java.lang.String str, int i17) {
        this.f283960a = w1Var;
        this.f283961b = str;
        this.f283962c = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        hr3.w1 w1Var = this.f283960a;
        androidx.appcompat.app.AppCompatActivity activity = w1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return kz5.c1.k(new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) ((hr3.pf) pf5.z.f353948a.a(activity).a(hr3.pf.class)).f283895n).getValue()), new jz5.l("note_sid", (java.lang.String) ((jz5.n) w1Var.f284130e).getValue()), new jz5.l("add_username", this.f283961b), new jz5.l("contact_enter_scene", java.lang.Integer.valueOf(this.f283962c)));
    }
}
