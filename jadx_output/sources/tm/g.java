package tm;

/* loaded from: classes14.dex */
public class g extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public tm.f f420429d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f420430e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f420431f;

    public g() {
        super(0);
        this.f420430e = new java.util.HashMap();
        this.f420431f = new java.util.HashMap();
    }

    public final void b() {
        tm.f fVar = this.f420429d;
        if (fVar == null || ((java.util.HashMap) fVar.f420428d).get(0) == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f420429d.f420427c)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdize checkShowDisasterContent showDisasterContent[%s]", this.f420429d.f420427c);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_disaster_content", this.f420429d.f420427c);
        intent.putExtra("key_disaster_url", ((com.tencent.mm.autogen.events.UINotifyEvent) ((java.util.HashMap) this.f420429d.f420428d).get(0)).f54906g.f7279b);
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/broadcast/BroadcastController", "checkShowDisasterContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/broadcast/BroadcastController", "checkShowDisasterContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f420429d.f420427c = null;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent;
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object valueOf;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        tm.f fVar;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        am.d1 d1Var;
        java.util.Iterator it;
        com.tencent.mm.autogen.events.BroadcastEvent broadcastEvent = (com.tencent.mm.autogen.events.BroadcastEvent) iEvent;
        am.c1 c1Var = broadcastEvent.f54012g;
        int i17 = c1Var.f6298a;
        java.util.Map map = this.f420431f;
        if (i17 != 1) {
            java.util.Map map2 = this.f420430e;
            am.d1 d1Var2 = broadcastEvent.f54013h;
            if (i17 != 2) {
                java.lang.String str15 = ".e.Item";
                java.lang.String str16 = "en";
                am.d1 d1Var3 = d1Var2;
                java.lang.String str17 = ".Tips";
                if (i17 == 4) {
                    java.lang.String str18 = c1Var.f6299b;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB oldNoticeInfo[%s], event[%s]", this.f420429d, str18);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str18) && str18.indexOf("<") >= 0) {
                        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str18, "e", null);
                        if (d17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BroadcastController", "this is not errmsg");
                        } else {
                            if (this.f420429d == null) {
                                this.f420429d = new tm.f();
                                com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent2 = new com.tencent.mm.autogen.events.UINotifyEvent();
                                num = 0;
                                ((java.util.HashMap) this.f420429d.f420428d).put(null, uINotifyEvent2);
                                am.lz lzVar = uINotifyEvent2.f54906g;
                                lzVar.f7280c = "";
                                lzVar.f7279b = "";
                                lzVar.f7278a = false;
                                lzVar.f7281d = 0;
                                lzVar.f7282e = com.tencent.mm.R.layout.c1s;
                                lzVar.f7283f = "";
                                lzVar.f7284g = 0;
                            } else {
                                num = 0;
                            }
                            if (x51.o1.f452049d0) {
                                str = ".Content";
                                str2 = ".Language";
                            } else {
                                str = ".Content";
                                str2 = ".Language";
                                long j17 = this.f420429d.f420426b;
                                if (j17 == 0 || android.os.SystemClock.elapsedRealtime() - j17 >= 1800000) {
                                    this.f420429d.f420426b = android.os.SystemClock.elapsedRealtime();
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "disasterTick within half an hour, drop it");
                                }
                            }
                            if (!x51.o1.f452051e0) {
                                try {
                                    long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".e.ExpiredTime"), 0L);
                                    if (com.tencent.mm.sdk.platformtools.t8.H1(V) > 0) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "expiredTime is too small, drop id:%d", java.lang.Long.valueOf(V));
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", e17);
                                }
                            }
                            this.f420429d.f420425a = (java.lang.String) d17.get(".e.NoticeId");
                            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("disaster_pref", 4).getString("disaster_noticeid_list_key", "");
                            if (x51.o1.f452053f0 || !string.contains(this.f420429d.f420425a)) {
                                java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                java.lang.String str19 = null;
                                java.lang.String str20 = null;
                                java.lang.String str21 = null;
                                int i18 = 0;
                                while (true) {
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str15);
                                    sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                                    java.lang.String sb7 = sb6.toString();
                                    java.lang.String str22 = (java.lang.String) d17.get(sb7 + str2);
                                    if (str22 == null && i18 > 3) {
                                        str3 = null;
                                        str5 = null;
                                        str4 = null;
                                        break;
                                    }
                                    if (f17.equalsIgnoreCase(str22)) {
                                        java.lang.String str23 = (java.lang.String) d17.get(sb7 + str);
                                        java.lang.String str24 = (java.lang.String) d17.get(sb7 + ".Url");
                                        str3 = (java.lang.String) d17.get(sb7 + str17);
                                        str4 = str24;
                                        str5 = str23;
                                        break;
                                    }
                                    java.lang.String str25 = str21;
                                    java.lang.String str26 = str15;
                                    java.lang.String str27 = str16;
                                    java.lang.String str28 = str17;
                                    java.lang.String str29 = str;
                                    if (str27.equalsIgnoreCase(str22)) {
                                        java.lang.String str30 = (java.lang.String) d17.get(sb7 + str29);
                                        str20 = (java.lang.String) d17.get(sb7 + ".Url");
                                        str6 = str30;
                                        str19 = (java.lang.String) d17.get(sb7 + str28);
                                    } else {
                                        str6 = str25;
                                    }
                                    i18++;
                                    str = str29;
                                    str21 = str6;
                                    str17 = str28;
                                    str16 = str27;
                                    str15 = str26;
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "handleEventOOB cann't hit curLang");
                                } else {
                                    str19 = str3;
                                    str21 = str5;
                                    str20 = str4;
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str20)) {
                                    str20 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491055bq5);
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str21)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "handleEventOOB defContent is also null use hardcode");
                                    str21 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bpz);
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str19)) {
                                    str19 = com.tencent.mm.sdk.platformtools.t8.K0(str21) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491052bq2) : str21;
                                }
                                com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent3 = (com.tencent.mm.autogen.events.UINotifyEvent) ((java.util.HashMap) this.f420429d.f420428d).get(num);
                                am.lz lzVar2 = uINotifyEvent3.f54906g;
                                lzVar2.f7280c = str19;
                                lzVar2.f7279b = str20;
                                lzVar2.f7278a = true;
                                lzVar2.f7281d = 2;
                                lzVar2.f7283f = this.f420429d.f420425a;
                                com.tencent.mm.sdk.platformtools.u3.h(new tm.e(this, uINotifyEvent3));
                                this.f420429d.f420427c = str21;
                                if (c01.d9.e().f70771n) {
                                    b();
                                }
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "noticeIdList %s contain notifyID:%s, drop id", string, this.f420429d.f420425a);
                            }
                        }
                    }
                } else if (i17 == 5) {
                    java.lang.String str31 = c1Var.f6299b;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Integer.valueOf(str31 == null ? -1 : str31.length());
                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster xml len[%d]", objArr);
                    java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(str31, "e", null);
                    if (d18 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster this is not errmsg");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster values[%s]", d18);
                        java.lang.String str32 = ".Content";
                        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d18.get(".e.NoticeId"), 0L);
                        if (V2 <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeID null");
                        }
                        if (!x51.o1.f452051e0) {
                            try {
                                long V3 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d18.get(".e.ExpiredTime"), 0L);
                                if (com.tencent.mm.sdk.platformtools.t8.H1(V3) > 0) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster expiredTime is too small, drop id:%d", java.lang.Long.valueOf(V3));
                                }
                            } catch (java.lang.Exception e18) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "parseLong expiredTime error:%s", e18);
                            }
                        }
                        tm.f fVar2 = new tm.f();
                        fVar2.f420425a = "" + V2;
                        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("disaster_pref", 4).getString("disaster_noticeid_list_key", "");
                        if (x51.o1.f452053f0 || !string2.contains(fVar2.f420425a)) {
                            java.util.HashMap hashMap = (java.util.HashMap) map;
                            if (hashMap.size() > 0) {
                                tm.f fVar3 = (tm.f) hashMap.get(java.lang.Long.valueOf(V2));
                                if (fVar3 != null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz  handleNewDisaster found info in map[%s]", fVar3);
                                    fVar2 = fVar3;
                                } else {
                                    hashMap.put(java.lang.Long.valueOf(V2), fVar2);
                                }
                            } else {
                                hashMap.put(java.lang.Long.valueOf(V2), fVar2);
                            }
                            java.lang.String str33 = (java.lang.String) d18.get(".e.Position");
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str33)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr is null!");
                            } else {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.String[] split = str33.split(",");
                                if (split == null || split.length < 1) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positionStr id invaild!");
                                } else {
                                    boolean z17 = false;
                                    for (java.lang.String str34 : split) {
                                        int P = com.tencent.mm.sdk.platformtools.t8.P(str34, 0);
                                        if (P > 0) {
                                            if (P == 1) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster found tonyTips[%d]", java.lang.Integer.valueOf(P));
                                                z17 = true;
                                            } else {
                                                arrayList.add(java.lang.Integer.valueOf(P));
                                            }
                                        }
                                    }
                                    if (z17 || arrayList.size() != 0) {
                                        java.lang.String f18 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster curLang[%s]", f18);
                                        java.lang.String str35 = null;
                                        java.lang.String str36 = null;
                                        int i19 = 0;
                                        java.lang.String str37 = null;
                                        while (true) {
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(".e.Item");
                                            if (i19 == 0) {
                                                str7 = str35;
                                                valueOf = "";
                                            } else {
                                                str7 = str35;
                                                valueOf = java.lang.Integer.valueOf(i19);
                                            }
                                            sb8.append(valueOf);
                                            java.lang.String sb9 = sb8.toString();
                                            java.lang.String str38 = (java.lang.String) d18.get(sb9 + ".Language");
                                            str8 = str36;
                                            if (str38 == null && i19 > 3) {
                                                str9 = null;
                                                str11 = null;
                                                str10 = null;
                                                break;
                                            }
                                            if (f18.equalsIgnoreCase(str38)) {
                                                java.lang.String str39 = (java.lang.String) d18.get(sb9 + str32);
                                                java.lang.String str40 = (java.lang.String) d18.get(sb9 + ".Url");
                                                str9 = (java.lang.String) d18.get(sb9 + str17);
                                                str10 = str40;
                                                str11 = str39;
                                                break;
                                            }
                                            java.lang.String str41 = str32;
                                            java.util.ArrayList arrayList2 = arrayList;
                                            java.lang.String str42 = str17;
                                            java.lang.String str43 = f18;
                                            java.lang.String str44 = str16;
                                            long j18 = V2;
                                            am.d1 d1Var4 = d1Var3;
                                            if (str44.equalsIgnoreCase(str38)) {
                                                java.lang.String str45 = (java.lang.String) d18.get(sb9 + str41);
                                                fVar = fVar2;
                                                str37 = (java.lang.String) d18.get(sb9 + ".Url");
                                                str8 = str45;
                                                str35 = (java.lang.String) d18.get(sb9 + str42);
                                            } else {
                                                fVar = fVar2;
                                                str35 = str7;
                                            }
                                            i19++;
                                            f18 = str43;
                                            fVar2 = fVar;
                                            str16 = str44;
                                            d1Var3 = d1Var4;
                                            str17 = str42;
                                            V2 = j18;
                                            arrayList = arrayList2;
                                            str32 = str41;
                                            str36 = str8;
                                        }
                                        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster content[%s] tips[%s]", str11, str9);
                                        if (com.tencent.mm.sdk.platformtools.t8.K0(str11)) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster cann't hit curLang");
                                            str14 = str37;
                                            str13 = str8;
                                            str12 = str7;
                                        } else {
                                            str12 = str9;
                                            str13 = str11;
                                            str14 = str10;
                                        }
                                        if (com.tencent.mm.sdk.platformtools.t8.K0(str14)) {
                                            str14 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491055bq5);
                                        }
                                        if (z17) {
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
                                                str13 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491050bq0);
                                            }
                                            if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                                                str12 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491053bq3);
                                            }
                                            d1Var = d1Var3;
                                            d1Var.f6422c = str13;
                                            d1Var.f6421b = str14;
                                            d1Var.f6420a = true;
                                            d1Var.f6424e = 0;
                                            d1Var.f6423d = 6;
                                            d1Var.f6425f = "" + V2;
                                            d1Var.f6426g = 1;
                                        } else {
                                            d1Var = d1Var3;
                                        }
                                        if (arrayList.size() == 0) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster no other position need to tip");
                                        } else {
                                            long j19 = fVar2.f420426b;
                                            if (j19 == 0 || android.os.SystemClock.elapsedRealtime() - j19 >= 1800000) {
                                                fVar2.f420426b = android.os.SystemClock.elapsedRealtime();
                                                for (java.util.Iterator it6 = arrayList.iterator(); it6.hasNext(); it6 = it) {
                                                    java.lang.Integer num2 = (java.lang.Integer) it6.next();
                                                    java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                                                    java.lang.Long valueOf2 = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hashMap2.get(num2), 0L));
                                                    if (valueOf2.longValue() <= 0 || valueOf2.longValue() < V2) {
                                                        java.util.HashMap hashMap3 = (java.util.HashMap) fVar2.f420428d;
                                                        com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent4 = (com.tencent.mm.autogen.events.UINotifyEvent) hashMap3.get(num2);
                                                        if (uINotifyEvent4 == null) {
                                                            uINotifyEvent4 = new com.tencent.mm.autogen.events.UINotifyEvent();
                                                            am.lz lzVar3 = uINotifyEvent4.f54906g;
                                                            lzVar3.getClass();
                                                            it = it6;
                                                            lzVar3.f7282e = com.tencent.mm.R.layout.c1s;
                                                            lzVar3.f7284g = num2.intValue();
                                                            hashMap3.put(num2, uINotifyEvent4);
                                                        } else {
                                                            it = it6;
                                                        }
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                                                            str12 = str13;
                                                        }
                                                        if (com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                                                            int intValue = num2.intValue();
                                                            str12 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(intValue != 2 ? (intValue == 3 || intValue == 4) ? com.tencent.mm.R.string.f491051bq1 : com.tencent.mm.R.string.f491052bq2 : com.tencent.mm.R.string.f491054bq4);
                                                        }
                                                        am.lz lzVar4 = uINotifyEvent4.f54906g;
                                                        lzVar4.f7280c = str12;
                                                        lzVar4.f7279b = str14;
                                                        lzVar4.f7278a = true;
                                                        lzVar4.f7281d = 2;
                                                        lzVar4.f7283f = fVar2.f420425a;
                                                        hashMap2.put(num2, java.lang.Long.valueOf(V2));
                                                        if (!z17) {
                                                            d1Var.f6422c = str12;
                                                            d1Var.f6421b = str14;
                                                            d1Var.f6420a = true;
                                                            d1Var.f6424e = com.tencent.mm.R.layout.c1s;
                                                            d1Var.f6423d = 2;
                                                            d1Var.f6425f = "" + V2;
                                                            d1Var.f6426g = num2.intValue();
                                                        }
                                                        com.tencent.mm.sdk.platformtools.u3.h(new tm.d(this, uINotifyEvent4));
                                                    } else {
                                                        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz p[%d] has bigger oldPositionNoticeId[%d, %d]", num2, valueOf2, java.lang.Long.valueOf(V2));
                                                        it = it6;
                                                    }
                                                }
                                            } else {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster disasterTick within half an hour, drop it");
                                            }
                                        }
                                    } else {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.BroadcastController", "summerdiz handleNewDisaster positions size is 0!");
                                    }
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleNewDisaster noticeIdList %s contain notifyID:%s, drop id", string2, fVar2.f420425a);
                        }
                    }
                }
            } else {
                int i27 = c1Var.f6300c;
                java.util.HashMap hashMap4 = (java.util.HashMap) map2;
                com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handlePullNotify position[%d],oldNoticeInfo[%s], positionNoticeIdMap[%d]", java.lang.Integer.valueOf(i27), this.f420429d, java.lang.Integer.valueOf(hashMap4.size()));
                if (i27 <= 0 || hashMap4.size() <= 0) {
                    tm.f fVar4 = this.f420429d;
                    if (fVar4 != null && (uINotifyEvent = (com.tencent.mm.autogen.events.UINotifyEvent) ((java.util.HashMap) fVar4.f420428d).get(0)) != null) {
                        am.lz lzVar5 = uINotifyEvent.f54906g;
                        d1Var2.f6422c = lzVar5.f7280c;
                        d1Var2.f6421b = lzVar5.f7279b;
                        boolean z18 = lzVar5.f7278a;
                        d1Var2.f6420a = z18;
                        d1Var2.f6424e = lzVar5.f7282e;
                        d1Var2.f6423d = lzVar5.f7281d;
                        d1Var2.f6425f = lzVar5.f7283f;
                        d1Var2.f6426g = lzVar5.f7284g;
                        if (z18) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13936, java.lang.Integer.valueOf(i27));
                        }
                        b();
                    }
                } else {
                    long k17 = com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) hashMap4.get(java.lang.Integer.valueOf(i27)), 0L);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handlePullNotify position[%d] found noticeId[%d]", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(k17));
                    if (k17 > 0) {
                        tm.f fVar5 = (tm.f) ((java.util.HashMap) map).get(java.lang.Long.valueOf(k17));
                        if (fVar5 == null) {
                            hashMap4.remove(java.lang.Integer.valueOf(i27));
                        } else {
                            com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent5 = (com.tencent.mm.autogen.events.UINotifyEvent) ((java.util.HashMap) fVar5.f420428d).get(java.lang.Integer.valueOf(i27));
                            if (uINotifyEvent5 != null) {
                                am.lz lzVar6 = uINotifyEvent5.f54906g;
                                d1Var2.f6422c = lzVar6.f7280c;
                                d1Var2.f6421b = lzVar6.f7279b;
                                boolean z19 = lzVar6.f7278a;
                                d1Var2.f6420a = z19;
                                d1Var2.f6424e = lzVar6.f7282e;
                                d1Var2.f6423d = lzVar6.f7281d;
                                d1Var2.f6425f = lzVar6.f7283f;
                                d1Var2.f6426g = lzVar6.f7284g;
                                if (z19) {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13936, java.lang.Integer.valueOf(i27));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            java.lang.String str46 = c1Var.f6299b;
            long V4 = com.tencent.mm.sdk.platformtools.t8.V(str46, 0L);
            int i28 = c1Var.f6300c;
            java.util.HashMap hashMap5 = (java.util.HashMap) map;
            com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelUIEvent cancelNoticeIDStr[%s] cancelPosition[%d], oldNoticeInfo[%s] newDisasterNoticeInfoMap[%d] ", str46, java.lang.Integer.valueOf(i28), this.f420429d, java.lang.Integer.valueOf(hashMap5.size()));
            if (hashMap5.size() > 0 && V4 > 0) {
                tm.f fVar6 = (tm.f) hashMap5.get(java.lang.Long.valueOf(V4));
                if (fVar6 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelUIEvent found info[%s]", fVar6);
                    java.util.Map map3 = fVar6.f420428d;
                    if (i28 > 0) {
                        com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent6 = (com.tencent.mm.autogen.events.UINotifyEvent) ((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i28));
                        if (uINotifyEvent6 != null) {
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i28);
                            am.lz lzVar7 = uINotifyEvent6.f54906g;
                            com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelPosition[%d] found event[%b]", valueOf3, java.lang.Boolean.valueOf(lzVar7.f7278a));
                            if (lzVar7.f7278a) {
                                lzVar7.f7278a = false;
                                uINotifyEvent6.e();
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13939, 2);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelPosition[%d] not found event", java.lang.Integer.valueOf(i28));
                        }
                    } else {
                        java.util.Collection<com.tencent.mm.autogen.events.UINotifyEvent> values = ((java.util.HashMap) map3).values();
                        if (values != null && (r0 = values.iterator()) != null) {
                            for (com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent7 : values) {
                                if (uINotifyEvent7 != null) {
                                    am.lz lzVar8 = uINotifyEvent7.f54906g;
                                    if (lzVar8.f7278a) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelPosition[%d] found event[%b]", java.lang.Long.valueOf(V4), java.lang.Boolean.valueOf(lzVar8.f7278a));
                                        lzVar8.f7278a = false;
                                        uINotifyEvent7.e();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelNoticeID not found info");
                }
            }
            if (this.f420429d != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str46) || str46.equals(this.f420429d.f420425a)) {
                    com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent8 = (com.tencent.mm.autogen.events.UINotifyEvent) ((java.util.HashMap) this.f420429d.f420428d).get(0);
                    if (uINotifyEvent8 != null) {
                        am.lz lzVar9 = uINotifyEvent8.f54906g;
                        if (lzVar9.f7278a) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13939, 2);
                            lzVar9.f7278a = false;
                            uINotifyEvent8.e();
                            return false;
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz cancelUIEvent old now:[%s], want to cancel:[%s], drop id", this.f420429d.f420425a, str46);
                }
            }
        }
        return false;
    }
}
