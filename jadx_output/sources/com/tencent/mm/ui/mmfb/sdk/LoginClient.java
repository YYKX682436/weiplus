package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class LoginClient implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ui.mmfb.sdk.LoginClient> CREATOR = new com.tencent.mm.ui.mmfb.sdk.v();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler[] f209167d;

    /* renamed from: e, reason: collision with root package name */
    public final int f209168e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.mmfb.sdk.LoginClient.Request f209169f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f209170g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f209171h;

    /* loaded from: classes13.dex */
    public static class Result implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.mmfb.sdk.LoginClient.Result> CREATOR = new com.tencent.mm.ui.mmfb.sdk.x();

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.mmfb.sdk.y f209181d;

        /* renamed from: e, reason: collision with root package name */
        public final com.tencent.mm.ui.mmfb.sdk.AccessToken f209182e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f209183f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f209184g;

        /* renamed from: h, reason: collision with root package name */
        public final com.tencent.mm.ui.mmfb.sdk.LoginClient.Request f209185h;

        /* renamed from: i, reason: collision with root package name */
        public final java.util.Map f209186i;

        /* renamed from: m, reason: collision with root package name */
        public final java.util.Map f209187m;

        public Result(android.os.Parcel parcel, com.tencent.mm.ui.mmfb.sdk.v vVar) {
            this.f209181d = com.tencent.mm.ui.mmfb.sdk.y.valueOf(parcel.readString());
            this.f209182e = (com.tencent.mm.ui.mmfb.sdk.AccessToken) parcel.readParcelable(com.tencent.mm.ui.mmfb.sdk.AccessToken.class.getClassLoader());
            this.f209183f = parcel.readString();
            this.f209184g = parcel.readString();
            this.f209185h = (com.tencent.mm.ui.mmfb.sdk.LoginClient.Request) parcel.readParcelable(com.tencent.mm.ui.mmfb.sdk.LoginClient.Request.class.getClassLoader());
            this.f209186i = com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler.b(parcel);
            this.f209187m = com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler.b(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f209181d.name());
            parcel.writeParcelable(this.f209182e, i17);
            parcel.writeString(this.f209183f);
            parcel.writeString(this.f209184g);
            parcel.writeParcelable(this.f209185h, i17);
            com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler.a(parcel, this.f209186i);
            com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler.a(parcel, this.f209187m);
        }
    }

    public LoginClient(android.app.Activity activity) {
        this.f209168e = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelableArray(this.f209167d, i17);
        parcel.writeInt(this.f209168e);
        parcel.writeParcelable(this.f209169f, i17);
        com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler.a(parcel, this.f209170g);
        com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler.a(parcel, this.f209171h);
    }

    public LoginClient(android.os.Parcel parcel) {
        this.f209168e = -1;
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler.class.getClassLoader());
        this.f209167d = new com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler[readParcelableArray.length];
        for (int i17 = 0; i17 < readParcelableArray.length; i17++) {
            com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler[] loginMethodHandlerArr = this.f209167d;
            com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler loginMethodHandler = (com.tencent.mm.ui.mmfb.sdk.LoginMethodHandler) readParcelableArray[i17];
            loginMethodHandlerArr[i17] = loginMethodHandler;
            if (loginMethodHandler.f209189e == null) {
                loginMethodHandler.f209189e = this;
            } else {
                throw new java.lang.RuntimeException("Can't set LoginClient if it is already set.");
            }
        }
        this.f209168e = parcel.readInt();
        this.f209169f = (com.tencent.mm.ui.mmfb.sdk.LoginClient.Request) parcel.readParcelable(com.tencent.mm.ui.mmfb.sdk.LoginClient.Request.class.getClassLoader());
        this.f209170g = com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler.b(parcel);
        this.f209171h = com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler.b(parcel);
    }

    /* loaded from: classes13.dex */
    public static class Request implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.ui.mmfb.sdk.LoginClient.Request> CREATOR = new com.tencent.mm.ui.mmfb.sdk.w();

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.ui.mmfb.sdk.u f209172d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.Set f209173e;

        /* renamed from: f, reason: collision with root package name */
        public final com.tencent.mm.ui.mmfb.sdk.g f209174f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f209175g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.String f209176h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f209177i;

        /* renamed from: m, reason: collision with root package name */
        public final java.lang.String f209178m;

        /* renamed from: n, reason: collision with root package name */
        public final java.lang.String f209179n;

        /* renamed from: o, reason: collision with root package name */
        public final java.lang.String f209180o;

        public Request(com.tencent.mm.ui.mmfb.sdk.u uVar, java.util.Set set, com.tencent.mm.ui.mmfb.sdk.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f209177i = false;
            this.f209172d = uVar;
            this.f209173e = set == null ? new java.util.HashSet() : set;
            this.f209174f = gVar;
            this.f209179n = str;
            this.f209175g = str2;
            this.f209176h = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            com.tencent.mm.ui.mmfb.sdk.u uVar = this.f209172d;
            parcel.writeString(uVar != null ? uVar.name() : null);
            parcel.writeStringList(new java.util.ArrayList(this.f209173e));
            com.tencent.mm.ui.mmfb.sdk.g gVar = this.f209174f;
            parcel.writeString(gVar != null ? gVar.name() : null);
            parcel.writeString(this.f209175g);
            parcel.writeString(this.f209176h);
            parcel.writeByte(this.f209177i ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f209178m);
            parcel.writeString(this.f209179n);
            parcel.writeString(this.f209180o);
        }

        public Request(android.os.Parcel parcel, com.tencent.mm.ui.mmfb.sdk.v vVar) {
            this.f209177i = false;
            java.lang.String readString = parcel.readString();
            this.f209172d = readString != null ? com.tencent.mm.ui.mmfb.sdk.u.valueOf(readString) : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            parcel.readStringList(arrayList);
            this.f209173e = new java.util.HashSet(arrayList);
            java.lang.String readString2 = parcel.readString();
            this.f209174f = readString2 != null ? com.tencent.mm.ui.mmfb.sdk.g.valueOf(readString2) : null;
            this.f209175g = parcel.readString();
            this.f209176h = parcel.readString();
            this.f209177i = parcel.readByte() != 0;
            this.f209178m = parcel.readString();
            this.f209179n = parcel.readString();
            this.f209180o = parcel.readString();
        }
    }
}
