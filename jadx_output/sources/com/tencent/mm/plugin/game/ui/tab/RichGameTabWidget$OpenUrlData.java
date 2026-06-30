package com.tencent.mm.plugin.game.ui.tab;

/* loaded from: classes8.dex */
public class RichGameTabWidget$OpenUrlData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.ui.tab.RichGameTabWidget$OpenUrlData> CREATOR = new p53.q();

    /* renamed from: d, reason: collision with root package name */
    public m53.p3 f141774d;

    public RichGameTabWidget$OpenUrlData(m53.p3 p3Var) {
        new m53.p3();
        this.f141774d = p3Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        try {
            m53.p3 p3Var = this.f141774d;
            if (p3Var != null) {
                byte[] byteArray = p3Var.toByteArray();
                if (byteArray == null || byteArray.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public RichGameTabWidget$OpenUrlData(android.os.Parcel parcel) {
        this.f141774d = new m53.p3();
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f141774d = new m53.p3();
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                this.f141774d.parseFrom(bArr);
            }
        } catch (java.lang.Exception e17) {
            this.f141774d = null;
            com.tencent.mars.xlog.Log.printErrStackTrace("RichGameTabWidget", e17, "parse jsApiResponse exception", new java.lang.Object[0]);
        }
    }
}
