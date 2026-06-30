package o72;

/* loaded from: classes9.dex */
public abstract class s3 {
    public static final r45.kv2 a(x05.j finderFeed) {
        x05.f j17;
        kotlin.jvm.internal.o.g(finderFeed, "finderFeed");
        r45.kv2 kv2Var = new r45.kv2();
        kv2Var.set(0, finderFeed.E());
        kv2Var.set(1, finderFeed.getUsername());
        kv2Var.set(2, finderFeed.getNickname());
        kv2Var.set(3, finderFeed.j());
        kv2Var.set(4, finderFeed.s());
        kv2Var.set(5, java.lang.Integer.valueOf(finderFeed.u()));
        kv2Var.set(6, java.lang.Integer.valueOf(finderFeed.A()));
        java.util.LinkedList<x05.a> mediaList = finderFeed.getMediaList();
        if (mediaList != null) {
            for (x05.a aVar : mediaList) {
                java.util.LinkedList list = kv2Var.getList(7);
                kotlin.jvm.internal.o.g(aVar, "<this>");
                r45.iv2 iv2Var = new r45.iv2();
                iv2Var.set(0, java.lang.Integer.valueOf(aVar.getMediaType()));
                iv2Var.set(1, aVar.getString(aVar.f368365d + 9));
                iv2Var.set(2, aVar.getThumbUrl());
                iv2Var.set(3, java.lang.Float.valueOf(aVar.getWidth()));
                iv2Var.set(4, java.lang.Float.valueOf(aVar.getHeight()));
                iv2Var.set(5, java.lang.Integer.valueOf(aVar.l()));
                iv2Var.set(6, aVar.k());
                iv2Var.set(7, aVar.j());
                iv2Var.set(8, aVar.getCoverUrl());
                list.add(iv2Var);
            }
        }
        kv2Var.set(8, finderFeed.getObjectNonceId());
        kv2Var.set(9, java.lang.Long.valueOf(finderFeed.z()));
        x05.p B = finderFeed.B();
        kv2Var.set(10, B != null ? B.k() : null);
        x05.p B2 = finderFeed.B();
        kv2Var.set(11, B2 != null ? B2.getObjectNonceId() : null);
        kv2Var.set(12, finderFeed.getBizUsername());
        kv2Var.set(13, java.lang.Integer.valueOf(finderFeed.getAuthIconType()));
        kv2Var.set(14, finderFeed.getAuthIconUrl());
        kv2Var.set(15, finderFeed.getBizNickname());
        kv2Var.set(16, finderFeed.n());
        kv2Var.set(17, finderFeed.o());
        kv2Var.set(18, java.lang.Integer.valueOf(finderFeed.k()));
        kv2Var.set(19, finderFeed.l());
        kv2Var.set(20, java.lang.Integer.valueOf(finderFeed.r()));
        kv2Var.set(21, finderFeed.q());
        kv2Var.set(22, finderFeed.w());
        kv2Var.set(23, finderFeed.p());
        kv2Var.set(24, finderFeed.t());
        kv2Var.set(27, finderFeed.y());
        x05.q C = finderFeed.C();
        if (C != null && (j17 = C.j()) != null) {
            r45.mv4 mv4Var = new r45.mv4();
            mv4Var.set(0, java.lang.Integer.valueOf(j17.getCreateTime()));
            mv4Var.set(4, java.lang.Integer.valueOf(j17.k()));
            mv4Var.set(5, java.lang.Integer.valueOf(j17.j()));
            mv4Var.set(6, java.lang.Integer.valueOf(j17.n()));
            x05.g l17 = j17.l();
            if (l17 != null) {
                mv4Var.set(2, new r45.ik2());
                r45.ik2 ik2Var = (r45.ik2) mv4Var.getCustom(2);
                if (ik2Var != null) {
                    ik2Var.set(3, java.lang.Integer.valueOf(l17.j()));
                }
                r45.ik2 ik2Var2 = (r45.ik2) mv4Var.getCustom(2);
                if (ik2Var2 != null) {
                    ik2Var2.set(2, java.lang.Double.valueOf(l17.k()));
                }
                r45.ik2 ik2Var3 = (r45.ik2) mv4Var.getCustom(2);
                if (ik2Var3 != null) {
                    ik2Var3.set(6, java.lang.Double.valueOf(l17.l()));
                }
                r45.ik2 ik2Var4 = (r45.ik2) mv4Var.getCustom(2);
                if (ik2Var4 != null) {
                    ik2Var4.set(0, l17.n());
                }
                r45.ik2 ik2Var5 = (r45.ik2) mv4Var.getCustom(2);
                if (ik2Var5 != null) {
                    ik2Var5.set(1, l17.o());
                }
            }
            mv4Var.set(1, new r45.jk2());
            kv2Var.set(28, mv4Var);
        }
        kv2Var.set(29, java.lang.Integer.valueOf(finderFeed.F()));
        return kv2Var;
    }

