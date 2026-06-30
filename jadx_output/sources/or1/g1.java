package or1;

/* loaded from: classes9.dex */
public class g1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.i1 f347497d;

    public g1(or1.i1 i1Var) {
        this.f347497d = i1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        java.lang.String str;
        qk.o6 o6Var = (qk.o6) i95.n0.c(qk.o6.class);
        or1.i1 i1Var = this.f347497d;
        java.lang.String str2 = i1Var.f347506d.f347511b;
        android.util.LruCache lruCache = ((c01.j0) o6Var).f37267d;
        w01.c cVar = (w01.c) lruCache.get(str2);
        if (cVar == null) {
            cVar = new w01.c();
            lruCache.put(str2, cVar);
        }
        cVar.a(str2);
        qk.o6 o6Var2 = (qk.o6) i95.n0.c(qk.o6.class);
        or1.j1 j1Var = i1Var.f347506d;
        java.lang.String str3 = j1Var.f347511b;
        ((c01.j0) o6Var2).getClass();
        try {
            z17 = r01.q3.bj().y0(str3).field_hide_colleage_invite;
        } catch (java.lang.Throwable unused) {
            z17 = true;
        }
        if (!z17) {
            qk.o6 o6Var3 = (qk.o6) i95.n0.c(qk.o6.class);
            java.lang.String str4 = j1Var.f347511b;
            ((c01.j0) o6Var3).getClass();
            try {
                r01.m y07 = r01.q3.bj().y0(str4);
                r45.ik ikVar = new r45.ik();
                ikVar.parseFrom(y07.field_raw_attrs);
                str = ikVar.f377104f;
            } catch (java.lang.Throwable unused2) {
                str = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                g4Var.b(2, com.tencent.mm.R.string.anz, com.tencent.mm.R.raw.ofm_add_icon);
            } else {
                g4Var.g(2, str, com.tencent.mm.R.raw.ofm_add_icon);
            }
        }
        g4Var.b(3, com.tencent.mm.R.string.c1_, com.tencent.mm.R.raw.actionbar_goto_disabled_biz_icon);
        g4Var.b(4, com.tencent.mm.R.string.f489818cm, com.tencent.mm.R.raw.actionbar_setting_white_icon);
    }
}
