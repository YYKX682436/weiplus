package si0;

/* loaded from: classes4.dex */
public final class m1 implements com.tencent.pigeon.sns.PlatformNativeRouterApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.PluginRegistry.ActivityResultListener, io.flutter.embedding.engine.plugins.activity.ActivityAware, oi0.a, com.tencent.mm.plugin.sns.model.v7 {

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding f408130e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ho f408132g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.flutter.plugin.SnsNativeRouterPlugin$uiFeedNotifyListener$1 f408133h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f408129d = new java.lang.ref.WeakReference(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f408131f = new java.util.HashMap();

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.flutter.plugin.SnsNativeRouterPlugin$uiFeedNotifyListener$1] */
    public m1() {
        kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f408133h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUserUINotifyEvent>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsNativeRouterPlugin$uiFeedNotifyListener$1
            {
                this.__eventId = 1025439562;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUserUINotifyEvent snsUserUINotifyEvent) {
                com.tencent.mm.autogen.events.SnsUserUINotifyEvent event = snsUserUINotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "uiFeedNotifyListener >> type: %d id: %s", java.lang.Integer.valueOf(event.f54851g.f6876a), ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(event.f54851g.f6877b)));
                ((ku5.t0) ku5.t0.f312615d).q(new si0.l1(event, si0.m1.this));
                return false;
            }
        };
    }

    @Override // oi0.a
    public void a(java.lang.String imgPath, float f17) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        if (imgPath.length() == 0) {
            com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: imgPath is empty");
            return;
        }
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || r17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: userName is null");
            return;
        }
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("sns_aff_cache");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = r17 + '_' + currentTimeMillis;
        java.lang.String o17 = new com.tencent.mm.vfs.r6(c17, str).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (!com.tencent.mm.vfs.w6.u(c17)) {
            com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: mkdirs failed");
            return;
        }
        if (com.tencent.mm.vfs.w6.d(imgPath, o17, false) < 0) {
            com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: copy failed");
            return;
        }
        bw5.tc0 tc0Var = new bw5.tc0();
        tc0Var.f33376g = str;
        tc0Var.Z[4] = true;
        bw5.uj0 uj0Var = new bw5.uj0();
        uj0Var.f33939e = currentTimeMillis;
        boolean[] zArr = uj0Var.f33947p;
        zArr[2] = true;
        uj0Var.f33938d = r17;
        zArr[1] = true;
        uj0Var.f33940f = 1;
        zArr[3] = true;
        uj0Var.f33944m = false;
        zArr[7] = true;
        uj0Var.f33945n = (int) (f17 * 10000.0d);
        zArr[8] = true;
        uj0Var.f33941g = tc0Var;
        zArr[4] = true;
        com.tencent.wechat.aff.sns.b.f217501b.b(uj0Var, si0.f1.f408074a);
    }

    @Override // oi0.a
    public void b(java.lang.String thumbPath, java.lang.String videoPath) {
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        if (!(thumbPath.length() == 0)) {
            if (!(videoPath.length() == 0)) {
                java.lang.String r17 = c01.z1.r();
                if (r17 == null || r17.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverVideo: userName is null");
                    return;
                }
                java.lang.String c17 = com.tencent.mm.vfs.q7.c("sns_aff_cache");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str = r17 + '_' + currentTimeMillis + "_coverThumb";
                java.lang.String o17 = new com.tencent.mm.vfs.r6(c17, str).o();
                kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                java.lang.String str2 = r17 + '_' + currentTimeMillis + "_coverVideo";
                java.lang.String o18 = new com.tencent.mm.vfs.r6(c17, str2).o();
                kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                if (!com.tencent.mm.vfs.w6.u(c17)) {
                    com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverImage: mkdirs failed");
                    return;
                }
                if (com.tencent.mm.vfs.w6.d(thumbPath, o17, false) < 0 || com.tencent.mm.vfs.w6.d(videoPath, o18, false) < 0) {
                    com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverVideo: copy failed");
                    return;
                }
                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(o18, true);
                bw5.tc0 tc0Var = new bw5.tc0();
                tc0Var.f33376g = str2;
                boolean[] zArr = tc0Var.Z;
                zArr[4] = true;
                tc0Var.f33378i = str;
                zArr[6] = true;
                bw5.uc0 uc0Var = new bw5.uc0();
                uc0Var.f33842d = d17.f162384c;
                boolean[] zArr2 = uc0Var.f33845g;
                zArr2[1] = true;
                uc0Var.f33843e = d17.f162385d;
                zArr2[2] = true;
                tc0Var.f33382p = uc0Var;
                zArr[10] = true;
                bw5.uj0 uj0Var = new bw5.uj0();
                uj0Var.f33939e = currentTimeMillis;
                boolean[] zArr3 = uj0Var.f33947p;
                zArr3[2] = true;
                uj0Var.f33938d = r17;
                zArr3[1] = true;
                uj0Var.f33940f = 2;
                zArr3[3] = true;
                uj0Var.f33944m = false;
                zArr3[7] = true;
                uj0Var.f33941g = tc0Var;
                zArr3[4] = true;
                com.tencent.wechat.aff.sns.b.f217501b.b(uj0Var, si0.g1.f408078a);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onChangeCoverVideo: path is empty");
    }

    @Override // oi0.a
    public void c(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        if (snsInfo == null) {
            return;
        }
        try {
            bw5.ak0 ak0Var = new bw5.ak0();
            boolean[] zArr = ak0Var.f25254m;
            long j17 = i17;
            ak0Var.f25249e = j17;
            zArr[2] = true;
            ak0Var.f25248d = snsInfo.getUserName();
            zArr[1] = true;
            bw5.to0 to0Var = new bw5.to0();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
            timeLine.setCreateTime(snsInfo.field_createTime);
            try {
                to0Var.parseFrom(timeLine.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onPostSaveLocal: " + e17.getMessage());
            }
            to0Var.f33547e = snsInfo.getUserName();
            boolean[] zArr2 = to0Var.Q;
            zArr2[2] = true;
            to0Var.f33549g = snsInfo.field_createTime;
            zArr2[4] = true;
            ak0Var.f25250f = to0Var;
            zArr[3] = true;
            java.lang.String d17 = wa4.a0.d(timeLine);
            r45.cu5 cu5Var = new r45.cu5();
            kotlin.jvm.internal.o.d(d17);
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            byte[] bytes = d17.getBytes(UTF_8);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            cu5Var.d(bytes);
            bw5.fk0 fk0Var = new bw5.fk0();
            boolean[] zArr3 = fk0Var.C1;
            fk0Var.f27316d = j17;
            zArr3[1] = true;
            fk0Var.f27317e = snsInfo.getUserName();
            zArr3[2] = true;
            fk0Var.f27319g = snsInfo.field_createTime;
            zArr3[4] = true;
            fk0Var.f27320h = cu5Var;
            zArr3[5] = true;
            ak0Var.f25251g = fk0Var;
            zArr[4] = true;
            this.f408131f.put(java.lang.Integer.valueOf(snsInfo.field_createTime), java.lang.Integer.valueOf(i17));
            com.tencent.wechat.aff.sns.h.f217503b.c(ak0Var, fk0Var, new si0.j1());
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "onPostSaveLocal: " + e18.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    @Override // oi0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.mm.protocal.protobuf.FinderObject r23) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.m1.d(com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    @Override // oi0.a
    public void e(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        if (snsObject == null) {
            return;
        }
        bw5.fk0 fk0Var = new bw5.fk0();
        long j17 = snsObject.Id;
        fk0Var.f27316d = j17;
        boolean[] zArr = fk0Var.C1;
        zArr[1] = true;
        fk0Var.f27338x1 = snsObject.InTopList;
        zArr[52] = true;
        com.tencent.wechat.aff.sns.h.f217503b.e(j17, fk0Var, si0.h1.f408084a);
    }

    @Override // oi0.a
    public void f(long j17, r45.p96 opChangeVisibility) {
        kotlin.jvm.internal.o.g(opChangeVisibility, "opChangeVisibility");
        bw5.gk0 gk0Var = new bw5.gk0();
        gk0Var.f27891o = opChangeVisibility.f382899o;
        boolean[] zArr = gk0Var.f27895s;
        zArr[9] = true;
        java.util.LinkedList linkedList = opChangeVisibility.f382892e;
        java.util.LinkedList linkedList2 = gk0Var.f27884e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add((r45.du5) it.next());
                zArr[2] = true;
            }
        }
        gk0Var.f27883d = linkedList2 != null ? linkedList2.size() : 0;
        zArr[1] = true;
        java.util.LinkedList<java.lang.Integer> linkedList3 = opChangeVisibility.f382894g;
        java.util.LinkedList linkedList4 = gk0Var.f27886g;
        if (linkedList3 != null) {
            for (java.lang.Integer num : linkedList3) {
                kotlin.jvm.internal.o.d(num);
                linkedList4.add(java.lang.Integer.valueOf(num.intValue()));
                zArr[4] = true;
            }
        }
        gk0Var.f27885f = linkedList4 != null ? linkedList4.size() : 0;
        zArr[3] = true;
        java.util.LinkedList linkedList5 = opChangeVisibility.f382896i;
        java.util.LinkedList linkedList6 = gk0Var.f27888i;
        if (linkedList5 != null) {
            java.util.Iterator it6 = linkedList5.iterator();
            while (it6.hasNext()) {
                linkedList6.add((r45.du5) it6.next());
                zArr[6] = true;
            }
        }
        gk0Var.f27887h = linkedList6 != null ? linkedList6.size() : 0;
        zArr[5] = true;
        java.util.LinkedList<java.lang.Integer> linkedList7 = opChangeVisibility.f382898n;
        java.util.LinkedList linkedList8 = gk0Var.f27890n;
        if (linkedList7 != null) {
            for (java.lang.Integer num2 : linkedList7) {
                kotlin.jvm.internal.o.d(num2);
                linkedList8.add(java.lang.Integer.valueOf(num2.intValue()));
                zArr[8] = true;
            }
        }
        gk0Var.f27889m = linkedList8 != null ? linkedList8.size() : 0;
        zArr[7] = true;
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "onVisibilityChanged: snsId=" + j17 + " opType=" + gk0Var.f27891o + " blackList=" + gk0Var.f27883d + " blackTag=" + gk0Var.f27885f + " groupUser=" + gk0Var.f27887h + " groupTag=" + gk0Var.f27889m);
        com.tencent.wechat.aff.sns.h.f217503b.f(j17, gk0Var, si0.k1.f408096a);
    }

    public final void g(java.util.Map map, yz5.l lVar) {
        int i17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleJumpToDetail enter, hasParams=");
        sb6.append(map != null);
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", sb6.toString());
        try {
            android.content.Context i18 = i();
            if (i18 == null) {
                com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: context is null");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                return;
            }
            if (map != null && map.containsKey("object_buffer")) {
                java.lang.Object obj = map.get("object_buffer");
                byte[] bArr = obj instanceof byte[] ? (byte[]) obj : null;
                if (bArr == null) {
                    com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: object_buffer is not ByteArray");
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                    return;
                }
                java.lang.Object obj2 = map.get("sns_session_id");
                java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                java.lang.Object obj3 = map.get("from_page");
                java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                if (str3 != null) {
                    str2 = str3;
                }
                java.lang.Object obj4 = map.get("home_page_type");
                java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
                int intValue = num != null ? num.intValue() : 0;
                int i19 = intValue != 0 ? intValue != 1 ? intValue != 2 ? 0 : 3 : 9 : 2;
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
                try {
                    snsObject.parseFrom(bArr);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleJumpToDetail: parsed snsId=");
                    java.lang.String str4 = str;
                    java.lang.String str5 = str2;
                    sb7.append(ca4.z0.t0(snsObject.Id));
                    sb7.append(" createTime=");
                    sb7.append(snsObject.CreateTime);
                    com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", sb7.toString());
                    java.lang.String r17 = c01.z1.r();
                    int i27 = kotlin.jvm.internal.o.b(snsObject.Username, r17) ? 4 : 8;
                    java.lang.Integer num2 = (java.lang.Integer) this.f408131f.get(java.lang.Integer.valueOf(snsObject.CreateTime));
                    if (num2 == null || num2.intValue() == 0) {
                        i17 = i19;
                        snsInfo = null;
                        z17 = false;
                    } else {
                        i17 = i19;
                        snsInfo = com.tencent.mm.plugin.sns.model.l4.Fj().i1(num2.intValue());
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleJumpToDetail: found from createTimeToLocalMap, localId=");
                        sb8.append(num2);
                        sb8.append(", snsInfo=");
                        sb8.append(snsInfo != null);
                        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", sb8.toString());
                        z17 = true;
                    }
                    if (snsInfo == null) {
                        try {
                            com.tencent.mm.plugin.sns.model.s5.q(snsObject, r17, i27);
                            snsInfo = com.tencent.mm.plugin.sns.model.l4.Fj().W0(snsObject.Id);
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MircroMsg.SnsNativeRouterPlugin", th6, "handleJumpToDetail: SnsInfoStorageLogic.replace failed, snsId=" + snsObject.Id, new java.lang.Object[0]);
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6))));
                            return;
                        }
                    }
                    if (snsInfo == null) {
                        com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: snsInfo not found for id=" + snsObject.Id + " createTime=" + snsObject.CreateTime);
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent(i18, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
                    intent.putExtra("INTENT_TALKER", snsObject.Username);
                    if (z17) {
                        intent.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", snsInfo.localid));
                    } else {
                        intent.putExtra("INTENT_SNSID", com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", snsObject.Id));
                        intent.putExtra("INTENT_SNS_OBJ", bArr);
                    }
                    intent.putExtra("INTENT_FROMGALLERY", false);
                    intent.putExtra("INTENT_NEED_RPT_FEED", true);
                    intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str4);
                    intent.putExtra("INTENT_SNS_PAGE_SCENE", str5);
                    intent.putExtra("INTENT_ALBUM_SCENE", i17);
                    android.app.Activity activity = i18 instanceof android.app.Activity ? (android.app.Activity) i18 : null;
                    if (activity != null) {
                        db5.f.c(activity, null);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(i18, arrayList.toArray(), "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "handleJumpToDetail", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    i18.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(i18, "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "handleJumpToDetail", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail leave normally, snsId=" + snsObject.Id + " isLocal=" + z17);
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
                    return;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MircroMsg.SnsNativeRouterPlugin", th7, "handleJumpToDetail: parseFrom snsObjectBuffer failed, size=" + bArr.length, new java.lang.Object[0]);
                    kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7))));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MircroMsg.SnsNativeRouterPlugin", "handleJumpToDetail: jump failed with null buffer");
            kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        } catch (java.lang.Throwable th8) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MircroMsg.SnsNativeRouterPlugin", th8, "handleJumpToDetail: unexpected throwable", new java.lang.Object[0]);
            kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8))));
        }
    }

    public final void h() {
        android.content.Context i17 = i();
        if (i17 != null && this.f408132g == null) {
            androidx.activity.ComponentActivity componentActivity = i17 instanceof androidx.activity.ComponentActivity ? (androidx.activity.ComponentActivity) i17 : null;
            if (componentActivity != null) {
                com.tencent.mm.plugin.sns.ui.ho hoVar = new com.tencent.mm.plugin.sns.ui.ho(componentActivity, new com.tencent.mm.plugin.sns.ui.SnsUIAction(componentActivity));
                this.f408132g = hoVar;
                hoVar.f168525c = new si0.a1(this);
            }
        }
    }

    public final android.content.Context i() {
        return (android.content.Context) this.f408129d.get();
    }

    @Override // com.tencent.pigeon.sns.PlatformNativeRouterApi
    public void jumpToSNSDetailWithSnsId(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "jumpToSNSDetailWithSnsId >> snsId: " + ca4.z0.t0(j17));
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new si0.d1(this, new java.util.LinkedHashMap(), callback, j17, null), 3, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036f, code lost:
    
        if (r28.equals("album_list") == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015b, code lost:
    
        if (r28.equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0373, code lost:
    
        r0 = c01.z1.r();
        r2 = new android.content.Intent();
        r2.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.AlbumUI"));
        r2.putExtra("sns_userName", r0);
        r2.putExtra(dm.i4.COL_USERNAME, r0);
        r2.putExtra("story_dot", false);
        r2.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        r2.addFlags(67108864);
        r0 = new java.util.ArrayList();
        r0.add(r2);
        java.util.Collections.reverse(r0);
        yj0.a.d(r4, r0.toArray(), "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "jumpToAlbum", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r4.startActivity((android.content.Intent) r0.get(0));
        yj0.a.f(r4, "com/tencent/mm/flutter/plugin/SnsNativeRouterPlugin", "jumpToAlbum", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r0 = kotlin.Result.INSTANCE;
        r30.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0026. Please report as an issue. */
    @Override // com.tencent.pigeon.sns.PlatformNativeRouterApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jumpToSNSNativePage(java.lang.String r28, java.util.Map r29, yz5.l r30) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.m1.jumpToSNSNativePage(java.lang.String, java.util.Map, yz5.l):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.ho hoVar = this.f408132g;
        if (hoVar == null) {
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        if (5985 == i17 && i18 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            return false;
        }
        hoVar.f168524b.k(i17, i18, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onAttachedToActivity");
        this.f408130e = binding;
        this.f408129d = new java.lang.ref.WeakReference(binding.getActivity());
        binding.addActivityResultListener(this);
        alive();
        com.tencent.mm.plugin.sns.model.l4.Nj().b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onAttachedToEngine");
        com.tencent.pigeon.sns.PlatformNativeRouterApi.Companion companion = com.tencent.pigeon.sns.PlatformNativeRouterApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformNativeRouterApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        oi0.e eVar = oi0.e.f345591d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17) {
            oi0.e.f345592e = new java.lang.ref.WeakReference(this);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onDetachedFromActivity");
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding = this.f408130e;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f408130e = null;
        dead();
        com.tencent.mm.plugin.sns.model.l4.Nj().n(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding = this.f408130e;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f408130e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MircroMsg.SnsNativeRouterPlugin", "[" + hashCode() + "]onDetachedFromEngine");
        com.tencent.pigeon.sns.PlatformNativeRouterApi.Companion companion = com.tencent.pigeon.sns.PlatformNativeRouterApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformNativeRouterApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        oi0.e eVar = oi0.e.f345591d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17) {
            oi0.e.f345592e = new java.lang.ref.WeakReference(null);
        }
    }

    @Override // com.tencent.mm.plugin.sns.model.v7
    public void onPostEnd(int i17, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        onAttachedToActivity(binding);
    }

    @Override // com.tencent.mm.plugin.sns.model.v7
    public void updateBackView(com.tencent.mm.plugin.sns.storage.x1 x1Var) {
    }
}
