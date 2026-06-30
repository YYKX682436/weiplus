package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class GameTabData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.GameTabData> CREATOR = new com.tencent.mm.plugin.game.model.f2();

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedHashMap f140151d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.GameTabData.StatusBar f140152e;

    /* loaded from: classes8.dex */
    public static class TabItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.GameTabData.TabItem> CREATOR = new com.tencent.mm.plugin.game.model.h2();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f140155d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f140156e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f140157f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f140158g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f140159h;

        /* renamed from: i, reason: collision with root package name */
        public int f140160i;

        /* renamed from: m, reason: collision with root package name */
        public int f140161m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f140162n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f140163o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f140164p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f140165q;

        /* renamed from: r, reason: collision with root package name */
        public int f140166r;

        /* renamed from: s, reason: collision with root package name */
        public int f140167s;

        /* renamed from: t, reason: collision with root package name */
        public java.lang.String f140168t;

        public TabItem(android.os.Parcel parcel) {
            this.f140155d = parcel.readString();
            this.f140156e = parcel.readString();
            this.f140157f = parcel.readString();
            this.f140158g = parcel.readByte() != 0;
            this.f140159h = parcel.readByte() != 0;
            this.f140160i = parcel.readInt();
            this.f140161m = parcel.readInt();
            this.f140162n = parcel.readString();
            this.f140163o = parcel.readString();
            this.f140164p = parcel.readString();
            this.f140165q = parcel.readByte() != 0;
            this.f140166r = parcel.readInt();
            this.f140167s = parcel.readInt();
            this.f140168t = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f140155d);
            parcel.writeString(this.f140156e);
            parcel.writeString(this.f140157f);
            parcel.writeByte(this.f140158g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f140159h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f140160i);
            parcel.writeInt(this.f140161m);
            parcel.writeString(this.f140162n);
            parcel.writeString(this.f140163o);
            parcel.writeString(this.f140164p);
            parcel.writeByte(this.f140165q ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f140166r);
            parcel.writeInt(this.f140167s);
            parcel.writeString(this.f140168t);
        }
    }

    public GameTabData() {
        this.f140151d = new java.util.LinkedHashMap();
        this.f140152e = new com.tencent.mm.plugin.game.model.GameTabData.StatusBar();
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = this.f140151d;
        if (linkedHashMap != null) {
            arrayList.addAll(linkedHashMap.values());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f140151d.size());
        java.util.Iterator it = this.f140151d.entrySet().iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) ((java.util.Map.Entry) it.next()).getValue(), i17);
        }
        parcel.writeParcelable(this.f140152e, i17);
    }

    /* loaded from: classes8.dex */
    public static class StatusBar implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.model.GameTabData.StatusBar> CREATOR = new com.tencent.mm.plugin.game.model.g2();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f140153d;

        /* renamed from: e, reason: collision with root package name */
        public int f140154e;

        public StatusBar() {
            this.f140153d = null;
            this.f140154e = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f140153d);
            parcel.writeInt(this.f140154e);
        }

        public StatusBar(android.os.Parcel parcel) {
            this.f140153d = null;
            this.f140154e = 0;
            this.f140153d = parcel.readString();
            this.f140154e = parcel.readInt();
        }
    }

    public GameTabData(android.os.Parcel parcel, com.tencent.mm.plugin.game.model.f2 f2Var) {
        int readInt = parcel.readInt();
        if (this.f140151d == null) {
            this.f140151d = new java.util.LinkedHashMap();
        }
        for (int i17 = 0; i17 < readInt; i17++) {
            com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem = (com.tencent.mm.plugin.game.model.GameTabData.TabItem) parcel.readParcelable(com.tencent.mm.plugin.game.model.GameTabData.TabItem.class.getClassLoader());
            if (tabItem != null) {
                this.f140151d.put(tabItem.f140155d, tabItem);
            }
        }
        this.f140152e = (com.tencent.mm.plugin.game.model.GameTabData.StatusBar) parcel.readParcelable(com.tencent.mm.plugin.game.model.GameTabData.StatusBar.class.getClassLoader());
    }
}
