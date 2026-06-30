package sd5;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.b f406696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f406697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sd5.b bVar, java.util.List list) {
        super(0);
        this.f406696d = bVar;
        this.f406697e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List h17;
        sd5.b bVar = this.f406696d;
        int ordinal = bVar.f406699b.ordinal();
        qd5.d dVar = qd5.d.f361905a;
        sd5.o oVar = bVar.f406698a;
        java.util.List list = this.f406697e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                java.lang.String talker = bVar.f406702e;
                if (ordinal == 2) {
                    int max = java.lang.Math.max(0, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().F2(bVar.f406702e, oVar.e(), ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(talker)) - 1);
                    boolean z17 = max <= 48;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "ACTION_UPDATE bottomIncCount:%d, shouldLoadBottom:%b", java.lang.Integer.valueOf(max), java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        list.addAll(oVar.l());
                    } else {
                        list.addAll(oVar.m());
                    }
                } else if (ordinal != 3) {
                    if (ordinal == 4) {
                        android.os.Bundle bundle = bVar.f406700c;
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingNormalDataPresenterV2", "null == sourceArgs!");
                        } else {
                            boolean z18 = bundle.getBoolean("SELECT_BY_MSG_ID", false);
                            hd5.q qVar = bVar.f406701d;
                            if (z18) {
                                long j17 = bundle.getLong("MSG_ID");
                                java.util.List i17 = bVar.f406698a.i(bundle.getString("MSG_TALKER"), j17, bundle.getBoolean("IS_LOAD_ALL", false), bundle.getBoolean("CLEAR_OLD", false));
                                if (qVar != null) {
                                    qVar.f280636h = j17;
                                }
                                list.addAll(i17);
                            } else if (bundle.getInt("SCENE", 0) == 1) {
                                long j18 = bundle.getLong("MSG_ID");
                                java.util.List i18 = bVar.f406698a.i(bundle.getString("MSG_TALKER"), j18, bundle.getBoolean("IS_LOAD_ALL", false), false);
                                if (qVar != null) {
                                    java.util.Iterator it = i18.iterator();
                                    int i19 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i19 = -1;
                                            break;
                                        }
                                        if (((com.tencent.mm.storage.f9) it.next()).getMsgId() == j18) {
                                            break;
                                        }
                                        i19++;
                                    }
                                    qVar.f280635g = i19;
                                }
                                list.addAll(i18);
                            } else if (bundle.getInt("SCENE", 0) == 2) {
                                boolean z19 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.asyncbind.RepairerConfigChatTongueIncLoadData()) == 1;
                                int i27 = bundle.getInt("MSG_POSITION");
                                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "handlePositionForTongue[" + z19 + ']');
                                if (z19) {
                                    kotlin.jvm.internal.o.f(talker, "talker");
                                    oVar.getClass();
                                    com.tencent.mm.storage.f9 a17 = sd5.i.f406719a.a(talker, i27, oVar.c());
                                    if (a17 == null) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "handlePositionForTongue[" + z19 + "] but load all");
                                        h17 = oVar.h(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker) - i27);
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "handlePositionForTongue[" + z19 + "] load one page");
                                        h17 = bVar.f406698a.i(a17.Q0(), a17.getMsgId(), false, false);
                                    }
                                } else {
                                    int j76 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().j7(talker) - i27;
                                    oVar.f406722c.getClass();
                                    h17 = oVar.h(java.lang.Math.max(j76, 16));
                                }
                                list.addAll(h17);
                            }
                            if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupSearchPresenterV2()) == 1) {
                                list.clear();
                                dVar.b(oVar);
                                dVar.c(oVar);
                                list.addAll(oVar.f406723d);
                            }
                        }
                    } else if (ordinal == 7) {
                        if (oVar.f()) {
                            list.addAll(oVar.f406723d);
                        } else if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigRevokeMsgUseNewXmlAndFold()) == 1) {
                            list.addAll(dVar.d(oVar));
                        } else {
                            list.addAll(oVar.g());
                        }
                    }
                } else if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigRevokeMsgUseNewXmlAndFold()) == 1) {
                    list.addAll(dVar.d(oVar));
                } else {
                    list.addAll(oVar.g());
                }
            } else {
                list.addAll(oVar.j());
            }
        } else if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigRevokeMsgUseNewXmlAndFold()) == 1) {
            list.addAll(dVar.e(oVar));
        } else {
            list.addAll(oVar.k());
        }
        return jz5.f0.f302826a;
    }
}
