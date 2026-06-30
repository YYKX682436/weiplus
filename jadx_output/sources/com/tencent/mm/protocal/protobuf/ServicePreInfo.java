package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class ServicePreInfo extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<r45.ob5> media_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.protocal.protobuf.ServicePreInfo create() {
        return new com.tencent.mm.protocal.protobuf.ServicePreInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.protocal.protobuf.ServicePreInfo) && n51.f.a(this.media_list, ((com.tencent.mm.protocal.protobuf.ServicePreInfo) fVar).media_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.media_list);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.media_list) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.media_list.clear();
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
        com.tencent.mm.protocal.protobuf.ServicePreInfo servicePreInfo = (com.tencent.mm.protocal.protobuf.ServicePreInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ob5 ob5Var = new r45.ob5();
            if (bArr2 != null && bArr2.length > 0) {
                ob5Var.parseFrom(bArr2);
            }
            servicePreInfo.media_list.add(ob5Var);
        }
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.ServicePreInfo setMedia_list(java.util.LinkedList<r45.ob5> linkedList) {
        this.media_list = linkedList;
        return this;
    }
}
