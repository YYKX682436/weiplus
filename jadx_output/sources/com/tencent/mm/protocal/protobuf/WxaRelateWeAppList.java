package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class WxaRelateWeAppList extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo> weapp_info_list = new java.util.LinkedList<>();
    public java.lang.String weapp_register_title;

    public static final com.tencent.mm.protocal.protobuf.WxaRelateWeAppList create() {
        return new com.tencent.mm.protocal.protobuf.WxaRelateWeAppList();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.WxaRelateWeAppList)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList = (com.tencent.mm.protocal.protobuf.WxaRelateWeAppList) fVar;
        return n51.f.a(this.weapp_register_title, wxaRelateWeAppList.weapp_register_title) && n51.f.a(this.weapp_info_list, wxaRelateWeAppList.weapp_info_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.weapp_register_title;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.weapp_info_list);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.weapp_register_title;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 8, this.weapp_info_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.weapp_info_list.clear();
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
        com.tencent.mm.protocal.protobuf.WxaRelateWeAppList wxaRelateWeAppList = (com.tencent.mm.protocal.protobuf.WxaRelateWeAppList) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wxaRelateWeAppList.weapp_register_title = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo wxaRelateWeAppInfo = new com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo();
            if (bArr2 != null && bArr2.length > 0) {
                wxaRelateWeAppInfo.parseFrom(bArr2);
            }
            wxaRelateWeAppList.weapp_info_list.add(wxaRelateWeAppInfo);
        }
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppList setWeapp_info_list(java.util.LinkedList<com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo> linkedList) {
        this.weapp_info_list = linkedList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppList setWeapp_register_title(java.lang.String str) {
        this.weapp_register_title = str;
        return this;
    }
}
