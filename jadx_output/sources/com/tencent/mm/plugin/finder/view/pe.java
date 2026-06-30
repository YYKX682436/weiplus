package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.SpannableString f132827a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f132828b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo f132829c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f132830d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f132831e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f132832f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f132833g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f132834h;

    /* renamed from: i, reason: collision with root package name */
    public final int f132835i;

    /* renamed from: j, reason: collision with root package name */
    public final int f132836j;

    public pe(android.text.SpannableString nickname, java.lang.String timeString, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, boolean z17, boolean z18, java.util.List list, boolean z19, java.util.List list2, int i17, int i18) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(timeString, "timeString");
        this.f132827a = nickname;
        this.f132828b = timeString;
        this.f132829c = finderAuthInfo;
        this.f132830d = z17;
        this.f132831e = z18;
        this.f132832f = list;
        this.f132833g = z19;
        this.f132834h = list2;
        this.f132835i = i17;
        this.f132836j = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.pe)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.pe peVar = (com.tencent.mm.plugin.finder.view.pe) obj;
        return kotlin.jvm.internal.o.b(this.f132827a, peVar.f132827a) && kotlin.jvm.internal.o.b(this.f132828b, peVar.f132828b) && kotlin.jvm.internal.o.b(this.f132829c, peVar.f132829c) && this.f132830d == peVar.f132830d && this.f132831e == peVar.f132831e && kotlin.jvm.internal.o.b(this.f132832f, peVar.f132832f) && this.f132833g == peVar.f132833g && kotlin.jvm.internal.o.b(this.f132834h, peVar.f132834h) && this.f132835i == peVar.f132835i && this.f132836j == peVar.f132836j;
    }

    public int hashCode() {
        int hashCode = ((this.f132827a.hashCode() * 31) + this.f132828b.hashCode()) * 31;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = this.f132829c;
        int hashCode2 = (((((hashCode + (finderAuthInfo == null ? 0 : finderAuthInfo.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f132830d)) * 31) + java.lang.Boolean.hashCode(this.f132831e)) * 31;
        java.util.List list = this.f132832f;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f132833g)) * 31;
        java.util.List list2 = this.f132834h;
        return ((((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f132835i)) * 31) + java.lang.Integer.hashCode(this.f132836j);
    }

    public java.lang.String toString() {
        return "FinderMentionTitleData(nickname=" + ((java.lang.Object) this.f132827a) + ", timeString=" + this.f132828b + ", authInfo=" + this.f132829c + ", showFinderLogo=" + this.f132830d + ", showFollowBtn=" + this.f132831e + ", interactionLabels=" + this.f132832f + ", isOverlap=" + this.f132833g + ", aggregatedContactList=" + this.f132834h + ", aggregatedCount=" + this.f132835i + ", mentionType=" + this.f132836j + ')';
    }
}
