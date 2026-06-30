package zs3;

@j95.b
/* loaded from: classes9.dex */
public final class z extends jm0.o implements mc0.k {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(bt3.y0.class);
    }

    public java.lang.String Zi(java.lang.String str, java.lang.String str2, r45.bq0 protoItem) {
        kotlin.jvm.internal.o.g(protoItem, "protoItem");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String g17 = bt3.g2.g(str, str2, protoItem);
        kotlin.jvm.internal.o.f(g17, "buildRecordAppMsgXML(...)");
        return g17;
    }

    public final void aj(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str, f9Var.getType(), null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgFeatureService", "recordCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f477691a), java.lang.Boolean.valueOf(bj6.f477692b), java.lang.Boolean.valueOf(bj6.f477694d), java.lang.Long.valueOf(bj6.f477695e));
    }

    public dn.m bj(java.lang.String taskName, java.lang.String fullPath, r45.gp0 favDataItem) {
        kotlin.jvm.internal.o.g(taskName, "taskName");
        kotlin.jvm.internal.o.g(fullPath, "fullPath");
        kotlin.jvm.internal.o.g(favDataItem, "favDataItem");
        dn.m mVar = new dn.m();
        mVar.f241785d = taskName;
        mVar.field_mediaId = favDataItem.T;
        mVar.f241786e = false;
        mVar.field_priority = 2;
        mVar.field_totalLen = favDataItem.f375418l1;
        mVar.field_filemd5 = favDataItem.Z;
        mVar.field_fullpath = fullPath;
        if (favDataItem.I != 5 || favDataItem.f375435s2 == 0) {
            java.lang.String str = favDataItem.f375420m;
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String str2 = favDataItem.f375412h;
                if (!(str2 == null || r26.n0.N(str2))) {
                    mVar.field_fileType = 1;
                    mVar.field_aesKey = favDataItem.f375420m;
                    mVar.field_fileId = favDataItem.f375412h;
                }
            }
            mVar.field_fileType = 19;
            mVar.field_authKey = favDataItem.f375409f2;
            mVar.field_aesKey = favDataItem.f375413h2;
            mVar.f241811z = favDataItem.f375405d2;
            mVar.field_fileId = "";
        } else {
            java.lang.String str3 = favDataItem.f375405d2;
            if (str3 == null || r26.n0.N(str3)) {
                mVar.field_fileType = 3;
                mVar.field_aesKey = favDataItem.f375420m;
                mVar.field_fileId = favDataItem.f375412h;
            } else {
                mVar.field_fileType = 19;
                mVar.field_authKey = favDataItem.f375409f2;
                mVar.field_aesKey = favDataItem.f375413h2;
                mVar.f241811z = favDataItem.f375405d2;
                mVar.field_fileId = "";
            }
        }
        return mVar;
    }

    public void cj(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        boolean z18;
        pt0.f0.f358209b1.getClass();
        if (!((java.lang.Boolean) ((jz5.n) pt0.e0.f358203k).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgFeatureService", "c2c path is close");
            return;
        }
        if (f9Var != null) {
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, f9Var.z0(), false);
            if (com.tencent.mm.vfs.w6.j(mj6)) {
                java.lang.String a17 = bm5.d0.a(f9Var, bm5.f0.f22564i, false, true, 2, null);
                if (!kotlin.jvm.internal.o.b(a17, mj6)) {
                    boolean x17 = com.tencent.mm.vfs.w6.x(mj6, a17, true);
                    aj(f9Var, a17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgFeatureService", "move old recordMsg thumb to c2c file success: " + x17 + ", src[" + mj6 + "] -> dst[" + a17 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.getMsgId() + ", svrId: " + f9Var.I0());
                }
            }
            java.lang.String b17 = bm5.z.b(bm5.y.f22756i.a(f9Var, bm5.f0.f22574v), false, true, 1, null);
            if (com.tencent.mm.vfs.w6.j(b17)) {
                java.lang.String Q0 = f9Var.Q0();
                kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
                byte[] bytes = Q0.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                java.lang.String g17 = kk.k.g(bytes);
                java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(b17, false);
                if (s17 != null) {
                    java.util.Iterator it = s17.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it.next();
                        java.lang.String name = x1Var.f213232b;
                        kotlin.jvm.internal.o.f(name, "name");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("temp_");
                        sb6.append(g17);
                        sb6.append('_');
                        java.lang.String str = g17;
                        java.util.Iterator it6 = it;
                        sb6.append(f9Var.getMsgId());
                        sb6.append('_');
                        if (r26.i0.y(name, sb6.toString(), false)) {
                            java.lang.String name2 = x1Var.f213232b;
                            kotlin.jvm.internal.o.f(name2, "name");
                            z18 = false;
                            java.lang.String w17 = r26.i0.w(r26.n0.W(name2, "temp_"), "_" + f9Var.getMsgId() + '_', "_" + f9Var.I0() + '_', false);
                            if (!kotlin.jvm.internal.o.b(w17, name2)) {
                                java.lang.String b18 = bm5.z.b(bm5.y.f22756i.a(f9Var, bm5.f0.f22574v), true, false, 2, null);
                                if (!kotlin.jvm.internal.o.b(b17, b18)) {
                                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(b17, name2);
                                    com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(b18, w17);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgFeatureService", "move c2c temp dir, src[" + r6Var.o() + "] -> dst[" + r6Var2 + "], talker: " + f9Var.Q0() + ", localId: " + f9Var.getMsgId() + ", svrId: " + f9Var.I0() + ", ret: " + com.tencent.mm.vfs.w6.x(r6Var.o(), r6Var2.o(), true));
                                    java.lang.String o17 = r6Var2.o();
                                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                                    aj(f9Var, o17);
                                }
                            }
                        } else {
                            z18 = false;
                        }
                        g17 = str;
                        it = it6;
                    }
                }
            }
        }
    }

    public java.lang.String fj(s15.h dataItem, java.lang.String str, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        int i18 = dataItem.f303422d;
        java.lang.String s17 = bt3.g2.s(dataItem.getString(i18 + 3), dataItem.getInteger(i18 + 2), dataItem.getString(i18 + 0), dataItem.n(), str, j17, j18, i17);
        kotlin.jvm.internal.o.f(s17, "getDataPath(...)");
        return s17;
    }

    public java.lang.Object hj(oc0.b bVar, kotlin.coroutines.Continuation continuation) {
        ys3.i iVar = (ys3.i) i95.n0.c(ys3.i.class);
        kotlin.jvm.internal.o.d(iVar);
        if (!jm0.g.class.isAssignableFrom(bt3.y0.class)) {
            throw new java.lang.IllegalArgumentException(ys3.i.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(iVar.getViewModel(), new jm0.e(iVar)).a(bt3.y0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return ((bt3.y0) ((jm0.g) a17)).a7(bVar, continuation);
    }
}
