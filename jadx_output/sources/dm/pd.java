package dm;

/* loaded from: classes10.dex */
public final class pd extends dm.x4 {

    /* renamed from: b3, reason: collision with root package name */
    public static final l75.e0 f239302b3 = dm.c4.initAutoDBInfo(dm.pd.class);

    /* renamed from: c3, reason: collision with root package name */
    public static final java.lang.String f239303c3 = "metion_Index";

    @Override // dm.c4, l75.f0
    public l75.e0 getDBInfo() {
        return f239302b3;
    }

    public final java.lang.String l() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.protobuf.g byteString;
        r45.vg2 vg2Var = this.field_extInfo;
        if (vg2Var == null || (str = vg2Var.getString(0)) == null) {
            str = "";
        }
        if (kotlin.jvm.internal.o.b(str, "music")) {
            r45.vg2 vg2Var2 = this.field_extInfo;
            if (vg2Var2 == null || (byteString = vg2Var2.getByteString(2)) == null) {
                return "";
            }
            byte[] bArr = byteString.f192156a;
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
            try {
                r45.hf2 hf2Var = new r45.hf2();
                hf2Var.parseFrom(bArr);
                str2 = hf2Var.getString(8);
            } catch (java.lang.Exception unused) {
                str2 = null;
            }
            if (str2 == null) {
                return "";
            }
        } else {
            str2 = this.field_thumbUrl;
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }

    public final boolean t0() {
        int i17 = this.field_extFlag;
        return (i17 & 2) > 0 || (i17 & 1) > 0;
    }

    public boolean u0() {
        r45.rg2 rg2Var = this.field_aggregatedContacts;
        return (rg2Var == null || rg2Var.getInteger(1) == 0) ? false : true;
    }

    public int v0() {
        r45.rg2 rg2Var = this.field_aggregatedContacts;
        if (rg2Var != null) {
            return rg2Var.getInteger(1);
        }
        return 0;
    }

    public final void w0(boolean z17) {
        if (z17) {
            this.field_extFlag |= 32;
        } else {
            this.field_extFlag &= -33;
        }
    }
}
