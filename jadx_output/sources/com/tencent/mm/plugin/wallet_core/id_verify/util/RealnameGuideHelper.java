package com.tencent.mm.plugin.wallet_core.id_verify.util;

/* loaded from: classes9.dex */
public class RealnameGuideHelper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper> CREATOR = new zs4.a();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo f179504d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179505e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179506f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179507g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179508h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179509i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f179510m;

    /* renamed from: n, reason: collision with root package name */
    public int f179511n;

    public RealnameGuideHelper() {
        this.f179507g = "";
        this.f179508h = "";
        this.f179509i = "";
        this.f179510m = false;
    }

    public boolean a(com.tencent.mm.ui.MMActivity mMActivity, android.os.Bundle bundle, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.wallet_core.g gVar) {
        return b(mMActivity, bundle, onClickListener, gVar, false);
    }

    public boolean b(com.tencent.mm.ui.MMActivity mMActivity, android.os.Bundle bundle, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.wallet_core.g gVar, boolean z17) {
        if (this.f179510m) {
            return false;
        }
        if ("1".equals(this.f179505e)) {
            if (!this.f179510m) {
                this.f179510m = true;
            }
            return zs4.q.g(mMActivity, this.f179506f, 0, this.f179507g, this.f179508h, bundle, z17, onClickListener, gVar, this.f179511n, 1);
        }
        if (!"2".equals(this.f179505e) || com.tencent.mm.sdk.platformtools.t8.K0(this.f179509i)) {
            return false;
        }
        if (!this.f179510m) {
            this.f179510m = true;
        }
        zs4.q.h(mMActivity, this.f179506f, this.f179509i, this.f179507g, this.f179508h, z17, onClickListener);
        return true;
    }

    public boolean c(com.tencent.mm.ui.MMActivity mMActivity, android.os.Bundle bundle, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.wallet_core.g gVar, boolean z17) {
        boolean z18 = false;
        if (this.f179510m) {
            return false;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo setPwdInfo = this.f179504d;
        if (setPwdInfo != null && setPwdInfo.f179512d == 1) {
            int i17 = this.f179511n;
            java.lang.String str = setPwdInfo.f179513e;
            java.lang.String str2 = setPwdInfo.f179514f;
            java.lang.String str3 = setPwdInfo.f179515g;
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_SET_PWD_TIP_INT_SYNC;
            int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", java.lang.Integer.valueOf(intValue));
            if (intValue < 3) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue + 1));
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = mMActivity.getString(com.tencent.mm.R.string.f490347sg);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    str3 = mMActivity.getString(com.tencent.mm.R.string.f490507x1);
                }
                com.tencent.mm.ui.widget.dialog.j0 B = db5.e1.B(mMActivity, str, "", str3, str2, new zs4.d(bundle, i17, mMActivity, z17), onClickListener == null ? new zs4.c(z17, mMActivity) : onClickListener, com.tencent.mm.R.color.aaq);
                if (B != null) {
                    B.setOnCancelListener(new zs4.e(z17, mMActivity));
                    B.setOnDismissListener(new zs4.f(z17, mMActivity));
                }
                z18 = true;
            }
            if (z18 && !this.f179510m) {
                this.f179510m = true;
            }
        }
        return z18;
    }

    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        this.f179504d = null;
        this.f179505e = str;
        this.f179506f = str2;
        this.f179507g = str3;
        this.f179508h = str4;
        this.f179509i = str5;
        this.f179511n = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f179504d, i17);
        parcel.writeString(this.f179505e);
        parcel.writeString(this.f179506f);
        parcel.writeString(this.f179507g);
        parcel.writeString(this.f179508h);
        parcel.writeString(this.f179509i);
        parcel.writeByte(this.f179510m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f179511n);
    }

    public RealnameGuideHelper(android.os.Parcel parcel) {
        this.f179507g = "";
        this.f179508h = "";
        this.f179509i = "";
        this.f179510m = false;
        this.f179504d = (com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo) parcel.readParcelable(com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo.class.getClassLoader());
        this.f179505e = parcel.readString();
        this.f179506f = parcel.readString();
        this.f179507g = parcel.readString();
        this.f179508h = parcel.readString();
        this.f179509i = parcel.readString();
        this.f179510m = parcel.readByte() != 0;
        this.f179511n = parcel.readInt();
    }
}
