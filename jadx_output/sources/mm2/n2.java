package mm2;

/* loaded from: classes3.dex */
public final class n2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public boolean f329278f;

    /* renamed from: g, reason: collision with root package name */
    public r45.eq1 f329279g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f329280h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f329281i;

    /* renamed from: m, reason: collision with root package name */
    public dm.o4 f329282m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f329283n;

    /* renamed from: o, reason: collision with root package name */
    public r45.gg1 f329284o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(gk2.e liveBuContext) {
        super(liveBuContext);
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        this.f329283n = new java.util.ArrayList();
    }

    public final void N6(r45.eq1 eq1Var) {
        this.f329279g = eq1Var;
    }

    public final void O6(boolean z17) {
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (q4Var.E()) {
            com.tencent.mars.xlog.Log.i("LiveFansClubSlice", "isFansClubMember:" + this.f329278f + ",new:" + z17);
        }
        if (z17 != this.f329278f) {
            if (q4Var.E()) {
                com.tencent.mm.sdk.platformtools.Log.c("LiveFansClubSlice", "isFansClubMember:" + this.f329278f + ",new:" + z17, new java.lang.Object[0]);
            } else {
                com.tencent.mars.xlog.Log.i("LiveFansClubSlice", "isFansClubMember:" + this.f329278f + ",new:" + z17);
            }
        }
        this.f329278f = z17;
    }

    public final void P6(dm.o4 o4Var) {
        java.lang.String str = o4Var != null ? o4Var.field_rewardProductId : null;
        dm.o4 o4Var2 = this.f329282m;
        if (!kotlin.jvm.internal.o.b(str, o4Var2 != null ? o4Var2.field_rewardProductId : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinGift:");
            dm.o4 o4Var3 = this.f329282m;
            sb6.append(o4Var3 != null ? o4Var3.field_rewardProductId : null);
            sb6.append(',');
            dm.o4 o4Var4 = this.f329282m;
            sb6.append(o4Var4 != null ? java.lang.Integer.valueOf(o4Var4.field_flag) : null);
            sb6.append(',');
            dm.o4 o4Var5 = this.f329282m;
            sb6.append(o4Var5 != null ? java.lang.Integer.valueOf(o4Var5.field_unlockIntimacyLevel) : null);
            sb6.append(',');
            dm.o4 o4Var6 = this.f329282m;
            sb6.append(o4Var6 != null ? java.lang.Float.valueOf(o4Var6.field_price) : null);
            sb6.append(",new:");
            sb6.append(o4Var != null ? o4Var.field_rewardProductId : null);
            sb6.append(',');
            sb6.append(o4Var != null ? java.lang.Integer.valueOf(o4Var.field_flag) : null);
            sb6.append(',');
            sb6.append(o4Var != null ? java.lang.Integer.valueOf(o4Var.field_unlockIntimacyLevel) : null);
            sb6.append(',');
            sb6.append(o4Var != null ? java.lang.Float.valueOf(o4Var.field_price) : null);
            com.tencent.mars.xlog.Log.i("LiveFansClubSlice", sb6.toString());
        }
        this.f329282m = o4Var;
    }

    public final void Q6(boolean z17) {
        com.tencent.mars.xlog.Log.i("LiveFansClubSlice", "isNeverJoinFanClub set to " + z17);
        this.f329280h = z17;
    }

    public final void R6(boolean z17) {
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (q4Var.E()) {
            com.tencent.mars.xlog.Log.i("LiveFansClubSlice", "isSuperFans:" + this.f329281i + ",new:" + z17);
        }
        if (z17 != this.f329281i) {
            if (q4Var.E()) {
                com.tencent.mm.sdk.platformtools.Log.c("LiveFansClubSlice", "isSuperFans:" + this.f329281i + ",new:" + z17, new java.lang.Object[0]);
            } else {
                com.tencent.mars.xlog.Log.i("LiveFansClubSlice", "isSuperFans:" + this.f329281i + ",new:" + z17);
            }
        }
        this.f329281i = z17;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        O6(false);
        this.f329279g = null;
        P6(null);
        Q6(false);
    }
}
