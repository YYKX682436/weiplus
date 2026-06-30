package r61;

/* loaded from: classes4.dex */
public class u0 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f392962f = {l75.n0.getCreateSQLs(r61.s0.S, "GoogleFriend")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f392963d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.a1 f392964e;

    public u0(l75.k0 k0Var) {
        super(k0Var, r61.s0.S, "GoogleFriend", null);
        this.f392964e = new r61.t0(this);
        this.f392963d = k0Var;
    }

    public android.database.Cursor D0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(" WHERE ( ");
            sb6.append("GoogleFriend.googleid='" + str + "'");
            sb6.append(" ) ");
        }
        return this.f392963d.B("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + ((java.lang.Object) sb6), null);
    }

    public boolean J0(r61.s0 s0Var) {
        java.lang.String str = s0Var.field_googleitemid;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend   WHERE GoogleFriend.googleitemid = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        java.lang.String sb7 = sb6.toString();
        l75.k0 k0Var = this.f392963d;
        android.database.Cursor f17 = k0Var.f(sb7, null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        if (!moveToFirst) {
            return insert(s0Var);
        }
        int p17 = k0Var.p("GoogleFriend", s0Var.convertTo(), "googleitemid=?", new java.lang.String[]{"" + s0Var.field_googleitemid});
        if (p17 > 0) {
            doNotify();
        }
        return p17 > 0;
    }

    public boolean L0(java.lang.String str, int i17) {
        return this.f392963d.A("GoogleFriend", "UPDATE GoogleFriend SET googlecgistatus='" + i17 + "' WHERE googleitemid='" + str + "'");
    }

    public boolean P0(java.lang.String str, int i17, int i18) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f392963d.A("GoogleFriend", "UPDATE GoogleFriend SET googlecgistatus='" + i17 + "' , status='" + i18 + "' WHERE username='" + str + "'");
    }

    @Override // l75.n0
    public java.lang.String getTableName() {
        return "GoogleFriend";
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean insert(r61.s0 s0Var) {
        if (s0Var == null) {
            return false;
        }
        return ((int) this.f392963d.l("GoogleFriend", "googleitemid", s0Var.convertTo())) > 0;
    }

    public boolean z0(java.util.ArrayList arrayList) {
        long j17;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        l75.k0 k0Var = this.f392963d;
        if (k0Var != null) {
            j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "surround insertList in a transaction, ticket = %d", java.lang.Long.valueOf(j17));
        } else {
            j17 = -1;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            insert((r61.s0) arrayList.get(i17));
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(j17));
            com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.GoogleFriendUI", "end updateList transaction");
        }
        l75.a1 a1Var = this.f392964e;
        a1Var.b(2, a1Var, "");
        return true;
    }
}
