package v53;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433351d;

    /* renamed from: e, reason: collision with root package name */
    public v53.n f433352e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433353f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f433354g;

    /* renamed from: h, reason: collision with root package name */
    public v53.a f433355h;

    /* renamed from: i, reason: collision with root package name */
    public v53.c f433356i;

    /* renamed from: m, reason: collision with root package name */
    public int f433357m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.o)) {
            return false;
        }
        v53.o oVar = (v53.o) fVar;
        return n51.f.a(this.f433351d, oVar.f433351d) && n51.f.a(this.f433352e, oVar.f433352e) && n51.f.a(this.f433353f, oVar.f433353f) && n51.f.a(this.f433354g, oVar.f433354g) && n51.f.a(this.f433355h, oVar.f433355h) && n51.f.a(this.f433356i, oVar.f433356i) && n51.f.a(java.lang.Integer.valueOf(this.f433357m), java.lang.Integer.valueOf(oVar.f433357m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f433351d;
            if (str != null) {
                fVar.j(1, str);
            }
            v53.n nVar = this.f433352e;
            if (nVar != null) {
                fVar.i(2, nVar.computeSize());
                this.f433352e.writeFields(fVar);
            }
            java.lang.String str2 = this.f433353f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f433354g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            v53.a aVar = this.f433355h;
            if (aVar != null) {
                fVar.i(5, aVar.computeSize());
                this.f433355h.writeFields(fVar);
            }
            v53.c cVar = this.f433356i;
            if (cVar != null) {
                fVar.i(6, cVar.computeSize());
                this.f433356i.writeFields(fVar);
            }
            fVar.e(7, this.f433357m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f433351d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            v53.n nVar2 = this.f433352e;
            if (nVar2 != null) {
                j17 += b36.f.i(2, nVar2.computeSize());
            }
            java.lang.String str5 = this.f433353f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f433354g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            v53.a aVar2 = this.f433355h;
            if (aVar2 != null) {
                j17 += b36.f.i(5, aVar2.computeSize());
            }
            v53.c cVar2 = this.f433356i;
            if (cVar2 != null) {
                j17 += b36.f.i(6, cVar2.computeSize());
            }
            return j17 + b36.f.e(7, this.f433357m);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        v53.o oVar = (v53.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f433351d = aVar4.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    v53.n nVar3 = new v53.n();
                    if (bArr != null && bArr.length > 0) {
                        nVar3.parseFrom(bArr);
                    }
                    oVar.f433352e = nVar3;
                }
                return 0;
            case 3:
                oVar.f433353f = aVar4.k(intValue);
                return 0;
            case 4:
                oVar.f433354g = aVar4.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    v53.a aVar5 = new v53.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.parseFrom(bArr2);
                    }
                    oVar.f433355h = aVar5;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    v53.c cVar3 = new v53.c();
                    if (bArr3 != null && bArr3.length > 0) {
                        cVar3.parseFrom(bArr3);
                    }
                    oVar.f433356i = cVar3;
                }
                return 0;
            case 7:
                oVar.f433357m = aVar4.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
