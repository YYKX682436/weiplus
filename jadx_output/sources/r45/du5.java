package r45;

/* loaded from: classes4.dex */
public class du5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372756d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372757e;

    public r45.du5 b(byte[] bArr) {
        c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        return this;
    }

    public r45.du5 c(java.lang.String str) {
        this.f372756d = str;
        this.f372757e = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.du5)) {
            return false;
        }
        r45.du5 du5Var = (r45.du5) fVar;
        java.lang.String str = this.f372756d;
        if (str == null && du5Var.f372756d == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(du5Var.f372756d);
    }

    @Override // com.tencent.mm.protobuf.f
    public int computeSize() {
        return (this.f372757e ? b36.f.j(1, this.f372756d) + 0 : 0) + 0;
    }

    public java.lang.String getString() {
        return this.f372756d;
    }

    @Override // com.tencent.mm.protobuf.f
    public /* bridge */ /* synthetic */ com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        b(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean populateBuilderWithField(c36.a aVar, com.tencent.mm.protobuf.f fVar, int i17) {
        r45.du5 du5Var = (r45.du5) fVar;
        if (i17 != 1) {
            return false;
        }
        du5Var.c(aVar.k(i17));
        return true;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        return super.toByteArray();
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        return this.f372756d;
    }

    public java.lang.String toString() {
        return this.f372756d;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f validate() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public void writeFields(g36.f fVar) {
        if (this.f372757e) {
            fVar.j(1, this.f372756d);
        }
    }
}
