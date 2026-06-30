package ke5;

/* loaded from: classes9.dex */
public final class p extends ke5.a {
    @Override // ke5.a, hd5.k
    public void c(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView, hd5.q qVar) {
        super.c(mMChattingListView, qVar);
        mMChattingListView.setIsTopShowAll(true);
        mMChattingListView.setIsBottomShowAll(true);
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        java.util.Objects.toString(nVar);
        ld5.b bVar = (ld5.b) ((jz5.n) this.f307041b.f460713h.f460738b).getValue();
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String string = bVar.getString(bVar.f43702d + 1);
        java.util.List k17 = bVar.k();
        if (k17 == null) {
            k17 = kz5.p0.f313996d;
        }
        e0Var.getClass();
        pt0.f0 f0Var = (pt0.f0) i95.n0.c(pt0.f0.class);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ez.k1 k1Var = (ez.k1) f0Var;
        k1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long l17 = (java.lang.Long) kz5.n0.Z(k17);
        if (l17 != null) {
            long longValue = l17.longValue();
            l75.k0 k0Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f193989r;
            java.lang.String P8 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(longValue, string);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (java.lang.Object obj : k17) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                long longValue2 = ((java.lang.Number) obj).longValue();
                if (i17 > 0) {
                    sb6.append(",");
                }
                sb6.append(longValue2);
                i17 = i18;
            }
            android.database.Cursor f17 = k0Var.f("select * from " + P8 + " where msgId IN (" + ((java.lang.Object) sb6) + ") order by createTime ASC", null, 2);
            while (f17.moveToNext()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(f17);
                arrayList.add(f9Var);
            }
            f17.close();
        }
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) kz5.n0.Z(arrayList);
        if (f9Var2 != null) {
            long msgId = f9Var2.getMsgId();
            if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.FALSE)) {
                pt0.e0 e0Var2 = pt0.f0.f358209b1;
                if (e0Var2.d() && f9Var2.getMsgId() > 0 && !kotlin.jvm.internal.o.b(f9Var2.Q0(), string) && !kotlin.jvm.internal.o.b(string, "talker-ignore")) {
                    java.lang.String p17 = e0Var2.p(new java.lang.Throwable());
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgFeatureService", "found different msgId:" + msgId + ", createTime:" + f9Var2.getCreateTime() + " talker[" + f9Var2.Q0() + " -> " + string + "], stack: " + p17);
                    ((ku5.t0) ku5.t0.f312615d).h(new ez.j1(f9Var2, p17, k1Var, string), "msg_talker_error_report");
                }
            }
        }
        long c17 = c01.id.c();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) it.next();
            if (f9Var3.A0() == 0) {
                f9Var3.d1(f9Var3.U1());
            }
            f9Var3.j1(1);
            f9Var3.e1(c17);
            c17++;
        }
        return new ke5.q(bVar, arrayList);
    }
}
