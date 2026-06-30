package pn;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f356930a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f356931b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f356932c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo f356933d;

    /* renamed from: e, reason: collision with root package name */
    public final long f356934e;

    /* renamed from: f, reason: collision with root package name */
    public final pn.a f356935f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f356936g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.tencent.mm.ui.MMActivity r2, java.lang.String r3, java.lang.String r4, com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo r5, long r6, pn.a r8) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "iChatRoomAddContactCallback"
            kotlin.jvm.internal.o.g(r8, r0)
            r1.<init>()
            r1.f356930a = r2
            r1.f356931b = r3
            r1.f356932c = r4
            r1.f356933d = r5
            r1.f356934e = r6
            r1.f356935f = r8
            java.lang.Class<rv1.f> r4 = rv1.f.class
            lm0.a r4 = gm0.j1.s(r4)
            rv1.f r4 = (rv1.f) r4
            qv1.a r4 = (qv1.a) r4
            com.tencent.mm.storage.b3 r4 = r4.a()
            com.tencent.mm.storage.a3 r4 = r4.z0(r3)
            r1.f356936g = r4
            pn.l r5 = new pn.l
            r5.<init>(r1)
            jz5.h.b(r5)
            pn.k r5 = new pn.k
            r5.<init>(r1)
            jz5.h.b(r5)
            if (r4 == 0) goto L8b
            kotlin.jvm.internal.o.d(r4)
            int r5 = r4.y0()
            kotlin.jvm.internal.o.d(r4)
            boolean r4 = r4.P0()
            if (r4 != 0) goto L5f
            boolean r3 = com.tencent.mm.storage.z3.q4(r3)
            r4 = 1
            if (r3 == 0) goto L5b
            r3 = r5 & 1
            if (r3 != r4) goto L5f
            goto L60
        L5b:
            r3 = 2
            if (r5 != r3) goto L5f
            goto L60
        L5f:
            r4 = 0
        L60:
            if (r4 == 0) goto L83
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            bh5.c r4 = new bh5.c
            r4.<init>()
            r4.d(r3)
            bh5.d r3 = r4.f20922a
            r3.f20924a = r2
            java.lang.Class<com.tencent.mm.chatroom.ui.InvitationReasonEditorUI> r2 = com.tencent.mm.chatroom.ui.InvitationReasonEditorUI.class
            java.lang.String r2 = r2.getName()
            r4.a(r2)
            r2 = 132412(0x2053c, float:1.85549E-40)
            r4.h(r2)
            goto L92
        L83:
            r2 = 0
            r3 = 2131755233(0x7f1000e1, float:1.914134E38)
            r1.b(r2, r3)
            goto L92
        L8b:
            java.lang.String r2 = "MicroMsg.ChatRoomAddContactProcess"
            java.lang.String r3 = "member is null!!!"
            com.tencent.mars.xlog.Log.e(r2, r3)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.m.<init>(com.tencent.mm.ui.MMActivity, java.lang.String, java.lang.String, com.tencent.mm.chatroom.ui.ChatroomInfoUI$LocalHistoryInfo, long, pn.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pn.m r19, int r20, int r21, o65.d r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn.m.a(pn.m, int, int, o65.d, java.lang.String):void");
    }

    public final void b(java.lang.String str, int i17) {
        java.util.ArrayList P1;
        java.lang.String str2 = this.f356931b;
        boolean N4 = com.tencent.mm.storage.z3.N4(str2);
        com.tencent.mm.ui.MMActivity mMActivity = this.f356930a;
        java.lang.String str3 = this.f356932c;
        if (N4 && !c01.e2.E(str2) && !c01.t1.a(str3)) {
            db5.e1.s(mMActivity, c(com.tencent.mm.R.string.i5c), c(com.tencent.mm.R.string.f490573yv));
            return;
        }
        java.lang.String r17 = c01.z1.r();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (r17 == null) {
            r17 = "";
        }
        boolean z18 = true;
        if (!kotlin.jvm.internal.o.b(r17, str3)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(str2);
            if (m17 == null) {
                z18 = false;
            } else {
                java.util.Iterator it = m17.iterator();
                boolean z19 = false;
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b((java.lang.String) it.next(), str3)) {
                        z19 = true;
                    }
                }
                z18 = z19;
            }
        }
        if (z18) {
            db5.e1.s(mMActivity, c(com.tencent.mm.R.string.f489840d8), c(com.tencent.mm.R.string.f490573yv));
        } else {
            if (str3 == null || (P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) new r26.t(",").g(str3, 0).toArray(new java.lang.String[0]))) == null) {
                return;
            }
            com.tencent.mm.roomsdk.model.factory.a j17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str2).j(str2, P1, str, this.f356933d);
            j17.f192248d = new pn.b(this);
            j17.c(this.f356930a, c(com.tencent.mm.R.string.f490573yv), c(i17), true, true, new pn.c(j17));
        }
    }

    public final java.lang.String c(int i17) {
        java.lang.String string = this.f356930a.getString(i17);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.String d(int i17, java.lang.Object... formatArgs) {
        kotlin.jvm.internal.o.g(formatArgs, "formatArgs");
        java.lang.String string = this.f356930a.getString(i17, java.util.Arrays.copyOf(formatArgs, formatArgs.length));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void e(java.lang.String str, java.util.List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            linkedList.add(list.get(i17));
        }
        c01.t1.c(str, linkedList, c(com.tencent.mm.R.string.b07), true, "weixin://findfriend/verifycontact/" + str + '/');
    }

    public final boolean f() {
        return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatroomGlobalSwitch"), 1) == 1;
    }

    public final java.util.List g(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!gm0.j1.a() || list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
                kotlin.jvm.internal.o.f(str, "getDisplayRemark(...)");
            }
            linkedList.add(str);
        }
        return linkedList;
    }
}
