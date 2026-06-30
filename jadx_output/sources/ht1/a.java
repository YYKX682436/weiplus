package ht1;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Object m521constructorimpl;
        java.util.HashSet hashSet;
        com.tencent.mm.autogen.events.BypNotifyActionEvent event = (com.tencent.mm.autogen.events.BypNotifyActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.j1 j1Var = event.f54019g;
        if (j1Var.f6992a != 11) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BypCommonBizEventListener", "skipped an event that is not of a BypNotifyActionEvent.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BypCommonBizEventListener", "Received a BypNotifyActionEvent.");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            r45.fo5 fo5Var = new r45.fo5();
            fo5Var.parseFrom(j1Var.f6993b);
            long j17 = fo5Var.f374492d;
            jz5.f0 f0Var = null;
            if (j17 > 0) {
                hashSet = new java.util.HashSet();
                int i17 = 0;
                while (true) {
                    long j18 = 1 << i17;
                    if (j18 > j17) {
                        break;
                    }
                    if ((j18 & j17) > 0) {
                        hashSet.add(java.lang.Integer.valueOf(i17));
                    }
                    i17++;
                }
            } else {
                hashSet = null;
            }
            com.tencent.mm.protobuf.g gVar = fo5Var.f374493e;
            byte[] bArr = gVar != null ? gVar.f192156a : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("onDispatch BYPCommonEvent, bizTypeSet: ");
            sb6.append(hashSet);
            sb6.append(", dataBytes: ");
            sb6.append(bArr != null ? kz5.z.v0(bArr) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BypCommonBizEventListener", sb6.toString());
            if (hashSet != null) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    java.util.List list = lt1.p.f321190a;
                    lt1.e eVar = (lt1.e) ((java.util.Map) ((jz5.n) lt1.p.f321191b).getValue()).get(java.lang.Integer.valueOf(intValue));
                    if (eVar != null && eVar.a()) {
                        ((kt1.z) ((ct1.w) i95.n0.c(ct1.w.class))).Ai(bArr, intValue, 3);
                    } else if (intValue != 0) {
                        if (intValue == 1) {
                            com.tencent.mm.autogen.events.BypCommonBizWebSearchRedDotEvent bypCommonBizWebSearchRedDotEvent = new com.tencent.mm.autogen.events.BypCommonBizWebSearchRedDotEvent();
                            bypCommonBizWebSearchRedDotEvent.f54018g.f6892a = bArr;
                            bypCommonBizWebSearchRedDotEvent.e();
                        } else if (intValue == 2) {
                            com.tencent.mm.autogen.events.BypCommonBizAIMediaGenerateCompleteEvent bypCommonBizAIMediaGenerateCompleteEvent = new com.tencent.mm.autogen.events.BypCommonBizAIMediaGenerateCompleteEvent();
                            bypCommonBizAIMediaGenerateCompleteEvent.f54015g.f6625a = true;
                            bypCommonBizAIMediaGenerateCompleteEvent.e();
                        } else if (intValue == 3) {
                            com.tencent.mm.autogen.events.BypCommonBizAIMediaGenerateCompleteEvent bypCommonBizAIMediaGenerateCompleteEvent2 = new com.tencent.mm.autogen.events.BypCommonBizAIMediaGenerateCompleteEvent();
                            bypCommonBizAIMediaGenerateCompleteEvent2.f54015g.f6625a = false;
                            bypCommonBizAIMediaGenerateCompleteEvent2.e();
                        } else if (intValue == 4) {
                            new com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent().e();
                        } else if (intValue == 5) {
                            com.tencent.mm.autogen.events.BypCommonBizMMECRedDotNotifyEvent bypCommonBizMMECRedDotNotifyEvent = new com.tencent.mm.autogen.events.BypCommonBizMMECRedDotNotifyEvent();
                            bypCommonBizMMECRedDotNotifyEvent.f54017g.f6805a = fo5Var.f374493e.f192156a;
                            bypCommonBizMMECRedDotNotifyEvent.e();
                        } else if (intValue == 7) {
                            new com.tencent.mm.autogen.events.BypCommonBizMMTypingTicketNotifyEvent().e();
                        } else if (intValue == 27) {
                            i95.m c17 = i95.n0.c(zy2.y9.class);
                            kotlin.jvm.internal.o.f(c17, "getService(...)");
                            ((c61.k8) ((zy2.y9) c17)).wi(fo5Var.f374493e, "MicroMsg.BypCommonBizEventListener");
                        } else if (intValue == 9) {
                            new com.tencent.mm.autogen.events.BypCommonBizFinderCheckPreFetchNotifyEvent().e();
                        } else if (intValue == 10) {
                            new com.tencent.mm.autogen.events.BypCommonBizEcsWeShopNotifyEvent().e();
                        } else if (intValue == 18) {
                            new com.tencent.mm.autogen.events.BypCommonBizEcsBrandServiceNotifyEvent().e();
                        } else if (intValue == 19) {
                            new com.tencent.mm.autogen.events.BypCommonBizFavPinTopInChatNotifyEvent().e();
                        } else if (intValue == 21) {
                            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).mj();
                        } else if (intValue != 22) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.BypCommonBizEventListener", "onDispatch BYPCommonEvent, unsupported bizType: " + intValue);
                        } else {
                            com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent bypCommonBizMMBizNotifyEvent = new com.tencent.mm.autogen.events.BypCommonBizMMBizNotifyEvent();
                            bypCommonBizMMBizNotifyEvent.f54016g.f6727a = fo5Var.f374493e.f192156a;
                            bypCommonBizMMBizNotifyEvent.e();
                        }
                    }
                }
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BypCommonBizEventListener", m524exceptionOrNullimpl, "", new java.lang.Object[0]);
        }
        return true;
    }
}
