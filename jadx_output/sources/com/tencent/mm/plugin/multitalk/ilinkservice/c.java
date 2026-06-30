package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.model.v0 f149514a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f149515b = new java.util.concurrent.ConcurrentHashMap();

    public c(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
        this.f149514a = null;
        this.f149514a = v0Var;
    }

    public final com.tencent.mm.modeltalkroom.MultiTalkGroup a(com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup = new com.tencent.mm.modeltalkroom.MultiTalkGroup();
        multiTalkGroup.f71607e = "" + c0Var.f149518b;
        java.lang.String str = c0Var.f149520d;
        multiTalkGroup.f71608f = str;
        java.lang.String str2 = c0Var.f149522f;
        multiTalkGroup.f71610h = str2 != null ? str2 : "";
        multiTalkGroup.f71606d = str;
        java.util.ArrayList arrayList = c0Var.f149521e;
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
                com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = new com.tencent.mm.modeltalkroom.MultiTalkGroupMember();
                multiTalkGroupMember.f71612d = wVar.f149842c;
                multiTalkGroupMember.f71613e = wVar.f149843d;
                multiTalkGroupMember.f71615g = 0;
                multiTalkGroupMember.f71614f = 20;
                int i17 = wVar.f149844e;
                if (i17 == 1) {
                    multiTalkGroupMember.f71614f = 10;
                }
                if (i17 == 2 || i17 == 3) {
                    multiTalkGroupMember.f71614f = 1;
                }
                multiTalkGroupMember.f71616h = (int) 0;
                multiTalkGroup.f71611i.add(multiTalkGroupMember);
            }
        }
        return multiTalkGroup;
    }

    public void b(com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.d(this, c0Var));
    }

    public void c(int i17, java.lang.String str, byte[] bArr) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.m(this, i17, str, bArr));
    }

    public void d(r45.k07 k07Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onMultiTalkBannerChange:%s, status:%d, banner seq:%d", k07Var.f378276d, java.lang.Integer.valueOf(k07Var.f378281i), java.lang.Long.valueOf(k07Var.f378280h));
        java.lang.String str = k07Var.f378276d;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            int i17 = 2;
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILink2MtCallBack", "userName is null");
                return;
            }
            java.lang.String str3 = k07Var.f378282m;
            p21.j y07 = com.tencent.mm.plugin.multitalk.model.e3.Ni().y0(str);
            boolean z17 = false;
            boolean z18 = y07 != null;
            int i18 = k07Var.f378281i;
            if (i18 != 0 && y07 != null) {
                long j17 = y07.field_ilinkRoomId;
                if (j17 != 0) {
                    long j18 = k07Var.f378277e;
                    if (j18 != j17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Ignore a banner msg that roomid not mathced wxgroupid %s roomid %d cached roomid %d", str, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(y07.field_ilinkRoomId));
                        return;
                    }
                    i17 = 2;
                }
            }
            if (i18 == i17 && !z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Ignore a banner msg change without banner wxgroupid %s roomid %d seq %d", str, java.lang.Long.valueOf(k07Var.f378277e), java.lang.Long.valueOf(k07Var.f378280h));
                return;
            }
            java.util.Map map = this.f149515b;
            try {
                if (!((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) || k07Var.f378280h >= ((java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(str)).longValue()) {
                    ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(k07Var.f378280h));
                } else {
                    int i19 = k07Var.f378281i;
                    if (i19 == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Ignore a banner msg that expired wxgroupid %s roomid %d seq %d cached seq %d", str, java.lang.Long.valueOf(k07Var.f378277e), java.lang.Long.valueOf(k07Var.f378280h), ((java.util.concurrent.ConcurrentHashMap) map).get(str));
                        return;
                    } else if (i19 == 1 && map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
                        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "remove bannerMsgTimeMap success at begin");
                    }
                }
                if ((k07Var.f378281i == 0 || k07Var.f378279g.size() < 2) && z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "get WxVoiceBannerEnd,dismiss bar!");
                    java.util.LinkedList linkedList = com.tencent.mm.plugin.multitalk.model.e3.Vi().f149910h;
                    if (linkedList != null) {
                        z17 = linkedList.contains(str);
                    }
                    if (!z17 && com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().contains(str) && com.tencent.mm.plugin.multitalk.model.e3.Vi().Th(str, str2)) {
                        com.tencent.mm.plugin.multitalk.model.e3.Ri().i(str);
                    }
                    com.tencent.mm.plugin.multitalk.model.e3.Ri().k(str, java.lang.String.valueOf(k07Var.f378277e));
                    com.tencent.mm.plugin.multitalk.model.v0 Ri = com.tencent.mm.plugin.multitalk.model.e3.Ri();
                    Ri.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "removeCurrentMTSDKMode groupid:%s", str);
                    java.util.HashMap hashMap = Ri.W;
                    if (hashMap != null && hashMap.containsKey(str)) {
                        hashMap.remove(str);
                    }
                    com.tencent.mm.plugin.multitalk.model.e3.Vi().J4(str);
                    com.tencent.mm.plugin.multitalk.model.d2 Vi = com.tencent.mm.plugin.multitalk.model.e3.Vi();
                    java.util.LinkedList linkedList2 = Vi.f149910h;
                    if (linkedList2 == null) {
                        Vi.f149910h = new java.util.LinkedList();
                    } else {
                        linkedList2.remove(str);
                    }
                    com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().remove(str);
                    if (map == null || ((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
                        return;
                    }
                    ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "remove bannerMsgTimeMap success at end");
                    return;
                }
                int i27 = k07Var.f378281i;
                if (i27 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "The count of banner member is %d, groupid[%s]", java.lang.Integer.valueOf(k07Var.f378279g.size()), str);
                    java.util.Iterator it = k07Var.f378279g.iterator();
                    boolean z19 = false;
                    java.lang.String str4 = "";
                    while (it.hasNext()) {
                        r45.z07 z07Var = (r45.z07) it.next();
                        if (z07Var.f391576d.f390689d.equals(str2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Somebody invite me! username[%s]", "");
                            z19 = true;
                        } else {
                            str4 = str4 + z07Var.f391576d.f390689d + ",";
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "memberUserNames :" + str4);
                    if (z19) {
                        com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().contains(str);
                    } else {
                        com.tencent.mm.plugin.multitalk.model.d2 Vi2 = com.tencent.mm.plugin.multitalk.model.e3.Vi();
                        java.util.LinkedList linkedList3 = Vi2.f149910h;
                        if (linkedList3 == null) {
                            Vi2.f149910h = new java.util.LinkedList();
                        } else {
                            linkedList3.remove(str);
                        }
                        com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().remove(str);
                    }
                    if (!z18) {
                        if (str2.equals(str3)) {
                            com.tencent.mm.plugin.multitalk.model.e3.Ri().l(str, str3, false, false);
                        } else if (z19) {
                            com.tencent.mm.plugin.multitalk.model.e3.Ri().l(str, str3, false, false);
                        } else {
                            com.tencent.mm.plugin.multitalk.model.e3.Ri().l(str, str3, true, false);
                        }
                    }
                    com.tencent.mm.plugin.multitalk.model.e3.Vi().Ni(str, k07Var);
                    return;
                }
                if (i27 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "WxVoiceBannerMemChange!2,member size : " + k07Var.f378279g.size());
                    java.util.Iterator it6 = k07Var.f378279g.iterator();
                    boolean z27 = false;
                    java.lang.String str5 = "";
                    while (it6.hasNext()) {
                        r45.z07 z07Var2 = (r45.z07) it6.next();
                        if (z07Var2.f391576d.f390689d.equals(str2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "Somebody invite me! username[%s]", "");
                            z27 = true;
                        } else {
                            str5 = str5 + z07Var2.f391576d.f390689d + ",";
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "memberUserNames :" + str5);
                    if (z27) {
                        com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().contains(str);
                    } else {
                        java.util.LinkedList linkedList4 = com.tencent.mm.plugin.multitalk.model.e3.Vi().f149910h;
                        if (!(linkedList4 == null ? false : linkedList4.contains(str)) && com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().contains(str) && com.tencent.mm.plugin.multitalk.model.e3.Vi().Th(str, str2)) {
                            com.tencent.mm.plugin.multitalk.model.e3.Ri().i(str);
                        }
                        com.tencent.mm.plugin.multitalk.model.d2 Vi3 = com.tencent.mm.plugin.multitalk.model.e3.Vi();
                        java.util.LinkedList linkedList5 = Vi3.f149910h;
                        if (linkedList5 == null) {
                            Vi3.f149910h = new java.util.LinkedList();
                        } else {
                            linkedList5.remove(str);
                        }
                        com.tencent.mm.plugin.multitalk.model.e3.Vi().Ai().remove(str);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "WxVoiceBannerMemChange setWxUinAndUsrName:");
                    com.tencent.mm.plugin.multitalk.model.e3.Vi().Ri(str, k07Var);
                }
            } catch (java.lang.Exception e17) {
                e = e17;
                com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILink2MtCallBack", "parse  bannerinfo  failure! xml" + e.toString());
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }

    public void e(com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var, java.util.LinkedList linkedList) {
        if (this.f149514a != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (linkedList != null && linkedList.size() > 0) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.o70 o70Var = (r45.o70) it.next();
                    java.lang.String d17 = c0Var.d(o70Var.f382000d);
                    if (d17 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onVideoGroupMemberChange: mid:%d NOT exist!!!", java.lang.Integer.valueOf(o70Var.f382000d));
                    } else {
                        com.tencent.mm.modeltalkroom.VideoGroupMember videoGroupMember = new com.tencent.mm.modeltalkroom.VideoGroupMember();
                        int i17 = o70Var.f382000d;
                        videoGroupMember.f71618d = i17;
                        videoGroupMember.f71620f = i17;
                        videoGroupMember.f71621g = 1;
                        int i18 = o70Var.f382001e;
                        if ((i18 & 2) != 0) {
                            videoGroupMember.f71621g = 3;
                        }
                        videoGroupMember.f71619e = d17;
                        videoGroupMember.f71622h = 100;
                        if ((i18 & 4) != 0) {
                            videoGroupMember.f71622h = 101;
                        } else if ((i18 & 8) != 0) {
                            videoGroupMember.f71622h = 102;
                        } else {
                            videoGroupMember.f71622h = 104;
                        }
                        arrayList.add(videoGroupMember);
                        c0Var.g(o70Var.f382000d, videoGroupMember.f71622h);
                    }
                }
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.f(this, arrayList));
        }
    }

    public void f(java.util.LinkedList linkedList) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = (java.lang.String) linkedList.getFirst();
        ((sg3.a) v0Var).getClass();
        sb6.append(c01.a2.e(str));
        for (java.lang.String str2 : linkedList.subList(1, linkedList.size())) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str2);
            sb6.append("、");
            sb6.append(e17);
        }
        final java.lang.String format = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f493315lo4), sb6);
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.multitalk.ilinkservice.c$$a
            @Override // java.lang.Runnable
            public final void run() {
                db5.t7.j(com.tencent.mm.sdk.platformtools.x2.f193071a, format);
            }
        });
    }
}
