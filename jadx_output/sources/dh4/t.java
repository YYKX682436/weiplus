package dh4;

/* loaded from: classes8.dex */
public class t implements p21.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f232582a;

    /* renamed from: b, reason: collision with root package name */
    public bh4.b f232583b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f232584c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f232585d = new java.util.HashSet();

    public t() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(gm0.j1.u().h() + "talkroom/");
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
        sb6.append(gm0.j1.u().h() + "talkroom/");
        sb6.append("talkroomMemberList.info");
        java.lang.String sb7 = sb6.toString();
        this.f232582a = sb7;
        this.f232584c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        if (this.f232583b != null) {
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(sb7)) {
            this.f232583b = new bh4.b();
            return;
        }
        try {
            this.f232583b = (bh4.b) new bh4.b().parseFrom(com.tencent.mm.vfs.w6.N(sb7, 0, -1));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", e17, "", new java.lang.Object[0]);
            this.f232583b = new bh4.b();
        }
    }

    public synchronized void a(p21.a aVar) {
        this.f232585d.add(aVar);
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator it = this.f232585d.iterator();
        while (it.hasNext()) {
            this.f232584c.post(new dh4.s(this, (p21.a) it.next(), str, str2, str3));
        }
    }

    public synchronized boolean c(java.lang.String str) {
        java.util.Iterator it = this.f232583b.f20917d.iterator();
        while (it.hasNext()) {
            bh4.a aVar = (bh4.a) it.next();
            if (aVar.f20914d.equals(str) && aVar.f20916f == 0) {
                return true;
            }
        }
        return false;
    }

    public synchronized java.util.LinkedList d(java.lang.String str) {
        java.util.Iterator it = this.f232583b.f20917d.iterator();
        while (it.hasNext()) {
            bh4.a aVar = (bh4.a) it.next();
            if (aVar.f20914d.equals(str)) {
                return (java.util.LinkedList) aVar.f20915e.clone();
            }
        }
        return new java.util.LinkedList();
    }

    public final boolean e(bh4.b bVar) {
        boolean isEmpty = bVar.f20917d.isEmpty();
        java.lang.String str = this.f232582a;
        if (isEmpty) {
            com.tencent.mm.vfs.w6.h(str);
            return true;
        }
        try {
            byte[] byteArray = bVar.toByteArray();
            com.tencent.mm.vfs.w6.S(str, byteArray, 0, byteArray.length);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public synchronized void f(p21.a aVar) {
        this.f232585d.remove(aVar);
    }

    public synchronized void g(java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, int i17) {
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TalkRoomInfoListMgr", "updateList talk: %s,  size: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        java.util.LinkedList linkedList2 = (java.util.LinkedList) linkedList.clone();
        boolean isEmpty = linkedList2.isEmpty();
        java.util.Iterator it = this.f232583b.f20917d.iterator();
        while (it.hasNext()) {
            bh4.a aVar = (bh4.a) it.next();
            if (aVar.f20914d.equals(str)) {
                if (isEmpty) {
                    this.f232583b.f20917d.remove(aVar);
                } else {
                    aVar.f20915e = linkedList2;
                    aVar.f20916f = i17;
                }
                e(this.f232583b);
                b(str, str2, str3);
                return;
            }
        }
        if (!isEmpty) {
            bh4.a aVar2 = new bh4.a();
            aVar2.f20914d = str;
            aVar2.f20915e = linkedList2;
            aVar2.f20916f = i17;
            this.f232583b.f20917d.add(aVar2);
        }
        e(this.f232583b);
        b(str, str2, str3);
    }
}
