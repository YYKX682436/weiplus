package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class WxaLikeList extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<r45.fe7> like_list = new java.util.LinkedList<>();
    public int total_like_cnt;

    public static final com.tencent.mm.protocal.protobuf.WxaLikeList create() {
        return new com.tencent.mm.protocal.protobuf.WxaLikeList();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.WxaLikeList)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.WxaLikeList wxaLikeList = (com.tencent.mm.protocal.protobuf.WxaLikeList) fVar;
        return n51.f.a(this.like_list, wxaLikeList.like_list) && n51.f.a(java.lang.Integer.valueOf(this.total_like_cnt), java.lang.Integer.valueOf(wxaLikeList.total_like_cnt));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.like_list);
            fVar.e(2, this.total_like_cnt);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.like_list) + 0 + b36.f.e(2, this.total_like_cnt);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.like_list.clear();
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
        com.tencent.mm.protocal.protobuf.WxaLikeList wxaLikeList = (com.tencent.mm.protocal.protobuf.WxaLikeList) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            wxaLikeList.total_like_cnt = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.fe7 fe7Var = new r45.fe7();
            if (bArr2 != null && bArr2.length > 0) {
                fe7Var.parseFrom(bArr2);
            }
            wxaLikeList.like_list.add(fe7Var);
        }
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.WxaLikeList setLike_list(java.util.LinkedList<r45.fe7> linkedList) {
        this.like_list = linkedList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.WxaLikeList setTotal_like_cnt(int i17) {
        this.total_like_cnt = i17;
        return this;
    }
}
