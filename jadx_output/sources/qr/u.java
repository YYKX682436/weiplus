package qr;

/* loaded from: classes12.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.x f366047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366048b;

    public u(qr.x xVar, yz5.l lVar) {
        this.f366047a = xVar;
        this.f366048b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.ri0 ri0Var;
        java.util.LinkedList linkedList3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.ye yeVar = (r45.ye) fVar.f70618d;
        qr.x xVar = this.f366047a;
        java.lang.String str = xVar.f366051g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestNext: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", size:");
        java.lang.String str2 = null;
        sb6.append((yeVar == null || (linkedList3 = yeVar.f391008g) == null) ? null : java.lang.Integer.valueOf(linkedList3.size()));
        sb6.append(", first:");
        if (yeVar != null && (linkedList2 = yeVar.f391008g) != null && (ri0Var = (r45.ri0) kz5.n0.Z(linkedList2)) != null) {
            str2 = ri0Var.f384886d;
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.l lVar = this.f366048b;
        if (i17 == 0 && i18 == 0 && (linkedList = yeVar.f391008g) != null && (!linkedList.isEmpty())) {
            r45.ri0 ri0Var2 = (r45.ri0) yeVar.f391008g.getFirst();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            n22.m.a(ri0Var2, emojiInfo);
            z85.l c17 = com.tencent.mm.storage.n5.f().c();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = xVar.f366019a;
            com.tencent.mm.storage.emotion.EmojiInfo u17 = c17.u1(emojiInfo2.getMd5());
            if (u17 != null) {
                n22.m.s(emojiInfo, u17);
                com.tencent.mm.storage.n5.f().c().G2(u17);
            }
            if (cr.m.b(emojiInfo) || cr.m.a(emojiInfo) || !com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_cdnUrl)) {
                com.tencent.mars.xlog.Log.i(xVar.f366051g, "get download info from cgi");
                n22.m.s(emojiInfo, emojiInfo2);
                lVar.invoke(java.lang.Boolean.TRUE);
                return jz5.f0.f302826a;
            }
        }
        lVar.invoke(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
