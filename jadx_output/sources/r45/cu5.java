package r45;

/* loaded from: classes4.dex */
public class cu5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371839d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f371840e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371841f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f371842g;

    public r45.cu5 b(byte[] bArr) {
        c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        f();
        return this;
    }

    public r45.cu5 c(com.tencent.mm.protobuf.g gVar) {
        if (gVar == null) {
            d(null);
        }
        this.f371841f = gVar;
        this.f371842g = true;
        this.f371839d = gVar.f192156a.length;
        this.f371840e = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.cu5) && this.f371839d == ((r45.cu5) fVar).f371839d;
    }

    @Override // com.tencent.mm.protobuf.f
    public int computeSize() {
        int e17 = b36.f.e(1, this.f371839d) + 0;
        if (this.f371842g) {
            e17 += b36.f.b(2, this.f371841f);
        }
        return e17 + 0;
    }

    public r45.cu5 d(byte[] bArr) {
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bArr);
        c(b17);
        this.f371839d = b17.f192156a.length;
        this.f371840e = true;
        return this;
    }

    public r45.cu5 e(byte[] bArr, int i17, int i18) {
        com.tencent.mm.protobuf.g gVar = new com.tencent.mm.protobuf.g(bArr, i17, i18);
        c(gVar);
        this.f371839d = gVar.f192156a.length;
        this.f371840e = true;
        return this;
    }

    public r45.cu5 f() {
        if (this.f371840e) {
            return this;
        }
        throw new b36.g("Not all required fields were included (false = not included in message),  iLen:" + this.f371840e);
    }

    @Override // com.tencent.mm.protobuf.f
    public /* bridge */ /* synthetic */ com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        b(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final boolean populateBuilderWithField(c36.a aVar, com.tencent.mm.protobuf.f fVar, int i17) {
        r45.cu5 cu5Var = (r45.cu5) fVar;
        if (i17 == 1) {
            cu5Var.f371839d = aVar.g(i17);
            cu5Var.f371840e = true;
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        cu5Var.c(aVar.d(i17));
        return true;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        f();
        return super.toByteArray();
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        return "";
    }

    public java.lang.String toString() {
        java.lang.String str = r45.cu5.class.getName().concat("(") + "iLen = " + this.f371839d + "   ";
        if (this.f371842g) {
            str = str + "Buffer = " + java.lang.String.valueOf(this.f371841f) + "   ";
        }
        return str + ")";
    }

    @Override // com.tencent.mm.protobuf.f
    public /* bridge */ /* synthetic */ com.tencent.mm.protobuf.f validate() {
        f();
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public void writeFields(g36.f fVar) {
        fVar.e(1, this.f371839d);
        if (this.f371842g) {
            fVar.b(2, this.f371841f);
        }
    }
}
