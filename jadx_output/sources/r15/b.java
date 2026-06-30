package r15;

/* loaded from: classes5.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368641d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "refermsg", r15.i.class), com.tencent.mm.protobuf.i.n(-1, "media_expire_at"), com.tencent.mm.protobuf.i.r(-1, "groupinfo", r15.d.class), com.tencent.mm.protobuf.i.t(-1, "interact_options", r15.e.class, "button")});
        this.f368641d = appendAttrs;
        super.set__serialName("extcommoninfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, 0L, null, new java.util.LinkedList()});
    }

    public r15.d j() {
        return (r15.d) super.getCustom(this.f368641d + 2);
    }

    public java.util.LinkedList k() {
        return super.getLinkedList(this.f368641d + 3);
    }

    public long l() {
        return super.getLong(this.f368641d + 1);
    }

    public r15.i n() {
        return (r15.i) super.getCustom(this.f368641d + 0);
    }

    public void o(r15.d dVar) {
        super.set(this.f368641d + 2, dVar);
    }

    public void p(long j17) {
        super.set(this.f368641d + 1, java.lang.Long.valueOf(j17));
    }

    public void q(r15.i iVar) {
        super.set(this.f368641d + 0, iVar);
    }
}
