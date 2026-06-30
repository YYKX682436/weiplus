package urgen.ur_C563;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J'\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J:\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u001d\u001a\u00020\u0002H\u0007J\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\""}, d2 = {"Lurgen/ur_C563/URS_916D;", "", "", dm.i4.COL_USERNAME, "Lcom/tencent/unit_rc/BaseObjectDef;", "callback", "Ljz5/f0;", "UR_DE87", "", "hashUsernames", "UR_AB4D", "([Ljava/lang/String;Lcom/tencent/unit_rc/BaseObjectDef;)V", "UR_ADC3", "UR_17B3", "UR_64F8", "UR_2A1E", "", "isCancel", "", "tingItemData", "", "requestScene", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, "UR_940F", "feedId", "nonceId", "actToLike", "realName", "UR_5A45", "UR_AB70", "finderInfo", "UR_4B28", "<init>", "()V", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class URS_916D {
    public static final urgen.ur_C563.URS_916D INSTANCE = new urgen.ur_C563.URS_916D();

    private URS_916D() {
    }

    public static final void UR_17B3(com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        w71.e0 e0Var;
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar == null) {
            e0Var = null;
        } else {
            if (zVar instanceof w71.n0) {
            }
            e0Var = new w71.e0(zVar);
        }
        w71.e.f(e0Var);
    }

    public static final void UR_2A1E(java.lang.String username, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        w71.d0 d0Var;
        kotlin.jvm.internal.o.g(username, "username");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar == null) {
            d0Var = null;
        } else {
            if (zVar instanceof w71.n0) {
            }
            d0Var = new w71.d0(zVar);
        }
        w71.e.e(username, d0Var);
    }

    public static final void UR_4B28(byte[] finderInfo, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        kotlin.jvm.internal.o.g(finderInfo, "finderInfo");
        yz5.l a17 = w71.n0.f443419f.a((w71.z) baseObjectDef);
        com.tencent.mars.xlog.Log.i("MicroMsg.Ting" + ".".concat("TingFinderSourcePlugin"), "requestMediaInfo");
        bw5.e70 parseFrom = new bw5.e70().parseFrom(finderInfo);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String tid = parseFrom.getTid();
        kotlin.jvm.internal.o.d(tid);
        ((c61.l7) b6Var).ml(r26.q0.c(tid), parseFrom.b(), 0, true, false, "", new w71.d(parseFrom, a17));
    }

    public static final void UR_5A45(java.lang.String feedId, java.lang.String nonceId, boolean z17, boolean z18, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar != null && (zVar instanceof w71.n0)) {
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Aj(z17, nonceId, pm0.v.Z(feedId), z18);
    }

    public static final void UR_64F8(java.lang.String username, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        w71.b0 b0Var;
        kotlin.jvm.internal.o.g(username, "username");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar == null) {
            b0Var = null;
        } else {
            if (zVar instanceof w71.n0) {
            }
            b0Var = new w71.b0(zVar);
        }
        w71.e.b(username, b0Var);
    }

    public static final void UR_940F(java.lang.String username, boolean z17, byte[] tingItemData, long j17, java.lang.String extraInfo, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        w71.g0 g0Var;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar == null) {
            g0Var = null;
        } else {
            if (zVar instanceof w71.n0) {
            }
            g0Var = new w71.g0(zVar);
        }
        w71.e.a(username, z17, tingItemData, j17, extraInfo, g0Var);
    }

    public static final void UR_AB4D(java.lang.String[] hashUsernames, com.tencent.unit_rc.BaseObjectDef callback) {
        w71.k0 k0Var;
        kotlin.jvm.internal.o.g(hashUsernames, "hashUsernames");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) callback;
        if (zVar == null) {
            k0Var = null;
        } else {
            if (zVar instanceof w71.n0) {
            }
            k0Var = new w71.k0(zVar);
        }
        w71.e.d(hashUsernames, k0Var);
    }

    public static final java.lang.String UR_AB70() {
        java.lang.String r17 = c01.z1.r();
        return r17 == null ? "" : r17;
    }

    public static final void UR_ADC3(com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        yz5.l l0Var;
        yz5.l lVar;
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar == null) {
            lVar = null;
        } else {
            if (!(zVar instanceof w71.n0) || (l0Var = ((w71.n0) zVar).f443421e) == null) {
                l0Var = new w71.l0(zVar);
            }
            lVar = l0Var;
        }
        if (lVar != null) {
            java.lang.String r17 = c01.z1.r();
            if (r17 == null) {
                r17 = "";
            }
            lVar.invoke(r17);
        }
    }

    public static final void UR_DE87(java.lang.String username, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        w71.f0 f0Var;
        kotlin.jvm.internal.o.g(username, "username");
        w71.m0 m0Var = w71.n0.f443419f;
        w71.z zVar = (w71.z) baseObjectDef;
        if (zVar == null) {
            f0Var = null;
        } else {
            if (zVar instanceof w71.n0) {
            }
            f0Var = new w71.f0(zVar);
        }
        w71.e.c(username, f0Var);
    }
}
