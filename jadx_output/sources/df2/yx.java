package df2;

/* loaded from: classes3.dex */
public final class yx implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.u12 f231898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f231899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df2.cy f231900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v12 f231901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f231903f;

    public yx(r45.u12 u12Var, kotlin.jvm.internal.h0 h0Var, df2.cy cyVar, r45.v12 v12Var, java.lang.String str, android.content.Context context) {
        this.f231898a = u12Var;
        this.f231899b = h0Var;
        this.f231900c = cyVar;
        this.f231901d = v12Var;
        this.f231902e = str;
        this.f231903f = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        df2.cy cyVar = this.f231900c;
        kotlin.jvm.internal.h0 h0Var = this.f231899b;
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "3", null, 4, null);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f231898a.f386937q;
            boolean z18 = true;
            if (finderJumpInfo != null) {
                com.tencent.mm.ui.widget.dialog.j0 j0Var = (com.tencent.mm.ui.widget.dialog.j0) h0Var.f310123d;
                if (j0Var != null) {
                    j0Var.dismiss();
                }
                df2.nm nmVar = (df2.nm) cyVar.controller(df2.nm.class);
                if (nmVar != null) {
                    nmVar.Z6(finderJumpInfo);
                    return;
                }
                return;
            }
            r45.v12 v12Var = this.f231901d;
            java.lang.String str2 = v12Var != null ? v12Var.f387797d : null;
            if (v12Var != null) {
                java.lang.String str3 = this.f231902e;
                if (!(str3 == null || str3.length() == 0)) {
                    if (str2 != null && str2.length() != 0) {
                        z18 = false;
                    }
                    if (!z18) {
                        df2.cy cyVar2 = this.f231900c;
                        com.tencent.mm.plugin.finder.live.util.y.o(cyVar2, null, null, new df2.xx(this.f231903f, cyVar2, str2, this.f231899b, this.f231901d, null), 3, null);
                    }
                }
            }
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.E, "2", null, 4, null);
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = (com.tencent.mm.ui.widget.dialog.j0) h0Var.f310123d;
            if (j0Var2 != null) {
                j0Var2.dismiss();
            }
        }
        com.tencent.mars.xlog.Log.i(cyVar.f229915m, "showAlertDialog click bOk:" + z17);
    }
}
