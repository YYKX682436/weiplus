package ow;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.n f349259a = new ow.n();

    public com.tencent.wechat.mm.brand_service.j a(com.tencent.mm.storage.f9 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(info.j(), "msg", null);
        if (d17 == null) {
            d17 = kz5.q0.f314001d;
        }
        bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
        com.tencent.wechat.mm.brand_service.j jVar2 = new com.tencent.wechat.mm.brand_service.j();
        jVar2.f218987u = info.getType();
        jVar2.f218975f = info.Q0();
        jVar2.f218976g = info.I0();
        jVar2.F = info.getMsgId();
        jVar2.f218977h = info.getCreateTime();
        boolean z17 = false;
        jVar2.f218978i = info.P0() == 4 ? 1 : 0;
        jVar2.f218979m = -1;
        jVar2.G = info.getType() == -1879048173 ? 2 : info.getType() == 436207665 ? 3 : 1;
        jVar2.f218986t = info.j();
        jVar2.f218989w = info.G;
        jVar2.f218979m = -1;
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.template_id");
        if (str == null) {
            str = "";
        }
        jVar2.H = str;
        jVar2.A = i17;
        e31.k a17 = e31.n.f247087a.a("name_biz");
        if (a17 != null && true == ((g31.l) a17).f268094g) {
            z17 = true;
        }
        if (z17 && bw.i.accepted == ((zv.o0) jVar).Di(info)) {
            jVar2.f218972J = 1;
        }
        return jVar2;
    }

    public com.tencent.mm.storage.f9 b(com.tencent.wechat.mm.brand_service.j bizMsgInfo) {
        kotlin.jvm.internal.o.g(bizMsgInfo, "bizMsgInfo");
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.f193932l2 = bizMsgInfo.f218973d;
        f9Var.setMsgId(bizMsgInfo.F);
        f9Var.o1(bizMsgInfo.f218976g);
        int i17 = bizMsgInfo.G;
        if (i17 > 0) {
            if (i17 == 1) {
                r2 = 318767153;
            } else if (i17 == 3) {
                r2 = 436207665;
            }
            f9Var.setType(r2);
        } else {
            f9Var.setType(bizMsgInfo.f218987u != 2 ? 318767153 : -1879048173);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "convertNoticeBizMsgInfoToMsgInfo compatible logic");
        }
        f9Var.r1((bizMsgInfo.f218978i & 1) == 1 ? 4 : 3);
        f9Var.j1(0);
        f9Var.e1(bizMsgInfo.f218977h);
        f9Var.u1(bizMsgInfo.f218975f);
        f9Var.d1(bizMsgInfo.f218986t);
        f9Var.u3(bizMsgInfo.f218989w);
        return f9Var;
    }

    public com.tencent.mm.storage.f9 c() {
        com.tencent.wechat.mm.brand_service.k c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.mm.brand_service.g0 c18 = yw.a3.f466266a.c();
        java.util.LinkedList linkedList = (c18 == null || (c17 = c18.c(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 1)) == null) ? null : c17.f218998d;
        if (linkedList != null) {
            for (int size = linkedList.size() - 1; -1 < size; size--) {
                ow.n nVar = f349259a;
                java.lang.Object obj = linkedList.get(size);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                arrayList.add(nVar.b((com.tencent.wechat.mm.brand_service.j) obj));
            }
        }
        if (arrayList.size() == 1) {
            return (com.tencent.mm.storage.f9) arrayList.get(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.wechat.mm.brand_service.j r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.n.d(com.tencent.wechat.mm.brand_service.j):void");
    }
}
