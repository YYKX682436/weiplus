package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes7.dex */
public class e2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            public static final android.os.Parcelable.Creator<com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new com.tencent.mm.xcompat.recyclerview.widget.e2();

            /* renamed from: d, reason: collision with root package name */
            public final int f214430d;

            /* renamed from: e, reason: collision with root package name */
            public final int f214431e;

            /* renamed from: f, reason: collision with root package name */
            public final int[] f214432f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f214433g;

            {
                this.f214430d = parcel.readInt();
                this.f214431e = parcel.readInt();
                this.f214433g = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f214432f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public java.lang.String toString() {
                return "FullSpanItem{mPosition=" + this.f214430d + ", mGapDir=" + this.f214431e + ", mHasUnwantedGapAfter=" + this.f214433g + ", mGapPerSpan=" + java.util.Arrays.toString(this.f214432f) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeInt(this.f214430d);
                parcel2.writeInt(this.f214431e);
                parcel2.writeInt(this.f214433g ? 1 : 0);
                int[] iArr = this.f214432f;
                if (iArr == null || iArr.length <= 0) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(iArr.length);
                    parcel2.writeIntArray(iArr);
                }
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i17];
    }
}
