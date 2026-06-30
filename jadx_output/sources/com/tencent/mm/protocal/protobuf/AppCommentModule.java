package com.tencent.mm.protocal.protobuf;

/* loaded from: classes7.dex */
public class AppCommentModule extends com.tencent.mm.protobuf.f {
    public r45.s04 invite_info;
    public java.lang.String low_score_text;
    public java.lang.String more_appid;
    public java.lang.String more_path;
    public java.lang.String more_query;
    public java.lang.String more_text;
    public java.lang.String name_img_url;
    public java.lang.String name_img_url_black;
    public java.lang.String name_text;
    public java.lang.String no_score_text;
    public java.lang.String recommend;
    public r45.y9 recommend_list;
    public int score_num;
    public java.lang.String score_str;
    public int show_menu;
    public int show_profile;

    public static final com.tencent.mm.protocal.protobuf.AppCommentModule create() {
        return new com.tencent.mm.protocal.protobuf.AppCommentModule();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.AppCommentModule)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule = (com.tencent.mm.protocal.protobuf.AppCommentModule) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.show_profile), java.lang.Integer.valueOf(appCommentModule.show_profile)) && n51.f.a(java.lang.Integer.valueOf(this.show_menu), java.lang.Integer.valueOf(appCommentModule.show_menu)) && n51.f.a(this.name_text, appCommentModule.name_text) && n51.f.a(this.name_img_url, appCommentModule.name_img_url) && n51.f.a(this.name_img_url_black, appCommentModule.name_img_url_black) && n51.f.a(this.score_str, appCommentModule.score_str) && n51.f.a(java.lang.Integer.valueOf(this.score_num), java.lang.Integer.valueOf(appCommentModule.score_num)) && n51.f.a(this.recommend, appCommentModule.recommend) && n51.f.a(this.more_path, appCommentModule.more_path) && n51.f.a(this.more_query, appCommentModule.more_query) && n51.f.a(this.more_appid, appCommentModule.more_appid) && n51.f.a(this.more_text, appCommentModule.more_text) && n51.f.a(this.no_score_text, appCommentModule.no_score_text) && n51.f.a(this.invite_info, appCommentModule.invite_info) && n51.f.a(this.recommend_list, appCommentModule.recommend_list) && n51.f.a(this.low_score_text, appCommentModule.low_score_text);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.show_profile);
            fVar.e(2, this.show_menu);
            java.lang.String str = this.name_text;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.name_img_url;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.name_img_url_black;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.score_str;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.score_num);
            java.lang.String str5 = this.recommend;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.more_path;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.more_query;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.more_appid;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.more_text;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.no_score_text;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            r45.s04 s04Var = this.invite_info;
            if (s04Var != null) {
                fVar.i(20, s04Var.computeSize());
                this.invite_info.writeFields(fVar);
            }
            r45.y9 y9Var = this.recommend_list;
            if (y9Var != null) {
                fVar.i(21, y9Var.computeSize());
                this.recommend_list.writeFields(fVar);
            }
            java.lang.String str11 = this.low_score_text;
            if (str11 != null) {
                fVar.j(22, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.show_profile) + 0 + b36.f.e(2, this.show_menu);
            java.lang.String str12 = this.name_text;
            if (str12 != null) {
                e17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.name_img_url;
            if (str13 != null) {
                e17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.name_img_url_black;
            if (str14 != null) {
                e17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.score_str;
            if (str15 != null) {
                e17 += b36.f.j(6, str15);
            }
            int e18 = e17 + b36.f.e(7, this.score_num);
            java.lang.String str16 = this.recommend;
            if (str16 != null) {
                e18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.more_path;
            if (str17 != null) {
                e18 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.more_query;
            if (str18 != null) {
                e18 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.more_appid;
            if (str19 != null) {
                e18 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.more_text;
            if (str20 != null) {
                e18 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.no_score_text;
            if (str21 != null) {
                e18 += b36.f.j(13, str21);
            }
            r45.s04 s04Var2 = this.invite_info;
            if (s04Var2 != null) {
                e18 += b36.f.i(20, s04Var2.computeSize());
            }
            r45.y9 y9Var2 = this.recommend_list;
            if (y9Var2 != null) {
                e18 += b36.f.i(21, y9Var2.computeSize());
            }
            java.lang.String str22 = this.low_score_text;
            return str22 != null ? e18 + b36.f.j(22, str22) : e18;
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
        com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule = (com.tencent.mm.protocal.protobuf.AppCommentModule) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                appCommentModule.show_profile = aVar2.g(intValue);
                return 0;
            case 2:
                appCommentModule.show_menu = aVar2.g(intValue);
                return 0;
            case 3:
                appCommentModule.name_text = aVar2.k(intValue);
                return 0;
            case 4:
                appCommentModule.name_img_url = aVar2.k(intValue);
                return 0;
            case 5:
                appCommentModule.name_img_url_black = aVar2.k(intValue);
                return 0;
            case 6:
                appCommentModule.score_str = aVar2.k(intValue);
                return 0;
            case 7:
                appCommentModule.score_num = aVar2.g(intValue);
                return 0;
            case 8:
                appCommentModule.recommend = aVar2.k(intValue);
                return 0;
            case 9:
                appCommentModule.more_path = aVar2.k(intValue);
                return 0;
            case 10:
                appCommentModule.more_query = aVar2.k(intValue);
                return 0;
            case 11:
                appCommentModule.more_appid = aVar2.k(intValue);
                return 0;
            case 12:
                appCommentModule.more_text = aVar2.k(intValue);
                return 0;
            case 13:
                appCommentModule.no_score_text = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        java.util.LinkedList j17 = aVar2.j(intValue);
                        int size = j17.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j17.get(i18);
                            r45.s04 s04Var3 = new r45.s04();
                            if (bArr != null && bArr.length > 0) {
                                s04Var3.parseFrom(bArr);
                            }
                            appCommentModule.invite_info = s04Var3;
                        }
                        return 0;
                    case 21:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr2 = (byte[]) j18.get(i19);
                            r45.y9 y9Var3 = new r45.y9();
                            if (bArr2 != null && bArr2.length > 0) {
                                y9Var3.parseFrom(bArr2);
                            }
                            appCommentModule.recommend_list = y9Var3;
                        }
                        return 0;
                    case 22:
                        appCommentModule.low_score_text = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setInvite_info(r45.s04 s04Var) {
        this.invite_info = s04Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setLow_score_text(java.lang.String str) {
        this.low_score_text = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setMore_appid(java.lang.String str) {
        this.more_appid = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setMore_path(java.lang.String str) {
        this.more_path = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setMore_query(java.lang.String str) {
        this.more_query = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setMore_text(java.lang.String str) {
        this.more_text = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setName_img_url(java.lang.String str) {
        this.name_img_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setName_img_url_black(java.lang.String str) {
        this.name_img_url_black = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setName_text(java.lang.String str) {
        this.name_text = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setNo_score_text(java.lang.String str) {
        this.no_score_text = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setRecommend(java.lang.String str) {
        this.recommend = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setRecommend_list(r45.y9 y9Var) {
        this.recommend_list = y9Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setScore_num(int i17) {
        this.score_num = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setScore_str(java.lang.String str) {
        this.score_str = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setShow_menu(int i17) {
        this.show_menu = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.AppCommentModule setShow_profile(int i17) {
        this.show_profile = i17;
        return this;
    }
}
