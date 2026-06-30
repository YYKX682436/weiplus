package qd2;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.q f361803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.j41 f361805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361806d;

    public o(qd2.q qVar, android.app.Activity activity, r45.j41 j41Var, int i17) {
        this.f361803a = qVar;
        this.f361804b = activity;
        this.f361805c = j41Var;
        this.f361806d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        r45.j41 secondBtn = this.f361805c;
        kotlin.jvm.internal.o.f(secondBtn, "$secondBtn");
        qd2.q.a(this.f361803a, this.f361804b, 5, secondBtn, this.f361806d);
    }
}
