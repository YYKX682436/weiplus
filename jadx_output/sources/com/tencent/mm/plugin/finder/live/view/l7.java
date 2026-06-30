package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class l7 implements hh4.j {
    @Override // hh4.j
    public void k0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        gm0.j1.a();
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        java.lang.String string;
        java.lang.String nickname;
        r45.dm2 object_extend;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        if (gm0.j1.a()) {
            r45.b22 b22Var = new r45.b22();
            try {
                b22Var.parseFrom(multiTaskInfo.field_data);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderLiveMultiTaskHelper", "MegaVideoFloatBallInfo parse fail", th6);
            }
            b22Var.set(0, multiTaskInfo.field_id);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlin.jvm.internal.o.f(b22Var.getList(9), "getAllHistoryFinderObjectList(...)");
            if (!r4.isEmpty()) {
                arrayList.addAll(b22Var.getList(9));
            } else {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
                if (finderObject == null) {
                    finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                    com.tencent.mars.xlog.Log.e("FinderLiveMultiTaskHelper", "data.finderObject null");
                    finderObject.setObjectNonceId(b22Var.getString(2));
                    finderObject.setId(b22Var.getLong(3));
                }
                arrayList.add(finderObject);
            }
            int b17 = b22Var.getList(9).size() > 0 ? h3.a.b(b22Var.getInteger(8), 0, b22Var.getList(9).size() - 1) : 0;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
            int integer = (finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null) ? 0 : liveInfo.getInteger(1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
            long id6 = finderObject3 != null ? finderObject3.getId() : b22Var.getLong(3);
            long j17 = b22Var.getLong(1);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
            java.lang.String string2 = (finderObject4 == null || (object_extend = finderObject4.getObject_extend()) == null) ? null : object_extend.getString(62);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
            if (finderObject5 == null || (string = finderObject5.getUsername()) == null) {
                string = b22Var.getString(4);
            }
            ml2.x1 x1Var = ml2.x1.f328207n;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Ng(zbVar, id6, j17, string2, string, b22Var.getInteger(8), integer, x1Var, "temp_15", null, 0, (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7), 768, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_MULTI_TASK_INFO", b22Var.toByteArray());
            r45.wk0 wk0Var = new r45.wk0();
            java.lang.String str = "";
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, 1010);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject6 = (com.tencent.mm.protocal.protobuf.FinderObject) b22Var.getCustom(7);
            if (finderObject6 != null && (nickname = finderObject6.getNickname()) != null) {
                str = nickname;
            }
            y74Var.set(2, str);
            wk0Var.set(6, y74Var);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((vd2.f1) e0Var).Ni(context2, intent, arrayList, b17, wk0Var, null);
        }
    }

    @Override // hh4.j
    public void p0(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        gm0.j1.a();
    }
}
