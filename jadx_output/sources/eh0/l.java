package eh0;

/* loaded from: classes5.dex */
public final class l implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh0.o f252890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh0.i f252891b;

    public l(eh0.o oVar, eh0.i iVar) {
        this.f252890a = oVar;
        this.f252891b = iVar;
    }

    @Override // e70.c0
    public void d(com.tencent.wechat.aff.ilink_stream.a abortInfo) {
        kotlin.jvm.internal.o.g(abortInfo, "abortInfo");
        eh0.o.wi(this.f252890a, this.f252891b, com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateServerAbort);
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.o.g(data, "data");
        eh0.o oVar = this.f252890a;
        oVar.getClass();
        java.lang.String str5 = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT;
        eh0.i iVar = this.f252891b;
        java.lang.String str6 = iVar.f252882e;
        long j17 = iVar.f252878a;
        java.lang.String str7 = "MicroMsg.WeClawStream.Service";
        if ((str6 == null || str6.length() == 0) || j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", "handleStreamData: talker or msgSvrId is empty. talker:" + str6 + ", msgSvrId:" + j17);
            return;
        }
        java.lang.String a17 = eh0.q.a(str6, j17, iVar.f252880c);
        java.lang.String Ni = oVar.Ni(str6, j17);
        java.util.Iterator it6 = data.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((com.tencent.mm.protobuf.g) next).i());
                java.lang.String optString = jSONObject.optString("type");
                if (kotlin.jvm.internal.o.b(optString, str5)) {
                    java.lang.String optString2 = jSONObject.optString(str5);
                    kotlin.jvm.internal.o.d(optString2);
                    if (optString2.length() > 0) {
                        iVar.f252885h.append(optString2);
                        if (iVar.f252886i) {
                            eh0.k.f252888a.d(str6, j17, iVar.a());
                            it = it6;
                            str2 = a17;
                            str3 = Ni;
                            str = str5;
                            str4 = str7;
                            try {
                                oVar.f252896e.c(str6, j17, iVar.f252879b, iVar.a());
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                com.tencent.mars.xlog.Log.e(str4, str2 + "handleStreamData parse error: " + e.getMessage());
                                a17 = str2;
                                Ni = str3;
                                str7 = str4;
                                i17 = i18;
                                str5 = str;
                                it6 = it;
                            }
                        } else {
                            it = it6;
                            str = str5;
                            str2 = a17;
                            str3 = Ni;
                            str4 = str7;
                            oVar.Zi(iVar);
                            eh0.g.f252875a.c(str3, iVar);
                            oVar.f252896e.a(str6, j17, iVar.f252879b, optString2);
                        }
                    } else {
                        it = it6;
                        str = str5;
                        str2 = a17;
                        str3 = Ni;
                        str4 = str7;
                    }
                } else {
                    it = it6;
                    str = str5;
                    str2 = a17;
                    str3 = Ni;
                    str4 = str7;
                    com.tencent.mars.xlog.Log.w(str4, str2 + "handleStreamData: unknown type:" + optString);
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                it = it6;
                str = str5;
                str2 = a17;
                str3 = Ni;
                str4 = str7;
            }
            a17 = str2;
            Ni = str3;
            str7 = str4;
            i17 = i18;
            str5 = str;
            it6 = it;
        }
    }

    @Override // e70.c0
    public void g(com.tencent.wechat.aff.ilink_stream.x error) {
        kotlin.jvm.internal.o.g(error, "error");
        eh0.o.wi(this.f252890a, this.f252891b, error);
    }

    @Override // e70.c0
    public void h() {
        eh0.o oVar = this.f252890a;
        oVar.getClass();
        eh0.i iVar = this.f252891b;
        java.lang.String str = iVar.f252882e;
        boolean z17 = str == null || str.length() == 0;
        long j17 = iVar.f252878a;
        if (!z17 && j17 != 0) {
            java.lang.String Ni = oVar.Ni(str, j17);
            oVar.Zi(iVar);
            eh0.g.f252875a.b(Ni);
            oVar.Bi(iVar);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeClawStream.Service", "handleStreamEnd: talker or msgSvrId is empty. talker:" + str + ", msgSvrId:" + j17);
    }

    @Override // e70.c0
    public void onTimeout() {
        eh0.o.wi(this.f252890a, this.f252891b, com.tencent.wechat.aff.ilink_stream.x.kIlinkStreamStateError);
    }
}
