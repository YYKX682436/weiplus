package vn0;

/* loaded from: classes3.dex */
public class d extends com.tencent.trtc.TRTCCloudListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f438182a;

    public d(vn0.f fVar) {
        this.f438182a = new java.lang.ref.WeakReference(fVar);
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onAudioEffectFinished(int i17, int i18) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onAudioRouteChanged(int i17, int i18) {
        om2.i iVar;
        kotlinx.coroutines.flow.j2 j2Var;
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onAudioRouteChanged: newRoute = " + i17 + " oldRoute = " + i18);
        if (((vn0.f) this.f438182a.get()) == null || fn0.g.f264196b == null) {
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        om2.g gVar = (om2.g) efVar.i(om2.g.class);
        if (gVar != null && gVar.S6()) {
            om2.e eVar = (om2.e) efVar.i(om2.e.class);
            om2.e eVar2 = eVar != null ? (om2.e) eVar.business(om2.e.class) : null;
            if (eVar2 != null) {
                eVar2.f346296o = false;
            }
            om2.e eVar3 = (om2.e) efVar.i(om2.e.class);
            if (eVar3 != null && (j2Var = eVar3.f346298q) != null) {
                ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Integer.valueOf(i17));
            }
            om2.g gVar2 = (om2.g) efVar.i(om2.g.class);
            if (gVar2 == null || (iVar = gVar2.f346307n) == null) {
                return;
            }
            mm2.a aVar = iVar.f346335o;
            mm2.a aVar2 = iVar.f346334n;
            mm2.a aVar3 = iVar.f346332l;
            mm2.a aVar4 = iVar.f346336p;
            mm2.a aVar5 = iVar.f346333m;
            if (i17 == 0) {
                aVar.c();
                mm2.a.b(aVar4, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar3, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 == 1) {
                aVar4.c();
                mm2.a.b(aVar, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar3, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 == 2) {
                aVar5.c();
                mm2.a.b(aVar4, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar3, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 == 3) {
                aVar3.c();
                mm2.a.b(aVar4, false, 1, null);
                mm2.a.b(aVar5, false, 1, null);
                mm2.a.b(aVar, false, 1, null);
                mm2.a.b(aVar2, false, 1, null);
                return;
            }
            if (i17 != 4) {
                return;
            }
            aVar2.c();
            mm2.a.b(aVar4, false, 1, null);
            mm2.a.b(aVar5, false, 1, null);
            mm2.a.b(aVar3, false, 1, null);
            mm2.a.b(aVar, false, 1, null);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectOtherRoom(java.lang.String str, int i17, java.lang.String str2) {
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onConnectOtherRoom, userID:" + str + ", err:" + i17 + ", errMsg:$" + str2);
            if (i17 == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("KEY_USERID", str);
                hn0.i iVar = w0Var.A;
                if (iVar != null) {
                    iVar.callback(8, bundle);
                }
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectionLost() {
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "onConnectionLost");
            hn0.i iVar = ((tn0.w0) fVar).A;
            if (iVar != null) {
                iVar.callback(31, null);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onConnectionRecovery() {
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onConnectionRecovery");
            hn0.i iVar = w0Var.A;
            if (iVar != null) {
                iVar.callback(32, null);
            }
            zn0.a0 U = w0Var.U();
            U.getClass();
            com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "onConnectionRecovery");
            zn0.s sVar = U.f474321y;
            if (sVar != null) {
                pm0.v.X(new zn0.n(sVar));
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onDisConnectOtherRoom(int i17, java.lang.String str) {
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onDisConnectOtherRoom, err:" + i17 + ", errMsg:" + str);
            if (i17 == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                hn0.i iVar = w0Var.A;
                if (iVar != null) {
                    iVar.callback(9, bundle);
                }
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onEnterRoom(long j17) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onEnterRoom: elapsed = " + j17);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            fVar.e(j17);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onError(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onError: errCode = " + i17 + " errMsg = " + str);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            fVar.p(i17, str, bundle);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onExitRoom(int i17) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onExitRoom: reason = " + i17);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            fVar.a(i17);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onFirstVideoFrame(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onFirstVideoFrame: userId = " + str + " streamType = " + i17 + " width = " + i18 + " height = " + i19);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            fVar.c(str, i17, i18, i19);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onNetworkQuality(com.tencent.trtc.TRTCCloudDef.TRTCQuality tRTCQuality, java.util.ArrayList arrayList) {
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            int i17 = tRTCQuality != null ? tRTCQuality.quality : 0;
            if (i17 != 0) {
                i17 = i17 <= 2 ? 0 : i17 <= 4 ? 1 : i17 < 6 ? 2 : 3;
            }
            w0Var.R = tRTCQuality != null ? tRTCQuality.quality : 0;
            kn0.p pVar = w0Var.D;
            int i18 = pVar.f309590j;
            if (i18 != 3 && i17 == 3) {
                w0Var.y(1);
            } else if (i18 == 3 && i17 != 3) {
                w0Var.n0(1);
            }
            if (pVar.f309590j != i17) {
                pVar.f309590j = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onNetworkQuality, local:" + i17);
            }
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (pVar.f309591k != netType) {
                pVar.f309591k = netType;
            }
            hn0.i iVar = w0Var.A;
            if (iVar != null) {
                hn0.i.a(iVar, 3, null, 2, null);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvCustomCmdMsg(java.lang.String str, int i17, int i18, byte[] bArr) {
        if (((vn0.f) this.f438182a.get()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onRecvCustomCmdMsg userId:" + str);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRecvSEIMsg(java.lang.String str, byte[] bArr) {
        kn0.g gVar;
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            kn0.i iVar = w0Var.C;
            int i17 = (iVar == null || (gVar = iVar.f309558b) == null) ? 0 : gVar.f309547n;
            if (i17 > 0) {
                kotlinx.coroutines.l.d(w0Var.Y, null, null, new tn0.g(i17, bArr, w0Var, null), 3, null);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRemoteUserEnterRoom(java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onRemoteUserEnterRoom: userId = " + str);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            zn0.a0 U = w0Var.U();
            U.getClass();
            if (str == null || str.isEmpty()) {
                com.tencent.mars.xlog.Log.w("TRTCRemoteUserManager", "addRemoteUserInRoom: userId is null or empty");
            } else {
                java.util.concurrent.ConcurrentHashMap.KeySetView keySetView = (java.util.concurrent.ConcurrentHashMap.KeySetView) U.F;
                keySetView.add(str);
                com.tencent.mars.xlog.Log.i("TRTCRemoteUserManager", "addRemoteUserInRoom: userId=" + str + ", size=" + keySetView.size());
            }
            java.lang.String debugText = "[sdk]onRemoteUserEnterRoom:" + str;
            kotlin.jvm.internal.o.g(debugText, "debugText");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
            if (fn0.g.f264196b != null && zl2.r4.f473950a.x1()) {
                fj2.s sVar = fj2.s.f263183a;
                java.lang.String str2 = str == null ? "" : str;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                sVar.f(6, str2, r26.i0.t(jSONObject2, ",", ";", false));
                mm2.y2 y2Var = (mm2.y2) dk2.ef.f233372a.i(mm2.y2.class);
                if (y2Var != null) {
                    java.util.List list = y2Var.f329569v;
                    kotlin.jvm.internal.o.f(list, "<get-reportAudienceMicUserList>(...)");
                    synchronized (list) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            obj = null;
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, str)) {
                                    break;
                                }
                            }
                        }
                    }
                    if (((km2.q) obj2) != null) {
                        fj2.s.f263183a.f(4, str == null ? "" : str, "");
                    }
                    java.util.List list2 = y2Var.f329570w;
                    kotlin.jvm.internal.o.f(list2, "<get-reportAnchorMicUserList>(...)");
                    synchronized (list2) {
                        java.util.Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it6.next();
                            if (kotlin.jvm.internal.o.b(((km2.q) next).f309170a, str)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    if (((km2.q) obj) != null) {
                        fj2.s.f263183a.f(2, str == null ? "" : str, "");
                    }
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("live_user_id", str);
            hn0.i iVar = w0Var.A;
            if (iVar != null) {
                iVar.callback(36, bundle);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onRemoteUserLeaveRoom(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onRemoteUserLeaveRoom: userId = " + str + " reason = " + i17);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            fVar.l(str, i17);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onStatistics(com.tencent.trtc.TRTCStatistics tRTCStatistics) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList;
        com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics;
        java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList2;
        com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics2;
        java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList3;
        com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics3;
        java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList4;
        com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics4;
        java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList5;
        com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics5;
        java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList6;
        com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics6;
        kn0.g gVar;
        kn0.g gVar2;
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            android.os.Bundle bundle = new android.os.Bundle();
            jz5.g gVar3 = ko0.p0.f309896a;
            if (tRTCStatistics != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("appCpu", tRTCStatistics.appCpu);
                jSONObject.put("systemCpu", tRTCStatistics.systemCpu);
                jSONObject.put("rtt", tRTCStatistics.rtt);
                jSONObject.put("upLoss", tRTCStatistics.upLoss);
                jSONObject.put("downLoss", tRTCStatistics.downLoss);
                jSONObject.put("sendBytes", tRTCStatistics.sendBytes);
                jSONObject.put("receiveBytes", tRTCStatistics.receiveBytes);
                java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> arrayList7 = tRTCStatistics.localArray;
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                if (arrayList7 != null) {
                    for (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics7 : arrayList7) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("width", tRTCLocalStatistics7.width);
                        jSONObject2.put("height", tRTCLocalStatistics7.height);
                        jSONObject2.put("frameRate", tRTCLocalStatistics7.frameRate);
                        jSONObject2.put("videoBitrate", tRTCLocalStatistics7.videoBitrate);
                        jSONObject2.put("audioSampleRate", tRTCLocalStatistics7.audioSampleRate);
                        jSONObject2.put("audioBitrate", tRTCLocalStatistics7.audioBitrate);
                        jSONObject2.put("streamType", tRTCLocalStatistics7.streamType);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("LocalStatistics", jSONArray);
                java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics> arrayList8 = tRTCStatistics.remoteArray;
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                if (arrayList8 != null) {
                    for (java.util.Iterator it = arrayList8.iterator(); it.hasNext(); it = it) {
                        com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = (com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics) it.next();
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("userId", tRTCRemoteStatistics.userId);
                        jSONObject3.put("finalLoss", tRTCRemoteStatistics.finalLoss);
                        jSONObject3.put("width", tRTCRemoteStatistics.width);
                        jSONObject3.put("height", tRTCRemoteStatistics.height);
                        jSONObject3.put("frameRate", tRTCRemoteStatistics.frameRate);
                        jSONObject3.put("videoBitrate", tRTCRemoteStatistics.videoBitrate);
                        jSONObject3.put("audioSampleRate", tRTCRemoteStatistics.audioSampleRate);
                        jSONObject3.put("audioBitrate", tRTCRemoteStatistics.audioBitrate);
                        jSONObject3.put("streamType", tRTCRemoteStatistics.streamType);
                        jSONArray2.put(jSONObject3);
                    }
                }
                jSONObject.put("remoteStatistics", jSONArray2);
                str = jSONObject.toString();
            } else {
                str = null;
            }
            bundle.putString("DUMP_STATISTIC", str);
            kn0.i iVar = w0Var.C;
            bundle.putLong("NET_STATUS_LIVE_ID", (iVar == null || (gVar2 = iVar.f309558b) == null) ? 0L : gVar2.f309535b);
            bundle.putInt("NET_STATUS_ROLE", 0);
            bundle.putInt("NET_STATUS_MODE", 0);
            bundle.putLong("NET_STATUS_TIMESTAMP", java.lang.System.currentTimeMillis());
            kn0.i iVar2 = w0Var.C;
            bundle.putLong("NET_STATUS_START_TIME", (iVar2 == null || (gVar = iVar2.f309558b) == null) ? 0L : gVar.f309546m);
            if (tRTCStatistics == null || (str2 = java.lang.Integer.valueOf(tRTCStatistics.appCpu).toString()) == null) {
                str2 = "";
            }
            bundle.putString(com.tencent.rtmp.TXLiveConstants.NET_STATUS_CPU_USAGE, str2);
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_WIDTH, (tRTCStatistics == null || (arrayList6 = tRTCStatistics.localArray) == null || (tRTCLocalStatistics6 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) kz5.n0.Z(arrayList6)) == null) ? 0 : tRTCLocalStatistics6.width);
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_HEIGHT, (tRTCStatistics == null || (arrayList5 = tRTCStatistics.localArray) == null || (tRTCLocalStatistics5 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) kz5.n0.Z(arrayList5)) == null) ? 0 : tRTCLocalStatistics5.height);
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_BITRATE, (tRTCStatistics == null || (arrayList4 = tRTCStatistics.localArray) == null || (tRTCLocalStatistics4 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) kz5.n0.Z(arrayList4)) == null) ? 0 : tRTCLocalStatistics4.videoBitrate);
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_AUDIO_BITRATE, (tRTCStatistics == null || (arrayList3 = tRTCStatistics.localArray) == null || (tRTCLocalStatistics3 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) kz5.n0.Z(arrayList3)) == null) ? 0 : tRTCLocalStatistics3.audioBitrate);
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_VIDEO_FPS, (tRTCStatistics == null || (arrayList2 = tRTCStatistics.localArray) == null || (tRTCLocalStatistics2 = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) kz5.n0.Z(arrayList2)) == null) ? 0 : tRTCLocalStatistics2.frameRate);
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_NET_SPEED, ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2));
            bundle.putInt("NET_STATUS_AUDIO_STATE", (tRTCStatistics == null || (arrayList = tRTCStatistics.localArray) == null || (tRTCLocalStatistics = (com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics) kz5.n0.Z(arrayList)) == null) ? 0 : tRTCLocalStatistics.audioCaptureState);
            bundle.putInt("NET_STATUS_RTT", tRTCStatistics != null ? tRTCStatistics.rtt : 0);
            bundle.putInt("NET_STATUS_UP_LOSS", tRTCStatistics != null ? tRTCStatistics.upLoss : 0);
            bundle.putInt("NET_STATUS_DOWN_LOSS", tRTCStatistics != null ? tRTCStatistics.downLoss : 0);
            bundle.putLong("NET_STATUS_SEND_BYTES", tRTCStatistics != null ? tRTCStatistics.sendBytes : 0L);
            bundle.putLong("NET_STATUS_RECEIVE_BYTES", tRTCStatistics != null ? tRTCStatistics.receiveBytes : 0L);
            bundle.putInt("NET_STATUS_NET_TYPE", com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
            bundle.putInt(com.tencent.rtmp.TXLiveConstants.NET_STATUS_QUALITY_LEVEL, w0Var.R);
            hn0.i iVar3 = w0Var.A;
            if (iVar3 != null) {
                iVar3.callback(12, bundle);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onSwitchRole(int i17, java.lang.String str) {
        super.onSwitchRole(i17, str);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "onSwitchRole, errCode:" + i17 + ", errCode:" + str);
            tn0.x0 x0Var = w0Var.f420763l1;
            if (x0Var != null) {
                vn0.e eVar = w0Var.f420764m;
                x0Var.q1(eVar != null ? eVar.f438185c : 0, i17, str);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onTryToReconnect() {
        if (((vn0.f) this.f438182a.get()) != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiveCore", "onTryToReconnect");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    @Override // com.tencent.trtc.TRTCCloudListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onUserAudioAvailable(java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn0.d.onUserAudioAvailable(java.lang.String, boolean):void");
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserSubStreamAvailable(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onUserSubStreamAvailable: userId = " + str + " available = " + z17);
        if (((vn0.f) this.f438182a.get()) != null) {
            java.lang.String debugText = "onUserSubStreamAvailable:" + str + ", available:" + z17;
            kotlin.jvm.internal.o.g(debugText, "debugText");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVideoAvailable(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onUserVideoAvailable: userId = " + str + " available = " + z17);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            if (z17) {
                zn0.a0 U = w0Var.U();
                U.getClass();
                if (!((str == null || str.isEmpty()) ? false : ((java.util.concurrent.ConcurrentHashMap.KeySetView) U.F).contains(str))) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.LiveCore", "onUserVideoAvailable but not in room，userId:" + str);
                    return;
                }
            }
            fn0.g gVar = fn0.g.f264195a;
            if (fn0.g.f264196b != null) {
                fj2.s sVar = fj2.s.f263183a;
                java.lang.String str2 = str == null ? "" : str;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", z17 ? 5 : 6);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                sVar.f(6, str2, r26.i0.t(jSONObject2, ",", ";", false));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVideoAvailable uid:");
            sb6.append(str);
            sb6.append(" available:");
            sb6.append(z17);
            sb6.append(", isAnchor:");
            boolean z18 = w0Var.f420757d;
            sb6.append(z18);
            java.lang.String debugText = sb6.toString();
            kotlin.jvm.internal.o.g(debugText, "debugText");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", debugText);
            if (!z17 || android.text.TextUtils.isEmpty(str)) {
                zn0.a0 U2 = w0Var.U();
                U2.getClass();
                zn0.v d17 = zn0.x.f474414a.d(str);
                if (d17 != null) {
                    d17.f474408f = false;
                }
                if (gVar.f()) {
                    if (U2.f474299c) {
                        U2.r(str);
                    } else if (!str.equals(U2.f474302f)) {
                        U2.f474298b.stopRemoteView(str);
                    }
                    U2.q(str, 0);
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("live_user_id", str);
                hn0.i iVar = w0Var.A;
                if (iVar != null) {
                    iVar.callback(5, bundle);
                }
            } else {
                zn0.a0 U3 = w0Var.U();
                com.tencent.mm.live.core.view.LivePreviewView livePreviewView = w0Var.f420774u;
                U3.n(str, 0, livePreviewView != null ? livePreviewView.c(str, 0) : null);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("live_user_id", str);
                hn0.i iVar2 = w0Var.A;
                if (iVar2 != null) {
                    iVar2.callback(0, bundle2);
                }
            }
            if (!z18) {
                com.tencent.mm.sdk.platformtools.t8.D0(w0Var.D.f309586f, str);
            }
            if (z18) {
                boolean z19 = z17 || gVar.f();
                int i17 = w0Var.U;
                if (i17 == 0) {
                    w0Var.U().s();
                    return;
                }
                if (i17 == 1 && z19) {
                    w0Var.M0(false);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.LiveCore", "invalid live scene: " + w0Var.U);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onUserVoiceVolume(java.util.ArrayList arrayList, int i17) {
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            fVar.q(arrayList, i17);
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener
    public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("TRTCCloudListenerImpl", "onWarning: %d, warningMsg: %s", java.lang.Integer.valueOf(i17), str);
        vn0.f fVar = (vn0.f) this.f438182a.get();
        if (fVar != null) {
            tn0.w0 w0Var = (tn0.w0) fVar;
            if (i17 == 1104) {
                if (bundle != null) {
                    bundle.getString(com.tencent.rtmp.TXLiveConstants.EVT_DESCRIPTION);
                }
                int i18 = bundle != null ? bundle.getInt("type") : 0;
                boolean z17 = i18 == 1;
                java.lang.String debugText = "TRTC codec change! type:[1104], enctype:" + i18 + ", msg:" + str;
                kotlin.jvm.internal.o.g(debugText, "debugText");
                com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreError", debugText);
                if (w0Var.f420757d) {
                    vn0.c cVar = vn0.b.f438174a;
                    boolean z18 = cVar.d().f455444t;
                    boolean z19 = cVar.d().f455445u;
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "TRTC codec change! hevcenable:" + z18 + ", force265Mixing:" + z19);
                    jz5.g gVar = ko0.p0.f309896a;
                    java.lang.String id6 = java.lang.String.valueOf(w0Var.hashCode());
                    kotlin.jvm.internal.o.g(id6, "id");
                    ko0.t tVar = ko0.t.f309903a;
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    if (!z18 || z17 == z18) {
                        return;
                    }
                    cVar.d().f455444t = z17;
                    w0Var.Q0();
                    if (z19) {
                        w0Var.U().s();
                    }
                }
            }
        }
    }
}
