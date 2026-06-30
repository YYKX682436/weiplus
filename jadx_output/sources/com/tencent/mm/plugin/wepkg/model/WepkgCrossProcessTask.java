package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class WepkgCrossProcessTask extends com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask> CREATOR = new com.tencent.mm.plugin.wepkg.model.p();

    /* renamed from: h, reason: collision with root package name */
    public int f188343h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.model.WepkgVersion f188344i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f188345m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo f188346n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile f188347o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f188348p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f188349q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f188350r;

    public /* synthetic */ WepkgCrossProcessTask(android.os.Parcel parcel, com.tencent.mm.plugin.wepkg.model.p pVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
    public void B(android.os.Parcel parcel) {
        this.f188343h = parcel.readInt();
        this.f188344i = (com.tencent.mm.plugin.wepkg.model.WepkgVersion) parcel.readParcelable(com.tencent.mm.plugin.wepkg.model.WepkgVersion.class.getClassLoader());
        if (this.f188345m == null) {
            this.f188345m = new java.util.ArrayList();
        }
        parcel.readList(this.f188345m, com.tencent.mm.plugin.wepkg.model.WepkgVersion.class.getClassLoader());
        this.f188347o = (com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile) parcel.readParcelable(com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile.class.getClassLoader());
        if (this.f188348p == null) {
            this.f188348p = new java.util.ArrayList();
        }
        parcel.readList(this.f188348p, com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile.class.getClassLoader());
        this.f188349q = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
    public void C(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f188343h);
        parcel.writeParcelable(this.f188344i, i17);
        if (this.f188345m == null) {
            this.f188345m = new java.util.ArrayList();
        }
        parcel.writeList(this.f188345m);
        parcel.writeParcelable(this.f188347o, i17);
        if (this.f188348p == null) {
            this.f188348p = new java.util.ArrayList();
        }
        parcel.writeList(this.f188348p);
        parcel.writeString(this.f188349q);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f188350r;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        wz4.e D0;
        android.database.Cursor rawQuery;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i17 = this.f188343h;
        boolean z17 = true;
        if (i17 == 1001) {
            this.f188333f = true;
        } else if (i17 != 1002) {
            switch (i17) {
                case 2002:
                    com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = this.f188344i;
                    if (wepkgVersion != null && !com.tencent.mm.sdk.platformtools.t8.K0(wepkgVersion.f188374d)) {
                        wz4.f L0 = wz4.f.L0();
                        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion2 = this.f188344i;
                        wepkgVersion2.getClass();
                        wz4.e eVar = new wz4.e();
                        eVar.field_pkgId = wepkgVersion2.f188374d;
                        eVar.field_appId = wepkgVersion2.f188375e;
                        eVar.field_version = wepkgVersion2.f188376f;
                        eVar.field_pkgPath = wepkgVersion2.f188377g;
                        eVar.field_disableWvCache = wepkgVersion2.f188378h;
                        eVar.field_clearPkgTime = wepkgVersion2.f188379i;
                        eVar.field_checkIntervalTime = wepkgVersion2.f188380m;
                        eVar.field_packMethod = wepkgVersion2.f188381n;
                        eVar.field_domain = wepkgVersion2.f188382o;
                        eVar.field_md5 = wepkgVersion2.f188383p;
                        eVar.field_downloadUrl = wepkgVersion2.f188384q;
                        eVar.field_pkgSize = wepkgVersion2.f188385r;
                        eVar.field_downloadNetType = wepkgVersion2.f188386s;
                        eVar.field_nextCheckTime = wepkgVersion2.f188387t;
                        eVar.field_createTime = wepkgVersion2.f188388u;
                        eVar.field_charset = wepkgVersion2.f188389v;
                        eVar.field_bigPackageReady = wepkgVersion2.f188390w;
                        eVar.field_preloadFilesReady = wepkgVersion2.f188391x;
                        eVar.field_preloadFilesAtomic = wepkgVersion2.f188392y;
                        eVar.field_totalDownloadCount = wepkgVersion2.f188393z;
                        eVar.field_downloadTriggerType = wepkgVersion2.A;
                        if (L0.f450803d && !com.tencent.mm.sdk.platformtools.t8.K0(eVar.field_pkgId)) {
                            com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo wePkgDiffInfo = this.f188346n;
                            if (wePkgDiffInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(wePkgDiffInfo.f188339h) && (D0 = wz4.f.L0().D0(eVar.field_pkgId)) != null && com.tencent.mm.vfs.w6.j(D0.field_pkgPath)) {
                                wePkgDiffInfo.f188335d = D0.field_pkgId;
                                wePkgDiffInfo.f188336e = D0.field_version;
                                wePkgDiffInfo.f188337f = D0.field_pkgPath;
                                wz4.b.z0().d(wePkgDiffInfo.f188335d);
                                wz4.b z07 = wz4.b.z0();
                                wz4.a aVar = new wz4.a();
                                aVar.field_pkgId = wePkgDiffInfo.f188335d;
                                aVar.field_oldVersion = wePkgDiffInfo.f188336e;
                                aVar.field_oldPath = wePkgDiffInfo.f188337f;
                                aVar.field_version = wePkgDiffInfo.f188338g;
                                aVar.field_downloadUrl = wePkgDiffInfo.f188339h;
                                aVar.field_md5 = wePkgDiffInfo.f188340i;
                                aVar.field_pkgSize = wePkgDiffInfo.f188341m;
                                aVar.field_downloadNetType = wePkgDiffInfo.f188342n;
                                z07.insert(aVar);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertDiffPkg");
                            }
                            wz4.f.L0().z0(eVar.field_pkgId);
                            wz4.d.J0().y0(eVar.field_pkgId);
                            java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
                            eVar.field_nextCheckTime = com.tencent.mm.sdk.platformtools.t8.i1() + eVar.field_checkIntervalTime;
                            eVar.field_createTime = com.tencent.mm.sdk.platformtools.t8.i1();
                            eVar.field_accessTime = com.tencent.mm.sdk.platformtools.t8.i1();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "insertPkgVersion pkgid:%s, version:%s, ret:%s", eVar.field_pkgId, eVar.field_version, java.lang.Boolean.valueOf(L0.insert(eVar)));
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f188348p)) {
                            for (com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile : this.f188348p) {
                                if (wepkgPreloadFile != null) {
                                    wz4.d J0 = wz4.d.J0();
                                    wz4.c cVar = new wz4.c();
                                    cVar.field_key = wepkgPreloadFile.f188362d;
                                    java.lang.String str2 = wepkgPreloadFile.f188363e;
                                    cVar.field_pkgId = str2;
                                    cVar.field_version = wepkgPreloadFile.f188364f;
                                    cVar.field_filePath = wepkgPreloadFile.f188365g;
                                    java.lang.String str3 = wepkgPreloadFile.f188366h;
                                    cVar.field_rid = str3;
                                    cVar.field_mimeType = wepkgPreloadFile.f188367i;
                                    cVar.field_md5 = wepkgPreloadFile.f188368m;
                                    cVar.field_downloadUrl = wepkgPreloadFile.f188369n;
                                    cVar.field_size = wepkgPreloadFile.f188370o;
                                    cVar.field_downloadNetType = wepkgPreloadFile.f188371p;
                                    cVar.field_completeDownload = wepkgPreloadFile.f188372q;
                                    cVar.field_createTime = wepkgPreloadFile.f188373r;
                                    if (J0.f450799d) {
                                        if (J0.D0(str2, str3) == null) {
                                            java.lang.Object obj2 = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
                                            cVar.field_createTime = com.tencent.mm.sdk.platformtools.t8.i1();
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "insertPreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", cVar.field_pkgId, cVar.field_version, cVar.field_rid, java.lang.Boolean.valueOf(J0.insert(cVar)));
                                        } else {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "relacePreloadFile pkgid:%s, version:%s, rid:%s, ret:%s", cVar.field_pkgId, cVar.field_version, cVar.field_rid, java.lang.Boolean.valueOf(J0.replace(cVar)));
                                        }
                                    }
                                }
                            }
                        }
                        this.f188333f = true;
                        break;
                    }
                    break;
                case 2003:
                    java.lang.String str4 = null;
                    if (this.f188344i != null) {
                        wz4.f L02 = wz4.f.L0();
                        if (L02.f450803d) {
                            android.database.Cursor rawQuery2 = L02.rawQuery(java.lang.String.format("select * from %s where %s=0 and %s=1 and %s<1 and %s<?", "WepkgVersion", "bigPackageReady", "preloadFilesAtomic", "autoDownloadCount", "packageDownloadCount"), java.lang.String.valueOf(3));
                            if (rawQuery2 != null) {
                                if (rawQuery2.moveToFirst()) {
                                    int count = rawQuery2.getCount();
                                    rawQuery2.move(count > 1 ? com.tencent.mm.sdk.platformtools.t8.R(count - 1, 0) : 0);
                                    wz4.e eVar2 = new wz4.e();
                                    eVar2.convertFrom(rawQuery2);
                                    rawQuery2.close();
                                    L02.y0(eVar2.field_pkgId);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:true", eVar2.field_pkgId, eVar2.field_version);
                                    str4 = eVar2.field_pkgId;
                                } else {
                                    rawQuery2.close();
                                    android.database.Cursor rawQuery3 = L02.rawQuery(java.lang.String.format("select * from %s where %s=0 and %s<1 and %s<?", "WepkgVersion", "bigPackageReady", "autoDownloadCount", "packageDownloadCount"), java.lang.String.valueOf(3));
                                    if (rawQuery3 != null) {
                                        if (rawQuery3.moveToFirst()) {
                                            int count2 = rawQuery3.getCount();
                                            rawQuery3.move(count2 > 1 ? com.tencent.mm.sdk.platformtools.t8.R(count2 - 1, 0) : 0);
                                            wz4.e eVar3 = new wz4.e();
                                            eVar3.convertFrom(rawQuery3);
                                            rawQuery3.close();
                                            L02.y0(eVar3.field_pkgId);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, bigPackageReady:false, preloadFilesAtomic:false", eVar3.field_pkgId, eVar3.field_version);
                                            str4 = eVar3.field_pkgId;
                                        } else {
                                            rawQuery3.close();
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "randomNeedDownloadPkgid no download record in DB");
                                        }
                                    }
                                }
                            }
                            str4 = null;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            wz4.d J02 = wz4.d.J0();
                            boolean z18 = J02.f450799d;
                            if (z18 && (rawQuery = J02.rawQuery(java.lang.String.format("select * from %s where %s=0 and %s<1 and %s<?", "WepkgPreloadFiles", "completeDownload", "autoDownloadCount", "fileDownloadCount"), java.lang.String.valueOf(3))) != null) {
                                if (rawQuery.moveToFirst()) {
                                    int count3 = rawQuery.getCount();
                                    rawQuery.move(count3 > 1 ? com.tencent.mm.sdk.platformtools.t8.R(count3 - 1, 0) : 0);
                                    wz4.c cVar2 = new wz4.c();
                                    cVar2.convertFrom(rawQuery);
                                    rawQuery.close();
                                    java.lang.String str5 = cVar2.field_pkgId;
                                    java.lang.String str6 = cVar2.field_rid;
                                    if (z18 && !com.tencent.mm.sdk.platformtools.t8.K0(str5) && !com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(J02.execSQL("WepkgPreloadFiles", java.lang.String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", "WepkgPreloadFiles", "autoDownloadCount", "autoDownloadCount", "pkgId", str5, "rid", str6))));
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid exist record in DB, pkgid:%s, version:%s, rid:%s", cVar2.field_pkgId, cVar2.field_version, cVar2.field_rid);
                                    str = cVar2.field_pkgId;
                                    str4 = str;
                                } else {
                                    rawQuery.close();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "randomNeedDownloadPkgid no download record in DB");
                                }
                            }
                            str = null;
                            str4 = str;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                            wz4.f L03 = wz4.f.L0();
                            if (L03.f450803d) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(L03.execSQL("WepkgVersion", java.lang.String.format("update %s set %s=0", "WepkgVersion", "autoDownloadCount"))));
                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgPreloadFilesRecord resetAutoDownloadCount ret:%s", java.lang.Boolean.valueOf(L03.execSQL("WepkgPreloadFiles", java.lang.String.format("update %s set %s=0", "WepkgPreloadFiles", "autoDownloadCount"))));
                            }
                        }
                        this.f188344i.f188374d = str4;
                        break;
                    }
                    break;
                case 2004:
                    if (this.f188344i != null) {
                        this.f188333f = wz4.f.L0().P0(this.f188344i.f188374d);
                        break;
                    }
                    break;
                case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS /* 2005 */:
                    wz4.f L04 = wz4.f.L0();
                    if (L04.f450803d) {
                        java.lang.String format = java.lang.String.format("select * from %s where %s < ? - %s", "WepkgVersion", "accessTime", "clearPkgTime");
                        java.lang.Object obj3 = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
                        android.database.Cursor rawQuery4 = L04.rawQuery(format, java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "getNeedCleanRecords queryStr:%s", format);
                        if (rawQuery4 == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "cursor is null");
                        } else if (rawQuery4.moveToFirst()) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            do {
                                com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion3 = new com.tencent.mm.plugin.wepkg.model.WepkgVersion();
                                wz4.e eVar4 = new wz4.e();
                                eVar4.convertFrom(rawQuery4);
                                wepkgVersion3.b(eVar4);
                                arrayList3.add(wepkgVersion3);
                            } while (rawQuery4.moveToNext());
                            rawQuery4.close();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "record list size:%s", java.lang.Integer.valueOf(arrayList3.size()));
                            arrayList = arrayList3;
                            this.f188345m = arrayList;
                            this.f188333f = true;
                            break;
                        } else {
                            rawQuery4.close();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "no record");
                        }
                    }
                    arrayList = null;
                    this.f188345m = arrayList;
                    this.f188333f = true;
                case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END /* 2006 */:
                    if (this.f188344i != null) {
                        wz4.f L05 = wz4.f.L0();
                        java.lang.String str7 = this.f188344i.f188374d;
                        if (!L05.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                            z17 = false;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addTotalDownloadCount ret:%s", java.lang.Boolean.valueOf(L05.execSQL("WepkgVersion", java.lang.String.format("update %s set %s=%s+1 where %s='%s'", "WepkgVersion", "totalDownloadCount", "totalDownloadCount", "pkgId", str7))));
                        }
                        this.f188333f = z17;
                        break;
                    }
                    break;
                default:
                    switch (i17) {
                        case 3001:
                            if (this.f188344i != null) {
                                wz4.e D02 = wz4.f.L0().D0(this.f188344i.f188374d);
                                if (D02 != null) {
                                    this.f188344i.b(D02);
                                    this.f188333f = true;
                                    break;
                                } else {
                                    this.f188344i = null;
                                    break;
                                }
                            }
                            break;
                        case 3002:
                            if (this.f188344i != null) {
                                wz4.e J03 = wz4.f.L0().J0(this.f188344i.f188374d);
                                if (J03 != null) {
                                    this.f188344i.b(J03);
                                    this.f188333f = true;
                                    break;
                                } else {
                                    this.f188344i = null;
                                    break;
                                }
                            }
                            break;
                        case 3003:
                            if (this.f188344i != null) {
                                this.f188333f = wz4.f.L0().b1(this.f188344i.f188374d);
                                break;
                            }
                            break;
                        case 3004:
                            if (this.f188344i != null) {
                                wz4.f L06 = wz4.f.L0();
                                com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion4 = this.f188344i;
                                this.f188333f = L06.d1(wepkgVersion4.f188374d, wepkgVersion4.f188378h, wepkgVersion4.f188379i, wepkgVersion4.f188380m);
                                break;
                            }
                            break;
                        case 3005:
                            if (this.f188344i != null) {
                                wz4.f L07 = wz4.f.L0();
                                com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion5 = this.f188344i;
                                this.f188333f = L07.W0(wepkgVersion5.f188374d, wepkgVersion5.f188377g, wepkgVersion5.f188390w);
                                break;
                            }
                            break;
                        case 3006:
                            if (this.f188344i != null) {
                                wz4.f L08 = wz4.f.L0();
                                com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion6 = this.f188344i;
                                this.f188333f = L08.i1(wepkgVersion6.f188374d, wepkgVersion6.f188391x);
                                break;
                            }
                            break;
                        case com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_RUNTIME_EXCEPTION /* 3007 */:
                            if (this.f188344i != null) {
                                this.f188333f = wz4.f.L0().f1(this.f188344i.f188374d);
                                break;
                            }
                            break;
                        case com.tencent.shadow.dynamic.host.FailedException.ERROR_CODE_RELOAD_LOADER_EXCEPTION /* 3008 */:
                            if (this.f188344i != null) {
                                wz4.f L09 = wz4.f.L0();
                                java.lang.String str8 = this.f188344i.f188374d;
                                if (!L09.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                                    z17 = false;
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord addPackageDownloadCount ret:%s", java.lang.Boolean.valueOf(L09.execSQL("WepkgVersion", java.lang.String.format("update %s set %s=%s+1 where %s='%s'", "WepkgVersion", "packageDownloadCount", "packageDownloadCount", "pkgId", str8))));
                                }
                                this.f188333f = z17;
                                break;
                            }
                            break;
                        case 3009:
                            if (this.f188344i != null) {
                                wz4.f L010 = wz4.f.L0();
                                java.lang.String str9 = this.f188344i.f188374d;
                                if (!L010.f450803d || com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                                    z17 = false;
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "WepkgVersionRecord resetPackageDownloadCount ret:%s", java.lang.Boolean.valueOf(L010.execSQL("WepkgVersion", java.lang.String.format("update %s set %s=0 where %s='%s'", "WepkgVersion", "packageDownloadCount", "pkgId", str9))));
                                }
                                this.f188333f = z17;
                                break;
                            }
                            break;
                        default:
                            switch (i17) {
                                case 4001:
                                    com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion7 = this.f188344i;
                                    if (wepkgVersion7 != null && !com.tencent.mm.sdk.platformtools.t8.K0(wepkgVersion7.f188374d)) {
                                        try {
                                            this.f188348p = wz4.d.J0().z0(this.f188344i.f188374d);
                                        } catch (java.lang.Exception unused) {
                                        }
                                        this.f188333f = true;
                                        break;
                                    }
                                    break;
                                case 4002:
                                    if (this.f188347o != null) {
                                        wz4.d J04 = wz4.d.J0();
                                        com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile2 = this.f188347o;
                                        this.f188333f = J04.L0(wepkgPreloadFile2.f188363e, wepkgPreloadFile2.f188366h, wepkgPreloadFile2.f188365g, wepkgPreloadFile2.f188372q);
                                        break;
                                    }
                                    break;
                                case com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE /* 4003 */:
                                    if (this.f188344i != null) {
                                        wz4.d J05 = wz4.d.J0();
                                        java.lang.String str10 = this.f188344i.f188374d;
                                        if (J05.f450799d && !com.tencent.mm.sdk.platformtools.t8.K0(str10)) {
                                            java.lang.String format2 = java.lang.String.format("select * from %s where %s=?", "WepkgPreloadFiles", "pkgId");
                                            android.database.Cursor rawQuery5 = J05.rawQuery(format2, str10);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "getPreLoadFileList queryStr:%s", format2);
                                            if (rawQuery5 == null) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "cursor is null");
                                            } else if (rawQuery5.moveToFirst()) {
                                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                                do {
                                                    com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile3 = new com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile();
                                                    wz4.c cVar3 = new wz4.c();
                                                    cVar3.convertFrom(rawQuery5);
                                                    wepkgPreloadFile3.b(cVar3);
                                                    arrayList4.add(wepkgPreloadFile3);
                                                } while (rawQuery5.moveToNext());
                                                rawQuery5.close();
                                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "record list size:%s", java.lang.Integer.valueOf(arrayList4.size()));
                                                arrayList2 = arrayList4;
                                                this.f188348p = arrayList2;
                                                this.f188333f = true;
                                                break;
                                            } else {
                                                rawQuery5.close();
                                                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "no record");
                                            }
                                        }
                                        arrayList2 = null;
                                        this.f188348p = arrayList2;
                                        this.f188333f = true;
                                    }
                                    break;
                                case com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE /* 4004 */:
                                    if (this.f188347o != null) {
                                        wz4.d J06 = wz4.d.J0();
                                        com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile4 = this.f188347o;
                                        wz4.c D03 = J06.D0(wepkgPreloadFile4.f188363e, wepkgPreloadFile4.f188366h);
                                        if (D03 != null) {
                                            this.f188347o.b(D03);
                                            this.f188333f = true;
                                            break;
                                        } else {
                                            this.f188347o = null;
                                            break;
                                        }
                                    }
                                    break;
                                case com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE /* 4005 */:
                                    if (this.f188347o != null) {
                                        wz4.d J07 = wz4.d.J0();
                                        com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile wepkgPreloadFile5 = this.f188347o;
                                        java.lang.String str11 = wepkgPreloadFile5.f188363e;
                                        java.lang.String str12 = wepkgPreloadFile5.f188366h;
                                        if (!J07.f450799d || com.tencent.mm.sdk.platformtools.t8.K0(str11) || com.tencent.mm.sdk.platformtools.t8.K0(str12)) {
                                            z17 = false;
                                        } else {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord addFileDownloadCount ret:%s", java.lang.Boolean.valueOf(J07.execSQL("WepkgPreloadFiles", java.lang.String.format("update %s set %s=%s+1 where %s='%s' and %s='%s'", "WepkgPreloadFiles", "fileDownloadCount", "fileDownloadCount", "pkgId", str11, "rid", str12))));
                                        }
                                        this.f188333f = z17;
                                        break;
                                    }
                                    break;
                                case com.google.android.gms.wearable.WearableStatusCodes.DUPLICATE_CAPABILITY /* 4006 */:
                                    if (this.f188347o != null) {
                                        wz4.d J08 = wz4.d.J0();
                                        java.lang.String str13 = this.f188347o.f188363e;
                                        if (!J08.f450799d || com.tencent.mm.sdk.platformtools.t8.K0(str13)) {
                                            z17 = false;
                                        } else {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgPreloadFilesStorage", "WepkgPreloadFilesRecord resetFileDownloadCount ret:%s", java.lang.Boolean.valueOf(J08.execSQL("WepkgPreloadFiles", java.lang.String.format("update %s set %s=0 where %s='%s'", "WepkgPreloadFiles", "fileDownloadCount", "pkgId", str13))));
                                        }
                                        this.f188333f = z17;
                                        break;
                                    }
                                    break;
                            }
                    }
            }
        } else {
            this.f188333f = com.tencent.mm.plugin.game.commlib.i.a();
        }
        c();
    }

    public WepkgCrossProcessTask() {
        this.f188343h = -1;
        this.f188344i = new com.tencent.mm.plugin.wepkg.model.WepkgVersion();
        this.f188345m = new java.util.ArrayList();
        this.f188346n = new com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo();
        this.f188347o = new com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile();
        this.f188348p = new java.util.ArrayList();
    }

    private WepkgCrossProcessTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
