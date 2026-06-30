package qe2;

/* loaded from: classes2.dex */
public abstract class a {
    public static final java.util.List a(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        r45.d50 d17 = d(finderItem);
        if (d17 == null) {
            return kz5.p0.f313996d;
        }
        java.util.LinkedList list = d17.getList(1);
        lz5.e eVar = new lz5.e((list != null ? list.size() : 0) + 1);
        java.lang.String nickName = finderItem.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        eVar.add(nickName);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list2 = d17.getList(1);
        if (list2 != null) {
            for (com.tencent.mm.protocal.protobuf.FinderContact finderContact : list2) {
                java.lang.String nickname = finderContact != null ? finderContact.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                eVar.add(nickname);
            }
        }
        return kz5.b0.a(eVar);
    }

    public static final java.lang.String b(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        r45.d50 d17 = d(finderItem);
        java.lang.String string = d17 != null ? d17.getString(0) : null;
        return string == null ? "" : string;
    }

    public static final int c(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        r45.d50 d17 = d(finderItem);
        if (d17 == null) {
            return 0;
        }
        java.util.LinkedList list = d17.getList(1);
        return (list != null ? list.size() : 0) + 1;
    }

    public static final r45.d50 d(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        r45.dm2 object_extend;
        r45.d50 d50Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        if (feedObject == null || (object_extend = feedObject.getObject_extend()) == null || (d50Var = (r45.d50) object_extend.getCustom(63)) == null) {
            return null;
        }
        boolean z17 = true;
        java.util.LinkedList list = d50Var.getList(1);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        return d50Var;
    }

    public static final boolean e(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        return finderItem.isLiveFeed() && d(finderItem) != null;
    }

    public static final boolean f(com.tencent.mm.protocal.protobuf.FinderObject finderObject, mm2.n0 n0Var) {
        kotlinx.coroutines.flow.f3 f3Var;
        r45.a84 a84Var;
        if (finderObject == null || n0Var == null || (f3Var = n0Var.f329271p) == null || (a84Var = (r45.a84) f3Var.getValue()) == null) {
            return false;
        }
        java.util.LinkedList list = a84Var.getList(1);
        if (list == null || list.isEmpty()) {
            return false;
        }
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend == null) {
            object_extend = new r45.dm2();
            finderObject.setObject_extend(object_extend);
        }
        r45.d50 d50Var = new r45.d50();
        d50Var.set(0, a84Var.getString(0));
        d50Var.set(1, new java.util.LinkedList(a84Var.getList(1)));
        object_extend.set(63, d50Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncCoAuthorInfoFromSlice: filled ");
        java.util.LinkedList list2 = a84Var.getList(1);
        sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
        sb6.append(" co-authors, avatarUrl=");
        java.lang.String string = a84Var.getString(0);
        sb6.append(string != null ? r26.p0.E0(string, 80) : null);
        com.tencent.mars.xlog.Log.i("FinderItemCoAuthorExt", sb6.toString());
        return true;
    }

    public static final r45.a84 g(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.d50 d50Var;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        r45.dm2 object_extend = finderObject.getObject_extend();
        if (object_extend == null || (d50Var = (r45.d50) object_extend.getCustom(63)) == null) {
            return null;
        }
        java.util.LinkedList list = d50Var.getList(1);
        if (list == null || list.isEmpty()) {
            return null;
        }
        r45.a84 a84Var = new r45.a84();
        a84Var.set(0, d50Var.getString(0));
        a84Var.set(1, new java.util.LinkedList(d50Var.getList(1)));
        return a84Var;
    }

    public static final boolean h(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, android.content.Context context) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        if (!e(finderItem)) {
            return false;
        }
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem.getFeedObject();
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        if (finderObject.getObjectDesc() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", "showCoAuthorSheet: objectDesc is null, skip");
            return false;
        }
        try {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = new com.tencent.mm.plugin.finder.storage.FinderItem();
            finderItem2.setFeedObject(finderObject);
            return qe2.l.c(context, finderItem2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FinderLiveFeatureService", th6, "showCoAuthorSheet error", new java.lang.Object[0]);
            return false;
        }
    }
}
