package ta2;

/* loaded from: classes2.dex */
public final class b extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final r45.r03 f416695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.r03 r03Var, androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f416695c = r03Var;
    }

    public final java.lang.String A() {
        android.content.res.Resources resources = this.f434158a.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = com.tencent.mm.plugin.finder.assist.w2.h(this.f416695c != null ? r3.getInteger(2) : 0);
        java.lang.String string = resources.getString(com.tencent.mm.R.string.f8n, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // v92.g
    public boolean f() {
        r45.r03 r03Var = this.f416695c;
        java.lang.String string = r03Var != null ? r03Var.getString(0) : null;
        return string == null || string.length() == 0;
    }

    @Override // v92.g
    public void h() {
        bd2.b bVar = bd2.b.f19244a;
        r45.r03 r03Var = this.f416695c;
        long j17 = r03Var != null ? r03Var.getLong(1) : 0L;
        androidx.appcompat.app.AppCompatActivity context = this.f434158a;
        kotlin.jvm.internal.o.g(context, "context");
        bVar.l(context, bVar.h(context, 10013, kz5.b1.e(new jz5.l("topic_id", pm0.v.u(j17)))), false, null);
    }

    @Override // v92.g
    public boolean p() {
        r45.r03 r03Var = this.f416695c;
        java.lang.String string = r03Var != null ? r03Var.getString(0) : null;
        if (!(string == null || string.length() == 0)) {
            if (!(z().length() == 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // v92.g
    public void r() {
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        r45.r03 r03Var = this.f416695c;
        com.tencent.mm.plugin.finder.assist.n7.J(n7Var, mMActivity, r03Var != null ? r03Var.getString(0) : null, 1, r03Var != null ? r03Var.getInteger(2) : 0L, z(), A(), null, 9, "", null, null, null, 3584, null);
    }

    @Override // v92.g
    public void t() {
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f434158a;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) appCompatActivity;
        r45.r03 r03Var = this.f416695c;
        com.tencent.mm.plugin.finder.assist.n7.K(n7Var, mMActivity, r03Var != null ? r03Var.getString(0) : null, 1, r03Var != null ? r03Var.getInteger(2) : 0L, z(), A(), null, 9, "", null, null, null, 3584, null);
    }

    public final java.lang.String z() {
        java.lang.String string;
        com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment finderTopicTabFragment;
        r45.r03 r03Var = this.f416695c;
        java.lang.String string2 = r03Var != null ? r03Var.getString(18) : null;
        if (string2 == null || string2.length() == 0) {
            androidx.appcompat.app.AppCompatActivity activity = this.f434158a;
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.fragment.app.Fragment fragment = ((va2.n) pf5.z.f353948a.a(activity).a(va2.n.class)).f101830z;
            if (fragment instanceof com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment) {
                string = ((com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment) fragment).z0();
            } else if (!(fragment instanceof com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabParentFragment) || (finderTopicTabFragment = ((com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabParentFragment) fragment).C) == null || (string = finderTopicTabFragment.z0()) == null) {
                return "";
            }
        } else if (r03Var == null || (string = r03Var.getString(18)) == null) {
            return "";
        }
        return string;
    }
}
