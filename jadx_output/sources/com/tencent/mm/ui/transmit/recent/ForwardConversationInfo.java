package com.tencent.mm.ui.transmit.recent;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/transmit/recent/ForwardConversationInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/ui/transmit/recent/e", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class ForwardConversationInfo implements android.os.Parcelable {
    public static final com.tencent.mm.ui.transmit.recent.e CREATOR = new com.tencent.mm.ui.transmit.recent.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f211045d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f211046e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f211047f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f211048g;

    public ForwardConversationInfo(java.lang.String str, java.lang.String nickName, java.lang.String contactAlias, java.lang.String contactConRemark) {
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(contactAlias, "contactAlias");
        kotlin.jvm.internal.o.g(contactConRemark, "contactConRemark");
        this.f211045d = str;
        this.f211046e = nickName;
        this.f211047f = contactAlias;
        this.f211048g = contactConRemark;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.transmit.recent.ForwardConversationInfo)) {
            return false;
        }
        com.tencent.mm.ui.transmit.recent.ForwardConversationInfo forwardConversationInfo = (com.tencent.mm.ui.transmit.recent.ForwardConversationInfo) obj;
        return kotlin.jvm.internal.o.b(this.f211045d, forwardConversationInfo.f211045d) && kotlin.jvm.internal.o.b(this.f211046e, forwardConversationInfo.f211046e) && kotlin.jvm.internal.o.b(this.f211047f, forwardConversationInfo.f211047f) && kotlin.jvm.internal.o.b(this.f211048g, forwardConversationInfo.f211048g);
    }

    public int hashCode() {
        java.lang.String str = this.f211045d;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f211046e.hashCode()) * 31) + this.f211047f.hashCode()) * 31) + this.f211048g.hashCode();
    }

    public java.lang.String toString() {
        return "ForwardConversationInfo(userName=" + this.f211045d + ", nickName=" + this.f211046e + ", contactAlias=" + this.f211047f + ", contactConRemark=" + this.f211048g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f211045d);
        parcel.writeString(this.f211046e);
        parcel.writeString(this.f211047f);
        parcel.writeString(this.f211048g);
    }
}
