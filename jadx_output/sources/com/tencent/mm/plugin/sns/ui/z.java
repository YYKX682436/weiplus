package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class z extends com.tencent.mm.plugin.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public r45.za f171653c;

    /* renamed from: d, reason: collision with root package name */
    public int f171654d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c7 f171655e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.a0 f171656f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171657g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f171658h;

    public z(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.sns.ui.a0 a0Var) {
        new java.util.ArrayList();
        this.f171654d = 0;
        this.f171657g = "";
        this.f171658h = "";
        this.f171656f = a0Var;
        wa4.e eVar = new wa4.e();
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(mMActivity);
        eVar.f444219d = f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistAdapterHelper", "language:%s", f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createCgi", "com.tencent.mm.plugin.sns.snstimeline.GetSnsMasterBackGroundRequest");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 21661;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsgetmasterbackground";
        lVar.f70664a = eVar;
        lVar.f70665b = new wa4.f();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createCgi", "com.tencent.mm.plugin.sns.snstimeline.GetSnsMasterBackGroundRequest");
        pq5.g l17 = iVar.l();
        l17.f(mMActivity);
        l17.q(new gm5.a() { // from class: com.tencent.mm.plugin.sns.ui.z$$a
            @Override // gm5.a
            public final java.lang.Object call(java.lang.Object obj) {
                com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                com.tencent.mm.plugin.sns.ui.z zVar = com.tencent.mm.plugin.sns.ui.z.this;
                zVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                com.tencent.mars.xlog.Log.i("MicroMsg.ArtistAdapterHelper", "GetSnsMasterBackGroundRequest errType:%d errCode:%d", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
                if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                    wa4.f fVar2 = (wa4.f) fVar.f70618d;
                    if (!android.text.TextUtils.isEmpty(zVar.f171658h)) {
                        try {
                            com.tencent.mm.vfs.w6.R(zVar.f171658h + zVar.f171657g + "_ARTISTP.mm", fVar2.toByteArray());
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ArtistAdapterHelper", e17, "save error GetSnsMasterBackGroundResponse", new java.lang.Object[0]);
                        }
                    }
                } else {
                    ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).wi(4, false);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                return null;
            }
        });
    }

    public static r45.jj4 d(wa4.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("media2MediaObj", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        r45.jj4 jj4Var = new r45.jj4();
        jj4Var.f377855d = hVar.f444231d;
        jj4Var.f377856e = hVar.f444232e;
        jj4Var.f377864o = hVar.f444233f;
        jj4Var.f377857f = hVar.f444234g;
        jj4Var.f377863n = hVar.f444235h;
        jj4Var.f377858g = hVar.f444236i;
        jj4Var.f377860i = hVar.f444237m;
        r45.lj4 lj4Var = new r45.lj4();
        lj4Var.f379520d = hVar.f444238n;
        lj4Var.f379521e = hVar.f444239o;
        lj4Var.f379522f = hVar.f444240p;
        jj4Var.f377865p = lj4Var;
        jj4Var.S = hVar.f444241q;
        jj4Var.f377862m = hVar.f444242r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("media2MediaObj", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        return jj4Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.o
    public java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            arrayList.clear();
            this.f171655e = null;
            java.lang.String str = this.f171658h + this.f171657g + "_ARTISTP.mm";
            if (com.tencent.mm.vfs.w6.k(str) > 0) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ArtistAdapterHelper", "loadData from GetSnsMasterBackGroundResponse");
                    byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
                    wa4.f fVar = new wa4.f();
                    java.util.LinkedList linkedList = fVar.f444224e;
                    fVar.parseFrom(N);
                    if (!fVar.f444223d && !linkedList.isEmpty()) {
                        wa4.a aVar = (wa4.a) linkedList.get(0);
                        this.f171653c = new r45.za();
                        r45.ab abVar = new r45.ab();
                        abVar.f369879d = d(aVar.f444201d.f444214h.f444230d);
                        r45.za zaVar = this.f171653c;
                        wa4.d dVar = aVar.f444201d;
                        zaVar.f391841d = dVar.f444210d;
                        zaVar.f391842e = dVar.f444211e;
                        zaVar.f391843f = dVar.f444213g;
                        zaVar.f391844g = dVar.f444212f;
                        zaVar.f391845h = abVar;
                        java.util.Iterator it = aVar.f444202e.iterator();
                        while (it.hasNext()) {
                            wa4.c cVar = (wa4.c) it.next();
                            java.lang.String str2 = cVar.f444205d;
                            java.util.Iterator it6 = cVar.f444206e.iterator();
                            while (it6.hasNext()) {
                                r45.jj4 d17 = d((wa4.h) it6.next());
                                d17.f377857f = str2;
                                arrayList.add(d17);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        return arrayList;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ArtistAdapterHelper", e17, "parse error GetSnsMasterBackGroundResponse", new java.lang.Object[0]);
                }
            }
            java.lang.String str3 = this.f171658h + this.f171657g + "_ARTISTF.mm";
            if (com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ArtistAdapterHelper", "loadData from finish file");
                this.f171655e = (r45.c7) new r45.c7().parseFrom(com.tencent.mm.vfs.w6.N(str3, 0, -1));
            }
            if (this.f171655e == null) {
                java.lang.String str4 = this.f171658h + this.f171657g + "_ARTIST.mm";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getXmlfromFile", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                java.lang.String str5 = new java.lang.String(com.tencent.mm.vfs.w6.N(str4, 0, (int) com.tencent.mm.vfs.w6.k(str4)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXmlfromFile", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                this.f171655e = wa4.b.c(str5);
                com.tencent.mars.xlog.Log.i("MicroMsg.ArtistAdapterHelper", "loadData from finish xml");
                if (this.f171655e == null) {
                    com.tencent.mm.vfs.w6.h(str4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    return null;
                }
                com.tencent.mm.vfs.w6.h(str3);
                com.tencent.mm.vfs.w6.R(str3, this.f171655e.toByteArray());
            }
            r45.c7 c7Var = this.f171655e;
            if (c7Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                return null;
            }
            java.util.Iterator it7 = c7Var.f371341e.iterator();
            while (it7.hasNext()) {
                r45.zt3 zt3Var = (r45.zt3) it7.next();
                java.lang.String str6 = zt3Var.f392365d;
                java.util.Iterator it8 = zt3Var.f392366e.iterator();
                while (it8.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it8.next();
                    jj4Var.f377857f = str6;
                    arrayList.add(jj4Var);
                }
            }
            this.f171653c = this.f171655e.f371340d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            return arrayList;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ArtistAdapterHelper", e18, "loadData failed.", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.o
    public void c(java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        int i17;
        java.util.List list2 = list;
        java.lang.String str6 = "publicNotify";
        java.lang.String str7 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        com.tencent.mm.plugin.sns.ui.a0 a0Var = this.f171656f;
        if (a0Var != null) {
            java.lang.String str8 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            java.lang.String str9 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1";
            if (list2 != null) {
                java.lang.String str10 = "initFixType";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFixType", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap.clear();
                hashMap2.clear();
                int size = list.size();
                int i18 = 0;
                int i19 = 0;
                int i27 = 0;
                while (i18 < size) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    java.lang.Object obj = list2.get(i18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    java.lang.String str11 = str6;
                    java.lang.String str12 = ((r45.jj4) obj).f377857f;
                    java.lang.String str13 = str10;
                    int i28 = i18 + 1;
                    if (i28 < size) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        java.lang.Object obj2 = list2.get(i28);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        if (str12.equals(((r45.jj4) obj2).f377857f)) {
                            int i29 = i18 + 2;
                            if (i29 < size) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                java.lang.Object obj3 = list2.get(i29);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                if (str12.equals(((r45.jj4) obj3).f377857f)) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                    i17 = 3;
                                    hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                                    hashMap2.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                                    i27 += i17;
                                    i18 += i17;
                                    i19++;
                                    str10 = str13;
                                    str6 = str11;
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                                }
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                            }
                            i17 = 2;
                            hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                            hashMap2.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                            i27 += i17;
                            i18 += i17;
                            i19++;
                            str10 = str13;
                            str6 = str11;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
                    }
                    i17 = 1;
                    hashMap.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                    hashMap2.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                    i27 += i17;
                    i18 += i17;
                    i19++;
                    str10 = str13;
                    str6 = str11;
                }
                str = str6;
                java.lang.String str14 = str10;
                this.f171654d = i19 + 1;
                int size2 = list.size();
                int i37 = this.f171654d;
                r45.za zaVar = this.f171653c;
                java.lang.String str15 = "onFinishFixPos";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1");
                com.tencent.mm.plugin.sns.ui.y yVar = ((com.tencent.mm.plugin.sns.ui.q) a0Var).f170290a;
                yVar.getClass();
                java.lang.String str16 = "setMediaList";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaList", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                if (list.size() <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaList", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                    str3 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
                    str4 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1";
                    str5 = "onFinishFixPos";
                } else {
                    try {
                        r45.za zaVar2 = (r45.za) new r45.za().parseFrom(zaVar.toByteArray());
                        yVar.f171603q = zaVar2;
                        ((com.tencent.mm.plugin.sns.ui.p0) yVar.f171601o).a(zaVar2);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ArtistAdapter", e17, "", new java.lang.Object[0]);
                    }
                    int size3 = list.size();
                    java.util.ArrayList arrayList = (java.util.ArrayList) yVar.f171594e;
                    arrayList.clear();
                    java.util.HashMap hashMap3 = (java.util.HashMap) yVar.f171595f;
                    hashMap3.clear();
                    java.util.HashMap hashMap4 = (java.util.HashMap) yVar.f171596g;
                    hashMap4.clear();
                    int i38 = 0;
                    while (i38 < size3) {
                        int i39 = size3;
                        r45.jj4 jj4Var = (r45.jj4) list2.get(i38);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
                        r45.jj4 h17 = m21.y.h(jj4Var.f377855d, jj4Var.f377856e, jj4Var.f377858g, jj4Var.f377860i, jj4Var.f377859h, jj4Var.f377862m, jj4Var.f377857f);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.modelsns.TimeLineHelper");
                        arrayList.add(h17);
                        i38++;
                        list2 = list;
                        str7 = str7;
                        size3 = i39;
                        str9 = str9;
                        str15 = str15;
                        str8 = str8;
                        str16 = str16;
                        i37 = i37;
                        size2 = size2;
                    }
                    int i47 = size2;
                    str3 = str7;
                    int i48 = i37;
                    java.lang.String str17 = str8;
                    java.lang.String str18 = str9;
                    java.lang.String str19 = str15;
                    java.lang.String str20 = str16;
                    java.util.Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Integer) it.next()).intValue();
                        hashMap3.put(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue()));
                    }
                    java.util.Iterator it6 = hashMap2.keySet().iterator();
                    while (it6.hasNext()) {
                        int intValue2 = ((java.lang.Integer) it6.next()).intValue();
                        hashMap4.put(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(intValue2))).intValue()));
                    }
                    list.clear();
                    hashMap.clear();
                    hashMap2.clear();
                    yVar.f171598i = i47;
                    yVar.f171597h = i48;
                    yVar.notifyDataSetChanged();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str20, str17);
                    str4 = str18;
                    str5 = str19;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                str2 = str3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str14, str2);
            } else {
                str = "publicNotify";
                str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1");
                com.tencent.mm.plugin.sns.ui.y yVar2 = ((com.tencent.mm.plugin.sns.ui.q) a0Var).f170290a;
                yVar2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("nothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                com.tencent.mm.plugin.sns.ui.r rVar = yVar2.f171601o;
                if (rVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNothingBgGet", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                    int i49 = com.tencent.mm.plugin.sns.ui.ArtistUI.f166201r;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    com.tencent.mm.plugin.sns.ui.ArtistUI artistUI = ((com.tencent.mm.plugin.sns.ui.p0) rVar).f170136a;
                    artistUI.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    com.tencent.mm.ui.widget.dialog.u3 u3Var = artistUI.f166206h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                    if (u3Var != null) {
                        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).wi(4, true);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNothingBgGet", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("nothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNothingGet", "com.tencent.mm.plugin.sns.ui.ArtistAdapter$1");
            }
        } else {
            str = "publicNotify";
            str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
