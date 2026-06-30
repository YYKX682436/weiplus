package in0;

/* loaded from: classes3.dex */
public final class p implements com.tencent.mm.xeffect.IWeJsonMessageCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in0.q f292768a;

    public p(in0.q qVar) {
        this.f292768a = qVar;
    }

    @Override // com.tencent.mm.xeffect.IWeJsonMessageCallback
    public int a(int i17, java.lang.String message, tq5.g type) {
        java.lang.Object obj;
        boolean z17;
        java.lang.Object obj2;
        float f17;
        float f18;
        float f19;
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "weVisionJsonCallback-cb type=" + type + " sourceId=" + i17 + " message=" + message);
        if (type != tq5.g.JSON_LUA_GENERIC) {
            return 0;
        }
        in0.q qVar = this.f292768a;
        java.util.Iterator it = ((p05.j0) qVar.V1).f350557e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.o) obj).f302841d).longValue() == ((long) i17)) {
                break;
            }
        }
        if (obj != null) {
            try {
                cl0.g gVar = new cl0.g(message);
                cl0.e jSONArray = gVar.getJSONArray("actived");
                if (jSONArray.length() > 0) {
                    java.lang.Object obj3 = jSONArray.get(0);
                    kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    z17 = ((java.lang.Boolean) obj3).booleanValue();
                } else {
                    z17 = false;
                }
                if (z17) {
                    p05.p0 p0Var = qVar.V1;
                    int optInt = gVar.optInt(dm.i4.COL_ID);
                    java.util.Iterator it6 = ((p05.j0) p0Var).f350557e.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (((java.lang.Number) ((jz5.o) obj2).f302841d).longValue() == ((long) optInt)) {
                            break;
                        }
                    }
                    jz5.o oVar = (jz5.o) obj2;
                    java.lang.String valueOf = java.lang.String.valueOf(oVar != null ? ((java.lang.Number) oVar.f302842e).intValue() : 0);
                    cl0.e jSONArray2 = gVar.getJSONArray("transX");
                    float f27 = 0.0f;
                    if (jSONArray2.length() > 0) {
                        java.lang.Object obj4 = jSONArray2.get(0);
                        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Double");
                        f17 = (float) ((java.lang.Double) obj4).doubleValue();
                    } else {
                        f17 = 0.0f;
                    }
                    cl0.e jSONArray3 = gVar.getJSONArray("transY");
                    if (jSONArray3.length() > 0) {
                        java.lang.Object obj5 = jSONArray3.get(0);
                        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Double");
                        f18 = (float) ((java.lang.Double) obj5).doubleValue();
                    } else {
                        f18 = 0.0f;
                    }
                    cl0.e jSONArray4 = gVar.getJSONArray("rotation");
                    if (jSONArray4.length() > 0) {
                        java.lang.Object obj6 = jSONArray4.get(0);
                        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Double");
                        f19 = (float) ((java.lang.Double) obj6).doubleValue();
                    } else {
                        f19 = 0.0f;
                    }
                    cl0.e jSONArray5 = gVar.getJSONArray("scale");
                    if (jSONArray5.length() > 0) {
                        java.lang.Object obj7 = jSONArray5.get(0);
                        kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.Double");
                        f27 = (float) ((java.lang.Double) obj7).doubleValue();
                    }
                    yz5.s sVar = qVar.Y1;
                    if (sVar != null) {
                        java.lang.Object v17 = sVar.v(valueOf, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27));
                        in0.a aVar = (in0.a) (((in0.a) v17).f292731a ? v17 : null);
                        if (aVar != null) {
                            com.tencent.trtc.TRTCCloud T = qVar.T();
                            byte[] bytes = in0.q.S0(qVar, aVar.f292732b, aVar.f292733c, aVar.f292734d, aVar.f292735e, aVar.f292736f, aVar.f292737g, aVar.f292738h, aVar.f292739i, aVar.f292740j, aVar.f292741k).getBytes(r26.c.f368865a);
                            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                            T.sendSEIMsg(bytes, 1);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiveCoreAnchor", e17.toString());
            }
        } else if (((p05.l0) qVar.W1).d(i17)) {
            try {
                long optLong = new cl0.g(message).optLong(dm.i4.COL_ID);
                if (optLong > 0) {
                    qVar.f420771r.l(new in0.o(qVar, i17, optLong));
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiveCoreAnchor", e18.toString());
            }
        }
        return 0;
    }
}
