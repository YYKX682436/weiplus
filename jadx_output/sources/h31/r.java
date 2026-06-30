package h31;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f278427a;

    /* renamed from: b, reason: collision with root package name */
    public int f278428b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f278429c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f278430d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f278431e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f278432f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f278433g;

    /* renamed from: h, reason: collision with root package name */
    public h31.a f278434h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f278435i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f278436j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f278437k;

    /* renamed from: l, reason: collision with root package name */
    public m31.p1 f278438l;

    /* renamed from: m, reason: collision with root package name */
    public fl1.c0 f278439m;

    /* renamed from: n, reason: collision with root package name */
    public final e31.k f278440n;

    /* renamed from: o, reason: collision with root package name */
    public long f278441o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f278442p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData f278443q;

    /* renamed from: r, reason: collision with root package name */
    public int f278444r;

    /* renamed from: s, reason: collision with root package name */
    public final j31.b f278445s;

    public r(java.lang.ref.WeakReference weakReference, int i17, java.lang.String bizUsername, java.lang.String bizAppId, java.lang.String subscribeUrl, java.lang.String content, java.lang.String extInfo, h31.a aVar) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(bizAppId, "bizAppId");
        kotlin.jvm.internal.o.g(subscribeUrl, "subscribeUrl");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f278427a = weakReference;
        this.f278428b = i17;
        this.f278429c = bizUsername;
        this.f278430d = bizAppId;
        this.f278431e = subscribeUrl;
        this.f278432f = content;
        this.f278433g = extInfo;
        this.f278434h = aVar;
        this.f278436j = new java.util.ArrayList();
        this.f278440n = e31.n.f247087a.a("name_biz");
        this.f278441o = -1L;
        this.f278442p = new byte[]{0};
        this.f278445s = new j31.b();
    }

    public final void a(android.content.Context context, int i17, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.ref.WeakReference weakReference;
        android.content.Context context2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.msgsubscription.ShowInfo showInfo = subscribeMsgRequestResult.f71794t;
        int i18 = showInfo != null ? showInfo.f71770d : -1;
        h31.a aVar = this.f278434h;
        if (aVar != null && (u3Var = ((m31.y1) aVar).f323240a.f71876e) != null) {
            u3Var.dismiss();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        int i19 = subscribeMsgRequestResult.f71797w;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        java.lang.String str9 = subscribeMsgRequestResult.f71798x;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "dispatchSuccessResult showType: %s, action: %d, errCode: %d, errMsg: %s", valueOf, valueOf2, valueOf3, str9);
        h31.s sVar = h31.s.f278446a;
        boolean z17 = i17 == 3 || i17 == 1;
        com.tencent.mm.msgsubscription.ShowInfo showInfo2 = subscribeMsgRequestResult.f71794t;
        if (!z17) {
            if (i17 == 2) {
                if (i18 == 1) {
                    b(2, currentTimeMillis);
                    if (showInfo2 == null || (str = showInfo2.f71771e) == null) {
                        str = "";
                    }
                    if (showInfo2 == null || (str2 = showInfo2.f71772f) == null) {
                        str2 = "";
                    }
                    d(context, str, str2, new h31.h(subscribeMsgRequestResult, this, i17));
                    return;
                }
                if (i18 == 2) {
                    b(3, currentTimeMillis);
                    if (showInfo2 == null || (str3 = showInfo2.f71772f) == null) {
                        str3 = "";
                    }
                    e(str3, new h31.i(subscribeMsgRequestResult, this, i17));
                    return;
                }
                if (i18 == 4) {
                    b(5, currentTimeMillis);
                    if (showInfo2 == null || (str4 = showInfo2.f71772f) == null) {
                        str4 = "";
                    }
                    h31.g gVar = new h31.g(subscribeMsgRequestResult, this, i17);
                    if ((str4.length() > 0) && (weakReference = this.f278427a) != null && (context2 = (android.content.Context) weakReference.get()) != null) {
                        db5.t7.h(context2, str4);
                    }
                    gVar.invoke();
                    return;
                }
                b(i18 != 0 ? i18 != 3 ? -1 : 4 : 1, currentTimeMillis);
                if (i19 == 0) {
                    h31.a aVar2 = this.f278434h;
                    if (aVar2 != null) {
                        ((m31.y1) aVar2).c(subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                h31.a aVar3 = this.f278434h;
                if (aVar3 != null) {
                    ((m31.y1) aVar3).a(i17, i19, str9);
                    return;
                }
                return;
            }
            return;
        }
        if (i18 != 0) {
            if (i18 == 1) {
                b(2, currentTimeMillis);
                if (showInfo2 == null || (str5 = showInfo2.f71771e) == null) {
                    str5 = "";
                }
                if (showInfo2 == null || (str6 = showInfo2.f71772f) == null) {
                    str6 = "";
                }
                d(context, str5, str6, new h31.b(subscribeMsgRequestResult, this, i17));
                return;
            }
            if (i18 == 2) {
                b(3, currentTimeMillis);
                if (showInfo2 == null || (str7 = showInfo2.f71772f) == null) {
                    str7 = "";
                }
                e(str7, new h31.c(subscribeMsgRequestResult, this, i17));
                return;
            }
            if (i18 == 3) {
                b(4, currentTimeMillis);
                h31.e eVar = new h31.e(subscribeMsgRequestResult, this, i17);
                com.tencent.mm.ui.widget.dialog.j0 C = db5.e1.C(context, showInfo2 != null ? showInfo2.f71772f : null, showInfo2 != null ? showInfo2.f71771e : null, context.getString(com.tencent.mm.R.string.jnd), context.getString(com.tencent.mm.R.string.f490347sg), false, new h31.l(this, eVar, context, subscribeMsgRequestResult), new h31.m(eVar));
                this.f278437k = C;
                if (C != null) {
                    C.setCanceledOnTouchOutside(false);
                    return;
                }
                return;
            }
            if (i18 != 4) {
                b(-1, currentTimeMillis);
                java.lang.String string = context.getString(com.tencent.mm.R.string.jnf);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                e(string, new h31.f(subscribeMsgRequestResult, this, i17));
                return;
            }
            b(5, currentTimeMillis);
            if (showInfo2 == null || (str8 = showInfo2.f71772f) == null) {
                str8 = "";
            }
            e(str8, new h31.d(subscribeMsgRequestResult, this, i17));
            return;
        }
        if (i19 != 0) {
            h31.a aVar4 = this.f278434h;
            if (aVar4 != null) {
                ((m31.y1) aVar4).a(i17, i19, str9);
                return;
            }
            return;
        }
        b(1, currentTimeMillis);
        java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult.f71785h;
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeRequestDialog list is empty and not show dialog");
            h31.a aVar5 = this.f278434h;
            if (aVar5 != null) {
                ((m31.y1) aVar5).a(this.f278428b, 10002, "template list empty");
            }
            r9 = false;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : arrayList) {
                arrayList2.add(new m31.q0(subscribeMsgTmpItem.f71805h == 1, subscribeMsgTmpItem.f71802e, subscribeMsgTmpItem.f71806i, subscribeMsgTmpItem.f71803f, subscribeMsgTmpItem.f71804g));
                j31.b bVar = this.f278445s;
                bVar.f297366d.add(subscribeMsgTmpItem.f71803f);
                bVar.f297367e.add(java.lang.Integer.valueOf(subscribeMsgTmpItem.f71805h == 0 ? 0 : 1));
            }
            com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) kz5.n0.Z(arrayList);
            int i27 = subscribeMsgTmpItem2 != null ? subscribeMsgTmpItem2.f71804g : 2;
            int size = arrayList2.size();
            int i28 = subscribeMsgRequestResult.f71793s;
            boolean z18 = size == 1 && i28 == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeRequestDialog size: %d, showStyle: %d, singleMode: %b, templateType: %d", java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(i28), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i27));
            h31.n nVar = new h31.n(context, arrayList2, z18, new h31.o(this, subscribeMsgRequestResult));
            this.f278438l = nVar;
            nVar.W = new h31.p(this);
            java.lang.String str10 = subscribeMsgRequestResult.f71795u;
            if (str10 == null) {
                str10 = "";
            }
            nVar.T = str10;
            android.widget.TextView textView = nVar.f323189p;
            textView.setText(str10);
            textView.setContentDescription(nVar.T);
            m31.p1 p1Var = this.f278438l;
            if (p1Var != null) {
                java.lang.String str11 = subscribeMsgRequestResult.f71796v;
                if (str11 == null) {
                    str11 = "";
                }
                p1Var.k(str11);
            }
            if (z18) {
                ((m31.q0) kz5.n0.X(arrayList2)).f323200a = true;
            }
            m31.p1 p1Var2 = this.f278438l;
            if (p1Var2 != null) {
                java.lang.String value = subscribeMsgRequestResult.f71783f;
                kotlin.jvm.internal.o.g(value, "value");
                android.widget.TextView textView2 = p1Var2.f323188o;
                textView2.setText(value);
                textView2.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                textView2.getPaint().setStrokeWidth(0.8f);
            }
            m31.p1 p1Var3 = this.f278438l;
            if (p1Var3 != null) {
                java.lang.String value2 = subscribeMsgRequestResult.f71782e;
                kotlin.jvm.internal.o.g(value2, "value");
                p1Var3.M = value2;
            }
            m31.p1 p1Var4 = this.f278438l;
            com.tencent.mm.msgsubscription.WordingInfo wordingInfo = subscribeMsgRequestResult.f71788n;
            if (p1Var4 != null) {
                kotlin.jvm.internal.o.d(wordingInfo);
                java.lang.String value3 = wordingInfo.f71821d;
                kotlin.jvm.internal.o.g(value3, "value");
                android.widget.TextView textView3 = p1Var4.f323187n;
                textView3.setText(value3);
                textView3.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                textView3.getPaint().setStrokeWidth(0.8f);
            }
            m31.p1 p1Var5 = this.f278438l;
            if (p1Var5 != null) {
                kotlin.jvm.internal.o.d(wordingInfo);
                java.lang.String value4 = wordingInfo.f71822e;
                kotlin.jvm.internal.o.g(value4, "value");
                p1Var5.f323192s.setText(value4);
            }
            m31.p1 p1Var6 = this.f278438l;
            if (p1Var6 != null) {
                kotlin.jvm.internal.o.d(wordingInfo);
                java.lang.String value5 = wordingInfo.f71823f;
                kotlin.jvm.internal.o.g(value5, "value");
                p1Var6.f323191r.setText(value5);
            }
            m31.p1 p1Var7 = this.f278438l;
            if (p1Var7 != null) {
                p1Var7.V = com.tencent.mm.R.drawable.bhm;
            }
            if (p1Var7 != null) {
                kotlin.jvm.internal.o.d(wordingInfo);
                java.lang.String str12 = wordingInfo.f71825h;
                if (str12 == null) {
                    str12 = "";
                }
                p1Var7.N = str12;
            }
            m31.p1 p1Var8 = this.f278438l;
            if (p1Var8 != null) {
                boolean z19 = !subscribeMsgRequestResult.f71786i;
                p1Var8.Q = z19;
                android.view.View view = p1Var8.f323199z;
                int i29 = z19 ? 0 : 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(i29));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setShowAlwaysKeepView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog", "setShowAlwaysKeepView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            m31.p1 p1Var9 = this.f278438l;
            if (p1Var9 != null) {
                boolean z27 = !subscribeMsgRequestResult.f71787m;
                p1Var9.S = z27;
                p1Var9.f323198y.setVisibility(z27 ? 0 : 8);
            }
            m31.p1 p1Var10 = this.f278438l;
            if ((p1Var10 != null && p1Var10.Q) && p1Var10 != null) {
                kotlin.jvm.internal.o.d(wordingInfo);
                p1Var10.h(wordingInfo.f71824g);
            }
            m31.p1 p1Var11 = this.f278438l;
            if ((p1Var11 != null && p1Var11.S) && p1Var11 != null) {
                kotlin.jvm.internal.o.d(wordingInfo);
                java.lang.String value6 = wordingInfo.f71826i;
                kotlin.jvm.internal.o.g(value6, "value");
                p1Var11.R = value6;
                android.widget.TextView textView4 = p1Var11.f323198y;
                textView4.setVisibility(0);
                textView4.setText(p1Var11.R);
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            m31.p1 p1Var12 = this.f278438l;
            objArr[0] = p1Var12 != null ? java.lang.Boolean.valueOf(p1Var12.Q) : null;
            m31.p1 p1Var13 = this.f278438l;
            objArr[1] = p1Var13 != null ? java.lang.Boolean.valueOf(p1Var13.S) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeMsgRequestDialog showAlways: %s, showReject: %s", objArr);
            m31.p1 p1Var14 = this.f278438l;
            if (p1Var14 != null) {
                p1Var14.L = new h31.q(this);
            }
            if (this.f278439m == null) {
                this.f278439m = new fl1.c0(context, null);
                if (context instanceof android.app.Activity) {
                    ((android.app.Activity) context).addContentView(this.f278439m, new android.view.ViewGroup.LayoutParams(-1, -2));
                }
            }
            m31.p1 p1Var15 = this.f278438l;
            if (p1Var15 != null) {
                p1Var15.i(2);
            }
            fl1.c0 c0Var = this.f278439m;
            if (c0Var != null) {
                c0Var.c(this.f278438l);
            }
            j31.e eVar2 = j31.e.f297392a;
            int size2 = arrayList2.size();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgReporter", "createSession templateCount: %d", java.lang.Integer.valueOf(size2));
            java.lang.System.currentTimeMillis();
            j31.e.f297395d = size2;
            ((java.util.ArrayList) j31.e.f297393b).clear();
            ((java.util.ArrayList) j31.e.f297394c).clear();
            if (size2 > 0) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(size2);
                for (int i37 = 0; i37 < size2; i37++) {
                    arrayList4.add(0);
                }
                j31.e.f297394c = arrayList4;
            }
        }
        h31.a aVar6 = this.f278434h;
        if (aVar6 != null) {
            ((m31.y1) aVar6).b(r9, subscribeMsgRequestResult);
        }
    }

    public final void b(int i17, long j17) {
        if (this.f278444r == 1) {
            j31.e eVar = j31.e.f297392a;
            java.lang.String bizUsername = this.f278429c;
            kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
            java.lang.String content = this.f278432f;
            kotlin.jvm.internal.o.g(content, "content");
            jx3.f.INSTANCE.d(17639, c01.z1.r() + '#' + bizUsername + '#' + j17, java.lang.Integer.valueOf(i17), content);
        }
    }

    public final void c() {
        int i17 = this.f278428b;
        e31.k kVar = this.f278440n;
        java.lang.String str = this.f278433g;
        java.lang.String str2 = this.f278430d;
        if (i17 != 1) {
            if (i17 == 2) {
                java.lang.String str3 = this.f278429c;
                java.util.ArrayList arrayList = this.f278435i;
                kotlin.jvm.internal.o.d(arrayList);
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "doSubscribeMsg bizUsername: %s, appId: %s, template size: %s", str3, str2, java.lang.Integer.valueOf(arrayList.size()));
                e31.o oVar = new e31.o();
                oVar.f247096h = true;
                java.lang.String str4 = this.f278429c;
                kotlin.jvm.internal.o.g(str4, "<set-?>");
                oVar.f247089a = str4;
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                oVar.f247090b = str2;
                java.util.List list = oVar.f247091c;
                java.util.ArrayList arrayList2 = this.f278435i;
                kotlin.jvm.internal.o.d(arrayList2);
                ((java.util.ArrayList) list).addAll(arrayList2);
                oVar.f247092d = true;
                byte[] bArr = this.f278442p;
                kotlin.jvm.internal.o.g(bArr, "<set-?>");
                oVar.f247093e = bArr;
                oVar.f247094f = this.f278443q;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                oVar.f247095g = str;
                oVar.f247097i = new h31.j(this);
                this.f278441o = kVar != null ? ((g31.l) kVar).x(oVar) : -1L;
                return;
            }
            if (i17 != 3) {
                return;
            }
        }
        java.lang.String str5 = this.f278431e;
        boolean z17 = str5.length() == 0;
        java.util.ArrayList arrayList3 = this.f278436j;
        if (z17 && arrayList3.isEmpty()) {
            h31.a aVar = this.f278434h;
            if (aVar != null) {
                ((m31.y1) aVar).a(this.f278428b, 10001, "templateIdList empty");
                return;
            }
            return;
        }
        if (str.length() > 0) {
            java.lang.String optString = new org.json.JSONObject(str).optString(dm.i4.COL_USERNAME);
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() > 0) {
                this.f278429c = optString;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "getSubscribeMsgTemplateList bizUsername: %s, bizAppId: %s, url: %s, templateIdList size: %s", this.f278429c, str2, str5, java.lang.Integer.valueOf(arrayList3.size()));
        java.lang.String str6 = this.f278429c;
        j31.b bVar = this.f278445s;
        bVar.getClass();
        kotlin.jvm.internal.o.g(str6, "<set-?>");
        bVar.f297363a = str6;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        bVar.f297364b = str2;
        try {
            if (str.length() > 0) {
                java.lang.String optString2 = new org.json.JSONObject(str).optString("sessionid");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                bVar.f297365c = optString2;
            }
        } catch (java.lang.Exception unused) {
        }
        h31.k kVar2 = new h31.k(this);
        if (this.f278429c.length() > 0) {
            if (kVar != null) {
                java.lang.String username = this.f278429c;
                kotlin.jvm.internal.o.g(username, "username");
                k31.b bVar2 = ((g31.l) kVar).f268089b;
                bVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgDataLoader", "getSubscribeListByUsername username: %s, url: %s, templateIdList size: %s", username, str5, java.lang.Integer.valueOf(arrayList3.size()));
                k31.a aVar2 = bVar2.f303822a;
                if (aVar2 != null) {
                    l31.q qVar = new l31.q(username, "", str5, arrayList3, str, aVar2, kVar2);
                    k31.o.f303850a.b(aVar2, qVar);
                    r1 = qVar.hashCode();
                }
            }
            this.f278441o = r1;
            return;
        }
        if (!(str2.length() > 0)) {
            h31.a aVar3 = this.f278434h;
            if (aVar3 != null) {
                ((m31.y1) aVar3).a(this.f278428b, -1, "username or appId invalid");
                return;
            }
            return;
        }
        if (kVar != null) {
            k31.b bVar3 = ((g31.l) kVar).f268089b;
            bVar3.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgDataLoader", "getSubscribeListByAppId appId: %s, url: %s, templateIdList size: %s", str2, str5, java.lang.Integer.valueOf(arrayList3.size()));
            k31.a aVar4 = bVar3.f303822a;
            if (aVar4 != null) {
                l31.q qVar2 = new l31.q("", str2, str5, arrayList3, str, aVar4, kVar2);
                k31.o.f303850a.b(aVar4, qVar2);
                r1 = qVar2.hashCode();
            }
        }
        this.f278441o = r1;
    }

    public final void d(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnClickListener onClickListener) {
        if (!(str2.length() > 0)) {
            str2 = context.getString(com.tencent.mm.R.string.jne);
            kotlin.jvm.internal.o.d(str2);
        }
        db5.e1.E(context, str2, str, context.getResources().getString(com.tencent.mm.R.string.f490455vj), false, onClickListener);
    }

    public final void e(java.lang.String str, yz5.a aVar) {
        java.lang.ref.WeakReference weakReference;
        android.content.Context context;
        if ((str.length() > 0) && (weakReference = this.f278427a) != null && (context = (android.content.Context) weakReference.get()) != null) {
            dp.a.makeText(context, str, 0).show();
        }
        aVar.invoke();
    }
}
