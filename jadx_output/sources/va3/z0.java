package va3;

/* loaded from: classes9.dex */
public class z0 implements q21.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434396a;

    /* renamed from: b, reason: collision with root package name */
    public ua3.b f434397b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f434398c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f434399d = new java.util.LinkedList();

    public z0() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(gm0.j1.u().h() + "trackroom/");
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "trackroom/");
        sb6.append("trackroominfolist.info");
        java.lang.String sb7 = sb6.toString();
        this.f434396a = sb7;
        this.f434398c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        if (this.f434397b != null) {
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(sb7)) {
            this.f434397b = new ua3.b();
            return;
        }
        try {
            this.f434397b = (ua3.b) new ua3.b().parseFrom(com.tencent.mm.vfs.w6.N(sb7, 0, -1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackRoomListMgr", e17, "", new java.lang.Object[0]);
            this.f434397b = new ua3.b();
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = this.f434399d.iterator();
        while (it.hasNext()) {
            this.f434398c.post(new va3.y0(this, (q21.c) it.next(), str, str2, str3));
        }
    }

    public synchronized java.util.LinkedList b(java.lang.String str) {
        ua3.a aVar;
        java.util.Iterator it = this.f434397b.f425975d.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (ua3.a) it.next();
            if (aVar.f425969d.equals(str)) {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (!c01.v1.u(str)) {
                    return (java.util.LinkedList) aVar.f425970e.clone();
                }
            }
        }
        if (aVar != null) {
            g(aVar.f425969d, null, 0.0d, 0.0d, "", "", "");
        }
        return new java.util.LinkedList();
    }

    public synchronized ua3.a c(java.lang.String str) {
        java.util.Iterator it = this.f434397b.f425975d.iterator();
        while (it.hasNext()) {
            ua3.a aVar = (ua3.a) it.next();
            if (aVar.f425969d.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(ua3.b bVar) {
        bVar.f425975d.size();
        boolean isEmpty = bVar.f425975d.isEmpty();
        java.lang.String str = this.f434396a;
        if (isEmpty) {
            com.tencent.mm.vfs.w6.h(str);
            return true;
        }
        try {
            byte[] byteArray = bVar.toByteArray();
            com.tencent.mm.vfs.w6.S(str, byteArray, 0, byteArray.length);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackRoomListMgr", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean e() {
        java.util.Iterator it = this.f434397b.f425975d.iterator();
        while (it.hasNext()) {
            ua3.a aVar = (ua3.a) it.next();
            aVar.f425970e.size();
            java.util.Iterator it6 = aVar.f425970e.iterator();
            while (it6.hasNext()) {
                if (((java.lang.String) it6.next()).equals(c01.z1.r())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackRoomListMgr", "now is sharing location..");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean f(java.lang.String str) {
        return b(str).size() > 0;
    }

    public synchronized void g(java.lang.String str, java.util.LinkedList linkedList, double d17, double d18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackRoomListMgr", "updateList talk: %s,  size: %d %f %f", str, java.lang.Integer.valueOf(linkedList.size()), java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18));
        java.util.LinkedList linkedList2 = (java.util.LinkedList) linkedList.clone();
        boolean isEmpty = linkedList2.isEmpty();
        java.util.Iterator it = this.f434397b.f425975d.iterator();
        while (it.hasNext()) {
            ua3.a aVar = (ua3.a) it.next();
            if (aVar.f425969d.equals(str)) {
                if (isEmpty) {
                    this.f434397b.f425975d.remove(aVar);
                } else {
                    aVar.f425970e = linkedList2;
                    aVar.f425973h = str2;
                    aVar.f425972g = d17;
                    aVar.f425971f = d18;
                }
                d(this.f434397b);
                a(str, str3, str4);
                return;
            }
        }
        if (!isEmpty) {
            ua3.a aVar2 = new ua3.a();
            aVar2.f425969d = str;
            aVar2.f425970e = linkedList2;
            aVar2.f425973h = str2;
            aVar2.f425972g = d17;
            aVar2.f425971f = d18;
            this.f434397b.f425975d.add(aVar2);
        }
        d(this.f434397b);
        a(str, str3, str4);
    }
}
