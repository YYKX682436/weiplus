package gf4;

/* loaded from: classes4.dex */
public final class l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static r45.le6 f271360m;

    /* renamed from: n, reason: collision with root package name */
    public static gf4.a f271361n;

    /* renamed from: d, reason: collision with root package name */
    public static final gf4.l f271354d = new gf4.l();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f271355e = gm0.j1.u().d() + "story/commentCache.proto";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f271356f = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi() + "commentCache.proto";

    /* renamed from: g, reason: collision with root package name */
    public static final int f271357g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f271358h = "MicroMsg.StoryCommentLogic";

    /* renamed from: i, reason: collision with root package name */
    public static final r45.je6 f271359i = new r45.je6();

    /* renamed from: o, reason: collision with root package name */
    public static int f271362o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.ArrayList f271363p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.LinkedList f271364q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.LinkedList f271365r = new java.util.LinkedList();

    public static gf4.a i(gf4.l lVar, long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, java.lang.String str3, java.lang.String str4, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 128) != 0) {
            i17 = 0;
        }
        if ((i19 & 256) != 0) {
            i18 = 0;
        }
        lVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ef4.v vVar = ef4.w.f252468t;
        sb6.append(vVar.e());
        sb6.append("");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        r45.le6 le6Var = new r45.le6();
        le6Var.f379389m = g17;
        le6Var.f379383d = j17;
        le6Var.f379387h = str2;
        le6Var.f379385f = vVar.e();
        le6Var.f379386g = str;
        le6Var.f379384e = c01.id.e();
        le6Var.f379388i = 1;
        le6Var.f379391o = z17 ? 1 : 0;
        le6Var.f379393q = z18 ? 1 : 0;
        le6Var.f379394r = str3;
        le6Var.f379395s = str4;
        le6Var.f379396t = i17;
        le6Var.f379397u = i18;
        f271359i.f377768d.add(le6Var);
        f271361n = new gf4.a(le6Var);
        lVar.m();
        vVar.l().post(new gf4.h(le6Var));
        gf4.a aVar = f271361n;
        kotlin.jvm.internal.o.d(aVar);
        return aVar;
    }

    public final void a(yz5.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = f271363p;
        if (arrayList.contains(listener)) {
            return;
        }
        arrayList.add(listener);
    }

    public final void b(r45.hf6 syncMsg) {
        kotlin.jvm.internal.o.g(syncMsg, "syncMsg");
        com.tencent.mars.xlog.Log.i(f271358h, "addSyncComment " + syncMsg.f376120d + ' ' + syncMsg.f376122f.f377003o + ' ' + syncMsg.f376122f.f377002n);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ef4.v vVar = ef4.w.f252468t;
        nf4.b z07 = vVar.f().z0(syncMsg.f376122f.f376995d);
        h0Var.f310123d = z07;
        if (z07 == null) {
            nf4.b bVar = new nf4.b();
            h0Var.f310123d = bVar;
            bVar.field_storyId = syncMsg.f376120d;
        }
        k(syncMsg);
        java.lang.Object obj = h0Var.f310123d;
        if (((nf4.b) obj).field_readCommentTime == 0) {
            ((nf4.b) obj).field_readCommentTime = 1;
        }
        nf4.b bVar2 = (nf4.b) obj;
        java.lang.String FromUserName = syncMsg.f376122f.f376996e;
        kotlin.jvm.internal.o.f(FromUserName, "FromUserName");
        bVar2.getClass();
        bVar2.f336840x = FromUserName;
        nf4.b bVar3 = (nf4.b) h0Var.f310123d;
        java.lang.String UserName = syncMsg.f376122f.f377007s.f372384e;
        kotlin.jvm.internal.o.f(UserName, "UserName");
        bVar3.getClass();
        bVar3.f336841y = UserName;
        java.lang.Object obj2 = h0Var.f310123d;
        r45.if6 if6Var = syncMsg.f376122f;
        ((nf4.b) obj2).field_syncCommentId = if6Var.f377003o;
        ((nf4.b) obj2).field_syncCommentTime = if6Var.f377002n;
        vVar.f().replace((l75.f0) h0Var.f310123d);
        pm0.v.X(new gf4.b(h0Var));
    }

    public final void c(r45.hf6 syncMsg) {
        kotlin.jvm.internal.o.g(syncMsg, "syncMsg");
        com.tencent.mars.xlog.Log.i(f271358h, "addSyncVisit " + syncMsg.f376120d + ' ' + syncMsg.f376122f.f377003o + ' ' + syncMsg.f376122f.f377002n + " enableVisit:" + bf4.f.f19715b.f());
        k(syncMsg);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ef4.v vVar = ef4.w.f252468t;
        nf4.b z07 = vVar.f().z0(syncMsg.f376122f.f376995d);
        h0Var.f310123d = z07;
        if (z07 == null) {
            nf4.b bVar = new nf4.b();
            h0Var.f310123d = bVar;
            bVar.field_storyId = syncMsg.f376120d;
        }
        if (((nf4.b) h0Var.f310123d).field_readCommentTime == 0) {
            java.lang.Integer num = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(syncMsg.f376122f.f377000i)) {
                java.util.LinkedList linkedList = syncMsg.f376122f.f377007s.f372392p;
                kotlin.jvm.internal.o.d(linkedList);
                r45.ke6 ke6Var = (r45.ke6) kz5.n0.a0(linkedList, linkedList.size() - 2);
                if (ke6Var != null) {
                    num = java.lang.Integer.valueOf(ke6Var.f378634i);
                }
            } else {
                java.util.LinkedList linkedList2 = syncMsg.f376122f.f377007s.f372390n;
                kotlin.jvm.internal.o.d(linkedList2);
                r45.ke6 ke6Var2 = (r45.ke6) kz5.n0.a0(linkedList2, linkedList2.size() - 2);
                if (ke6Var2 != null) {
                    num = java.lang.Integer.valueOf(ke6Var2.f378634i);
                }
            }
            ((nf4.b) h0Var.f310123d).field_readCommentTime = num != null ? num.intValue() : 1;
        }
        nf4.b bVar2 = (nf4.b) h0Var.f310123d;
        java.lang.String FromUserName = syncMsg.f376122f.f376996e;
        kotlin.jvm.internal.o.f(FromUserName, "FromUserName");
        bVar2.getClass();
        bVar2.f336840x = FromUserName;
        nf4.b bVar3 = (nf4.b) h0Var.f310123d;
        java.lang.String UserName = syncMsg.f376122f.f377007s.f372384e;
        kotlin.jvm.internal.o.f(UserName, "UserName");
        bVar3.getClass();
        bVar3.f336841y = UserName;
        java.lang.Object obj = h0Var.f310123d;
        r45.if6 if6Var = syncMsg.f376122f;
        ((nf4.b) obj).field_syncCommentId = if6Var.f377003o;
        ((nf4.b) obj).field_syncCommentTime = if6Var.f377002n;
        vVar.f().replace((l75.f0) h0Var.f310123d);
        pm0.v.X(new gf4.c(h0Var));
    }

    public final void d(r45.hf6 syncMsg) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        r45.ke6 ke6Var;
        java.lang.Object obj4;
        java.lang.String str;
        kotlin.jvm.internal.o.g(syncMsg, "syncMsg");
        java.lang.String str2 = "delSyncComment " + syncMsg.f376120d + ' ' + syncMsg.f376122f.f377003o;
        java.lang.String str3 = f271358h;
        com.tencent.mars.xlog.Log.i(str3, str2);
        r45.if6 if6Var = syncMsg.f376122f;
        f(if6Var.f376995d, if6Var.f377003o, if6Var.f377000i);
        long j17 = syncMsg.f376122f.f376995d;
        ef4.v vVar = ef4.w.f252468t;
        nf4.j L0 = vVar.i().L0(j17);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        nf4.b z07 = vVar.f().z0(j17);
        if (z07 == null) {
            return;
        }
        h0Var.f310123d = z07;
        java.lang.String str4 = "";
        if (L0 == null) {
            com.tencent.mars.xlog.Log.i(str3, "updateLastCommentSync will reset to 0 0");
            nf4.b bVar = (nf4.b) h0Var.f310123d;
            bVar.field_readCommentTime = 0;
            bVar.field_readCommentId = 0;
            bVar.field_syncCommentTime = 0;
            bVar.field_syncCommentId = 0;
            bVar.getClass();
            bVar.f336840x = "";
        } else {
            r45.df6 df6Var = new r45.df6();
            try {
                df6Var.parseFrom(L0.field_attrBuf);
            } catch (java.lang.Exception unused) {
            }
            java.util.LinkedList CommentList = df6Var.f372390n;
            kotlin.jvm.internal.o.f(CommentList, "CommentList");
            java.util.ListIterator listIterator = CommentList.listIterator(CommentList.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                r45.ke6 ke6Var2 = (r45.ke6) obj2;
                if (ke6Var2.f378639q != 0 && ke6Var2.f378634i <= ((nf4.b) h0Var.f310123d).field_readCommentTime) {
                    break;
                }
            }
            r45.ke6 ke6Var3 = (r45.ke6) obj2;
            if (ke6Var3 == null) {
                if (bf4.f.f19715b.f()) {
                    java.util.LinkedList VisitorList = df6Var.f372402z;
                    kotlin.jvm.internal.o.f(VisitorList, "VisitorList");
                    java.util.ListIterator listIterator2 = VisitorList.listIterator(VisitorList.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = listIterator2.previous();
                        r45.ke6 ke6Var4 = (r45.ke6) obj4;
                        if (ke6Var4.f378639q != 0 && ke6Var4.f378634i <= ((nf4.b) h0Var.f310123d).field_readCommentTime) {
                            break;
                        }
                    }
                    ke6Var = (r45.ke6) obj4;
                } else {
                    java.util.LinkedList BubbleList = df6Var.f372392p;
                    kotlin.jvm.internal.o.f(BubbleList, "BubbleList");
                    java.util.ListIterator listIterator3 = BubbleList.listIterator(BubbleList.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = listIterator3.previous();
                        r45.ke6 ke6Var5 = (r45.ke6) obj3;
                        if (ke6Var5.f378639q != 0 && ke6Var5.f378634i <= ((nf4.b) h0Var.f310123d).field_readCommentTime) {
                            break;
                        }
                    }
                    ke6Var = (r45.ke6) obj3;
                }
                ke6Var3 = ke6Var;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLastCommentSync will reset to ");
            sb6.append(ke6Var3 != null ? java.lang.Integer.valueOf(ke6Var3.f378634i) : null);
            sb6.append(' ');
            sb6.append(ke6Var3 != null ? java.lang.Integer.valueOf(ke6Var3.f378639q) : null);
            com.tencent.mars.xlog.Log.i(str3, sb6.toString());
            nf4.b bVar2 = (nf4.b) h0Var.f310123d;
            bVar2.field_readCommentTime = ke6Var3 != null ? ke6Var3.f378634i : 0;
            bVar2.field_readCommentId = ke6Var3 != null ? ke6Var3.f378639q : 0;
            bVar2.field_syncCommentTime = ke6Var3 != null ? ke6Var3.f378634i : 0;
            bVar2.field_syncCommentId = ke6Var3 != null ? ke6Var3.f378639q : 0;
            java.lang.String str5 = ke6Var3 != null ? ke6Var3.f378630e : null;
            if (str5 == null) {
                str5 = "";
            }
            bVar2.getClass();
            bVar2.f336840x = str5;
            java.util.Iterator it = CommentList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.ke6 ke6Var6 = (r45.ke6) next;
                if (ke6Var6.f378639q != 0 && ke6Var6.f378634i > ((nf4.b) h0Var.f310123d).field_readCommentTime) {
                    obj = next;
                    break;
                }
            }
            if (((r45.ke6) obj) == null) {
                L0.F0(false);
                long j18 = L0.field_storyID;
                int i17 = L0.field_localFlag;
                ef4.w.f252468t.i().f336872h.A("MMStoryInfo", "UPDATE MMStoryInfo SET localFlag = " + i17 + " Where storyID = '" + j18 + '\'');
            }
        }
        nf4.b bVar3 = (nf4.b) h0Var.f310123d;
        if (L0 != null && (str = L0.field_userName) != null) {
            str4 = str;
        }
        bVar3.getClass();
        bVar3.f336841y = str4;
        ef4.w.f252468t.f().replace((l75.f0) h0Var.f310123d);
        pm0.v.X(new gf4.k(h0Var));
    }

    public final void e(long j17, int i17, java.lang.String str, java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i(f271358h, "deleteComment storyId:" + j17 + " commentId:" + i17 + " sessionId:" + str + " content:" + content);
        if (i17 != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ef4.v vVar = ef4.w.f252468t;
            sb6.append(vVar.e());
            sb6.append("");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            r45.le6 le6Var = new r45.le6();
            le6Var.f379383d = j17;
            le6Var.f379389m = g17;
            le6Var.f379390n = i17;
            le6Var.f379384e = c01.id.e();
            le6Var.f379388i = 3;
            le6Var.f379394r = str;
            le6Var.f379385f = vVar.e();
            le6Var.f379386g = "";
            f271359i.f377768d.add(le6Var);
            m();
        }
        ef4.w.f252468t.l().post(new gf4.d(j17, i17, content));
    }

    public final void f(long j17, int i17, java.lang.String str) {
        int i18;
        nf4.j L0 = ef4.w.f252468t.i().L0(j17);
        if (L0 == null) {
            return;
        }
        r45.df6 df6Var = new r45.df6();
        try {
            df6Var.parseFrom(L0.field_attrBuf);
        } catch (java.lang.Exception unused) {
        }
        int i19 = 0;
        java.util.LinkedList CommentList = df6Var.f372390n;
        if (i17 != 0) {
            kotlin.jvm.internal.o.f(CommentList, "CommentList");
            java.util.Iterator it = CommentList.iterator();
            i18 = 0;
            while (it.hasNext()) {
                if (((r45.ke6) it.next()).f378639q == i17) {
                    break;
                } else {
                    i18++;
                }
            }
            i18 = -1;
        } else {
            kotlin.jvm.internal.o.f(CommentList, "CommentList");
            java.util.Iterator it6 = CommentList.iterator();
            while (it6.hasNext()) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(((r45.ke6) it6.next()).f378635m, str)) {
                    i18 = i19;
                    break;
                }
                i19++;
            }
            i18 = -1;
        }
        if (i18 != -1) {
            CommentList.remove(i18);
            df6Var.f372389m = CommentList.size();
            try {
                L0.field_attrBuf = df6Var.toByteArray();
            } catch (java.lang.Exception unused2) {
            }
            ef4.w.f252468t.i().update(j17, L0);
        }
    }

    public final r45.ke6 g(r45.le6 le6Var) {
        r45.ke6 ke6Var = new r45.ke6();
        ke6Var.f378629d = le6Var.f379383d;
        ke6Var.f378639q = le6Var.f379390n;
        ke6Var.f378630e = le6Var.f379385f;
        ke6Var.f378631f = le6Var.f379386g;
        ke6Var.f378635m = le6Var.f379387h;
        ke6Var.f378634i = le6Var.f379384e;
        ke6Var.f378642t = le6Var.f379391o;
        ke6Var.f378643u = le6Var.f379393q;
        ke6Var.f378638p = le6Var.f379396t;
        ke6Var.f378637o = le6Var.f379397u;
        return ke6Var;
    }

    public final gf4.a h(long j17, java.lang.String content, java.lang.String toUsername, java.lang.String str, java.lang.String storyOwner, int i17) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(storyOwner, "storyOwner");
        com.tencent.mars.xlog.Log.i(f271358h, "postComment: " + j17 + ' ' + content + ' ' + toUsername);
        return i(this, j17, toUsername, content, false, false, str, storyOwner, i17, 0, 256, null);
    }

    public final void j(yz5.r listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        f271363p.remove(listener);
    }

    public final void k(r45.hf6 hf6Var) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z17;
        java.lang.Object obj3;
        java.lang.Object obj4;
        r45.ke6 ke6Var = new r45.ke6();
        long j17 = hf6Var.f376120d;
        ke6Var.f378629d = j17;
        r45.if6 if6Var = hf6Var.f376122f;
        ke6Var.f378639q = if6Var.f377003o;
        ke6Var.f378630e = if6Var.f376996e;
        ke6Var.f378631f = if6Var.f376997f;
        ke6Var.f378635m = if6Var.f377000i;
        ke6Var.f378634i = if6Var.f377002n;
        ke6Var.f378642t = if6Var.f377008t;
        ke6Var.f378638p = if6Var.f377004p;
        if (if6Var.f377001m == 7) {
            ke6Var.f378637o = 4;
        }
        nf4.j L0 = ef4.w.f252468t.i().L0(j17);
        if (L0 == null) {
            o(hf6Var.f376122f.f377007s);
            return;
        }
        r45.df6 df6Var = new r45.df6();
        try {
            df6Var.parseFrom(L0.field_attrBuf);
        } catch (java.lang.Exception unused) {
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(ke6Var.f378635m);
        java.util.LinkedList BubbleList = df6Var.f372392p;
        java.util.LinkedList CommentList = df6Var.f372390n;
        java.util.LinkedList VisitorList = df6Var.f372402z;
        if (K0 && ke6Var.f378637o == 4) {
            kotlin.jvm.internal.o.f(VisitorList, "VisitorList");
            java.util.Iterator it = VisitorList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                r45.ke6 ke6Var2 = (r45.ke6) obj4;
                if (ke6Var2.f378639q == ke6Var.f378639q || com.tencent.mm.sdk.platformtools.t8.D0(ke6Var2.f378630e, ke6Var.f378630e)) {
                    break;
                }
            }
            if (((r45.ke6) obj4) == null) {
                VisitorList.add(ke6Var);
                z17 = true;
            }
            z17 = false;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(ke6Var.f378635m)) {
            if (ke6Var.f378639q != 0) {
                kotlin.jvm.internal.o.f(BubbleList, "BubbleList");
                java.util.Iterator it6 = BubbleList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it6.next();
                        if (((r45.ke6) obj2).f378639q == ke6Var.f378639q) {
                            break;
                        }
                    }
                }
                if (((r45.ke6) obj2) == null) {
                    BubbleList.add(ke6Var);
                }
                z17 = false;
            } else {
                BubbleList.add(ke6Var);
            }
            z17 = true;
        } else {
            if (ke6Var.f378639q != 0) {
                kotlin.jvm.internal.o.f(CommentList, "CommentList");
                java.util.Iterator it7 = CommentList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it7.next();
                        if (((r45.ke6) obj).f378639q == ke6Var.f378639q) {
                            break;
                        }
                    }
                }
                if (((r45.ke6) obj) == null) {
                    CommentList.add(ke6Var);
                }
                z17 = false;
            } else {
                CommentList.add(ke6Var);
            }
            z17 = true;
        }
        kotlin.jvm.internal.o.f(VisitorList, "VisitorList");
        java.util.Iterator it8 = VisitorList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj3 = null;
                break;
            }
            java.lang.Object next = it8.next();
            if (com.tencent.mm.sdk.platformtools.t8.D0(((r45.ke6) next).f378630e, ke6Var.f378630e)) {
                obj3 = next;
                break;
            }
        }
        if (((r45.ke6) obj3) == null) {
            VisitorList.add(ke6Var);
        }
        if (z17) {
            df6Var.f372389m = CommentList.size();
            df6Var.f372391o = BubbleList.size();
            df6Var.f372401y = VisitorList.size();
            try {
                L0.field_attrBuf = df6Var.toByteArray();
            } catch (java.lang.Exception unused2) {
            }
            ef4.v vVar = ef4.w.f252468t;
            if (com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), L0.field_userName)) {
                L0.F0(true);
            }
            vVar.i().update(j17, L0);
        }
    }

    public final boolean l(long j17, gf4.a commentDetail) {
        kotlin.jvm.internal.o.g(commentDetail, "commentDetail");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        ef4.v vVar = ef4.w.f252468t;
        nf4.b z07 = vVar.f().z0(j17);
        h0Var.f310123d = z07;
        if (z07 == null) {
            nf4.b bVar = new nf4.b();
            h0Var.f310123d = bVar;
            bVar.field_storyId = j17;
        }
        nf4.b bVar2 = (nf4.b) h0Var.f310123d;
        int i17 = bVar2.field_readCommentId;
        int i18 = commentDetail.f271334e;
        if (i17 != i18) {
            int i19 = bVar2.field_readCommentTime;
            int i27 = commentDetail.f271332c;
            if (i19 < i27) {
                bVar2.field_readCommentId = i18;
                bVar2.field_readCommentTime = i27;
                bVar2.getClass();
                java.lang.String str = commentDetail.f271330a;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                bVar2.f336840x = str;
                nf4.b bVar3 = (nf4.b) h0Var.f310123d;
                java.lang.String str2 = commentDetail.f271340k;
                bVar3.getClass();
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                bVar3.f336841y = str2;
                vVar.f().update((l75.f0) h0Var.f310123d, new java.lang.String[0]);
                pm0.v.X(new gf4.i(h0Var));
                return true;
            }
        }
        return false;
    }

    public final void m() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.je6 je6Var = f271359i;
        int size = je6Var.f377768d.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.le6 le6Var = (r45.le6) je6Var.f377768d.get(i17);
            int i18 = le6Var.f379388i;
            if (i18 == 1 || i18 == 3) {
                int i19 = le6Var.f379384e;
                int e17 = c01.id.e();
                ef4.n.f252460a.a();
                if (i19 > e17 - 86400) {
                    arrayList.add(le6Var);
                }
            }
        }
        je6Var.f377768d.clear();
        je6Var.f377768d.addAll(arrayList);
        f271362o++;
        if (arrayList.size() == 0) {
            f271362o = -1;
            return;
        }
        f271362o %= arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i27 = 0;
        for (java.lang.Object obj : arrayList) {
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (i27 >= f271362o && ((r45.le6) obj).f379392p < f271357g) {
                arrayList2.add(obj);
            }
            i27 = i28;
        }
        r45.le6 le6Var2 = (r45.le6) kz5.n0.Z(arrayList2);
        java.lang.String str = f271358h;
        if (le6Var2 == null || le6Var2.f379388i != 1) {
            if (le6Var2 == null || le6Var2.f379388i != 3) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "deleteCommentToRemote " + le6Var2.f379386g + ' ' + le6Var2.f379383d + ' ' + le6Var2.f379390n + ' ' + le6Var2.f379384e);
            f271360m = le6Var2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(new ff4.n(le6Var2.f379383d, 2, le6Var2.f379390n));
            gm0.j1.n().f273288b.g(new ff4.e(arrayList3, new java.util.ArrayList()));
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "postCommentToRemote " + le6Var2.f379386g + ' ' + le6Var2.f379383d + ' ' + le6Var2.f379391o + ' ' + le6Var2.f379384e);
        f271360m = le6Var2;
        r45.ke6 g17 = g(le6Var2);
        java.lang.String str2 = g17.f378635m;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(994L, 2L, 1L);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(994L, 1L, 1L);
        }
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String clientId = le6Var2.f379389m;
        kotlin.jvm.internal.o.f(clientId, "clientId");
        r1Var.g(new ff4.b(clientId, g17, le6Var2.f379394r, f271361n));
    }

    public final void n(boolean z17, boolean z18) {
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        boolean e17 = bk0.a.g().e(352279, 266241);
        com.tencent.mars.xlog.Log.i(f271358h, "updateCommentRead: " + e17 + ", " + z17);
        if (e17 != z17 || z18) {
            pm0.v.X(new gf4.j(z17));
        }
    }

    public final void o(r45.df6 df6Var) {
        if (df6Var != null) {
            ef4.v vVar = ef4.w.f252468t;
            nf4.j L0 = vVar.i().L0(df6Var.f372383d);
            if (L0 == null) {
                L0 = new nf4.j();
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), L0.field_userName)) {
                L0.F0(true);
            }
            ef4.e0.f252441a.c(L0, df6Var, com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), df6Var.f372384e) ? 4 : 8);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        int i19;
        kotlin.jvm.internal.o.g(scene, "scene");
        int type = scene.getType();
        java.lang.String str2 = f271358h;
        com.tencent.mars.xlog.Log.i(str2, "onSceneEnd " + i17 + ", " + i18 + ", " + str + ", " + type);
        long j17 = 100;
        int i27 = f271357g;
        if (type != 354) {
            if (type == 764 && (((ff4.e) scene).H() instanceof ff4.n)) {
                if (i17 == 0 && i18 == 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete comment success ");
                    r45.le6 le6Var = f271360m;
                    sb6.append(le6Var != null ? le6Var.f379387h : null);
                    com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                    r45.le6 le6Var2 = f271360m;
                    if (le6Var2 != null) {
                        le6Var2.f379388i = 4;
                    }
                    f271360m = null;
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("delete comment fail ");
                    r45.le6 le6Var3 = f271360m;
                    sb7.append(le6Var3 != null ? le6Var3.f379387h : null);
                    com.tencent.mars.xlog.Log.i(str2, sb7.toString());
                    r45.le6 le6Var4 = f271360m;
                    i19 = le6Var4 != null ? le6Var4.f379392p : 0;
                    if (i17 == 4) {
                        if (le6Var4 != null) {
                            le6Var4.f379392p = i27;
                        }
                    } else if (le6Var4 != null) {
                        le6Var4.f379392p = i19 + 1;
                    }
                    f271360m = null;
                    j17 = 60000;
                }
                ef4.w.f252468t.l().postDelayed(gf4.g.f271349d, j17);
                return;
            }
            return;
        }
        ff4.b bVar = (ff4.b) scene;
        com.tencent.mm.protobuf.f fVar = bVar.f261663f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentResponse");
        r45.ne6 ne6Var = (r45.ne6) fVar;
        java.util.LinkedList linkedList = f271365r;
        gf4.a aVar = bVar.f261662e;
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("post comment success ");
            r45.le6 le6Var5 = f271360m;
            sb8.append(le6Var5 != null ? le6Var5.f379387h : null);
            sb8.append(' ');
            sb8.append(ne6Var.f381332e);
            com.tencent.mars.xlog.Log.i(str2, sb8.toString());
            ef4.w.f252468t.l().post(new gf4.e(ne6Var));
            if (aVar != null) {
                aVar.f271334e = ne6Var.f381332e;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((yz5.p) it.next()).invoke(java.lang.Boolean.TRUE, java.lang.Long.valueOf(aVar != null ? aVar.f271333d : 0L));
            }
            r45.le6 le6Var6 = f271360m;
            if (le6Var6 != null) {
                le6Var6.f379390n = ne6Var.f381332e;
            }
            if (le6Var6 != null) {
                le6Var6.f379388i = 2;
            }
            f271360m = null;
        } else {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("post comment fail ");
            r45.le6 le6Var7 = f271360m;
            sb9.append(le6Var7 != null ? le6Var7.f379387h : null);
            com.tencent.mars.xlog.Log.i(str2, sb9.toString());
            r45.le6 le6Var8 = f271360m;
            i19 = le6Var8 != null ? le6Var8.f379392p : 0;
            if (i17 == 4) {
                if (le6Var8 != null) {
                    le6Var8.f379392p = i27;
                }
            } else if (le6Var8 != null) {
                le6Var8.f379392p = i19 + 1;
            }
            f271360m = null;
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((yz5.p) it6.next()).invoke(java.lang.Boolean.FALSE, java.lang.Long.valueOf(aVar != null ? aVar.f271333d : 0L));
            }
            j17 = 300000;
        }
        ef4.w.f252468t.l().postDelayed(gf4.f.f271348d, j17);
    }
}
