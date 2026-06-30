package xe2;

/* loaded from: classes3.dex */
public final class o extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453890c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453890c = "LiveCommonSysMsgInterceptor";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.k0(msgList);
        if (ch1Var == null) {
            return;
        }
        int integer = ch1Var.getInteger(1);
        java.lang.Object obj = null;
        r5 = null;
        java.lang.String str = null;
        if (integer == 20072) {
            if (kotlin.jvm.internal.o.b(this.f453891d, ch1Var.getString(2))) {
                return;
            }
            this.f453891d = ch1Var.getString(2);
            r45.zh1 zh1Var = new r45.zh1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            if (byteString != null) {
                zh1Var.parseFrom(byteString.g());
            }
            com.tencent.mars.xlog.Log.i(this.f453890c, "from msg commonSysMsg content: " + zh1Var.getString(0));
            java.lang.String string = zh1Var.getString(0);
            if (string != null && string.length() != 0) {
                r0 = 0;
            }
            if (r0 == 0) {
                dk2.xa xaVar = dk2.xa.f234344a;
                gk2.e eVar = this.f445267a;
                java.lang.String string2 = zh1Var.getString(0);
                if (eVar != null) {
                    java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f329528f;
                    kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
                    synchronized (list) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (r26.i0.q(((dk2.zf) next).j(), string2, false, 2, null)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    if (((dk2.zf) obj) == null || c01.id.c() - dk2.q5.f233942d >= 30000) {
                        r45.t12 t12Var = new r45.t12();
                        t12Var.set(3, 10001);
                        t12Var.set(2, string2);
                        ((mm2.x4) eVar.a(mm2.x4.class)).f329528f.add(new dk2.mf(t12Var));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (integer != 20108) {
            return;
        }
        r45.nj1 nj1Var = new r45.nj1();
        com.tencent.mm.protobuf.g byteString2 = ch1Var.getByteString(4);
        if (byteString2 != null) {
            nj1Var.parseFrom(byteString2.g());
        }
        long j17 = ch1Var.getLong(12);
        com.tencent.mars.xlog.Log.i(this.f453890c, "from msg commonSysMsg notification content: " + nj1Var.getString(1) + ", color:" + nj1Var.getString(2) + ", seq:" + j17 + ", badge=" + nj1Var.getString(5) + ", source:" + nj1Var.getInteger(3));
        java.lang.String string3 = nj1Var.getString(1);
        if ((string3 == null || string3.length() == 0) == true) {
            return;
        }
        dk2.mf a17 = dk2.mf.f233772j.a(nj1Var, java.lang.Long.valueOf(j17));
        if (a17.b()) {
            ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) this.f445267a.a(mm2.c1.class)).f328852o);
            a17.q(b17 != null ? ya2.d.i(b17) : null, 3);
        }
        if (nj1Var.getInteger(4) == 1) {
            com.tencent.mars.xlog.Log.i(this.f453890c, "from msg commonSysMsg notification content, FloatTop");
            ((kotlinx.coroutines.flow.h3) ((mm2.c1) this.f445267a.a(mm2.c1.class)).Z1).k(a17);
        }
        ((mm2.x4) this.f445267a.a(mm2.x4.class)).f329528f.add(a17);
        r45.oj1 oj1Var = (r45.oj1) nj1Var.getCustom(6);
        if (((oj1Var == null || (finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) oj1Var.getCustom(2)) == null) ? null : finderJumpInfo2.getReport_info()) != null) {
            r45.oj1 oj1Var2 = (r45.oj1) nj1Var.getCustom(6);
            if (oj1Var2 != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) oj1Var2.getCustom(2)) != null) {
                str = finderJumpInfo.getReport_info();
            }
            boolean z17 = new cl0.g(str).optInt("platform_reminder_notification_biz_type", 0) == 2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("card_type", z17 ? 2 : 1);
            java.lang.String str2 = this.f453890c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report anchor platform notice comment type = 1, cardType = ");
            sb6.append(z17 ? 2 : 1);
            sb6.append(", report str = ");
            sb6.append(jSONObject);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328361l2, jSONObject.toString(), null, 4, null);
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20072, 20108};
    }
}
