package if4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public long f291234b;

    /* renamed from: c, reason: collision with root package name */
    public int f291235c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291236d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f291237e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f291238f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f291233a = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f291239g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f291240h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f291241i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f291242j = new java.util.LinkedList();

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof if4.a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if4.a aVar = (if4.a) obj;
        return this.f291234b == aVar.f291234b && this.f291239g.size() == aVar.f291239g.size() && this.f291237e == aVar.f291237e && this.f291236d == aVar.f291236d;
    }

    public java.lang.String toString() {
        return "StoryGalleryComment(fromUser='" + this.f291233a + "', storyId=" + this.f291234b + ", commentType=" + this.f291235c + ", commentUser=null, isUnread=" + this.f291237e + ", commentList=" + this.f291239g + ')';
    }
}
