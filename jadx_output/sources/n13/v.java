package n13;

/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final n13.v f334140a = new n13.v();

    public final l15.c a(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5) {
        v05.b bVar = new v05.b();
        int i19 = bVar.f368365d;
        bVar.set(i19 + 6, 97);
        bVar.set(i19 + 2, str == null ? "" : str);
        bVar.set(i19 + 3, str2 == null ? "" : str2);
        java.lang.String str6 = str3 == null ? "" : str3;
        int i27 = bVar.f432315e;
        bVar.set(i27 + 14, str6);
        r05.d dVar = new r05.d();
        dVar.t(i17);
        if (str == null) {
            str = "";
        }
        dVar.u(str);
        if (str2 == null) {
            str2 = "";
        }
        dVar.o(str2);
        dVar.q(i18);
        if (str3 == null) {
            str3 = "";
        }
        dVar.p(str3);
        if (str4 == null) {
            str4 = "";
        }
        dVar.r(str4);
        if (str5 == null) {
            str5 = "";
        }
        dVar.s(str5);
        bVar.set(i27 + 21, dVar);
        l15.c cVar = new l15.c();
        cVar.q(bVar);
        return cVar;
    }

    public final l15.c b(java.lang.String str, java.lang.String str2, long j17) {
        v05.b bVar = new v05.b();
        if (str == null) {
            str = "";
        }
        int i17 = bVar.f368365d;
        bVar.set(i17 + 2, str);
        v05.a aVar = new v05.a();
        if (str2 == null) {
            str2 = "";
        }
        aVar.N(str2);
        aVar.set(aVar.f368364d + 0, java.lang.Long.valueOf(j17));
        bVar.set(bVar.f432315e + 8, aVar);
        bVar.set(i17 + 6, java.lang.Integer.valueOf(((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Ai(j17)));
        l15.c cVar = new l15.c();
        cVar.q(bVar);
        return cVar;
    }

    public final l15.c c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.HashMap params) {
        kotlin.jvm.internal.o.g(params, "params");
        l15.c cVar = new l15.c();
        v05.b bVar = new v05.b();
        y05.c cVar2 = new y05.c();
        y05.d dVar = new y05.d();
        dVar.o(str);
        dVar.n(str2);
        dVar.q(str3);
        dVar.r(str4);
        dVar.p(str5);
        cVar2.k(dVar);
        bVar.set(bVar.f432315e + 40, cVar2);
        z05.d dVar2 = new z05.d();
        java.lang.String str6 = (java.lang.String) params.get("liteapp_appId");
        if (str6 == null) {
            str6 = "";
        }
        dVar2.set(dVar2.f368365d + 0, str6);
        java.lang.String str7 = (java.lang.String) params.get("liteapp_path");
        if (str7 == null) {
            str7 = "";
        }
        dVar2.x(str7);
        java.lang.String str8 = (java.lang.String) params.get("liteapp_query");
        if (str8 == null) {
            str8 = "";
        }
        dVar2.y(str8);
        java.lang.String str9 = (java.lang.String) params.get("liteapp_minVersion");
        dVar2.w(str9 != null ? str9 : "");
        cVar.u(dVar2);
        cVar.q(bVar);
        return cVar;
    }

    public final l15.c d(java.util.HashMap params) {
        kotlin.jvm.internal.o.g(params, "params");
        l15.c cVar = new l15.c();
        z05.d dVar = new z05.d();
        java.lang.String str = (java.lang.String) params.get("appId");
        if (str == null) {
            str = "";
        }
        dVar.set(dVar.f368365d + 0, str);
        java.lang.String str2 = (java.lang.String) params.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        if (str2 == null) {
            str2 = "";
        }
        dVar.x(str2);
        java.lang.String str3 = (java.lang.String) params.get("query");
        if (str3 == null) {
            str3 = "";
        }
        dVar.y(str3);
        java.lang.String str4 = (java.lang.String) params.get("minVersion");
        if (str4 == null) {
            str4 = "";
        }
        dVar.w(str4);
        java.lang.String str5 = (java.lang.String) params.get("srcId");
        if (str5 == null) {
            str5 = "";
        }
        dVar.A(str5);
        java.lang.String str6 = (java.lang.String) params.get(ya.b.SOURCE);
        if (str6 == null) {
            str6 = "";
        }
        dVar.z(str6);
        dVar.B(kotlin.jvm.internal.o.b(params.get("isTransparent"), "1"));
        dVar.u(kotlin.jvm.internal.o.b(params.get("hideIcon"), "1"));
        java.lang.String str7 = (java.lang.String) params.get("isGameShareCard");
        if (str7 == null) {
            str7 = "";
        }
        dVar.t(str7);
        dVar.s(kotlin.jvm.internal.o.b(params.get("forbidForward"), "1"));
        cVar.u(dVar);
        z05.b bVar = new z05.b();
        bVar.q((java.lang.String) params.get("bizData"));
        bVar.u((java.lang.String) params.get(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY));
        bVar.t((java.lang.String) params.get("gameShareId"));
        bVar.s((java.lang.String) params.get("gameShareData"));
        bVar.w((java.lang.String) params.get("isVideo"));
        bVar.r((java.lang.String) params.get("duration"));
        cVar.t(bVar);
        v05.b bVar2 = new v05.b();
        java.lang.String str8 = (java.lang.String) params.get("srcId");
        if (str8 == null) {
            str8 = "";
        }
        int i17 = bVar2.f368365d;
        bVar2.set(i17 + 0, str8);
        java.lang.String str9 = (java.lang.String) params.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (str9 == null) {
            str9 = "";
        }
        bVar2.set(i17 + 2, str9);
        java.lang.String str10 = (java.lang.String) params.get("url");
        if (str10 == null) {
            str10 = "";
        }
        bVar2.set(i17 + 9, str10);
        java.lang.String str11 = (java.lang.String) params.get("desc");
        if (str11 == null) {
            str11 = "";
        }
        bVar2.set(i17 + 3, str11);
        java.lang.String str12 = (java.lang.String) params.get("img_url");
        if (str12 == null) {
            str12 = "";
        }
        int i18 = bVar2.f432315e;
        bVar2.set(i18 + 14, str12);
        java.lang.String str13 = (java.lang.String) params.get("srcUserName");
        if (str13 == null) {
            str13 = "";
        }
        bVar2.set(i18 + 11, str13);
        java.lang.String str14 = (java.lang.String) params.get("srcDisplayname");
        if (str14 == null) {
            str14 = "";
        }
        bVar2.set(i18 + 12, str14);
        bVar2.set(i17 + 6, 68);
        z05.c cVar2 = new z05.c();
        java.lang.String str15 = (java.lang.String) params.get("imageConf");
        if (str15 == null) {
            str15 = "";
        }
        cVar2.s(str15);
        cVar2.t(z05.a.a((java.lang.String) params.get("oldImageInfo")));
        java.lang.String str16 = (java.lang.String) params.get("transformedThumbUrl");
        cVar2.u(str16 != null ? str16 : "");
        bVar2.set(i18 + 64, cVar2);
        cVar.q(bVar2);
        return cVar;
    }

    public final l15.c e(java.util.HashMap params) {
        kotlin.jvm.internal.o.g(params, "params");
        v05.b bVar = new v05.b();
        java.lang.String str = (java.lang.String) params.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (str == null) {
            str = "";
        }
        int i17 = bVar.f368365d;
        bVar.set(i17 + 2, str);
        java.lang.String str2 = (java.lang.String) params.get("url");
        if (str2 == null) {
            str2 = "";
        }
        bVar.set(i17 + 9, str2);
        java.lang.String str3 = (java.lang.String) params.get("desc");
        if (str3 == null) {
            str3 = "";
        }
        bVar.set(i17 + 3, str3);
        java.lang.String str4 = (java.lang.String) params.get("img_url");
        if (str4 == null) {
            str4 = "";
        }
        int i18 = bVar.f432315e;
        bVar.set(i18 + 14, str4);
        java.lang.String str5 = (java.lang.String) params.get("srcUserName");
        if (str5 == null) {
            str5 = "";
        }
        bVar.set(i18 + 11, str5);
        java.lang.String str6 = (java.lang.String) params.get("srcDisplayname");
        if (str6 == null) {
            str6 = "";
        }
        bVar.set(i18 + 12, str6);
        java.lang.String str7 = (java.lang.String) params.get("appId");
        if (str7 == null) {
            str7 = "";
        }
        bVar.set(i17 + 0, str7);
        bVar.set(i17 + 6, 5);
        r05.g gVar = new r05.g();
        gVar.z(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) params.get("item_show_type"), -1));
        gVar.A(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) params.get("picCount"), 0));
        gVar.w(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) params.get("coverPicWidth")));
        gVar.t(com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) params.get("coverPicHeight")));
        java.lang.String str8 = (java.lang.String) params.get("coverPicImageUrl");
        gVar.u(str8 != null ? str8 : "");
        java.lang.String str9 = (java.lang.String) params.get("isfindercontact");
        if (str9 == null) {
            str9 = "0";
        }
        gVar.y(str9);
        gVar.x(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) params.get("duration"), -1));
        bVar.set(i18 + 25, gVar);
        l15.c cVar = new l15.c();
        cVar.q(bVar);
        return cVar;
    }
}
