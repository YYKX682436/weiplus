package gf4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271330a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271331b;

    /* renamed from: c, reason: collision with root package name */
    public final int f271332c;

    /* renamed from: d, reason: collision with root package name */
    public final long f271333d;

    /* renamed from: e, reason: collision with root package name */
    public int f271334e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271335f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f271336g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f271337h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f271338i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f271339j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f271340k;

    /* renamed from: l, reason: collision with root package name */
    public final int f271341l;

    public a() {
        this.f271330a = "";
        this.f271331b = "";
        this.f271339j = "";
        this.f271340k = "";
    }

    public java.lang.String toString() {
        return "StoryCommentItem(fromUser='" + this.f271330a + "', content='" + this.f271331b + "', createTime=" + this.f271332c + ", commentId=" + this.f271334e + ", isUnread=" + this.f271335f + " )";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r45.ke6 commentDetail) {
        this();
        kotlin.jvm.internal.o.g(commentDetail, "commentDetail");
        this.f271333d = commentDetail.f378629d;
        this.f271332c = commentDetail.f378634i;
        this.f271334e = commentDetail.f378639q;
        java.lang.String str = commentDetail.f378630e;
        this.f271330a = str == null ? "" : str;
        java.lang.String str2 = commentDetail.f378635m;
        this.f271331b = str2 == null ? "" : str2;
        this.f271336g = str2 == null || str2.length() == 0;
        this.f271338i = commentDetail.f378642t == 1;
        java.lang.String str3 = commentDetail.f378631f;
        this.f271339j = str3 != null ? str3 : "";
        this.f271341l = commentDetail.f378638p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r45.le6 commentOp) {
        this();
        kotlin.jvm.internal.o.g(commentOp, "commentOp");
        this.f271333d = commentOp.f379383d;
        java.lang.String str = commentOp.f379385f;
        this.f271330a = str == null ? "" : str;
        java.lang.String str2 = commentOp.f379387h;
        this.f271331b = str2 == null ? "" : str2;
        this.f271332c = commentOp.f379384e;
        this.f271336g = str2 == null || str2.length() == 0;
        java.lang.String str3 = commentOp.f379386g;
        this.f271339j = str3 == null ? "" : str3;
        java.lang.String str4 = commentOp.f379395s;
        this.f271340k = str4 != null ? str4 : "";
        this.f271341l = commentOp.f379396t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(gf4.a storyCommentItem) {
        this();
        kotlin.jvm.internal.o.g(storyCommentItem, "storyCommentItem");
        this.f271330a = storyCommentItem.f271330a;
        this.f271331b = storyCommentItem.f271331b;
        this.f271332c = storyCommentItem.f271332c;
        this.f271333d = storyCommentItem.f271333d;
        this.f271334e = storyCommentItem.f271334e;
        this.f271335f = storyCommentItem.f271335f;
        this.f271336g = storyCommentItem.f271336g;
        this.f271337h = storyCommentItem.f271337h;
        this.f271338i = storyCommentItem.f271338i;
        this.f271339j = storyCommentItem.f271339j;
        this.f271340k = storyCommentItem.f271340k;
        this.f271341l = storyCommentItem.f271341l;
    }
}
