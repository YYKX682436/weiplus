package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class i0 {
    public i0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String userName, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(userName, "userName");
        g().put(userName, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addFinderFeedId", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (str == null || kotlin.jvm.internal.o.b(str, "")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFinderFeedId", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            return;
        }
        dx1.f fVar = dx1.g.f244489a;
        java.lang.Object d17 = fVar.d("SnsPublishProcess", "source_");
        if (kotlin.jvm.internal.o.b(d17, 5L) || kotlin.jvm.internal.o.b(d17, 14L) || kotlin.jvm.internal.o.b(d17, 15L)) {
            fVar.i("SnsPublishProcess", "finderFeedid", str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFinderFeedId", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addTraceFromUIAction", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        int i18 = i17 != 14 ? i17 != 17 ? -1 : 8 : 7;
        if (i18 != -1 && i18 == 8) {
            dx1.f fVar = dx1.g.f244489a;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            bx1.u uVar = bx1.u.f36311f;
            fVar.j("SnsPublishProcess", "actionTrace_", valueOf, uVar);
            fVar.j("SnsPublishProcess", "actionTrace_", 5, uVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addTraceFromUIAction", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (str != null) {
            i(str, com.tencent.mm.plugin.sns.statistics.c0.f164842d);
        }
        dx1.f fVar = dx1.g.f244489a;
        if (((dx1.c) dx1.g.f244490b.get("SnsPublishProcess")) == null) {
            java.lang.String d17 = kotlin.jvm.internal.i0.a(com.tencent.mm.autogen.mmdata.rpt.SnsPublishProcessStruct.class).d();
            kotlin.jvm.internal.o.d(d17);
            fVar.g("SnsPublishProcess", d17);
            java.lang.String l17 = ca4.z0.l();
            kotlin.jvm.internal.o.d(l17);
            fVar.i("SnsPublishProcess", "sessionid_", l17);
            nu3.i.f340218a.n("moment_sessionid_", l17);
        }
        java.util.Iterator it = g().entrySet().iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue();
            if (intValue == 1) {
                i17++;
            } else if (intValue == 2) {
                i18++;
            } else if (intValue == 3) {
                i19++;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("singlechat", i17);
        jSONObject.put("groupchat", i18);
        jSONObject.put("contact", i19);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String u17 = r26.i0.u(jSONObject2, ',', ';', false, 4, null);
        dx1.f fVar2 = dx1.g.f244489a;
        fVar2.i("SnsPublishProcess", "withFriendInfo", u17);
        dx1.f.b(fVar2, "SnsPublishProcess", false, false, 6, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void e(java.util.ArrayList imageList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("firstIntoEditPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(imageList, "imageList");
        dx1.f fVar = dx1.g.f244489a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        int i17 = 0;
        if (com.tencent.mm.sdk.platformtools.t8.L0(imageList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        } else {
            java.util.Iterator it = imageList.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.plugin.sns.statistics.j0.f164861a.j((java.lang.String) it.next())) {
                    i17++;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }
        fVar.i("SnsPublishProcess", "firstEditPageShotMedia", java.lang.Integer.valueOf(i17));
        dx1.g.f244489a.i("SnsPublishProcess", "firstEditPageMedia", java.lang.Integer.valueOf(imageList.size()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("firstIntoEditPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void f(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(activity, "activity");
        dx1.g.f244489a.i("SnsPublishProcess", "fromPage", java.lang.Integer.valueOf(activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI ? 1 : activity instanceof com.tencent.mm.plugin.sns.ui.SnsUserUI ? 2 : 0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final java.util.HashMap g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContactTypeList$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.statistics.j0.f164863c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContactTypeList$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        return hashMap;
    }

    public final java.lang.String h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        java.lang.String str = com.tencent.mm.plugin.sns.statistics.j0.f164864d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (str.length() == 0) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        return str;
    }

    public final void i(java.lang.String id6, yz5.l callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSecData", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(16, id6, wa4.q.class, new com.tencent.mm.plugin.sns.statistics.d0(id6, callback));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSecData", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final boolean j(java.lang.String path) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCameraPic", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(path, "path");
        boolean B = r26.n0.B(path, "photoEdited_", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCameraPic", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        return B;
    }

    public final void k(java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(userName, "userName");
        g().remove(userName);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void l(org.json.JSONObject list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContactTypeListJSON", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(list, "list");
        g().clear();
        java.util.Iterator<java.lang.String> keys = list.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.g().put(next, java.lang.Integer.valueOf(list.getInt(next)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContactTypeListJSON", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void m(java.util.List paths) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(paths, "paths");
        dx1.g.f244489a.q("SnsPublishProcess", "mediaMD5_", new com.tencent.mm.plugin.sns.statistics.g0(paths));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.tencent.mm.plugin.sns.statistics.j0.f164864d = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void o(int i17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, boolean z47, boolean z48, boolean z49) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (z38) {
            j17 = 12;
        } else if (z37) {
            j17 = 9;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            boolean z57 = com.tencent.mm.plugin.sns.statistics.j0.f164862b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            if (z57) {
                j17 = 4;
            } else {
                j17 = 7;
                if (!z29) {
                    if (z19) {
                        j17 = 6;
                    } else if (z17) {
                        j17 = 1;
                    } else if (z18) {
                        j17 = 2;
                    } else if (i17 == 9 || i17 == 8) {
                        j17 = 3;
                    } else if (z49) {
                        j17 = 16;
                    } else if (i17 != 14 || z27) {
                        j17 = 5;
                        if (!z28) {
                            if (z39) {
                                j17 = 13;
                            } else if (z47) {
                                j17 = 14;
                            } else if (z48) {
                                j17 = 15;
                            }
                        }
                    }
                }
            }
        }
        dx1.f fVar = dx1.g.f244489a;
        if (!kotlin.jvm.internal.o.b(fVar.d("SnsPublishProcess", "source_"), 10L)) {
            fVar.i("SnsPublishProcess", "source_", java.lang.Long.valueOf(j17));
        }
        if (!z19) {
            g().clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void p(wa4.q obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateWithSave", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReportKt");
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(16, obj.f444275d, obj, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReportKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateWithSave", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }
}
