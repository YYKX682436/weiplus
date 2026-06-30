package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final r45.z94 f120824a;

    /* renamed from: b, reason: collision with root package name */
    public android.text.SpannableString f120825b;

    public z(r45.z94 giftWish, android.text.SpannableString spannableString) {
        kotlin.jvm.internal.o.g(giftWish, "giftWish");
        this.f120824a = giftWish;
        this.f120825b = spannableString;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.wish.widget.z)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.wish.widget.z zVar = (com.tencent.mm.plugin.finder.live.wish.widget.z) obj;
        return kotlin.jvm.internal.o.b(this.f120824a, zVar.f120824a) && kotlin.jvm.internal.o.b(this.f120825b, zVar.f120825b);
    }

    public int hashCode() {
        int hashCode = this.f120824a.hashCode() * 31;
        android.text.SpannableString spannableString = this.f120825b;
        return hashCode + (spannableString == null ? 0 : spannableString.hashCode());
    }

    public java.lang.String toString() {
        return "GiftWishRecommendData(giftWish=" + this.f120824a + ", spannableString=" + ((java.lang.Object) this.f120825b) + ')';
    }
}
