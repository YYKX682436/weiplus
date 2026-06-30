package r45;

/* loaded from: classes4.dex */
public class eu5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373733d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f373734e;

    public r45.eu5 b(byte[] bArr) {
        c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        c();
        return this;
    }

    public r45.eu5 c() {
        if (this.f373734e) {
            return this;
        }
        throw new b36.g("Not all required fields were included (false = not included in message),  uiVal:" + this.f373734e);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.eu5) && this.f373733d == ((r45.eu5) fVar).f373733d;
    }

    @Override // com.tencent.mm.protobuf.f
    public int computeSize() {
        return b36.f.e(1, this.f373733d) + 0 + 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public /* bridge */ /* synthetic */ com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        b(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean populateBuilderWithField(c36.a aVar, com.tencent.mm.protobuf.f fVar, int i17) {
        r45.eu5 eu5Var = (r45.eu5) fVar;
        if (i17 != 1) {
            return false;
        }
        eu5Var.f373733d = aVar.g(i17);
        eu5Var.f373734e = true;
        return true;
    }

    @Override // com.tencent.mm.protobuf.f
    public byte[] toByteArray() {
        c();
        return super.toByteArray();
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        return java.lang.Integer.valueOf(this.f373733d);
    }

    public java.lang.String toString() {
        return (r45.eu5.class.getName().concat("(") + "uiVal = " + this.f373733d + "   ") + ")";
    }

    @Override // com.tencent.mm.protobuf.f
    public /* bridge */ /* synthetic */ com.tencent.mm.protobuf.f validate() {
        c();
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public void writeFields(g36.f fVar) {
        fVar.e(1, this.f373733d);
    }
}
