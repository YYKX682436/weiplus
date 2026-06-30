package te5;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final te5.h f418649a = new te5.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f418650b = jz5.h.b(te5.g.f418641d);

    public final boolean a(com.tencent.mm.storage.f9 msg) {
        java.lang.String r17;
        kotlin.jvm.internal.o.g(msg, "msg");
        v05.b bVar = new v05.b();
        java.lang.String U1 = msg.U1();
        java.lang.String str = "";
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
        java.lang.String g17 = ez.v0.f257777a.g(bVar);
        if (g17 == null) {
            g17 = "";
        }
        int i17 = bVar.f432315e;
        v05.a aVar = (v05.a) bVar.getCustom(i17 + 8);
        if (aVar != null && (r17 = aVar.r()) != null) {
            str = r17;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((ez.e) j0Var).cj(msg, g17, str, false));
        if (!r6Var.m()) {
            return false;
        }
        long C = r6Var.C();
        v05.a aVar2 = (v05.a) bVar.getCustom(i17 + 8);
        return C >= (aVar2 != null ? aVar2.getLong(aVar2.f368364d + 0) : 0L);
    }

    public final boolean b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        return d(f9Var) == 6 || com.tencent.mm.ui.chatting.component.z4.c(f9Var, bm5.z.h(bm5.y.f22756i.a(f9Var, bm5.f0.f22575w), null, false, 3, null));
    }

    public final boolean c() {
        if (!pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.file.RepairerConfigMvvmItem_FileNewStyle.class, false)) {
            return false;
        }
        sc5.g gVar = sc5.g.f406572a;
        return sc5.g.f406573b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        if ((r3 != null && (r26.n0.N(r3) ^ true)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0172, code lost:
    
        if (r10 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0157, code lost:
    
        if (r26.i0.y(r3, "content://", false) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016e, code lost:
    
        if ((!r26.n0.N(r3.C())) != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.tencent.mm.storage.f9 r19) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te5.h.d(com.tencent.mm.storage.f9):int");
    }

    public final int e(com.tencent.mm.storage.f9 f9Var) {
        float floatValue;
        if (f9Var == null) {
            return 0;
        }
        if (f9Var.A0() == 1 && !sc5.i.f406581a.a(f9Var)) {
            java.lang.Float f17 = (java.lang.Float) ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).aj().get(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0()).toString());
            if (f17 == null) {
                return 0;
            }
            floatValue = f17.floatValue();
        } else {
            if (a(f9Var)) {
                return 100;
            }
            lm.o oVar = (lm.o) ((jz5.n) ((lm.r) ((w65.n) i95.n0.c(w65.n.class))).f319331o).getValue();
            i95.m c17 = i95.n0.c(e40.w.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.Float f18 = (java.lang.Float) oVar.get(e40.w.s6((e40.w) c17, f9Var, null, 2, null));
            if (f18 == null) {
                return 0;
            }
            floatValue = f18.floatValue();
        }
        return (int) floatValue;
    }
}
