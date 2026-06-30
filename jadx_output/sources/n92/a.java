package n92;

/* loaded from: classes8.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f335905t;

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f335906u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f335907v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m92.a args) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.String str = "Cgi.CreateFinderAccount@" + hashCode();
        this.f335905t = str;
        this.f335906u = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f335907v = jSONObject;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.q01 q01Var = new r45.q01();
        q01Var.set(4, db2.t4.f228171a.a(3922));
        q01Var.set(1, args.f324968b);
        q01Var.set(5, args.f324969c);
        q01Var.set(3, args.f324970d);
        q01Var.set(6, args.f324971e);
        q01Var.set(8, java.lang.Integer.valueOf(args.f324973g));
        q01Var.set(7, java.lang.Integer.valueOf(args.f324974h));
        q01Var.set(9, args.f324972f);
        q01Var.set(10, java.lang.Integer.valueOf(args.f324975i));
        q01Var.set(12, java.lang.Integer.valueOf(args.f324976j));
        q01Var.set(13, args.f324967a);
        q01Var.set(11, args.f324977k);
        lVar.f70664a = q01Var;
        r45.r01 r01Var = new r45.r01();
        r01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r01Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = r01Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercreateuser";
        lVar.f70667d = 3922;
        p(lVar.a());
        jSONObject.put("nickname", args.f324968b);
        jSONObject.put("signature", q01Var.getInteger(10));
        com.tencent.mars.xlog.Log.i(str, "[CgiCreateFinderAccount] created...");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        m92.b j37;
        r45.r01 resp = (r45.r01) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = this.f335905t;
        com.tencent.mars.xlog.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = g92.b.f269769e.h6().f324986i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof l92.a) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next2 = it6.next();
            if (((l92.a) next2).b() == this.f70646f.f70713d) {
                arrayList2.add(next2);
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            jSONObject = this.f335906u;
            if (!hasNext) {
                break;
            } else {
                ((l92.a) it7.next()).a(i17, i18, str, resp, jSONObject);
            }
        }
        if (i17 == 0 && i18 == 0 && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) resp.getCustom(1)) != null) {
            ya2.h.f460484a.j(finderContact);
            g92.b bVar = g92.b.f269769e;
            m92.c a17 = m92.d.a(finderContact);
            m92.j jVar = m92.j.f324991f;
            bVar.C(a17, jVar);
            java.lang.String username = finderContact.getUsername();
            if (username == null) {
                username = "";
            }
            if ((username.length() > 0) && !bVar.j4() && (j37 = g92.a.j3(bVar, username, false, 2, null)) != null && !j37.v0()) {
                bVar.A1(username);
                m92.f fVar2 = new m92.f();
                fVar2.set(0, username);
                bVar.S1(fVar2, jVar);
                com.tencent.mars.xlog.Log.i(str2, "[successful] set default and master, username:".concat(username));
            }
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String source = str2 + ", successful";
            kotlin.jvm.internal.o.g(source, "source");
            bVar.u2(source).l();
            bVar.M0(15).l();
        }
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            ((l92.a) it8.next()).c(i17, i18, str, resp, jSONObject);
        }
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i(this.f335905t, "[run]...");
        return super.l();
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f335907v;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335906u;
    }
}
