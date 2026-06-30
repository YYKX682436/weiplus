package l53;

/* loaded from: classes8.dex */
public final class h implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l53.i f316658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316659e;

    public h(l53.i iVar, android.content.Context context) {
        this.f316658d = iVar;
        this.f316659e = context;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.vfs.x1 m17;
        l53.i iVar = this.f316658d;
        iVar.getClass();
        if (gVar != null) {
            gVar.toString();
        }
        if (hVar != null) {
            hVar.toString();
        }
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "duplicate request, ignore this request, media id is %s", str);
        } else if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            l53.a aVar = iVar.f316662c;
            if (aVar != null) {
                aVar.a("upload start failed");
            }
        } else if (gVar == null && hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                l53.a aVar2 = iVar.f316662c;
                if (aVar2 != null) {
                    aVar2.a("upload failed");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,sceneResult.videoUrl =  " + hVar.field_fileUrl + " sceneResult.thumbUrl =  " + hVar.field_thumbUrl);
                java.lang.String str2 = hVar.field_fileUrl;
                java.lang.String str3 = hVar.field_thumbUrl;
                if (!iVar.f316664e) {
                    if (str2 == null || str2.length() == 0) {
                        com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed videoUrl is null");
                        l53.a aVar3 = iVar.f316662c;
                        if (aVar3 != null) {
                            aVar3.a("videoUrl is null upload failed");
                        }
                    } else {
                        if (str3 == null || str3.length() == 0) {
                            com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed thumbUrl is null");
                            l53.a aVar4 = iVar.f316662c;
                            if (aVar4 != null) {
                                aVar4.a("thumbUrl is null upload failed");
                            }
                        } else {
                            java.lang.String t17 = (!r26.i0.y(str3, "https", false) && r26.i0.y(str3, "http", false)) ? r26.i0.t(str3, "http", "https", false) : str3;
                            com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
                            m33.k1 k1Var = iVar.f316660a;
                            java.lang.String str4 = k1Var.f323305c;
                            ((be0.e) oVar).getClass();
                            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str4, true);
                            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(k1Var.f323305c);
                            java.lang.String str5 = a17.f213279f;
                            if (str5 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, false, false);
                                if (!str5.equals(l17)) {
                                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                }
                            }
                            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                            int i19 = (int) ((m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213233c : 0L);
                            com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi appid = " + k1Var.f323303a + " videoUrl = " + str2 + " thumbUrl = " + str3 + "  duration = " + d17.f162382a + "width = " + d17.f162384c + "   height = " + d17.f162385d + "  size= " + i19);
                            q33.a aVar5 = new q33.a();
                            q33.f fVar = new q33.f();
                            fVar.f359946d = k1Var.f323303a;
                            fVar.f359948f = str2;
                            fVar.f359949g = t17;
                            fVar.f359950h = (int) ((float) java.lang.Math.ceil((double) (((float) d17.f162382a) / ((float) 1000))));
                            fVar.f359951i = d17.f162384c;
                            fVar.f359952m = d17.f162385d;
                            fVar.f359953n = i19;
                            java.lang.String str6 = k1Var.f323307e;
                            if (str6 == null) {
                                str6 = "";
                            }
                            fVar.f359954o = str6;
                            java.lang.String str7 = k1Var.f323308f;
                            fVar.f359955p = str7 != null ? str7 : "";
                            fVar.f359956q = k1Var.f323306d;
                            aVar5.f359932d = fVar;
                            aVar5.f359933e = com.tencent.mm.sdk.platformtools.w2.a(k1Var.f323305c + java.lang.System.currentTimeMillis());
                            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                            lVar.f70664a = aVar5;
                            lVar.f70665b = new q33.b();
                            lVar.f70666c = "/cgi-bin/mmgame-bin/addwxagvideo";
                            lVar.f70667d = 20452;
                            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new l53.d(iVar, t17, this.f316659e));
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
