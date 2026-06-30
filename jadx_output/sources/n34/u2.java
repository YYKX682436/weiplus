package n34;

/* loaded from: classes10.dex */
public class u2 extends com.tencent.mm.sdk.event.n {
    public u2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = (com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PostSnsTagMemberOptionListener", "PostSnsTagMemberOptionEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        } else if (postSnsTagMemberOptionEvent instanceof com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent) {
            am.oo ooVar = postSnsTagMemberOptionEvent.f54621g;
            java.util.List list = ooVar.f7570e;
            if (list == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PostSnsTagMemberOptionListener", "event.data.list is null!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
            } else {
                boolean z18 = ooVar.f7569d;
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PostSnsTagMemberOptionListener", "tag list is local %s", java.lang.Boolean.valueOf(z18));
                    com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(ooVar.f7567b);
                    D0.field_tagId = ooVar.f7567b;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(D0.field_memberList)) {
                        arrayList.addAll(com.tencent.mm.sdk.platformtools.t8.P1(D0.field_memberList.split(",")));
                    }
                    java.util.Iterator it = ooVar.f7570e.iterator();
                    while (it.hasNext()) {
                        arrayList.add((java.lang.String) it.next());
                    }
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        java.lang.String str = (java.lang.String) it6.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            stringBuffer.append(str + ",");
                        }
                    }
                    D0.field_memberList = stringBuffer.toString();
                    com.tencent.mm.plugin.sns.model.l4.Lj().d1(D0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
                } else {
                    com.tencent.mm.plugin.sns.model.e3 e3Var = new com.tencent.mm.plugin.sns.model.e3(ooVar.f7566a, ooVar.f7567b, "", list.size(), ooVar.f7570e, ooVar.f7568c);
                    com.tencent.mars.xlog.Log.i("MicroMsg.PostSnsTagMemberOptionListener", "opCode " + ooVar.f7566a + " memberList " + ooVar.f7570e.size() + " scene " + ooVar.f7568c);
                    gm0.j1.n().f273288b.g(e3Var);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
                }
                z17 = true;
            }
        } else {
            com.tencent.mars.xlog.Log.f("MicroMsg.PostSnsTagMemberOptionListener", "mismatched event");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.PostSnsTagMemberOptionListener");
        return z17;
    }
}
