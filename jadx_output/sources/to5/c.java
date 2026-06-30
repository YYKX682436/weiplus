package to5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final cp5.b f421001a;

    /* renamed from: b, reason: collision with root package name */
    public final to5.b f421002b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.voipmp.platform.v0 f421003c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f421004d;

    public c(cp5.b bufferManager, to5.b bVar) {
        kotlin.jvm.internal.o.g(bufferManager, "bufferManager");
        this.f421001a = bufferManager;
        this.f421002b = bVar;
        this.f421003c = com.tencent.mm.plugin.voipmp.platform.v0.f177287b;
        this.f421004d = new android.util.SparseArray();
    }

    public final void a(java.nio.ByteBuffer data, int i17, int i18, int i19, yz5.l ret) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(ret, "ret");
        ret.invoke(java.lang.Integer.valueOf(this.f421003c.B(data, data.remaining(), i17, i18, i19)));
    }

    public final int b(int i17, java.nio.ByteBuffer parameter, int i18) {
        kotlin.jvm.internal.o.g(parameter, "parameter");
        return this.f421003c.D(i17, parameter, i18);
    }
}
