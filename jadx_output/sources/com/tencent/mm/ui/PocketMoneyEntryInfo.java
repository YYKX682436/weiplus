package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/PocketMoneyEntryInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/ui/sg", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class PocketMoneyEntryInfo implements android.os.Parcelable {
    public static final com.tencent.mm.ui.sg CREATOR = new com.tencent.mm.ui.sg(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f197037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f197038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f197039f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f197040g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197041h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f197042i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f197043m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f197044n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f197045o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f197046p;

    public PocketMoneyEntryInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        str2 = (i17 & 2) != 0 ? null : str2;
        str3 = (i17 & 4) != 0 ? null : str3;
        str4 = (i17 & 8) != 0 ? null : str4;
        str5 = (i17 & 16) != 0 ? null : str5;
        str6 = (i17 & 32) != 0 ? null : str6;
        str7 = (i17 & 64) != 0 ? null : str7;
        str8 = (i17 & 128) != 0 ? null : str8;
        str9 = (i17 & 256) != 0 ? null : str9;
        str10 = (i17 & 512) != 0 ? null : str10;
        this.f197037d = str;
        this.f197038e = str2;
        this.f197039f = str3;
        this.f197040g = str4;
        this.f197041h = str5;
        this.f197042i = str6;
        this.f197043m = str7;
        this.f197044n = str8;
        this.f197045o = str9;
        this.f197046p = str10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.PocketMoneyEntryInfo)) {
            return false;
        }
        com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo = (com.tencent.mm.ui.PocketMoneyEntryInfo) obj;
        return kotlin.jvm.internal.o.b(this.f197037d, pocketMoneyEntryInfo.f197037d) && kotlin.jvm.internal.o.b(this.f197038e, pocketMoneyEntryInfo.f197038e) && kotlin.jvm.internal.o.b(this.f197039f, pocketMoneyEntryInfo.f197039f) && kotlin.jvm.internal.o.b(this.f197040g, pocketMoneyEntryInfo.f197040g) && kotlin.jvm.internal.o.b(this.f197041h, pocketMoneyEntryInfo.f197041h) && kotlin.jvm.internal.o.b(this.f197042i, pocketMoneyEntryInfo.f197042i) && kotlin.jvm.internal.o.b(this.f197043m, pocketMoneyEntryInfo.f197043m) && kotlin.jvm.internal.o.b(this.f197044n, pocketMoneyEntryInfo.f197044n) && kotlin.jvm.internal.o.b(this.f197045o, pocketMoneyEntryInfo.f197045o) && kotlin.jvm.internal.o.b(this.f197046p, pocketMoneyEntryInfo.f197046p);
    }

    public int hashCode() {
        java.lang.String str = this.f197037d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f197038e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f197039f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f197040g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f197041h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f197042i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f197043m;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f197044n;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.f197045o;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.f197046p;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PocketMoneyInfo{pocketMoneyMsgTitle=" + this.f197037d + ",pocketMoneyMsgDesc=" + this.f197038e + ", pocketMoneyMsgThumbUrl=" + this.f197039f + ", pocketMoneyMsgSourceDisplayName=" + this.f197040g + ", pocketMoneyMsgSourceUserName=" + this.f197041h + ", pocketMoneyMsgItemPayMsgId=" + this.f197042i + ", pocketMoneyMsgItemSourceIcon=" + this.f197043m + ", pocketMoneyReqKidKey=" + this.f197044n + ", pocketMoneyReqContext=" + this.f197045o + ", pocketMoneyReqTokenSessionId=" + this.f197046p + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f197037d);
        dest.writeString(this.f197038e);
        dest.writeString(this.f197039f);
        dest.writeString(this.f197040g);
        dest.writeString(this.f197041h);
        dest.writeString(this.f197042i);
        dest.writeString(this.f197043m);
        dest.writeString(this.f197044n);
        dest.writeString(this.f197045o);
        dest.writeString(this.f197046p);
    }
}
