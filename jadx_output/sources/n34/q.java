package n34;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.a90 a90Var;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        com.tencent.mm.autogen.events.ExtGetSnsDataEvent extGetSnsDataEvent = (com.tencent.mm.autogen.events.ExtGetSnsDataEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        r4 = false;
        r4 = false;
        r4 = false;
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExtGetSnsDataEventListener", "ExtGetSnsDataEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        } else if (!(extGetSnsDataEvent instanceof com.tencent.mm.autogen.events.ExtGetSnsDataEvent)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.ExtGetSnsDataEventListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        } else if (extGetSnsDataEvent.f54196g.f6541a == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        } else {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
            snsInfo.convertFrom(extGetSnsDataEvent.f54196g.f6541a);
            if (snsInfo.localid <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtGetSnsDataEventListener", "sns == null || sns.getLocalid()<=0");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
            } else {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                am.f8 f8Var = extGetSnsDataEvent.f54197h;
                f8Var.f6648e = 0;
                f8Var.f6652i = 0;
                f8Var.f6653j = 0;
                f8Var.f6650g = new java.util.LinkedList();
                f8Var.f6651h = new java.util.LinkedList();
                r45.a90 a90Var2 = timeLine.ContentObj;
                if (a90Var2 != null) {
                    int i18 = a90Var2.f369837e;
                    f8Var.f6648e = i18;
                    if (!com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(i18) && (i17 = (a90Var = timeLine.ContentObj).f369837e) != 7 && i17 != 8) {
                        ((java.util.LinkedList) f8Var.f6650g).add(a90Var.f369839g);
                    } else if (timeLine.ContentObj.f369840h != null) {
                        for (int i19 = 0; i19 < timeLine.ContentObj.f369840h.size(); i19++) {
                            java.util.List list = f8Var.f6650g;
                            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                            r45.jj4 jj4Var = (r45.jj4) timeLine.ContentObj.f369840h.get(i19);
                            hj6.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            java.lang.String str4 = null;
                            if (jj4Var == null || (str3 = jj4Var.f377855d) == null || str3.equals("")) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                str = null;
                            } else {
                                str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
                                if (com.tencent.mm.vfs.w6.j(str)) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                } else {
                                    str = jj4Var.f377860i;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsThumbImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                }
                            }
                            ((java.util.LinkedList) list).add(str);
                            java.util.List list2 = f8Var.f6651h;
                            com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
                            r45.jj4 jj4Var2 = (r45.jj4) timeLine.ContentObj.f369840h.get(i19);
                            hj7.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            if (jj4Var2 == null || (str2 = jj4Var2.f377855d) == null || str2.equals("")) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            } else {
                                str4 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var2.f377855d) + ca4.z0.J(jj4Var2);
                                if (com.tencent.mm.vfs.w6.j(str4)) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                } else {
                                    str4 = jj4Var2.f377858g;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBigImgUri", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                }
                            }
                            ((java.util.LinkedList) list2).add(str4);
                            if (i19 == 0 && timeLine.ContentObj.f369840h.get(i19) != null) {
                                f8Var.f6652i = (int) ((r45.jj4) timeLine.ContentObj.f369840h.get(i19)).f377865p.f379520d;
                                f8Var.f6653j = (int) ((r45.jj4) timeLine.ContentObj.f369840h.get(i19)).f377865p.f379521e;
                            }
                        }
                    }
                }
                f8Var.f6649f = ((java.util.LinkedList) f8Var.f6650g).size();
                f8Var.f6645b = snsInfo.localid;
                f8Var.f6644a = snsInfo.getUserName();
                f8Var.f6646c = timeLine.ContentDesc;
                f8Var.f6647d = timeLine.CreateTime;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ExtGetSnsDataEventListener");
        return z17;
    }
}
