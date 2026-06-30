package qj4;

/* loaded from: classes11.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f363905d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "new_msg"), com.tencent.mm.protobuf.i.i(-1, "same_friend"), com.tencent.mm.protobuf.i.i(-1, "show_attractive_reddot"), com.tencent.mm.protobuf.i.u(-1, "self_status")});
        this.f363905d = appendAttrs;
        super.set__serialName("ActionResult");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, 0, ""});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public void j(int i17) {
        super.set(this.f363905d + 0, java.lang.Integer.valueOf(i17));
    }

    public void k(int i17) {
        super.set(this.f363905d + 1, java.lang.Integer.valueOf(i17));
    }

    public void l(java.lang.String str) {
        super.set(this.f363905d + 3, str);
    }

    public void n(int i17) {
        super.set(this.f363905d + 2, java.lang.Integer.valueOf(i17));
    }
}
