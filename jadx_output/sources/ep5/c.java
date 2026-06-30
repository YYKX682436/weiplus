package ep5;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep5.d f255770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f255771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f255772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ep5.d dVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255770d = dVar;
        this.f255771e = concurrentHashMap;
        this.f255772f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ep5.c(this.f255770d, this.f255771e, this.f255772f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ep5.c cVar = (ep5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Set<java.lang.Integer> keySet;
        java.lang.Long l17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Map a17 = kz5.a1.a(new java.util.HashMap(), ep5.b.f255769d);
        ep5.d dVar = this.f255770d;
        java.util.Collection values = dVar.f255774b.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        char c17 = 65535;
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.f255771e;
            if (!hasNext) {
                break;
            }
            ep5.a aVar2 = (ep5.a) it.next();
            boolean b17 = kotlin.jvm.internal.o.b(aVar2.f255764a, "camera");
            java.lang.String str = aVar2.f255764a;
            if (b17 || kotlin.jvm.internal.o.b(str, "process") || kotlin.jvm.internal.o.b(str, "local_render")) {
                l17 = null;
                if (aVar2.b(2) && !this.f255772f) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = dVar.f255775c;
                    java.lang.Integer num = (java.lang.Integer) concurrentHashMap2.get(str);
                    if (num == null) {
                        num = new java.lang.Integer(0);
                    }
                    concurrentHashMap2.put(str, new java.lang.Integer(num.intValue() + 1));
                } else if (kotlin.jvm.internal.o.b(str, "camera")) {
                    c17 = 0;
                }
            } else {
                if (r26.n0.D(str, "soft_decode_", false, 2, null) && concurrentHashMap != null) {
                    int parseInt = java.lang.Integer.parseInt((java.lang.String) r26.n0.f0(aVar2.f255764a, new java.lang.String[]{"_decode_"}, false, 0, 6, null).get(1));
                    if (aVar2.b(2) && kotlin.jvm.internal.o.b(concurrentHashMap.get(new java.lang.Integer(parseInt)), java.lang.Boolean.FALSE)) {
                        java.lang.Integer num2 = (java.lang.Integer) a17.get(new java.lang.Integer(parseInt));
                        if (num2 != null && num2.intValue() == 2) {
                            a17.put(new java.lang.Integer(parseInt), new java.lang.Integer(3));
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = dVar.f255775c;
                            java.lang.String str2 = "decode_" + parseInt;
                            java.lang.Integer num3 = (java.lang.Integer) dVar.f255775c.get("decode_" + parseInt);
                            if (num3 == null) {
                                num3 = new java.lang.Integer(0);
                            }
                            concurrentHashMap3.put(str2, new java.lang.Integer(num3.intValue() + 1));
                        } else {
                            a17.put(new java.lang.Integer(parseInt), new java.lang.Integer(1));
                        }
                    } else {
                        a17.put(new java.lang.Integer(parseInt), new java.lang.Integer(0));
                    }
                } else if (!r26.n0.D(str, "hw_decode_", false, 2, null) || concurrentHashMap == null) {
                    l17 = null;
                } else {
                    int parseInt2 = java.lang.Integer.parseInt((java.lang.String) r26.n0.f0(aVar2.f255764a, new java.lang.String[]{"_decode_"}, false, 0, 6, null).get(1));
                    if (aVar2.b(2) && kotlin.jvm.internal.o.b(concurrentHashMap.get(new java.lang.Integer(parseInt2)), java.lang.Boolean.FALSE)) {
                        java.lang.Integer num4 = (java.lang.Integer) a17.get(new java.lang.Integer(parseInt2));
                        if (num4 != null && num4.intValue() == 1) {
                            a17.put(new java.lang.Integer(parseInt2), new java.lang.Integer(3));
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = dVar.f255775c;
                            java.lang.String str3 = "decode_" + parseInt2;
                            java.lang.Integer num5 = (java.lang.Integer) dVar.f255775c.get("decode_" + parseInt2);
                            if (num5 == null) {
                                num5 = new java.lang.Integer(0);
                            }
                            concurrentHashMap4.put(str3, new java.lang.Integer(num5.intValue() + 1));
                        } else {
                            a17.put(new java.lang.Integer(parseInt2), new java.lang.Integer(2));
                        }
                    } else {
                        a17.put(new java.lang.Integer(parseInt2), new java.lang.Integer(0));
                    }
                }
                l17 = null;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - aVar2.f255768e) / 1000);
            if (valueOf.longValue() > 0) {
                l17 = valueOf;
            }
            long longValue = l17 != null ? l17.longValue() : 1L;
            stringBuffer.append("MicroMsg.ILinkVoIP.VideoFrameTracker " + str + " succTick " + aVar2.f255765b + ", fail Tick " + aVar2.f255766c + " in " + longValue + " s, succ fps " + (aVar2.f255765b / longValue) + '\n');
            aVar2.f255765b = 0;
            aVar2.f255766c = 0;
            aVar2.f255768e = 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "clear");
        }
        if (c17 == 65535) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap5 = dVar.f255775c;
            java.lang.Integer num6 = (java.lang.Integer) concurrentHashMap5.get("camera");
            if (num6 == null) {
                num6 = new java.lang.Integer(0);
            }
            concurrentHashMap5.put("camera", new java.lang.Integer(num6.intValue() + 1));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap6 = dVar.f255775c;
            java.lang.Integer num7 = (java.lang.Integer) concurrentHashMap6.get("process");
            if (num7 == null) {
                num7 = new java.lang.Integer(0);
            }
            concurrentHashMap6.put("process", new java.lang.Integer(num7.intValue() + 1));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap7 = dVar.f255775c;
            java.lang.Integer num8 = (java.lang.Integer) concurrentHashMap7.get("local_render");
            if (num8 == null) {
                num8 = new java.lang.Integer(0);
            }
            concurrentHashMap7.put("local_render", new java.lang.Integer(num8.intValue() + 1));
        }
        if (concurrentHashMap != null && (keySet = concurrentHashMap.keySet()) != null) {
            for (java.lang.Integer num9 : keySet) {
                if (kotlin.jvm.internal.o.b(concurrentHashMap.get(num9), java.lang.Boolean.TRUE) && a17.get(num9) == null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap8 = dVar.f255775c;
                    java.lang.String str4 = "decode_" + num9.intValue();
                    java.lang.Integer num10 = (java.lang.Integer) dVar.f255775c.get("decode_" + num9.intValue());
                    if (num10 == null) {
                        num10 = new java.lang.Integer(0);
                    }
                    concurrentHashMap8.put(str4, new java.lang.Integer(num10.intValue() + 1));
                }
            }
        }
        dVar.f255776d++;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.VideoFrameTracker", "dump: " + ((java.lang.Object) stringBuffer));
        return jz5.f0.f302826a;
    }
}
