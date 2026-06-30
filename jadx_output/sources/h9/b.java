package h9;

/* loaded from: classes15.dex */
public final class b extends h9.e {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f279592c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f279593d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f279594e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.exoplayer2.Format f279595f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f279596g;

    public b(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, com.google.android.exoplayer2.Format format, java.util.List list5) {
        super(str, list);
        this.f279592c = java.util.Collections.unmodifiableList(list2);
        this.f279593d = java.util.Collections.unmodifiableList(list3);
        this.f279594e = java.util.Collections.unmodifiableList(list4);
        this.f279595f = format;
        this.f279596g = list5 != null ? java.util.Collections.unmodifiableList(list5) : null;
    }
}
