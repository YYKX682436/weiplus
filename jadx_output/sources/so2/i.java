package so2;

/* loaded from: classes10.dex */
public abstract class i implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final dm.pd f410411d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410412e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410413f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410414g;

    public i(dm.pd mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
        this.f410411d = mention;
    }

    public final java.lang.String a() {
        dm.pd pdVar = this.f410411d;
        java.lang.String str = "";
        if (!pdVar.u0()) {
            java.lang.String str2 = pdVar.field_username;
            java.lang.String str3 = pdVar.field_nickname;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                str = c61.yb.md((c61.yb) c17, str2 == null ? "" : str2, str3 == null ? "" : str3, false, 4, null);
            } else if (str3 != null) {
                str = str3;
            }
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = pdVar.field_aggregatedContacts.getList(0).iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) it.next();
            java.lang.String username = finderContact.getUsername();
            java.lang.String nickname = finderContact.getNickname();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(username)) {
                i95.m c18 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                nickname = c61.yb.md((c61.yb) c18, username == null ? "" : username, nickname == null ? "" : nickname, false, 4, null);
            } else if (nickname == null) {
                nickname = "";
            }
            sb6.append(nickname);
            sb6.append("，");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        if (com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
            return sb7;
        }
        java.lang.String substring = sb7.substring(0, sb7.length() - 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410411d.field_id;
    }
}
