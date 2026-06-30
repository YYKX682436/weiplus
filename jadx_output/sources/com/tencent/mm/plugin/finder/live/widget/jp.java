package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class jp implements si2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pp f118768d;

    public jp(com.tencent.mm.plugin.finder.live.widget.pp ppVar) {
        this.f118768d = ppVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // si2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r50, r45.xn1 r51) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.jp.e(int, r45.xn1):void");
    }

    @Override // si2.a
    public void f(int i17, r45.xn1 xn1Var) {
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        gk2.e eVar = this.f118768d.f119395a;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329319p) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((km2.q) next).f309172c;
                    if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                        obj = finderContact.getUsername();
                    }
                    if (kotlin.jvm.internal.o.b(str, obj)) {
                        obj = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f309181l = 6;
            }
        }
        this.f118768d.f119397c.a();
        this.f118768d.f119397c.f119085f.C1();
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f118768d.f119402h;
        if (c2Var != null) {
            ((com.tencent.mm.plugin.finder.live.plugin.p7) c2Var).c(xn1Var);
        }
    }
}
