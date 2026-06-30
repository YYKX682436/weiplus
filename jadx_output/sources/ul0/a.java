package ul0;

/* loaded from: classes13.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f428554e = {l75.n0.getCreateSQLs(dm.b2.f235820z, "ChattingEvent")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f428555d;

    public a(l75.k0 k0Var) {
        super(k0Var, dm.b2.f235820z, "ChattingEvent", f428554e);
        this.f428555d = k0Var;
        if (com.tencent.mm.sdk.platformtools.o4.L().getLong("ChattingEventStorage_create_time_v1", 0L) == 0) {
            com.tencent.mm.sdk.platformtools.o4.L().putLong("ChattingEventStorage_create_time_v1", java.lang.System.currentTimeMillis());
        }
    }

    public final boolean y0(dm.b2 b2Var) {
        android.database.Cursor B = this.f428555d.B("select * from ChattingEvent where talker = '" + b2Var.field_talker + "' and msgid = ? and type = ? and action = ?", new java.lang.String[]{java.lang.String.valueOf(b2Var.field_msgid), java.lang.String.valueOf(b2Var.field_type), java.lang.String.valueOf(b2Var.field_action)});
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

    public void z0(dm.b2 b2Var) {
        if (b2Var.field_msgid == 0) {
            return;
        }
        int i17 = b2Var.field_isfrom;
        l75.k0 k0Var = this.f428555d;
        if (i17 == 0 && b2Var.field_action == 2) {
            b2Var.field_action = 1;
            if (!y0(b2Var)) {
                k0Var.l("ChattingEvent", null, b2Var.convertTo());
            }
            b2Var.field_action = 2;
        }
        if (y0(b2Var)) {
            return;
        }
        k0Var.l("ChattingEvent", null, b2Var.convertTo());
    }
}
