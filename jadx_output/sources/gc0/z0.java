package gc0;

/* loaded from: classes5.dex */
public final class z0 {
    public z0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.util.Map map, int i17, r45.kl5 data) {
        kotlin.jvm.internal.o.g(map, "map");
        kotlin.jvm.internal.o.g(data, "data");
        int b17 = b(data);
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                map.put("has_candidate_photo", 1);
                map.put("candidate_photo_source", java.lang.Integer.valueOf(b17));
                return;
            }
            java.lang.String string = data.getString(1);
            if (string == null || r26.n0.N(string)) {
                return;
            }
            map.put("has_candidate_phone", 1);
            map.put("candidate_phone_source", java.lang.Integer.valueOf(b17));
            return;
        }
        java.lang.String string2 = data.getString(0);
        if (string2 == null || r26.n0.N(string2)) {
            return;
        }
        long j17 = data.getLong(3);
        if (j17 == 1) {
            map.put("has_candidate_cn", 1);
            map.put("candidate_cn_source", java.lang.Integer.valueOf(b17));
            return;
        }
        if (j17 == 2) {
            map.put("has_candidate_en", 1);
            map.put("candidate_en_source", java.lang.Integer.valueOf(b17));
        } else if (j17 == 3) {
            map.put("has_candidate_position", 1);
            map.put("candidate_position_source", java.lang.Integer.valueOf(b17));
        } else if (j17 == 4) {
            map.put("has_candidate_institution", 1);
            map.put("candidate_institution_source", java.lang.Integer.valueOf(b17));
        }
    }

    public final int b(r45.kl5 kl5Var) {
        int i17;
        kotlin.jvm.internal.o.g(kl5Var, "<this>");
        r45.ll5 ll5Var = (r45.ll5) kl5Var.getCustom(5);
        if (ll5Var == null) {
            return 0;
        }
        int i18 = 1;
        jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(ll5Var.getInteger(0)), java.lang.Integer.valueOf(ll5Var.getInteger(1)));
        if (!kotlin.jvm.internal.o.b(lVar, new jz5.l(1, 0))) {
            if (kotlin.jvm.internal.o.b(lVar, new jz5.l(1, 1))) {
                return 2;
            }
            if (kotlin.jvm.internal.o.b(lVar, new jz5.l(2, 0))) {
                return 3;
            }
            i18 = 4;
            if (!kotlin.jvm.internal.o.b(lVar, new jz5.l(2, 1))) {
                if (kotlin.jvm.internal.o.b(lVar, new jz5.l(0, 2))) {
                    i17 = 6;
                } else if (kotlin.jvm.internal.o.b(lVar, new jz5.l(0, 4))) {
                    i17 = 7;
                } else {
                    if (!kotlin.jvm.internal.o.b(lVar, new jz5.l(0, 3))) {
                        return 0;
                    }
                    i17 = 8;
                }
                return i17;
            }
        }
        return i18;
    }
}
