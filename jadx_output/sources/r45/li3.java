package r45;

/* loaded from: classes9.dex */
public class li3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f379498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379499e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f379500f;

    /* renamed from: g, reason: collision with root package name */
    public long f379501g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379502h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f379503i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f379504m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.li3)) {
            return false;
        }
        r45.li3 li3Var = (r45.li3) fVar;
        return n51.f.a(this.BaseResponse, li3Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f379498d), java.lang.Long.valueOf(li3Var.f379498d)) && n51.f.a(this.f379499e, li3Var.f379499e) && n51.f.a(java.lang.Boolean.valueOf(this.f379500f), java.lang.Boolean.valueOf(li3Var.f379500f)) && n51.f.a(java.lang.Long.valueOf(this.f379501g), java.lang.Long.valueOf(li3Var.f379501g)) && n51.f.a(this.f379502h, li3Var.f379502h) && n51.f.a(this.f379503i, li3Var.f379503i) && n51.f.a(this.f379504m, li3Var.f379504m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379503i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.h(2, this.f379498d);
            java.lang.String str = this.f379499e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f379500f);
            fVar.h(5, this.f379501g);
            java.lang.String str2 = this.f379502h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            fVar.g(8, 8, this.f379504m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f379498d);
            java.lang.String str3 = this.f379499e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int a17 = i18 + b36.f.a(4, this.f379500f) + b36.f.h(5, this.f379501g);
            java.lang.String str4 = this.f379502h;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            return a17 + b36.f.g(7, 8, linkedList) + b36.f.g(8, 8, this.f379504m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f379504m.clear();
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
        r45.li3 li3Var = (r45.li3) objArr[1];
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
                    li3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                li3Var.f379498d = aVar2.i(intValue);
                return 0;
            case 3:
                li3Var.f379499e = aVar2.k(intValue);
                return 0;
            case 4:
                li3Var.f379500f = aVar2.c(intValue);
                return 0;
            case 5:
                li3Var.f379501g = aVar2.i(intValue);
                return 0;
            case 6:
                li3Var.f379502h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.xt xtVar = new r45.xt();
                    if (bArr3 != null && bArr3.length > 0) {
                        xtVar.parseFrom(bArr3);
                    }
                    li3Var.f379503i.add(xtVar);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tt ttVar = new r45.tt();
                    if (bArr4 != null && bArr4.length > 0) {
                        ttVar.parseFrom(bArr4);
                    }
                    li3Var.f379504m.add(ttVar);
                }
                return 0;
            default:
                return -1;
        }
    }
}
