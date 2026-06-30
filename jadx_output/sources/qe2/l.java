package qe2;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final qe2.l f362060a = new qe2.l();

    public static final boolean c(android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem item) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        if (!qe2.a.e(item)) {
            com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "show: not co-author live, skip");
            return false;
        }
        try {
            qe2.l lVar = f362060a;
            java.util.List a17 = lVar.a(item);
            if (a17.isEmpty()) {
                com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "show: cellItems empty, skip");
                return false;
            }
            lVar.e(context, a17);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.CoAuthorSheet", th6, "show error", new java.lang.Object[0]);
            return false;
        }
    }

    public static final boolean d(android.content.Context context, r45.a84 a84Var, java.lang.String anchorUsername, java.lang.String anchorNickname, java.lang.String anchorHeadUrl) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(anchorNickname, "anchorNickname");
        kotlin.jvm.internal.o.g(anchorHeadUrl, "anchorHeadUrl");
        java.util.LinkedList list = a84Var != null ? a84Var.getList(1) : null;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "showFromLiveCoAuthor: contact empty, skip");
            return false;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 1);
            arrayList.add(new qe2.c(anchorUsername, anchorNickname, anchorHeadUrl, true, false, null, false, 112, null));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) it.next();
                if (finderContact != null) {
                    java.lang.String username = finderContact.getUsername();
                    java.lang.String str = username == null ? "" : username;
                    java.lang.String nickname = finderContact.getNickname();
                    java.lang.String str2 = nickname == null ? "" : nickname;
                    java.lang.String headUrl = finderContact.getHeadUrl();
                    java.lang.String str3 = headUrl == null ? "" : headUrl;
                    int followFlag = finderContact.getFollowFlag();
                    l75.e0 e0Var = ya2.b2.O2;
                    arrayList.add(new qe2.c(str, str2, str3, false, followFlag == ya2.b2.Q2, finderContact.getAuthInfo(), false, 64, null));
                }
            }
            f362060a.e(context, arrayList);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.CoAuthorSheet", th6, "showFromLiveCoAuthor error", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final java.util.List a(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        r45.dm2 object_extend;
        r45.d50 d50Var;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        ?? r17 = kz5.p0.f313996d;
        if (feedObject != null && (object_extend = feedObject.getObject_extend()) != null && (d50Var = (r45.d50) object_extend.getCustom(63)) != null) {
            java.util.LinkedList list = d50Var.getList(1);
            if (list == null) {
                return r17;
            }
            r17 = new java.util.ArrayList(list.size() + 1);
            com.tencent.mm.protocal.protobuf.FinderObject feedObject2 = finderItem.getFeedObject();
            if (feedObject2 != null && (contact = feedObject2.getContact()) != null) {
                java.lang.String username = contact.getUsername();
                java.lang.String str = username == null ? "" : username;
                java.lang.String nickname = contact.getNickname();
                java.lang.String str2 = nickname == null ? "" : nickname;
                java.lang.String headUrl = contact.getHeadUrl();
                java.lang.String str3 = headUrl == null ? "" : headUrl;
                int followFlag = contact.getFollowFlag();
                l75.e0 e0Var = ya2.b2.O2;
                r17.add(new qe2.c(str, str2, str3, true, followFlag == ya2.b2.Q2, contact.getAuthInfo(), false, 64, null));
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) it.next();
                if (finderContact != null) {
                    java.lang.String username2 = finderContact.getUsername();
                    java.lang.String str4 = username2 == null ? "" : username2;
                    java.lang.String nickname2 = finderContact.getNickname();
                    java.lang.String str5 = nickname2 == null ? "" : nickname2;
                    java.lang.String headUrl2 = finderContact.getHeadUrl();
                    java.lang.String str6 = headUrl2 == null ? "" : headUrl2;
                    int followFlag2 = finderContact.getFollowFlag();
                    l75.e0 e0Var2 = ya2.b2.O2;
                    r17.add(new qe2.c(str4, str5, str6, false, followFlag2 == ya2.b2.Q2, finderContact.getAuthInfo(), false, 64, null));
                }
            }
        }
        return r17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(r45.g92 r20) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe2.l.b(r45.g92):java.util.List");
    }

    public final void e(android.content.Context context, java.util.List list) {
        com.tencent.mm.plugin.finder.live.widget.e0.W(new w.h(context, list), null, false, 0, 7, null);
        com.tencent.mars.xlog.Log.i("Finder.CoAuthorSheet", "showSheet: count=" + list.size());
    }
}
