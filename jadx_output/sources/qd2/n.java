package qd2;

/* loaded from: classes8.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.q f361798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.j41 f361800c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361801d;

    public n(qd2.q qVar, android.app.Activity activity, r45.j41 j41Var, int i17) {
        this.f361798a = qVar;
        this.f361799b = activity;
        this.f361800c = j41Var;
        this.f361801d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        r45.j41 firstBtn = this.f361800c;
        kotlin.jvm.internal.o.f(firstBtn, "$firstBtn");
        qd2.q.a(this.f361798a, this.f361799b, 4, firstBtn, this.f361801d);
    }
}
