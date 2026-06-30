package com.tencent.mm.protocal.protobuf;

/* loaded from: classes4.dex */
public class TimeLineObject extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f192185d = 0;
    public r45.y8 AppInfo;
    public java.lang.String ContentDesc;
    public r45.a90 ContentObj;
    public int CreateTime;
    public java.lang.String Id;
    public r45.ed4 Location;
    public int Privated;
    public java.lang.String UserName;
    public r45.q1 actionInfo;
    public r45.p76 bgmInfo;
    public java.lang.String canvasInfo;
    public int contentDescScene;
    public int contentDescShowType;
    public int contentattr;
    public r45.e73 gameShareCardObject;
    public boolean isExcerpt;
    public r45.n74 liteappInfo;
    public r45.d85 photoAccountReportInfo;
    public int publicBrandContactType;
    public java.lang.String publicFinderUserName;
    public java.lang.String publicPhotoAccountNickName;
    public java.lang.String publicPhotoAccountUserName;
    public java.lang.String publicUserName;
    public int showFlag;
    public int sightFolded;
    public int snsCoverOffset;
    public java.lang.String snsExcerptUrl;
    public java.lang.String sourceNickName;
    public java.lang.String sourceUserName;
    public java.lang.String statExtStr;
    public java.lang.String statisticsData;
    public r45.tf6 streamvideo;
    public r45.ib6 videoTemplate;
    public r45.y87 weappInfo;
    public r45.y97 webSearchInfo;

    public static final com.tencent.mm.protocal.protobuf.TimeLineObject create() {
        return new com.tencent.mm.protocal.protobuf.TimeLineObject();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.TimeLineObject)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) fVar;
        return n51.f.a(this.Id, timeLineObject.Id) && n51.f.a(this.UserName, timeLineObject.UserName) && n51.f.a(java.lang.Integer.valueOf(this.Privated), java.lang.Integer.valueOf(timeLineObject.Privated)) && n51.f.a(java.lang.Integer.valueOf(this.CreateTime), java.lang.Integer.valueOf(timeLineObject.CreateTime)) && n51.f.a(this.ContentDesc, timeLineObject.ContentDesc) && n51.f.a(this.Location, timeLineObject.Location) && n51.f.a(this.AppInfo, timeLineObject.AppInfo) && n51.f.a(this.ContentObj, timeLineObject.ContentObj) && n51.f.a(this.sourceUserName, timeLineObject.sourceUserName) && n51.f.a(this.sourceNickName, timeLineObject.sourceNickName) && n51.f.a(this.publicUserName, timeLineObject.publicUserName) && n51.f.a(java.lang.Integer.valueOf(this.contentDescShowType), java.lang.Integer.valueOf(timeLineObject.contentDescShowType)) && n51.f.a(java.lang.Integer.valueOf(this.contentDescScene), java.lang.Integer.valueOf(timeLineObject.contentDescScene)) && n51.f.a(this.statisticsData, timeLineObject.statisticsData) && n51.f.a(this.actionInfo, timeLineObject.actionInfo) && n51.f.a(java.lang.Integer.valueOf(this.contentattr), java.lang.Integer.valueOf(timeLineObject.contentattr)) && n51.f.a(this.streamvideo, timeLineObject.streamvideo) && n51.f.a(this.statExtStr, timeLineObject.statExtStr) && n51.f.a(this.canvasInfo, timeLineObject.canvasInfo) && n51.f.a(this.weappInfo, timeLineObject.weappInfo) && n51.f.a(java.lang.Integer.valueOf(this.sightFolded), java.lang.Integer.valueOf(timeLineObject.sightFolded)) && n51.f.a(this.webSearchInfo, timeLineObject.webSearchInfo) && n51.f.a(java.lang.Integer.valueOf(this.showFlag), java.lang.Integer.valueOf(timeLineObject.showFlag)) && n51.f.a(this.liteappInfo, timeLineObject.liteappInfo) && n51.f.a(this.videoTemplate, timeLineObject.videoTemplate) && n51.f.a(this.snsExcerptUrl, timeLineObject.snsExcerptUrl) && n51.f.a(java.lang.Boolean.valueOf(this.isExcerpt), java.lang.Boolean.valueOf(timeLineObject.isExcerpt)) && n51.f.a(this.gameShareCardObject, timeLineObject.gameShareCardObject) && n51.f.a(java.lang.Integer.valueOf(this.publicBrandContactType), java.lang.Integer.valueOf(timeLineObject.publicBrandContactType)) && n51.f.a(java.lang.Integer.valueOf(this.snsCoverOffset), java.lang.Integer.valueOf(timeLineObject.snsCoverOffset)) && n51.f.a(this.publicFinderUserName, timeLineObject.publicFinderUserName) && n51.f.a(this.bgmInfo, timeLineObject.bgmInfo) && n51.f.a(this.publicPhotoAccountUserName, timeLineObject.publicPhotoAccountUserName) && n51.f.a(this.publicPhotoAccountNickName, timeLineObject.publicPhotoAccountNickName) && n51.f.a(this.photoAccountReportInfo, timeLineObject.photoAccountReportInfo);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.Id;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.UserName;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.Privated);
            fVar.e(4, this.CreateTime);
            java.lang.String str3 = this.ContentDesc;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.ed4 ed4Var = this.Location;
            if (ed4Var != null) {
                fVar.i(6, ed4Var.computeSize());
                this.Location.writeFields(fVar);
            }
            r45.y8 y8Var = this.AppInfo;
            if (y8Var != null) {
                fVar.i(7, y8Var.computeSize());
                this.AppInfo.writeFields(fVar);
            }
            r45.a90 a90Var = this.ContentObj;
            if (a90Var != null) {
                fVar.i(8, a90Var.computeSize());
                this.ContentObj.writeFields(fVar);
            }
            java.lang.String str4 = this.sourceUserName;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.sourceNickName;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.publicUserName;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.contentDescShowType);
            fVar.e(13, this.contentDescScene);
            java.lang.String str7 = this.statisticsData;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            r45.q1 q1Var = this.actionInfo;
            if (q1Var != null) {
                fVar.i(15, q1Var.computeSize());
                this.actionInfo.writeFields(fVar);
            }
            fVar.e(16, this.contentattr);
            r45.tf6 tf6Var = this.streamvideo;
            if (tf6Var != null) {
                fVar.i(17, tf6Var.computeSize());
                this.streamvideo.writeFields(fVar);
            }
            java.lang.String str8 = this.statExtStr;
            if (str8 != null) {
                fVar.j(18, str8);
            }
            java.lang.String str9 = this.canvasInfo;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            r45.y87 y87Var = this.weappInfo;
            if (y87Var != null) {
                fVar.i(20, y87Var.computeSize());
                this.weappInfo.writeFields(fVar);
            }
            fVar.e(21, this.sightFolded);
            r45.y97 y97Var = this.webSearchInfo;
            if (y97Var != null) {
                fVar.i(22, y97Var.computeSize());
                this.webSearchInfo.writeFields(fVar);
            }
            fVar.e(23, this.showFlag);
            r45.n74 n74Var = this.liteappInfo;
            if (n74Var != null) {
                fVar.i(24, n74Var.computeSize());
                this.liteappInfo.writeFields(fVar);
            }
            r45.ib6 ib6Var = this.videoTemplate;
            if (ib6Var != null) {
                fVar.i(25, ib6Var.computeSize());
                this.videoTemplate.writeFields(fVar);
            }
            java.lang.String str10 = this.snsExcerptUrl;
            if (str10 != null) {
                fVar.j(26, str10);
            }
            fVar.a(27, this.isExcerpt);
            r45.e73 e73Var = this.gameShareCardObject;
            if (e73Var != null) {
                fVar.i(28, e73Var.computeSize());
                this.gameShareCardObject.writeFields(fVar);
            }
            fVar.e(29, this.publicBrandContactType);
            fVar.e(30, this.snsCoverOffset);
            java.lang.String str11 = this.publicFinderUserName;
            if (str11 != null) {
                fVar.j(31, str11);
            }
            r45.p76 p76Var = this.bgmInfo;
            if (p76Var != null) {
                fVar.i(32, p76Var.computeSize());
                this.bgmInfo.writeFields(fVar);
            }
            java.lang.String str12 = this.publicPhotoAccountUserName;
            if (str12 != null) {
                fVar.j(33, str12);
            }
            java.lang.String str13 = this.publicPhotoAccountNickName;
            if (str13 != null) {
                fVar.j(34, str13);
            }
            r45.d85 d85Var = this.photoAccountReportInfo;
            if (d85Var != null) {
                fVar.i(35, d85Var.computeSize());
                this.photoAccountReportInfo.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.Id;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.UserName;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int e17 = j17 + b36.f.e(3, this.Privated) + b36.f.e(4, this.CreateTime);
            java.lang.String str16 = this.ContentDesc;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            r45.ed4 ed4Var2 = this.Location;
            if (ed4Var2 != null) {
                e17 += b36.f.i(6, ed4Var2.computeSize());
            }
            r45.y8 y8Var2 = this.AppInfo;
            if (y8Var2 != null) {
                e17 += b36.f.i(7, y8Var2.computeSize());
            }
            r45.a90 a90Var2 = this.ContentObj;
            if (a90Var2 != null) {
                e17 += b36.f.i(8, a90Var2.computeSize());
            }
            java.lang.String str17 = this.sourceUserName;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.sourceNickName;
            if (str18 != null) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.publicUserName;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            int e18 = e17 + b36.f.e(12, this.contentDescShowType) + b36.f.e(13, this.contentDescScene);
            java.lang.String str20 = this.statisticsData;
            if (str20 != null) {
                e18 += b36.f.j(14, str20);
            }
            r45.q1 q1Var2 = this.actionInfo;
            if (q1Var2 != null) {
                e18 += b36.f.i(15, q1Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(16, this.contentattr);
            r45.tf6 tf6Var2 = this.streamvideo;
            if (tf6Var2 != null) {
                e19 += b36.f.i(17, tf6Var2.computeSize());
            }
            java.lang.String str21 = this.statExtStr;
            if (str21 != null) {
                e19 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.canvasInfo;
            if (str22 != null) {
                e19 += b36.f.j(19, str22);
            }
            r45.y87 y87Var2 = this.weappInfo;
            if (y87Var2 != null) {
                e19 += b36.f.i(20, y87Var2.computeSize());
            }
            int e27 = e19 + b36.f.e(21, this.sightFolded);
            r45.y97 y97Var2 = this.webSearchInfo;
            if (y97Var2 != null) {
                e27 += b36.f.i(22, y97Var2.computeSize());
            }
            int e28 = e27 + b36.f.e(23, this.showFlag);
            r45.n74 n74Var2 = this.liteappInfo;
            if (n74Var2 != null) {
                e28 += b36.f.i(24, n74Var2.computeSize());
            }
            r45.ib6 ib6Var2 = this.videoTemplate;
            if (ib6Var2 != null) {
                e28 += b36.f.i(25, ib6Var2.computeSize());
            }
            java.lang.String str23 = this.snsExcerptUrl;
            if (str23 != null) {
                e28 += b36.f.j(26, str23);
            }
            int a17 = e28 + b36.f.a(27, this.isExcerpt);
            r45.e73 e73Var2 = this.gameShareCardObject;
            if (e73Var2 != null) {
                a17 += b36.f.i(28, e73Var2.computeSize());
            }
            int e29 = a17 + b36.f.e(29, this.publicBrandContactType) + b36.f.e(30, this.snsCoverOffset);
            java.lang.String str24 = this.publicFinderUserName;
            if (str24 != null) {
                e29 += b36.f.j(31, str24);
            }
            r45.p76 p76Var2 = this.bgmInfo;
            if (p76Var2 != null) {
                e29 += b36.f.i(32, p76Var2.computeSize());
            }
            java.lang.String str25 = this.publicPhotoAccountUserName;
            if (str25 != null) {
                e29 += b36.f.j(33, str25);
            }
            java.lang.String str26 = this.publicPhotoAccountNickName;
            if (str26 != null) {
                e29 += b36.f.j(34, str26);
            }
            r45.d85 d85Var2 = this.photoAccountReportInfo;
            return d85Var2 != null ? e29 + b36.f.i(35, d85Var2.computeSize()) : e29;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                timeLineObject.Id = aVar2.k(intValue);
                return 0;
            case 2:
                timeLineObject.UserName = aVar2.k(intValue);
                return 0;
            case 3:
                timeLineObject.Privated = aVar2.g(intValue);
                return 0;
            case 4:
                timeLineObject.CreateTime = aVar2.g(intValue);
                return 0;
            case 5:
                timeLineObject.ContentDesc = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ed4 ed4Var3 = new r45.ed4();
                    if (bArr != null && bArr.length > 0) {
                        ed4Var3.parseFrom(bArr);
                    }
                    timeLineObject.Location = ed4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.y8 y8Var3 = new r45.y8();
                    if (bArr2 != null && bArr2.length > 0) {
                        y8Var3.parseFrom(bArr2);
                    }
                    timeLineObject.AppInfo = y8Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.a90 a90Var3 = new r45.a90();
                    if (bArr3 != null && bArr3.length > 0) {
                        a90Var3.parseFrom(bArr3);
                    }
                    timeLineObject.ContentObj = a90Var3;
                }
                return 0;
            case 9:
                timeLineObject.sourceUserName = aVar2.k(intValue);
                return 0;
            case 10:
                timeLineObject.sourceNickName = aVar2.k(intValue);
                return 0;
            case 11:
                timeLineObject.publicUserName = aVar2.k(intValue);
                return 0;
            case 12:
                timeLineObject.contentDescShowType = aVar2.g(intValue);
                return 0;
            case 13:
                timeLineObject.contentDescScene = aVar2.g(intValue);
                return 0;
            case 14:
                timeLineObject.statisticsData = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.q1 q1Var3 = new r45.q1();
                    if (bArr4 != null && bArr4.length > 0) {
                        q1Var3.parseFrom(bArr4);
                    }
                    timeLineObject.actionInfo = q1Var3;
                }
                return 0;
            case 16:
                timeLineObject.contentattr = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.tf6 tf6Var3 = new r45.tf6();
                    if (bArr5 != null && bArr5.length > 0) {
                        tf6Var3.parseFrom(bArr5);
                    }
                    timeLineObject.streamvideo = tf6Var3;
                }
                return 0;
            case 18:
                timeLineObject.statExtStr = aVar2.k(intValue);
                return 0;
            case 19:
                timeLineObject.canvasInfo = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.y87 y87Var3 = new r45.y87();
                    if (bArr6 != null && bArr6.length > 0) {
                        y87Var3.parseFrom(bArr6);
                    }
                    timeLineObject.weappInfo = y87Var3;
                }
                return 0;
            case 21:
                timeLineObject.sightFolded = aVar2.g(intValue);
                return 0;
            case 22:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    r45.y97 y97Var3 = new r45.y97();
                    if (bArr7 != null && bArr7.length > 0) {
                        y97Var3.parseFrom(bArr7);
                    }
                    timeLineObject.webSearchInfo = y97Var3;
                }
                return 0;
            case 23:
                timeLineObject.showFlag = aVar2.g(intValue);
                return 0;
            case 24:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j39.get(i39);
                    r45.n74 n74Var3 = new r45.n74();
                    if (bArr8 != null && bArr8.length > 0) {
                        n74Var3.parseFrom(bArr8);
                    }
                    timeLineObject.liteappInfo = n74Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size9 = j47.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j47.get(i47);
                    r45.ib6 ib6Var3 = new r45.ib6();
                    if (bArr9 != null && bArr9.length > 0) {
                        ib6Var3.parseFrom(bArr9);
                    }
                    timeLineObject.videoTemplate = ib6Var3;
                }
                return 0;
            case 26:
                timeLineObject.snsExcerptUrl = aVar2.k(intValue);
                return 0;
            case 27:
                timeLineObject.isExcerpt = aVar2.c(intValue);
                return 0;
            case 28:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size10 = j48.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j48.get(i48);
                    r45.e73 e73Var3 = new r45.e73();
                    if (bArr10 != null && bArr10.length > 0) {
                        e73Var3.parseFrom(bArr10);
                    }
                    timeLineObject.gameShareCardObject = e73Var3;
                }
                return 0;
            case 29:
                timeLineObject.publicBrandContactType = aVar2.g(intValue);
                return 0;
            case 30:
                timeLineObject.snsCoverOffset = aVar2.g(intValue);
                return 0;
            case 31:
                timeLineObject.publicFinderUserName = aVar2.k(intValue);
                return 0;
            case 32:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size11 = j49.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j49.get(i49);
                    r45.p76 p76Var3 = new r45.p76();
                    if (bArr11 != null && bArr11.length > 0) {
                        p76Var3.parseFrom(bArr11);
                    }
                    timeLineObject.bgmInfo = p76Var3;
                }
                return 0;
            case 33:
                timeLineObject.publicPhotoAccountUserName = aVar2.k(intValue);
                return 0;
            case 34:
                timeLineObject.publicPhotoAccountNickName = aVar2.k(intValue);
                return 0;
            case 35:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size12 = j57.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j57.get(i57);
                    r45.d85 d85Var3 = new r45.d85();
                    if (bArr12 != null && bArr12.length > 0) {
                        d85Var3.parseFrom(bArr12);
                    }
                    timeLineObject.photoAccountReportInfo = d85Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setActionInfo(r45.q1 q1Var) {
        this.actionInfo = q1Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setAppInfo(r45.y8 y8Var) {
        this.AppInfo = y8Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setBgmInfo(r45.p76 p76Var) {
        this.bgmInfo = p76Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setCanvasInfo(java.lang.String str) {
        this.canvasInfo = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setContentDesc(java.lang.String str) {
        this.ContentDesc = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setContentDescScene(int i17) {
        this.contentDescScene = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setContentDescShowType(int i17) {
        this.contentDescShowType = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setContentObj(r45.a90 a90Var) {
        this.ContentObj = a90Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setContentattr(int i17) {
        this.contentattr = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setCreateTime(int i17) {
        this.CreateTime = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setGameShareCardObject(r45.e73 e73Var) {
        this.gameShareCardObject = e73Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setId(java.lang.String str) {
        this.Id = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setIsExcerpt(boolean z17) {
        this.isExcerpt = z17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setLiteappInfo(r45.n74 n74Var) {
        this.liteappInfo = n74Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setLocation(r45.ed4 ed4Var) {
        this.Location = ed4Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPhotoAccountReportInfo(r45.d85 d85Var) {
        this.photoAccountReportInfo = d85Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPrivated(int i17) {
        this.Privated = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPublicBrandContactType(int i17) {
        this.publicBrandContactType = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPublicFinderUserName(java.lang.String str) {
        this.publicFinderUserName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPublicPhotoAccountNickName(java.lang.String str) {
        this.publicPhotoAccountNickName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPublicPhotoAccountUserName(java.lang.String str) {
        this.publicPhotoAccountUserName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setPublicUserName(java.lang.String str) {
        this.publicUserName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setShowFlag(int i17) {
        this.showFlag = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setSightFolded(int i17) {
        this.sightFolded = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setSnsCoverOffset(int i17) {
        this.snsCoverOffset = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setSnsExcerptUrl(java.lang.String str) {
        this.snsExcerptUrl = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setSourceNickName(java.lang.String str) {
        this.sourceNickName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setSourceUserName(java.lang.String str) {
        this.sourceUserName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setStatExtStr(java.lang.String str) {
        this.statExtStr = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setStatisticsData(java.lang.String str) {
        this.statisticsData = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setStreamvideo(r45.tf6 tf6Var) {
        this.streamvideo = tf6Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setUserName(java.lang.String str) {
        this.UserName = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setVideoTemplate(r45.ib6 ib6Var) {
        this.videoTemplate = ib6Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setWeappInfo(r45.y87 y87Var) {
        this.weappInfo = y87Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.TimeLineObject setWebSearchInfo(r45.y97 y97Var) {
        this.webSearchInfo = y97Var;
        return this;
    }
}
