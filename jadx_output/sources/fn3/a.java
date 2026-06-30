package fn3;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lfn3/a;", "Lcom/tencent/mm/protobuf/f;", "Request", "Response", "", "plugin-newlife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class a<Request extends com.tencent.mm.protobuf.f, Response extends com.tencent.mm.protobuf.f> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264457b;

    /* renamed from: c, reason: collision with root package name */
    public final long f264458c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Class f264459d;

    public a(java.lang.String cmdId, int i17) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        this.f264456a = cmdId;
        this.f264457b = i17;
        this.f264458c = c01.id.c();
    }

    public abstract void a(com.tencent.mm.protobuf.f fVar, fn3.d dVar);
}
