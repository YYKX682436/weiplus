package com.tencent.mm.protocal.protobuf;

/* loaded from: classes4.dex */
public class SnsObject extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f192184d = 0;
    public int BlackContactTagIdListCount;
    public int BlackListCount;
    public int CommentCount;
    public int CommentUserListCount;
    public int CreateTime;
    public int DeleteFlag;
    public int ExtFlag;
    public int FlowerFlag;
    public int FlowerUserListCount;
    public int GroupContactTagIdListCount;
    public int GroupCount;
    public int GroupUserCount;
    public int GuideFinder;
    public int GuideQW;
    public int GuideTop;
    public long Id;
    public int InTopList;
    public int IsNotRichText;
    public int LikeCount;
    public int LikeFlag;
    public int LikeUserListCount;
    public int NewWithTaListCount;
    public java.lang.String Nickname;
    public int NoChange;
    public r45.cu5 ObjectDesc;
    public r45.cu5 ObjectOperations;
    public int ObjectType;
    public r45.kb5 PreDownloadInfo;
    public int RecentInteractUserCount;
    public long ReferId;
    public java.lang.String ReferUsername;
    public r45.da6 SnsRedEnvelops;
    public java.lang.String Username;
    public int VisibilityType;
    public r45.o76 WeAppInfo;
    public int WeiShangFeedType;
    public int WeiShangSellerType;
    public int WeiShangVideoSourceType;
    public int WithChatroomListCount;
    public int WithTaHasOther;
    public int WithTaListCount;
    public int WithUserCount;
    public int WithUserListCount;
    public java.util.LinkedList<r45.e86> LikeUserList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.e86> CommentUserList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.e86> WithUserList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.a96> GroupList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.du5> BlackList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.du5> GroupUser = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.du5> WithTaList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.e86> FlowerUserList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.e86> NewWithTaList = new java.util.LinkedList<>();
    public java.util.LinkedList<java.lang.Integer> BlackContactTagIdList = new java.util.LinkedList<>();
    public java.util.LinkedList<java.lang.Integer> GroupContactTagIdList = new java.util.LinkedList<>();
    public java.util.LinkedList<r45.du5> RecentInteractUserList = new java.util.LinkedList<>();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.SnsObject)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.Id), java.lang.Long.valueOf(snsObject.Id)) && n51.f.a(this.Username, snsObject.Username) && n51.f.a(this.Nickname, snsObject.Nickname) && n51.f.a(java.lang.Integer.valueOf(this.CreateTime), java.lang.Integer.valueOf(snsObject.CreateTime)) && n51.f.a(this.ObjectDesc, snsObject.ObjectDesc) && n51.f.a(java.lang.Integer.valueOf(this.LikeFlag), java.lang.Integer.valueOf(snsObject.LikeFlag)) && n51.f.a(java.lang.Integer.valueOf(this.LikeCount), java.lang.Integer.valueOf(snsObject.LikeCount)) && n51.f.a(java.lang.Integer.valueOf(this.LikeUserListCount), java.lang.Integer.valueOf(snsObject.LikeUserListCount)) && n51.f.a(this.LikeUserList, snsObject.LikeUserList) && n51.f.a(java.lang.Integer.valueOf(this.CommentCount), java.lang.Integer.valueOf(snsObject.CommentCount)) && n51.f.a(java.lang.Integer.valueOf(this.CommentUserListCount), java.lang.Integer.valueOf(snsObject.CommentUserListCount)) && n51.f.a(this.CommentUserList, snsObject.CommentUserList) && n51.f.a(java.lang.Integer.valueOf(this.WithUserCount), java.lang.Integer.valueOf(snsObject.WithUserCount)) && n51.f.a(java.lang.Integer.valueOf(this.WithUserListCount), java.lang.Integer.valueOf(snsObject.WithUserListCount)) && n51.f.a(this.WithUserList, snsObject.WithUserList) && n51.f.a(java.lang.Integer.valueOf(this.ExtFlag), java.lang.Integer.valueOf(snsObject.ExtFlag)) && n51.f.a(java.lang.Integer.valueOf(this.NoChange), java.lang.Integer.valueOf(snsObject.NoChange)) && n51.f.a(java.lang.Integer.valueOf(this.GroupCount), java.lang.Integer.valueOf(snsObject.GroupCount)) && n51.f.a(this.GroupList, snsObject.GroupList) && n51.f.a(java.lang.Integer.valueOf(this.IsNotRichText), java.lang.Integer.valueOf(snsObject.IsNotRichText)) && n51.f.a(this.ReferUsername, snsObject.ReferUsername) && n51.f.a(java.lang.Long.valueOf(this.ReferId), java.lang.Long.valueOf(snsObject.ReferId)) && n51.f.a(java.lang.Integer.valueOf(this.BlackListCount), java.lang.Integer.valueOf(snsObject.BlackListCount)) && n51.f.a(this.BlackList, snsObject.BlackList) && n51.f.a(java.lang.Integer.valueOf(this.DeleteFlag), java.lang.Integer.valueOf(snsObject.DeleteFlag)) && n51.f.a(java.lang.Integer.valueOf(this.GroupUserCount), java.lang.Integer.valueOf(snsObject.GroupUserCount)) && n51.f.a(this.GroupUser, snsObject.GroupUser) && n51.f.a(this.ObjectOperations, snsObject.ObjectOperations) && n51.f.a(this.SnsRedEnvelops, snsObject.SnsRedEnvelops) && n51.f.a(this.PreDownloadInfo, snsObject.PreDownloadInfo) && n51.f.a(this.WeAppInfo, snsObject.WeAppInfo) && n51.f.a(java.lang.Integer.valueOf(this.WithChatroomListCount), java.lang.Integer.valueOf(snsObject.WithChatroomListCount)) && n51.f.a(java.lang.Integer.valueOf(this.WithTaListCount), java.lang.Integer.valueOf(snsObject.WithTaListCount)) && n51.f.a(this.WithTaList, snsObject.WithTaList) && n51.f.a(java.lang.Integer.valueOf(this.WithTaHasOther), java.lang.Integer.valueOf(snsObject.WithTaHasOther)) && n51.f.a(java.lang.Integer.valueOf(this.FlowerUserListCount), java.lang.Integer.valueOf(snsObject.FlowerUserListCount)) && n51.f.a(this.FlowerUserList, snsObject.FlowerUserList) && n51.f.a(java.lang.Integer.valueOf(this.FlowerFlag), java.lang.Integer.valueOf(snsObject.FlowerFlag)) && n51.f.a(this.NewWithTaList, snsObject.NewWithTaList) && n51.f.a(java.lang.Integer.valueOf(this.NewWithTaListCount), java.lang.Integer.valueOf(snsObject.NewWithTaListCount)) && n51.f.a(java.lang.Integer.valueOf(this.BlackContactTagIdListCount), java.lang.Integer.valueOf(snsObject.BlackContactTagIdListCount)) && n51.f.a(this.BlackContactTagIdList, snsObject.BlackContactTagIdList) && n51.f.a(java.lang.Integer.valueOf(this.GroupContactTagIdListCount), java.lang.Integer.valueOf(snsObject.GroupContactTagIdListCount)) && n51.f.a(this.GroupContactTagIdList, snsObject.GroupContactTagIdList) && n51.f.a(java.lang.Integer.valueOf(this.WeiShangSellerType), java.lang.Integer.valueOf(snsObject.WeiShangSellerType)) && n51.f.a(java.lang.Integer.valueOf(this.WeiShangFeedType), java.lang.Integer.valueOf(snsObject.WeiShangFeedType)) && n51.f.a(java.lang.Integer.valueOf(this.WeiShangVideoSourceType), java.lang.Integer.valueOf(snsObject.WeiShangVideoSourceType)) && n51.f.a(java.lang.Integer.valueOf(this.ObjectType), java.lang.Integer.valueOf(snsObject.ObjectType)) && n51.f.a(java.lang.Integer.valueOf(this.GuideFinder), java.lang.Integer.valueOf(snsObject.GuideFinder)) && n51.f.a(java.lang.Integer.valueOf(this.GuideTop), java.lang.Integer.valueOf(snsObject.GuideTop)) && n51.f.a(java.lang.Integer.valueOf(this.InTopList), java.lang.Integer.valueOf(snsObject.InTopList)) && n51.f.a(java.lang.Integer.valueOf(this.GuideQW), java.lang.Integer.valueOf(snsObject.GuideQW)) && n51.f.a(java.lang.Integer.valueOf(this.RecentInteractUserCount), java.lang.Integer.valueOf(snsObject.RecentInteractUserCount)) && n51.f.a(this.RecentInteractUserList, snsObject.RecentInteractUserList) && n51.f.a(java.lang.Integer.valueOf(this.VisibilityType), java.lang.Integer.valueOf(snsObject.VisibilityType));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.Id);
            java.lang.String str = this.Username;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.Nickname;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.CreateTime);
            r45.cu5 cu5Var = this.ObjectDesc;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.ObjectDesc.writeFields(fVar);
            }
            fVar.e(6, this.LikeFlag);
            fVar.e(7, this.LikeCount);
            fVar.e(8, this.LikeUserListCount);
            fVar.g(9, 8, this.LikeUserList);
            fVar.e(10, this.CommentCount);
            fVar.e(11, this.CommentUserListCount);
            fVar.g(12, 8, this.CommentUserList);
            fVar.e(13, this.WithUserCount);
            fVar.e(14, this.WithUserListCount);
            fVar.g(15, 8, this.WithUserList);
            fVar.e(16, this.ExtFlag);
            fVar.e(17, this.NoChange);
            fVar.e(18, this.GroupCount);
            fVar.g(19, 8, this.GroupList);
            fVar.e(20, this.IsNotRichText);
            java.lang.String str3 = this.ReferUsername;
            if (str3 != null) {
                fVar.j(21, str3);
            }
            fVar.h(22, this.ReferId);
            fVar.e(23, this.BlackListCount);
            fVar.g(24, 8, this.BlackList);
            fVar.e(25, this.DeleteFlag);
            fVar.e(26, this.GroupUserCount);
            fVar.g(27, 8, this.GroupUser);
            r45.cu5 cu5Var2 = this.ObjectOperations;
            if (cu5Var2 != null) {
                fVar.i(28, cu5Var2.computeSize());
                this.ObjectOperations.writeFields(fVar);
            }
            r45.da6 da6Var = this.SnsRedEnvelops;
            if (da6Var != null) {
                fVar.i(29, da6Var.computeSize());
                this.SnsRedEnvelops.writeFields(fVar);
            }
            r45.kb5 kb5Var = this.PreDownloadInfo;
            if (kb5Var != null) {
                fVar.i(30, kb5Var.computeSize());
                this.PreDownloadInfo.writeFields(fVar);
            }
            r45.o76 o76Var = this.WeAppInfo;
            if (o76Var != null) {
                fVar.i(31, o76Var.computeSize());
                this.WeAppInfo.writeFields(fVar);
            }
            fVar.e(32, this.WithChatroomListCount);
            fVar.e(34, this.WithTaListCount);
            fVar.g(35, 8, this.WithTaList);
            fVar.e(36, this.WithTaHasOther);
            fVar.e(37, this.FlowerUserListCount);
            fVar.g(38, 8, this.FlowerUserList);
            fVar.e(39, this.FlowerFlag);
            fVar.g(40, 8, this.NewWithTaList);
            fVar.e(41, this.NewWithTaListCount);
            fVar.e(42, this.BlackContactTagIdListCount);
            fVar.k(43, 2, this.BlackContactTagIdList);
            fVar.e(44, this.GroupContactTagIdListCount);
            fVar.k(45, 2, this.GroupContactTagIdList);
            fVar.e(46, this.WeiShangSellerType);
            fVar.e(47, this.WeiShangFeedType);
            fVar.e(48, this.WeiShangVideoSourceType);
            fVar.e(49, this.ObjectType);
            fVar.e(50, this.GuideFinder);
            fVar.e(51, this.GuideTop);
            fVar.e(52, this.InTopList);
            fVar.e(53, this.GuideQW);
            fVar.e(54, this.RecentInteractUserCount);
            fVar.g(55, 8, this.RecentInteractUserList);
            fVar.e(56, this.VisibilityType);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.Id) + 0;
            java.lang.String str4 = this.Username;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.Nickname;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            int e17 = h17 + b36.f.e(4, this.CreateTime);
            r45.cu5 cu5Var3 = this.ObjectDesc;
            if (cu5Var3 != null) {
                e17 += b36.f.i(5, cu5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.LikeFlag) + b36.f.e(7, this.LikeCount) + b36.f.e(8, this.LikeUserListCount) + b36.f.g(9, 8, this.LikeUserList) + b36.f.e(10, this.CommentCount) + b36.f.e(11, this.CommentUserListCount) + b36.f.g(12, 8, this.CommentUserList) + b36.f.e(13, this.WithUserCount) + b36.f.e(14, this.WithUserListCount) + b36.f.g(15, 8, this.WithUserList) + b36.f.e(16, this.ExtFlag) + b36.f.e(17, this.NoChange) + b36.f.e(18, this.GroupCount) + b36.f.g(19, 8, this.GroupList) + b36.f.e(20, this.IsNotRichText);
            java.lang.String str6 = this.ReferUsername;
            if (str6 != null) {
                e18 += b36.f.j(21, str6);
            }
            int h18 = e18 + b36.f.h(22, this.ReferId) + b36.f.e(23, this.BlackListCount) + b36.f.g(24, 8, this.BlackList) + b36.f.e(25, this.DeleteFlag) + b36.f.e(26, this.GroupUserCount) + b36.f.g(27, 8, this.GroupUser);
            r45.cu5 cu5Var4 = this.ObjectOperations;
            if (cu5Var4 != null) {
                h18 += b36.f.i(28, cu5Var4.computeSize());
            }
            r45.da6 da6Var2 = this.SnsRedEnvelops;
            if (da6Var2 != null) {
                h18 += b36.f.i(29, da6Var2.computeSize());
            }
            r45.kb5 kb5Var2 = this.PreDownloadInfo;
            if (kb5Var2 != null) {
                h18 += b36.f.i(30, kb5Var2.computeSize());
            }
            r45.o76 o76Var2 = this.WeAppInfo;
            if (o76Var2 != null) {
                h18 += b36.f.i(31, o76Var2.computeSize());
            }
            return h18 + b36.f.e(32, this.WithChatroomListCount) + b36.f.e(34, this.WithTaListCount) + b36.f.g(35, 8, this.WithTaList) + b36.f.e(36, this.WithTaHasOther) + b36.f.e(37, this.FlowerUserListCount) + b36.f.g(38, 8, this.FlowerUserList) + b36.f.e(39, this.FlowerFlag) + b36.f.g(40, 8, this.NewWithTaList) + b36.f.e(41, this.NewWithTaListCount) + b36.f.e(42, this.BlackContactTagIdListCount) + b36.f.k(43, 2, this.BlackContactTagIdList) + b36.f.e(44, this.GroupContactTagIdListCount) + b36.f.k(45, 2, this.GroupContactTagIdList) + b36.f.e(46, this.WeiShangSellerType) + b36.f.e(47, this.WeiShangFeedType) + b36.f.e(48, this.WeiShangVideoSourceType) + b36.f.e(49, this.ObjectType) + b36.f.e(50, this.GuideFinder) + b36.f.e(51, this.GuideTop) + b36.f.e(52, this.InTopList) + b36.f.e(53, this.GuideQW) + b36.f.e(54, this.RecentInteractUserCount) + b36.f.g(55, 8, this.RecentInteractUserList) + b36.f.e(56, this.VisibilityType);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.LikeUserList.clear();
            this.CommentUserList.clear();
            this.WithUserList.clear();
            this.GroupList.clear();
            this.BlackList.clear();
            this.GroupUser.clear();
            this.WithTaList.clear();
            this.FlowerUserList.clear();
            this.NewWithTaList.clear();
            this.BlackContactTagIdList.clear();
            this.GroupContactTagIdList.clear();
            this.RecentInteractUserList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                snsObject.Id = aVar2.i(intValue);
                return 0;
            case 2:
                snsObject.Username = aVar2.k(intValue);
                return 0;
            case 3:
                snsObject.Nickname = aVar2.k(intValue);
                return 0;
            case 4:
                snsObject.CreateTime = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    snsObject.ObjectDesc = cu5Var5;
                }
                return 0;
            case 6:
                snsObject.LikeFlag = aVar2.g(intValue);
                return 0;
            case 7:
                snsObject.LikeCount = aVar2.g(intValue);
                return 0;
            case 8:
                snsObject.LikeUserListCount = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.e86 e86Var = new r45.e86();
                    if (bArr3 != null && bArr3.length > 0) {
                        e86Var.parseFrom(bArr3);
                    }
                    snsObject.LikeUserList.add(e86Var);
                }
                return 0;
            case 10:
                snsObject.CommentCount = aVar2.g(intValue);
                return 0;
            case 11:
                snsObject.CommentUserListCount = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.e86 e86Var2 = new r45.e86();
                    if (bArr4 != null && bArr4.length > 0) {
                        e86Var2.parseFrom(bArr4);
                    }
                    snsObject.CommentUserList.add(e86Var2);
                }
                return 0;
            case 13:
                snsObject.WithUserCount = aVar2.g(intValue);
                return 0;
            case 14:
                snsObject.WithUserListCount = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.e86 e86Var3 = new r45.e86();
                    if (bArr5 != null && bArr5.length > 0) {
                        e86Var3.parseFrom(bArr5);
                    }
                    snsObject.WithUserList.add(e86Var3);
                }
                return 0;
            case 16:
                snsObject.ExtFlag = aVar2.g(intValue);
                return 0;
            case 17:
                snsObject.NoChange = aVar2.g(intValue);
                return 0;
            case 18:
                snsObject.GroupCount = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.a96 a96Var = new r45.a96();
                    if (bArr6 != null && bArr6.length > 0) {
                        a96Var.parseFrom(bArr6);
                    }
                    snsObject.GroupList.add(a96Var);
                }
                return 0;
            case 20:
                snsObject.IsNotRichText = aVar2.g(intValue);
                return 0;
            case 21:
                snsObject.ReferUsername = aVar2.k(intValue);
                return 0;
            case 22:
                snsObject.ReferId = aVar2.i(intValue);
                return 0;
            case 23:
                snsObject.BlackListCount = aVar2.g(intValue);
                return 0;
            case 24:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var.b(bArr7);
                    }
                    snsObject.BlackList.add(du5Var);
                }
                return 0;
            case 25:
                snsObject.DeleteFlag = aVar2.g(intValue);
                return 0;
            case 26:
                snsObject.GroupUserCount = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr8 != null && bArr8.length > 0) {
                        du5Var2.b(bArr8);
                    }
                    snsObject.GroupUser.add(du5Var2);
                }
                return 0;
            case 28:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var6.b(bArr9);
                    }
                    snsObject.ObjectOperations = cu5Var6;
                }
                return 0;
            case 29:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.da6 da6Var3 = new r45.da6();
                    if (bArr10 != null && bArr10.length > 0) {
                        da6Var3.parseFrom(bArr10);
                    }
                    snsObject.SnsRedEnvelops = da6Var3;
                }
                return 0;
            case 30:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.kb5 kb5Var3 = new r45.kb5();
                    if (bArr11 != null && bArr11.length > 0) {
                        kb5Var3.parseFrom(bArr11);
                    }
                    snsObject.PreDownloadInfo = kb5Var3;
                }
                return 0;
            case 31:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr12 = (byte[]) j48.get(i49);
                    r45.o76 o76Var3 = new r45.o76();
                    if (bArr12 != null && bArr12.length > 0) {
                        o76Var3.parseFrom(bArr12);
                    }
                    snsObject.WeAppInfo = o76Var3;
                }
                return 0;
            case 32:
                snsObject.WithChatroomListCount = aVar2.g(intValue);
                return 0;
            case 33:
            default:
                return -1;
            case 34:
                snsObject.WithTaListCount = aVar2.g(intValue);
                return 0;
            case 35:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr13 = (byte[]) j49.get(i57);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr13 != null && bArr13.length > 0) {
                        du5Var3.b(bArr13);
                    }
                    snsObject.WithTaList.add(du5Var3);
                }
                return 0;
            case 36:
                snsObject.WithTaHasOther = aVar2.g(intValue);
                return 0;
            case 37:
                snsObject.FlowerUserListCount = aVar2.g(intValue);
                return 0;
            case 38:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr14 = (byte[]) j57.get(i58);
                    r45.e86 e86Var4 = new r45.e86();
                    if (bArr14 != null && bArr14.length > 0) {
                        e86Var4.parseFrom(bArr14);
                    }
                    snsObject.FlowerUserList.add(e86Var4);
                }
                return 0;
            case 39:
                snsObject.FlowerFlag = aVar2.g(intValue);
                return 0;
            case 40:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr15 = (byte[]) j58.get(i59);
                    r45.e86 e86Var5 = new r45.e86();
                    if (bArr15 != null && bArr15.length > 0) {
                        e86Var5.parseFrom(bArr15);
                    }
                    snsObject.NewWithTaList.add(e86Var5);
                }
                return 0;
            case 41:
                snsObject.NewWithTaListCount = aVar2.g(intValue);
                return 0;
            case 42:
                snsObject.BlackContactTagIdListCount = aVar2.g(intValue);
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                byte[] bArr16 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr16, 0, bArr16.length);
                java.util.LinkedList<java.lang.Integer> linkedList = new java.util.LinkedList<>();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                snsObject.BlackContactTagIdList = linkedList;
                return 0;
            case 44:
                snsObject.GroupContactTagIdListCount = aVar2.g(intValue);
                return 0;
            case 45:
                byte[] bArr17 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr17, 0, bArr17.length);
                java.util.LinkedList<java.lang.Integer> linkedList2 = new java.util.LinkedList<>();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                snsObject.GroupContactTagIdList = linkedList2;
                return 0;
            case 46:
                snsObject.WeiShangSellerType = aVar2.g(intValue);
                return 0;
            case 47:
                snsObject.WeiShangFeedType = aVar2.g(intValue);
                return 0;
            case 48:
                snsObject.WeiShangVideoSourceType = aVar2.g(intValue);
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                snsObject.ObjectType = aVar2.g(intValue);
                return 0;
            case 50:
                snsObject.GuideFinder = aVar2.g(intValue);
                return 0;
            case 51:
                snsObject.GuideTop = aVar2.g(intValue);
                return 0;
            case 52:
                snsObject.InTopList = aVar2.g(intValue);
                return 0;
            case 53:
                snsObject.GuideQW = aVar2.g(intValue);
                return 0;
            case 54:
                snsObject.RecentInteractUserCount = aVar2.g(intValue);
                return 0;
            case 55:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr18 = (byte[]) j59.get(i66);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr18 != null && bArr18.length > 0) {
                        du5Var4.b(bArr18);
                    }
                    snsObject.RecentInteractUserList.add(du5Var4);
                }
                return 0;
            case 56:
                snsObject.VisibilityType = aVar2.g(intValue);
                return 0;
        }
    }
}
