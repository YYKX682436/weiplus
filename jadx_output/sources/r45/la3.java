package r45;

/* loaded from: classes8.dex */
public class la3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379269d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379270e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f379271f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.t90 f379272g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.la3)) {
            return false;
        }
        r45.la3 la3Var = (r45.la3) fVar;
        return n51.f.a(this.BaseResponse, la3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379269d), java.lang.Integer.valueOf(la3Var.f379269d)) && n51.f.a(this.f379270e, la3Var.f379270e) && n51.f.a(this.f379271f, la3Var.f379271f) && n51.f.a(this.f379272g, la3Var.f379272g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379271f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379269d);
            java.lang.String str = this.f379270e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            r45.t90 t90Var = this.f379272g;
            if (t90Var != null) {
                fVar.i(5, t90Var.computeSize());
                this.f379272g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379269d);
            java.lang.String str2 = this.f379270e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            r45.t90 t90Var2 = this.f379272g;
            return t90Var2 != null ? g17 + b36.f.i(5, t90Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.la3 la3Var = (r45.la3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                la3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            la3Var.f379269d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            la3Var.f379270e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.jd jdVar = new r45.jd();
                if (bArr3 != null && bArr3.length > 0) {
                    jdVar.parseFrom(bArr3);
                }
                la3Var.f379271f.add(jdVar);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.t90 t90Var3 = new r45.t90();
            if (bArr4 != null && bArr4.length > 0) {
                t90Var3.parseFrom(bArr4);
            }
            la3Var.f379272g = t90Var3;
        }
        return 0;
    }
}
