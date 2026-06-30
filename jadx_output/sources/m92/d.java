package m92;

/* loaded from: classes10.dex */
public abstract class d {
    public static final m92.c a(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        kotlin.jvm.internal.o.g(finderContact, "<this>");
        java.lang.String username = finderContact.getUsername();
        if (username == null) {
            username = "";
        }
        m92.c cVar = new m92.c(username);
        cVar.field_username = finderContact.getUsername();
        cVar.field_nickname = finderContact.getNickname();
        cVar.field_signature = finderContact.getSignature();
        cVar.field_avatarUrl = finderContact.getHeadUrl();
        cVar.field_coverUrl = finderContact.getCoverUrl();
        cVar.field_liveCoverImgUrl = finderContact.getLiveCoverImgUrl();
        r45.hz0 extInfo = finderContact.getExtInfo();
        cVar.field_sex = extInfo != null ? extInfo.getInteger(3) : 0;
        cVar.field_seq = finderContact.getSeq();
        cVar.field_extFlag = finderContact.getExtFlag();
        cVar.field_contact_user_flag = finderContact.getUser_flag();
        cVar.field_spamStatus = finderContact.getSpamStatus();
        cVar.field_authInfo = finderContact.getAuthInfo();
        r45.hz0 extInfo2 = finderContact.getExtInfo();
        cVar.field_country = extInfo2 != null ? extInfo2.getString(0) : null;
        r45.hz0 extInfo3 = finderContact.getExtInfo();
        cVar.field_province = extInfo3 != null ? extInfo3.getString(1) : null;
        r45.hz0 extInfo4 = finderContact.getExtInfo();
        cVar.field_city = extInfo4 != null ? extInfo4.getString(2) : null;
        cVar.field_liveInfo = finderContact.getLive_info();
        cVar.field_originalInfo = finderContact.getOriginalInfo();
        com.tencent.mars.xlog.Log.i("FinderAccount", "[toFinderAccount] " + finderContact);
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0176, code lost:
    
        if (r6.isEmpty() != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0215 A[EDGE_INSN: B:61:0x0215->B:57:0x0215 BREAK  A[LOOP:2: B:48:0x01f8->B:54:0x0210], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m92.c b(r45.qz0 r22) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m92.d.b(r45.qz0):m92.c");
    }
}
