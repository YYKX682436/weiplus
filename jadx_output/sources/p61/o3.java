package p61;

/* loaded from: classes8.dex */
public class o3 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f352334o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.LayoutInflater f352335p;

    /* renamed from: q, reason: collision with root package name */
    public p61.l3 f352336q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f352337r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f352338s;

    public o3(android.content.Context context, java.lang.String str) {
        super(context, new r61.s0());
        this.f352338s = str;
        this.f352334o = context;
        this.f352335p = android.view.LayoutInflater.from(context);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        r61.s0 s0Var = (r61.s0) obj;
        if (s0Var == null) {
            s0Var = new r61.s0();
        }
        s0Var.convertFrom(cursor);
        return s0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r13 != 2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.o3.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.u0 Di = m61.k.Di();
        java.lang.String str = this.f352337r;
        Di.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f352338s;
        if (isEmpty) {
            sb6.append(" WHERE ( GoogleFriend.googlegmail!='" + str2 + "' )");
        } else {
            sb6.append(" WHERE ( ");
            sb6.append("GoogleFriend.googlegmail!='" + str2 + "' AND ");
            sb6.append("GoogleFriend.googlename LIKE '%" + str + "%' OR ");
            sb6.append("GoogleFriend.googlenamepy LIKE '%" + str + "%' OR ");
            sb6.append("GoogleFriend.googlegmail LIKE '%" + str + "%' OR ");
            sb6.append("GoogleFriend.nickname LIKE '%" + str + "%' ) ");
        }
        sb6.append(" GROUP BY googleid,contecttype ORDER BY status , googlenamepy ASC , usernamepy ASC");
        s(Di.f392963d.B("SELECT GoogleFriend.googleid,GoogleFriend.googlename,GoogleFriend.googlephotourl,GoogleFriend.googlegmail,GoogleFriend.username,GoogleFriend.nickname,GoogleFriend.nicknameqp,GoogleFriend.usernamepy,GoogleFriend.small_url,GoogleFriend.big_url,GoogleFriend.ret,GoogleFriend.status,GoogleFriend.googleitemid,GoogleFriend.googlecgistatus,GoogleFriend.contecttype,GoogleFriend.googlenamepy FROM GoogleFriend  " + sb6.toString(), null));
        notifyDataSetChanged();
    }
}
