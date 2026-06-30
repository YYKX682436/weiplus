package kr4;

/* loaded from: classes11.dex */
public final class m extends l75.n0 implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f311515e = {l75.n0.getCreateSQLs(kr4.g.f311505l1, "W1wConversation")};

    /* renamed from: f, reason: collision with root package name */
    public static final kr4.l f311516f = new kr4.l();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f311517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l75.k0 db6) {
        super(db6, kr4.g.f311505l1, "W1wConversation", dm.wb.E);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = kr4.g.f311505l1;
        this.f311517d = db6;
    }

    public final java.util.List D0(java.lang.String selfUserName, int i17, int i18, int i19) {
        p75.l0 a17;
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i19 == 1) {
            p75.n0 n0Var = dm.wb.f240902w;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            p75.m c17 = dm.wb.f240904y.j(selfUserName).c(dm.wb.D.q(1));
            linkedList3.add(dm.wb.B.u());
            linkedList3.add(dm.wb.A.u());
            p75.i0 g17 = dm.wb.f240902w.g(linkedList2);
            g17.f352657d = c17;
            g17.f352659f = linkedList3;
            g17.f352660g = linkedList4;
            g17.c(i18, i17);
            a17 = g17.a();
        } else if (i19 != 2) {
            p75.n0 n0Var2 = dm.wb.f240902w;
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            p75.m0 j17 = dm.wb.f240904y.j(selfUserName);
            p75.d dVar = dm.wb.f240903x;
            dVar.getClass();
            p75.m c18 = j17.c(new p75.w0(dVar.z(), "w1wsayhisessionholder@w1wmsg"));
            linkedList6.add(dm.wb.B.u());
            linkedList6.add(dm.wb.A.u());
            p75.i0 g18 = dm.wb.f240902w.g(linkedList5);
            g18.f352657d = c18;
            g18.f352659f = linkedList6;
            g18.f352660g = linkedList7;
            g18.c(i18, i17);
            a17 = g18.a();
        } else {
            p75.n0 n0Var3 = dm.wb.f240902w;
            java.util.LinkedList linkedList8 = new java.util.LinkedList();
            java.util.LinkedList linkedList9 = new java.util.LinkedList();
            java.util.LinkedList linkedList10 = new java.util.LinkedList();
            p75.m c19 = dm.wb.f240904y.j(selfUserName).c(dm.wb.D.i(1));
            linkedList9.add(dm.wb.B.u());
            linkedList9.add(dm.wb.A.u());
            p75.i0 g19 = dm.wb.f240902w.g(linkedList8);
            g19.f352657d = c19;
            g19.f352659f = linkedList9;
            g19.f352660g = linkedList10;
            g19.c(i18, i17);
            a17 = g19.a();
        }
        java.util.Iterator it = ((java.util.ArrayList) a17.k(this.f311517d, kr4.g.class)).iterator();
        while (it.hasNext()) {
            kr4.g gVar = (kr4.g) it.next();
            gVar.f311508y0 = f311516f;
            gVar.t0();
            linkedList.add(gVar);
        }
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.ConversationStorage", "[query] biz=" + selfUserName + " offset=" + i17 + " pageCount=" + i18 + "list size=" + linkedList.size());
        return linkedList;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj = w0Var != null ? w0Var.f316976d : null;
        if (!(obj instanceof kr4.g)) {
            obj = null;
        }
        if (obj != null) {
            kr4.g gVar = (kr4.g) obj;
            if (kotlin.jvm.internal.o.b(gVar.field_sessionId, "w1wnotificationholder@w1wmsg")) {
                return;
            }
            if ((w0Var != null ? w0Var.f316976d : null) instanceof kr4.g) {
                fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
                java.lang.String field_selfUserName = gVar.field_selfUserName;
                kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
                g0Var.getClass();
                com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] updating reddot for username=".concat(field_selfUserName));
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = g0Var.f265828o;
                concurrentHashMap.put(field_selfUserName, g0Var.Ui(field_selfUserName));
                java.lang.String str2 = (java.lang.String) concurrentHashMap.get(field_selfUserName);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONArray.put(field_selfUserName);
                jSONObject2.put("usernames", jSONArray);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
                com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] reddot JSON prepared for username=" + field_selfUserName + ", reddotId=" + str2);
                if (!((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                    com.tencent.mars.xlog.Log.w("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] LiteAppFeatureService not initialized, cannot publish reddot event");
                    return;
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.l("w1w.w1wPersonalMsgReddotChange", jSONObject);
                com.tencent.mars.xlog.Log.i("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] reddot event published for username=".concat(field_selfUserName));
            }
        }
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var, boolean z17) {
        kr4.g gVar = (kr4.g) f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        sb6.append(gVar != null ? gVar.toString() : null);
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.ConversationStorage", sb6.toString());
        boolean z18 = false;
        if (gVar != null) {
            android.content.ContentValues convertTo = gVar.convertTo();
            java.lang.String field_sessionId = gVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            l75.k0 k0Var = this.f311517d;
            android.database.Cursor B = k0Var.B("select *, rowid from W1wConversation where sessionId = '" + field_sessionId + "' ", null);
            try {
                boolean z19 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z19) {
                    if (k0Var.p(getTableName(), convertTo, "sessionId = ?", new java.lang.String[]{"" + gVar.field_sessionId}) > 0) {
                        z18 = true;
                    }
                } else {
                    z18 = super.insertNotify(gVar, false);
                }
                if (z18 && z17) {
                    doNotify(gVar.field_sessionId, 1, gVar);
                }
            } finally {
            }
        }
        return z18;
    }

    public final kr4.g y0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        android.database.Cursor B = this.f311517d.B("select *, rowid from W1wConversation where sessionId = '" + sessionId + "' ", null);
        kr4.g gVar = new kr4.g(f311516f);
        gVar.field_sessionId = sessionId;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    gVar.convertFrom(B);
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return gVar;
    }

    public final int z0(int i17, java.lang.String selfUserName) {
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        p75.i0 h17 = dm.wb.f240902w.h(dm.wb.f240905z.y());
        p75.y yVar = (p75.y) dm.wb.f240904y.j(selfUserName).c(dm.wb.C.i(java.lang.Integer.valueOf(i17)));
        yVar.f(dm.wb.D.i(0));
        p75.d dVar = dm.wb.f240903x;
        dVar.getClass();
        yVar.f(new p75.w0(dVar.z(), "w1wsayhisessionholder@w1wmsg"));
        h17.f352657d = yVar;
        h17.f352656c = "W1wPersonalMsg.ConversationStorage";
        int m17 = h17.a().m(this.f311517d);
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.ConversationStorage", "[getAllUnreadCount] type=" + i17 + " selfUserName:" + selfUserName + " count=" + m17);
        return m17;
    }
}
