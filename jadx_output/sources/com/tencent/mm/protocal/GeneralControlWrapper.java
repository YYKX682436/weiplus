package com.tencent.mm.protocal;

/* loaded from: classes8.dex */
public class GeneralControlWrapper implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final int f192177d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.protocal.GeneralControlWrapper f192175e = new com.tencent.mm.protocal.GeneralControlWrapper(10);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.protocal.GeneralControlWrapper f192176f = new com.tencent.mm.protocal.GeneralControlWrapper(1);
    public static final android.os.Parcelable.Creator<com.tencent.mm.protocal.GeneralControlWrapper> CREATOR = new o45.bg();

    public GeneralControlWrapper(r45.y73 y73Var) {
        if (y73Var == null) {
            this.f192177d = 0;
        } else {
            this.f192177d = y73Var.f390838d;
        }
        toString();
    }

    public boolean a() {
        return (this.f192177d & 64) > 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "[bitset=0x" + java.lang.Integer.toHexString(this.f192177d) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f192177d);
    }

    public GeneralControlWrapper(int i17) {
        this.f192177d = i17;
        toString();
    }

    public GeneralControlWrapper(android.os.Parcel parcel, o45.bg bgVar) {
        this.f192177d = parcel.readInt();
    }
}
