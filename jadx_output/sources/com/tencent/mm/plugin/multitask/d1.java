package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class d1 implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.i1 f150426a;

    public d1(com.tencent.mm.plugin.multitask.i1 i1Var) {
        this.f150426a = i1Var;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        if (list != null) {
            com.tencent.mm.plugin.multitask.i1 i1Var = this.f150426a;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next();
                    org.json.JSONObject u07 = com.tencent.mm.plugin.multitask.model.MultiTaskInfo.u0(multiTaskInfo.field_id, multiTaskInfo.field_type);
                    if (u07 != null) {
                        int i18 = i17 + 1;
                        jSONArray.put(i17, u07);
                        java.lang.String field_id = multiTaskInfo.field_id;
                        kotlin.jvm.internal.o.f(field_id, "field_id");
                        if (!i1Var.Bi(field_id, multiTaskInfo.field_type)) {
                            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = i1Var.f150448g;
                            java.lang.String field_id2 = multiTaskInfo.field_id;
                            kotlin.jvm.internal.o.f(field_id2, "field_id");
                            copyOnWriteArrayList.add(new ik3.r(field_id2, multiTaskInfo.field_type));
                        }
                        i17 = i18;
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(i1Var.f150445d, e17, "restoreDataFromStorageToMMKV fail, exception:%s", e17);
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            com.tencent.mm.sdk.platformtools.o4.M(i1Var.f150452n).D(i1Var.f150449h, jSONArray2);
            i1Var.f150447f = true;
            java.lang.String str = i1Var.f150445d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restore data done! multiTaskInfoList: ");
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = i1Var.f150448g;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList2, 10));
            java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
            while (it6.hasNext()) {
                ik3.r rVar = (ik3.r) it6.next();
                arrayList.add(rVar.f291912b + '_' + rVar.f291911a);
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
            if (iVar != null) {
                iVar.wd(list);
            }
            java.lang.String b17 = com.tencent.mm.plugin.multitask.u0.f150506a.b("Home");
            if (com.tencent.mm.vfs.w6.j(b17)) {
                com.tencent.mm.vfs.w6.h(b17);
            }
        }
    }
}
