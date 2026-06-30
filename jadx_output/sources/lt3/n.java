package lt3;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final lt3.n f321260a = new lt3.n();

    /* renamed from: b, reason: collision with root package name */
    public static final lt3.h f321261b = ((pc0.s2) i95.n0.c(pc0.s2.class)).Ai();

    /* renamed from: c, reason: collision with root package name */
    public static final android.graphics.Rect f321262c = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);

    /* renamed from: d, reason: collision with root package name */
    public static final android.graphics.Rect f321263d = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);

    /* renamed from: e, reason: collision with root package name */
    public static final android.graphics.Rect f321264e = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);

    /* renamed from: f, reason: collision with root package name */
    public static final int f321265f = 54;

    public final java.lang.String a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : keySet) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.util.List) {
                jSONObject.put(str, new org.json.JSONArray((java.util.Collection) obj));
            } else {
                jSONObject.put(str, bundle.get(str));
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final lt3.g b(java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        return f321261b.y0(taskId);
    }

    public final java.util.ArrayList c(java.util.LinkedList baseItemData, android.content.Context context) {
        kotlin.jvm.internal.o.g(baseItemData, "baseItemData");
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "get the editor data which is waiting for run mixing");
        java.util.Iterator it = baseItemData.iterator();
        while (it.hasNext()) {
            r45.de deVar = (r45.de) it.next();
            int i17 = deVar.f372338d;
            zu3.e eVar = zu3.e.f475796e;
            if (i17 == 1) {
                arrayList.add(new zu3.b0(context).d(new zu3.a0(deVar)));
            } else if (i17 == 2) {
                zu3.j jVar = new zu3.j(deVar);
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = jVar.f475810g;
                kotlin.jvm.internal.o.d(iEmojiInfo);
                av3.e eVar2 = new av3.e(iEmojiInfo, jVar.f475763f);
                r45.bi0 bi0Var = new r45.bi0();
                bv3.d dVar = jVar.f475760c;
                bi0Var.f370772d = dVar.c();
                bi0Var.f370773e = dVar.b();
                eVar2.f14213c = bi0Var;
                arrayList.add(eVar2);
            } else if (i17 == 3) {
                zu3.z zVar = new zu3.z(context);
                zu3.s sVar = new zu3.s(deVar);
                arrayList.add(new av3.c(zVar.c(sVar), sVar.f475763f));
            } else if (i17 == 4) {
                zu3.c0 c0Var = new zu3.c0(context);
                zu3.a0 a0Var = new zu3.a0(deVar);
                arrayList.add(new av3.c(c0Var.c(a0Var), a0Var.f475763f));
            } else if (i17 == 5) {
                zu3.v vVar = new zu3.v(context);
                zu3.t tVar = new zu3.t(deVar);
                vVar.n(tVar.f475830g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = vVar.f475834d.iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Object obj = vVar.f475833J.get(i18);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    arrayList2.add(new av3.g((r45.ge4) next, (android.graphics.Bitmap) obj));
                    i18 = i19;
                }
                arrayList.add(new av3.h(arrayList2, tVar.f475763f));
            } else {
                zu3.e eVar3 = zu3.e.f475801m;
                if (i17 == 6) {
                    byte[] bArr = deVar.f372339e.f371841f.f192156a;
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                    arrayList.add(new av3.d(new zu3.d(eVar3, bArr)));
                } else {
                    zu3.e eVar4 = zu3.e.f475802n;
                    if (i17 == 7) {
                        byte[] bArr2 = deVar.f372339e.f371841f.f192156a;
                        kotlin.jvm.internal.o.f(bArr2, "getBytes(...)");
                        arrayList.add(new av3.d(new zu3.d(eVar4, bArr2)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final r45.se6 d(r45.hi0 storyEditorProtoData) {
        kotlin.jvm.internal.o.g(storyEditorProtoData, "storyEditorProtoData");
        r45.se6 se6Var = new r45.se6();
        se6Var.f385658f = com.tencent.mm.vfs.w6.p(storyEditorProtoData.f376183g);
        se6Var.f385657e = com.tencent.mm.vfs.w6.p(storyEditorProtoData.f376186m);
        java.util.LinkedList linkedList = storyEditorProtoData.D;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            se6Var.f385656d = com.tencent.mm.vfs.w6.p(storyEditorProtoData.f376180d);
            se6Var.f385660h = "";
        } else {
            se6Var.f385656d = "";
            se6Var.f385660h = "";
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                se6Var.f385660h += com.tencent.mm.vfs.w6.p((java.lang.String) it.next());
            }
        }
        if (lj.f.f(se6Var.f385656d)) {
            se6Var.f385656d = "";
        }
        se6Var.f385659g = com.tencent.mm.vfs.w6.p(storyEditorProtoData.f376185i);
        return se6Var;
    }

    public final java.lang.String e(lt3.f0 videoMixer, java.util.List editorData, r45.on0 extraConfig, long j17, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(videoMixer, "videoMixer");
        kotlin.jvm.internal.o.g(editorData, "editorData");
        kotlin.jvm.internal.o.g(extraConfig, "extraConfig");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            lt3.g gVar = new lt3.g();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(gVar.hashCode() & Integer.MAX_VALUE);
            sb6.append('#');
            sb6.append(currentTimeMillis);
            gVar.field_taskId = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
            gVar.field_timeStamp = currentTimeMillis;
            gVar.field_mixRetryTime = 0;
            gVar.field_baseItemData = h(videoMixer, currentTimeMillis, editorData);
            gVar.field_status = 1;
            long j18 = 2592000000L;
            if (j17 <= 2592000000L) {
                j18 = j17;
            }
            gVar.field_expiredTime = j18;
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig h17 = videoMixer.h();
            gVar.field_targetWidth = h17.f155641d;
            gVar.field_targetHeight = h17.f155642e;
            gVar.field_videoBitrate = h17.f155643f;
            gVar.field_audioBitrate = h17.f155644g;
            gVar.field_audioSampleRate = h17.f155645h;
            gVar.field_audioChannelCount = h17.f155646i;
            gVar.field_frameRate = h17.f155647m;
            gVar.field_videoRotate = h17.f155648n;
            gVar.field_extraConfig = extraConfig.toByteArray();
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo l17 = nu3.i.f340218a.l();
            l17.getClass();
            gVar.field_reportInfo = new org.json.JSONObject(l17.f155689d).toString();
            gVar.field_userData = a(ut3.f.f431176c.f431178b);
            gVar.field_blurBgPath = str == null ? "" : str;
            gVar.field_fromScene = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "insertRemuxTask:" + h17 + ", ret:" + f321261b.insert(gVar));
            lt3.e eVar = lt3.e.f321209a;
            java.lang.String field_taskId = gVar.field_taskId;
            kotlin.jvm.internal.o.f(field_taskId, "field_taskId");
            eVar.b(i17, field_taskId);
            return gVar.field_taskId;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.mix_background.VideoEditStorageUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final float[] f(r45.hi0 storyEditorProtoData) {
        kotlin.jvm.internal.o.g(storyEditorProtoData, "storyEditorProtoData");
        return new float[]{storyEditorProtoData.f376191r, storyEditorProtoData.f376193t, storyEditorProtoData.f376192s, storyEditorProtoData.f376194u};
    }

    public final float[] g(r45.hi0 storyEditorProtoData) {
        kotlin.jvm.internal.o.g(storyEditorProtoData, "storyEditorProtoData");
        return new float[]{storyEditorProtoData.F, storyEditorProtoData.H, storyEditorProtoData.G, storyEditorProtoData.I};
    }

    public final byte[] h(lt3.f0 f0Var, long j17, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "is running serialize the videoEditorInfo to bytearray");
        r45.hi0 hi0Var = new r45.hi0();
        mt3.a aVar = f0Var.f321212a;
        st3.f fVar = aVar.f331289a;
        float[] fArr = aVar.f331291c;
        float[] fArr2 = aVar.f331292d;
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "input the timeStamp is " + j17);
        if (fVar.f412538i == 3) {
            ls0.c1 c1Var = ls0.d1.f320816a;
            if (com.tencent.mm.vfs.w6.j(c1Var.a(fVar.f412533d))) {
                hi0Var.f376183g = c1Var.a(fVar.f412533d);
            }
        }
        hi0Var.f376196w = j17;
        long j18 = fVar.f412535f;
        if (j18 == -1) {
            j18 = 0;
        }
        hi0Var.f376181e = j18;
        hi0Var.f376182f = fVar.f412536g;
        hi0Var.f376185i = fVar.f412534e;
        java.lang.String str = fVar.f412533d;
        hi0Var.f376180d = str;
        hi0Var.f376198y = fVar.f412537h;
        if (com.tencent.mm.plugin.sight.base.e.d(str, true) != null) {
            long j19 = fVar.f412536g;
            if (j19 == -1 || j19 == 0) {
                hi0Var.f376182f = r0.f162382a;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(fVar.f412541o)) {
            hi0Var.f376182f = 15000;
        }
        long j27 = hi0Var.f376182f;
        hi0Var.f376182f = j27 > 0 ? j27 : 0L;
        hi0Var.D.addAll(fVar.f412541o);
        hi0Var.f376184h = fVar.f412538i;
        hi0Var.f376191r = (int) fArr[0];
        hi0Var.f376193t = (int) fArr[1];
        hi0Var.f376192s = (int) fArr[2];
        hi0Var.f376194u = (int) fArr[3];
        hi0Var.f376195v = new java.util.LinkedList();
        if (fArr2 != null) {
            hi0Var.F = (int) fArr2[0];
            hi0Var.H = (int) fArr2[1];
            hi0Var.G = (int) fArr2[2];
            hi0Var.I = (int) fArr2[3];
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = fVar.f412539m;
        if (audioCacheInfo != null) {
            hi0Var.f376186m = audioCacheInfo.f155715i;
            hi0Var.f376187n = audioCacheInfo.f155711e;
            hi0Var.f376188o = audioCacheInfo.f155712f;
            hi0Var.f376189p = audioCacheInfo.f155716m;
            hi0Var.f376190q = audioCacheInfo.f155717n;
            hi0Var.B = audioCacheInfo.f155726w;
            hi0Var.C = audioCacheInfo.f155727x;
        }
        hi0Var.A = f321260a.d(hi0Var);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zu3.a aVar2 = (zu3.a) it.next();
            r45.de deVar = new r45.de();
            deVar.f372338d = aVar2.f475758a.f475805d;
            deVar.f372339e = x51.j1.a(aVar2.toProtoBuf().toByteArray());
            hi0Var.f376195v.add(deVar);
        }
        byte[] byteArray = hi0Var.toByteArray();
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "storyEditorItem " + hi0Var.f376180d + " thumb " + hi0Var.f376185i + " and result " + com.tencent.mm.vfs.w6.j(hi0Var.f376185i) + " music " + hi0Var.f376186m + " ret " + com.tencent.mm.sdk.platformtools.t8.f0(byteArray.length * 1) + '}');
        return byteArray;
    }
}
