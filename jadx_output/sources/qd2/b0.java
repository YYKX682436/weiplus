package qd2;

/* loaded from: classes2.dex */
public final class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f361702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f361703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f361704c;

    public b0(android.content.Context context, int i17, int i18) {
        this.f361702a = context;
        this.f361703b = i17;
        this.f361704c = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.List] */
    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "getFinderObject result errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        int i18 = fVar.f70615a;
        android.content.Context context = this.f361702a;
        if (i18 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                qd2.d0 d0Var = qd2.d0.f361714a;
                android.content.Context context2 = this.f361702a;
                int i19 = this.f361703b;
                int i27 = this.f361704c;
                long id6 = finderObject.getId();
                int j17 = hc2.o0.j(finderObject);
                if (4 != j17) {
                    com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] return due to not video, mediaType:" + j17 + " feedId:" + pm0.v.u(id6));
                    d0Var.b(context2, true);
                } else {
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                    java.util.LinkedList h17 = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : bu2.z.h(media);
                    if (h17 == null || h17.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] return due to has no video, feedId=".concat(pm0.v.u(id6)));
                        d0Var.b(context2, true);
                    } else {
                        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(h17);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[downloadVideo] before filter, mediaSpecs size:");
                        sb6.append(mb4Var.getList(15).size());
                        sb6.append(" list:");
                        java.util.LinkedList list = mb4Var.getList(15);
                        java.lang.String str5 = "getSpec(...)";
                        kotlin.jvm.internal.o.f(list, "getSpec(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            str = " bitRate:";
                            str2 = str5;
                            str3 = "[fileFormat:";
                            i17 = i27;
                            str4 = " codingFormat:";
                            if (!it.hasNext()) {
                                break;
                            }
                            r45.vf2 vf2Var = (r45.vf2) it.next();
                            arrayList.add("[fileFormat:" + vf2Var.getString(0) + " codingFormat:" + vf2Var.getString(3) + " bitRate:" + vf2Var.getInteger(2) + " ]");
                            str5 = str2;
                            it = it;
                            i27 = i17;
                            i19 = i19;
                        }
                        int i28 = i19;
                        sb6.append(arrayList);
                        sb6.append(" feedId:");
                        sb6.append(pm0.v.u(id6));
                        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", sb6.toString());
                        java.lang.String string = mb4Var.getString(9);
                        java.lang.String str6 = "";
                        if (string == null) {
                            string = "";
                        }
                        java.util.Iterator it6 = cu2.x.f222449a.d(string).iterator();
                        while (true) {
                            java.lang.String str7 = " fileSize:";
                            java.lang.String str8 = str6;
                            java.lang.String str9 = " filePath:";
                            java.lang.String str10 = str;
                            if (it6.hasNext()) {
                                so2.i3 i3Var = (so2.i3) it6.next();
                                java.util.Iterator it7 = it6;
                                java.lang.String str11 = str4;
                                com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[queryByOriginalMediaId] originMediaId:" + string + " fileFormat:" + i3Var.field_fileFormat);
                                if (i3Var.A0() && d0Var.a(i3Var.u0())) {
                                    com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] exist, originMediaId:" + string + " fileFormat:" + i3Var.field_fileFormat + " filePath:" + i3Var.u0() + " fileSize:" + o35.a.g(i3Var.u0()) + " feedId:" + pm0.v.u(id6));
                                    d0Var.c(context2, finderObject, i3Var.u0(), i28, i17);
                                    break;
                                }
                                str6 = str8;
                                str = str10;
                                it6 = it7;
                                str4 = str11;
                            } else {
                                java.lang.String str12 = str4;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.util.LinkedList list2 = mb4Var.getList(15);
                                kotlin.jvm.internal.o.f(list2, str2);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (java.lang.Object obj2 : list2) {
                                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = finderObject;
                                    android.content.Context context3 = context2;
                                    java.lang.String str13 = str7;
                                    if (kotlin.jvm.internal.o.b(((r45.vf2) obj2).getString(3), "h265")) {
                                        arrayList3.add(obj2);
                                    }
                                    finderObject = finderObject2;
                                    context2 = context3;
                                    str7 = str13;
                                }
                                android.content.Context context4 = context2;
                                com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = finderObject;
                                java.lang.String str14 = str7;
                                boolean z17 = !arrayList3.isEmpty();
                                java.util.ArrayList arrayList4 = arrayList3;
                                if (!z17) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    for (java.lang.Object obj3 : list2) {
                                        if (kotlin.jvm.internal.o.b(((r45.vf2) obj3).getString(3), "h264")) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    boolean z18 = !arrayList5.isEmpty();
                                    arrayList4 = arrayList5;
                                    if (!z18) {
                                        r45.vf2 vf2Var2 = new r45.vf2();
                                        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
                                        vf2Var2.set(0, "xV0");
                                        arrayList4 = kz5.b0.c(vf2Var2);
                                    }
                                }
                                arrayList2.addAll(arrayList4);
                                if (arrayList2.size() > 1) {
                                    kz5.g0.t(arrayList2, new qd2.a0());
                                }
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[downloadVideo] after filter, mediaSpecs size:");
                                sb7.append(arrayList2.size());
                                sb7.append(" list:");
                                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                                java.util.Iterator it8 = arrayList2.iterator();
                                while (it8.hasNext()) {
                                    r45.vf2 vf2Var3 = (r45.vf2) it8.next();
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str3);
                                    java.lang.String str15 = str3;
                                    sb8.append(vf2Var3.getString(0));
                                    java.lang.String str16 = str12;
                                    sb8.append(str16);
                                    sb8.append(vf2Var3.getString(3));
                                    sb8.append(str10);
                                    sb8.append(vf2Var3.getInteger(2));
                                    sb8.append(']');
                                    arrayList6.add(sb8.toString());
                                    it8 = it8;
                                    str9 = str9;
                                    str12 = str16;
                                    str3 = str15;
                                }
                                java.lang.String str17 = str12;
                                java.lang.String str18 = str9;
                                sb7.append(arrayList6);
                                sb7.append(" feedId:");
                                sb7.append(pm0.v.u(id6));
                                com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", sb7.toString());
                                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.K0).getValue()).r()).intValue();
                                qd2.z[] zVarArr = qd2.z.f361857d;
                                r45.vf2 vf2Var4 = intValue == 2 ? (r45.vf2) kz5.n0.i0(arrayList2) : intValue == 1 ? (r45.vf2) arrayList2.get(arrayList2.size() / 2) : (r45.vf2) kz5.n0.X(arrayList2);
                                yr2.g gVar = yr2.k.X;
                                com.tencent.mm.plugin.finder.storage.y90 c17 = gVar.c(vf2Var4.getString(0));
                                java.lang.String string2 = vf2Var4.getString(0);
                                java.lang.String string3 = vf2Var4.getString(3);
                                if (string3 == null) {
                                    string3 = str8;
                                }
                                mn2.g4 g4Var = new mn2.g4(mb4Var, c17, string2, gVar.b(string3), 0, null, false, null, 240, null);
                                com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] mediaType:" + j17 + " fileFormat:" + vf2Var4.getString(0) + str17 + vf2Var4.getString(3) + "bitRate:" + vf2Var4.getInteger(2) + "} filePath:" + g4Var.getPath() + " url:" + g4Var.getUrl() + " feedId:" + pm0.v.u(id6));
                                java.lang.String path = g4Var.getPath();
                                if (d0Var.a(path)) {
                                    com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[downloadVideo] target exist, originMediaId:" + string + str18 + g4Var.getPath() + str14 + o35.a.g(path) + " feedId:" + pm0.v.u(id6));
                                    d0Var.c(context4, finderObject3, g4Var.getPath(), i28, i17);
                                } else {
                                    qd2.y yVar = new qd2.y(context4, finderObject3, i28, i17);
                                    com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject3, 0);
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic = new com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic(context4);
                                    qd2.d0.f361715b = finderVideoViewForTopic;
                                    finderVideoViewForTopic.o0(g4Var, false, com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(a17));
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic2 = qd2.d0.f361715b;
                                    if (finderVideoViewForTopic2 != null) {
                                        finderVideoViewForTopic2.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                                    }
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic3 = qd2.d0.f361715b;
                                    if (finderVideoViewForTopic3 != null) {
                                        finderVideoViewForTopic3.setIOnlineVideoProxy(new mn2.c4(new mn2.e4(0, null, 2, null), g4Var, yVar));
                                    }
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic4 = qd2.d0.f361715b;
                                    if (finderVideoViewForTopic4 != null) {
                                        finderVideoViewForTopic4.setIsShowBasicControls(false);
                                    }
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic5 = qd2.d0.f361715b;
                                    if (finderVideoViewForTopic5 != null) {
                                        finderVideoViewForTopic5.setLoop(true);
                                    }
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic6 = qd2.d0.f361715b;
                                    if (finderVideoViewForTopic6 != null) {
                                        finderVideoViewForTopic6.setMute(true);
                                    }
                                    com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic7 = qd2.d0.f361715b;
                                    if (finderVideoViewForTopic7 != null) {
                                        finderVideoViewForTopic7.start();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
                com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic8 = qd2.d0.f361715b;
                if (finderVideoViewForTopic8 != null) {
                    finderVideoViewForTopic8.stop();
                }
                qd2.d0.f361715b = null;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = qd2.d0.f361716c;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                qd2.d0.f361716c = null;
                db5.t7.makeText(context, com.tencent.mm.R.string.eqz, 0).show();
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
            com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic finderVideoViewForTopic9 = qd2.d0.f361715b;
            if (finderVideoViewForTopic9 != null) {
                finderVideoViewForTopic9.stop();
            }
            qd2.d0.f361715b = null;
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = qd2.d0.f361716c;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            qd2.d0.f361716c = null;
            db5.t7.makeText(context, com.tencent.mm.R.string.eqz, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
