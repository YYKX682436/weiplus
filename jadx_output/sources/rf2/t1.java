package rf2;

/* loaded from: classes10.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394898h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394899i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394900m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(rf2.c2 c2Var, android.view.View view, android.widget.TextView textView, r45.f02 f02Var, android.widget.TextView textView2, android.view.View view2, java.lang.String str) {
        super(3);
        this.f394894d = c2Var;
        this.f394895e = view;
        this.f394896f = textView;
        this.f394897g = f02Var;
        this.f394898h = textView2;
        this.f394899i = view2;
        this.f394900m = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mm2.r4 data = (mm2.r4) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(data, "data");
        this.f394894d.b(data, this.f394895e, this.f394896f);
        if (data.f329376a != 1) {
            rf2.c2 c2Var = this.f394894d;
            java.lang.String str = this.f394897g.f373878d;
            if (str == null) {
                str = "";
            }
            android.widget.TextView voteBtn = this.f394898h;
            kotlin.jvm.internal.o.f(voteBtn, "$voteBtn");
            android.view.View voteContainer = this.f394899i;
            kotlin.jvm.internal.o.f(voteContainer, "$voteContainer");
            c2Var.d(str, voteBtn, voteContainer, this.f394900m, false);
        }
        return jz5.f0.f302826a;
    }
}
