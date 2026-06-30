package si0;

/* loaded from: classes11.dex */
public final class t0 implements com.tencent.pigeon.sns.PlatformSnsSelectContactApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f408170d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f408171e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f408172f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f408173g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f408174h;

    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    public java.util.List getLabelList(java.util.List labelIdList) {
        kotlin.jvm.internal.o.g(labelIdList, "labelIdList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<java.lang.Number> arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(labelIdList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (java.lang.Number number : arrayList2) {
            kotlin.jvm.internal.o.d(number);
            arrayList3.add(java.lang.Long.valueOf(number.longValue()));
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(longValue));
            if (g17 == null) {
                g17 = "";
            }
            java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(longValue));
            com.tencent.mars.xlog.Log.i("MicroMsg.PlatformSelectContactApiImpl", "getLabelList labelId: " + longValue + ", labelName:" + g17);
            if ((g17.length() > 0) && !com.tencent.mm.sdk.platformtools.t8.L0(j17)) {
                arrayList.add(new com.tencent.pigeon.sns.SnsFlutterLabelInfo(longValue, g17, new java.util.ArrayList()));
            }
        }
        return arrayList;
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    public java.util.List getLabelListWithUsers(java.util.List labelIdList) {
        kotlin.jvm.internal.o.g(labelIdList, "labelIdList");
        java.util.ArrayList<java.lang.Number> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.addAll(labelIdList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (java.lang.Number number : arrayList) {
            kotlin.jvm.internal.o.d(number);
            arrayList3.add(java.lang.Long.valueOf(number.longValue()));
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(longValue));
            if (g17 == null) {
                g17 = "";
            }
            if (g17.length() > 0) {
                java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(longValue));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLabelList labelId: ");
                sb6.append(longValue);
                sb6.append(", labelName:");
                sb6.append(g17);
                sb6.append(" userSize: ");
                sb6.append(j17 != null ? java.lang.Integer.valueOf(j17.size()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.PlatformSelectContactApiImpl", sb6.toString());
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                if (j17 != null) {
                    for (java.lang.String str : j17) {
                        kotlin.jvm.internal.o.d(str);
                        arrayList4.add(new com.tencent.pigeon.sns.SnsFlutterContactInfo(str, cj0.a.f41853a.m(str)));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList2.add(new com.tencent.pigeon.sns.SnsFlutterLabelInfo(longValue, g17, arrayList4));
                }
            }
        }
        return arrayList2;
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    public java.util.List getValidToVisibilityUserNames(java.util.List userNames) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = userNames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                if (Bi.n(str, true).r2()) {
                    arrayList.add(str);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PlatformSelectContactApiImpl", "[getValidToVisibilityUserNames] name:" + str + " skip, isContact:false");
                }
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        kz5.p0 p0Var = kz5.p0.f313996d;
        cj0.a aVar = cj0.a.f41853a;
        if (i17 == 4003) {
            if (i18 != -1) {
                yz5.l lVar = this.f408171e;
                if (lVar != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(false, p0Var))));
                }
            } else {
                if (intent == null) {
                    yz5.l lVar2 = this.f408171e;
                    if (lVar2 != null) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(false, p0Var))));
                    }
                    this.f408171e = null;
                    return true;
                }
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    com.tencent.pigeon.sns.SnsFlutterSelectContactRsp snsFlutterSelectContactRsp = new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(true, p0Var);
                    yz5.l lVar3 = this.f408171e;
                    if (lVar3 != null) {
                        lVar3.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(snsFlutterSelectContactRsp)));
                    }
                } else {
                    kotlin.jvm.internal.o.d(stringExtra);
                    java.util.List<java.lang.String> f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.String str : f07) {
                        arrayList.add(new com.tencent.pigeon.sns.SnsFlutterContactInfo(str, aVar.m(str)));
                    }
                    com.tencent.pigeon.sns.SnsFlutterSelectContactRsp snsFlutterSelectContactRsp2 = new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(true, arrayList);
                    yz5.l lVar4 = this.f408171e;
                    if (lVar4 != null) {
                        lVar4.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(snsFlutterSelectContactRsp2)));
                    }
                }
            }
            this.f408171e = null;
            return true;
        }
        if (i17 == 4005) {
            if (i18 != -1) {
                yz5.l lVar5 = this.f408172f;
                if (lVar5 != null) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    lVar5.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectLabelRsp(false, p0Var))));
                }
            } else {
                if (intent == null) {
                    yz5.l lVar6 = this.f408172f;
                    if (lVar6 != null) {
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        lVar6.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectLabelRsp(false, p0Var))));
                    }
                    this.f408172f = null;
                    return true;
                }
                if (this.f408172f != null) {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                    com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.X6(stringArrayListExtra);
                    if (stringArrayListExtra != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str2 : stringArrayListExtra) {
                            kotlin.jvm.internal.o.d(str2);
                            long parseLong = java.lang.Long.parseLong(str2);
                            java.lang.String g17 = ((b93.b) c93.a.a()).g(str2);
                            kotlin.jvm.internal.o.f(g17, "getLabelStrById(...)");
                            arrayList2.add(new com.tencent.pigeon.sns.SnsFlutterLabelInfo(parseLong, g17, new java.util.ArrayList()));
                        }
                        com.tencent.pigeon.sns.SnsFlutterSelectLabelRsp snsFlutterSelectLabelRsp = new com.tencent.pigeon.sns.SnsFlutterSelectLabelRsp(true, arrayList2);
                        yz5.l lVar7 = this.f408172f;
                        if (lVar7 != null) {
                            lVar7.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(snsFlutterSelectLabelRsp)));
                        }
                    }
                }
            }
            this.f408171e = null;
            return true;
        }
        if (i17 != 4010) {
            if (i17 != 4011) {
                return false;
            }
            if (i18 != -1 || intent == null) {
                yz5.l lVar8 = this.f408174h;
                if (lVar8 != null) {
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    lVar8.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(false, p0Var))));
                }
            } else {
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                if (android.text.TextUtils.isEmpty(stringExtra2)) {
                    com.tencent.pigeon.sns.SnsFlutterSelectContactRsp snsFlutterSelectContactRsp3 = new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(true, p0Var);
                    yz5.l lVar9 = this.f408174h;
                    if (lVar9 != null) {
                        lVar9.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(snsFlutterSelectContactRsp3)));
                    }
                } else {
                    kotlin.jvm.internal.o.d(stringExtra2);
                    java.util.List<java.lang.String> f08 = r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.String str3 : f08) {
                        arrayList3.add(new com.tencent.pigeon.sns.SnsFlutterContactInfo(str3, aVar.m(str3)));
                    }
                    com.tencent.pigeon.sns.SnsFlutterSelectContactRsp snsFlutterSelectContactRsp4 = new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(true, arrayList3);
                    yz5.l lVar10 = this.f408174h;
                    if (lVar10 != null) {
                        lVar10.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(snsFlutterSelectContactRsp4)));
                    }
                }
            }
            this.f408174h = null;
            return true;
        }
        if (i18 != -1 || intent == null) {
            yz5.l lVar11 = this.f408173g;
            if (lVar11 != null) {
                kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                lVar11.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp(false, p0Var, p0Var, p0Var))));
            }
        } else {
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("visibility_result_select_label_list");
            if (stringArrayListExtra2 == null) {
                stringArrayListExtra2 = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("visibility_result_select_contact_list");
            if (stringArrayListExtra3 == null) {
                stringArrayListExtra3 = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("visibility_result_exclude_select_list");
            if (stringArrayListExtra4 == null) {
                stringArrayListExtra4 = new java.util.ArrayList<>();
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.String str4 : stringArrayListExtra2) {
                java.lang.String g18 = ((b93.b) c93.a.a()).g(str4);
                if (g18 == null) {
                    g18 = "";
                }
                kotlin.jvm.internal.o.d(str4);
                arrayList4.add(new com.tencent.pigeon.sns.SnsFlutterLabelInfo(java.lang.Long.parseLong(str4), g18, new java.util.ArrayList()));
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.String str5 : stringArrayListExtra3) {
                kotlin.jvm.internal.o.d(str5);
                arrayList5.add(new com.tencent.pigeon.sns.SnsFlutterContactInfo(str5, aVar.m(str5)));
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (java.lang.String str6 : stringArrayListExtra4) {
                kotlin.jvm.internal.o.d(str6);
                arrayList6.add(new com.tencent.pigeon.sns.SnsFlutterContactInfo(str6, aVar.m(str6)));
            }
            com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp snsFlutterSelectContactAndLabelRsp = new com.tencent.pigeon.sns.SnsFlutterSelectContactAndLabelRsp(true, arrayList5, arrayList4, arrayList6);
            yz5.l lVar12 = this.f408173g;
            if (lVar12 != null) {
                lVar12.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(snsFlutterSelectContactAndLabelRsp)));
            }
        }
        this.f408173g = null;
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f408170d = (com.tencent.mm.ui.MMActivity) activity;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsSelectContactApi.Companion companion = com.tencent.pigeon.sns.PlatformSnsSelectContactApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsSelectContactApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f408170d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f408170d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsSelectContactApi.Companion companion = com.tencent.pigeon.sns.PlatformSnsSelectContactApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsSelectContactApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        binding.addActivityResultListener(this);
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f408170d = (com.tencent.mm.ui.MMActivity) activity;
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    public void selectContact(java.util.List current, java.util.List excludeToSelect, yz5.l callback) {
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.o.g(excludeToSelect, "excludeToSelect");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f408170d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PlatformSelectContactApiImpl", "selectContact >> activity is null");
            return;
        }
        this.f408171e = callback;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.MMActivity mMActivity = this.f408170d;
        kotlin.jvm.internal.o.d(mMActivity);
        intent.putExtra("titile", mMActivity.getString(com.tencent.mm.R.string.jbt));
        intent.putExtra("snsPostWhoCanSee", true);
        intent.putExtra("snsUploadWhoCanSssToShowSaveLabel", false);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206790k));
        if (!current.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = current.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.pigeon.sns.SnsFlutterContactInfo) it.next()).getUserName());
            }
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        }
        if (!excludeToSelect.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = excludeToSelect.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((com.tencent.pigeon.sns.SnsFlutterContactInfo) it6.next()).getUserName());
            }
            intent.putExtra("exclude_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 81);
        intent.putExtra("max_limit_num", Integer.MAX_VALUE);
        intent.putExtra("menu_label", i65.a.r(this.f408170d, com.tencent.mm.R.string.f490352sk));
        j45.l.v(this.f408170d, ".ui.contact.SelectContactUI", intent, com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void selectContactAndLabel(byte[] r19, yz5.l r20) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.t0.selectContactAndLabel(byte[], yz5.l):void");
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    public void selectContactWithVisibilityType(long j17, java.util.List current, java.util.List excludeToSelect, yz5.l callback) {
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.o.g(excludeToSelect, "excludeToSelect");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f408170d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PlatformSelectContactApiImpl", "selectContactWithVisibilityType >> activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.sns.SnsFlutterSelectContactRsp(false, kz5.p0.f313996d))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(current, 10));
        java.util.Iterator it = current.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.pigeon.sns.SnsFlutterContactInfo) it.next()).getUserName());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(excludeToSelect, 10));
        java.util.Iterator it6 = excludeToSelect.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.pigeon.sns.SnsFlutterContactInfo) it6.next()).getUserName());
        }
        this.f408174h = callback;
        int i17 = (int) j17;
        java.lang.String r17 = i17 == 3 ? i65.a.r(this.f408170d, com.tencent.mm.R.string.f493905ia) : i65.a.r(this.f408170d, com.tencent.mm.R.string.f493907pd);
        l.f fVar = (l.f) i95.n0.c(l.f.class);
        com.tencent.mm.ui.MMActivity mMActivity = this.f408170d;
        kotlin.jvm.internal.o.d(mMActivity);
        kotlin.jvm.internal.o.d(r17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList2);
        i.b bVar = (i.b) fVar;
        bVar.getClass();
        android.content.Intent intent = new android.content.Intent(mMActivity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        android.content.Intent a17 = bVar.a(mMActivity, arrayList3, arrayList4);
        a17.putExtra("titile", r17);
        pf5.j0.a(a17, cj5.d1.class);
        if (i17 == 3) {
            a17.putExtra("key_confirm_menu_color", 1);
            a17.putExtra("key_check_box_color", 1);
        } else {
            a17.putExtra("key_confirm_menu_color", 0);
            a17.putExtra("key_check_box_color", 0);
        }
        if (!arrayList3.isEmpty()) {
            a17.putExtra("min_limit_num", -1);
        }
        pf5.j0.a(a17, cj5.n1.class);
        pf5.j0.a(a17, cj5.b3.class);
        android.os.Bundle extras = a17.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList5.add(4011);
        arrayList5.add(intent);
        java.util.Collections.reverse(arrayList5);
        yj0.a.k(mMActivity, arrayList5.toArray(), "com/tencent/mm/feature/combine/CombineEntranceService", "goToMvvmContactPage", "(Landroid/app/Activity;ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsSelectContactApi
    public void selectLabel(java.util.List current, java.util.List excludeToSelect, yz5.l callback) {
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.o.g(excludeToSelect, "excludeToSelect");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f408170d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PlatformSelectContactApiImpl", "selectLabel >> activity is null");
            return;
        }
        this.f408172f = callback;
        android.content.Intent intent = new android.content.Intent();
        if (!current.isEmpty()) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = current.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.valueOf(((com.tencent.pigeon.sns.SnsFlutterLabelInfo) it.next()).getLabelId()));
            }
            intent.putStringArrayListExtra("label_id", arrayList);
        }
        if (!excludeToSelect.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(excludeToSelect, 10));
            java.util.Iterator it6 = excludeToSelect.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((com.tencent.pigeon.sns.SnsFlutterLabelInfo) it6.next()).getLabelId()));
            }
            intent.putStringArrayListExtra("contact_forbid_select_label_id_list", new java.util.ArrayList<>(arrayList2));
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f408170d;
        kotlin.jvm.internal.o.d(mMActivity);
        intent.setClassName(mMActivity, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f408170d;
        kotlin.jvm.internal.o.d(mMActivity2);
        mMActivity2.startActivityForResult(intent, com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE);
    }
}