    public static final x05.j b(r45.kv2 finderShareObj) {
        x05.g gVar;
        kotlin.jvm.internal.o.g(finderShareObj, "finderShareObj");
        x05.j jVar = new x05.j();
        jVar.f0(finderShareObj.getString(0));
        int i17 = 1;
        jVar.i0(finderShareObj.getString(1));
        jVar.e0(finderShareObj.getString(2));
        jVar.I(finderShareObj.getString(3));
        jVar.T(finderShareObj.getString(4));
        jVar.V(finderShareObj.getInteger(5));
        jVar.b0(finderShareObj.getInteger(6));
        java.util.LinkedList<r45.iv2> list = finderShareObj.getList(7);
        if (list != null) {
            for (r45.iv2 iv2Var : list) {
                java.util.LinkedList mediaList = jVar.getMediaList();
                if (mediaList != null) {
                    kotlin.jvm.internal.o.d(iv2Var);
                    x05.a aVar = new x05.a();
                    aVar.r(iv2Var.getInteger(0));
                    java.lang.String string = iv2Var.getString(i17);
                    if (string == null) {
                        string = "";
                    }
                    aVar.set(aVar.f368365d + 9, string);
                    java.lang.String string2 = iv2Var.getString(2);
                    if (string2 == null) {
                        string2 = "";
                    }
                    aVar.s(string2);
                    aVar.u(iv2Var.getFloat(3));
                    aVar.q(iv2Var.getFloat(4));
                    aVar.t(iv2Var.getInteger(5));
                    java.lang.String string3 = iv2Var.getString(6);
                    if (string3 == null) {
                        string3 = "";
                    }
                    aVar.p(string3);
                    java.lang.String string4 = iv2Var.getString(7);
                    if (string4 == null) {
                        string4 = "";
                    }
                    aVar.o(string4);
                    java.lang.String string5 = iv2Var.getString(8);
                    if (string5 == null) {
                        string5 = "";
                    }
                    aVar.n(string5);
                    mediaList.add(aVar);
                }
                i17 = 1;
            }
        }
        jVar.g0(finderShareObj.getString(8));
        jVar.a0(finderShareObj.getLong(9));
        x05.p pVar = new x05.p();
        pVar.l(finderShareObj.getString(10));
        pVar.n(finderShareObj.getString(11));
        jVar.c0(pVar);
        jVar.O(finderShareObj.getString(12));
        jVar.G(finderShareObj.getInteger(13));
        jVar.H(finderShareObj.getString(14));
        jVar.N(finderShareObj.getString(15));
        jVar.L(finderShareObj.getString(16));
        jVar.P(finderShareObj.getString(17));
        jVar.J(finderShareObj.getInteger(18));
        jVar.K(finderShareObj.getString(19));
        jVar.S(finderShareObj.getInteger(20));
        jVar.R(finderShareObj.getString(21));
        jVar.W(finderShareObj.getString(22));
        jVar.Q(finderShareObj.getString(23));
        jVar.U(finderShareObj.getString(24));
        jVar.Z(finderShareObj.getString(27));
        x05.q qVar = new x05.q();
        x05.f fVar = new x05.f();
        r45.mv4 mv4Var = (r45.mv4) finderShareObj.getCustom(28);
        if (mv4Var != null) {
            fVar.q(mv4Var.getInteger(0));
            fVar.p(mv4Var.getInteger(4));
            fVar.o(mv4Var.getInteger(5));
            fVar.s(mv4Var.getInteger(6));
            r45.ik2 ik2Var = (r45.ik2) mv4Var.getCustom(2);
            if (ik2Var != null) {
                gVar = new x05.g();
                gVar.p(ik2Var.getInteger(3));
                gVar.q((float) ik2Var.getDouble(2));
                gVar.r((float) ik2Var.getDouble(6));
                gVar.s(ik2Var.getString(0));
                gVar.t(ik2Var.getString(1));
            } else {
                gVar = null;
            }
            fVar.r(gVar);
        }
        qVar.k(fVar);
        jVar.d0(qVar);
        jVar.h0(finderShareObj.getInteger(29));
        r45.gv2 gv2Var = (r45.gv2) finderShareObj.getCustom(30);
        if (gv2Var != null) {
            jVar.Y(com.tencent.mm.sdk.platformtools.aa.a(gv2Var.toJSON().toString()));
        }
        return jVar;
    }
}
