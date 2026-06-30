package com.tencent.mm.ui.report;

/* loaded from: classes9.dex */
public class g0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.ui.report.h0 h0Var;
        com.tencent.mm.ui.report.j0 j0Var;
        java.lang.String readString = parcel.readString();
        int readInt = parcel.readInt();
        com.tencent.mm.ui.report.j0 j0Var2 = com.tencent.mm.ui.report.j0.Unknown;
        if (readInt != 0) {
            if (readInt == 1) {
                j0Var = com.tencent.mm.ui.report.j0.SingleChat;
            } else if (readInt == 2) {
                j0Var = com.tencent.mm.ui.report.j0.GroupChat;
            } else if (readInt == 3) {
                j0Var = com.tencent.mm.ui.report.j0.SNS;
            }
            j0Var2 = j0Var;
        }
        int readInt2 = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        int readInt3 = parcel.readInt();
        com.tencent.mm.ui.report.h0 h0Var2 = com.tencent.mm.ui.report.h0.Unknown;
        if (readInt3 != 0) {
            if (readInt3 == 1) {
                h0Var = com.tencent.mm.ui.report.h0.Image;
            } else if (readInt3 == 2) {
                h0Var = com.tencent.mm.ui.report.h0.Video;
            }
            return new com.tencent.mm.ui.report.KV17560Reporter(readString, j0Var2, readInt2, readString2, readString3, h0Var, null);
        }
        h0Var = h0Var2;
        return new com.tencent.mm.ui.report.KV17560Reporter(readString, j0Var2, readInt2, readString2, readString3, h0Var, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.report.KV17560Reporter[i17];
    }
}
