package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class u7 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f116713d = jz5.h.b(com.tencent.mm.plugin.finder.live.view.p7.f116584d);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.o7 f116714a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f116715b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f116716c;

    public u7(android.app.Activity activity, byte[] bArr) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116715b = new java.util.HashMap();
        this.f116716c = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.t7(this));
        r45.b22 b22Var = new r45.b22();
        if (bArr != null) {
            try {
                b22Var.parseFrom(bArr);
                a(b22Var);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderLiveMultiTaskManager", "initMultiTaskData", th6);
            }
        }
        java.lang.String string = b22Var.getString(0);
        com.tencent.mm.plugin.finder.live.view.o7 o7Var = new com.tencent.mm.plugin.finder.live.view.o7(new ak3.i(activity));
        this.f116714a = o7Var;
        if (string == null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            string = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
        }
        o7Var.y(21, string);
    }

    public final void a(r45.b22 b22Var) {
        java.lang.String description;
        boolean isEmpty = b22Var.getList(9).isEmpty();
        java.util.HashMap hashMap = this.f116715b;
        if (isEmpty) {
            if (b22Var.getLong(1) != 0) {
                hashMap.put(java.lang.Long.valueOf(b22Var.getLong(1)), b22Var);
                return;
            }
            return;
        }
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = b22Var.getList(9);
        kotlin.jvm.internal.o.f(list, "getAllHistoryFinderObjectList(...)");
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            if (liveInfo != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(liveInfo.getLong(0));
                r45.b22 b22Var2 = new r45.b22();
                b22Var2.set(0, pm0.v.u(liveInfo.getLong(0)));
                b22Var2.set(1, java.lang.Long.valueOf(liveInfo.getLong(0)));
                b22Var2.set(2, finderObject.getObjectNonceId());
                b22Var2.set(3, java.lang.Long.valueOf(finderObject.getId()));
                java.lang.String username = finderObject.getUsername();
                java.lang.String str = "";
                if (username == null) {
                    username = "";
                }
                b22Var2.set(4, username);
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (objectDesc != null && (description = objectDesc.getDescription()) != null) {
                    str = description;
                }
                b22Var2.set(5, str);
                b22Var2.set(6, finderObject.getSessionBuffer());
                b22Var2.set(7, finderObject);
                hashMap.put(valueOf, b22Var2);
            }
        }
    }

    public final void b() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        java.lang.String str;
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null) {
            mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
            r45.b22 b22Var = (r45.b22) this.f116715b.get(java.lang.Long.valueOf(((mm2.e1) c1Var.business(mm2.e1.class)).f328988r.getLong(0)));
            if (b22Var == null || (multiTaskInfo = this.f116714a.f300077a) == null) {
                return;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = c1Var.f328846n;
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject != null ? finderObject.getContact() : null;
            java.lang.String u17 = pm0.v.u(((mm2.e1) c1Var.business(mm2.e1.class)).f328988r.getLong(0));
            multiTaskInfo.field_id = u17;
            b22Var.set(0, u17);
            r45.lr4 v07 = multiTaskInfo.v0();
            if (contact == null || (str = contact.getHeadUrl()) == null) {
                str = "";
            }
            v07.set(5, str);
            multiTaskInfo.field_data = b22Var.toByteArray();
            if (contact != null) {
                multiTaskInfo.v0().set(0, contact.getNickname());
                com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = contact.getAuthInfo();
                if (authInfo != null) {
                    com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = authInfo.getAuthIconType() > 0 ? authInfo : null;
                    if (finderAuthInfo != null) {
                        multiTaskInfo.v0().set(6, java.lang.Integer.valueOf(finderAuthInfo.getAuthIconType()));
                        multiTaskInfo.v0().set(2, finderAuthInfo.getAuthIconUrl());
                    }
                }
            }
        }
    }

    public u7(android.app.Activity activity, com.tencent.mm.plugin.finder.live.view.u7 manager) {
        r45.b22 b22Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(manager, "manager");
        this.f116715b = new java.util.HashMap();
        this.f116716c = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.t7(this));
        java.util.HashMap hashMap = manager.f116715b;
        this.f116715b = hashMap;
        com.tencent.mm.plugin.finder.live.view.o7 o7Var = new com.tencent.mm.plugin.finder.live.view.o7(new ak3.i(activity));
        this.f116714a = o7Var;
        gk2.e eVar = gk2.e.f272471n;
        java.lang.String string = (eVar == null || (b22Var = (r45.b22) hashMap.get(java.lang.Long.valueOf(((mm2.e1) ((mm2.c1) eVar.a(mm2.c1.class)).business(mm2.e1.class)).f328988r.getLong(0)))) == null) ? null : b22Var.getString(0);
        if (string == null) {
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            string = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
        }
        o7Var.y(21, string);
    }
}
