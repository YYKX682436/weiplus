package cw2;

/* loaded from: classes10.dex */
public class wa {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f224094a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f224095b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f224096c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.mb4 f224097d;

    /* renamed from: e, reason: collision with root package name */
    public final mn2.j4 f224098e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FeedData f224099f;

    public wa(java.lang.String str, java.lang.String path, java.lang.String mediaId, r45.mb4 mb4Var, mn2.j4 video, com.tencent.mm.plugin.finder.storage.FeedData feedData) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(video, "video");
        kotlin.jvm.internal.o.g(feedData, "feedData");
        this.f224094a = str;
        this.f224095b = path;
        this.f224096c = mediaId;
        this.f224097d = mb4Var;
        this.f224098e = video;
        this.f224099f = feedData;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" downloadUrl='");
        sb6.append(this.f224094a);
        sb6.append("', path='");
        sb6.append(this.f224095b);
        sb6.append("', mediaId='");
        sb6.append(this.f224096c);
        sb6.append("' localFinderMedia is null? ");
        sb6.append(this.f224097d == null);
        sb6.append(' ');
        return sb6.toString();
    }
}
