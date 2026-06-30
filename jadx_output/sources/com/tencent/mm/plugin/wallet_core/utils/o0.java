package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes7.dex */
public final class o0 implements android.os.Parcelable.Creator {
    public o0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.wallet_core.utils.s0 s0Var;
        com.tencent.mm.plugin.wallet_core.utils.n0 n0Var;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.wallet_core.utils.m0 m0Var = com.tencent.mm.plugin.wallet_core.utils.n0.f180939e;
        int readInt = parcel.readInt();
        m0Var.getClass();
        com.tencent.mm.plugin.wallet_core.utils.n0[] values = com.tencent.mm.plugin.wallet_core.utils.n0.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            s0Var = null;
            if (i17 >= length) {
                n0Var = null;
                break;
            }
            n0Var = values[i17];
            if (n0Var.f180949d == readInt) {
                break;
            }
            i17++;
        }
        com.tencent.mm.plugin.wallet_core.utils.n0 n0Var2 = n0Var == null ? com.tencent.mm.plugin.wallet_core.utils.n0.f180940f : n0Var;
        com.tencent.mm.plugin.wallet_core.utils.r0 r0Var = com.tencent.mm.plugin.wallet_core.utils.s0.f180980e;
        int readInt2 = parcel.readInt();
        r0Var.getClass();
        com.tencent.mm.plugin.wallet_core.utils.s0[] values2 = com.tencent.mm.plugin.wallet_core.utils.s0.values();
        int length2 = values2.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length2) {
                break;
            }
            com.tencent.mm.plugin.wallet_core.utils.s0 s0Var2 = values2[i18];
            if (s0Var2.f180985d == readInt2) {
                s0Var = s0Var2;
                break;
            }
            i18++;
        }
        com.tencent.mm.plugin.wallet_core.utils.s0 s0Var3 = s0Var == null ? com.tencent.mm.plugin.wallet_core.utils.s0.f180981f : s0Var;
        com.tencent.mm.plugin.wallet_core.utils.q0 a17 = com.tencent.mm.plugin.wallet_core.utils.q0.f180965e.a(parcel.readInt());
        java.lang.String readString = parcel.readString();
        java.lang.String str = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        java.lang.String str2 = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        java.lang.String str3 = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        java.lang.String str4 = readString4 == null ? "" : readString4;
        java.lang.String readString5 = parcel.readString();
        return new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(n0Var2, s0Var3, a17, str, str2, str3, str4, readString5 == null ? "" : readString5, parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo[i17];
    }
}
