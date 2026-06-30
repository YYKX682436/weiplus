package dk2;

/* loaded from: classes3.dex */
public final class u5 implements dk2.zf {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ch1 f234170a;

    public u5(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f234170a = msg;
        com.tencent.mars.xlog.Log.i("FinderLiveDescMsg", "#init");
    }

    @Override // dk2.zf
    public r45.xn1 C() {
        return (r45.xn1) this.f234170a.getCustom(0);
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        return null;
    }

    @Override // dk2.zf
    public java.lang.String a() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f234170a.getCustom(13);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getUsername();
    }

    @Override // dk2.zf
    public java.lang.String f() {
        java.lang.String string = this.f234170a.getString(14);
        return string == null ? "" : string;
    }

    @Override // dk2.zf
    public int getType() {
        return this.f234170a.getInteger(1);
    }

    @Override // dk2.zf
    public java.lang.String j() {
        com.tencent.mm.protobuf.g byteString = this.f234170a.getByteString(4);
        if (byteString == null) {
            return "";
        }
        r45.nk1 nk1Var = new r45.nk1();
        try {
            nk1Var.parseFrom(byteString.g());
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
        }
        java.lang.String string = nk1Var.getString(0);
        return string == null ? "" : string;
    }

    @Override // dk2.zf
    public java.lang.String k() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f234170a.getCustom(13);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    @Override // dk2.zf
    public boolean l() {
        return this.f234170a.getInteger(9) == 1;
    }

    @Override // dk2.zf
    public long m() {
        return this.f234170a.getLong(12);
    }

    @Override // dk2.zf
    public boolean n() {
        return false;
    }

    @Override // dk2.zf
    public int p() {
        return this.f234170a.getInteger(10);
    }

    @Override // dk2.zf
    public r45.xn1 r() {
        return (r45.xn1) this.f234170a.getCustom(13);
    }

    @Override // dk2.zf
    public java.lang.String u() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f234170a.getCustom(0);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getUsername();
    }

    @Override // dk2.zf
    public java.lang.String v() {
        java.lang.String string = this.f234170a.getString(2);
        return string == null ? "" : string;
    }

    @Override // dk2.zf
    public java.lang.String x() {
        com.tencent.mm.protobuf.g byteString = this.f234170a.getByteString(4);
        if (byteString == null) {
            return "";
        }
        r45.nk1 nk1Var = new r45.nk1();
        try {
            nk1Var.parseFrom(byteString.g());
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
        }
        java.lang.String string = nk1Var.getString(4);
        return string == null ? "" : string;
    }

    @Override // dk2.zf
    public java.lang.String y() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var = (r45.xn1) this.f234170a.getCustom(13);
        if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) {
            return null;
        }
        return finderContact.getNickname();
    }

    @Override // dk2.zf
    public int z() {
        return 0;
    }
}
