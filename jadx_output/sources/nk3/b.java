package nk3;

/* loaded from: classes8.dex */
public final class b implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f338028a;

    public b(java.util.Map map) {
        this.f338028a = map;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("total", java.lang.Integer.valueOf(list.size()));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next();
            nk3.d dVar = nk3.d.f338030a;
            int i17 = multiTaskInfo.field_type;
            dVar.getClass();
            if (i17 == 1) {
                str = "weapp";
            } else if (i17 == 2) {
                str = "webview";
            } else if (i17 == 3) {
                str = "wenote";
            } else if (i17 != 4) {
                switch (i17) {
                    case 6:
                        str = "music";
                        break;
                    case 7:
                        str = ya.b.LOCATION;
                        break;
                    case 8:
                        break;
                    case 9:
                        str = "voip";
                        break;
                    default:
                        switch (i17) {
                            case 20:
                                str = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
                                break;
                            case 21:
                                str = "live";
                                break;
                            case 22:
                                str = "finderStarVideo";
                                break;
                            case 23:
                                str = "tingStarMusic";
                                break;
                            case 24:
                                str = "ting";
                                break;
                            case 25:
                                str = "wcfinderLongVideo";
                                break;
                            case 26:
                                str = "article";
                                break;
                            case 27:
                                break;
                            case 28:
                                str = "liteapp";
                                break;
                            case 29:
                                str = "ask";
                                break;
                            case 30:
                                str = ya.a.SEARCH;
                                break;
                            default:
                                str = "Unknown$" + i17;
                                break;
                        }
                }
                str = "k1kVideo";
            } else {
                str = "file";
            }
            if (str.length() > 0) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap2.get(str);
                linkedHashMap2.put(str, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        java.util.Map map = this.f338028a;
        map.put("multi_task_type_list", linkedHashMap);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        nk3.d dVar2 = nk3.d.f338030a;
        dVar2.getClass();
        java.lang.String str2 = nk3.d.f338034e;
        dVar2.getClass();
        ((cy1.a) rVar).Ej(str2, map, nk3.d.f338033d);
    }
}
