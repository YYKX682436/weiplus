package dq0;

@j95.b
/* loaded from: classes7.dex */
public final class c0 extends i95.w implements com.tencent.pigeon.flutter_magic_brush.MagicSclRequest, com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi, io.flutter.embedding.engine.plugins.FlutterPlugin, dq0.i {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f242301g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f242302d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f242303e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f242304f = new java.lang.ref.WeakReference(null);

    public c0() {
        if (!f242301g) {
            fp.d0.n("magic_brush_zidl");
            f242301g = true;
        }
        eq0.b bVar = new eq0.b(this);
        com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "setPropMagicSclRequest in java");
        com.tencent.zidl2.ZidlBrushApiManagerCaller.getInstance().setPropMagicSclRequest(bVar);
    }

    public void Ai(java.lang.String bizName, dq0.j handler) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f242302d.put(bizName, handler);
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void attachFrameSet(java.lang.String rootId, java.lang.String frameSetId, java.lang.String extra) {
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(extra, "extra");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            wi6.attachFrameSet(rootId, frameSetId, extra);
        }
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void changeFrameSetData(java.lang.String rootId, java.lang.String data, java.lang.String extInfo) {
        hq0.e0 e0Var;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f242289e.get(rootId)) == null) {
            return;
        }
        e0Var.a(data, extInfo);
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void clickFrameSet(java.lang.String rootId, java.lang.String frameSetId, java.lang.String magicbrushViewId) {
        hq0.i0 t17;
        fq0.x V0;
        hq0.e0 e0Var;
        jz5.f0 f0Var;
        java.lang.Object obj;
        long j17;
        java.lang.String str;
        java.lang.Object str2;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(magicbrushViewId, "magicbrushViewId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (t17 = ((dq0.a0) wi6).t()) == null || (V0 = t17.V0(frameSetId)) == null || (e0Var = V0.f265479c) == null) {
            return;
        }
        hq0.i0 i0Var = e0Var.f282988i;
        hq0.k0 k0Var = i0Var.f282998m;
        k0Var.getClass();
        java.util.Collection values = k0Var.f283028a.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((hq0.j0) obj).b(), magicbrushViewId)) {
                    break;
                }
            }
        }
        hq0.j0 j0Var = (hq0.j0) obj;
        if (j0Var != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() + new java.util.Random().nextInt(1000);
            hq0.l0 l0Var = i0Var.f282994f;
            l0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("appId", e0Var.f282980a);
            jSONObject.put("frameSetRootId", e0Var.f282984e);
            java.lang.String str3 = "0";
            if (currentTimeMillis != 0) {
                if (currentTimeMillis == 0) {
                    j17 = currentTimeMillis;
                    str2 = "0";
                } else if (currentTimeMillis > 0) {
                    str2 = java.lang.Long.toString(currentTimeMillis, 10);
                    j17 = currentTimeMillis;
                } else {
                    char[] cArr = new char[64];
                    long j18 = (currentTimeMillis >>> 1) / 5;
                    long j19 = 10;
                    cArr[63] = java.lang.Character.forDigit((int) (currentTimeMillis - (j18 * j19)), 10);
                    int i17 = 63;
                    while (j18 > 0) {
                        i17--;
                        cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                        j18 /= j19;
                        currentTimeMillis = currentTimeMillis;
                    }
                    j17 = currentTimeMillis;
                    str2 = new java.lang.String(cArr, i17, 64 - i17);
                }
                jSONObject.put("clickId", str2);
            } else {
                j17 = currentTimeMillis;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("frameSetId", V0.f265478b);
            jSONObject2.put("viewId", V0.f265492p);
            jSONObject2.put("frameSetName", V0.f265477a);
            jSONObject2.put("canvasId", j0Var.f283012a);
            jSONArray.put(jSONObject2);
            jSONObject.put("frameSets", jSONArray);
            java.lang.String jSONObject3 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            l0Var.a("surface:frameSet:click", jSONObject3);
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String d17 = e0Var.d();
            java.lang.String s07 = r26.n0.s0(d17, "-", d17);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType iMagicBrushClickEnumExt$RoleType = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$RoleType.ADClient;
            if (currentTimeMillis != 0) {
                if (currentTimeMillis > 0) {
                    str3 = java.lang.Long.toString(j17, 10);
                } else {
                    long j27 = j17;
                    char[] cArr2 = new char[64];
                    long j28 = (j27 >>> 1) / 5;
                    long j29 = 10;
                    cArr2[63] = java.lang.Character.forDigit((int) (j27 - (j28 * j29)), 10);
                    int i18 = 63;
                    while (j28 > 0) {
                        i18--;
                        cArr2[i18] = java.lang.Character.forDigit((int) (j28 % j29), 10);
                        j28 /= j29;
                    }
                    str = new java.lang.String(cArr2, i18, 64 - i18);
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType iMagicBrushClickEnumExt$EventType = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType.FrontEndClick;
                    com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType iMagicBrushClickEnumExt$ActionType = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType.NativeTriggerClick;
                    java.lang.String str4 = V0.f265477a;
                    kotlin.jvm.internal.o.d(iVar);
                    je3.i.m519if(iVar, s07, 0, currentTimeMillis2, str, iMagicBrushClickEnumExt$RoleType, iMagicBrushClickEnumExt$EventType, iMagicBrushClickEnumExt$ActionType, 0, 0, null, str4, ce1.i.CTRL_INDEX, null);
                    f0Var = jz5.f0.f302826a;
                }
            }
            str = str3;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType iMagicBrushClickEnumExt$EventType2 = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$EventType.FrontEndClick;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType iMagicBrushClickEnumExt$ActionType2 = com.tencent.mm.plugin.magicbrush.report.IMagicBrushClickEnumExt$ActionType.NativeTriggerClick;
            java.lang.String str42 = V0.f265477a;
            kotlin.jvm.internal.o.d(iVar);
            je3.i.m519if(iVar, s07, 0, currentTimeMillis2, str, iMagicBrushClickEnumExt$RoleType, iMagicBrushClickEnumExt$EventType2, iMagicBrushClickEnumExt$ActionType2, 0, 0, null, str42, ce1.i.CTRL_INDEX, null);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(i0Var.getTag(), "canvas not found for " + V0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r0 == null) goto L21;
     */
    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String createFrameSet(java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            java.lang.String r0 = "rootId"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "MagicSclFlutterPlugin"
            java.lang.String r1 = "receive create request"
            com.tencent.mars.xlog.Log.i(r0, r1)
            dq0.j r0 = r5.wi(r6)
            if (r0 == 0) goto La3
            int r1 = (int) r8
            dq0.a0 r0 = (dq0.a0) r0
            java.util.HashMap r2 = r0.f242289e
            java.lang.Object r2 = r2.get(r6)
            hq0.e0 r2 = (hq0.e0) r2
            if (r2 != 0) goto L42
            java.lang.String r0 = "MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "frameSetRoot for "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " not found! create: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.w(r0, r1)
            java.lang.String r0 = ""
            goto La5
        L42:
            java.lang.String r2 = "MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "createFrameSet "
            r3.<init>(r4)
            r3.append(r6)
            r4 = 32
            r3.append(r4)
            r3.append(r7)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r3)
            java.util.HashSet r2 = r0.f242295n
            monitor-enter(r2)
            fq0.x r1 = r0.k(r6, r7, r1)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L85
            boolean r3 = r1.f265489m     // Catch: java.lang.Throwable -> La0
            if (r3 != 0) goto L86
            mq0.d1 r3 = mq0.d1.f330546a     // Catch: java.lang.Throwable -> La0
            java.util.HashMap r4 = r0.f242289e     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> La0
            kotlin.jvm.internal.o.d(r4)     // Catch: java.lang.Throwable -> La0
            hq0.e0 r4 = (hq0.e0) r4     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = r4.d()     // Catch: java.lang.Throwable -> La0
            r3.b(r1, r4)     // Catch: java.lang.Throwable -> La0
            goto L86
        L85:
            r1 = 0
        L86:
            if (r1 == 0) goto L8e
            r0.a(r1)     // Catch: java.lang.Throwable -> La0
            r1.b()     // Catch: java.lang.Throwable -> La0
        L8e:
            monitor-exit(r2)
            if (r1 == 0) goto L9d
            dq0.r r2 = new dq0.r
            r2.<init>(r0, r1)
            d75.b.g(r2)
            java.lang.String r0 = r1.f265478b
            if (r0 != 0) goto La5
        L9d:
            java.lang.String r0 = ""
            goto La5
        La0:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
        La3:
            java.lang.String r0 = ""
        La5:
            java.lang.String r1 = "MagicSclFlutterPlugin"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "createFrameSet in root: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = ", name: "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = ", id: "
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = " viewId: "
            r2.append(r6)
            r2.append(r8)
            java.lang.String r6 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.c0.createFrameSet(java.lang.String, java.lang.String, long):java.lang.String");
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public java.lang.String createFrameSetRoot(java.lang.String bizName, java.lang.String path, java.lang.String query) {
        jz5.f0 f0Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        dq0.j jVar = (dq0.j) this.f242302d.get(bizName);
        java.lang.String str3 = "";
        if (jVar != null) {
            dq0.a0 a0Var = (dq0.a0) jVar;
            if (a0Var.t() != null) {
                hq0.e0 h17 = a0Var.h(path, query);
                if (h17 != null) {
                    a0Var.f242289e.put(h17.f282984e, h17);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "no frameSet root");
                    ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandNoFrameSetRoot", 0, null, 1.0f);
                }
                if (h17 != null && (str = h17.f282984e) != null) {
                    str3 = str;
                }
                this.f242303e.put(str3, bizName);
                com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "createFrameSetRoot " + str3 + ",path:" + path + ",query:" + query);
                return str3;
            }
            com.tencent.mars.xlog.Log.e("MagicSclFlutterPlugin", "invalid provider for ".concat(bizName));
        }
        com.tencent.mars.xlog.Log.e("MagicSclFlutterPlugin", "createFrameSetRoot for biz " + bizName + " failed...");
        ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicFlutterCreateFrameSetRootFailed", 0, bizName + ", " + path, 1.0f);
        return "";
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void destroyFrameSet(java.lang.String rootId, java.lang.String frameSetId) {
        hq0.i0 t17;
        fq0.x V0;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null && (t17 = ((dq0.a0) wi6).t()) != null && (V0 = t17.V0(frameSetId)) != null) {
            V0.i();
        }
        com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "destroyFrameSet in root: " + rootId + ", id: " + frameSetId);
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void destroyFrameSetRoot(java.lang.String rootId) {
        dq0.j jVar;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "destroyFrameSetRoot, in root: ".concat(rootId));
        java.lang.String str = (java.lang.String) this.f242303e.remove(rootId);
        if (str == null || (jVar = (dq0.j) this.f242302d.get(str)) == null) {
            return;
        }
        ((dq0.a0) jVar).i(rootId);
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void detachFrameSet(java.lang.String rootId, java.lang.String frameSetId) {
        hq0.i0 t17;
        fq0.x V0;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (t17 = ((dq0.a0) wi6).t()) == null || (V0 = t17.V0(frameSetId)) == null) {
            return;
        }
        V0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if ((!(r10.length == 0)) == true) goto L23;
     */
    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getFrameSetCoverPath(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "rootId"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "frameSetId"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            java.util.HashMap r0 = r9.f242303e
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = ""
            if (r10 != 0) goto L1a
            r5 = r0
            goto L1b
        L1a:
            r5 = r10
        L1b:
            java.lang.Class<qq0.i> r10 = qq0.i.class
            i95.m r1 = i95.n0.c(r10)
            qq0.i r1 = (qq0.i) r1
            qq0.m r1 = (qq0.m) r1
            boolean r1 = r1.Bi(r5)
            if (r1 != 0) goto L2c
            return r0
        L2c:
            i95.m r1 = i95.n0.c(r10)
            qq0.i r1 = (qq0.i) r1
            qq0.m r1 = (qq0.m) r1
            boolean r1 = r1.Ai(r5, r11)
            if (r1 != 0) goto L88
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            i95.m r10 = i95.n0.c(r10)
            qq0.i r10 = (qq0.i) r10
            qq0.m r10 = (qq0.m) r10
            java.lang.String r10 = r10.wi(r5, r11)
            com.tencent.mm.vfs.z7 r10 = com.tencent.mm.vfs.z7.a(r10)
            r1.<init>(r10)
            com.tencent.mm.vfs.r6 r10 = r1.s()
            r1 = 0
            if (r10 == 0) goto L67
            java.lang.String[] r10 = r10.D()
            if (r10 == 0) goto L67
            int r10 = r10.length
            r2 = 1
            if (r10 != 0) goto L62
            r10 = r2
            goto L63
        L62:
            r10 = r1
        L63:
            r10 = r10 ^ r2
            if (r10 != r2) goto L67
            goto L68
        L67:
            r2 = r1
        L68:
            if (r2 == 0) goto L87
            java.lang.Class<mq0.e0> r10 = mq0.e0.class
            i95.m r10 = i95.n0.c(r10)
            mq0.e0 r10 = (mq0.e0) r10
            java.lang.String r2 = "tryShowCover"
            java.lang.String r3 = "noCorrectCover"
            java.lang.String r4 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = vq0.a.b(r11)
            java.lang.String[] r8 = new java.lang.String[r1]
            r1 = r10
            mq0.v0 r1 = (mq0.v0) r1
            r1.wi(r2, r3, r4, r5, r6, r7, r8)
        L87:
            return r0
        L88:
            i95.m r10 = i95.n0.c(r10)
            qq0.i r10 = (qq0.i) r10
            qq0.m r10 = (qq0.m) r10
            java.lang.String r10 = r10.wi(r5, r11)
            java.lang.String r11 = "getFrameSetCoverPath: "
            java.lang.String r11 = r11.concat(r10)
            java.lang.String r0 = "MagicSclFlutterPlugin"
            com.tencent.mars.xlog.Log.i(r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.c0.getFrameSetCoverPath(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi
    public void invoke(java.lang.String bizName, java.lang.String apiName, byte[] bArr, yz5.l callback) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(apiName, "apiName");
        kotlin.jvm.internal.o.g(callback, "callback");
        dq0.j jVar = (dq0.j) this.f242302d.get(bizName);
        if (jVar != null) {
            yz5.q qVar = (yz5.q) ((dq0.a0) jVar).j().get(apiName);
            if (qVar != null) {
                qVar.invoke(apiName, bArr, new dq0.w(callback));
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new jz5.k(apiName.concat(" is not implemented in host"))))));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalAccessException("BizName " + bizName + " not found")))));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f242304f = new java.lang.ref.WeakReference(binding.getFlutterEngine());
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest.Companion companion = com.tencent.pigeon.flutter_magic_brush.MagicSclRequest.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi.Companion companion2 = com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi.Companion.setUp$default(companion2, binaryMessenger2, this, null, 4, null);
        com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "onAttachedToEngine, engine: " + this.f242304f.get());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        if (!kotlin.jvm.internal.o.b(this.f242304f.get(), binding.getFlutterEngine())) {
            com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "onDetachedFromEngine invoke, engine is the last engine, status not clear");
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "onDetachedFromEngine, engine: " + this.f242304f.get());
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest.Companion companion = com.tencent.pigeon.flutter_magic_brush.MagicSclRequest.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_magic_brush.MagicSclRequest.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi.Companion companion2 = com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizHostApi.Companion.setUp$default(companion2, binaryMessenger2, null, null, 4, null);
        this.f242304f.clear();
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void pauseFrameSetRoot(java.lang.String rootId) {
        hq0.e0 e0Var;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f242289e.get(rootId)) == null) {
            return;
        }
        e0Var.f();
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void preInitFrameSet(java.lang.String rootId, java.lang.String name, java.lang.String data, java.lang.String extInfo, yz5.l callback) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MagicSclFlutterPlugin", "preLayout from flutter " + rootId + " frameSet:" + name + " data:" + data.length() + " ext:" + extInfo);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(callback);
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            ((dq0.a0) wi6).l(rootId, name, data, com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.InBox, extInfo, new dq0.b0(weakReference));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Double.valueOf(0.0d))));
        }
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void redrawFrameSet(java.lang.String rootId, java.lang.String frameSetId) {
        hq0.e0 e0Var;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            dq0.a0 a0Var = (dq0.a0) wi6;
            fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(frameSetId);
            if (Ai == null || (e0Var = (hq0.e0) a0Var.f242289e.get(rootId)) == null) {
                return;
            }
            e0Var.h(Ai);
        }
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void redrawFrameSetRoot(java.lang.String rootId) {
        hq0.e0 e0Var;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f242289e.get(rootId)) == null) {
            return;
        }
        e0Var.g();
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void resizeFrameSet(java.lang.String rootId, java.lang.String frameSetId, double d17, double d18) {
        fq0.x V0;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 != null) {
            int a17 = a06.d.a(d17);
            int a18 = a06.d.a(d18);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "resizeFrameSet " + rootId + ' ' + frameSetId + ' ' + a17 + ' ' + a18);
            hq0.i0 t17 = ((dq0.a0) wi6).t();
            if (t17 == null || (V0 = t17.V0(frameSetId)) == null) {
                return;
            }
            V0.j(a17, a18);
        }
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void resumeFrameSetRoot(java.lang.String rootId) {
        hq0.e0 e0Var;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (e0Var = (hq0.e0) ((dq0.a0) wi6).f242289e.get(rootId)) == null) {
            return;
        }
        e0Var.j();
    }

    @Override // com.tencent.pigeon.flutter_magic_brush.MagicSclRequest
    public void scrollFrameSet(java.lang.String rootId, java.lang.String frameSetId, double d17, double d18) {
        hq0.i0 t17;
        fq0.x V0;
        kotlin.jvm.internal.o.g(rootId, "rootId");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        dq0.j wi6 = wi(rootId);
        if (wi6 == null || (t17 = ((dq0.a0) wi6).t()) == null || (V0 = t17.V0(frameSetId)) == null) {
            return;
        }
        V0.g(d17, d18);
    }

    public final dq0.j wi(java.lang.String str) {
        dq0.j jVar;
        java.lang.String str2 = (java.lang.String) this.f242303e.get(str);
        if (str2 != null && (jVar = (dq0.j) this.f242302d.get(str2)) != null) {
            if (((dq0.a0) jVar).t() != null) {
                return jVar;
            }
            com.tencent.mars.xlog.Log.e("MagicSclFlutterPlugin", "invalid provider for " + str + ' ' + str2);
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicFlutterGetSclHandlerFailed", 0, str2 + ", " + str, 1.0f);
        }
        return null;
    }
}
