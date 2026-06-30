package y63;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f459652a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f459653b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f459654c = " ";

    /* renamed from: d, reason: collision with root package name */
    public long f459655d = com.tencent.wcdb.core.Database.DictDefaultMatchValue;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459656e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f459657f = 0;

    public static boolean b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        return com.tencent.mm.sdk.platformtools.t8.D0(str.replaceAll(j62.e.g().j("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true), "").replace(" ", "").toLowerCase(), str2.replaceAll(j62.e.g().j("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true), "").replace(" ", "").toLowerCase());
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y63.b clone() {
        y63.b bVar;
        java.lang.Exception e17;
        try {
            bVar = new y63.b();
            try {
                bVar.f459652a = this.f459652a;
                bVar.f459653b = this.f459653b;
                bVar.f459654c = this.f459654c;
                bVar.f459655d = this.f459655d;
                bVar.f459656e = this.f459656e;
                bVar.f459657f = this.f459657f;
            } catch (java.lang.Exception e18) {
                e17 = e18;
                com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireItem", "clone() Exception:%s %s", e17.getClass(), e17.getMessage());
                return bVar;
            }
        } catch (java.lang.Exception e19) {
            bVar = null;
            e17 = e19;
        }
        return bVar;
    }

    public boolean equals(java.lang.Object obj) {
        y63.b bVar = (y63.b) obj;
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f459652a, bVar.f459652a)) {
            return com.tencent.mm.sdk.platformtools.t8.D0(this.f459656e.trim(), bVar.f459656e.trim());
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f459656e.trim(), bVar.f459656e.trim())) {
            return true;
        }
        return b(this.f459656e.trim(), bVar.f459656e.trim());
    }

    public int hashCode() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f459656e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f459656e.trim())) {
            return 0;
        }
        return this.f459656e.trim().replaceAll(j62.e.g().j("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true), "").replace(" ", "").toLowerCase().hashCode();
    }

    public java.lang.String toString() {
        return "GroupSolitatireItem{username='" + this.f459652a + "', asheader=" + this.f459653b + ", separator='" + this.f459654c + "', createtime=" + this.f459655d + ", content='" + this.f459656e + "', orderNum='" + this.f459657f + "'}";
    }
}
