package ti4;

/* loaded from: classes11.dex */
public final class d implements ti4.a {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f419649a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f419650b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f419651c;

    public d(l75.k0 db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f419649a = db6;
        this.f419650b = jz5.h.b(new ti4.b(this));
        this.f419651c = new java.util.HashMap();
    }

    public int A(int i17) {
        java.lang.String str;
        mj4.n z17 = z();
        if (i17 < 0) {
            str = "select count(rowid) from TextStatusLike where Read != 1 and DeleteInMsgList != 1";
        } else {
            z17.getClass();
            str = "select count(rowid) from TextStatusLike where Read != 1 and CreateTime > " + i17 + " and DeleteInMsgList != 1";
        }
        android.database.Cursor B = z17.f327077d.B(str, null);
        if (B != null) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getUnreadCount: count=" + r1 + ", afterTime=" + i17);
        return r1;
    }

    @Override // qi4.a
    public void d(qi4.b observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        ti4.c cVar = new ti4.c(observer);
        z().add(cVar);
        this.f419651c.put(observer, cVar);
    }

    public java.util.List x() {
        mj4.n z17 = z();
        z17.getClass();
        java.util.LinkedList<mj4.l> linkedList = new java.util.LinkedList();
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        android.database.Cursor B = z17.f327077d.B("select rowid, * from TextStatusLike where HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new java.lang.String[]{k17});
        if (B != null) {
            while (B.moveToNext()) {
                mj4.l lVar = new mj4.l();
                lVar.convertFrom(B);
                linkedList.add(lVar);
            }
            B.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getAllInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.l lVar2 : linkedList) {
                arrayList.add(lVar2.field_TextStatusId + '_' + lVar2.field_DisplayName + '_' + lVar2.field_CreateTime + '_' + lVar2.field_LikeId);
            }
            arrayList.toString();
        }
        return linkedList;
    }

    public java.util.List y() {
        mj4.n z17 = z();
        z17.getClass();
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        if (k17.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getSelfAllLikeInfos: myUserName empty");
            return kz5.p0.f313996d;
        }
        p75.n0 n0Var = rj4.e.f396290v;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = rj4.e.f396292x.j(k17).c(rj4.e.f396294z.i(0));
        linkedList2.add(rj4.e.f396293y.u());
        p75.i0 g17 = rj4.e.f396290v.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        java.util.List k18 = g17.a().k(z17.f327077d, mj4.l.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getSelfAllLikeInfos: " + ((java.util.ArrayList) k18).size());
        return k18;
    }

    public final mj4.n z() {
        return (mj4.n) ((jz5.n) this.f419650b).getValue();
    }
}
