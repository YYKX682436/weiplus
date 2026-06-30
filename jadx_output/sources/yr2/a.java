package yr2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.a f464659a = new yr2.a();

    public final r45.sq2 a(r45.sq2 sq2Var) {
        if (sq2Var != null) {
            return sq2Var;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_LAST_PRELOAD_INFO_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[buildPreloadInfo] buffer isEmpty? ");
        sb6.append(h17.length == 0);
        com.tencent.mars.xlog.Log.i("Finder.PreloadTransform", sb6.toString());
        if (h17.length == 0) {
            return new r45.sq2();
        }
        r45.sq2 sq2Var2 = new r45.sq2();
        sq2Var2.parseFrom(h17);
        return sq2Var2;
    }

    public final void b(r45.sq2 sq2Var, java.util.List list, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(list, "list");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transform] info=");
        if (sq2Var != null) {
            str = "[preloadId=" + sq2Var.getLong(0) + " hotFeed=" + sq2Var.getList(2).size() + ']';
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(" list=");
        sb6.append(list.size());
        sb6.append(" source=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.PreloadTransform", sb6.toString());
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        r45.sq2 a17 = a(sq2Var);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
            if (objectDesc != null && objectDesc.getMediaType() == 4) {
                hashMap.put(java.lang.Long.valueOf(finderObject.getId()), finderObject);
            }
        }
        ek6.y(a17, hashMap);
    }
}
