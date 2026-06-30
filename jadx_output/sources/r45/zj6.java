package r45;

/* loaded from: classes2.dex */
public class zj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392149d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392150e;

    /* renamed from: f, reason: collision with root package name */
    public int f392151f;

    /* renamed from: g, reason: collision with root package name */
    public int f392152g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392153h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zj6)) {
            return false;
        }
        r45.zj6 zj6Var = (r45.zj6) fVar;
        return n51.f.a(this.f392149d, zj6Var.f392149d) && n51.f.a(this.f392150e, zj6Var.f392150e) && n51.f.a(java.lang.Integer.valueOf(this.f392151f), java.lang.Integer.valueOf(zj6Var.f392151f)) && n51.f.a(java.lang.Integer.valueOf(this.f392152g), java.lang.Integer.valueOf(zj6Var.f392152g)) && n51.f.a(this.f392153h, zj6Var.f392153h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392149d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f392150e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f392151f);
            fVar.e(4, this.f392152g);
            java.lang.String str3 = this.f392153h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f392149d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f392150e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f392151f) + b36.f.e(4, this.f392152g);
            java.lang.String str6 = this.f392153h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.zj6 zj6Var = (r45.zj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zj6Var.f392149d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            zj6Var.f392150e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            zj6Var.f392151f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            zj6Var.f392152g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        zj6Var.f392153h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f392149d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "PublishUsername", str, false);
            eVar.d(jSONObject, "CommentUserName", this.f392150e, false);
            eVar.d(jSONObject, "Source", java.lang.Integer.valueOf(this.f392151f), false);
            eVar.d(jSONObject, "ContentType", java.lang.Integer.valueOf(this.f392152g), false);
            eVar.d(jSONObject, "ContentID", this.f392153h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
