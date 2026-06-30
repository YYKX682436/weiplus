package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class p0 extends com.tencent.mm.plugin.sns.ui.listener.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169844d;

    public p0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169844d = iVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.tencent.mm.plugin.sns.ui.i2) {
            com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) tag;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
            j45.l.g("favorite");
            int i17 = timeLineObject.ContentObj.f369837e;
            java.lang.String str = i2Var.f168550b;
            if (i17 != 1) {
                if (i17 == 9) {
                    contextMenu.add(0, 5, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 26) {
                    contextMenu.add(0, 22, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 33) {
                    contextMenu.add(0, 24, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 3) {
                    contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    exDeviceHaveBindNetworkDeviceEvent.f54141g.f6221c = str;
                    exDeviceHaveBindNetworkDeviceEvent.e();
                    if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                        contextMenu.add(0, 18, 0, view.getContext().getString(com.tencent.mm.R.string.f490508x2));
                    }
                } else if (i17 == 4) {
                    contextMenu.add(0, 4, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent2 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    exDeviceHaveBindNetworkDeviceEvent2.f54141g.f6221c = str;
                    exDeviceHaveBindNetworkDeviceEvent2.e();
                    if (exDeviceHaveBindNetworkDeviceEvent2.f54142h.f6336a) {
                        contextMenu.add(0, 18, 0, view.getContext().getString(com.tencent.mm.R.string.f490508x2));
                    }
                } else if (i17 == 5) {
                    contextMenu.add(0, 4, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent3 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                    exDeviceHaveBindNetworkDeviceEvent3.f54141g.f6221c = str;
                    exDeviceHaveBindNetworkDeviceEvent3.e();
                    if (exDeviceHaveBindNetworkDeviceEvent3.f54142h.f6336a) {
                        contextMenu.add(0, 18, 0, view.getContext().getString(com.tencent.mm.R.string.f490508x2));
                    }
                } else if (i17 == 14) {
                    contextMenu.add(0, 9, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 == 15) {
                    contextMenu.add(0, 10, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                } else if (i17 != 29) {
                    if (i17 == 30) {
                        contextMenu.add(0, 23, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                    } else if (i17 != 37 && i17 != 38) {
                        if (i17 == 41) {
                            contextMenu.add(0, 32, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                        } else if (i17 == 42 || i17 == 47) {
                            je4.g.b(view.getContext(), i2Var.f168549a, contextMenu);
                            contextMenu.add(0, 28, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent4 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
                            exDeviceHaveBindNetworkDeviceEvent4.f54141g.f6221c = str;
                            exDeviceHaveBindNetworkDeviceEvent4.e();
                            if (exDeviceHaveBindNetworkDeviceEvent4.f54142h.f6336a) {
                                contextMenu.add(0, 18, 0, view.getContext().getString(com.tencent.mm.R.string.f490508x2));
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
                                    contextMenu.add(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                                    break;
                            }
                        } else if (je4.g.d(view.getContext(), timeLineObject)) {
                            contextMenu.add(0, 30, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
                        }
                    }
                }
                com.tencent.mm.plugin.sns.abtest.a.b(contextMenu, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str));
            }
            contextMenu.add(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.hjg));
            com.tencent.mm.plugin.sns.abtest.a.b(contextMenu, com.tencent.mm.plugin.sns.model.l4.Fj().k1(str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.h1
    public boolean b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
        java.lang.Object tag = view.getTag();
        if (!(tag instanceof com.tencent.mm.plugin.sns.ui.i2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) tag;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
        int i17 = timeLineObject.ContentObj.f369837e;
        if (i17 == 10 || i17 == 17 || i17 == 22 || i17 == 23 || i17 == 49) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
            return false;
        }
        this.f169844d.f169809l.e(view, i2Var.f168550b, timeLineObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$38");
        return true;
    }
}
