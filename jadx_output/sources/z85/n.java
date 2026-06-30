package z85;

/* loaded from: classes4.dex */
public final class n extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f470810f = {l75.n0.getCreateSQLs(jr.e.f301296r, "EmojiSuggestCacheInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f470811g = "MicroMsg.EmojiSuggestCacheStorage";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470812d;

    /* renamed from: e, reason: collision with root package name */
    public final jt0.j f470813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 db6) {
        super(db6, jr.e.f301296r, "EmojiSuggestCacheInfo", null);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = jr.e.f301296r;
        this.f470812d = db6;
        this.f470813e = new jt0.j(100);
    }

    public final jr.e y0(java.lang.String desc) {
        kotlin.jvm.internal.o.g(desc, "desc");
        jt0.j jVar = this.f470813e;
        jr.e eVar = (jr.e) jVar.get(desc);
        if (eVar != null) {
            return eVar;
        }
        jr.e eVar2 = new jr.e();
        eVar2.field_desc = desc;
        super.get(eVar2, getPrimaryKey());
        byte[] bArr = eVar2.field_content;
        if (bArr != null) {
            r2 = !(bArr.length == 0);
        }
        if (!r2) {
            eVar2 = null;
        }
        if (eVar2 != null) {
            jVar.put(eVar2.field_desc, eVar2);
        }
        return eVar2;
    }

    public final void z0(jr.e info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f470813e.put(info.field_desc, info);
        super.replace(info);
    }
}
