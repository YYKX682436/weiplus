package com.tencent.mm.plugin.msgquote.model;

/* loaded from: classes5.dex */
public class MsgQuoteItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.msgquote.model.MsgQuoteItem> CREATOR = new ti3.n();

    /* renamed from: d, reason: collision with root package name */
    public int f149482d;

    /* renamed from: e, reason: collision with root package name */
    public long f149483e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149484f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f149485g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f149486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f149487i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f149488m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f149489n;

    /* renamed from: o, reason: collision with root package name */
    public int f149490o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f149491p;

    /* renamed from: q, reason: collision with root package name */
    public long f149492q;

    /* renamed from: r, reason: collision with root package name */
    public r15.g f149493r;

    public MsgQuoteItem(android.os.Parcel parcel) {
        this.f149482d = parcel.readInt();
        this.f149483e = parcel.readLong();
        this.f149484f = parcel.readString();
        this.f149485g = parcel.readString();
        this.f149486h = parcel.readString();
        this.f149487i = parcel.readString();
        this.f149488m = parcel.readString();
        this.f149489n = parcel.readString();
        this.f149490o = parcel.readInt();
        this.f149491p = parcel.readString();
        this.f149492q = parcel.readLong();
        java.lang.String readString = parcel.readString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(readString)) {
            return;
        }
        r15.g gVar = new r15.g();
        this.f149493r = gVar;
        gVar.fromXml(readString);
    }

    public boolean a(com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        r15.g gVar;
        if (msgQuoteItem == null) {
            return false;
        }
        if (this == msgQuoteItem) {
            return true;
        }
        if (this.f149483e != msgQuoteItem.f149483e || this.f149482d != msgQuoteItem.f149482d || this.f149490o != msgQuoteItem.f149490o || this.f149492q != msgQuoteItem.f149492q || !android.text.TextUtils.equals(this.f149484f, msgQuoteItem.f149484f) || !android.text.TextUtils.equals(this.f149485g, msgQuoteItem.f149485g) || !android.text.TextUtils.equals(this.f149486h, msgQuoteItem.f149486h) || !android.text.TextUtils.equals(this.f149487i, msgQuoteItem.f149487i) || !android.text.TextUtils.equals(this.f149488m, msgQuoteItem.f149488m) || !android.text.TextUtils.equals(this.f149489n, msgQuoteItem.f149489n) || !android.text.TextUtils.equals(this.f149491p, msgQuoteItem.f149491p)) {
            return false;
        }
        r15.g gVar2 = this.f149493r;
        return ((gVar2 != null || msgQuoteItem.f149493r != null) ? (gVar2 == null || (gVar = msgQuoteItem.f149493r) == null) ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(gVar2.compareContent(gVar)) : java.lang.Boolean.TRUE).booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        if (this.f149493r == null) {
            return "MsgQuoteItem{type=" + this.f149482d + ", svrid=" + this.f149483e + ", fromusr='" + this.f149484f + "', chatuser='" + this.f149485g + "', displayname='" + this.f149486h + "', msgsource='" + this.f149487i + "', content='" + this.f149488m + "', msgSource='" + this.f149489n + "', referfromscene='" + this.f149490o + "', strid='" + this.f149491p + "', createTime=" + this.f149492q + '}';
        }
        return "MsgQuoteItem{type=" + this.f149482d + ", svrid=" + this.f149483e + ", fromusr='" + this.f149484f + "', chatuser='" + this.f149485g + "', displayname='" + this.f149486h + "', msgsource='" + this.f149487i + "', content='" + this.f149488m + "', msgSource='" + this.f149489n + "', referfromscene='" + this.f149490o + "', strid='" + this.f149491p + "', createTime=" + this.f149492q + ", partialQuoteText= " + this.f149493r.toString() + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f149482d);
        parcel.writeLong(this.f149483e);
        parcel.writeString(this.f149484f);
        parcel.writeString(this.f149485g);
        parcel.writeString(this.f149486h);
        parcel.writeString(this.f149487i);
        parcel.writeString(this.f149488m);
        parcel.writeString(this.f149489n);
        parcel.writeInt(this.f149490o);
        parcel.writeString(this.f149491p);
        parcel.writeLong(this.f149492q);
        r15.g gVar = this.f149493r;
        if (gVar != null) {
            parcel.writeString(gVar.toXml(false));
        } else {
            parcel.writeString(null);
        }
    }
}
