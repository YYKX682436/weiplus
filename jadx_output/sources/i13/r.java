package i13;

/* loaded from: classes5.dex */
public abstract class r extends i13.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f287319h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f287320i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String id6, java.lang.String title, java.lang.String msg, long j17) {
        super(id6, j17);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f287319h = title;
        this.f287320i = msg;
    }

    @Override // i13.c
    public java.lang.String c() {
        return this.f287319h;
    }

    @Override // in5.c
    public int h() {
        return 5;
    }
}
