package zv2;

/* loaded from: classes10.dex */
public abstract class b implements zv2.r0, ya2.r1, ya2.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f476395d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderJumperView f476396e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f476397f;

    /* renamed from: g, reason: collision with root package name */
    public zv2.q0 f476398g;

    public b(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        this.f476395d = activity;
        this.f476396e = jumpView;
        e();
        f();
    }

    @Override // zv2.r0
    public void a() {
    }

    public boolean c() {
        return true;
    }

    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        this.f476396e.setVisibility(0);
        f();
        k();
    }

    public void e() {
    }

    public void f() {
        int dimensionPixelSize = this.f476395d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setMinimumHeight(dimensionPixelSize);
        finderJumperView.setOnClickListener(new zv2.a(this));
    }

    public void g() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo != null) {
            xc2.y2.i(xc2.y2.f453343a, this.f476395d, new xc2.p0(finderJumpInfo), 0, null, 12, null);
        }
    }

    public void h() {
        zv2.r0.b(this, null, 1, null);
    }

    public void i(com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView;
        this.f476397f = finderJumpInfo;
        boolean z17 = finderJumpInfo != null && c();
        if (!z17 || finderJumpInfo == null) {
            com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
            finderJumperView.setVisibility(8);
            finderJumperView.defaultTitle = "";
            finderJumperView.defaultIconId = 0;
            finderJumperView.filledIconId = 0;
            finderJumperView.filledTextColor = true;
            finderJumperView.defaultIconColor = finderJumperView.f131172d;
            finderJumperView.filledIconColor = finderJumperView.f131173e;
            finderJumperView.iconUrl = null;
            finderJumperView.b();
            finderJumperView.a(null);
        } else {
            d(finderJumpInfo);
        }
        zv2.q0 q0Var = this.f476398g;
        if (q0Var != null) {
            sr2.q1 q1Var = (sr2.q1) q0Var;
            if (z17) {
                q1Var.f411681f = this;
            } else {
                q1Var.f411681f = null;
                if (q1Var.f411679d) {
                    androidx.appcompat.app.AppCompatActivity activity = q1Var.getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    ((com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class)).Q7(new android.content.Intent(), getClass().getName());
                }
            }
            androidx.appcompat.app.AppCompatActivity activity2 = q1Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            sr2.o1 o1Var = (sr2.o1) pf5.z.f353948a.a(activity2).a(sr2.o1.class);
            if (z17) {
                aw2.n nVar = o1Var.f411654e;
                finderExtendReadingView = nVar != null ? nVar.f14783n : null;
                if (finderExtendReadingView != null) {
                    finderExtendReadingView.setVisibility(8);
                }
                o1Var.W6();
                return;
            }
            aw2.n nVar2 = o1Var.f411654e;
            finderExtendReadingView = nVar2 != null ? nVar2.f14783n : null;
            if (finderExtendReadingView == null) {
                return;
            }
            finderExtendReadingView.setVisibility(0);
        }
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    @Override // ya2.q1
    public void n0(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        i(this.f476397f);
    }
}
