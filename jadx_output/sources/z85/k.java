package z85;

/* loaded from: classes11.dex */
public class k extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f470803f = {l75.n0.getCreateSQLs(z85.j.f470802z, "EmojiInfoDesc")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f470804g = {"create index if not exists descGroupIdIndex on EmojiInfoDesc ( groupId )", "create index if not exists descMd5Index on EmojiInfoDesc ( md5 )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470805d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f470806e;

    public k(l75.k0 k0Var) {
        super(k0Var, z85.j.f470802z, "EmojiInfoDesc", f470804g);
        this.f470805d = k0Var;
        this.f470806e = android.preference.PreferenceManager.getDefaultSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        z85.j jVar = (z85.j) f0Var;
        if (jVar == null) {
            return false;
        }
        java.lang.String str = jVar.field_md5;
        if (str == null) {
            str = "";
        }
        if (!(str.length() == 32)) {
            return false;
        }
        jVar.field_md5_lang = jVar.field_md5 + jVar.field_lang;
        long m17 = this.f470805d.m("EmojiInfoDesc", "md5_lang", jVar.convertTo());
        if (m17 != -1) {
            java.lang.String str2 = jVar.field_md5;
            doNotify(str2 != null ? str2 : "");
        }
        return m17 >= 0;
    }

    public void y0(r45.sq4 sq4Var, java.lang.String str, java.lang.String str2) {
        if (sq4Var.f385925d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiInfoDescStorage", "msg desc list is null");
            return;
        }
        z85.j jVar = new z85.j();
        jVar.field_groupId = str;
        jVar.field_md5 = str2;
        java.util.Iterator it = sq4Var.f385925d.iterator();
        while (it.hasNext()) {
            r45.j54 j54Var = (r45.j54) it.next();
            jVar.field_desc = j54Var.f377595e;
            jVar.field_lang = j54Var.f377594d;
            jVar.field_md5_lang = jVar.field_md5 + jVar.field_lang;
            this.f470805d.m("EmojiInfoDesc", "md5_lang", jVar.convertTo());
        }
    }
}
