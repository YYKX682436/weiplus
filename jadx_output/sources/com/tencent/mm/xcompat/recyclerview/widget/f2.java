package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes7.dex */
public class f2 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            public static final android.os.Parcelable.Creator<com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$SavedState> CREATOR = new com.tencent.mm.xcompat.recyclerview.widget.f2();

            /* renamed from: d, reason: collision with root package name */
            public final int f214434d;

            /* renamed from: e, reason: collision with root package name */
            public final int f214435e;

            /* renamed from: f, reason: collision with root package name */
            public final int f214436f;

            /* renamed from: g, reason: collision with root package name */
            public final int[] f214437g;

            /* renamed from: h, reason: collision with root package name */
            public final int f214438h;

            /* renamed from: i, reason: collision with root package name */
            public final int[] f214439i;

            /* renamed from: m, reason: collision with root package name */
            public final java.util.List f214440m;

            /* renamed from: n, reason: collision with root package name */
            public final boolean f214441n;

            /* renamed from: o, reason: collision with root package name */
            public final boolean f214442o;

            /* renamed from: p, reason: collision with root package name */
            public final boolean f214443p;

            {
                this.f214434d = parcel.readInt();
                this.f214435e = parcel.readInt();
                int readInt = parcel.readInt();
                this.f214436f = readInt;
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f214437g = iArr;
                    parcel.readIntArray(iArr);
                }
                int readInt2 = parcel.readInt();
                this.f214438h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    this.f214439i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                this.f214441n = parcel.readInt() == 1;
                this.f214442o = parcel.readInt() == 1;
                this.f214443p = parcel.readInt() == 1;
                this.f214440m = parcel.readArrayList(com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                parcel2.writeInt(this.f214434d);
                parcel2.writeInt(this.f214435e);
                int i18 = this.f214436f;
                parcel2.writeInt(i18);
                if (i18 > 0) {
                    parcel2.writeIntArray(this.f214437g);
                }
                int i19 = this.f214438h;
                parcel2.writeInt(i19);
                if (i19 > 0) {
                    parcel2.writeIntArray(this.f214439i);
                }
                parcel2.writeInt(this.f214441n ? 1 : 0);
                parcel2.writeInt(this.f214442o ? 1 : 0);
                parcel2.writeInt(this.f214443p ? 1 : 0);
                parcel2.writeList(this.f214440m);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.xcompat.recyclerview.widget.StaggeredGridLayoutManager$SavedState[i17];
    }
}
