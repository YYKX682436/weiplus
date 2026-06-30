package ub5;

/* loaded from: classes3.dex */
public final class q implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f426241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f426242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f426243f;

    public q(boolean z17, android.app.Activity activity, boolean z18) {
        this.f426241d = z17;
        this.f426242e = activity;
        this.f426243f = z18;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17 = this.f426241d;
        android.app.Activity activity = this.f426242e;
        if (z17) {
            g4Var.h(1, activity.getString(com.tencent.mm.R.string.njh), com.tencent.mm.R.raw.email_regular, activity.getColor(com.tencent.mm.R.color.FG_0));
        }
        if (this.f426243f) {
            db5.h4 h4Var = new db5.h4(activity, 2, 0);
            h4Var.f228368i = activity.getString(com.tencent.mm.R.string.nji);
            h4Var.d(com.tencent.mm.R.raw.icons_outlined_yuanbao, activity.getColor(com.tencent.mm.R.color.FG_0));
            g4Var.v(h4Var);
        }
    }
}
