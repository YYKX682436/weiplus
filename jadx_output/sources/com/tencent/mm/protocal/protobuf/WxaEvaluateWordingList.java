package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class WxaEvaluateWordingList extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.protocal.protobuf.WxaEvaluateWording> items = new java.util.LinkedList<>();

    public static final com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList create() {
        return new com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList) && n51.f.a(this.items, ((com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList) fVar).items);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.items);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.items) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.items.clear();
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
        com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList wxaEvaluateWordingList = (com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.protocal.protobuf.WxaEvaluateWording wxaEvaluateWording = new com.tencent.mm.protocal.protobuf.WxaEvaluateWording();
            if (bArr2 != null && bArr2.length > 0) {
                wxaEvaluateWording.parseFrom(bArr2);
            }
            wxaEvaluateWordingList.items.add(wxaEvaluateWording);
        }
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.WxaEvaluateWordingList setItems(java.util.LinkedList<com.tencent.mm.protocal.protobuf.WxaEvaluateWording> linkedList) {
        this.items = linkedList;
        return this;
    }
}
