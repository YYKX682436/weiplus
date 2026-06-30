package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class RelievedBuySubInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public java.lang.String icon;
    public int sub_type;
    public java.lang.String title;

    public static final com.tencent.mm.protocal.protobuf.RelievedBuySubInfo create() {
        return new com.tencent.mm.protocal.protobuf.RelievedBuySubInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.RelievedBuySubInfo)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.RelievedBuySubInfo relievedBuySubInfo = (com.tencent.mm.protocal.protobuf.RelievedBuySubInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.sub_type), java.lang.Integer.valueOf(relievedBuySubInfo.sub_type)) && n51.f.a(this.title, relievedBuySubInfo.title) && n51.f.a(this.desc, relievedBuySubInfo.desc) && n51.f.a(this.icon, relievedBuySubInfo.icon);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.sub_type);
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.desc;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.icon;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.sub_type) + 0;
            java.lang.String str4 = this.title;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.desc;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.icon;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        com.tencent.mm.protocal.protobuf.RelievedBuySubInfo relievedBuySubInfo = (com.tencent.mm.protocal.protobuf.RelievedBuySubInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            relievedBuySubInfo.sub_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            relievedBuySubInfo.title = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            relievedBuySubInfo.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        relievedBuySubInfo.icon = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuySubInfo setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuySubInfo setIcon(java.lang.String str) {
        this.icon = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuySubInfo setSub_type(int i17) {
        this.sub_type = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuySubInfo setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }
}
