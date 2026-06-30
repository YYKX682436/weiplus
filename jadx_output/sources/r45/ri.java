package r45;

/* loaded from: classes4.dex */
public class ri extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qi f384881d;

    /* renamed from: e, reason: collision with root package name */
    public int f384882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384884g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f384885h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ri)) {
            return false;
        }
        r45.ri riVar = (r45.ri) fVar;
        return n51.f.a(this.f384881d, riVar.f384881d) && n51.f.a(java.lang.Integer.valueOf(this.f384882e), java.lang.Integer.valueOf(riVar.f384882e)) && n51.f.a(this.f384883f, riVar.f384883f) && n51.f.a(this.f384884g, riVar.f384884g) && n51.f.a(this.f384885h, riVar.f384885h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384885h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qi qiVar = this.f384881d;
            if (qiVar != null) {
                fVar.i(1, qiVar.computeSize());
                this.f384881d.writeFields(fVar);
            }
            fVar.e(2, this.f384882e);
            java.lang.String str = this.f384883f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384884g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.qi qiVar2 = this.f384881d;
            int i18 = (qiVar2 != null ? 0 + b36.f.i(1, qiVar2.computeSize()) : 0) + b36.f.e(2, this.f384882e);
            java.lang.String str3 = this.f384883f;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f384884g;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        r45.ri riVar = (r45.ri) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.qi qiVar3 = new r45.qi();
                if (bArr2 != null && bArr2.length > 0) {
                    qiVar3.parseFrom(bArr2);
                }
                riVar.f384881d = qiVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            riVar.f384882e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            riVar.f384883f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            riVar.f384884g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.qi qiVar4 = new r45.qi();
            if (bArr3 != null && bArr3.length > 0) {
                qiVar4.parseFrom(bArr3);
            }
            riVar.f384885h.add(qiVar4);
        }
        return 0;
    }
}
