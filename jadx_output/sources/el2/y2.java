package el2;

/* loaded from: classes3.dex */
public final class y2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.do2 f253953a;

    public y2(r45.do2 promoteInfo) {
        kotlin.jvm.internal.o.g(promoteInfo, "promoteInfo");
        this.f253953a = promoteInfo;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return pm0.v.u(zl2.r4.f473950a.c0(this.f253953a));
    }

    @Override // el2.v2
    public java.lang.String b() {
        r45.do2 do2Var = this.f253953a;
        int integer = do2Var.getInteger(2);
        if (integer == 1) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.Object[] objArr = new java.lang.Object[2];
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            objArr[0] = java.lang.Integer.valueOf(uz0Var != null ? uz0Var.getInteger(4) : 0);
            r45.uz0 uz0Var2 = (r45.uz0) do2Var.getCustom(0);
            objArr[1] = java.lang.Integer.valueOf(uz0Var2 != null ? uz0Var2.getInteger(5) : 0);
            return context.getString(com.tencent.mm.R.string.fbb, objArr);
        }
        if (integer != 2) {
            return "";
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        r45.n11 n11Var = (r45.n11) do2Var.getCustom(1);
        objArr2[0] = java.lang.Integer.valueOf(n11Var != null ? n11Var.getInteger(4) : 0);
        r45.n11 n11Var2 = (r45.n11) do2Var.getCustom(1);
        objArr2[1] = java.lang.Integer.valueOf(n11Var2 != null ? n11Var2.getInteger(5) : 0);
        return context2.getString(com.tencent.mm.R.string.gjp, objArr2);
    }

    @Override // el2.v2
    public java.lang.String c() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String d() {
        return null;
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, 20);
        a52Var.set(2, new com.tencent.mm.protobuf.g(this.f253953a.toByteArray()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icon_video_playlist_fill), java.lang.Integer.valueOf(android.graphics.Color.parseColor("#CFB177")));
    }

    @Override // el2.v2
    public java.lang.Object getData() {
        return this.f253953a;
    }

    @Override // el2.v2
    public java.lang.String getTitle() {
        java.lang.String string;
        java.lang.String string2;
        r45.do2 do2Var = this.f253953a;
        int integer = do2Var.getInteger(2);
        java.lang.String str = "";
        if (integer == 1) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.Object[] objArr = new java.lang.Object[1];
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null && (string = uz0Var.getString(1)) != null) {
                str = string;
            }
            objArr[0] = str;
            return context.getString(com.tencent.mm.R.string.f491745fy4, objArr);
        }
        if (integer != 2) {
            return "";
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        r45.n11 n11Var = (r45.n11) do2Var.getCustom(1);
        if (n11Var != null && (string2 = n11Var.getString(1)) != null) {
            str = string2;
        }
        objArr2[0] = str;
        return context2.getString(com.tencent.mm.R.string.gvd, objArr2);
    }

    @Override // el2.v2
    public int getType() {
        return 20;
    }
}
