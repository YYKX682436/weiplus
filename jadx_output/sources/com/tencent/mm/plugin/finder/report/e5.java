package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class e5 {
    public e5(kotlin.jvm.internal.i iVar) {
    }

    public final r45.vd6 a(com.tencent.mm.plugin.finder.report.f5 record, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(record, "record");
        r45.vd6 vd6Var = new r45.vd6();
        java.util.BitSet bitSet = new java.util.BitSet(64);
        vd6Var.set(0, java.lang.Long.valueOf(record.f125023a));
        vd6Var.set(28, null);
        java.lang.String str3 = "";
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = record.f125025c;
        if (finderItem == null || (str = finderItem.getObjectNonceId()) == null) {
            str = "";
        }
        vd6Var.set(4, str);
        vd6Var.set(1, new r45.oi());
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(3, new r45.q25());
        if (finderItem != null && (str2 = finderItem.field_username) != null) {
            str3 = str2;
        }
        vd6Var.set(5, str3);
        float f17 = ((float) (record.f125031i - record.f125024b)) / 1000.0f;
        if (f17 < 0.5f) {
            bitSet.set(21, true);
        } else if (f17 < 1.0f) {
            bitSet.set(22, true);
        } else if (f17 < 2.0f) {
            bitSet.set(23, true);
        } else if (f17 < 3.0f) {
            bitSet.set(24, true);
        } else if (f17 < 5.0f) {
            bitSet.set(25, true);
        } else if (f17 < 10.0f) {
            bitSet.set(26, true);
        } else if (f17 < 20.0f) {
            bitSet.set(27, true);
        } else if (f17 < 30.0f) {
            bitSet.set(28, true);
        } else if (f17 < 40.0f) {
            bitSet.set(29, true);
        } else if (f17 < 50.0f) {
            bitSet.set(30, true);
        } else {
            bitSet.set(31, true);
        }
        long j17 = bitSet.toLongArray()[0];
        r45.oi oiVar = (r45.oi) vd6Var.getCustom(1);
        if (oiVar != null) {
            oiVar.set(0, java.lang.Long.valueOf(j17));
        }
        r45.yw6 yw6Var = (r45.yw6) vd6Var.getCustom(2);
        if (yw6Var != null) {
            yw6Var.set(1, java.lang.Integer.valueOf((int) f17));
        }
        r45.q25 q25Var = (r45.q25) vd6Var.getCustom(3);
        if (q25Var != null) {
            q25Var.set(2, java.lang.Integer.valueOf((int) f17));
        }
        r45.q25 q25Var2 = (r45.q25) vd6Var.getCustom(3);
        if (q25Var2 != null) {
            q25Var2.set(13, java.lang.Integer.valueOf(record.f125028f));
        }
        r45.q25 q25Var3 = (r45.q25) vd6Var.getCustom(3);
        if (q25Var3 != null) {
            q25Var3.set(12, java.lang.Integer.valueOf(!z17 ? 1 : 0));
        }
        if (finderItem != null) {
            r45.q25 q25Var4 = (r45.q25) vd6Var.getCustom(3);
            if (q25Var4 != null) {
                q25Var4.set(9, java.lang.Integer.valueOf(finderItem.getLikeFlag() != 0 ? 1 : 0));
            }
            r45.q25 q25Var5 = (r45.q25) vd6Var.getCustom(3);
            if (q25Var5 != null) {
                ya2.g gVar = ya2.h.f460484a;
                java.lang.String userName = finderItem.getUserName();
                r45.xk bizInfo = finderItem.getBizInfo();
                q25Var5.set(8, java.lang.Integer.valueOf(ya2.g.h(gVar, userName, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null) ? 1 : 0));
            }
            r45.q25 q25Var6 = (r45.q25) vd6Var.getCustom(3);
            if (q25Var6 != null) {
                q25Var6.set(11, java.lang.Integer.valueOf(finderItem.getFavFlag() == 1 ? 1 : 0));
            }
        }
        return vd6Var;
    }
}
