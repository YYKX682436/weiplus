package uc4;

/* loaded from: classes4.dex */
public final class k0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.m0 f426426d;

    public k0(uc4.m0 m0Var) {
        this.f426426d = m0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        if (tag instanceof com.tencent.mm.plugin.sns.ui.i2) {
            com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) tag;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
            j45.l.g("favorite");
            int i17 = timeLineObject.ContentObj.f369837e;
            if (i17 != 1) {
                if (i17 == 9) {
                    menu.add(0, 5, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 26) {
                    menu.add(0, 22, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 33) {
                    menu.add(0, 24, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 3) {
                    menu.add(0, 3, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = i2Var.f168550b;
                    exDeviceHaveBindNetworkDeviceEvent.e();
                    if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                        menu.add(0, 18, 0, v17.getContext().getString(com.tencent.mm.R.string.f490508x2));
                    }
                } else if (i17 == 4) {
                    menu.add(0, 4, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent2 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    exDeviceHaveBindNetworkDeviceEvent2.f54141g.f6221c = i2Var.f168550b;
                    exDeviceHaveBindNetworkDeviceEvent2.e();
                    if (exDeviceHaveBindNetworkDeviceEvent2.f54142h.f6336a) {
                        menu.add(0, 18, 0, v17.getContext().getString(com.tencent.mm.R.string.f490508x2));
                    }
                } else if (i17 == 5) {
                    menu.add(0, 4, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent3 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    exDeviceHaveBindNetworkDeviceEvent3.f54141g.f6221c = i2Var.f168550b;
                    exDeviceHaveBindNetworkDeviceEvent3.e();
                    if (exDeviceHaveBindNetworkDeviceEvent3.f54142h.f6336a) {
                        menu.add(0, 18, 0, v17.getContext().getString(com.tencent.mm.R.string.f490508x2));
                    }
                } else if (i17 == 14) {
                    menu.add(0, 9, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 15) {
                    menu.add(0, 10, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 != 29) {
                    if (i17 == 30) {
                        menu.add(0, 23, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                    } else if (i17 != 37 && i17 != 38) {
                        if (i17 != 41) {
                            if (i17 == 42 || i17 == 47) {
                                android.content.Context context = v17.getContext();
                                kotlin.jvm.internal.o.f(context, "getContext(...)");
                                je4.g.b(context, i2Var.f168549a, menu);
                                menu.add(0, 28, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                                com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent4 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                                exDeviceHaveBindNetworkDeviceEvent4.f54141g.f6221c = i2Var.f168550b;
                                exDeviceHaveBindNetworkDeviceEvent4.e();
                                if (exDeviceHaveBindNetworkDeviceEvent4.f54142h.f6336a) {
                                    menu.add(0, 18, 0, v17.getContext().getString(com.tencent.mm.R.string.f490508x2));
                                }
                            } else if (i17 != 48) {
                                switch (i17) {
                                    case 53:
                                    case 55:
                                    case 56:
                                        break;
                                    case 54:
                                        break;
                                    default:
                                        menu.add(0, 3, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                                        break;
                                }
                            } else {
                                android.content.Context context2 = v17.getContext();
                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                if (je4.g.d(context2, i2Var.f168549a)) {
                                    menu.add(0, 30, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                                }
                            }
                        } else if (new com.tencent.mm.repairer.config.fav.RepairerConfigFavAddByLongPressLiteAppCell().p()) {
                            menu.add(0, 32, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "onMMCreateContextMenu: liteapp expt skip");
                        }
                    }
                }
                com.tencent.mm.plugin.sns.abtest.a.b(menu, com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b));
            }
            menu.add(0, 2, 0, v17.getContext().getString(com.tencent.mm.R.string.hjg));
            com.tencent.mm.plugin.sns.abtest.a.b(menu, com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) tag;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        int i17 = timeLineObject.ContentObj.f369837e;
        if (i17 == 10 || i17 == 17 || i17 == 22 || i17 == 23) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
            return false;
        }
        this.f426426d.e().e(view, i2Var.f168550b, timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick$urlMenuListener$2$1");
        return true;
    }
}
