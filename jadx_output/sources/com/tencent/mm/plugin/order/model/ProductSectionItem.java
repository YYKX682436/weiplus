package com.tencent.mm.plugin.order.model;

/* loaded from: classes9.dex */
public class ProductSectionItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.order.model.ProductSectionItem> CREATER = new dp3.s();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152809d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152810e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f152811f;

    /* renamed from: g, reason: collision with root package name */
    public int f152812g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152813h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f152814i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f152815m;

    /* renamed from: n, reason: collision with root package name */
    public int f152816n;

    /* loaded from: classes9.dex */
    public static class Skus implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.order.model.ProductSectionItem.Skus> CREATER = new com.tencent.mm.plugin.order.model.b();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f152817d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f152818e;

        public Skus(android.os.Parcel parcel) {
            this.f152817d = parcel.readString();
            this.f152818e = parcel.readString();
        }

        public static java.lang.String a(java.util.List list) {
            if (list == null || list.size() == 0) {
                return "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.tencent.mm.plugin.order.model.ProductSectionItem.Skus skus = (com.tencent.mm.plugin.order.model.ProductSectionItem.Skus) list.get(i17);
                if (i17 != 0) {
                    sb6.append("、");
                }
                sb6.append(skus.f152818e);
            }
            return sb6.toString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f152817d);
            parcel.writeString(this.f152818e);
        }
    }

    public ProductSectionItem(android.os.Parcel parcel) {
        this.f152809d = parcel.readString();
        this.f152810e = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f152811f = new java.util.ArrayList();
            for (int i17 = 0; i17 < readInt; i17++) {
                com.tencent.mm.plugin.order.model.ProductSectionItem.Skus skus = new com.tencent.mm.plugin.order.model.ProductSectionItem.Skus();
                skus.f152817d = parcel.readString();
                skus.f152818e = parcel.readString();
                this.f152811f.add(skus);
            }
        }
        this.f152812g = parcel.readInt();
        this.f152813h = parcel.readString();
        this.f152814i = parcel.readString();
        this.f152815m = parcel.readString();
        this.f152816n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f152809d);
        parcel.writeString(this.f152810e);
        java.util.List list = this.f152811f;
        if (list != null) {
            parcel.writeInt(list.size());
            for (int i18 = 0; i18 < this.f152811f.size(); i18++) {
                com.tencent.mm.plugin.order.model.ProductSectionItem.Skus skus = (com.tencent.mm.plugin.order.model.ProductSectionItem.Skus) this.f152811f.get(i18);
                parcel.writeString(skus.f152817d);
                parcel.writeString(skus.f152818e);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f152812g);
        parcel.writeString(this.f152813h);
        parcel.writeString(this.f152814i);
        parcel.writeString(this.f152815m);
        parcel.writeInt(this.f152816n);
    }
}
