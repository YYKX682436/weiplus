package dt1;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final bt1.g f243155m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.wr f243156n;

    public h(java.util.List selector, bt1.g source) {
        kotlin.jvm.internal.o.g(selector, "selector");
        kotlin.jvm.internal.o.g(source, "source");
        this.f243155m = source;
        r45.wr wrVar = new r45.wr();
        this.f243156n = wrVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : selector) {
            int intValue = ((java.lang.Number) obj).intValue();
            java.util.List list = bt1.a.f24143a;
            if (bt1.a.f24144b.contains(java.lang.Integer.valueOf(intValue))) {
                arrayList.add(obj);
            }
        }
        wrVar.f389394d = new java.util.LinkedList(arrayList);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_BYP_KEY_BUFF_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17);
        r45.wr wrVar2 = this.f243156n;
        r45.ur urVar = new r45.ur();
        urVar.parseFrom(h17);
        wrVar2.f389395e = urVar;
        r45.wr wrVar3 = this.f243156n;
        wrVar3.f389396f = this.f243155m.f24159d;
        lVar.f70664a = wrVar3;
        r45.xr xrVar = new r45.xr();
        xrVar.setBaseResponse(new r45.ie());
        xrVar.getBaseResponse().f376960e = new r45.du5();
        lVar.f70665b = xrVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/bypsync";
        lVar.f70667d = 3673;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", "[CgiBypSync] selector=" + this.f243156n.f389394d + " scene=" + this.f243155m.f24159d + " size=" + h17.length);
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        boolean z18;
        java.util.LinkedList<r45.vr> linkedList;
        java.lang.Object obj;
        r45.xr resp = (r45.xr) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" selector=");
        r45.wr wrVar = this.f243156n;
        sb6.append(wrVar.f389394d);
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", "[onFailed] " + wrVar.f389394d);
            return;
        }
        r45.ur urVar = resp.f390349e;
        r45.ur urVar2 = wrVar.f389395e;
        kotlin.jvm.internal.o.d(urVar2);
        boolean z19 = urVar != null ? urVar.f387584e : false;
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", "[onSuccessfully] isReset=" + z19 + ", item size=" + resp.f390350f.size());
        if (z19) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BYP_KEY_BUFF_STRING_SYNC, "");
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[mergeSyncKey] req: ");
        sb7.append(s(urVar2));
        sb7.append(" resp: ");
        sb7.append(urVar != null ? s(urVar) : null);
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", sb7.toString());
        if (urVar == null || (linkedList = urVar.f387583d) == null) {
            z17 = false;
            z18 = false;
        } else {
            boolean z27 = false;
            z18 = false;
            for (r45.vr vrVar : linkedList) {
                java.util.LinkedList sync_key_pair_list = urVar2.f387583d;
                kotlin.jvm.internal.o.f(sync_key_pair_list, "sync_key_pair_list");
                java.util.Iterator it = sync_key_pair_list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((r45.vr) obj).f388452d == vrVar.f388452d) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                r45.vr vrVar2 = (r45.vr) obj;
                if (vrVar2 != null) {
                    long j17 = vrVar2.f388453e;
                    long j18 = vrVar.f388453e;
                    if (j17 < j18) {
                        vrVar2.f388453e = j18;
                        com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", "[mergeSyncKey] modify " + vrVar.f388452d + '=' + vrVar.f388453e);
                        z27 = true;
                    } else {
                        com.tencent.mars.xlog.Log.e("Byp.CgiBypSync", "[mergeSyncKey] value(" + vrVar.f388453e + ") is invalid, client value=" + vrVar2.f388453e + ' ');
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("Byp.CgiBypSync", "[mergeSyncKey] insert " + vrVar.f388452d + '=' + vrVar.f388453e);
                    sync_key_pair_list.add(vrVar);
                    z18 = true;
                }
            }
            z17 = z27;
        }
        if (z17 || z18) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BYP_KEY_BUFF_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(urVar2.toByteArray()));
        }
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1465L, this.f243155m.f24159d, 1L);
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }

    public final java.lang.String s(r45.ur urVar) {
        kotlin.jvm.internal.o.g(urVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList<r45.vr> sync_key_pair_list = urVar.f387583d;
        kotlin.jvm.internal.o.f(sync_key_pair_list, "sync_key_pair_list");
        for (r45.vr vrVar : sync_key_pair_list) {
            sb6.append(vrVar.f388452d);
            sb6.append("=");
            sb6.append(vrVar.f388453e);
            sb6.append(", ");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
