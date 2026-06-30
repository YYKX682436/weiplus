package jr1;

/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final jr1.i f301360a = new jr1.i();

    public final boolean a(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return kotlin.jvm.internal.o.b(jr1.j.e(str, i17), c(i17));
    }

    public final void b() {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("bizphotofansnofiticationholder@picfansmsg");
        Di.m(linkedList);
        nr1.f Vi = yq1.u0.Vi();
        hr1.e z07 = Vi.z0("bizphotofansnofiticationholder@picfansmsg");
        if (z07.systemRowid < 0) {
            hr1.g gVar = hr1.i.f283349e;
            hr1.e eVar = new hr1.e(hr1.i.f283351g);
            jr1.j.f(eVar, 5);
            Vi.replace(eVar, true);
        }
        com.tencent.wechat.iam.biz.l0.f217758c.h(c(5), new jr1.b(z07, Vi));
    }

    public final java.lang.String c(int i17) {
        if (i17 == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            return ((ox.r) d0Var).Bi(2).c();
        }
        rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr2 = tk.s.f419870d;
        return ((ox.r) d0Var2).Bi(1).c();
    }

    public final void d(int i17, java.lang.String currentBiz, java.lang.String identityName, int i18, boolean z17, yz5.l onBlockFinished) {
        kotlin.jvm.internal.o.g(currentBiz, "currentBiz");
        kotlin.jvm.internal.o.g(identityName, "identityName");
        kotlin.jvm.internal.o.g(onBlockFinished, "onBlockFinished");
        r45.r16 r16Var = new r45.r16();
        if (currentBiz.length() == 0) {
            currentBiz = f301360a.c(i17);
        }
        r16Var.f384434d = currentBiz;
        r16Var.f384435e = i18;
        if (i17 == 5) {
            r16Var.f384436f = r26.n0.Z(identityName, "@picfansmsg");
        } else {
            r16Var.f384436f = r26.n0.Z(identityName, "@bizfansmsg");
        }
        r16Var.f384437g = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 26275;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/setblacklist";
        lVar.f70664a = r16Var;
        lVar.f70665b = new r45.s16();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new jr1.e(onBlockFinished));
    }

    public final void e(int i17, java.lang.String openId, int i18) {
        kotlin.jvm.internal.o.g(openId, "openId");
        com.tencent.wechat.iam.biz.l0.f217758c.i(c(i18), i17, i18 == 5 ? com.tencent.mm.storage.c2.f193804b : com.tencent.mm.storage.c2.f193803a, openId, jr1.f.f301357a);
    }
}
