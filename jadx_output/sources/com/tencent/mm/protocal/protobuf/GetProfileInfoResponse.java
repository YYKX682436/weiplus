package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class GetProfileInfoResponse extends r45.js5 {
    public r45.z1 activity_info;
    public com.tencent.mm.protocal.protobuf.AppCommentModule comment_info;
    public int customer_type;
    public r45.fe0 developer_service;
    public com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo evaluate_basic_info;
    public com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList evaluate_wording_list;
    public com.tencent.mm.protocal.protobuf.FeedBack feed_back;
    public r45.vs0 financial_license_info;
    public com.tencent.mm.protocal.protobuf.WxaLikeList friend_like_list;
    public java.lang.String guarant_url;
    public int name_verify;
    public java.util.LinkedList<com.tencent.mm.protocal.protobuf.WxaRelateWeAppList> new_relate_weapp_list = new java.util.LinkedList<>();
    public java.lang.String officical_url;
    public r45.rd5 page_info;
    public com.tencent.mm.protocal.protobuf.WxaRelateBrandList relate_brand_list;
    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppList relate_weapp_list;
    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo relieved_buy_info;
    public com.tencent.mm.protocal.protobuf.ServicePreInfo service_pre_info;
    public int use_kf;

    public static final com.tencent.mm.protocal.protobuf.GetProfileInfoResponse create() {
        return new com.tencent.mm.protocal.protobuf.GetProfileInfoResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.GetProfileInfoResponse)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.GetProfileInfoResponse getProfileInfoResponse = (com.tencent.mm.protocal.protobuf.GetProfileInfoResponse) fVar;
        return n51.f.a(this.BaseResponse, getProfileInfoResponse.BaseResponse) && n51.f.a(this.service_pre_info, getProfileInfoResponse.service_pre_info) && n51.f.a(this.evaluate_basic_info, getProfileInfoResponse.evaluate_basic_info) && n51.f.a(this.friend_like_list, getProfileInfoResponse.friend_like_list) && n51.f.a(this.feed_back, getProfileInfoResponse.feed_back) && n51.f.a(this.evaluate_wording_list, getProfileInfoResponse.evaluate_wording_list) && n51.f.a(this.relate_brand_list, getProfileInfoResponse.relate_brand_list) && n51.f.a(this.relate_weapp_list, getProfileInfoResponse.relate_weapp_list) && n51.f.a(this.officical_url, getProfileInfoResponse.officical_url) && n51.f.a(this.guarant_url, getProfileInfoResponse.guarant_url) && n51.f.a(this.new_relate_weapp_list, getProfileInfoResponse.new_relate_weapp_list) && n51.f.a(this.relieved_buy_info, getProfileInfoResponse.relieved_buy_info) && n51.f.a(java.lang.Integer.valueOf(this.use_kf), java.lang.Integer.valueOf(getProfileInfoResponse.use_kf)) && n51.f.a(this.comment_info, getProfileInfoResponse.comment_info) && n51.f.a(this.page_info, getProfileInfoResponse.page_info) && n51.f.a(java.lang.Integer.valueOf(this.name_verify), java.lang.Integer.valueOf(getProfileInfoResponse.name_verify)) && n51.f.a(java.lang.Integer.valueOf(this.customer_type), java.lang.Integer.valueOf(getProfileInfoResponse.customer_type)) && n51.f.a(this.developer_service, getProfileInfoResponse.developer_service) && n51.f.a(this.financial_license_info, getProfileInfoResponse.financial_license_info) && n51.f.a(this.activity_info, getProfileInfoResponse.activity_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.ServicePreInfo servicePreInfo = this.service_pre_info;
            if (servicePreInfo != null) {
                fVar.i(2, servicePreInfo.computeSize());
                this.service_pre_info.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo = this.evaluate_basic_info;
            if (wxaEvaluateBasicInfo != null) {
                fVar.i(3, wxaEvaluateBasicInfo.computeSize());
                this.evaluate_basic_info.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.WxaLikeList wxaLikeList = this.friend_like_list;
            if (wxaLikeList != null) {
                fVar.i(4, wxaLikeList.computeSize());
                this.friend_like_list.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FeedBack feedBack = this.feed_back;
            if (feedBack != null) {
                fVar.i(5, feedBack.computeSize());
                this.feed_back.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList wxaEvaluateWordingList = this.evaluate_wording_list;
            if (wxaEvaluateWordingList != null) {
                fVar.i(6, wxaEvaluateWordingList.computeSize());
                this.evaluate_wording_list.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.WxaRelateBrandList wxaRelateBrandList = this.relate_brand_list;
            if (wxaRelateBrandList != null) {
                fVar.i(7, wxaRelateBrandList.computeSize());
                this.relate_brand_list.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList = this.relate_weapp_list;
            if (wxaRelateWeAppList != null) {
                fVar.i(8, wxaRelateWeAppList.computeSize());
                this.relate_weapp_list.writeFields(fVar);
            }
            java.lang.String str = this.officical_url;
            if (str != null) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.guarant_url;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.g(12, 8, this.new_relate_weapp_list);
            com.tencent.mm.protocal.protobuf.RelievedBuyInfo relievedBuyInfo = this.relieved_buy_info;
            if (relievedBuyInfo != null) {
                fVar.i(13, relievedBuyInfo.computeSize());
                this.relieved_buy_info.writeFields(fVar);
            }
            fVar.e(14, this.use_kf);
            com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule = this.comment_info;
            if (appCommentModule != null) {
                fVar.i(15, appCommentModule.computeSize());
                this.comment_info.writeFields(fVar);
            }
            r45.rd5 rd5Var = this.page_info;
            if (rd5Var != null) {
                fVar.i(16, rd5Var.computeSize());
                this.page_info.writeFields(fVar);
            }
            fVar.e(18, this.name_verify);
            fVar.e(19, this.customer_type);
            r45.fe0 fe0Var = this.developer_service;
            if (fe0Var != null) {
                fVar.i(21, fe0Var.computeSize());
                this.developer_service.writeFields(fVar);
            }
            r45.vs0 vs0Var = this.financial_license_info;
            if (vs0Var != null) {
                fVar.i(22, vs0Var.computeSize());
                this.financial_license_info.writeFields(fVar);
            }
            r45.z1 z1Var = this.activity_info;
            if (z1Var != null) {
                fVar.i(20, z1Var.computeSize());
                this.activity_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            com.tencent.mm.protocal.protobuf.ServicePreInfo servicePreInfo2 = this.service_pre_info;
            if (servicePreInfo2 != null) {
                i18 += b36.f.i(2, servicePreInfo2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo2 = this.evaluate_basic_info;
            if (wxaEvaluateBasicInfo2 != null) {
                i18 += b36.f.i(3, wxaEvaluateBasicInfo2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.WxaLikeList wxaLikeList2 = this.friend_like_list;
            if (wxaLikeList2 != null) {
                i18 += b36.f.i(4, wxaLikeList2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FeedBack feedBack2 = this.feed_back;
            if (feedBack2 != null) {
                i18 += b36.f.i(5, feedBack2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList wxaEvaluateWordingList2 = this.evaluate_wording_list;
            if (wxaEvaluateWordingList2 != null) {
                i18 += b36.f.i(6, wxaEvaluateWordingList2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.WxaRelateBrandList wxaRelateBrandList2 = this.relate_brand_list;
            if (wxaRelateBrandList2 != null) {
                i18 += b36.f.i(7, wxaRelateBrandList2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList2 = this.relate_weapp_list;
            if (wxaRelateWeAppList2 != null) {
                i18 += b36.f.i(8, wxaRelateWeAppList2.computeSize());
            }
            java.lang.String str3 = this.officical_url;
            if (str3 != null) {
                i18 += b36.f.j(10, str3);
            }
            java.lang.String str4 = this.guarant_url;
            if (str4 != null) {
                i18 += b36.f.j(11, str4);
            }
            int g17 = i18 + b36.f.g(12, 8, this.new_relate_weapp_list);
            com.tencent.mm.protocal.protobuf.RelievedBuyInfo relievedBuyInfo2 = this.relieved_buy_info;
            if (relievedBuyInfo2 != null) {
                g17 += b36.f.i(13, relievedBuyInfo2.computeSize());
            }
            int e17 = g17 + b36.f.e(14, this.use_kf);
            com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule2 = this.comment_info;
            if (appCommentModule2 != null) {
                e17 += b36.f.i(15, appCommentModule2.computeSize());
            }
            r45.rd5 rd5Var2 = this.page_info;
            if (rd5Var2 != null) {
                e17 += b36.f.i(16, rd5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(18, this.name_verify) + b36.f.e(19, this.customer_type);
            r45.fe0 fe0Var2 = this.developer_service;
            if (fe0Var2 != null) {
                e18 += b36.f.i(21, fe0Var2.computeSize());
            }
            r45.vs0 vs0Var2 = this.financial_license_info;
            if (vs0Var2 != null) {
                e18 += b36.f.i(22, vs0Var2.computeSize());
            }
            r45.z1 z1Var2 = this.activity_info;
            return z1Var2 != null ? e18 + b36.f.i(20, z1Var2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.new_relate_weapp_list.clear();
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
        com.tencent.mm.protocal.protobuf.GetProfileInfoResponse getProfileInfoResponse = (com.tencent.mm.protocal.protobuf.GetProfileInfoResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    getProfileInfoResponse.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.ServicePreInfo servicePreInfo3 = new com.tencent.mm.protocal.protobuf.ServicePreInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        servicePreInfo3.parseFrom(bArr3);
                    }
                    getProfileInfoResponse.service_pre_info = servicePreInfo3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo3 = new com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        wxaEvaluateBasicInfo3.parseFrom(bArr4);
                    }
                    getProfileInfoResponse.evaluate_basic_info = wxaEvaluateBasicInfo3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.tencent.mm.protocal.protobuf.WxaLikeList wxaLikeList3 = new com.tencent.mm.protocal.protobuf.WxaLikeList();
                    if (bArr5 != null && bArr5.length > 0) {
                        wxaLikeList3.parseFrom(bArr5);
                    }
                    getProfileInfoResponse.friend_like_list = wxaLikeList3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.tencent.mm.protocal.protobuf.FeedBack feedBack3 = new com.tencent.mm.protocal.protobuf.FeedBack();
                    if (bArr6 != null && bArr6.length > 0) {
                        feedBack3.parseFrom(bArr6);
                    }
                    getProfileInfoResponse.feed_back = feedBack3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList wxaEvaluateWordingList3 = new com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList();
                    if (bArr7 != null && bArr7.length > 0) {
                        wxaEvaluateWordingList3.parseFrom(bArr7);
                    }
                    getProfileInfoResponse.evaluate_wording_list = wxaEvaluateWordingList3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    com.tencent.mm.protocal.protobuf.WxaRelateBrandList wxaRelateBrandList3 = new com.tencent.mm.protocal.protobuf.WxaRelateBrandList();
                    if (bArr8 != null && bArr8.length > 0) {
                        wxaRelateBrandList3.parseFrom(bArr8);
                    }
                    getProfileInfoResponse.relate_brand_list = wxaRelateBrandList3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList3 = new com.tencent.mm.protocal.protobuf.WxaRelateWeAppList();
                    if (bArr9 != null && bArr9.length > 0) {
                        wxaRelateWeAppList3.parseFrom(bArr9);
                    }
                    getProfileInfoResponse.relate_weapp_list = wxaRelateWeAppList3;
                }
                return 0;
            case 9:
            case 17:
            default:
                return -1;
            case 10:
                getProfileInfoResponse.officical_url = aVar2.k(intValue);
                return 0;
            case 11:
                getProfileInfoResponse.guarant_url = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList4 = new com.tencent.mm.protocal.protobuf.WxaRelateWeAppList();
                    if (bArr10 != null && bArr10.length > 0) {
                        wxaRelateWeAppList4.parseFrom(bArr10);
                    }
                    getProfileInfoResponse.new_relate_weapp_list.add(wxaRelateWeAppList4);
                }
                return 0;
            case 13:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    com.tencent.mm.protocal.protobuf.RelievedBuyInfo relievedBuyInfo3 = new com.tencent.mm.protocal.protobuf.RelievedBuyInfo();
                    if (bArr11 != null && bArr11.length > 0) {
                        relievedBuyInfo3.parseFrom(bArr11);
                    }
                    getProfileInfoResponse.relieved_buy_info = relievedBuyInfo3;
                }
                return 0;
            case 14:
                getProfileInfoResponse.use_kf = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule3 = new com.tencent.mm.protocal.protobuf.AppCommentModule();
                    if (bArr12 != null && bArr12.length > 0) {
                        appCommentModule3.parseFrom(bArr12);
                    }
                    getProfileInfoResponse.comment_info = appCommentModule3;
                }
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.rd5 rd5Var3 = new r45.rd5();
                    if (bArr13 != null && bArr13.length > 0) {
                        rd5Var3.parseFrom(bArr13);
                    }
                    getProfileInfoResponse.page_info = rd5Var3;
                }
                return 0;
            case 18:
                getProfileInfoResponse.name_verify = aVar2.g(intValue);
                return 0;
            case 19:
                getProfileInfoResponse.customer_type = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.z1 z1Var3 = new r45.z1();
                    if (bArr14 != null && bArr14.length > 0) {
                        z1Var3.parseFrom(bArr14);
                    }
                    getProfileInfoResponse.activity_info = z1Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.fe0 fe0Var3 = new r45.fe0();
                    if (bArr15 != null && bArr15.length > 0) {
                        fe0Var3.parseFrom(bArr15);
                    }
                    getProfileInfoResponse.developer_service = fe0Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.vs0 vs0Var3 = new r45.vs0();
                    if (bArr16 != null && bArr16.length > 0) {
                        vs0Var3.parseFrom(bArr16);
                    }
                    getProfileInfoResponse.financial_license_info = vs0Var3;
                }
                return 0;
        }
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setActivity_info(r45.z1 z1Var) {
        this.activity_info = z1Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setComment_info(com.tencent.mm.protocal.protobuf.AppCommentModule appCommentModule) {
        this.comment_info = appCommentModule;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setCustomer_type(int i17) {
        this.customer_type = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setDeveloper_service(r45.fe0 fe0Var) {
        this.developer_service = fe0Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setEvaluate_basic_info(com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo) {
        this.evaluate_basic_info = wxaEvaluateBasicInfo;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setEvaluate_wording_list(com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList wxaEvaluateWordingList) {
        this.evaluate_wording_list = wxaEvaluateWordingList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setFeed_back(com.tencent.mm.protocal.protobuf.FeedBack feedBack) {
        this.feed_back = feedBack;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setFinancial_license_info(r45.vs0 vs0Var) {
        this.financial_license_info = vs0Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setFriend_like_list(com.tencent.mm.protocal.protobuf.WxaLikeList wxaLikeList) {
        this.friend_like_list = wxaLikeList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setGuarant_url(java.lang.String str) {
        this.guarant_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setName_verify(int i17) {
        this.name_verify = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setNew_relate_weapp_list(java.util.LinkedList<com.tencent.mm.protocal.protobuf.WxaRelateWeAppList> linkedList) {
        this.new_relate_weapp_list = linkedList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setOfficical_url(java.lang.String str) {
        this.officical_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setPage_info(r45.rd5 rd5Var) {
        this.page_info = rd5Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setRelate_brand_list(com.tencent.mm.protocal.protobuf.WxaRelateBrandList wxaRelateBrandList) {
        this.relate_brand_list = wxaRelateBrandList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setRelate_weapp_list(com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList) {
        this.relate_weapp_list = wxaRelateWeAppList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setRelieved_buy_info(com.tencent.mm.protocal.protobuf.RelievedBuyInfo relievedBuyInfo) {
        this.relieved_buy_info = relievedBuyInfo;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setService_pre_info(com.tencent.mm.protocal.protobuf.ServicePreInfo servicePreInfo) {
        this.service_pre_info = servicePreInfo;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.GetProfileInfoResponse setUse_kf(int i17) {
        this.use_kf = i17;
        return this;
    }
}
