package hb2;

/* loaded from: classes2.dex */
public final class b0 extends hb2.w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final hb2.b0 f280025e = new hb2.b0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f280026f = "Finder.FinderModifyFeedSettingService";

    @Override // hb2.w0
    public com.tencent.mm.protobuf.g c(java.lang.Object obj) {
        r45.wh2 modUserInfo = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(modUserInfo, "modUserInfo");
        return com.tencent.mm.protobuf.g.b(modUserInfo.toByteArray());
    }

    @Override // hb2.w0
    public int i() {
        return 4;
    }

    @Override // hb2.w0
    public java.lang.String k() {
        return f280026f;
    }

    @Override // hb2.w0
    public void l(java.lang.String username, java.lang.Object obj, r45.ix0 cmdRef) {
        r45.dm2 object_extend;
        r45.dn2 dn2Var;
        r45.wh2 cmdBufItem = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdBufItem, "cmdBufItem");
        kotlin.jvm.internal.o.g(cmdRef, "cmdRef");
        if (cmdBufItem.getInteger(1) == 6 && cmdBufItem.getLong(0) == 0) {
            r45.xh2 xh2Var = new r45.xh2();
            com.tencent.mm.protobuf.g byteString = cmdRef.getByteString(3);
            if (byteString != null) {
                xh2Var.parseFrom(byteString.g());
            }
            cmdBufItem.set(0, java.lang.Long.valueOf(xh2Var.getLong(0)));
        }
        bu2.j jVar = bu2.j.f24534a;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = jVar.h(cmdBufItem.getLong(0));
        if (h17 != null) {
            if (cmdRef.getInteger(1) == 0) {
                int integer = cmdBufItem.getInteger(1);
                if (integer == 1) {
                    h17.setComment_close(cmdBufItem.getInteger(2));
                    if (cmdBufItem.getInteger(2) == 2) {
                        h17.addFuncFlag(2);
                    } else {
                        h17.clearFuncFlag(2);
                    }
                    bu2.n.f24550a.d(cmdBufItem.getLong(0));
                } else if (integer == 2) {
                    h17.setPrivate_flag(cmdBufItem.getInteger(2));
                } else if (integer == 4) {
                    pm0.v.X(new hb2.a0(cmdBufItem, h17));
                } else if (integer == 6 && (object_extend = h17.getFeedObject().getObject_extend()) != null && (dn2Var = (r45.dn2) object_extend.getCustom(29)) != null) {
                    dn2Var.set(0, 2);
                    if (dn2Var.getInteger(1) == 1) {
                        dn2Var.set(1, 2);
                    }
                }
            }
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = new com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent();
            long id6 = h17.getId();
            am.cb cbVar = finderExposeInfoChangeEvent.f54272g;
            cbVar.f6343a = id6;
            finderExposeInfoChangeEvent.e();
            f280025e.getClass();
            com.tencent.mars.xlog.Log.i(f280026f, "FinderExposeInfoChangeEvent scene:" + cmdBufItem.getInteger(1) + " opType:" + cmdBufItem.getInteger(2) + ' ' + cbVar.f6343a + ' ' + h17.getComment_close());
            jVar.n(h17, bu2.i.f24526g);
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            feedUpdateEvent.f54252g.f6918a = h17.field_id;
            feedUpdateEvent.e();
        }
    }

    public void n(long j17, java.lang.String objectNonceId, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 4);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void o(long j17, com.tencent.mm.protocal.protobuf.FinderObject feedObj, java.lang.String objectNonceId, r45.uh2 opType, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(opType, "opType");
        boolean z17 = opType == r45.uh2.OpenComment;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        int i17 = z17 ? 2 : 1;
        o3Var.getClass();
        java.lang.String str = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + i17 + ',' + o3Var.Ui(feedObj.getId()) + ',' + feedObj.getUsername() + ',' + feedObj.getLikeCount() + ',' + feedObj.getCommentCount() + ',' + feedObj.getFriendLikeCount();
        com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18952 " + str);
        jx3.f.INSTANCE.kvStat(18952, str);
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 1);
        wh2Var.set(2, java.lang.Integer.valueOf(opType.f387382d));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void q(long j17, com.tencent.mm.protocal.protobuf.FinderObject feedObj, java.lang.String objectNonceId, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 7);
        wh2Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }

    public void r(long j17, java.lang.String objectNonceId, boolean z17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        r45.wh2 wh2Var = new r45.wh2();
        wh2Var.set(0, java.lang.Long.valueOf(j17));
        wh2Var.set(1, 8);
        wh2Var.set(2, java.lang.Integer.valueOf(!z17 ? 1 : 0));
        wh2Var.set(3, objectNonceId);
        hb2.w0.m(this, wh2Var, gcVar, false, false, null, null, 60, null);
    }
}
