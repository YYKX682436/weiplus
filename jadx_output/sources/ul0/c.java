package ul0;

/* loaded from: classes13.dex */
public class c extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f428558e = {l75.n0.getCreateSQLs(dm.n7.D, "LiveHomeRedDotEvent")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f428559d;

    public c(l75.k0 k0Var) {
        super(k0Var, dm.n7.D, "LiveHomeRedDotEvent", f428558e);
        this.f428559d = k0Var;
        if (com.tencent.mm.sdk.platformtools.o4.L().getLong("LiveHomePageRedDot_create_time_v1", 0L) == 0) {
            com.tencent.mm.sdk.platformtools.o4.L().putLong("LiveHomePageRedDot_create_time_v1", java.lang.System.currentTimeMillis());
        }
    }

    public void D0(dm.n7 n7Var) {
        if (android.text.TextUtils.isEmpty(n7Var.field_reddotId)) {
            return;
        }
        if (n7Var.field_action == 2) {
            n7Var.field_action = 1;
            if (!z0(n7Var)) {
                return;
            } else {
                n7Var.field_action = 2;
            }
        }
        if (z0(n7Var)) {
            return;
        }
        this.f428559d.l("LiveHomeRedDotEvent", null, n7Var.convertTo());
    }

    public int y0(java.lang.String str, java.lang.String str2, int i17, boolean z17, long j17, long j18, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM (select * from LiveHomeRedDotEvent where timestamp >= ? and timestamp <= ? and action = ?");
        if (i18 >= 0) {
            sb6.append(" and dayOfWeek = ");
            sb6.append(i18);
        }
        if (i19 >= 0) {
            sb6.append(" and dayOfWeek = ");
            sb6.append(i19);
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb6.append(" and anchorId = '");
            sb6.append(str2);
            sb6.append("'");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(" and reddotId = '");
            sb6.append(str);
            sb6.append("'");
        }
        if (z17) {
            sb6.append(" and hasDisturbance = 1");
        }
        sb6.append(")");
        android.database.Cursor B = this.f428559d.B(sb6.toString(), new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18), java.lang.String.valueOf(i17)});
        try {
            int i27 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return i27;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }

    public boolean z0(dm.n7 n7Var) {
        android.database.Cursor B = this.f428559d.B("select * from LiveHomeRedDotEvent where reddotId = '" + n7Var.field_reddotId + "' and action = ?", new java.lang.String[]{java.lang.String.valueOf(n7Var.field_action)});
        try {
            if (B.moveToFirst()) {
                B.close();
                return true;
            }
            B.close();
            return false;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }
}
