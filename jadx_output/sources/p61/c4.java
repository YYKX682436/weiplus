package p61;

/* loaded from: classes11.dex */
public class c4 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.h4 f352229d;

    public c4(p61.h4 h4Var) {
        this.f352229d = h4Var;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), str, str2);
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        r61.a i17 = m61.k.wi().i(str2);
        if (i17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MobileFriendAdapter", "cpan mobile friend is null. qq:%s", str2);
            return;
        }
        if (z17) {
            i17.f392792h = str;
            i17.f392799o = 2;
            i17.f392803s = 2;
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.wi().j(str2, i17);
            this.f352229d.q();
            c01.sc.d().a(26, new java.lang.Object[0]);
        }
    }
}
