package lm3;

/* loaded from: classes10.dex */
public abstract class c0 {
    public static final java.lang.String a(r45.hf2 songInfo, fm3.u uVar) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.lang.String str;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n<MusicVideoStatusOpenParams>\n");
        sb6.append(c(songInfo));
        sb6.append('\n');
        if (uVar == null) {
            uVar = new fm3.u();
        }
        java.lang.String string = songInfo.getString(8);
        int i17 = uVar.f264136p;
        r45.xs4 xs4Var = null;
        xs4Var = null;
        xs4Var = null;
        xs4Var = null;
        r6 = null;
        r6 = null;
        java.lang.String str2 = null;
        xs4Var = null;
        if (i17 == 1) {
            java.lang.Long l17 = uVar.f264123c;
            java.lang.String str3 = uVar.f264124d;
            if (l17 != null && str3 != null) {
                long longValue = l17.longValue();
                if (longValue != 0) {
                    xs4Var = new r45.xs4();
                    xs4Var.set(0, pm0.v.u(longValue));
                    xs4Var.set(1, str3);
                    java.lang.String str4 = uVar.f264125e;
                    if (str4 != null) {
                        string = str4;
                    }
                    xs4Var.set(2, string);
                    xs4Var.set(3, uVar.f264126f);
                }
            }
        } else if (i17 == 4 && (finderObject = uVar.f264140t) != null) {
            r45.xs4 xs4Var2 = new r45.xs4();
            xs4Var2.set(0, pm0.v.u(finderObject.getId()));
            xs4Var2.set(1, finderObject.getObjectNonceId());
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
                str2 = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
            }
            xs4Var2.set(2, str2);
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            if (contact == null || (str = contact.getNickname()) == null) {
                str = "";
            }
            xs4Var2.set(3, str);
            xs4Var = xs4Var2;
        }
        if (xs4Var == null) {
            xs4Var = new r45.xs4();
        }
        java.lang.String a17 = zy2.pc.a(xs4Var);
        kotlin.jvm.internal.o.f(a17, "makeContent(...)");
        sb6.append(a17);
        sb6.append("\n</MusicVideoStatusOpenParams>");
        return r26.b0.b(sb6.toString());
    }

    public static final java.lang.String b(java.lang.Object obj) {
        java.lang.String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        java.lang.String p17 = com.tencent.mm.sdk.platformtools.t8.p(str);
        kotlin.jvm.internal.o.f(p17, "escapeStringForXml(...)");
        return p17;
    }

    public static final java.lang.String c(r45.hf2 hf2Var) {
        kotlin.jvm.internal.o.g(hf2Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<FinderMVSongInfo>\n    <songName>");
        sb6.append(b(hf2Var.getString(0)));
        sb6.append("</songName>\n    <singer>");
        sb6.append(b(hf2Var.getString(1)));
        sb6.append("</singer>\n    <musicDataUrl>");
        sb6.append(b(hf2Var.getString(2)));
        sb6.append("</musicDataUrl>\n    <musicAppId>");
        sb6.append(b(hf2Var.getString(3)));
        sb6.append("</musicAppId>\n    <musicWebUrl>");
        sb6.append(b(hf2Var.getString(4)));
        sb6.append("</musicWebUrl>\n    <songId>");
        sb6.append(b(hf2Var.getString(5)));
        sb6.append("</songId>\n    <lyric>");
        sb6.append(b(hf2Var.getString(6)));
        sb6.append("</lyric>\n    <albumName>");
        sb6.append(b(hf2Var.getString(7)));
        sb6.append("</albumName>\n    <albumUrl>");
        sb6.append(b(hf2Var.getString(8)));
        sb6.append("</albumUrl>\n    <genre>");
        sb6.append(b(hf2Var.getString(9)));
        sb6.append("</genre>\n    <publicTime>");
        sb6.append(b(hf2Var.getString(10)));
        sb6.append("</publicTime>\n    <publicTimeS>");
        sb6.append(b(java.lang.Long.valueOf(hf2Var.getLong(11))));
        sb6.append("</publicTimeS>\n    <extraInfo>");
        sb6.append(b(hf2Var.getString(12)));
        sb6.append("</extraInfo>\n    <identification>");
        sb6.append(b(hf2Var.getString(13)));
        sb6.append("</identification>\n    <duration>");
        sb6.append(hf2Var.getInteger(14));
        sb6.append("</duration>\n    <musicOperationUrl>");
        r45.if2 if2Var = (r45.if2) hf2Var.getCustom(17);
        sb6.append(b(if2Var != null ? if2Var.getString(0) : null));
        sb6.append("</musicOperationUrl>\n    <mid>");
        sb6.append(b(hf2Var.getString(18)));
        sb6.append("</mid>\n</FinderMVSongInfo>\n");
        return r26.b0.b(sb6.toString());
    }
}
