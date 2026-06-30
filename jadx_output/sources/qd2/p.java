package qd2;

/* loaded from: classes8.dex */
public final class p implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.q f361808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f361809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.j41 f361810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361811d;

    public p(qd2.q qVar, android.app.Activity activity, r45.j41 j41Var, int i17) {
        this.f361808a = qVar;
        this.f361809b = activity;
        this.f361810c = j41Var;
        this.f361811d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        r45.j41 firstBtn = this.f361810c;
        kotlin.jvm.internal.o.f(firstBtn, "$firstBtn");
        qd2.q.a(this.f361808a, this.f361809b, 6, firstBtn, this.f361811d);
    }
}
