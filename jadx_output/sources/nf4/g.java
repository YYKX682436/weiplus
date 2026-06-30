package nf4;

/* loaded from: classes4.dex */
public final class g extends l75.n0 implements l75.q0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f336845i = {l75.n0.getCreateSQLs(nf4.f.W, "StoryExtItem")};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f336846m = "select *, rowid from StoryExtItem ";

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f336847n = "select * from StoryExtItem";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f336848d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f336849e;

    /* renamed from: f, reason: collision with root package name */
    public final jt0.j f336850f;

    /* renamed from: g, reason: collision with root package name */
    public final jt0.j f336851g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.k0 f336852h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l75.k0 vdb) {
        super(vdb, nf4.f.W, "StoryExtItem", dm.db.f236445z);
        kotlin.jvm.internal.o.g(vdb, "vdb");
        l75.e0 e0Var = nf4.f.W;
        this.f336848d = vdb;
        this.f336849e = new java.util.ArrayList();
        this.f336850f = new jt0.j(1000);
        this.f336851g = new jt0.j(1000);
        this.f336852h = vdb;
    }

    public final java.util.List D0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f336852h.f(f336846m, null, 2);
        f17.moveToFirst();
        do {
            nf4.f fVar = new nf4.f();
            fVar.convertFrom(f17);
            arrayList.add(fVar);
        } while (f17.moveToNext());
        f17.close();
        return arrayList;
    }

    public final nf4.f J0(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        if (username.length() == 0) {
            return null;
        }
        nf4.f fVar = (nf4.f) this.f336850f.get(username);
        if (fVar != null) {
            return fVar;
        }
        nf4.f fVar2 = (nf4.f) this.f336851g.get(username);
        if (fVar2 != null) {
            return fVar2;
        }
        nf4.f L0 = L0(username);
        f1(L0);
        return L0;
    }

    public final nf4.f L0(java.lang.String str) {
        nf4.f fVar = new nf4.f();
        fVar.field_userName = str;
        super.get(fVar, getPrimaryKey());
        return fVar;
    }

    public final nf4.f P0(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        nf4.f fVar = (nf4.f) this.f336851g.get(username);
        if (fVar != null) {
            return fVar;
        }
        nf4.f L0 = L0(username);
        f1(L0);
        return L0;
    }

    public final int W0(java.lang.String userName, java.lang.String md52) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(md52, "md5");
        nf4.f L0 = L0(userName);
        L0.field_md5 = md52;
        super.replace(L0);
        return 0;
    }

    public final boolean b1(nf4.f info) {
        kotlin.jvm.internal.o.g(info, "info");
        f1(info);
        return super.replace(info);
    }

    public final int d1(long j17, nf4.f extinfo) {
        kotlin.jvm.internal.o.g(extinfo, "extinfo");
        android.content.ContentValues convertTo = extinfo.convertTo();
        convertTo.remove("rowid");
        f1(extinfo);
        return this.f336852h.p("StoryExtItem", convertTo, "rowid=?", new java.lang.String[]{"" + j17});
    }

    public final void f1(nf4.f fVar) {
        if (fVar != null) {
            if (fVar.getUserName().length() == 0) {
                return;
            }
            boolean h17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(fVar.getUserName());
            jt0.j jVar = this.f336851g;
            jt0.j jVar2 = this.f336850f;
            if (h17) {
                jVar2.put(fVar.getUserName(), fVar);
                jVar.remove(fVar.getUserName());
            } else {
                jVar2.remove(fVar.getUserName());
                jVar.put(fVar.getUserName(), fVar);
            }
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(str, "notify_story_read");
        java.util.ArrayList arrayList = this.f336849e;
        ef4.h hVar = ef4.h.f252444d;
        if (b17) {
            java.lang.Object obj = w0Var.f316976d;
            if (obj instanceof nf4.f) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj).getUserName();
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.f.a(it.next());
                    throw null;
                }
                java.util.List list = ef4.i.f252446a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
                return;
            }
        }
        if (kotlin.jvm.internal.o.b(str, "notify_story_unread")) {
            java.lang.Object obj2 = w0Var.f316976d;
            if (obj2 instanceof nf4.f) {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj2).getUserName();
                java.util.Iterator it6 = arrayList.iterator();
                if (it6.hasNext()) {
                    android.support.v4.media.f.a(it6.next());
                    throw null;
                }
                java.util.List list2 = ef4.i.f252446a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
                return;
            }
        }
        if (kotlin.jvm.internal.o.b(str, "notify_story_invalid")) {
            java.lang.Object obj3 = w0Var.f316976d;
            if (obj3 instanceof nf4.f) {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj3).getUserName();
                java.util.Iterator it7 = arrayList.iterator();
                if (it7.hasNext()) {
                    android.support.v4.media.f.a(it7.next());
                    throw null;
                }
                java.util.List list3 = ef4.i.f252446a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
                return;
            }
        }
        if (kotlin.jvm.internal.o.b(str, "notify_story_valid")) {
            java.lang.Object obj4 = w0Var.f316976d;
            if (obj4 instanceof nf4.f) {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj4).getUserName();
                java.util.Iterator it8 = arrayList.iterator();
                if (it8.hasNext()) {
                    android.support.v4.media.f.a(it8.next());
                    throw null;
                }
                java.util.List list4 = ef4.i.f252446a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
            }
        }
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        nf4.f item = (nf4.f) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean replace = super.replace(item);
        f1(item);
        return replace;
    }

    public final nf4.f y0(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        nf4.f J0 = J0(userName);
        return J0 != null ? J0 : L0(userName);
    }

    public final java.util.List z0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f336852h.f(f336847n, null, 2);
        f17.moveToFirst();
        do {
            nf4.f fVar = new nf4.f();
            fVar.convertFrom(f17);
            arrayList.add(fVar);
        } while (f17.moveToNext());
        f17.close();
        return arrayList;
    }
}
